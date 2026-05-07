package com.example.kotlinapplication.screen.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinapplication.di.common.ResultState
import com.example.kotlinapplication.di.common.TodoModel
import com.example.kotlinapplication.di.repo.TodoRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ItemState(
    val isLoading: Boolean = false,
    val error: String = "",
    val todos: List<TodoModel> = emptyList()
)

@HiltViewModel
class CustomViewModel @Inject constructor(val repo: TodoRepo) : ViewModel() {
    private val _state = mutableStateOf(ItemState())
    val state: State<ItemState> = _state

    fun observeTodos() {
        viewModelScope.launch {
            repo.getTodos().collect { result ->
                _state.value = when (result) {
                    is ResultState.Loading ->
                        _state.value.copy(isLoading = true, error = "")

                    is ResultState.Success ->
                        ItemState(todos = result.data)

                    is ResultState.Error ->
                        ItemState(error = result.exception.message ?: "Unknown error")
                }
            }
        }
    }
}