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
fun TextStyleScreen() {
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
                name = "Header Text",
                trailing = {
                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "Normal",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 16,
                        lineHeight = 22,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Small",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 15,
                        lineHeight = 20,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Title Text",
                trailing = {
                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "xLarge",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 22,
                        lineHeight = 26,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Large",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 20,
                        lineHeight = 26,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Normal",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 18,
                        lineHeight = 24,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Small",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 15,
                        lineHeight = 20,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Body Text",
                trailing = {
                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "xLarge",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 18,
                        lineHeight = 24,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "xLarge M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 18,
                        lineHeight = 24,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "Large",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 16,
                        lineHeight = 22,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Large M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 16,
                        lineHeight = 22,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "Normal",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 15,
                        lineHeight = 20,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Normal M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 15,
                        lineHeight = 20,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "Small",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 14,
                        lineHeight = 18,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "Small M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 14,
                        lineHeight = 18,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "xSmall",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 13,
                        lineHeight = 18,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "xSmall M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 13,
                        lineHeight = 18,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "xxSmall",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 12,
                        lineHeight = 16,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "xxSmall M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 12,
                        lineHeight = 16,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "xxxSmall",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 11,
                        lineHeight = 16,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "xxxSmall M",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 11,
                        lineHeight = 16,
                        fontWeight = FontWeight.Medium,
                        type = ZaTypographyType.TokenSize
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        modifier = Modifier.padding(top = 8.dp),
                        name = "xxxxSmall",
                        text = "Bầu trời trong xanh thăm thẳm, không một gợn mây",
                        fontSize = 10,
                        lineHeight = 14,
                        type = ZaTypographyType.TextStyle
                    )

                    HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                    ZaTypography(
                        name = "xxxxSmall M",
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