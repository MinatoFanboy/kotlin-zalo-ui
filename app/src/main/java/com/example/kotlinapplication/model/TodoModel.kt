package com.example.kotlinapplication.model

data class TodoModel(
    val id: Int,
    val title: String,
    val completed: Boolean,
    val userId: Int
)