package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.model.DateItem
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.util.DateUtils
import kotlinx.coroutines.launch
import java.text.DateFormatSymbols

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaDatePicker(
    modifier: Modifier = Modifier,
    label: String? = null,
    value: DateItem? = null,
    placeholder: String = "dd/mm/yyyy",
    onValueChange: (Int, Int, Int, Long) -> Unit = { _, _, _, _ -> },
    helper: String? = null,
    error: String? = null,
    enabled: Boolean? = true,
    selectorEffectEnabled: Boolean = true,
    yearsRange: IntRange = IntRange(1923, 2121),
    modalTitle: String = "Chọn ngày",
    content: (@Composable (onClick: () -> Unit) -> Unit)? = null
) {
    var visible by remember { mutableStateOf(false) }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )
    val scope = rememberCoroutineScope()

    val hasError = !error.isNullOrBlank()
    val footerText = error ?: helper

    var selectedDate by remember {
        mutableStateOf(value ?: DateItem.from(DateUtils.getCurrentTime()))
    }

    val days by remember(selectedDate) {
        derivedStateOf { selectedDate.daysOfDate() }
    }

    val months by remember {
        derivedStateOf { selectedDate.monthsOfDate() }
    }

    val years = remember(yearsRange) {
        yearsRange.toList()
    }

    if (content != null) {
        content({ visible = true })
    } else {
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
                    .clickable(
                        onClick = { visible = true },
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
                        value?.toDisplayString() ?: placeholder,
                        color = if (value == null) LocalZaColors.current.text3 else LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textLarge
                    )
                }

                Box(contentAlignment = Alignment.Center) {
                    ZaIcon(
                        "\uE92C",
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

    if (visible) {
        ModalBottomSheet(
            onDismissRequest = {
                scope.launch {
                    sheetState.hide()
                    visible = false
                }
            },
            dragHandle = {},
            sheetState = sheetState,
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp),
            containerColor = LocalZaColors.current.pageBackground2,
            content = {
                Column(modifier = Modifier.height(400.dp)) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp, bottom = 32.dp, start = 20.dp, end = 20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Spacer(modifier = Modifier.width(24.dp))

                        Text(
                            text = modalTitle,
                            color = LocalZaColors.current.text1,
                            modifier = Modifier.weight(1f),
                            style = LocalZaTypography.current.textXLargeM,
                            textAlign = TextAlign.Center
                        )

                        ZaIconButton(
                            onClick = {
                                scope.launch {
                                    sheetState.hide()
                                    visible = false
                                }
                            },
                            icon = "\uE954",
                            size = 24
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(270.dp)
                            .padding(horizontal = 16.dp)
                    ) {
                        key(days.size) {
                            ZaDatePickerWheelView(
                                modifier = Modifier.weight(1f),
                                selection = maxOf(days.indexOf(selectedDate.day), 0),
                                itemCount = days.size,
                                selectorOption = SelectorOptions().copy(
                                    selectEffectEnabled = selectorEffectEnabled,
                                    enabled = false
                                ),
                                onFocusItem = {
                                    selectedDate = selectedDate.withDay(days[it])
                                    onValueChange(
                                        selectedDate.day,
                                        selectedDate.month,
                                        selectedDate.year,
                                        selectedDate.date
                                    )
                                },
                                content = { index, color ->
                                    Text(
                                        color = color,
                                        text = days[index].toString(),
                                        fontSize = 15.sp,
                                        lineHeight = 20.sp
                                    )
                                })
                        }

                        ZaDatePickerWheelView(
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 8.dp, end = 8.dp),
                            selection = maxOf(months.indexOf(selectedDate.month), 0),
                            itemCount = months.size,
                            selectorOption = SelectorOptions().copy(
                                selectEffectEnabled = selectorEffectEnabled,
                                enabled = false
                            ),
                            onFocusItem = {
                                selectedDate =
                                    selectedDate.withMonth(months[it])
                                onValueChange(
                                    selectedDate.day,
                                    selectedDate.month,
                                    selectedDate.year,
                                    selectedDate.date
                                )
                            },
                            content = { index, color ->
                                Text(
                                    color = color,
                                    text = DateFormatSymbols().months[months[index]],
                                    fontSize = 15.sp,
                                    lineHeight = 20.sp
                                )
                            })

                        ZaDatePickerWheelView(
                            modifier = Modifier.weight(1f),
                            selection = years.indexOf(selectedDate.year),
                            itemCount = years.size,
                            isEndless = years.size > 2 * 2,
                            selectorOption = SelectorOptions().copy(
                                selectEffectEnabled = selectorEffectEnabled,
                                enabled = false
                            ),
                            onFocusItem = {
                                selectedDate = selectedDate.withYear(years[it])
                                onValueChange(
                                    selectedDate.day,
                                    selectedDate.month,
                                    selectedDate.year,
                                    selectedDate.date
                                )
                            },
                            content = { index, color ->
                                Text(
                                    color = color,
                                    text = years[index].toString(),
                                    fontSize = 15.sp,
                                    lineHeight = 20.sp
                                )
                            })
                    }
                }
            }
        )
    }
}