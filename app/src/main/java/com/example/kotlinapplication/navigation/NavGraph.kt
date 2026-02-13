package com.example.kotlinapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kotlinapplication.screen.FormsInputScreen
import com.example.kotlinapplication.screen.HomeScreen
import com.example.kotlinapplication.screen.SelectionScreen

@Composable
fun NavGraph(navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navHostController, startDestination = "home", modifier = modifier) {
        composable("home") {
            HomeScreen(navHostController = navHostController)
        }
        composable("formsInput") {
            FormsInputScreen()
        }
        composable("selection") {
            SelectionScreen()
        }
    }
}