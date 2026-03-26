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
import androidx.compose.ui.Modifier
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
fun GlobalTokenColorScreen() {
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
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            "Neutral Gray",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG10",
                                color = neutralGray100,
                                background = neutralGray10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG20",
                                color = neutralGray100,
                                background = neutralGray20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG30",
                                color = neutralGray100,
                                background = neutralGray30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG40",
                                color = neutralGray100,
                                background = neutralGray40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG50",
                                color = neutralGray100,
                                background = neutralGray50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG60",
                                color = white100,
                                background = neutralGray60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG70",
                                color = white100,
                                background = neutralGray70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG80",
                                color = white100,
                                background = neutralGray80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG90",
                                color = white100,
                                background = neutralGray90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "NG100",
                                color = white100,
                                background = neutralGray100
                            )
                        }

                        Text(
                            "Blue",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B10",
                                color = neutralGray100,
                                background = blue10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B20",
                                color = neutralGray100,
                                background = blue20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B30",
                                color = neutralGray100,
                                background = blue30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B40",
                                color = neutralGray100,
                                background = blue40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B50",
                                color = neutralGray100,
                                background = blue50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B60",
                                color = white100,
                                background = blue60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B70",
                                color = white100,
                                background = blue70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B80",
                                color = white100,
                                background = blue80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B90",
                                color = white100,
                                background = blue90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "B100",
                                color = white100,
                                background = blue100
                            )
                        }

                        Text(
                            "Red",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R10",
                                color = neutralGray100,
                                background = red10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R20",
                                color = neutralGray100,
                                background = red20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R30",
                                color = neutralGray100,
                                background = red30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R40",
                                color = neutralGray100,
                                background = red40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R50",
                                color = neutralGray100,
                                background = red50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R60",
                                color = white100,
                                background = red60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R70",
                                color = white100,
                                background = red70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R80",
                                color = white100,
                                background = red80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R90",
                                color = white100,
                                background = red90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R100",
                                color = white100,
                                background = red100
                            )
                        }

                        Text(
                            "Yellow",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R10",
                                color = neutralGray100,
                                background = yellow10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "R20",
                                color = neutralGray100,
                                background = yellow20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y30",
                                color = neutralGray100,
                                background = yellow30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y40",
                                color = neutralGray100,
                                background = yellow40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y50",
                                color = neutralGray100,
                                background = yellow50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y60",
                                color = white100,
                                background = yellow60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y70",
                                color = white100,
                                background = yellow70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y80",
                                color = white100,
                                background = yellow80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y90",
                                color = white100,
                                background = yellow90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Y100",
                                color = white100,
                                background = yellow100
                            )
                        }

                        Text(
                            "Green",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G10",
                                color = neutralGray100,
                                background = green10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G20",
                                color = neutralGray100,
                                background = green20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G30",
                                color = neutralGray100,
                                background = green30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G40",
                                color = neutralGray100,
                                background = green40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G50",
                                color = neutralGray100,
                                background = green50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G60",
                                color = white100,
                                background = green60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G70",
                                color = white100,
                                background = green70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G80",
                                color = white100,
                                background = green80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G90",
                                color = white100,
                                background = green90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "G100",
                                color = white100,
                                background = green100
                            )
                        }

                        Text(
                            "Orange",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR10",
                                color = neutralGray100,
                                background = orange10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR20",
                                color = neutralGray100,
                                background = orange20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR30",
                                color = neutralGray100,
                                background = orange30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR40",
                                color = neutralGray100,
                                background = orange40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR50",
                                color = neutralGray100,
                                background = orange50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR60",
                                color = white100,
                                background = orange60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR70",
                                color = white100,
                                background = orange70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR80",
                                color = white100,
                                background = orange80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR90",
                                color = white100,
                                background = orange90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "OR100",
                                color = white100,
                                background = orange100
                            )
                        }

                        Text(
                            "Steel Blue",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST10",
                                color = neutralGray100,
                                background = steelBlue10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST20",
                                color = neutralGray100,
                                background = steelBlue20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST30",
                                color = neutralGray100,
                                background = steelBlue30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST40",
                                color = neutralGray100,
                                background = steelBlue40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST50",
                                color = neutralGray100,
                                background = steelBlue50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST60",
                                color = white100,
                                background = steelBlue60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST70",
                                color = white100,
                                background = steelBlue70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST80",
                                color = white100,
                                background = steelBlue80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST90",
                                color = white100,
                                background = steelBlue90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "ST100",
                                color = white100,
                                background = steelBlue100
                            )
                        }

                        Text(
                            "Teal",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL10",
                                color = neutralGray100,
                                background = teal10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL20",
                                color = neutralGray100,
                                background = teal20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL30",
                                color = neutralGray100,
                                background = teal30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL40",
                                color = neutralGray100,
                                background = teal40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL50",
                                color = neutralGray100,
                                background = teal50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL60",
                                color = white100,
                                background = teal60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL70",
                                color = white100,
                                background = teal70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL80",
                                color = white100,
                                background = teal80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL90",
                                color = white100,
                                background = teal90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "TL100",
                                color = white100,
                                background = teal100
                            )
                        }

                        Text(
                            "Purple",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU10",
                                color = neutralGray100,
                                background = purple10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU20",
                                color = neutralGray100,
                                background = purple20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU30",
                                color = neutralGray100,
                                background = purple30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU40",
                                color = neutralGray100,
                                background = purple40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU50",
                                color = neutralGray100,
                                background = purple50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU60",
                                color = white100,
                                background = purple60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU70",
                                color = white100,
                                background = purple70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU80",
                                color = white100,
                                background = purple80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU90",
                                color = white100,
                                background = purple90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PU100",
                                color = white100,
                                background = purple100
                            )
                        }

                        Text(
                            "Pink",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK10",
                                color = neutralGray100,
                                background = pink10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK20",
                                color = neutralGray100,
                                background = pink20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK30",
                                color = neutralGray100,
                                background = pink30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK40",
                                color = neutralGray100,
                                background = pink40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK50",
                                color = neutralGray100,
                                background = pink50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK60",
                                color = white100,
                                background = pink60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK70",
                                color = white100,
                                background = pink70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK80",
                                color = white100,
                                background = pink80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK90",
                                color = white100,
                                background = pink90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "PK100",
                                color = white100,
                                background = pink100
                            )
                        }

                        Text(
                            "Sky Blue",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK10",
                                color = neutralGray100,
                                background = skyBlue10
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK20",
                                color = neutralGray100,
                                background = skyBlue20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK30",
                                color = neutralGray100,
                                background = skyBlue30
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK40",
                                color = neutralGray100,
                                background = skyBlue40
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK50",
                                color = neutralGray100,
                                background = skyBlue50
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK60",
                                color = white100,
                                background = skyBlue60
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK70",
                                color = white100,
                                background = skyBlue70
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK80",
                                color = white100,
                                background = skyBlue80
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK90",
                                color = white100,
                                background = skyBlue90
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "SK100",
                                color = white100,
                                background = skyBlue100
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            "Black",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = white100,
                                background = black100,
                                box = true,
                                boxBackground = neutralGray20
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A90",
                                color = white100,
                                background = black90,
                                box = true,
                                boxBackground = neutralGray20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A80",
                                color = white100,
                                background = black80,
                                box = true,
                                boxBackground = neutralGray20
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A70",
                                color = white100,
                                background = black70,
                                box = true,
                                boxBackground = neutralGray20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A60",
                                color = white100,
                                background = black60,
                                box = true,
                                boxBackground = neutralGray20
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A50",
                                color = white100,
                                background = black50,
                                box = true,
                                boxBackground = neutralGray20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A40",
                                color = neutralGray100,
                                background = black40,
                                box = true,
                                boxBackground = neutralGray20
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A30",
                                color = neutralGray100,
                                background = black30,
                                box = true,
                                boxBackground = neutralGray20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A20",
                                color = neutralGray100,
                                background = black20,
                                box = true,
                                boxBackground = neutralGray20
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A10",
                                color = neutralGray100,
                                background = black10,
                                box = true,
                                boxBackground = neutralGray20
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A5",
                                color = neutralGray100,
                                background = black5,
                                box = true,
                                boxBackground = neutralGray20
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A0",
                                color = neutralGray100,
                                background = black0,
                                box = true,
                                boxBackground = neutralGray20
                            )
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            "White",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A100",
                                color = neutralGray100,
                                background = white100,
                                box = true,
                                boxBackground = neutralGray100
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A90",
                                color = neutralGray100,
                                background = white90,
                                box = true,
                                boxBackground = neutralGray100
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A80",
                                color = neutralGray100,
                                background = white80,
                                box = true,
                                boxBackground = neutralGray100
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A70",
                                color = neutralGray100,
                                background = white70,
                                box = true,
                                boxBackground = neutralGray100
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A60",
                                color = neutralGray100,
                                background = white60,
                                box = true,
                                boxBackground = neutralGray100
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A50",
                                color = neutralGray100,
                                background = white50,
                                box = true,
                                boxBackground = neutralGray100
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A40",
                                color = white100,
                                background = white40,
                                box = true,
                                boxBackground = neutralGray100
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A30",
                                color = white100,
                                background = white30,
                                box = true,
                                boxBackground = neutralGray100
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A20",
                                color = white100,
                                background = white20,
                                box = true,
                                boxBackground = neutralGray100
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A10",
                                color = white100,
                                background = white10,
                                box = true,
                                boxBackground = neutralGray100
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A5",
                                color = white100,
                                background = white5,
                                box = true,
                                boxBackground = neutralGray100
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "WHT_A0",
                                color = white100,
                                background = white0,
                                box = true,
                                boxBackground = neutralGray100
                            )
                        }
                    }
                }
            )
        }
    }
}