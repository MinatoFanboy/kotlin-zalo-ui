package com.example.kotlinapplication.navigation

import androidx.navigation.NavDestination

fun routeToTitle(destination: NavDestination?): String =
    when {
        destination?.route == "home" -> ""
        destination?.route == "formsInput" -> "Forms Input"
        destination?.route == "selection" -> "Selection"
        else -> ""
    }