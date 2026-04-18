package com.example.kotlinapplication.screen

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.kotlinapplication.R
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.component.ZaIcon
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue60
import com.example.kotlinapplication.ui.theme.green60
import com.example.kotlinapplication.ui.theme.neutralGray20
import com.example.kotlinapplication.ui.theme.red60
import com.example.kotlinapplication.ui.theme.skyBlue50
import com.example.kotlinapplication.ui.theme.white100

@Composable
fun AvatarScreen() {
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
                name = "Size",
                trailing = {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "16px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(16.dp)
                                        .clip(RoundedCornerShape(16.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "24px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "32px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(32.dp)
                                        .clip(RoundedCornerShape(32.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "40px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(40.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "48px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(RoundedCornerShape(48.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "64px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(64.dp)
                                        .clip(RoundedCornerShape(64.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "96px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(96.dp)
                                        .clip(RoundedCornerShape(96.dp))
                                )
                            }
                        }

                        item {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    "128px",
                                    color = LocalZaColors.current.text1,
                                    style = LocalZaTypography.current.textXXSmall
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.photo_2),
                                    contentDescription = "Photo",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(128.dp)
                                        .clip(RoundedCornerShape(128.dp))
                                )
                            }
                        }
                    }

                    Text(
                        "Scroll để xem thêm >>>",
                        color = LocalZaColors.current.selectionLabel,
                        style = LocalZaTypography.current.textXXSmall
                    )
                }
            )
        }

        item {
            ZaCard(
                name = "Variation",
                trailing = {
                    Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 1",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-4).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(neutralGray20, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        "1",
                                        color = LocalZaColors.current.text2,
                                        style = LocalZaTypography.current.textXXXSmallM
                                    )
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 2",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-4).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 3",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy((-8).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Row(horizontalArrangement = Arrangement.spacedBy((-4).dp)) {
                                    Box(
                                        modifier = Modifier
                                            .size(26.dp)
                                            .background(white100, CircleShape)
                                            .padding(2.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.photo),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                        )
                                    }

                                    Box(
                                        modifier = Modifier
                                            .size(26.dp)
                                            .background(white100, CircleShape)
                                            .padding(2.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.photo_3),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                        )
                                    }
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 4",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-4).dp)) {
                                Column(verticalArrangement = Arrangement.spacedBy((-4).dp)) {
                                    Box(
                                        modifier = Modifier
                                            .size(26.dp)
                                            .background(white100, CircleShape)
                                            .padding(2.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.no_avatar),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                        )
                                    }

                                    Box(
                                        modifier = Modifier
                                            .size(26.dp)
                                            .background(white100, CircleShape)
                                            .padding(2.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.photo_3),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                        )
                                    }
                                }

                                Column(verticalArrangement = Arrangement.spacedBy((-4).dp)) {
                                    Box(
                                        modifier = Modifier
                                            .size(26.dp)
                                            .background(white100, CircleShape)
                                            .padding(2.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.photo),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                        )
                                    }

                                    Box(
                                        modifier = Modifier
                                            .size(26.dp)
                                            .background(white100, CircleShape)
                                            .padding(2.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.photo_1),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                            "Group 4+",
                            color = LocalZaColors.current.text1,
                            style = LocalZaTypography.current.textXXSmall
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy((-4).dp)) {
                            Column(verticalArrangement = Arrangement.spacedBy((-4).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                        .zIndex(1F)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo_3),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }
                            }

                            Column(verticalArrangement = Arrangement.spacedBy((-4).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(neutralGray20, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        "4+",
                                        color = LocalZaColors.current.text2,
                                        style = LocalZaTypography.current.textXXXSmallM
                                    )
                                }
                            }
                        }
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 2 \nHorizontal",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-12).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 3 \nHorizontal",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-12).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo_3),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 3 \nHorizontal",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-12).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo_3),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo_2),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }
                            }
                        }
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Group 4+ \nHorizontal",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Row(horizontalArrangement = Arrangement.spacedBy((-12).dp)) {
                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(white100, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.photo_3),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(26.dp)
                                        .background(neutralGray20, CircleShape)
                                        .padding(2.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        "+5",
                                        color = LocalZaColors.current.text2,
                                        style = LocalZaTypography.current.textXXXSmallM
                                    )
                                }
                            }
                        }
                    }
                }
            )
        }

        item {
            ZaCard(
                name = "Add-on",
                trailing = {
                    Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Online",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Box(contentAlignment = Alignment.BottomEnd) {
                                Box(
                                    modifier = Modifier
                                        .size(48.dp)
                                        .background(white100, CircleShape)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(12.dp)
                                        .background(white100, CircleShape).
                                    padding(2.dp)
                                ) {
                                    Box(Modifier.fillMaxSize().background(green60, CircleShape))
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Online + Story",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.size(48.dp)
                            ) {
                                Canvas(modifier = Modifier.fillMaxSize()) {
                                    val strokeWidth = 2.dp.toPx()

                                    val sweepAngle = 360f * 1f

                                    drawArc(
                                        brush = Brush.sweepGradient(
                                            colors = listOf(blue60, skyBlue50, blue60),
                                            center = center
                                        ),
                                        startAngle = -45f,
                                        sweepAngle = sweepAngle,
                                        useCenter = false,
                                        style = Stroke(
                                            width = strokeWidth,
                                            cap = StrokeCap.Round
                                        )
                                    )
                                }

                                Image(
                                    painter = painterResource(id = R.drawable.no_avatar),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                )
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Story Uploading",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.size(48.dp)
                            ) {
                                AnimatedCanvas()

                                Image(
                                    painter = painterResource(id = R.drawable.no_avatar),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                )
                            }
                        }
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                "Blocked",
                                color = LocalZaColors.current.text1,
                                style = LocalZaTypography.current.textXXSmall
                            )

                            Box(contentAlignment = Alignment.BottomEnd) {
                                Box(
                                    modifier = Modifier
                                        .size(48.dp)
                                        .background(white100, CircleShape)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.no_avatar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(14.dp)
                                        .background(white100, CircleShape).padding(2.dp)
                                ) {
                                    ZaIcon("\uE921", color = red60, size = 10.5.sp)
                                }
                            }
                        }
                    }
                }
            )
        }
    }
}

@Composable
fun AnimatedCanvas() {
    val infiniteTransition = rememberInfiniteTransition(label = "")

    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = ""
    )

    Canvas(modifier = Modifier.fillMaxSize()) {
        val strokeWidth = 2.dp.toPx()

        val sweepAngle = 360f * 0.5f

        rotate(rotation) {
            drawArc(
                brush = Brush.sweepGradient(
                    colors = listOf(blue60, white100, blue60),
                    center = center
                ),
                startAngle = 180f,
                sweepAngle = sweepAngle,
                useCenter = false,
                style = Stroke(
                    width = strokeWidth,
                    cap = StrokeCap.Round
                )
            )
        }
    }
}