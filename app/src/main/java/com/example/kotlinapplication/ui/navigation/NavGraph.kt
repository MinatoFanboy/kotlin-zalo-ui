package com.example.kotlinapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kotlinapplication.ui.screen.FormsInputScreen
import com.example.kotlinapplication.ui.screen.HomeScreen

@Composable
fun NavGraph(navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navHostController, startDestination = Routes.HomeScreen, modifier = modifier) {
        composable<Routes.HomeScreen> {
            HomeScreen(navHostController = navHostController)
        }
        composable<Routes.FormsInputScreen> {
            FormsInputScreen(navHostController = navHostController)
        }
    }
}