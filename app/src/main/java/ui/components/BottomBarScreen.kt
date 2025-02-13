package ui.components

import com.example.brinsmobilerevampcompose.R
import ui.screens.Screen

sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: Int = R.drawable.ic_launcher_background,
    val iconSelected: Int = R.drawable.ic_launcher_foreground

    ) {
    object Beranda: BottomBarScreen(
        route = "beranda",
        title = "Beranda",
    )

    object Polis: BottomBarScreen(
        route = "polis",
        title = "Polis",
    )

    object BrinsUpdate: BottomBarScreen(
        route = "brinsupdate",
        title = "BRINS Update"
    )

    object Profil: BottomBarScreen(
        route = "profil",
        title = "Profil"
    )
}