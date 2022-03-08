package com.evgeniykim.kwork.models

import android.widget.Button
import com.google.android.material.button.MaterialButton
import java.text.SimpleDateFormat

data class OrdersModels(
    val imageUri: String,
    val name: String,
    val date: String,
    val desc: String,
    val price: String
)
