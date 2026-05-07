package com.example.kotlinapplication.di.common

data class TodoModel(
    val id: Int,
    val title: String = "",
    val body: String = "",
    val userId: Int = 0
)