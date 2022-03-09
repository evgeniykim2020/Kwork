package com.evgeniykim.kwork.utils

import android.text.format.DateUtils

class CompareDays {

    fun isHours(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis)
    }

    fun isToday(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis  + Constants.FOUR_HOURS)
    }

    fun isYesterday(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis + Constants.YESTERDAY)
    }

    fun isTwoDaysBefore(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis + Constants.TWO_DAYS)
    }

    fun thisYear(whenInMillis: Long): Boolean {
        return DateUtils.isToday(whenInMillis + Constants.YEAR)
    }
}