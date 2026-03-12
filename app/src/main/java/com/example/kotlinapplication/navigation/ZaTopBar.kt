package com.example.kotlinapplication.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaIcon
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.black20
import com.example.kotlinapplication.ui.theme.neutralGray100
import com.example.kotlinapplication.ui.theme.white100
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ZaTopBar(
    title: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    isDarkTheme: Boolean = false
) {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setSystemBarsColor(
            color = if (isDarkTheme) neutralGray100 else white100
        )
    }

    Row(modifier = modifier
        .fillMaxWidth()
        .background(LocalZaColors.current.pageBackground2)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = onBackClick) {
                ZaIcon("\uE946", color = LocalZaColors.current.text1)
            }

            Text(
                text = title,
                style = LocalZaTypography.current.titleNormal,
                modifier = Modifier.weight(1f)
            )

            Row(
                modifier = Modifier
                    .height(32.dp)
                    .width(82.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        width = Dp.Hairline,
                        color = Color(0x80979797),
                        shape = RoundedCornerShape(16.dp)
                    ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBackClick, modifier = Modifier.size(28.dp).padding(end = 4.5.dp)) {
                    ZaIcon("\uE9C6", color = LocalZaColors.current.text1)
                }

                Box(modifier = Modifier
                    .height(19.dp)
                    .width(Dp.Hairline)
                    .background(black20)
                )

                IconButton(onClick = onBackClick, modifier = Modifier.size(28.dp).padding(start = 4.5.dp)) {
                    ZaIcon("\uE953", color = LocalZaColors.current.text1)
                }
            }
        }
    }
}
