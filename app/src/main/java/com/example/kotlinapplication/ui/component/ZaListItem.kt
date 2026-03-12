package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ZaListItem(
    modifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier,
    title: String = "",
    hint: String = "",
    subTitle: String = "",
    icon: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (icon != null) {
                icon()
            }

            Row(
                modifier = contentModifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    verticalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    Text(
                        buildAnnotatedString {
                            append(title)

                            if (hint != "") {
                                withStyle(style = SpanStyle(color = LocalZaColors.current.text2)) {
                                    append(" ($hint)")
                                }
                            }
                        },
                        color = LocalZaColors.current.text1,
                        style = LocalZaTypography.current.textLarge,
                    )

                    if (subTitle != "") {
                        Text(
                            subTitle,
                            color = LocalZaColors.current.text2,
                            style = LocalZaTypography.current.textSmall,
                        )
                    }
                }

                if (trailing != null) {
                    trailing()
                }
            }
        }
        HorizontalDivider(thickness = Dp.Hairline, color = LocalZaColors.current.divider1)
    }
}