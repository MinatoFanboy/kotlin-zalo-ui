package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.kotlinapplication.model.CalendarItem
import java.time.LocalDate
import java.time.YearMonth

@Composable
fun ZaCalendar() {
    var currentMonth by remember { mutableStateOf(YearMonth.now()) }

    var startDate by remember { mutableStateOf<LocalDate?>(null) }

    var endDate by remember { mutableStateOf<LocalDate?>(null) }

    val days = remember(currentMonth, startDate, endDate) {
        generateCalendarDays(currentMonth, startDate, endDate)
    }

    Column(modifier = Modifier) {
        ZaCalendarHeader(
            month = currentMonth,
            onPrev = {
                currentMonth = currentMonth.minusMonths(1)
            },
            onNext = {
                currentMonth = currentMonth.plusMonths(1)
            }
        )

        ZaCalendarWeekHeader()

        ZaCalendarGrid(
            days = days,
            onDayClick = { clicked ->
                when {
                    startDate == null -> {
                        startDate = clicked
                    }

                    endDate == null && clicked >= startDate -> {
                        endDate = clicked
                    }

                    else -> {
                        startDate = clicked
                        endDate = null
                    }
                }
            }
        )
    }
}

fun generateCalendarDays(
    month: YearMonth,
    start: LocalDate?,
    end: LocalDate?
): List<CalendarItem> {
    val firstDay = month.atDay(1)
    val startOffset = firstDay.dayOfWeek.value % 7

    val totalDays = month.lengthOfMonth()

    val result = mutableListOf<CalendarItem>()

    repeat(startOffset) {
        val date = firstDay.minusDays(
            (startOffset - it).toLong()
        )

        result.add(
            CalendarItem(
                date = date,
                isCurrentMonth = false
            )
        )
    }

    repeat(totalDays) {
        val date = month.atDay(it + 1)
        result.add(
            CalendarItem(
                date = date,
                isCurrentMonth = true,
                isSelectedStart = date == start,
                isSelectedEnd = date == end,
                isInRange = start != null &&
                        end != null &&
                        date > start &&
                        date < end
            )
        )
    }

    return result
}