package com.example.kotlinapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kotlinapplication.screen.AliasTokensScreen
import com.example.kotlinapplication.screen.ApiScreen
import com.example.kotlinapplication.screen.AvatarScreen
import com.example.kotlinapplication.screen.ButtonScreen
import com.example.kotlinapplication.screen.FormsInputScreen
import com.example.kotlinapplication.screen.GlobalTokenColorScreen
import com.example.kotlinapplication.screen.GradientScreen
import com.example.kotlinapplication.screen.HomeScreen
import com.example.kotlinapplication.screen.LibraryIconsScreen
import com.example.kotlinapplication.screen.ListItemScreen
import com.example.kotlinapplication.screen.RadiusScreen
import com.example.kotlinapplication.screen.SelectionScreen
import com.example.kotlinapplication.screen.SheetAndModalScreen
import com.example.kotlinapplication.screen.SnackbarScreen
import com.example.kotlinapplication.screen.SpacingSystemScreen
import com.example.kotlinapplication.screen.TextStyleScreen
import com.example.kotlinapplication.screen.TimePickerScreen
import com.example.kotlinapplication.screen.TokenSizeScreen

@Composable
fun NavGraph(navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navHostController, startDestination = Routes.HomeScreen, modifier = modifier) {
        composable<Routes.AliasTokensScreen> {
            AliasTokensScreen()
        }
        composable<Routes.ApiScreen> {
            ApiScreen()
        }
        composable<Routes.AvatarScreen> {
            AvatarScreen()
        }
        composable<Routes.ButtonScreen> {
            ButtonScreen()
        }
        composable<Routes.FormsInputScreen> {
            FormsInputScreen()
        }
        composable<Routes.GlobalTokenColorScreen> {
            GlobalTokenColorScreen()
        }
        composable<Routes.GradientScreen> {
            GradientScreen()
        }
        composable<Routes.HomeScreen> {
            HomeScreen(navHostController = navHostController)
        }
        composable<Routes.LibraryIconsScreen> {
            LibraryIconsScreen()
        }
        composable<Routes.ListItemScreen> {
            ListItemScreen()
        }
        composable<Routes.RadiusScreen> {
            RadiusScreen()
        }
        composable<Routes.SnackbarScreen> {
            SnackbarScreen()
        }
        composable<Routes.SelectionScreen> {
            SelectionScreen()
        }
        composable<Routes.SheetAndModalScreen> {
            SheetAndModalScreen()
        }
        composable<Routes.SpacingSystemScreen> {
            SpacingSystemScreen()
        }
        composable<Routes.TextStyleScreen> {
            TextStyleScreen()
        }
        composable<Routes.TimePickerScreen> {
            TimePickerScreen()
        }
        composable<Routes.TokenSizeScreen> {
            TokenSizeScreen()
        }
    }
}