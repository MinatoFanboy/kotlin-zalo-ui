package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaCheckbox
import com.example.kotlinapplication.ui.component.ZaRadio
import com.example.kotlinapplication.ui.component.ZaRangeSlider
import com.example.kotlinapplication.ui.component.ZaSlider
import com.example.kotlinapplication.ui.component.ZaSwitch
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun SelectionScreen() {
    var valueCheckboxMedium by remember { mutableStateOf(false) }
    var valueCheckboxMedium2 by remember { mutableStateOf(true) }
    var valueCheckboxMedium3 by remember { mutableStateOf(false) }
    var valueCheckboxMedium4 by remember { mutableStateOf(true) }

    var valueCheckboxSmall by remember { mutableStateOf(false) }
    var valueCheckboxSmall2 by remember { mutableStateOf(true) }
    var valueCheckboxSmall3 by remember { mutableStateOf(false) }
    var valueCheckboxSmall4 by remember { mutableStateOf(true) }

    var valueRadioMedium by remember { mutableStateOf(false) }
    var valueRadioMedium2 by remember { mutableStateOf(true) }
    var valueRadioMedium3 by remember { mutableStateOf(false) }
    var valueRadioMedium4 by remember { mutableStateOf(true) }

    var valueRadioSmall by remember { mutableStateOf(false) }
    var valueRadioSmall2 by remember { mutableStateOf(true) }
    var valueRadioSmall3 by remember { mutableStateOf(false) }
    var valueRadioSmall4 by remember { mutableStateOf(true) }

    var valueSwitchMedium by remember { mutableStateOf(false) }
    var valueSwitchMedium2 by remember { mutableStateOf(true) }
    var valueSwitchMedium3 by remember { mutableStateOf(false) }
    var valueSwitchMedium4 by remember { mutableStateOf(true) }

    var valueSwitchSmall by remember { mutableStateOf(false) }
    var valueSwitchSmall2 by remember { mutableStateOf(true) }
    var valueSwitchSmall3 by remember { mutableStateOf(false) }
    var valueSwitchSmall4 by remember { mutableStateOf(true) }

    var valueSlider by remember { mutableFloatStateOf(20f) }
    var valueSlider2 by remember { mutableFloatStateOf(20f) }
    var valueSlider3 by remember { mutableFloatStateOf(20f) }
    var valueSlider4 by remember { mutableFloatStateOf(20f) }
    var valueSlider5 by remember { mutableFloatStateOf(20f) }

    var valueRangeSlider by remember { mutableStateOf(20f..40f) }
    var valueRangeSlider2 by remember { mutableStateOf(20f..40f) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            ZaCard(
                name = "Checkbox",
                description = arrayOf(
                    "Cho phép người dùng chọn 1 hoặc nhiều mục trong 1 danh sách.",
                    "Dùng để bật/tắt lựa chọn."
                ),
                trailing = {
                    Box(modifier = Modifier.padding(top = 8.dp)) {
                        Text(
                            "Medium Size",
                            color = LocalZaColors.current.selectionLabel,
                            style = LocalZaTypography.current.textXSmallM
                        )
                    }

                    ZaCheckbox(
                        value = valueCheckboxMedium,
                        onValueChange = { valueCheckboxMedium = it })
                    ZaCheckbox(
                        value = valueCheckboxMedium2,
                        onValueChange = { valueCheckboxMedium2 = it })
                    ZaCheckbox(
                        value = valueCheckboxMedium3,
                        onValueChange = { valueCheckboxMedium3 = it },
                        enabled = false
                    )
                    ZaCheckbox(
                        value = valueCheckboxMedium4,
                        onValueChange = { valueCheckboxMedium4 = it },
                        enabled = false
                    )

                    Text(
                        "Small Size",
                        color = LocalZaColors.current.selectionLabel,
                        style = LocalZaTypography.current.textXSmallM
                    )

                    ZaCheckbox(
                        value = valueCheckboxSmall,
                        onValueChange = { valueCheckboxSmall = it },
                        small = true
                    )
                    ZaCheckbox(
                        value = valueCheckboxSmall2,
                        onValueChange = { valueCheckboxSmall2 = it },
                        small = true
                    )
                    ZaCheckbox(
                        value = valueCheckboxSmall3,
                        onValueChange = { valueCheckboxSmall3 = it },
                        enabled = false,
                        small = true
                    )
                    ZaCheckbox(
                        value = valueCheckboxSmall4,
                        onValueChange = { valueCheckboxSmall4 = it },
                        enabled = false,
                        small = true
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Radio Button",
                description = arrayOf(
                    "Cho phép chọn 1 mục trong danh sách",
                ),
                trailing = {
                    Box(modifier = Modifier.padding(top = 8.dp)) {
                        Text(
                            "Medium Size",
                            color = LocalZaColors.current.selectionLabel,
                            style = LocalZaTypography.current.textXSmallM
                        )
                    }

                    ZaRadio(
                        value = valueRadioMedium,
                        onValueChange = { valueRadioMedium = it })
                    ZaRadio(
                        value = valueRadioMedium2,
                        onValueChange = { valueRadioMedium2 = it })
                    ZaRadio(
                        value = valueRadioMedium3,
                        onValueChange = { valueRadioMedium3 = it },
                        enabled = false
                    )
                    ZaRadio(
                        value = valueRadioMedium4,
                        onValueChange = { valueRadioMedium4 = it },
                        enabled = false
                    )

                    Text(
                        "Small Size",
                        color = LocalZaColors.current.selectionLabel,
                        style = LocalZaTypography.current.textXSmallM
                    )

                    ZaRadio(
                        value = valueRadioSmall,
                        onValueChange = { valueRadioSmall = it },
                        small = true
                    )
                    ZaRadio(
                        value = valueRadioSmall2,
                        onValueChange = { valueRadioSmall2 = it },
                        small = true
                    )
                    ZaRadio(
                        value = valueRadioSmall3,
                        onValueChange = { valueRadioSmall3 = it },
                        enabled = false,
                        small = true
                    )
                    ZaRadio(
                        value = valueRadioSmall4,
                        onValueChange = { valueRadioSmall4 = it },
                        enabled = false,
                        small = true
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Switch",
                description = arrayOf(
                    "Bật / Tắt trạng thái của một mục",
                ),
                trailing = {
                    Box(modifier = Modifier.padding(top = 8.dp)) {
                        Text(
                            "Medium Size",
                            color = LocalZaColors.current.selectionLabel,
                            style = LocalZaTypography.current.textXSmallM
                        )
                    }

                    ZaSwitch(
                        checked = valueSwitchMedium,
                        onCheckedChanged = { valueSwitchMedium = it })
                    ZaSwitch(
                        checked = valueSwitchMedium2,
                        onCheckedChanged = { valueSwitchMedium2 = it })
                    ZaSwitch(
                        checked = valueSwitchMedium3,
                        onCheckedChanged = { valueSwitchMedium3 = it },
                        enabled = false
                    )
                    ZaSwitch(
                        checked = valueSwitchMedium4,
                        onCheckedChanged = { valueSwitchMedium4 = it },
                        enabled = false
                    )

                    Text(
                        "Small Size",
                        color = LocalZaColors.current.selectionLabel,
                        style = LocalZaTypography.current.textXSmallM
                    )

                    ZaSwitch(
                        checked = valueSwitchSmall,
                        onCheckedChanged = { valueSwitchSmall = it },
                        small = true
                    )
                    ZaSwitch(
                        checked = valueSwitchSmall2,
                        onCheckedChanged = { valueSwitchSmall2 = it },
                        small = true
                    )
                    ZaSwitch(
                        checked = valueSwitchSmall3,
                        onCheckedChanged = { valueSwitchSmall3 = it },
                        enabled = false,
                        small = true
                    )
                    ZaSwitch(
                        checked = valueSwitchSmall4,
                        onCheckedChanged = { valueSwitchSmall4 = it },
                        enabled = false,
                        small = true
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Slider",
                subName = "Cho phép người dùng thay đổi, lựa chọn nội dung từ 1 dãy giá trị",
                trailing = {
                    ZaSlider(value = valueSlider, onValueChange = { valueSlider = it }, valueRange = 0f..100f)

                    ZaSlider(value = valueSlider2, onValueChange = { valueSlider2 = it }, valueRange = 0f..100f, steps = 3)

                    ZaSlider(value = valueSlider3, onValueChange = { valueSlider3 = it }, valueRange = 0f..100f)

                    ZaRangeSlider(value = valueRangeSlider, onValueChange = { valueRangeSlider = it })

                    ZaRangeSlider(value = valueRangeSlider2, onValueChange = { valueRangeSlider2 = it }, type = "price")

                    ZaSlider(value = valueSlider4, onValueChange = { valueSlider4 = it }, valueRange = 0f..100f)

                    ZaSlider(value = valueSlider5, onValueChange = { valueSlider5 = it }, valueRange = 0f..100f)
                }
            )
        }
    }
}