package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ZaBoxColor(
    modifier: Modifier = Modifier,
    name: String,
    color: Color,
    borderColor: Color = Color.Transparent,
    background: Color = Color.Transparent,
    gradient: Boolean = false,
    gradientModifier: Modifier = Modifier,
    box: Boolean = false,
    boxBackground: Color = Color.Transparent,
) {
    Row(
        modifier = modifier
            .height(48.dp)
            .fillMaxWidth()
            .border(1.dp, borderColor, RoundedCornerShape(4.dp))
            .then(
                if (box) Modifier
                else Modifier
                    .clip(RoundedCornerShape(4.dp))
            )
            .then(
                if (box) {
                    Modifier.background(boxBackground)
                } else {
                    if (gradient)
                        gradientModifier
                    else {
                        Modifier.background(background)
                    }
                }
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            if (box) Modifier
                .fillMaxSize()
                .padding(8.dp)
                .clip(RoundedCornerShape(4.dp))
                .then(
                    if (gradient)
                        gradientModifier
                    else
                        Modifier.background(background)
                )
            else Modifier,
            contentAlignment = if (box) Alignment.Center else Alignment.TopStart
        ) {
            Text(name, color = color, style = LocalZaTypography.current.textXXSmall)
        }
    }
}
