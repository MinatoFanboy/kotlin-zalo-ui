package com.example.kotlinapplication.di.repo

import com.example.kotlinapplication.di.common.ResultState
import com.example.kotlinapplication.di.common.TodoModel
import kotlinx.coroutines.flow.Flow

interface TodoRepo {
    fun getTodos(): Flow<ResultState<List<TodoModel>>>
}