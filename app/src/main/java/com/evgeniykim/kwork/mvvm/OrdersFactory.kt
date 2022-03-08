package com.evgeniykim.kwork.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.evgeniykim.kwork.utils.innerorders.ComingOrders
import kotlinx.coroutines.Dispatchers

class OrdersFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(OrdersViewModel::class.java)) {
            val source = ComingOrders()
            OrdersViewModel(OrdersRepository(source, Dispatchers.IO)) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}