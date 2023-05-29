package com.satyajit.nestednavigationcompose.ui.home_screen

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.satyajit.nestednavigationcompose.navigation_graphs.HomeScreenNavGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navHostController: NavHostController = rememberNavController()) {
    Scaffold(bottomBar = { BottomBar(navController = navHostController) })
    {
        HomeScreenNavGraph(navController = navHostController)
    }
}




