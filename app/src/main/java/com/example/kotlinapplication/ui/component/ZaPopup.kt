package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.kotlinapplication.R
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaPopup(
    modifier: Modifier = Modifier,
    content: (@Composable (onClick: () -> Unit) -> Unit)? = null
) {
    var showDialog by remember { mutableStateOf(false) }

    if (content != null) {
        content({ showDialog = true })
    } else {
        ZaButton(
            modifier = modifier,
            label = "Popup",
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
                Image(
                    painter = painterResource(id = R.drawable.sendo),
                    contentDescription = "My Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth()
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, top = 24.dp, end = 24.dp, bottom = 32.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "This is the title",
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.titleLargeM,
                    )

                    Text(
                        text = "This is a very long message that can be displayed in 3 lines",
                        textAlign = TextAlign.Center,
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textNormal,
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, bottom = 24.dp, end = 24.dp),
                ) {
                    ZaButton(
                        onClick = { showDialog = false },
                        label = "Xác nhận",
                        fullWidth = true
                    )
                }
            }
        }
    }
        }
}