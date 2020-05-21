package com.vladtruta.restaurantserver.model.local

import com.vladtruta.restaurantserver.model.responses.MenuCourseResponse

data class MenuCourse(
    val category: Category,
    val name: String,
    val description: String,
    val photoUrl: String,
    val portionSize: String,
    val price: Int,
    val id: Int = 0
) {
    fun toMenuCourseResponse(): MenuCourseResponse {
        return MenuCourseResponse(category, name, description, photoUrl, portionSize, price, id)
    }
}