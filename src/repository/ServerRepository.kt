package com.vladtruta.restaurantserver.repository

import com.vladtruta.restaurantserver.model.requests.KitchenRequest
import com.vladtruta.restaurantserver.model.responses.CategoryResponse
import com.vladtruta.restaurantserver.model.responses.KitchenResponse
import com.vladtruta.restaurantserver.model.responses.MenuCourseResponse
import com.vladtruta.restaurantserver.persistence.ServerDaoImpl

object ServerRepository {

    private val dao = ServerDaoImpl()

    fun init() {
        dao.reset()

        MockData.categories.forEach { dao.insertCategory(it) }
        MockData.menuCourses.forEach { dao.insertMenuCourse(it) }
    }

    fun getAllCategories(): List<CategoryResponse> {
        return dao.getAllCategories().map { it.toCategoryResponse() }
    }

    fun getAllMenuCourses(): List<MenuCourseResponse> {
        return dao.getAllMenuCourses().map { it.toMenuCourseResponse() }
    }

    fun getAllKitchenOrders(): List<KitchenResponse> {
        return dao.getAllKitchenOrders().map { it.toKitchenResponse() }
    }

    fun insertKitchenOrder(kitchenRequest: KitchenRequest) {
        val kitchenOrder = kitchenRequest.toKitchenOrder() ?: throw Exception("Invalid kitchen order")
        dao.insertKitchenOrder(kitchenOrder)
    }

    fun deleteOrder(id: Int) {
        dao.deleteKitchenOrder(id)
    }
}