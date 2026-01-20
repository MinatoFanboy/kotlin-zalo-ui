package com.example.kotlinapplication.ui.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.model.ExpandableUiChild
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.neutralGray20
import com.example.kotlinapplication.ui.theme.red60

@Composable
fun ExpandableListItem(
    modifier: Modifier = Modifier,
    name: String,
    trailing: @Composable () -> Unit,
    children: List<ExpandableUiChild>
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Column {
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
                    expanded = !expanded
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

        AnimatedVisibility(visible = expanded) {
            Column(
                modifier = Modifier.padding(top = 8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
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
                        Box(modifier = Modifier.height(0.5.dp).fillMaxWidth().background(
                            red60
                        ))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExpandableListItem() {
    KotlinApplicationTheme {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .border(
                        width = 1.dp,
                        color = Color.Transparent,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .background(LocalZaColors.current.pageBackground3)
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Input Field",
                    color = LocalZaColors.current.text1,
                    style = LocalZaTypography.current.textNormalM,
                    modifier = Modifier.weight(1f)
                )

                ZaIcon("\uE988", color = blue60)
            }

            AnimatedVisibility(visible = false) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Details")
                }
            }
        }
    }
}