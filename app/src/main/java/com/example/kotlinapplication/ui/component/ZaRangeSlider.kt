package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import java.text.NumberFormat
import java.util.Locale

fun Int.formatNumber(): String {
    return NumberFormat
        .getNumberInstance(Locale("vi", "VN"))
        .format(this)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaRangeSlider(
    modifier: Modifier = Modifier,
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    type: String = ""
) {
    val valueRange = 0f..100f

    val inactiveColor = LocalZaColors.current.sliderInactive
    val activeColor = LocalZaColors.current.primary

    Column(modifier = modifier) {
        if (type == "price") {
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "Khoảng giá",
                    color = LocalZaColors.current.text2,
                    style = LocalZaTypography.current.textSmall
                )

                Text(
                    "${(value.start.toInt() * 12000).formatNumber()}đ - ${(value.endInclusive.toInt() * 12000).formatNumber()}đ",
                    color = LocalZaColors.current.text1,
                    style = LocalZaTypography.current.textSmallM
                )
            }
        }

        RangeSlider(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            valueRange = valueRange,
            startThumb = {
                Box(
                    modifier = Modifier
                        .size(16.dp)
                        .background(LocalZaColors.current.primary, shape = CircleShape)
                )
            },
            endThumb = {
                Box(
                    modifier = Modifier
                        .size(16.dp)
                        .background(LocalZaColors.current.primary, shape = CircleShape)
                )
            },
            track = { state ->
                val totalRange =
                    state.valueRange.endInclusive - state.valueRange.start

                val startFraction =
                    (state.activeRangeStart - state.valueRange.start) / totalRange

                val endFraction =
                    (state.activeRangeEnd - state.valueRange.start) / totalRange
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .drawBehind {
                            val trackWidth = size.width
                            val trackHeight = size.height

                            val startX = trackWidth * startFraction
                            val endX = trackWidth * endFraction

                            drawRoundRect(
                                color = inactiveColor,
                                size = size,
                                cornerRadius = CornerRadius(trackHeight / 2)
                            )

                            drawRoundRect(
                                color = activeColor,
                                topLeft = Offset(startX, 0f),
                                size = Size(endX - startX, trackHeight),
                                cornerRadius = CornerRadius(trackHeight / 2)
                            )
                        }
                )
            }
        )
    }
}