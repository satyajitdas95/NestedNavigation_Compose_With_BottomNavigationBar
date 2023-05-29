package com.satyajit.nestednavigationcompose.navigation_graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.satyajit.nestednavigationcompose.ui.details_screen.DetailsScreen
import com.satyajit.nestednavigationcompose.ui.explore_screen.ExploreScreen
import com.satyajit.nestednavigationcompose.ui.home_feed.HomeFeed
import com.satyajit.nestednavigationcompose.ui.profile_screen.ProfileScreen

@Composable
fun HomeScreenNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = HomeScreenGraph.HomeFeed.route) {
        composable(HomeScreenGraph.HomeFeed.route) {
            HomeFeed(onClickOfDetailsScreen = { navController.navigate(HomeScreenGraph.DETAILS.route) })
        }

        composable(HomeScreenGraph.EXPLORE.route) {
            ExploreScreen()
        }

        composable(HomeScreenGraph.PROFILE.route) {
            ProfileScreen()
        }

        composable(HomeScreenGraph.DETAILS.route) {
            DetailsScreen()
        }
    }
}


sealed class HomeScreenGraph(val route: String) {
    object HomeFeed : HomeScreenGraph("Home")
    object EXPLORE : HomeScreenGraph("Explore")
    object PROFILE : HomeScreenGraph("Profile")
    object DETAILS : HomeScreenGraph("Details")
}