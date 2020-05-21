package com.vladtruta.restaurantserver.persistence

import com.vladtruta.restaurantserver.model.local.Category
import com.vladtruta.restaurantserver.model.local.KitchenOrder
import com.vladtruta.restaurantserver.model.local.MenuCourse

interface ServerDao {
    fun reset()

    fun getAllCategories(): List<Category>
    fun getAllMenuCourses(): List<MenuCourse>
    fun getAllKitchenOrders(): List<KitchenOrder>

    fun insertCategory(category: Category)
    fun insertMenuCourse(menuCourse: MenuCourse)
    fun insertKitchenOrder(kitchenOrder: KitchenOrder)

    fun deleteKitchenOrder(id: Int)
}