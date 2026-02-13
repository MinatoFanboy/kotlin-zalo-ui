package com.example.kotlinapplication.model

import com.example.kotlinapplication.util.DateUtils

data class DateItem (
    val year: Int,
    val month: Int,
    val day: Int,
    val date: Long = DateUtils.getTimeMiles(year, month, day)
) {
    fun toDisplayString(): String {
        return "%02d/%02d/%04d".format(day, month + 1, year)
    }

    companion object {
        fun from(date: Long): DateItem =
            DateItem(
                year = DateUtils.getYear(date),
                month = DateUtils.getMonth(date),
                day = DateUtils.getDay(date)
            )
    }

    fun monthsOfDate(): List<Int> = (0..11).toList()

    fun daysOfDate(): List<Int> =
        (1..DateUtils.getMonthDayCount(date)).toList()

    fun withYear(year: Int) = copy(year = year)

    fun withMonth(month: Int) = copy(month = month)

    fun withDay(day: Int) = copy(day = day)
}