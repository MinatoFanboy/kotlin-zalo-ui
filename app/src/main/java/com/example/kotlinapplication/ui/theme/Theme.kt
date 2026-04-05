package com.example.kotlinapplication.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class ZaColorSchemes(
    val container: Color,
    val pageBackground1: Color,
    val pageBackground2: Color,
    val pageBackground3: Color,
    val uiBackground: Color,
    val uiBackgroundDisabled: Color,
    val uiBackgroundHighlighted: Color,
    val uiBackgroundPressed: Color,
    val uiBackgroundSelected: Color,
    val uiBackgroundTransparent: Color,
    val primary: Color,
    val secondary: Color,
    val secondaryHighlightPressed: Color,
    val secondaryDangerPressed: Color,
    val secondaryNeutralPressed: Color,
    val primarySecondaryText: Color,
    val selectionLabel: Color,
    val text1: Color,
    val text2: Color,
    val text3: Color,
    val text4: Color,
    val icon1: Color,
    val icon2: Color,
    val icon3: Color,
    val icon4: Color,
    val danger: Color,
    val dangerSecondary: Color,
    val dangerSecondaryText: Color,
    val tertiaryHighlightText: Color,
    val tertiaryDangerText: Color,
    val dangerPressed: Color,
    val tertiaryPressed: Color,
    val tertiaryDangerPressed: Color,
    val link1: Color,
    val link2: Color,
    val linkPressed: Color,
    val selected: Color,
    val selectedDisable: Color,
    val unSelectedDisable: Color,
    val unSelectedDisableBackground: Color,
    val supportError: Color,
    val supportSuccess: Color,
    val supportWarning: Color,
    val supportInformative: Color,
    val divider1: Color,
    val divider2: Color,
    val border1: Color,
    val border2: Color,
    val borderSelected: Color,
    val borderDanger: Color,
    val inputDisabled: Color,
    val sliderInactive: Color,
    val fabBackground: Color,
    val fabIcon: Color,
    val fabBorder: Color
)

data class ZaTypographySchemes(
    val headingXLarge: TextStyle,
    val textLarge: TextStyle,
    val textLargeM: TextStyle,
    val textXLargeM: TextStyle,
    val textNormal: TextStyle,
    val textNormalM: TextStyle,
    val textSmall: TextStyle,
    val textSmallM: TextStyle,
    val textXSmall: TextStyle,
    val textXSmallM: TextStyle,
    val textXXSmall: TextStyle,
    val textXXXSmallM: TextStyle,
    val titleLargeM: TextStyle,
    val titleNormal: TextStyle,
    val titleSmall: TextStyle,
)

private val DarkColorSchemes = ZaColorSchemes(
    container = neutralGray90,
    pageBackground1 = black100,
    pageBackground2 = neutralGray100,
    pageBackground3 = neutralGray90,
    uiBackground = neutralGray100,
    uiBackgroundDisabled = neutralGray80,
    uiBackgroundHighlighted = skyBlue100,
    uiBackgroundPressed = neutralGray80,
    uiBackgroundSelected = neutralGray90,
    uiBackgroundTransparent = black0,
    primary = blue60,
    primarySecondaryText = blue40,
    secondary = blue90,
    secondaryHighlightPressed = blue20,
    secondaryDangerPressed = red20,
    secondaryNeutralPressed = neutralGray90,
    /* Text */
    selectionLabel = blue40,
    text1 = neutralGray10,
    text2 = neutralGray50,
    text3 = neutralGray70,
    text4 = white100,
    /* Icon */
    icon1 = neutralGray10,
    icon2 = neutralGray50,
    icon3 = neutralGray70,
    icon4 = white100,
    /* Interactive */
    danger = red60,
    dangerSecondary = red90,
    dangerSecondaryText = red40,
    tertiaryHighlightText = blue50,
    tertiaryDangerText = red50,
    dangerPressed = red70,
    tertiaryPressed = blue30,
    tertiaryDangerPressed = red30,
    link1 = blue60,
    link2 = blue50,
    linkPressed = blue70,
    selected = blue60,
    selectedDisable = blue80,
    unSelectedDisable = Color(0xFF3D3D3D),
    unSelectedDisableBackground = white60,
    /* Support */
    supportError = red60,
    supportSuccess = green60,
    supportWarning = yellow60,
    supportInformative = blue60,
    /* Border & divider */
    divider1 = neutralGray80,
    divider2 = neutralGray70,
    border1 = neutralGray70,
    border2 = neutralGray60,
    borderSelected = blue60,
    borderDanger = red60,
    /** Input */
    inputDisabled = white10,
    /** Float Button */
    fabBackground = white100,
    fabBorder = black20,
    fabIcon = black100,
    /** Slider */
    sliderInactive = Color(0xFF575757),
)

