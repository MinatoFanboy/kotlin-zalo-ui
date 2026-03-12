package com.example.kotlinapplication.screen

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
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.model.DateItem
import com.example.kotlinapplication.ui.component.ZaButton
import com.example.kotlinapplication.ui.component.ZaButtonLevel
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaDatePicker
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.util.DateUtils

@Composable
fun TimePickerScreen() {
    var valueDate by remember { mutableStateOf(DateItem.from(DateUtils.getCurrentTime())) }
    var valueDate2 by remember { mutableStateOf(DateItem.from(DateUtils.getCurrentTime())) }

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
                name = "Type",
                trailing = {
                    ZaDatePicker(
                        modalTitle = "Single column selector",
                        value = valueDate,
                        onValueChange = { day, month, year, date ->
                            valueDate = DateItem(year, month, day)
                        },
                        content = { onClick ->
                            ZaButton(label = "Single Column", onClick = onClick, fullWidth = true, level = ZaButtonLevel.Secondary)
                        }
                    )

                    ZaDatePicker(
                        modalTitle = "Multi column selector",
                        value = valueDate2,
                        onValueChange = { day, month, year, date ->
                            valueDate2 = DateItem(year, month, day)
                        },
                        content = { onClick ->
                            ZaButton(label = "Multi Column", onClick = onClick, fullWidth = true, level = ZaButtonLevel.Secondary)
                        }
                    )
                }
            )
        }
    }
}