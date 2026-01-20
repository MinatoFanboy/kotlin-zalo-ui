package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.neutralGray10

@Composable
fun ZaIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: String,
    size: Int = 24
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Box(
        modifier =
            modifier
                .height(size.dp + 6.dp)
                .width(size.dp + 6.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(
                    if (isPressed) neutralGray10 else Color.Transparent
                )
                .clickable(
                    onClick = onClick,
                    enabled = enabled,
                    role = Role.Button,
                    interactionSource = interactionSource,
                    indication = null,
                ),
        contentAlignment = Alignment.Center
    ) {
        ZaIcon(
            icon,
            size = size.sp,
            color = LocalZaColors.current.text1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ZaIconButton() {
    val interactionSource = remember { MutableInteractionSource() }

    KotlinApplicationTheme {
        Box(
            modifier =
                Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .clip(RoundedCornerShape(100.dp))
                    .background(Color.Transparent)
                    .clickable(
                        onClick = {},
                        enabled = true,
                        role = Role.Button,
                        interactionSource = interactionSource,
                        indication = null,
                    ),
            contentAlignment = Alignment.Center
        ) {
            ZaIcon(
                "\uEA52",
                size = 24.sp,
                color = LocalZaColors.current.text1
            )
        }
    }
}