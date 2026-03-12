package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaTypography
import com.example.kotlinapplication.ui.component.ZaTypographyType
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun TokenSizeScreen() {
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
                name = "Typeface: Roboto",
                subName = "Designed by Christian Robertson",
                trailing = {
                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "f1100r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 27,
                        lineHeight = 34,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f1100m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 27,
                        lineHeight = 34,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f1000r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 24,
                        lineHeight = 30,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f1000m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 24,
                        lineHeight = 30,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f900r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 22,
                        lineHeight = 26,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f900m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 22,
                        lineHeight = 26,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f800r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 20,
                        lineHeight = 26,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f800m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 20,
                        lineHeight = 26,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f700r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 18,
                        lineHeight = 24,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f700m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 18,
                        lineHeight = 24,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f600r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 16,
                        lineHeight = 22,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f600m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 16,
                        lineHeight = 22,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f500r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 15,
                        lineHeight = 20,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f500m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 15,
                        lineHeight = 20,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f400r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 14,
                        lineHeight = 18,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f400m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 14,
                        lineHeight = 18,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f300r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 13,
                        lineHeight = 18,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f300m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 13,
                        lineHeight = 18,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f200r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 12,
                        lineHeight = 16,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f200m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 12,
                        lineHeight = 16,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f100r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 11,
                        lineHeight = 16,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f100m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 11,
                        lineHeight = 16,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "f400r",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 10,
                        lineHeight = 14,
                        type = ZaTypographyType.TokenSize
                    )

                    ZaTypography(
                        name = "f400m",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 10,
                        lineHeight = 14,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )
                }
            )
        }
    }
}