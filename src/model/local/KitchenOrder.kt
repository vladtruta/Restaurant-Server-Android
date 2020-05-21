package com.vladtruta.restaurantserver.model.local

import com.vladtruta.restaurantserver.model.responses.KitchenResponse

data class KitchenOrder(
    val cartItems: List<CartItem>,
    val tableName: String,
    val id: Int = 0
) {
    fun toKitchenResponse(): KitchenResponse {
        return KitchenResponse(cartItems, tableName, id)
    }
}