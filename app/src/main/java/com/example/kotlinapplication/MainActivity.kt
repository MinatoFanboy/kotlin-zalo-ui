package com.example.kotlinapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.kotlinapplication.navigation.NavGraph
import com.example.kotlinapplication.navigation.ZaTopBar
import com.example.kotlinapplication.ui.component.ThemeToggleFAB
import com.example.kotlinapplication.ui.component.ZaSnackbar
import com.example.kotlinapplication.ui.component.ZaSnackbarType
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var snackbarController: SnackbarController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navHostController = rememberNavController()
            val navBackStackEntry by navHostController.currentBackStackEntryAsState()
            val destination = navBackStackEntry?.destination

            val currentScreen = remember(destination) {
                ""
            }

            var isDarkTheme by rememberSaveable { mutableStateOf(false) }

            val snackbarHostState = remember { SnackbarHostState() }

            val scope = rememberCoroutineScope()

            ObserveAsEvents(flow = snackbarController.events) { event ->
                scope.launch {
                    val result = snackbarHostState.showSnackbar(
                        ZaSnackbarVisuals(
                            message = event.message,
                            actionLabel = event.action?.name,
                            type = event.type
                        )
                    )

                    if (result == SnackbarResult.ActionPerformed) {
                        when (event.action?.type) {
                            ZaSnackbarActionType.NONE -> {}
                            else -> Unit
                        }
                    }
                }
            }

            KotlinApplicationTheme(isDarkTheme) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        ZaTopBar(
                            title = currentScreen,
                            onBackClick = {
                                navHostController.popBackStack()
                            },
                            modifier = Modifier.statusBarsPadding(),
                            isDarkTheme = isDarkTheme
                        )
                    },
                    floatingActionButton = {
                        ThemeToggleFAB(
                            isDarkTheme = isDarkTheme,
                            onToggle = { isDarkTheme = !isDarkTheme }
                        )
                    },
                    floatingActionButtonPosition = FabPosition.Start,
                    snackbarHost = {
                        SnackbarHost(
                            hostState = snackbarHostState
                        ) { snackbarData ->
                            val event = snackbarData.visuals as? ZaSnackbarVisuals

                            ZaSnackbar(
                                message = snackbarData.visuals.message,
                                type = event?.type ?: ZaSnackbarType.INFO,
                                actionLabel = snackbarData.visuals.actionLabel,
                                onAction = { snackbarData.performAction() }
                            )
                        }
                    }
                ) { innerPadding ->
                    NavGraph(
                        navHostController = navHostController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
