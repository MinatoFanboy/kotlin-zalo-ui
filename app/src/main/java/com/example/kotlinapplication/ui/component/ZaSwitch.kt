package com.example.kotlinapplication.ui.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import kotlinx.coroutines.launch

@Composable
fun ZaSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean = false,
    label: String = "Label",
    onCheckedChanged: (Boolean) -> Unit,
    enabled: Boolean = true,
    small: Boolean = false,
) {
    val switchWidth = if (small) 28.dp else 40.dp
    val switchHeight = if (small) 16.dp else 24.dp
    val handleSize = if (small) 12.dp else 20.dp
    val handlePadding = 2.dp

    val valueToOffset = if (checked) 1f else 0f
    val offset = remember { Animatable(valueToOffset) }
    val scope = rememberCoroutineScope()

    DisposableEffect(checked) {
        if (offset.targetValue != valueToOffset) {
            scope.launch {
                offset.animateTo(valueToOffset, animationSpec = tween(300))
            }
        }
        onDispose { }
    }

    Box(
        modifier =
            modifier
                .height(if (small) 16.dp else 24.dp)
                .minimumInteractiveComponentSize()
                .background(Color.Transparent)
                .toggleable(
                    value = checked,
                    onValueChange = onCheckedChanged,
                    role = Role.Switch,
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null
                ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(if (small) 4.dp else 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier
                    .width(switchWidth)
                    .height(switchHeight)
                    .clip(RoundedCornerShape(switchHeight))
                    .background(
                        lerp(
                            if (enabled) LocalZaColors.current.text3 else LocalZaColors.current.unSelectedDisable,
                            if (enabled) LocalZaColors.current.primary else LocalZaColors.current.selectedDisable,
                            offset.value
                        )
                    )
                    .border(0.dp, Color.Transparent, RoundedCornerShape(switchHeight))
            ) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = handlePadding)
                        .size(handleSize)
                        .offset(x = (switchWidth - handleSize - handlePadding * 2f) * offset.value)
                        .clip(CircleShape)
                        .background(Color.White)
                )
            }

            Text(
                label,
                color = if (enabled) LocalZaColors.current.text1 else LocalZaColors.current.text3,
                style = if (small) LocalZaTypography.current.textXSmall else LocalZaTypography.current.textSmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ZaSwitchPreview() {
    ZaSwitch(onCheckedChanged = {}, checked = true, enabled = false)
}