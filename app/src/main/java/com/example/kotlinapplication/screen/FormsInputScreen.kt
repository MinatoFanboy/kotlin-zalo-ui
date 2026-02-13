package com.example.kotlinapplication.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.model.DateItem
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaDatePicker
import com.example.kotlinapplication.ui.component.ZaDropdown
import com.example.kotlinapplication.ui.component.ZaInput
import com.example.kotlinapplication.ui.component.ZaOtp
import com.example.kotlinapplication.ui.component.ZaPhone
import com.example.kotlinapplication.ui.component.ZaSearch
import com.example.kotlinapplication.ui.component.ZaTextArea
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.util.DateUtils

@Composable
fun FormsInputScreen() {
    var valueDefault by remember { mutableStateOf(TextFieldValue("")) }
    var valueFilled by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valueFilledFocused by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valueFilledChecked by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valueFilledError by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valueFilledChecked2 by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valueFilledDisable by remember { mutableStateOf(TextFieldValue("Filled")) }

    var valueSecurity by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valueSecurity2 by remember { mutableStateOf(TextFieldValue("")) }

    var valuePassword by remember { mutableStateOf(TextFieldValue("Filled")) }
    var valuePassword2 by remember { mutableStateOf(TextFieldValue("")) }

    var valueSearch by remember { mutableStateOf(TextFieldValue("")) }
    var valueSearch2 by remember { mutableStateOf(TextFieldValue("")) }

    var valueDate by remember { mutableStateOf(DateItem.from(DateUtils.getCurrentTime())) }
    var valueDate2 by remember { mutableStateOf(DateItem.from(DateUtils.getCurrentTime())) }

    var valuePhone by remember { mutableStateOf(TextFieldValue("")) }
    var valuePhone2 by remember { mutableStateOf(TextFieldValue("987654321")) }
    var valuePhone3 by remember { mutableStateOf(TextFieldValue("")) }

    val focusedRequester = remember { FocusRequester() }
    var value by remember { mutableStateOf("") }

    val focusedRequester2 = remember { FocusRequester() }
    var value2 by remember { mutableStateOf("9999") }

    val focusedRequester3 = remember { FocusRequester() }
    var value3 by remember { mutableStateOf("") }

    var valueArea by remember { mutableStateOf(TextFieldValue("Text")) }
    var valueArea2 by remember { mutableStateOf(TextFieldValue("Text")) }
    var valueArea3 by remember { mutableStateOf(TextFieldValue("Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).")) }
    var valueArea4 by remember { mutableStateOf(TextFieldValue("")) }

//    LaunchedEffect(Unit) {
//        snapshotFlow { text }
//            .debounce (500)
//            .collect { query ->
//                onValueChange(query)
//            }
//    }

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
                trailing = {
                    ZaInput(
                        label = "Label",
                        value = valueDefault,
                        placeholder = "Placeholder",
                        onValueChange = { valueDefault = it },
                        helper = "Helper text",
                    )

                    ZaInput(
                        label = "Label",
                        value = valueFilled,
                        placeholder = "Placeholder",
                        onValueChange = { valueFilled = it },
                        helper = "Helper text",
                    )

                    ZaInput(
                        label = "Label",
                        value = valueFilledFocused,
                        placeholder = "Placeholder",
                        onValueChange = { valueFilledFocused = it },
                        helper = "Helper text",
                        focusedDefault = true,
                    )

                    ZaInput(
                        label = "Label",
                        value = valueFilledChecked,
                        placeholder = "Placeholder",
                        onValueChange = { valueFilledChecked = it },
                        helper = "Helper text",
                        isChecked = true
                    )

                    ZaInput(
                        label = "Label",
                        value = valueFilledError,
                        placeholder = "Placeholder",
                        onValueChange = { valueFilledError = it },
                        helper = "Helper text",
                        error = "Error text",
                    )

                    ZaInput(
                        label = "Label",
                        value = valueFilledChecked2,
                        placeholder = "Placeholder",
                        onValueChange = { valueFilledChecked2 = it },
                        helper = "Helper text",
                        isChecked = true
                    )

                    ZaInput(
                        label = "Label",
                        value = valueFilledDisable,
                        placeholder = "Placeholder",
                        onValueChange = { valueFilledDisable = it },
                        helper = "Helper text",
                        enabled = false
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "TextField",
                subName = "Để nhập nội dung đơn giản, trong 1 dòng",
                trailing = {
                    ZaInput(
                        label = "Label",
                        value = valueSecurity,
                        placeholder = "Placeholder",
                        onValueChange = { valueSecurity = it },
                        helper = "Helper text",
                        passwordStrength = true
                    )

                    ZaInput(
                        value = valueSecurity2,
                        placeholder = "Placeholder",
                        onValueChange = { valueSecurity2 = it },
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "PasswordField",
                subName = "Để nhập mật khẩu",
                trailing = {
                    ZaInput(
                        label = "Password",
                        value = valuePassword,
                        placeholder = "Password",
                        onValueChange = { valuePassword = it },
                        helper = "Helper text",
                        isPassword = true,
                        focusedDefault = true
                    )

                    ZaInput(
                        value = valuePassword2,
                        placeholder = "Password",
                        onValueChange = { valuePassword2 = it },
                        isPassword = true,
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "DropdownField",
                subName = "Để chọn trong các nội dung có sẵn",
                trailing = {
                    ZaDropdown(
                        label = "Label",
                        value = "Text",
                        onValueChange = {},
                        helper = "Helper text"
                    )

                    ZaDropdown(
                        value = "Text",
                        onValueChange = {},
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "SearchField",
                subName = "Để nhập nội dung tìm kiếm, trong 1 dòng",
                highlightName = "Interaction",
                description = arrayOf("Bấm chỗ nào cũng trigger nhập text"),
                trailing = {
                    ZaSearch(
                        value = valueSearch,
                        onValueChange = { valueSearch = it },
                    )

                    ZaSearch(
                        value = valueSearch2,
                        onValueChange = { valueSearch2 = it },
                        fullSize = false
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "DatePickerField",
                subName = "Để chọn nội dung ngày/tháng/năm",
                highlightName = "Interaction",
                description = arrayOf("Bấm chỗ nào cũng trigger chung 1 action, ko cho nhập text"),
                trailing = {
                    ZaDatePicker(
                        label = "Label",
                        value = valueDate,
                        onValueChange = { day, month, year, date ->
                            valueDate = DateItem(year, month, day)
                        },
                        helper = "Helper text"
                    )

                    ZaDatePicker(
                        value = valueDate2,
                        onValueChange = { day, month, year, date ->
                            valueDate2 = DateItem(year, month, day)
                        },
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "PhoneField",
                subName = "Để nhập nội dung đơn giản, trong 1 dòng",
                highlightName = "Interaction",
                description = arrayOf(
                    "Bấm section dropdown thì trigger chung 1 action, ko cho nhập text",
                    "Bấm section bên phải thì cho nhập text"
                ),
                trailing = {
                    ZaPhone(
                        value = valuePhone,
                        onValueChange = { valuePhone = it },
                        label = "Label",
                        helper = "Helper text"
                    )

                    ZaPhone(
                        value = valuePhone2,
                        onValueChange = { valuePhone2 = it },
                        label = "Label",
                        helper = "Helper text"
                    )

                    ZaPhone(value = valuePhone3, onValueChange = { valuePhone3 = it })
                }
            )
        }

        item {
            ZaCard(
                name = "OTPField",
                subName = "Để nhập OTP. Highlight từng số đo string ngắn và mỗi character thì quan trọng",
                highlightName = "Interaction",
                description = arrayOf(
                    "Bấm xoá: nghĩa là user muốn xoá kí tự được nhập gần nhất",
                    "Nếu ô đó đã được filled, thì chuyển về empty",
                    "Nếu ô đó empty thì xoá ô trước",
                    "Không cho chọn từng ô riêng biệt",
                    "Nếu tất cả ô đều empty thì khi user inactive filled, focus vào ô empty đầu tiên",
                    "Nếu đã có ít nhất 1 ô đã filled thì khi user active field, focus vào ô filled cuối cùng"
                ),
                trailing = {
                    ZaOtp(
                        modifier = Modifier.focusRequester(focusedRequester),
                        value = value,
                        onValueChange = { it, otpFilled ->
                            value = it
                            if (otpFilled) {
                                Log.d("OTP", "Filled")
                            }
                        },
                        shouldShowCursor = true,
                        shouldCursorBlink = true,
                    )

                    ZaOtp(
                        modifier = Modifier.focusRequester(focusedRequester2),
                        value = value2,
                        onValueChange = { it, otpFilled ->
                            value2 = it
                            if (otpFilled) {
                                Log.d("OTP", "Filled")
                            }
                        },
                        shouldShowCursor = true,
                        shouldCursorBlink = true,
                    )

                    ZaOtp(
                        modifier = Modifier.focusRequester(focusedRequester3),
                        value = value3,
                        onValueChange = { it, otpFilled ->
                            value3 = it
                            if (otpFilled) {
                                Log.d("OTP", "Filled")
                            }
                        },
                        shouldShowCursor = true,
                        shouldCursorBlink = true,
                        focusedDefault = true,
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "TextArea",
                subName = "Để nhập nhiều nội dung",
                trailing = {
                    ZaTextArea(
                        value = valueArea,
                        onValueChange = { valueArea = it },
                        label = "Label",
                        helper = "Helper Text",
                    )

                    ZaTextArea(
                        value = valueArea2,
                        onValueChange = { valueArea2 = it },
                        label = "Label",
                        helper = "Helper Text",
                        focusedDefault = true
                    )

                    ZaTextArea(
                        value = valueArea3,
                        onValueChange = { valueArea3 = it },
                        label = "Label",
                        helper = "Helper Text",
                        focusedDefault = true
                    )

                    ZaTextArea(
                        value = valueArea4,
                        onValueChange = { valueArea4 = it }
                    )
                }
            )
        }
    }
}