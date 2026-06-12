package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ZaCalendarWeekHeader() {
    val days = listOf("CN", "Th 2", "Th 3", "Th 4", "Th 5", "Th 6", "Th 7")

    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        days.forEach {
            Box(
                modifier = Modifier.weight(1f).padding(vertical = 2.dp, horizontal = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = it,
                    color = LocalZaColors.current.text1,
                    style = LocalZaTypography.current.textNormalM,
                    modifier = Modifier.widthIn(max = 40.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}