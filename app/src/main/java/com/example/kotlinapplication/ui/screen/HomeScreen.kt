package com.example.kotlinapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.kotlinapplication.ui.component.ExpandableListItem
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaIcon
import com.example.kotlinapplication.ui.model.ExpandableUiChild
import com.example.kotlinapplication.ui.navigation.Routes
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
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
                        ExpandableUiChild("Selection", onClick = {})
                    )
                )
            },
            nameStyle = LocalZaTypography.current.headingXLarge
        )
    }
}