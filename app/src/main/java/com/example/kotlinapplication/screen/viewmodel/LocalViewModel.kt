package com.example.kotlinapplication.screen.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinapplication.di.ImageStorageManager
import com.example.kotlinapplication.di.dao.TodoDao
import com.example.kotlinapplication.di.common.TodoModel
import com.example.kotlinapplication.di.entity.SyncStatus
import com.example.kotlinapplication.di.entity.TodoEntity
import com.example.kotlinapplication.di.repository.LocalTodoRepoImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

data class LocalItemState(
    val isLoading: Boolean = false,
    val error: String = "",
    val todos: List<TodoEntity> = emptyList()
)

@HiltViewModel
class LocalViewModel @Inject constructor(
    val todoRepo: LocalTodoRepoImpl,
    private val dao: TodoDao,
    private val imageStorageManager: ImageStorageManager
) : ViewModel() {
    private val _state = mutableStateOf(LocalItemState())
    val state: State<LocalItemState> = _state

    fun downloadTodos(todoList: List<TodoModel>) {
        viewModelScope.launch {
            try {
                _state.value = _state.value.copy(isLoading = true, error = "")

                val entities = todoList.map { todo ->
                    val localImagePath =
                        imageStorageManager.downloadAndSaveImage(
                            imageUrl = "https://fastly.picsum.photos/id/212/536/354.jpg?hmac=0EAnlZru3Cp4Nno6mcIrV7SL_0w7LdEbrO6Nudayakk",
                            folderName = ImageStorageManager.IMAGES,
                            fileName = todo.id.toString()
                        )

                    TodoEntity(
                        id = todo.id,
                        title = todo.title,
                        body = todo.body,
                        userId = todo.userId,
                        localImagePath = localImagePath,
                        syncStatus = SyncStatus.SYNCED
                    )
                }

                dao.insertAll(entities)

                _state.value = _state.value.copy(isLoading = false)
            } catch (e: Exception) {
                _state.value = _state.value.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error"
                )
            }
        }
    }

    fun getTodos() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true, error = "")

            todoRepo.getTodos()
                .catch { e ->
                    _state.value =
                        _state.value.copy(isLoading = false, error = e.message ?: "Unknown error")
                }
                .collect { list ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        todos = list,
                    )
                }
        }
    }
}