package com.example.kotlinapplication.ui.navigation

import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute

fun routeToTitle(destination: NavDestination?): String =
    when {
        destination?.hasRoute<Routes.HomeScreen>() == true -> ""
        destination?.hasRoute<Routes.FormsInputScreen>() == true -> "Forms Input"
        else -> ""
    }