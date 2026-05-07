package com.example.kotlinapplication.di.repository

import com.example.kotlinapplication.di.dao.TodoDao
import javax.inject.Inject

class LocalTodoRepoImpl @Inject constructor(private val dao: TodoDao) {
    fun getTodos() = dao.getProducts()
}