package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.component.ZaButton
import com.example.kotlinapplication.ui.component.ZaButtonLevel
import com.example.kotlinapplication.ui.component.ZaButtonSize
import com.example.kotlinapplication.ui.component.ZaButtonType
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ButtonScreen() {
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
                name = "Level",
                subName = "Có 3 level button cơ bản: Primary, Secondary, Tertiary",
                space = 24,
                trailing = {
                    Text(
                        "Primary",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {})

                    Text(
                        "Secondary",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, level = ZaButtonLevel.Secondary)

                    Text(
                        "Tertiary",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, level = ZaButtonLevel.Tertiary)
                }
            )
        }

        item {
            ZaCard(
                name = "Type Primary / Secondary / Tertiary",
                space = 24,
                trailing = {
                    Text(
                        "Highlight",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        ZaButton(onClick = {})

                        ZaButton(onClick = {}, level = ZaButtonLevel.Secondary)
                    }

                    ZaButton(onClick = {}, level = ZaButtonLevel.Tertiary)

                    Text(
                        "Danger",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        ZaButton(onClick = {}, type = ZaButtonType.Danger)

                        ZaButton(
                            onClick = {},
                            level = ZaButtonLevel.Secondary,
                            type = ZaButtonType.Danger
                        )
                    }

                    ZaButton(
                        onClick = {},
                        level = ZaButtonLevel.Tertiary,
                        type = ZaButtonType.Danger
                    )

                    Text(
                        "Neutral",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        ZaButton(onClick = {}, type = ZaButtonType.Neutral)

                        ZaButton(
                            onClick = {},
                            level = ZaButtonLevel.Secondary,
                            type = ZaButtonType.Neutral
                        )
                    }

                    ZaButton(
                        onClick = {},
                        level = ZaButtonLevel.Tertiary,
                        type = ZaButtonType.Neutral
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Size",
                space = 24,
                trailing = {
                    Text(
                        "Large",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {})

                    Text(
                        "Medium",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, size = ZaButtonSize.Medium)

                    Text(
                        "Small",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, size = ZaButtonSize.Small)

                    Text(
                        "Full-width",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, fullWidth = true)

                }
            )
        }

        item {
            ZaCard(
                name = "Anatomy",
                space = 24,
                trailing = {
                    Text(
                        "Nút với biểu tượng ở đầu",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, iconPrefix = "\uE9FE")

                    Text(
                        "Mút vơ biểu tượng ở sau",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, iconSuffix = "\uE913")

                    Text(
                        "Nút",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {})

                    Text(
                        "Nút biểu tượng",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, iconPrefix = "\uE9FE", label = "")
                }
            )
        }

        item {
            ZaCard(
                name = "Primary State",
                space = 24,
                trailing = {
                    Text(
                        "Default",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {})

                    Text(
                        "Pressed",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, defaultPressed = true)

                    Text(
                        "Loading",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, loading = true)

                    Text(
                        "Disabled",
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textXXSmall.copy(
                            lineHeight = 16.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    ZaButton(onClick = {}, enabled = false)
                }
            )
        }
    }
}