private val LightColorSchemes = ZaColorSchemes(
    /* Background */
    container = white100,
    pageBackground1  = neutralGray20,
    pageBackground2 = white100,
    pageBackground3 = neutralGray10,
    uiBackground = white100,
    uiBackgroundDisabled = neutralGray30,
    uiBackgroundHighlighted = skyBlue10,
    uiBackgroundPressed = neutralGray20,
    uiBackgroundSelected = neutralGray10,
    uiBackgroundTransparent = white0,
    primary = blue60,
    secondary = blue20,
    primarySecondaryText = blue60,
    secondaryHighlightPressed = blue30,
    secondaryDangerPressed = red30,
    secondaryNeutralPressed = neutralGray30,
    /* Text */
    selectionLabel = blue70,
    text1 = neutralGray100,
    text2 = neutralGray60,
    text3 = neutralGray40,
    text4 = white100,
    /* Icon */
    icon1 = neutralGray100,
    icon2 = neutralGray60,
    icon3 = neutralGray40,
    icon4 = white100,
    /* Interactive */
    danger = red60,
    dangerSecondary = red20,
    dangerSecondaryText = red60,
    tertiaryHighlightText = blue60,
    tertiaryDangerText = red60,
    dangerPressed = red70,
    tertiaryPressed = blue10,
    tertiaryDangerPressed = red10,
    link1 = blue60,
    link2 = blue50,
    linkPressed = blue70,
    selected = blue60,
    selectedDisable = blue40,
    unSelectedDisable = Color(0xFFD3D6DA),
    unSelectedDisableBackground = white80,
    /* Support */
    supportError = red60,
    supportSuccess = green60,
    supportWarning = yellow60,
    supportInformative = blue70,
    /* Border & divider */
    divider1 = neutralGray20,
    divider2 = neutralGray30,
    border1 = neutralGray30,
    border2 = neutralGray40,
    borderSelected = blue60,
    borderDanger = red60,
    /** Input */
    inputDisabled = black10,
    /** Float Button */
    fabBackground = black100,
    fabBorder = white20,
    fabIcon = white100,
    /** Slider */
    sliderInactive = Color(0xFFC2C7CB),
)

private val AppTypography = ZaTypographySchemes(
    headingXLarge = TextStyle(
        fontFamily = AppFont,
        fontSize = 27.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 34.sp
    ),
    textLarge = TextStyle(
        fontFamily = AppFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 22.sp
    ),
    textLargeM = TextStyle(
        fontFamily = AppFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 22.sp
    ),
    textXLargeM = TextStyle(
        fontFamily = AppFont,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp
    ),
    textNormal = TextStyle(
        fontFamily = AppFont,
        fontSize = 15.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp
    ),
    textNormalM = TextStyle(
        fontFamily = AppFont,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp
    ),
    textSmall = TextStyle(
        fontFamily = AppFont,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 18.sp
    ),
    textSmallM = TextStyle(
        fontFamily = AppFont,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 18.sp
    ),
    textXSmall = TextStyle(
        fontFamily = AppFont,
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 18.sp
    ),
    textXSmallM = TextStyle(
        fontFamily = AppFont,
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 18.sp
    ),
    textXXSmall = TextStyle(
        fontFamily = AppFont,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 18.sp
    ),
    textXXXSmallM = TextStyle(
        fontFamily = AppFont,
        fontSize = 11.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 16.sp
    ),
    titleLargeM = TextStyle(
        fontFamily = AppFont,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 26.sp
    ),
    titleNormal = TextStyle(
        fontFamily = AppFont,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = AppFont,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp
    ),
)

val LocalZaColors = staticCompositionLocalOf {
    LightColorSchemes
}

val LocalZaTypography = staticCompositionLocalOf {
    AppTypography
}

/** Original color */
private val LightColorScheme = lightColorScheme()
private val DarkColorScheme = darkColorScheme()

@Composable
fun KotlinApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val zaColors = if (darkTheme) DarkColorSchemes else LightColorSchemes
    val zaTypography = AppTypography

    CompositionLocalProvider(LocalZaColors provides zaColors, LocalZaTypography provides zaTypography) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}
