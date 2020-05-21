package com.vladtruta.restaurantserver.persistence

import org.jetbrains.exposed.sql.Table

object KitchenOrderEntity : Table() {
    val id = integer("id").primaryKey().autoIncrement()
    val cartItems = text("cartItems")
    val tblName = text("tableName")
}