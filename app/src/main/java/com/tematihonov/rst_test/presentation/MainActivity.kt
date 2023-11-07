package com.tematihonov.rst_test.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.navigation.BottomNavItem
import com.tematihonov.rst_test.navigation.RstTestNavigation
import com.tematihonov.rst_test.presentation.components.BottomNavigationBar
import com.tematihonov.rst_test.ui.theme.Rst_testTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rst_testTheme {
                val bottomBarItems = listOf(
                    BottomNavItem(
                        name = stringResource(id = R.string.screen_main),
                        route = "main",
                        icon = R.drawable.icon_main
                    ),
                    BottomNavItem(
                        name = stringResource(id = R.string.screen_map),
                        route = "map",
                        icon = R.drawable.icon_map
                    ),
                    BottomNavItem(
                        name = stringResource(id = R.string.screen_reserve),
                        route = "reserve",
                        icon = R.drawable.icon_reserve
                    ),
                    BottomNavItem(
                        name = stringResource(id = R.string.screen_chat),
                        route = "chat",
                        icon = R.drawable.icon_chat
                    ),
                    BottomNavItem(
                        name = stringResource(id = R.string.screen_more),
                        route = "more",
                        icon = R.drawable.icon_more
                    )
                )
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar(
                            modifier = Modifier.height(56.dp),
                            items = bottomBarItems,
                            navController = navController,
                            onItemClick = {
                                navController.navigate(it.route)
                            })
                    }
                ) { paddingValues ->
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                    ){
                        RstTestNavigation(navController = navController)
                    }
                }
            }
        }
    }
}