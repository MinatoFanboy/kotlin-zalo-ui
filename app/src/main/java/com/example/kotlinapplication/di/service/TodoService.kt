package com.example.kotlinapplication.di.service

import com.example.kotlinapplication.di.common.TodoModel
import retrofit2.http.GET

interface TodoService {
    @GET("posts?_limit=1")
    suspend fun getTodos(): List<TodoModel>
}