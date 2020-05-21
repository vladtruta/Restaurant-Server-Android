package com.vladtruta.restaurantserver.persistence

import org.jetbrains.exposed.sql.Table

object MenuCourseEntity : Table() {
    val id = integer("id").primaryKey().autoIncrement()
    val categoryId = integer("categoryId")
    val name = text("name")
    val description = text("description")
    val photoUrl = text("photoUrl")
    val portionSize = text("portionSize")
    val price = integer("price")
}