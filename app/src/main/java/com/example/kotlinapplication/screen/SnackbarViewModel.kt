package com.example.kotlinapplication.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinapplication.SnackbarController
import com.example.kotlinapplication.ZaSnackbarAction
import com.example.kotlinapplication.ZaSnackbarEvent
import com.example.kotlinapplication.ui.component.ZaSnackbarType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject



@HiltViewModel
class SnackbarViewModel @Inject constructor(
    private val snackbarController: SnackbarController
) : ViewModel() {
    fun showSnackbar(message: String = "", type: ZaSnackbarType = ZaSnackbarType.INFO, action: ZaSnackbarAction? = null) {
        viewModelScope.launch {
            snackbarController.sendEvent(
                ZaSnackbarEvent(
                    message = message,
                    type = type,
                    action = action
                )
            )
        }
    }
}