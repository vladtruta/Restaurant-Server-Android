package com.vladtruta.restaurantserver.persistence

import com.vladtruta.restaurantserver.model.local.CartItem
import com.vladtruta.restaurantserver.model.local.Category
import com.vladtruta.restaurantserver.model.local.KitchenOrder
import com.vladtruta.restaurantserver.model.local.MenuCourse
import com.vladtruta.restaurantserver.utils.GsonHelper
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

class ServerDaoImpl : ServerDao {
    private val db = Database.connect(
        "jdbc:mysql://localhost:3306/restaurant?serverTimezone=UTC",
        "com.mysql.cj.jdbc.Driver",
        "root",
        "12345678"
    )

    override fun reset() = transaction(db) {
        SchemaUtils.drop(CategoryEntity, MenuCourseEntity, KitchenOrderEntity)
        SchemaUtils.create(CategoryEntity, MenuCourseEntity, KitchenOrderEntity)
    }

    override fun getAllCategories(): List<Category> = transaction(db) {
        CategoryEntity.selectAll().map {
            Category(
                it[CategoryEntity.name],
                it[CategoryEntity.id]
            )
        }
    }

    override fun getAllMenuCourses(): List<MenuCourse> = transaction(db) {
        MenuCourseEntity.selectAll().map { resultRow ->
            val categoryId = resultRow[MenuCourseEntity.categoryId]

            val category = CategoryEntity.select { CategoryEntity.id eq categoryId }.map {
                Category(
                    it[CategoryEntity.name],
                    it[CategoryEntity.id]
                )
            }.first()

            MenuCourse(
                category,
                resultRow[MenuCourseEntity.name],
                resultRow[MenuCourseEntity.description],
                resultRow[MenuCourseEntity.photoUrl],
                resultRow[MenuCourseEntity.portionSize],
                resultRow[MenuCourseEntity.price],
                resultRow[MenuCourseEntity.id]
            )
        }
    }

    override fun getAllKitchenOrders(): List<KitchenOrder> = transaction(db) {
        KitchenOrderEntity.selectAll().map { resultRow ->
            val cartItemsDeserialized =
                GsonHelper.instance.fromJson(resultRow[KitchenOrderEntity.cartItems], Array<CartItem>::class.java)
                    .toList()

            KitchenOrder(
                cartItemsDeserialized,
                resultRow[KitchenOrderEntity.tblName],
                resultRow[KitchenOrderEntity.id]
            )
        }
    }

    override fun insertCategory(category: Category) = transaction(db) {
        CategoryEntity.insert { insertStatement ->
            insertStatement[name] = category.name
            insertStatement[id] = category.id
        }
        Unit
    }

    override fun insertMenuCourse(menuCourse: MenuCourse) = transaction(db) {
        MenuCourseEntity.insert { insertStatement ->
            insertStatement[categoryId] = menuCourse.category.id
            insertStatement[name] = menuCourse.name
            insertStatement[description] = menuCourse.description
            insertStatement[photoUrl] = menuCourse.photoUrl
            insertStatement[portionSize] = menuCourse.portionSize
            insertStatement[price] = menuCourse.price
        }
        Unit
    }

    override fun insertKitchenOrder(kitchenOrder: KitchenOrder) = transaction(db) {
        KitchenOrderEntity.insert { insertStatement ->
            val cartItemsSerialized = GsonHelper.instance.toJson(kitchenOrder.cartItems)
            insertStatement[cartItems] = cartItemsSerialized
            insertStatement[tblName] = kitchenOrder.tableName
        }
        Unit
    }

    override fun deleteKitchenOrder(id: Int) = transaction(db) {
        KitchenOrderEntity.deleteWhere { KitchenOrderEntity.id eq id }
        Unit
    }
}