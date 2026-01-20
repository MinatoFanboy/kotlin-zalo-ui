package com.example.kotlinapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaDropdown
import com.example.kotlinapplication.ui.component.ZaInput
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun FormsInputScreen(navHostController: NavHostController) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    var value1 by remember { mutableStateOf(TextFieldValue("")) }
    var value2 by remember { mutableStateOf(TextFieldValue("123456")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        ZaCard(
            trailing = {
                ZaInput(
                    label = "Label",
                    value = value,
                    placeholder = "Placeholder",
                    onValueChange = { value = it },
                    helper = "Helper text",
                )
            }
        )

        ZaCard(
            name = "TextField",
            subName = "Để nhập nội dung đơn giản, trong 1 dòng",
            trailing = {
                ZaInput(
                    label = "Label",
                    value = value1,
                    placeholder = "Placeholder",
                    onValueChange = { value1 = it },
                    helper = "Helper text",
                    passwordStrength = true
                )
            }
        )

        ZaCard(
            name = "PasswordField",
            subName = "Để nhập mật khẩu",
            trailing = {
                ZaInput(
                    label = "Password",
                    value = value2,
                    placeholder = "Password",
                    onValueChange = { value2 = it },
                    helper = "Helper text",
                    isPassword = true,
                )
            }
        )

        ZaCard(
            name = "DropdownField",
            subName = "Để chọn trong các nội dung có sẵn",
            trailing = {
                ZaDropdown(
                    label = "Label"
                )
            }
        )
    }
}