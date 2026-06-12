package com.example.kotlinapplication.model

import java.time.LocalDate

data class CalendarItem(
    val date: LocalDate,
    val isCurrentMonth: Boolean,
    val isSelectedStart: Boolean = false,
    val isSelectedEnd: Boolean = false,
    val isInRange: Boolean = false
)