package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ui.components.BRINSMobileAppTopBar
import ui.components.FiturUnggulanSection
import ui.components.HubungiKamiSection
import ui.components.ImsecureSection
import ui.components.LayananSection
import ui.components.PertanyaanPentingSection

@Composable
fun LayananScreen (
    navController: NavController
) {
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
        content = {
                paddingValues ->
            LazyColumn(
                state = scrollState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.spacedBy(0.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                item { LayananSection() }
                item { HubungiKamiSection() }
            }
        }
    )
}