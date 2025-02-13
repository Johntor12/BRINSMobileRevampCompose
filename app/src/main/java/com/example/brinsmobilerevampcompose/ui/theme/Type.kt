package com.example.brinsmobilerevampcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.material3.Typography
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.brinsmobilerevampcompose.R

// Set of Material typography styles to start with



val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        lineHeight = 22.sp,
        letterSpacing = -0.3.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val poppinsFontFamily = FontFamily(
    Font(R.font.poppins_light, weight = FontWeight.W300),
    Font(R.font.poppins_regular, weight = FontWeight.W400),
    Font(R.font.poppins_medium, weight = FontWeight.Normal),
    Font(R.font.poppins_semibold, weight = FontWeight.SemiBold),
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
    Font(R.font.poppins_extrabold, weight = FontWeight.ExtraBold)
)