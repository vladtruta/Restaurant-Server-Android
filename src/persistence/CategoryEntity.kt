package com.vladtruta.restaurantserver.persistence

import org.jetbrains.exposed.sql.Table

object CategoryEntity: Table() {
    val id = integer("id").primaryKey()
    val name = text("name")
}