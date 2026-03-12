package com.example.kotlinapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.R

val AppFont = FontFamily(
    Font(R.font.roboto_black, FontWeight.Black, FontStyle.Normal),
            Font(R.font.roboto_blackitalic, FontWeight.Black, FontStyle.Italic),
            Font(R.font.roboto_bold, FontWeight.Bold, FontStyle.Normal),
            Font(R.font.roboto_bolditalic, FontWeight.Bold, FontStyle.Italic),
            Font(R.font.roboto_extrabold, FontWeight.ExtraBold, FontStyle.Normal),
            Font(R.font.roboto_extrabolditalic, FontWeight.ExtraBold, FontStyle.Italic),
            Font(R.font.roboto_extralight, FontWeight.ExtraLight, FontStyle.Normal),
            Font(R.font.roboto_extralightitalic, FontWeight.ExtraLight, FontStyle.Italic),
            Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
            Font(R.font.roboto_light, FontWeight.Light, FontStyle.Normal),
            Font(R.font.roboto_lightitalic, FontWeight.Light, FontStyle.Italic),
            Font(R.font.roboto_medium, FontWeight.Medium, FontStyle.Normal),
            Font(R.font.roboto_mediumitalic, FontWeight.Medium, FontStyle.Italic),
            Font(R.font.roboto_regular, FontWeight.Normal, FontStyle.Normal),
            Font(R.font.roboto_semibold, FontWeight.SemiBold, FontStyle.Normal),
            Font(R.font.roboto_semibolditalic, FontWeight.SemiBold, FontStyle.Italic),
            Font(R.font.roboto_thin, FontWeight.Thin, FontStyle.Normal),
            Font(R.font.roboto_thinitalic, FontWeight.Thin, FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)