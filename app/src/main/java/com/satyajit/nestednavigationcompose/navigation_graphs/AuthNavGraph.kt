package com.satyajit.nestednavigationcompose.navigation_graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.satyajit.nestednavigationcompose.ui.auth_screen.LoginScreen
import com.satyajit.nestednavigationcompose.ui.auth_screen.forgot_password.SignupScreen
import com.satyajit.nestednavigationcompose.ui.auth_screen.sign_up.ForgotPasswordScreen

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(
        route = Graphs.GRAPH_AUTH.root, startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(
                onClickOfLogin = {
                    navController.popBackStack()
                    navController.navigate(Graphs.GRAPH_HOME.root)
                },
                onclickOfSignUp = { navController.navigate(AuthScreen.SignUp.route) },

                onclickOfForgotPassword = { navController.navigate(AuthScreen.ForgotPassword.route) })
        }

    }

    composable(route = AuthScreen.SignUp.route) {
        SignupScreen(onClickOfSignup = {
            navController.popBackStack()
            navController.navigate(Graphs.GRAPH_HOME.root)
        })
    }

    composable(route = AuthScreen.ForgotPassword.route) {
        ForgotPasswordScreen(onClickOfForgotPassword = {
            navController.popBackStack()
            navController.navigate(Graphs.GRAPH_AUTH.root)
        })
    }
}


sealed class AuthScreen(val route: String) {
    object Login : AuthScreen("login")
    object SignUp : AuthScreen("signUp")
    object ForgotPassword : AuthScreen("forgotPassword")
}