package com.example.studentnest.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.studentnest.navigation.Screen
import com.example.studentnest.ui.theme.Primary
import com.example.studentnest.ui.theme.TextTertiary

// ============================================================
// Bottom Navigation Bar - 5 tabs
// Used on: Home, WeeklyTimetable, Community, Notifications, Profile
// ============================================================

data class BottomNavItem(
    val label: String,
    val icon: ImageVector,
    val route: String,
)

val bottomNavItems = listOf(
    BottomNavItem("Home", Icons.Filled.Home, Screen.Home.route),
    BottomNavItem("Timetable", Icons.Filled.Schedule, Screen.WeeklyTimetable.route),
    BottomNavItem("Community", Icons.Filled.ChatBubbleOutline, Screen.Community.route),
    BottomNavItem("Alerts", Icons.Filled.Notifications, Screen.Notifications.route),
    BottomNavItem("Profile", Icons.Filled.Person, Screen.Profile.route),
)

@Composable
fun AppBottomNavigation(
    currentRoute: String?,
    onTabSelected: (String) -> Unit,
) {
    NavigationBar(
        containerColor = Color.White,
    ) {
        bottomNavItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = { onTabSelected(item.route) },
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Primary,
                    selectedTextColor = Primary,
                    unselectedIconColor = TextTertiary,
                    unselectedTextColor = TextTertiary,
                    indicatorColor = Color.White,
                )
            )
        }
    }
}
