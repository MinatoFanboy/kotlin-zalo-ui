package com.example.kotlinapplication.ui.model

data class ExpandableUiChild(
    val name: String,
    val onClick: (() -> Unit)? = null
)