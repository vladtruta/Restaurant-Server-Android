package com.vladtruta.restaurantserver.model.local

import com.vladtruta.restaurantserver.model.responses.CategoryResponse

data class Category(
    val name: String,
    val id: Int = 0
) {
    companion object {
        val STARTERS = Category("Starters")
        val MAIN_COURSES = Category("Main Courses")
        val BEVERAGES = Category("Beverages")
        val DESSERTS = Category("Desserts")
    }

    fun toCategoryResponse(): CategoryResponse {
        return CategoryResponse(name, id)
    }
}
