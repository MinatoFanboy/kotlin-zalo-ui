package com.example.kotlinapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kotlinapplication.screen.ApiScreen
import com.example.kotlinapplication.screen.FormsInputScreen
import com.example.kotlinapplication.screen.HomeScreen
import com.example.kotlinapplication.screen.ListItemScreen
import com.example.kotlinapplication.screen.SelectionScreen
import com.example.kotlinapplication.screen.TextStyleScreen
import com.example.kotlinapplication.screen.TimePickerScreen
import com.example.kotlinapplication.screen.TokenSizeScreen

@Composable
fun NavGraph(navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navHostController, startDestination = Routes.HomeScreen, modifier = modifier) {
        composable<Routes.HomeScreen> {
            HomeScreen(navHostController = navHostController)
        }
        composable<Routes.FormsInputScreen> {
            FormsInputScreen()
        }
        composable<Routes.SelectionScreen> {
            SelectionScreen()
        }
        composable<Routes.TimePickerScreen> {
            TimePickerScreen()
        }
        composable<Routes.ListItemScreen> {
            ListItemScreen()
        }
        composable<Routes.TokenSizeScreen> {
            TokenSizeScreen()
        }
        composable<Routes.TextStyleScreen> {
            TextStyleScreen()
        }
        composable<Routes.ApiScreen> {
            ApiScreen()
        }
    }
}