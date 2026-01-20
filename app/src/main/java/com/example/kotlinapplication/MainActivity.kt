package com.example.kotlinapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.kotlinapplication.ui.navigation.NavGraph
import com.example.kotlinapplication.ui.navigation.ZaTopBar
import com.example.kotlinapplication.ui.navigation.routeToTitle
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navHostController = rememberNavController()
            val navBackStackEntry by navHostController.currentBackStackEntryAsState()
            val destination = navBackStackEntry?.destination

            val currentScreen = remember(destination) {
                routeToTitle(destination)
            }

            KotlinApplicationTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                    topBar = {
                        ZaTopBar(
                            title = currentScreen,
                            onBackClick = {
                                navHostController.popBackStack()
                            },
                            modifier = Modifier.statusBarsPadding()
                        )
                    }
                ) { innerPadding ->
                    NavGraph(navHostController = navHostController, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}