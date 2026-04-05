package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaDialog(
    modifier: Modifier = Modifier,
    content: (@Composable (onClick: () -> Unit) -> Unit)? = null
) {
    var showDialog by remember { mutableStateOf(false) }

    if (content != null) {
        content({ showDialog = true })
    } else {
        ZaButton(
            modifier = modifier,
            label = "Custom Bottom Sheet",
            onClick = {
                showDialog = true
            },
            fullWidth = true,
            level = ZaButtonLevel.Secondary
        )
    }

    if (showDialog) {
    Dialog(onDismissRequest = { showDialog = false }) {
        Card(
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = LocalZaColors.current.pageBackground2
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, top = 24.dp, end = 24.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = "This is the title",
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.titleLargeM,
                    )

                    Text(
                        text = "This is a very long message that can be displayed in 3 lines",
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textNormal,
                    )

                    HorizontalDivider(
                        thickness = Dp.Hairline,
                        color = LocalZaColors.current.divider1,
                        modifier = Modifier.padding(top = 24.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    ZaTextButton(
                        modifier = Modifier.height(40.dp),
                        onClick = { showDialog = false },
                        label = "Button",
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textNormalM,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    ZaTextButton(
                        modifier = Modifier.height(40.dp),
                        onClick = { showDialog = false },
                        label = "Button",
                        color = LocalZaColors.current.primary,
                        style = LocalZaTypography.current.textNormalM,
                    )
                }
            }
        }
    }
        }
}