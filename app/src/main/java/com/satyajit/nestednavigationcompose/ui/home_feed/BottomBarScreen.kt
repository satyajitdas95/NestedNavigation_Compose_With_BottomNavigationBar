package com.satyajit.nestednavigationcompose.ui.home_feed

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Explore : BottomBarScreen(
        route = "Explore",
        title = "Explore",
        icon = Icons.Default.Search
    )

    object Profile : BottomBarScreen(
        route = "Profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
}
