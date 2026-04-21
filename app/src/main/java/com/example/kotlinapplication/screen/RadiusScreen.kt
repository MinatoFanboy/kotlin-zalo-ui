package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.component.ZaCard
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.blue30
import com.example.kotlinapplication.ui.theme.blue60

@Composable
fun RadiusScreen() {
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
                name = "App Radius",
                subName = "Rounded Corners are Easy on the Eyes (and the Brain). It takes less cognitive load to see rounded rectangles than it does to see sharp-cornered ones.",
                nameHighlight = true,
                trailing = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .border(1.dp, blue60, RoundedCornerShape(4.dp))
                                .clip(RoundedCornerShape(4.dp))
                                .background(blue30)
                        )

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("TOKEN: corner_04", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)

                            Text("BORDER: 4", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .border(1.dp, blue60, RoundedCornerShape(8.dp))
                                .clip(RoundedCornerShape(8.dp))
                                .background(blue30)
                        )

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("TOKEN: corner_08", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)

                            Text("BORDER: 8", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .border(1.dp, blue60, RoundedCornerShape(12.dp))
                                .clip(RoundedCornerShape(12.dp))
                                .background(blue30)
                        )

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("TOKEN: corner_12", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)

                            Text("BORDER: 12", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .border(1.dp, blue60, RoundedCornerShape(16.dp))
                                .clip(RoundedCornerShape(16.dp))
                                .background(blue30)
                        )

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("TOKEN: corner_16", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)

                            Text("BORDER: 16", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .border(1.dp, blue60, CircleShape)
                                .clip(CircleShape)
                                .background(blue30)
                        )

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("TOKEN: corner_100", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)

                            Text("BORDER: 50%", color = LocalZaColors.current.text1, style = LocalZaTypography.current.textNormal)
                        }
                    }
                }
            )
        }
    }
}