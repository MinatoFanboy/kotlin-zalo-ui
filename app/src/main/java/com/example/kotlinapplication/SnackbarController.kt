package com.example.kotlinapplication

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarVisuals
import com.example.kotlinapplication.ui.component.ZaSnackbarType
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject
import javax.inject.Singleton

data class ZaSnackbarEvent(
    val message: String,
    val type: ZaSnackbarType = ZaSnackbarType.INFO,
    val action: ZaSnackbarAction? = null
)

data class ZaSnackbarAction(
    val name: String,
    val type: ZaSnackbarActionType
)

enum class ZaSnackbarActionType {
    NONE
}

class ZaSnackbarVisuals(
    override val message: String,
    override val actionLabel: String?,
    val type: ZaSnackbarType
) : SnackbarVisuals {
    override val duration: SnackbarDuration = SnackbarDuration.Short
    override val withDismissAction: Boolean = false
}

@Singleton
class SnackbarController @Inject constructor() {
    private val _events = Channel<ZaSnackbarEvent>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    suspend fun sendEvent(event: ZaSnackbarEvent) {
        _events.send(event)
    }
}