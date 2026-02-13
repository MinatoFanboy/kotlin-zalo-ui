package com.example.kotlinapplication.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener

class RealtimeClient(
    private val onMessage: (String) -> Unit
) {

    private val client = OkHttpClient()

    fun connect() {
        val request = Request.Builder()
            .url("ws://10.0.2.2:8000/ws")
            .build()

        client.newWebSocket(request, object : WebSocketListener() {
            override fun onMessage(webSocket: WebSocket, text: String) {
                onMessage(text)
            }
        })
    }
}

@Composable
fun NotificationSocketScreen() {
    var messages by remember { mutableStateOf(listOf<String>()) }

    LaunchedEffect(Unit) {
        RealtimeClient {
            messages += it
        }.connect()
    }

    Column(Modifier.padding(16.dp)) {
        Text("Realtime messages:")

        Spacer(Modifier.height(8.dp))

        messages.forEach {
            Text(it)
        }
    }
}