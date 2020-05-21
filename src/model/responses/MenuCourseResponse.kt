package com.vladtruta.restaurantserver.model.responses

import com.google.gson.annotations.SerializedName
import com.vladtruta.restaurantserver.model.local.Category

data class MenuCourseResponse(
    @SerializedName("category")
    val category: Category,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("photoUrl")
    val photoUrl: String,
    @SerializedName("portionSize")
    val portionSize: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("id")
    val id: Int
)