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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.red60

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ZaPhone(
    modifier: Modifier = Modifier,
    label: String? = null,
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    helper: String? = null,
    error: String? = null,
    enabled: Boolean = true,
) {
    var isFocused by remember { mutableStateOf(false) }

    val hasError = !error.isNullOrBlank()
    val footerText = error ?: helper

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        if (!label.isNullOrBlank()) {
            Text(
                label,
                color = if (enabled) LocalZaColors.current.text1 else LocalZaColors.current.text3,
                style = LocalZaTypography.current.textSmall
            )
        }

        Box(contentAlignment = Alignment.CenterStart) {
            BasicTextField(
                value = value,
                onValueChange = {
                    val digits = it.text.filter(Char::isDigit).take(9)
                    onValueChange(it.copy(text = digits))
                },
                textStyle = LocalZaTypography.current.textLarge.copy(
                    color = Color.Transparent,
                    letterSpacing = 4.sp
                ),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .onFocusChanged { focusState ->
                        isFocused = focusState.isFocused
                    },
                singleLine = true,
                enabled = enabled,
                visualTransformation = PhoneVisualTransformation(
                    filledColor = LocalZaColors.current.text1,
                    emptyColor = LocalZaColors.current.text3
                ),
                cursorBrush = SolidColor(LocalZaColors.current.primary),
                decorationBox = { innerTextField ->
                    Row(
                        modifier = Modifier
                            .height(48.dp)
                            .border(
                                width = 1.dp,
                                color =
                                    if (enabled) {
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
                                if (enabled) Color.Transparent else LocalZaColors.current.inputDisabled,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(end = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxHeight()
                                .background(LocalZaColors.current.pageBackground3)
                                .padding(horizontal = 12.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                "+84",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textLarge
                            )

                            ZaIcon(
                                "\uE945",
                                size = 16.sp,
                                color = LocalZaColors.current.text1,
                            )
                        }

                        Box(modifier = Modifier
                            .fillMaxHeight()
                            .width(1.dp)
                            .background(LocalZaColors.current.divider1)
                        )

                        Box(
                            Modifier
                                .weight(1f)
                                .padding(start = 12.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            innerTextField()
                        }
                    }
                },
            )
        }

        if (!footerText.isNullOrBlank()) {
            if (enabled) {
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

private fun buildPhoneMaskAnnotated(
    input: String,
    mask: String = "___-___-___",
    filledColor: Color,
    emptyColor: Color,
): AnnotatedString {
    val builder = AnnotatedString.Builder()
    var inputIndex = 0

    mask.forEach { char ->
        when {
            char == '_' -> {
                if (inputIndex < input.length) {
                    builder.withStyle(
                        SpanStyle(color = filledColor, letterSpacing = 0.sp)
                    ) {
                        append(input[inputIndex])
                    }
                    inputIndex++
                } else {
                    builder.withStyle(
                        SpanStyle(color = emptyColor, letterSpacing = 4.sp)
                    ) {
                        append('_')
                    }
                }
            }

            else -> {
                builder.withStyle(
                    SpanStyle(color = emptyColor)
                ) {
                    append(char)
                }
            }
        }
    }

    return builder.toAnnotatedString()
}

class PhoneVisualTransformation(
    private val filledColor: Color,
    private val emptyColor: Color
) : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val trimmed = text.text.take(9)

        val masked = buildPhoneMaskAnnotated(
            input = trimmed,
            filledColor = filledColor,
            emptyColor = emptyColor
        )

        val offsetMapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return when {
                    offset <= 3 -> offset
                    offset <= 6 -> offset + 1
                    offset <= 9 -> offset + 2
                    else -> masked.length
                }
            }

            override fun transformedToOriginal(offset: Int): Int {
                val originalLength = text.text.length

                val calculated = when {
                    offset <= 3 -> offset
                    offset <= 4 -> 3
                    offset <= 7 -> offset - 1
                    offset <= 8 -> 6
                    else -> offset - 2
                }

                return calculated.coerceIn(0, originalLength)
            }
        }

        return TransformedText(masked, offsetMapping)
    }
}