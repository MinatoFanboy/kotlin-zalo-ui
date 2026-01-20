package com.example.kotlinapplication.ui.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.green60
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.ui.theme.yellow60

enum class PasswordStrength(val level: Int) {
    EMPTY(0),
    WEAK(1),
    MEDIUM(2),
    STRONG(3),
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ZaInput(
    modifier: Modifier = Modifier,
    label: String? = null,
    value: TextFieldValue,
    placeholder: String,
    onValueChange: (TextFieldValue) -> Unit,
    helper: String? = null,
    error: String? = null,
    enabled: Boolean? = true,
    passwordStrength: Boolean? = false,
    isPassword: Boolean? = false
) {
    var isFocused by remember { mutableStateOf(false) }
    var isShowPassword by remember { mutableStateOf(false) }

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
            onValueChange = onValueChange,
            textStyle = LocalZaTypography.current.textLarge.copy(
                color = if (enabled == true) LocalZaColors.current.text1 else LocalZaColors.current.text2
            ),
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged { focusState ->
                isFocused = focusState.isFocused
            },
            singleLine = true,
            enabled = enabled == true,
            visualTransformation = if (isPassword == true && isShowPassword) VisualTransformation.None else PasswordVisualTransformation(),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .height(48.dp)
                        .border(
                            width = 1.dp,
                            color =
                                if (enabled == true) {
                                    if (isFocused)
                                        blue60
                                    else (
                                            if (hasError)
                                                red60
                                            else
                                                LocalZaColors.current.border2
                                            )
                                } else
                                    Color.Transparent
                                ,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .background(
                            if (enabled == true) Color.Transparent else LocalZaColors.current.inputDisabled,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(start = 12.dp, top = 0.dp, end = 6.dp, bottom = 0.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        Modifier
                            .weight(1f),
                        contentAlignment = Alignment.CenterStart
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

                    if (isFocused) {
                        if (!value.text.isEmpty()) {
                            ZaIconButton(
                                modifier = Modifier.padding(end = 3.dp),
                                onClick = { onValueChange(TextFieldValue("")) },
                                icon = "\uE951",
                                size = 16
                            )
                        }
                    } else {
                        if (!value.text.isEmpty()) {
                            Box(
                                modifier = Modifier
                                    .height(22.dp)
                                    .width(22.dp)
                                    .padding(end = 6.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                ZaIcon(
                                    "\uE93E",
                                    size = 16.sp,
                                    color = green60,
                                )
                            }
                        }
                    }

                    if (isPassword == true) {
                        ZaIconButton(
                            onClick = { isShowPassword = !isShowPassword},
                            icon = if (isShowPassword) "\uE9A6" else "\uEA52",
                            size = 24
                        )
                    }
                }
            },
        )

        if (passwordStrength == true) {
            PasswordStrengthIndicator(
                defaultColor = LocalZaColors.current.divider2,
                strength = calculatePasswordStrength(value.text)
            )
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

@Preview(showBackground = true)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ZaInput() {
    KotlinApplicationTheme {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text("Password", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

            BasicTextField(
                value = "Filled",
                onValueChange = {},
                textStyle = LocalZaTypography.current.textLarge.copy(color = LocalZaColors.current.text1),
                modifier = Modifier
                    .fillMaxWidth(),
                singleLine = true,
                enabled = false,
                visualTransformation = PasswordVisualTransformation(),
                decorationBox = { innerTextField ->
                    Row(
                        modifier = Modifier
                            .height(48.dp)
                            .border(
                                width = 1.dp,
                                color = LocalZaColors.current.text3,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(Color.Transparent, RoundedCornerShape(8.dp))
                            .padding(start = 12.dp, top = 0.dp, end = 0.dp, bottom = 0.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Box(
                            Modifier
                                .weight(1f),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            innerTextField()
                        }
                    }
                },
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ZaIcon(
                    "\uE9AC",
                    color = LocalZaColors.current.text2,
                    size = 16.sp
                )

                Text(
                    "Helper text",
                    color = LocalZaColors.current.text2,
                    style = LocalZaTypography.current.textXSmall
                )
            }
        }
    }
}

@Composable
fun PasswordStrengthIndicator(
    strength: PasswordStrength,
    defaultColor: Color,
    modifier: Modifier = Modifier,
) {
    val activeColor by animateColorAsState(
        targetValue = strengthColor(strength, defaultColor),
        label = "strengthColor"
    )

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        repeat(3) { index ->
            val isActive = index < strength.level

            val segmentColor by animateColorAsState(
                targetValue = if (isActive) activeColor else defaultColor,
                label = "segmentColor"
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(4.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(segmentColor)
            )
        }
    }
}

fun strengthColor(strength: PasswordStrength, defaultColor: Color): Color {
    return when (strength) {
        PasswordStrength.WEAK -> red60
        PasswordStrength.MEDIUM -> yellow60
        PasswordStrength.STRONG -> green60
        else -> defaultColor
    }
}

fun calculatePasswordStrength(password: String): PasswordStrength {
    if (password.isEmpty()) return PasswordStrength.EMPTY

    var score = 0
    if (password.length >= 6) score++
    if (password.any { it.isDigit() }) score++
    if (password.any { it.isUpperCase() }) score++

    return when (score) {
        0, 1 -> PasswordStrength.WEAK
        2 -> PasswordStrength.MEDIUM
        else -> PasswordStrength.STRONG
    }
}