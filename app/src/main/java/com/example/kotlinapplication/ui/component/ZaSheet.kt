package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import kotlinx.coroutines.launch

data class SheetItem(
    val label: String,
    val active: Boolean,
    val onClick: () -> Unit
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaSheet(
    modifier: Modifier = Modifier,
    title: String = "This is title, it can be one line or two line",
    items: List<SheetItem> = emptyList(),
    content: (@Composable (onClick: () -> Unit) -> Unit)? = null
) {
    var visible by remember { mutableStateOf(false) }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )
    val scope = rememberCoroutineScope()

    if (content != null) {
        content({ visible = true })
    } else {
        ZaButton(
            modifier = modifier,
            label = "Default Bottom Sheet",
            onClick = {
                visible = true
            },
            fullWidth = true,
            level = ZaButtonLevel.Secondary
        )
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
                Column(modifier = Modifier.fillMaxWidth()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            title,
                            color = LocalZaColors.current.text2,
                            style = LocalZaTypography.current.textSmall
                        )
                    }

                    items.forEach { item ->
                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable(
                                    onClick = {
                                        item.onClick()
                                        scope.launch {
                                            sheetState.hide()
                                            visible = false
                                        }
                                    },
                                )
                                .padding(vertical = 16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                item.label,
                                color = if (item.active) LocalZaColors.current.text1 else LocalZaColors.current.danger,
                                style = LocalZaTypography.current.textLarge
                            )
                        }
                    }

                    HorizontalDivider(thickness = 4.dp, color = LocalZaColors.current.divider1)

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Cancel",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textSmall
                        )
                    }
                }
            }
        )
    }
}