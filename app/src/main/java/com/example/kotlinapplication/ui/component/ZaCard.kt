package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ZaCard(
    modifier: Modifier = Modifier,
    name: String? = null,
    subName: String? = null,
    trailing: @Composable () -> Unit,
    nameStyle: TextStyle? = null,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = Color.Transparent,
                shape = RoundedCornerShape(8.dp)
            )
            .background(LocalZaColors.current.pageBackground2)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (!name.isNullOrBlank() || !subName.isNullOrBlank()) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

                name?.takeIf { it.isNotBlank() }?.let {
                    Text(
                        it,
                        color = LocalZaColors.current.text1,
                        style = nameStyle ?: LocalZaTypography.current.titleSmall
                    )
                }

                subName?.takeIf { it.isNotBlank() }?.let {
                    Text(
                        it,
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textSmall
                    )
                }
            }
        }

        trailing()
    }
}

@Preview(showBackground = true)
@Composable
fun ZaCard() {
    KotlinApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .border(
                    width = 1.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(LocalZaColors.current.pageBackground2)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    "Title",
                    color = LocalZaColors.current.text1,
                    style = LocalZaTypography.current.headingXLarge,
                )

                Text(
                    "Sub Title",
                    color = LocalZaColors.current.text2,
                    style = LocalZaTypography.current.textSmall,
                )
            }
        }
    }
}