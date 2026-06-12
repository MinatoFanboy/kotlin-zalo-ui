package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaCalendar
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun CalendarScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            ZaCard(
                modifierPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 32.dp),
                trailing = {
                    ZaCalendar()
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalendarScreenPreview() {
    CalendarScreen()
}