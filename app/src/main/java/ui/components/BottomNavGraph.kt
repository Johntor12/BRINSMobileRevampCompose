package ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ui.screens.home.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    // Define Navigation Graph
//    NavHost(navController = navController,
//        startDestination = BottomBarScreen.Beranda.route) {
//        composable(route = BottomBarScreen.Beranda.route) {
//            HomeScreen(navHost = navController)
//        }
//    }
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Beranda.route) {
        composable(route = BottomBarScreen.Beranda.route) {
            HomeScreen(
                navHost = navController
            )
        }
    }
}