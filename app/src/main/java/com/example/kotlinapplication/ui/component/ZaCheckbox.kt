package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.neutralGray10

@Composable
fun ZaCheckbox(
    modifier: Modifier = Modifier,
    value: Boolean = false,
    label: String = "Label",
    onValueChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    small: Boolean = false,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Box(
        modifier =
            modifier
                .height(if (small) 16.dp else 24.dp)
                .minimumInteractiveComponentSize()
                .background(
                    if (isPressed) neutralGray10 else Color.Transparent
                )
                .clickable(
                    onClick = {
                        onValueChange(!value)
                    },
                    enabled = enabled,
                    role = Role.Button,
                    interactionSource = interactionSource,
                    indication = null,
                ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(if (small) 4.dp else 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (value) {
                ZaIcon(
                    "\uE942",
                    color = if (enabled) LocalZaColors.current.primary else LocalZaColors.current.selectedDisable,
                    size = if (small) 16.sp else 24.sp
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(if (small) 16.dp else 24.dp)
                        .clip(RoundedCornerShape(if (small) 4.dp else 8.dp))
                        .border(
                            if (small) 1.5.dp else 2.dp,
                            LocalZaColors.current.border2,
                            RoundedCornerShape(if (small) 4.dp else 8.dp)
                        )
                        .background(if (enabled) LocalZaColors.current.pageBackground2 else LocalZaColors.current.unSelectedDisable)
                )
            }

            Text(
                label,
                color = if (enabled) LocalZaColors.current.text1 else LocalZaColors.current.text3,
                style = if(small) LocalZaTypography.current.textXSmall else LocalZaTypography.current.textSmall
            )
        }
    }
}