package com.evgeniykim.kwork.utils.innerorders

import android.util.Log
import com.evgeniykim.kwork.R
import com.evgeniykim.kwork.models.OrdersModels
import com.evgeniykim.kwork.utils.CompareDays
import com.evgeniykim.kwork.utils.Constants
import com.google.android.material.button.MaterialButton
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

class ComingOrders {

    private val TAG = "ComingOrders"

    private val RUB = "₽"
    private val fewHours = SimpleDateFormat(Constants.HOURS_MINS).format(Date())
    private val today = "Сегодня"
    private val yesterday = "Вчера"
    private val twoDaysBefore = SimpleDateFormat(Constants.DAY_MONTH).format(Date())
    private val over2daysBefore = SimpleDateFormat(Constants.DAY_MONTH_YEAR).format(Date())

    fun setupOrders(): ArrayList<OrdersModels> {
        val currentList = arrayListOf<OrdersModels>()

        val imageUri = R.drawable.avatar_image.toString()
        val name = "Tom"
//        val currentTime = Calendar.getInstance().time
//        val date = currentTime.time
        val date = System.currentTimeMillis()
        val desc = "Съемка с квадрокоптера всего процесса обучения"
        val price = "100 000 $RUB"

        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))
        currentList.add(OrdersModels(imageUri, name, setTimeDate(date), desc, price))

        return currentList
    }

    private fun setTimeDate(date: Long): String {
        var time = ""
        val showTime = CompareDays()
        if (showTime.isHours(date)) {
            time = fewHours
            Log.e(TAG, "Few hours date is $date")
        }
        else if (showTime.isToday(date)) {
            time = today
            Log.e(TAG, "Today date is $date")
        }
        else if (showTime.isYesterday(date)) time = yesterday
        else if (showTime.isTwoDaysBefore(date)) time = twoDaysBefore
        else if (showTime.thisYear(date)) time = over2daysBefore

        return time
    }

}