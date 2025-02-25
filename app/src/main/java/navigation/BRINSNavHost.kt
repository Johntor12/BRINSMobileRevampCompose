package navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ui.components.FiturUnggulanSection
import ui.screens.LayananScreen
import ui.screens.Screen
import ui.screens.home.HomeScreen

@Composable
fun BRINSNavHost() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "homescreen"
    ) {
        composable(route="homescreen") {
            HomeScreen(navController)
        }
        composable(route = "profile"){
            LayananScreen(navController)
        }
        composable(route = "layanan"){
            LayananScreen(navController)
        }

    }
}