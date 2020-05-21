package com.vladtruta.restaurantserver.model.local

import com.vladtruta.restaurantserver.model.responses.CategoryResponse

data class Category(
    val name: String,
    val id: Int = 0
) {
    companion object {
        val STARTERS = Category("Starters", 1)
        val MAIN_COURSES = Category("Main Courses", 2)
        val DESSERTS = Category("Desserts", 3)
        val BEVERAGES = Category("Beverages", 4)
    }

    fun toCategoryResponse(): CategoryResponse {
        return CategoryResponse(name, id)
    }
}
