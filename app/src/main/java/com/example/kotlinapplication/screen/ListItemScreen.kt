package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaIcon
import com.example.kotlinapplication.ui.component.ZaListItem
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun ListItemScreen() {
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
                    ZaListItem(
                        contentModifier = Modifier.padding(horizontal = 16.dp),
                        title = "Title",
                        trailing = {
                            ZaIcon(
                                "\uE947",
                                color = LocalZaColors.current.text1,
                                size = 16.sp,
                                modifier = Modifier.padding(start = 16.dp)
                            )
                        }
                    )

                    ZaListItem(
                        icon = {
                            Box(modifier = Modifier.size(56.dp), contentAlignment = Alignment.Center) {
                                ZaIcon(
                                    "\uEA5C",
                                    color = LocalZaColors.current.text2,
                                )
                            }
                        },
                        title = "Sample  text title",
                        trailing = {
                            ZaIcon(
                                "\uE941",
                                color = LocalZaColors.current.primary,
                                size = 24.sp,
                                modifier = Modifier.padding(start = 16.dp)
                            )
                        },
                        contentModifier = Modifier.padding(end = 16.dp)
                    )

                    ZaListItem(
                        contentModifier = Modifier.padding(horizontal = 16.dp),
                        title = "Title",
                        subTitle = "Subtitle",
                        trailing = {
                            ZaIcon(
                                "\uE947",
                                color = LocalZaColors.current.text1,
                                size = 16.sp,
                                modifier = Modifier.padding(start = 16.dp)
                            )
                        }
                    )

                    ZaListItem(
                        icon = {
                            Box(modifier = Modifier.size(56.dp), contentAlignment = Alignment.Center) {
                                ZaIcon(
                                    "\uE9C5",
                                    color = LocalZaColors.current.text2,
                                )
                            }
                        },
                        title = "Title",
                    )

                    ZaListItem(
                        contentModifier = Modifier.padding(horizontal = 16.dp),
                        title = "Title",
                        hint = "Bracket"
                    )

                    ZaListItem(
                        contentModifier = Modifier.padding(horizontal = 16.dp),
                        title = "Title",
                        subTitle = "Subtitle"
                    )

                    ZaListItem(
                        contentModifier = Modifier.padding(horizontal = 16.dp),
                        title = "Title",
                        hint = "Bracket"
                    )
                }
            )
        }
    }
}