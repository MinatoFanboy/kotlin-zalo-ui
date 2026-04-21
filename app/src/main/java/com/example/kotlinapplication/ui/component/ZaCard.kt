package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60

@Composable
fun ZaCard(
    modifier: Modifier = Modifier,
    name: String? = null,
    subName: String? = null,
    highlightName: String? = null,
    description: Array<String>? = arrayOf(),
    space: Int = 16,
    trailing: @Composable () -> Unit,
    nameStyle: TextStyle? = null,
    nameHighlight: Boolean = false
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = Color.Transparent,
                shape = RoundedCornerShape(8.dp)
            )
            .background(LocalZaColors.current.pageBackground2)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(space.dp)
    ) {
        if (!name.isNullOrBlank() || !subName.isNullOrBlank()) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

                name?.takeIf { it.isNotBlank() }?.let {
                    Text(
                        it,
                        color = if (nameHighlight) blue60 else LocalZaColors.current.text1,
                        style = nameStyle ?: LocalZaTypography.current.titleSmall
                    )
                }

                subName?.takeIf { it.isNotBlank() }?.let {
                    Text(
                        it,
                        color = LocalZaColors.current.text2,
                        style = LocalZaTypography.current.textSmall
                    )
                }

                highlightName?.takeIf { it.isNotBlank() }?.let {
                    Text(
                        it,
                        color = LocalZaColors.current.selectionLabel,
                        style = LocalZaTypography.current.textXSmallM
                    )
                }

                description?.takeIf { it.isNotEmpty() }?.let {
                    if (it.size == 1) {
                        Text(
                            it[0],
                            color = LocalZaColors.current.text2,
                            style = LocalZaTypography.current.textSmall
                        )
                    } else {
                        it.forEach { item ->
                            Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier.width(20.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Box(modifier = Modifier
                                        .height(2.8.dp)
                                        .width(2.8.dp)
                                        .clip(RoundedCornerShape(3.dp))
                                        .background(LocalZaColors.current.text2))
                                }

                                Text(
                                    item,
                                    color = LocalZaColors.current.text2,
                                    style = LocalZaTypography.current.textSmall
                                )
                            }
                        }
                    }
                }
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
            trailing()
        }
    }
}