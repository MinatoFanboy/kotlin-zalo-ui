package com.example.kotlinapplication.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    object HomeScreen

    @Serializable
    object FormsInputScreen

    @Serializable
    object SelectionScreen

    @Serializable
    object TimePickerScreen

    @Serializable
    object ListItemScreen

    @Serializable
    object TokenSizeScreen

    @Serializable
    object TextStyleScreen

    @Serializable
    object ApiScreen
}