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
import com.example.kotlinapplication.ui.theme.black10
import com.example.kotlinapplication.ui.theme.black100
import com.example.kotlinapplication.ui.theme.black20
import com.example.kotlinapplication.ui.theme.black30
import com.example.kotlinapplication.ui.theme.black40
import com.example.kotlinapplication.ui.theme.black5
import com.example.kotlinapplication.ui.theme.black50
import com.example.kotlinapplication.ui.theme.black60
import com.example.kotlinapplication.ui.theme.black70
import com.example.kotlinapplication.ui.theme.black80
import com.example.kotlinapplication.ui.theme.black90
import com.example.kotlinapplication.ui.theme.blue10
import com.example.kotlinapplication.ui.theme.blue100
import com.example.kotlinapplication.ui.theme.blue20
import com.example.kotlinapplication.ui.theme.blue30
import com.example.kotlinapplication.ui.theme.blue40
import com.example.kotlinapplication.ui.theme.blue50
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.blue70
import com.example.kotlinapplication.ui.theme.blue80
import com.example.kotlinapplication.ui.theme.blue90
import com.example.kotlinapplication.ui.theme.green10
import com.example.kotlinapplication.ui.theme.green100
import com.example.kotlinapplication.ui.theme.green20
import com.example.kotlinapplication.ui.theme.green30
import com.example.kotlinapplication.ui.theme.green40
import com.example.kotlinapplication.ui.theme.green50
import com.example.kotlinapplication.ui.theme.green60
import com.example.kotlinapplication.ui.theme.green70
import com.example.kotlinapplication.ui.theme.green80
import com.example.kotlinapplication.ui.theme.green90
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
import com.example.kotlinapplication.ui.theme.orange10
import com.example.kotlinapplication.ui.theme.orange100
import com.example.kotlinapplication.ui.theme.orange20
import com.example.kotlinapplication.ui.theme.orange30
import com.example.kotlinapplication.ui.theme.orange40
import com.example.kotlinapplication.ui.theme.orange50
import com.example.kotlinapplication.ui.theme.orange60
import com.example.kotlinapplication.ui.theme.orange70
import com.example.kotlinapplication.ui.theme.orange80
import com.example.kotlinapplication.ui.theme.orange90
import com.example.kotlinapplication.ui.theme.pink10
import com.example.kotlinapplication.ui.theme.pink100
import com.example.kotlinapplication.ui.theme.pink20
import com.example.kotlinapplication.ui.theme.pink30
import com.example.kotlinapplication.ui.theme.pink40
import com.example.kotlinapplication.ui.theme.pink50
import com.example.kotlinapplication.ui.theme.pink60
import com.example.kotlinapplication.ui.theme.pink70
import com.example.kotlinapplication.ui.theme.pink80
import com.example.kotlinapplication.ui.theme.pink90
import com.example.kotlinapplication.ui.theme.purple10
import com.example.kotlinapplication.ui.theme.purple100
import com.example.kotlinapplication.ui.theme.purple20
import com.example.kotlinapplication.ui.theme.purple30
import com.example.kotlinapplication.ui.theme.purple40
import com.example.kotlinapplication.ui.theme.purple50
import com.example.kotlinapplication.ui.theme.purple60
import com.example.kotlinapplication.ui.theme.purple70
import com.example.kotlinapplication.ui.theme.purple80
import com.example.kotlinapplication.ui.theme.purple90
import com.example.kotlinapplication.ui.theme.red10
import com.example.kotlinapplication.ui.theme.red100
import com.example.kotlinapplication.ui.theme.red20
import com.example.kotlinapplication.ui.theme.red30
import com.example.kotlinapplication.ui.theme.red40
import com.example.kotlinapplication.ui.theme.red50
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.ui.theme.red70
import com.example.kotlinapplication.ui.theme.red80
import com.example.kotlinapplication.ui.theme.red90
import com.example.kotlinapplication.ui.theme.skyBlue10
import com.example.kotlinapplication.ui.theme.skyBlue100
import com.example.kotlinapplication.ui.theme.skyBlue20
import com.example.kotlinapplication.ui.theme.skyBlue30
import com.example.kotlinapplication.ui.theme.skyBlue40
import com.example.kotlinapplication.ui.theme.skyBlue50
import com.example.kotlinapplication.ui.theme.skyBlue60
import com.example.kotlinapplication.ui.theme.skyBlue70
import com.example.kotlinapplication.ui.theme.skyBlue80
import com.example.kotlinapplication.ui.theme.skyBlue90
import com.example.kotlinapplication.ui.theme.steelBlue10
import com.example.kotlinapplication.ui.theme.steelBlue100
import com.example.kotlinapplication.ui.theme.steelBlue20
import com.example.kotlinapplication.ui.theme.steelBlue30
import com.example.kotlinapplication.ui.theme.steelBlue40
import com.example.kotlinapplication.ui.theme.steelBlue50
import com.example.kotlinapplication.ui.theme.steelBlue60
import com.example.kotlinapplication.ui.theme.steelBlue70
import com.example.kotlinapplication.ui.theme.steelBlue80
import com.example.kotlinapplication.ui.theme.steelBlue90
import com.example.kotlinapplication.ui.theme.teal10
import com.example.kotlinapplication.ui.theme.teal100
import com.example.kotlinapplication.ui.theme.teal20
import com.example.kotlinapplication.ui.theme.teal30
import com.example.kotlinapplication.ui.theme.teal40
import com.example.kotlinapplication.ui.theme.teal50
import com.example.kotlinapplication.ui.theme.teal60
import com.example.kotlinapplication.ui.theme.teal70
import com.example.kotlinapplication.ui.theme.teal80
import com.example.kotlinapplication.ui.theme.teal90
import com.example.kotlinapplication.ui.theme.white0
import com.example.kotlinapplication.ui.theme.white10
import com.example.kotlinapplication.ui.theme.white100
import com.example.kotlinapplication.ui.theme.white20
import com.example.kotlinapplication.ui.theme.white30
import com.example.kotlinapplication.ui.theme.white40
import com.example.kotlinapplication.ui.theme.white5
import com.example.kotlinapplication.ui.theme.white50
import com.example.kotlinapplication.ui.theme.white60
import com.example.kotlinapplication.ui.theme.white70
import com.example.kotlinapplication.ui.theme.white80
import com.example.kotlinapplication.ui.theme.white90
import com.example.kotlinapplication.ui.theme.yellow10
import com.example.kotlinapplication.ui.theme.yellow100
import com.example.kotlinapplication.ui.theme.yellow20
import com.example.kotlinapplication.ui.theme.yellow30
import com.example.kotlinapplication.ui.theme.yellow40
import com.example.kotlinapplication.ui.theme.yellow50
import com.example.kotlinapplication.ui.theme.yellow60
import com.example.kotlinapplication.ui.theme.yellow70
import com.example.kotlinapplication.ui.theme.yellow80
import com.example.kotlinapplication.ui.theme.yellow90

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