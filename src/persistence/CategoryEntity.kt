package com.vladtruta.restaurantserver.persistence

import org.jetbrains.exposed.sql.Table

object CategoryEntity: Table() {
    val name = text("name")
    val id = integer("id").primaryKey().autoIncrement()
}