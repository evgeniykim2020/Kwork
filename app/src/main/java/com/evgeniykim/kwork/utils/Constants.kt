package com.evgeniykim.kwork.utils

import android.text.format.DateUtils

class Constants {

    companion object {
        const val HOURS_MINS = "HH:mm"
        const val DAY_MONTH = "dd.MM"
        const val DAY_MONTH_YEAR = "dd.MM.yyyy"
        const val YESTERDAY = DateUtils.DAY_IN_MILLIS
        const val FOUR_HOURS = DateUtils.HOUR_IN_MILLIS * 4
        const val TWO_DAYS = DateUtils.DAY_IN_MILLIS * 2
        const val YEAR = DateUtils.DAY_IN_MILLIS * 12
    }
}