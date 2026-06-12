package com.example.kotlinapplication.util

import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Locale

object ZaDateFormatters {
    val CalendarHeaderFormatter: DateTimeFormatter =
        DateTimeFormatter.ofPattern(
            "MMMM yyyy",
            Locale.getDefault()
        )
}

object DateUtils {
    fun getTimeMiles(year: Int, month: Int, day: Int): Long {
        val calendar = Calendar.getInstance()
        calendar[Calendar.YEAR] = year
        calendar[Calendar.MONTH] = month
        val maxDayCount = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        calendar[Calendar.DAY_OF_MONTH] = day.coerceAtMost(maxDayCount)
        return calendar.timeInMillis
    }

    fun getCurrentTime(): Long {
        val calendar = Calendar.getInstance()
        calendar[Calendar.HOUR_OF_DAY] = 0
        calendar[Calendar.MINUTE] = 0
        calendar[Calendar.SECOND] = 0
        calendar[Calendar.MILLISECOND] = 0
        return calendar.timeInMillis
    }

    fun getMonthDayCount(timeStamp: Long): Int {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeStamp
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
    }

    fun getDay(timeStamp: Long): Int {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeStamp
        return calendar[Calendar.DAY_OF_MONTH]
    }

    fun getMonth(timeStamp: Long): Int {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeStamp
        return calendar[Calendar.MONTH]
    }

    fun getYear(timeStamp: Long): Int {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeStamp
        return calendar[Calendar.YEAR]
    }

    fun getCurrentHour(): Int {
        val calendar = Calendar.getInstance()
        return calendar[Calendar.HOUR_OF_DAY]
    }

    fun getCurrentMinute(): Int {
        val calendar = Calendar.getInstance()
        return calendar[Calendar.MINUTE]
    }
}