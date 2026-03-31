package com.example.kotlinapplication.ui.component

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.model.ExpandableUiChild
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ExpandableListItem(
    modifier: Modifier = Modifier,
    name: String,
    trailing: @Composable () -> Unit,
    children: List<ExpandableUiChild> = emptyList(),
    onClick: (() -> Unit)? = null
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier.animateContentSize()
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    width = 1.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(LocalZaColors.current.pageBackground3)
                .clickable {
                    if (onClick != null) {
                        onClick()
                    } else {
                        expanded = !expanded
                    }
                }
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                name,
                color = LocalZaColors.current.text1,
                style = LocalZaTypography.current.textNormalM,
                modifier = Modifier.weight(1f)
            )

            trailing()
        }

        if (expanded) {
            Column(
                modifier = Modifier.padding(top = 8.dp),
            ) {
                children.forEachIndexed { index, it ->
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .border(
                                width = 1.dp,
                                color = Color.Transparent,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clickable {
                                it.onClick?.invoke()
                            }
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            it.name,
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textNormalM,
                            modifier = Modifier.weight(1f)
                        )

                        ZaIcon("\uE947", color = LocalZaColors.current.text1)
                    }

                    if (index != children.lastIndex) {
                        HorizontalDivider(thickness = Dp.Hairline, color = LocalZaColors.current.divider1)
                        Spacer(Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}