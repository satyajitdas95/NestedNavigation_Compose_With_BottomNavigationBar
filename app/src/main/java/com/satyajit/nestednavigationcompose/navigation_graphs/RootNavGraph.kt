package com.satyajit.nestednavigationcompose.navigation_graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.satyajit.nestednavigationcompose.ui.home_screen.HomeScreen

@Composable
fun RootNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Graphs.GRAPH_AUTH.root
    ) {
        authNavGraph(navController = navHostController)

        composable(route = Graphs.GRAPH_HOME.root) {
            HomeScreen()
        }
    }
}


sealed class Graphs(val root: String) {
    object GRAPH_AUTH : Graphs("auth_graph")
    object GRAPH_HOME : Graphs("home_graph")
    object GRAPH_DETAILS : Graphs("details_graph")
}