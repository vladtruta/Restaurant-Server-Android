package com.vladtruta.restaurantserver.model.responses

import com.google.gson.annotations.SerializedName
import com.vladtruta.restaurantserver.model.local.CartItem

data class KitchenResponse(
    @SerializedName("cartItems")
    val cartItems: List<CartItem>,
    @SerializedName("tableName")
    val tableName: String,
    @SerializedName("id")
    val id: Int
)