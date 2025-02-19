package ui.components

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.brinsmobilerevampcompose.R
import com.example.brinsmobilerevampcompose.ui.theme.BlackTextFiturUnggulanCardDesc
import com.example.brinsmobilerevampcompose.ui.theme.BlueTextFiturUnggulanCardTitle
import com.example.brinsmobilerevampcompose.ui.theme.BrinsMobileRevampComposeTheme
import com.example.brinsmobilerevampcompose.ui.theme.ButtonDarkBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonLightBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonOrangeLinear1
import com.example.brinsmobilerevampcompose.ui.theme.GrayTextFiturUnggulanDesc
import com.example.brinsmobilerevampcompose.ui.theme.Typography
import com.example.brinsmobilerevampcompose.ui.theme.WhiteLinear1
import com.example.brinsmobilerevampcompose.ui.theme.WhiteLinear2
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily

data class FeatureData(
    val titleFeatureData: String,
    val iconFeatureData: Int,
    val descFeatureData: String,
    val onClickFeatureData: @Composable (() -> Unit)? = {}
)
//
//@Composable
//fun FiturOnClick() {
//}
//

val fiturUnggulanDatas = listOf(
    FeatureData(
        descFeatureData = "Klaim, Call Center, Bengkel, dll hanya disini, cek ya",
        titleFeatureData = "Pusat Layanan",
        iconFeatureData = R.drawable.phone_icon_brins_mobile,
    ),
    FeatureData(
        descFeatureData = "Halo sobat BRINS, yuk cek product asuransi dari kami!",
        titleFeatureData = "Produk Kami",
        iconFeatureData = R.drawable.produk_kami_icon_brins_mobile
    )
)

//
//
@Composable
fun FiturUnggulanSection(navController: NavController) {
    Column(
        modifier = Modifier
            .height(360.dp)
            .padding(0.dp)
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = Modifier) {
//                Spacer(modifier = Modifier
//                    .fillMaxWidth()
//                    .height(10.dp))
                Text(
                    text = "Fitur Unggulan",
                    fontSize = 15.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

                Text(
                    text = "Nikmati kemudahan berbagai layanan kami hanya dengan satu genggaman",
                    fontSize = 10.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.W400,
                    color = GrayTextFiturUnggulanDesc
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally)
        ) {
            fiturUnggulanDatas.forEach { data ->
                FiturUnggulanCard(
                    navController = navController,
                    modifier = Modifier.weight(1f),
                    titleFeature = data.titleFeatureData,
                    iconFeature = data.iconFeatureData,
                    descFeature = data.descFeatureData,
                    onClickFeature = { navController.navigate("layanan") }
                )
            }

//            FiturUnggulanCard(modifier = Modifier)
//            Spacer(modifier = Modifier.weight(1f))
//            FiturUnggulanCard(modifier = Modifier)
        }
    }
}

//@Preview
@Composable
fun FiturUnggulanCard(
    navController: NavController,
    titleFeature: String = "Pusat Layanan",
    iconFeature: Int = 1,
    descFeature: String = "Klaim, Call Center, Bengkel, dll hanya disini, cek ya!",
    onClickFeature: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val colorTextHeader = ButtonDarkBlueLinear1
    val colorTextTitle = BlueTextFiturUnggulanCardTitle
    val colorOrange = ButtonOrangeLinear1
    val poppinsFontFamily = poppinsFontFamily

    val context = LocalContext.current
    val displayMetrics = context.resources.displayMetrics

    // Width and height of screen
    val width = displayMetrics.widthPixels
    val height = displayMetrics.heightPixels

//    Column(
//        modifier = Modifier
//            .height((height / 2).dp)
//            .background(Brush.linearGradient(listOf(WhiteLinear1, WhiteLinear2)))
//            .width(IntrinsicSize.Max)
//            .padding(10.dp)
//    ) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(284.dp)
            .padding(16.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(16.dp)
            )
            .clip(RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        listOf(
                            ButtonDarkBlueLinear1,
                            ButtonLightBlueLinear1
                        )
                    )
                )
                .weight(1f)
                .padding(16.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(72.dp)
                    .offset(y = 20.dp),
                painter = painterResource(iconFeature),
                contentDescription = "Phone_Icon"
            )
        }
        Column(
            modifier = Modifier
                .padding(8.dp)
                .weight(1f),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier
                        .weight(0.8f),
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 1.em,
                    minLines = 2,
                    text = titleFeature, fontSize = 18.sp, color = BlueTextFiturUnggulanCardTitle
                )
                Spacer(modifier = Modifier.weight(0.2f))
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = descFeature,
                color = BlackTextFiturUnggulanCardDesc,
                fontFamily = poppinsFontFamily,
                lineHeight = 1.em,
                maxLines = 2,
                fontWeight = FontWeight.W400,
                fontSize = 8.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(modifier = Modifier) {
                Button(
                    modifier = Modifier
                        .weight(0.55f)
                        .height(32.dp),
                    onClick = {
                        onClickFeature()
                    },
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.textButtonColors(backgroundColor = colorOrange)
                ) {
                    Text(
                        textAlign = TextAlign.Center, text = "Pilih", color = Color.White,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.W400,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.weight(0.45f))
            }
        }
    }

//    }
}
