package com.vladtruta.restaurantserver.persistence

import org.jetbrains.exposed.sql.Table

object KitchenOrderEntity : Table() {
    val cartItems = text("cartItems")
    val tblName = text("tableName")
    val id = integer("id").primaryKey().autoIncrement()
}