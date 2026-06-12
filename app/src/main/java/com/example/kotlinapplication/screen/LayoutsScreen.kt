package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun LayoutsScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            ZaCard(
                name = "Flex Layout",
                modifierPadding = PaddingValues(vertical = 24.dp),
                modifierTitle = Modifier.padding(horizontal = 16.dp),
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 1",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 2_1",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 2_2",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 3_1",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 3_2",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 3_3",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 4_1",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 4_2",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 4_3",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 4_4",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 5_1",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(2f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 5_2",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .background(LocalZaColors.current.layoutBackground)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Flex 5_3",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Grid Layout",
                modifierPadding = PaddingValues(vertical = 24.dp),
                modifierTitle = Modifier.padding(horizontal = 16.dp),
                trailing = {
                    Column(modifier = Modifier.border(1.dp, LocalZaColors.current.layoutBackground)) {
                        Row(modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min)) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "GRID",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            VerticalDivider(thickness = 1.dp, color = LocalZaColors.current.layoutBackground)


                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "GRID",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            VerticalDivider(thickness = 1.dp, color = LocalZaColors.current.layoutBackground)

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "GRID",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.layoutBackground)

                        Row(modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min)) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "GRID",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            VerticalDivider(thickness = 1.dp, color = LocalZaColors.current.layoutBackground)


                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "GRID",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }

                            VerticalDivider(thickness = 1.dp, color = LocalZaColors.current.layoutBackground)

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                                    .padding(12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "GRID",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXSmall
                                )
                            }
                        }
                    }
                }
            )
        }
    }
}