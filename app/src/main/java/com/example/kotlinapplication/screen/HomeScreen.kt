package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.kotlinapplication.ui.component.ExpandableListItem
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaIcon
import com.example.kotlinapplication.model.ExpandableUiChild
import com.example.kotlinapplication.navigation.Routes
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.purple60
import com.example.kotlinapplication.ui.theme.skyBlue60

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navHostController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground1)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {


        item {
            ZaCard(
                name = "ZaUI",
                subName = "Zalo Mini Program Framework là thư viện thiết kế cơ bản phù hợp với trải nghiêm của Zalo",
                trailing = {
                    ExpandableListItem(
                        name = "Input Field",
                        trailing = {
                            ZaIcon("\uE988", color = blue60, size = 24.sp)
                        },
                        children = listOf(
                            ExpandableUiChild("Forms Input", onClick = {
                                navHostController.navigate(Routes.FormsInputScreen)
                            }),
                            ExpandableUiChild("Selection", onClick = {
                                navHostController.navigate(Routes.SelectionScreen)
                            }),
                            ExpandableUiChild("Time Picker", onClick = {
                                navHostController.navigate(Routes.TimePickerScreen)
                            }),
                            ExpandableUiChild("List Item", onClick = {
                                navHostController.navigate(Routes.ListItemScreen)
                            })
                        )
                    )

                    ExpandableListItem(
                        name = "Typography",
                        trailing = {
                            ZaIcon("\uE978", color = skyBlue60, size = 24.sp)
                        },
                        children = listOf(
                            ExpandableUiChild("Token Size", onClick = {
                                navHostController.navigate(Routes.TokenSizeScreen)
                            }),
                            ExpandableUiChild("Text Style", onClick = {
                                navHostController.navigate(Routes.TextStyleScreen)
                            })
                        )
                    )

                    ExpandableListItem(
                        name = "Colors",
                        trailing = {
                            ZaIcon("\uEA40", color = purple60, size = 24.sp)
                        },
                        children = listOf(
                            ExpandableUiChild("Global Token Color", onClick = {
                                navHostController.navigate(Routes.GlobalTokenColorScreen)
                            }),
                            ExpandableUiChild("Gradients", onClick = {
                                navHostController.navigate(Routes.GradientScreen)
                            }),
                            ExpandableUiChild("Alias Tokens Color", onClick = {
                                navHostController.navigate(Routes.AliasTokensScreen)
                            })
                        )
                    )

                    ExpandableListItem(
                        name = "Sheet & Modal",
                        trailing = {
                            ZaIcon("\uEA40", color = purple60, size = 24.sp)
                        },
                        onClick = {
                            navHostController.navigate(Routes.SheetAndModalScreen)
                        }
                    )
                },
                nameStyle = LocalZaTypography.current.headingXLarge
            )
        }
    }
}