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

    object Produk: BottomBarScreen(
        route = "produk",
        title = "Cek Produk"
    )

    object Polis: BottomBarScreen(
        route = "polis",
        title = "Cek Polis",
    )

    object Profil: BottomBarScreen(
        route = "profil",
        title = "Profil"
    )
}