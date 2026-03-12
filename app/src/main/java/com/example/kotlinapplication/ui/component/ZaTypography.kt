package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.AppFont
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue10
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.green10
import com.example.kotlinapplication.ui.theme.green60

enum class ZaTypographyType {
    TokenSize,
    TextStyle,
}

@Composable
fun ZaTypography(
    modifier: Modifier = Modifier,
    name: String = "",
    text: String = "",
    fontSize: Int = 14,
    fontWeight: FontWeight? = null,
    lineHeight: Int = 18,
    type: ZaTypographyType
) {
    Column(modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Box(
            modifier = Modifier
                .height(26.dp)
                .width(74.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(if (type == ZaTypographyType.TokenSize) blue10 else green10),
            contentAlignment = Alignment.Center
        ) {
            Text(
                name,
                color = if (type == ZaTypographyType.TokenSize) blue60 else green60,
                style = LocalZaTypography.current.textSmallM,
            )
        }

        Text(text, fontFamily = AppFont, fontSize = fontSize.sp, fontWeight = fontWeight, lineHeight = lineHeight.sp)

        Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
            Text(
                "Size: $fontSize",
                color = LocalZaColors.current.text2,
                style = LocalZaTypography.current.textSmall
            )

            Text(
                "Line height: $lineHeight",
                color = LocalZaColors.current.text2,
                style = LocalZaTypography.current.textSmall
            )
        }
    }
}