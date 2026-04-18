package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.green60
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.ui.theme.white100
import com.example.kotlinapplication.ui.theme.yellow60

enum class ZaSnackbarType {
    SUCCESS,
    ERROR,
    WARNING,
    INFO
}

@Composable
fun ZaSnackbar(
    message: String,
    type: ZaSnackbarType,
    actionLabel: String? = null,
    onAction: () -> Unit
) {
    val iconName = when (type) {
        ZaSnackbarType.INFO -> "\uE9AC"
        ZaSnackbarType.SUCCESS -> "\uE93E"
        ZaSnackbarType.ERROR -> "\uE951"
        ZaSnackbarType.WARNING -> "\uEA7E"
    }

    val iconColor = when (type) {
        ZaSnackbarType.INFO -> blue60
        ZaSnackbarType.SUCCESS -> green60
        ZaSnackbarType.ERROR -> red60
        ZaSnackbarType.WARNING -> yellow60
    }

    Box(Modifier.fillMaxWidth().padding(12.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(LocalZaColors.current.snackbarContainer, RoundedCornerShape(8.dp))
                .padding(top = 12.dp, start = 16.dp, end = 20.dp, bottom = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ZaIcon(iconName, color = iconColor)

            Text(
                modifier = Modifier.weight(1f),
                text = message,
                color = white100,
                style = LocalZaTypography.current.textNormal
            )

            if (actionLabel != null) {
                Text(
                    text = actionLabel,
                    color = Color.White,
                    modifier = Modifier
                        .clickable { onAction() }
                        .padding(start = 16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ZaSnackbarPreview() {
    ZaSnackbar(message = "Success", type = ZaSnackbarType.INFO, onAction = {})
}