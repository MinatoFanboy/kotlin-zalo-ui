package com.example.kotlinapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.R
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaImageViewer
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography

@Composable
fun ImageViewerScreen() {
    val interactionSource = remember { MutableInteractionSource() }
    var showViewer by remember { mutableStateOf(false) }

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
                name = "Usage",
                subName = "Khi cần xem và tương tác với hình ảnh trên kích thước lớn hơn",
                trailing = {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                            text = "Example",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.titleSmall
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clickable(
                                        onClick = {},
                                        role = Role.Button,
                                        interactionSource = interactionSource,
                                        indication = null,
                                    )
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.viewer_1),
                                    contentDescription = "My Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxWidth().aspectRatio(1f/1f)
                                )
                            }

                            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                                Image(
                                    painter = painterResource(id = R.drawable.viewer_1),
                                    contentDescription = "My Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxWidth().aspectRatio(1f/1f)
                                )
                            }

                            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                                Image(
                                    painter = painterResource(id = R.drawable.viewer_1),
                                    contentDescription = "My Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxWidth().aspectRatio(1f/1f)
                                )
                            }

                            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                                Image(
                                    painter = painterResource(id = R.drawable.viewer_1),
                                    contentDescription = "My Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxWidth().aspectRatio(1f/1f)
                                )
                            }

                            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                                Image(
                                    painter = painterResource(id = R.drawable.viewer_1),
                                    contentDescription = "My Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxWidth().aspectRatio(1f/1f)
                                )
                            }
                        }
                    }
                }
            )
        }
    }

    if (showViewer) {
        ZaImageViewer()
    }
}
