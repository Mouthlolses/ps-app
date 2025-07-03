package com.example.psapp.navigation

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.psapp.ui.screen.GameDetailsScreen
import com.example.psapp.ui.screen.GameDetailsScreen2
import com.example.psapp.ui.screen.HomeScreen
import kotlinx.coroutines.launch


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController = navController, onMenuClick = {
                scope.launch { drawerState.open() }
            })
        }
        composable("detalhesDoJogo") {
            GameDetailsScreen()
        }
        composable("detalhesDoJogo2") {
            GameDetailsScreen2()
        }
    }
}