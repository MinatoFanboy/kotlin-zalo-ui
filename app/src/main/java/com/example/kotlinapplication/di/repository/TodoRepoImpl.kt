package com.example.kotlinapplication.di.repository

import com.example.kotlinapplication.di.common.ResultState
import com.example.kotlinapplication.di.common.TodoModel
import com.example.kotlinapplication.di.repo.TodoRepo
import com.example.kotlinapplication.di.service.TodoService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TodoRepoImpl @Inject constructor(private val api: TodoService): TodoRepo {
    override fun getTodos(): Flow<ResultState<List<TodoModel>>> = flow {
        emit(ResultState.Loading)
        try {
            val result = api.getTodos()
            emit(ResultState.Success(result))
        } catch (e: Exception) {
            emit(ResultState.Error(e))
        }
    }
}