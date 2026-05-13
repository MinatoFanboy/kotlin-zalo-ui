package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kotlinapplication.ui.component.ZaButton
import com.example.kotlinapplication.ui.component.ZaButtonLevel
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun SnackbarScreen(viewModel: SnackbarViewModel = hiltViewModel()) {
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
                name = "Snackbar",
                trailing = {
                    ZaButton(
                        label = "Default with Action",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Text Only",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Vertical Action",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Default Top",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Error",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Success",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Warning",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Loading",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Countdown",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Download",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Connect Wifi",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )

                    ZaButton(
                        label = "Disconnect Wifi",
                        level = ZaButtonLevel.Secondary,
                        onClick = {
                            viewModel.showSnackbar("Informative")
                        }
                    )
                }
            )
        }
    }
}