package com.example.kotlinapplication.ui.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.R

val FontIcon = FontFamily(
    Font(R.font.icomoon, FontWeight.Normal)
)

@Composable
fun ZaIcon(
    name: String,
    color: Color = Color.Unspecified,
    size: TextUnit = 24.sp
) {
    Text(
        text = name,
        fontFamily = FontIcon,
        fontWeight = FontWeight.Normal,
        fontSize = size,
        lineHeight = size,
        color = color
    )
}