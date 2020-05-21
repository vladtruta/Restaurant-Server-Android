package com.vladtruta.restaurantserver.model.requests

import com.google.gson.annotations.SerializedName
import com.vladtruta.restaurantserver.model.local.CartItem
import com.vladtruta.restaurantserver.model.local.KitchenOrder

data class KitchenRequest(
    @SerializedName("cartItems")
    val cartItems: List<CartItem>? = null,
    @SerializedName("tableName")
    val tableName: String? = null
) {
    fun toKitchenOrder(): KitchenOrder? {
        cartItems ?: return null
        tableName ?: return null

        return KitchenOrder(cartItems, tableName)
    }
}