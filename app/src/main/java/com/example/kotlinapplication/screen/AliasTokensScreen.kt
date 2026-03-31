package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.component.ZaBoxColor
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.black0
import com.example.kotlinapplication.ui.theme.black100
import com.example.kotlinapplication.ui.theme.blue40
import com.example.kotlinapplication.ui.theme.blue50
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.blue70
import com.example.kotlinapplication.ui.theme.green60
import com.example.kotlinapplication.ui.theme.neutralGray10
import com.example.kotlinapplication.ui.theme.neutralGray100
import com.example.kotlinapplication.ui.theme.neutralGray20
import com.example.kotlinapplication.ui.theme.neutralGray30
import com.example.kotlinapplication.ui.theme.neutralGray40
import com.example.kotlinapplication.ui.theme.neutralGray50
import com.example.kotlinapplication.ui.theme.neutralGray60
import com.example.kotlinapplication.ui.theme.neutralGray70
import com.example.kotlinapplication.ui.theme.neutralGray80
import com.example.kotlinapplication.ui.theme.neutralGray90
import com.example.kotlinapplication.ui.theme.red50
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.ui.theme.red70
import com.example.kotlinapplication.ui.theme.skyBlue10
import com.example.kotlinapplication.ui.theme.skyBlue100
import com.example.kotlinapplication.ui.theme.white0
import com.example.kotlinapplication.ui.theme.white100
import com.example.kotlinapplication.ui.theme.yellow60

@Composable
fun AliasTokensScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            Text(
                "Naming convention: lowercase + underscore", color = LocalZaColors.current.text1,
                style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
            )
        }

        item {
            ZaCard(
                name = "Background",
                space = 12,
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                "TOKEN",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "LIGHT THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "DARK THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "page_background_01",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG20",
                                color = neutralGray100,
                                background = neutralGray20,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "BLK_A100",
                                color = white100,
                                background = black100
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "page_background_02",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG100",
                                color = white100,
                                background = neutralGray100
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "page_background_03",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG10",
                                color = neutralGray100,
                                background = neutralGray10,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG90",
                                color = white100,
                                background = neutralGray90
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "container",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG90",
                                color = white100,
                                background = neutralGray90
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "ui_background",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG100",
                                color = white100,
                                background = neutralGray100
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "ui_background_pressed",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG20",
                                color = neutralGray100,
                                background = neutralGray20,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG80",
                                color = white100,
                                background = neutralGray80
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "ui_background_selected",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG10",
                                color = neutralGray100,
                                background = neutralGray10,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG90",
                                color = white100,
                                background = neutralGray90
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "ui_background_highlighted",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SKB10",
                                color = neutralGray100,
                                background = skyBlue10,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SKB100",
                                color = white100,
                                background = skyBlue100
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "ui_background_disabled",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG30",
                                color = neutralGray100,
                                background = neutralGray30,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG80",
                                color = white100,
                                background = neutralGray80
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "ui_background_transparent",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A0",
                                borderColor = LocalZaColors.current.divider1,
                                color = LocalZaColors.current.text1,
                                background = white0,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "BLK_A0",
                                borderColor = LocalZaColors.current.divider1,
                                color = LocalZaColors.current.text1,
                                background = black0
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Text",
                space = 12,
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                "TOKEN",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "LIGHT THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "DARK THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "text_01",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG100",
                                color = white100,
                                background = neutralGray100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG10",
                                color = neutralGray100,
                                background = neutralGray10
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "text_02",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG60",
                                color = white100,
                                background = neutralGray60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG50",
                                color = neutralGray100,
                                background = neutralGray50
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "text_03",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG40",
                                color = white100,
                                background = neutralGray40,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG70",
                                color = neutralGray100,
                                background = neutralGray70
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "text_04",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "section_label",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "...",
                                color = white100,
                                background = blue70,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "...",
                                color = neutralGray100,
                                background = blue40
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Icon",
                space = 12,
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                "TOKEN",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "LIGHT THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "DARK THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "icon_01",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG100",
                                color = white100,
                                background = neutralGray100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG10",
                                color = neutralGray100,
                                background = neutralGray10
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "icon_02",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG60",
                                color = white100,
                                background = neutralGray60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG50",
                                color = neutralGray100,
                                background = neutralGray50
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "icon_03",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG40",
                                color = white100,
                                background = neutralGray40,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG70",
                                color = neutralGray100,
                                background = neutralGray70
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "icon_04",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                borderColor = neutralGray20,
                                background = white100
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Interactive",
                space = 12,
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                "TOKEN",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "LIGHT THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "DARK THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "danger",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "danger_pressed",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R70",
                                color = white100,
                                background = red70,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R50",
                                color = white100,
                                background = red50
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "link_01",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "link_02",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B50",
                                color = white100,
                                background = blue50,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B50",
                                color = white100,
                                background = blue50
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "link_pressed",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B70",
                                color = white100,
                                background = blue70,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B70",
                                color = white100,
                                background = blue70
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "selected",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Support",
                space = 12,
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                "TOKEN",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "LIGHT THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "DARK THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "support_error",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "support_success",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "GR60",
                                color = white100,
                                background = green60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "GR60",
                                color = white100,
                                background = green60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "support_warning",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y60",
                                color = white100,
                                background = yellow60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y60",
                                color = white100,
                                background = yellow60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "support_infomative",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B70",
                                color = white100,
                                background = blue70,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Border & Divider",
                space = 12,
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                "TOKEN",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "LIGHT THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Text(
                                "DARK THEME",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )
                        }

                        HorizontalDivider(thickness = 1.dp, color = LocalZaColors.current.divider1)

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "divider_01",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG20",
                                color = neutralGray100,
                                background = neutralGray20,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG80",
                                color = white100,
                                background = neutralGray80
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "divider_02",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG30",
                                color = neutralGray100,
                                background = neutralGray30,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG70",
                                color = white100,
                                background = neutralGray70
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "border_01",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG30",
                                color = neutralGray100,
                                background = neutralGray30,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG70",
                                color = white100,
                                background = neutralGray70
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "border_02",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG40",
                                color = neutralGray100,
                                background = neutralGray40,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG60",
                                color = white100,
                                background = neutralGray60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "border_selected",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "border_danger",
                                modifier = Modifier.weight(1f),
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60,
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60
                            )
                        }
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AliasTokensScreenPreview() {
    AliasTokensScreen()
}