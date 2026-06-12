package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.util.ZaDateFormatters
import java.time.YearMonth

@Composable
fun ZaCalendarHeader(month: YearMonth, onPrev: () -> Unit, onNext: () -> Unit) {
    val title = remember(month) {
        month.format(
            ZaDateFormatters.CalendarHeaderFormatter
        )
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        ZaIconButton(onClick = onPrev, icon = "\uE912", color = LocalZaColors.current.primary)

        Box(modifier = Modifier.padding(vertical = 12.dp)) {
            Text(
                text = title,
                color = LocalZaColors.current.text1,
                style = LocalZaTypography.current.textNormal
            )
        }

        ZaIconButton(onClick = onNext, icon = "\uE913", color = LocalZaColors.current.primary)
    }
}