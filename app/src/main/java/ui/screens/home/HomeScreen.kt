package ui.screens.home
import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import ui.components.BRINSMobileAppTopBar
import ui.components.FiturUnggulanSection
import ui.components.ImsecureSection
import ui.components.PertanyaanPentingSection

@Composable
fun HomeScreen(navHost: NavHostController) {
    var scrollOffset = remember { mutableStateOf(0) }
    val scrollState = rememberLazyListState()

    LaunchedEffect(scrollState.firstVisibleItemIndex) {
        scrollOffset.value = scrollState.firstVisibleItemScrollOffset
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.White,
        topBar = {
            BRINSMobileAppTopBar(scrollOffset = scrollOffset.value)
        },
        content = { paddingValues ->
            LazyColumn(
                state = scrollState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.spacedBy(0.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                item { FiturUnggulanSection(navController = navHost) }
                item { PertanyaanPentingSection() }
                item { ImsecureSection() }
            }
        }
    )
}
