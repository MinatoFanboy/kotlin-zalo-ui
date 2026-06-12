package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.model.CalendarItem
import java.time.LocalDate

@Composable
fun ZaCalendarGrid(days: List<CalendarItem>, onDayClick: (LocalDate) -> Unit) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(7),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        userScrollEnabled = false,
        modifier = Modifier.height(192.dp)
    ) {
        items(days) { day ->
            ZaDayCell(
                day = day,
                onClick = {
                    onDayClick(day.date)
                }
            )
        }
    }
}