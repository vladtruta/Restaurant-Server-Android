package com.vladtruta.restaurantserver.model.local

data class CartItem(
    val menuCourse: MenuCourse,
    var quantity: Int,
    val id: Int = 0
)