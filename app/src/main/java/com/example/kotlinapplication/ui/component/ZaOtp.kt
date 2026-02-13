package com.example.kotlinapplication.ui.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import kotlinx.coroutines.delay
import kotlin.Boolean

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ZaOtp(
    modifier: Modifier = Modifier,
    value: String = "9999",
    otpLength: Int = 4,
    shouldShowCursor: Boolean = false,
    shouldCursorBlink: Boolean = false,
    onValueChange: (String, Boolean) -> Unit = { a, b -> },
    focusedDefault: Boolean? = false,
) {
    val focusManager = LocalFocusManager.current
    var isFocused by remember { mutableStateOf(focusedDefault == true) }

    BasicTextField(
        modifier = modifier.onFocusChanged {
//            isFocused = focusState.isFocused
        },
        value = TextFieldValue(value, selection = TextRange(value.length)),
        onValueChange = {
            if (it.text.length <= otpLength) {
                onValueChange(it.text, it.text.length == otpLength)
            }
            if (it.text.length == otpLength) {
                focusManager.clearFocus()
            }
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        decorationBox = {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                repeat(otpLength) { index ->
                    ZaOtpCell(
                        index,
                        shouldShowCursor = shouldShowCursor,
                        shouldCursorBlink = (isFocused && shouldCursorBlink),
                        optText = value,
                        isLastIndex = (value.length == otpLength && otpLength - 1 == index)
                    )
                }
            }
        }
    )
}

@Composable
private fun ZaOtpCell(
    index: Int,
    shouldShowCursor: Boolean,
    shouldCursorBlink: Boolean,
    optText: String,
    isLastIndex: Boolean
) {
    val isFocused = (optText.length == index) && shouldCursorBlink
    val isFocusedBorder = isLastIndex && shouldCursorBlink

    val otpChar = when {
        index < optText.length -> {
            optText[index]
        }

        else -> ""
    }

    val cursorVisible = remember { mutableStateOf(shouldShowCursor) }

    LaunchedEffect(key1 = isFocused) {
        if (isFocused && shouldShowCursor && shouldCursorBlink) {
            while (true) {
                delay(500)
                cursorVisible.value = !cursorVisible.value
            }
        }
    }

    Box(
        modifier = Modifier
            .width(48.dp)
            .height(56.dp)
            .border(
                width = if (isFocused || isFocusedBorder) 2.dp else 1.dp,
                color = if (isFocused || isFocusedBorder) LocalZaColors.current.primary else LocalZaColors.current.border2,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = otpChar.toString(),
            style = LocalZaTypography.current.headingXLarge.copy(
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
        )

        AnimatedVisibility(
            visible = isFocused && cursorVisible.value, enter = fadeIn(),
            exit = fadeOut()
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.Center)
                    .width(1.dp)
                    .height(34.dp)
                    .background(LocalZaColors.current.primary)
            )
        }
    }
}