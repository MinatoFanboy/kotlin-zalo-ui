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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.component.ZaBoxColor
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.black0
import com.example.kotlinapplication.ui.theme.black10
import com.example.kotlinapplication.ui.theme.black50
import com.example.kotlinapplication.ui.theme.blue40
import com.example.kotlinapplication.ui.theme.blue50
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.green40
import com.example.kotlinapplication.ui.theme.green50
import com.example.kotlinapplication.ui.theme.green60
import com.example.kotlinapplication.ui.theme.neutralGray100
import com.example.kotlinapplication.ui.theme.orange50
import com.example.kotlinapplication.ui.theme.orange60
import com.example.kotlinapplication.ui.theme.pink30
import com.example.kotlinapplication.ui.theme.pink40
import com.example.kotlinapplication.ui.theme.pink60
import com.example.kotlinapplication.ui.theme.purple40
import com.example.kotlinapplication.ui.theme.purple60
import com.example.kotlinapplication.ui.theme.purple70
import com.example.kotlinapplication.ui.theme.red50
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.ui.theme.skyBlue50
import com.example.kotlinapplication.ui.theme.skyBlue60
import com.example.kotlinapplication.ui.theme.white0
import com.example.kotlinapplication.ui.theme.white100
import com.example.kotlinapplication.ui.theme.white20
import com.example.kotlinapplication.ui.theme.yellow50
import com.example.kotlinapplication.ui.theme.yellow60


@Composable
fun GradientScreen() {
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
                            "B60B50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(blue50, blue60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(blue60, blue50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(blue60, blue50),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "B60B40",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(blue40, blue60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(blue60, blue40)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(blue60, blue40),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "B60SKB50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(skyBlue50, blue60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(blue60, skyBlue50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(blue60, skyBlue50),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "SKB60GR50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(green50, skyBlue60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(skyBlue60, green50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(skyBlue60, green50),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "GR60GR40",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(green40, green60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(green60, green40)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(green60, green40),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "GR60Y50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(yellow50, green60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(green60, yellow50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(green60, yellow50),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "OR60Y60",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(yellow60, orange60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(orange60, yellow60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(orange60, yellow60),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "R60O50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(orange50, red60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(red60, orange50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(red60, orange50),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "PU60B50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(blue50, purple60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(purple60, blue50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(purple60, blue50),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "PU70PU40",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(purple40, purple70)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(purple70, purple40)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(purple70, purple40),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "PU60PK30",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(pink30, purple60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(purple60, pink30)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(purple60, pink30),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "PK60PK30",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(pink30, pink60)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(pink60, pink30)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(pink60, pink30),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "R50PK40",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Vertical",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(pink40, red50)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Horizontal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(red50, pink40)
                                    )
                                )
                            )

                            ZaBoxColor(
                                modifier = Modifier.weight(1f),
                                name = "Diagonal",
                                color = white100,
                                gradient = true,
                                gradientModifier = Modifier.background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(red50, pink40),
                                        start = Offset(0f, Float.POSITIVE_INFINITY),
                                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                                    )
                                )
                            )
                        }

                        Text(
                            "BLK_A0A50",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        ZaBoxColor(
                            name = "Vertical",
                            color = white100,
                            gradient = true,
                            gradientModifier = Modifier.background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(black50, black0)
                                )
                            )
                        )

                        Text(
                            "BLK_A50A0",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        ZaBoxColor(
                            name = "Vertical",
                            color = white100,
                            gradient = true,
                            gradientModifier = Modifier.background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(black0, black50)
                                )
                            )
                        )

                        Text(
                            "BLK_A0A10",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        ZaBoxColor(
                            name = "Vertical",
                            color = neutralGray100,
                            gradient = true,
                            gradientModifier = Modifier.background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(black10, black0)
                                )
                            )
                        )

                        Text(
                            "BLK_A10A0",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        ZaBoxColor(
                            name = "Vertical",
                            color = neutralGray100,
                            gradient = true,
                            gradientModifier = Modifier.background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(black0, black10)
                                )
                            )
                        )

                        Text(
                            "WHT_A0A20",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        ZaBoxColor(
                            name = "Vertical",
                            color = white100,
                            box = true,
                            boxBackground = neutralGray100,
                            gradient = true,
                            gradientModifier = Modifier.background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(white20, white0)
                                )
                            )
                        )

                        Text(
                            "WHT_A20A0",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXSmall.copy(fontSize = 12.sp)
                        )

                        ZaBoxColor(
                            name = "Vertical",
                            color = white100,
                            box = true,
                            boxBackground = neutralGray100,
                            gradient = true,
                            gradientModifier = Modifier.background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(white0, white20)
                                )
                            )
                        )
                    }
                }
            )
        }
    }
}