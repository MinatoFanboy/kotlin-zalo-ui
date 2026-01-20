package com.example.kotlinapplication.ui.model

import androidx.compose.ui.graphics.Color

data class ExpandableUiItem(
    val id: Int,
    val name: String,
    val icon: String,
    val color: Color,
    val children: List<ExpandableUiChild>,
)