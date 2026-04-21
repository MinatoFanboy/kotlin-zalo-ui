package com.example.kotlinapplication.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    object AliasTokensScreen

    @Serializable
    object ApiScreen

    @Serializable
    object AvatarScreen

    @Serializable
    object ButtonScreen

    @Serializable
    object FormsInputScreen

    @Serializable
    object GlobalTokenColorScreen

    @Serializable
    object GradientScreen

    @Serializable
    object HomeScreen

    @Serializable
    object LibraryIconsScreen

    @Serializable
    object ListItemScreen

    @Serializable
    object RadiusScreen

    @Serializable
    object SelectionScreen

    @Serializable
    object SheetAndModalScreen

    @Serializable
    object SnackbarScreen

    @Serializable
    object SpacingSystemScreen

    @Serializable
    object TextStyleScreen

    @Serializable
    object TimePickerScreen

    @Serializable
    object TokenSizeScreen
}