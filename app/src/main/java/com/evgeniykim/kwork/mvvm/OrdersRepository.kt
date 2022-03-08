package com.evgeniykim.kwork.mvvm

import com.evgeniykim.kwork.models.OrdersModels
import com.evgeniykim.kwork.utils.innerorders.ComingOrders
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class OrdersRepository(private val source: ComingOrders, private val myDispatcher: CoroutineDispatcher) {

    suspend fun fetchOrders(): ArrayList<OrdersModels> {
        return withContext(myDispatcher) {
            source.setupOrders()
        }
    }
}