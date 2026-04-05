package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.R
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaCustomSheet(
    modifier: Modifier = Modifier,
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
            label = "Custom Bottom Sheet",
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
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
                        ZaIcon("\uE9AD", color = LocalZaColors.current.text2)

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.starbucks),
                                contentDescription = "My Image"
                            )
                        }
                    }

                    Text(
                        "Cho phép Starbucks Coffee xác định vị trí của bạn",
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textLargeM
                    )

                    Text(
                        "Starbucks Coffee sẽ sử dụng vị trí của bạn để hỗ trợ giao nhận hàng, tìm kiếm dịch vụ, bạn bè quanh bạn, hoặc các dịch vụ liên quan đến địa điểm khác.",
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textNormal
                    )

                    Row(
                        modifier = Modifier.padding(top = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        ZaButton(
                            modifier = Modifier.weight(1f),
                            label = "Để sau",
                            onClick = {},
                            fullWidth = true,
                            level = ZaButtonLevel.Secondary
                        )

                        ZaButton(
                            modifier = Modifier.weight(1f),
                            label = "Cho phép",
                            onClick = {},
                            fullWidth = true
                        )
                    }
                }
            }
        )
    }
}