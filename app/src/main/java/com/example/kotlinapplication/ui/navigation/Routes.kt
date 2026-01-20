package com.example.kotlinapplication.ui.navigation

import kotlinx.serialization.Serializable

sealed class Routes() {
    @Serializable
    object HomeScreen

    @Serializable
    object FormsInputScreen
}