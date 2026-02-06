package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.red60

@Composable
fun ZaDropdown(
    modifier: Modifier = Modifier,
    label: String? = null,
    value: String? = null,
    placeholder: String = "Placeholder",
    onValueChange: (TextFieldValue) -> Unit,
    helper: String? = null,
    error: String? = null,
    enabled: Boolean? = true,
) {
    val hasError = !error.isNullOrBlank()
    val footerText = error ?: helper

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        if (!label.isNullOrBlank()) {
            Text(
                label,
                color = if (enabled == true) LocalZaColors.current.text1 else LocalZaColors.current.text3,
                style = LocalZaTypography.current.textSmall
            )
        }

        Row(
            modifier = Modifier
                .height(48.dp)
                .border(
                    width = 1.dp,
                    color = LocalZaColors.current.border2,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(
                    if (enabled == true) Color.Transparent else LocalZaColors.current.inputDisabled,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(start = 12.dp, top = 0.dp, end = 12.dp, bottom = 0.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                Modifier
                    .weight(1f),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    if (value.isNullOrBlank()) placeholder else value,
                    color = if (value.isNullOrBlank()) LocalZaColors.current.text3 else LocalZaColors.current.text1,
                    style = LocalZaTypography.current.textLarge
                )
            }

            Box(contentAlignment = Alignment.Center) {
                ZaIcon(
                    "\uE945",
                    size = 24.sp,
                    color = LocalZaColors.current.text1,
                )
            }
        }

        if (!footerText.isNullOrBlank()) {
            if (enabled == true) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ZaIcon(
                        if (hasError) "\uEA7E" else "\uE9AC",
                        color = if (hasError) red60 else LocalZaColors.current.text2,
                        size = 16.sp
                    )

                    Text(
                        footerText,
                        color = if (hasError) red60 else LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXSmall
                    )
                }
            }
        }
    }
}