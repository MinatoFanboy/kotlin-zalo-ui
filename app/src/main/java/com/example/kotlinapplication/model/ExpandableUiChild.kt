package com.example.kotlinapplication.model

data class ExpandableUiChild(
    val name: String,
    val onClick: (() -> Unit)? = null
)