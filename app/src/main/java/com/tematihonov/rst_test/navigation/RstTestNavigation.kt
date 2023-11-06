package com.tematihonov.rst_test.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tematihonov.rst_test.presentation.chat.ChatScreen
import com.tematihonov.rst_test.presentation.main.MainScreen
import com.tematihonov.rst_test.presentation.map.MapScreen
import com.tematihonov.rst_test.presentation.more.MoreScreen
import com.tematihonov.rst_test.presentation.reserve.ReserveScreen

@Composable
fun RstTestNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") { MainScreen() }
        composable("map") { MapScreen() }
        composable("reserve") { ReserveScreen() }
        composable("chat") { ChatScreen() }
        composable("more") { MoreScreen() }
    }
}