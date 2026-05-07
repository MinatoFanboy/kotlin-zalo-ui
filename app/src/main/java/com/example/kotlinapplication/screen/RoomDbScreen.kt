package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.SubcomposeAsyncImage
import com.example.kotlinapplication.screen.viewmodel.LocalViewModel
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaListItem
import com.example.kotlinapplication.ui.component.ZaTodoShimmer
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun RoomDbScreen(localViewModel: LocalViewModel = hiltViewModel()) {
    val res = localViewModel.state.value

    LaunchedEffect(Unit) {
        localViewModel.getTodos()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        when {
            res.isLoading -> {
                item {
                    ZaTodoShimmer()
                }

                item {
                    ZaTodoShimmer()
                }

                item {
                    ZaTodoShimmer()
                }
            }

            res.todos.isEmpty() -> {
                item {
                    ZaCard(
                        name = "Todos",
                        subName = "No records exists",
                        trailing = {}
                    )
                }
            }

            else -> {
                res.todos.forEach { item ->
                    item {
                        ZaCard(
                            trailing = {
                                SubcomposeAsyncImage(
                                    model = item.localImagePath,
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp)),
                                    loading = {},
                                    error = {
                                        Text(text = "Error loading image")
                                    }
                                )

                                ZaListItem(
                                    contentModifier = Modifier.padding(end = 16.dp),
                                    icon = {
                                        Box(
                                            modifier = Modifier.size(56.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                "#" + item.id,
                                                color = LocalZaColors.current.text2,
                                                style = LocalZaTypography.current.textSmall,
                                            )
                                        }
                                    },
                                    title = item.title,
                                    subTitle = item.body
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}