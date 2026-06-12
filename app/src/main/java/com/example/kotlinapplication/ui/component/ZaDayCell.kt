package com.example.kotlinapplication.ui.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.model.CalendarItem
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import java.time.LocalDate

@Composable
fun ZaDayCell(day: CalendarItem, onClick: (LocalDate) -> Unit) {
    val bgColor by animateColorAsState(
        targetValue = when {
            day.isSelectedEnd -> Color(0xFF1565FF)
            day.isInRange -> Color(0x221565FF)
            else -> Color.Transparent
        },
        label = ""
    )

    val borderColor by animateColorAsState(
        targetValue = when {
            day.isSelectedStart -> Color(0xFF1565FF)
            else -> Color.Transparent
        },
        label = ""
    )

    val textColor by animateColorAsState(
        targetValue = when {
            day.isSelectedEnd -> Color.White
            !day.isCurrentMonth -> Color.LightGray
            else -> LocalZaColors.current.text1
        },
        label = ""
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .border(width = 1.dp, color = borderColor, shape = RoundedCornerShape(4.dp))
            .background(bgColor)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(
                    bounded = true,
                    radius = 24.dp
                )
            ) {
                onClick(day.date)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = day.date.dayOfMonth.toString(),
            color = textColor,
            style = LocalZaTypography.current.textNormal,
            modifier = Modifier.padding(vertical = 2.dp)
        )
    }
}