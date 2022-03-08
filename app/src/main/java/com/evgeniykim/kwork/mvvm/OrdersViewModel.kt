package com.evgeniykim.kwork.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.evgeniykim.kwork.models.OrdersModels

class OrdersViewModel(private val repository: OrdersRepository): ViewModel() {

    var orders: LiveData<ArrayList<OrdersModels>> = liveData {
        emit(repository.fetchOrders())
    }

}