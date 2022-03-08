package com.evgeniykim.kwork.utils

import android.text.format.DateUtils

class CompareDays {

    fun isHours(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis - Constants.FOUR_HOURS)
    }

    fun isToday(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis)
    }

    fun isYesterday(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis + DateUtils.DAY_IN_MILLIS)
    }

    fun isTwoDaysBefore(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis + DateUtils.DAY_IN_MILLIS)
    }

    fun thisYear(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis + DateUtils.DAY_IN_MILLIS)
    }
}