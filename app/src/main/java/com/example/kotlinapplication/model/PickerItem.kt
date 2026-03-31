package com.example.kotlinapplication.model

data class PickerItem<T>(
    val value: T,
    val label: String
)