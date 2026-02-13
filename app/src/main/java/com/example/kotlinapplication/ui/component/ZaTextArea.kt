package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.maxLength
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.red60

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ZaTextArea(
    modifier: Modifier = Modifier,
    label: String? = null,
    value: TextFieldValue,
    placeholder: String = "Hint text",
    onValueChange: (TextFieldValue) -> Unit,
    helper: String? = null,
    error: String? = null,
    enabled: Boolean? = true,
    focusedDefault: Boolean? = false,
    maxLength: Int = 1000,
) {
    var isFocused by remember { mutableStateOf(focusedDefault == true) }

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

        BasicTextField(
            value = value,
            onValueChange = { newValue ->
                if (newValue.text.length <= maxLength) {
                    onValueChange(newValue)
                }
            },
            textStyle = LocalZaTypography.current.textLarge.copy(
                color = if (enabled == true) LocalZaColors.current.text1 else LocalZaColors.current.text2,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged {
//                    isFocused = focusState.isFocused
                },
            maxLines = 5,
            enabled = enabled == true,
            cursorBrush = SolidColor(LocalZaColors.current.primary),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .height(120.dp)
                        .border(
                            width = 1.dp,
                            color =
                                if (enabled == true) {
                                    if (isFocused)
                                        LocalZaColors.current.primary
                                    else (
                                            if (hasError)
                                                red60
                                            else
                                                LocalZaColors.current.border2
                                            )
                                } else
                                    Color.Transparent,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .background(
                            if (enabled == true) Color.Transparent else LocalZaColors.current.inputDisabled,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Box(
                        Modifier.weight(1f),
                        contentAlignment = Alignment.TopStart
                    ) {
                        if (value.text.isEmpty()) {
                            Text(
                                placeholder,
                                color = LocalZaColors.current.text3,
                                style = LocalZaTypography.current.textLarge
                            )
                        }
                        innerTextField()
                    }

                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        if (isFocused && !value.text.isEmpty()) {
                            ZaIconButton(
                                onClick = { onValueChange(TextFieldValue("")) },
                                icon = "\uE951",
                                size = 16
                            )
                        } else {
                            Box {}
                        }

                        Text(
                            (maxLength - value.text.length).toString(),
                            color = LocalZaColors.current.text2,
                            style = LocalZaTypography.current.textXXXSmallM
                        )
                    }
                }
            },
        )

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

@Preview(showBackground = true)
@Composable
fun ZaTextAreaPreview() {
    var value by remember { mutableStateOf(TextFieldValue("Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).")) }

    KotlinApplicationTheme {
        ZaTextArea(value = value, onValueChange = {})
    }
}