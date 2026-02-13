package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaSlider(
    modifier: Modifier = Modifier,
    value: Float = 0f,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    onValueChange: (Float) -> Unit,
    steps: Int = 0,
) {
    Slider(
        modifier = modifier,
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        valueRange = valueRange,
        steps = steps,
        thumb = {
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .background(LocalZaColors.current.primary, shape = CircleShape)
            )
        },
        track = { state ->
            val fraction =
                (state.value - state.valueRange.start) /
                        (state.valueRange.endInclusive - state.valueRange.start)

            val stepCount = state.steps + 2

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .offset(y = if (steps > 0) 2.dp else 0.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(LocalZaColors.current.sliderInactive)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth(fraction)
                    .height(4.dp)
                    .offset(y = if (steps > 0) 2.dp else 0.dp)
                    .background(LocalZaColors.current.primary, RoundedCornerShape(50))
            )

            if (steps > 0) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    repeat(stepCount) { index ->
                        val stepFraction = index / (stepCount - 1f)
                        val isActive = stepFraction <= fraction

                        Box(
                            modifier = Modifier
                                .width(4.dp)
                                .height(8.dp)
                                .background(
                                    if (isActive) LocalZaColors.current.primary
                                    else LocalZaColors.current.sliderInactive,
                                    RoundedCornerShape(4.dp)
                                )
                        )
                    }
                }
            }
        },
    )
}