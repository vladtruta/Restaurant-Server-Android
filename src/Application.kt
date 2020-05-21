package com.vladtruta.restaurantserver

import com.vladtruta.restaurantserver.model.requests.KitchenRequest
import com.vladtruta.restaurantserver.repository.ServerRepository
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    ServerRepository.init()

    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
        }
    }

    routing {
        get("/categories") {
            call.respond(mapOf("success" to true, "data" to ServerRepository.getAllCategories()))
        }

        get("/courses") {
            call.respond(mapOf("success" to true, "data" to ServerRepository.getAllMenuCourses()))
        }

        get("/kitchen") {
            call.respond(mapOf("success" to true, "data" to ServerRepository.getAllKitchenOrders()))
        }

        post("/kitchen") {
            val kitchenRequest = call.receive<KitchenRequest>()

            try {
                ServerRepository.insertKitchenOrder(kitchenRequest)
                call.respond(mapOf("success" to true))
            } catch (error: Exception) {
                call.respond(mapOf("success" to false))
            }
        }
    }
}

