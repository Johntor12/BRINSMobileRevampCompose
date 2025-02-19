package com.example.brinsmobilerevampcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.brinsmobilerevampcompose.ui.theme.BrinsMobileRevampComposeTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.brinsmobilerevampcompose.ui.theme.ButtonDarkBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonLightBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonLightBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily
import ui.components.BRINSMobileAppTopBar
import ui.components.FiturUnggulanCard
import ui.components.FiturUnggulanSection
import ui.components.HubungiKamiSection
import ui.components.ImsecureSection
import ui.components.LayananSection
import ui.components.PertanyaanPentingSection
import ui.screens.LayananScreen
import ui.screens.Screen
import ui.screens.home.HomeScreen


class MainActivity : ComponentActivity() {


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BrinsMobileRevampComposeTheme {
                HomeScreen(navHost = rememberNavController())
            }
        }
    }
}