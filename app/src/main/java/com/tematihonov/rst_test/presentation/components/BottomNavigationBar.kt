package com.tematihonov.rst_test.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.tematihonov.rst_test.navigation.BottomNavItem
import com.tematihonov.rst_test.ui.theme.Typography
import com.tematihonov.rst_test.ui.theme.backgroundColor
import com.tematihonov.rst_test.ui.theme.indicatorGrayColor
import com.tematihonov.rst_test.ui.theme.textBlueColor

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit,
) {
    val backStackEntry = navController.currentBackStackEntryAsState()

    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.backgroundColor
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = selected,
                onClick = { onItemClick(item) },
                icon = {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(vertical = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(id = item.icon), contentDescription = "",
                            modifier = Modifier.size(24.dp),
                            tint = if (selected) MaterialTheme.colorScheme.textBlueColor else MaterialTheme.colorScheme.indicatorGrayColor
                        )
                        Text(text = item.name, style = Typography.bodySmall,
                            color = if (selected) MaterialTheme.colorScheme.textBlueColor else MaterialTheme.colorScheme.indicatorGrayColor)
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.textBlueColor,
                    selectedTextColor = MaterialTheme.colorScheme.textBlueColor,
                    unselectedTextColor = MaterialTheme.colorScheme.indicatorGrayColor,
                    indicatorColor = MaterialTheme.colorScheme.backgroundColor,
                )
            )
        }
    }
}