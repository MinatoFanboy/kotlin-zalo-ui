package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaIcon
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun LibraryIconsScreen() {
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
                name = "Color",
                trailing = {
                    Row(horizontalArrangement = Arrangement.spacedBy(40.dp)) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "icon-01",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text1,
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "icon-02",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text2,
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "icon-03",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text3,
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Size",
                trailing = {
                    Row(horizontalArrangement = Arrangement.spacedBy(40.dp)) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "16px",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text1,
                                size = 16.sp
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "24px",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text1,
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "32px",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text1,
                                size = 32.sp
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "40px",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text1,
                                size = 40.sp
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Type",
                trailing = {
                    Row(horizontalArrangement = Arrangement.spacedBy(40.dp)) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "Line",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CE",
                                color = LocalZaColors.current.text1
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                "Solid",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaIcon(
                                "\uE9CD",
                                color = LocalZaColors.current.text1,
                            )
                        }
                    }
                }
            )
        }
    }
}