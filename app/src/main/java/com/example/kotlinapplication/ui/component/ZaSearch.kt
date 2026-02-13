package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ZaSearch(
    modifier: Modifier = Modifier,
    value: TextFieldValue,
    placeholder: String = "Search",
    onValueChange: (TextFieldValue) -> Unit,
    enabled: Boolean? = true,
    fullSize: Boolean? = true,
) {
    var isFocused by remember { mutableStateOf(false) }

    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = LocalZaTypography.current.textLarge.copy(
            color = if (enabled == true) LocalZaColors.current.text1 else LocalZaColors.current.text2
        ),
        modifier = modifier
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                isFocused = focusState.isFocused
            },
        singleLine = true,
        enabled = enabled == true,
        cursorBrush = SolidColor(LocalZaColors.current.primary),
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier
                    .height(if (fullSize == true) 48.dp else 32.dp)
                    .border(
                        width = 1.dp,
                        color =
                            if (enabled == true) {
                                if (isFocused) LocalZaColors.current.primary else LocalZaColors.current.border2
                            } else
                                Color.Transparent,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .background(
                        if (enabled == true) Color.Transparent else LocalZaColors.current.inputDisabled,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(
                        start = if (fullSize == true) 12.dp else 8.dp,
                        end = if (fullSize == true) 12.dp else 8.dp,
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(if (fullSize == true) 12.dp else 8.dp)
            ) {
                ZaIcon(
                    "\uEA24",
                    size = 24.sp,
                    color = LocalZaColors.current.text1
                )

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
                            onClick = { onValueChange(TextFieldValue("")) },
                            icon = "\uE951",
                            size = 16
                        )
                    }
                }
            }
        },
    )
}