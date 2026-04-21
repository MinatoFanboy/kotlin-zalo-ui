package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.pink60

@Composable
fun SpacingSystemScreen() {
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
                name = "U Spacing",
                trailing = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(22.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("Default = 4px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(20.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U2", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("8px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(18.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U3", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("12px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(16.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U4", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("16px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(14.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U5", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("20px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(12.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U6", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("24px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(10.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U7", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("28px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(8.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U8", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("32px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(6.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U9", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("36px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(LocalZaColors.current.radiusBackground)
                                .padding(4.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize().background(pink60))
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("U10", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)

                            Text("40px", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textSmall)
                        }
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SpacingSystemScreenPreview() {
    SpacingSystemScreen()
}