package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.SheetItem
import com.example.kotlinapplication.ui.component.ZaButton
import com.example.kotlinapplication.ui.component.ZaButtonLevel
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaSheet
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun SheetAndModalScreen() {
    val sheetItems = listOf(
        SheetItem("Sample Menu", true, onClick = {}),
        SheetItem("Sample Menu", true, onClick = {}),
        SheetItem("Negative Menu", false, onClick = {}),
    )

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
                name = "Bottom Sheet",
                space = 24,
                trailing = {
                    ZaSheet(items = sheetItems)

                    ZaButton(
                        label = "Custom Bottom Sheet",
                        onClick = {},
                        fullWidth = true,
                        level = ZaButtonLevel.Secondary
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Dialog & Modal",
                space = 24,
                trailing = {
                    ZaButton(
                        label = "Info Dialog",
                        onClick = {},
                        fullWidth = true,
                        level = ZaButtonLevel.Secondary
                    )

                    ZaButton(
                        label = "Popup",
                        onClick = {},
                        fullWidth = true,
                        level = ZaButtonLevel.Secondary
                    )
                }
            )
        }
    }
}