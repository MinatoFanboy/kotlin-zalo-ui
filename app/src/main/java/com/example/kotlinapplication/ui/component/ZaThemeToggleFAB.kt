package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun ThemeToggleFAB(
    isDarkTheme: Boolean,
    onToggle: () -> Unit
) {
    FloatingActionButton(
        onClick = onToggle,
        modifier = Modifier
            .size(44.dp)
            .border(2.dp, LocalZaColors.current.fabBorder, RoundedCornerShape(44.dp)),
        shape = RoundedCornerShape(44.dp),
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp
        ),
        containerColor = LocalZaColors.current.fabBackground
    ) {
        ZaIcon(if (isDarkTheme) "\uEA45" else "\uE9CC", size = 20.sp, color = LocalZaColors.current.fabIcon)
    }
}