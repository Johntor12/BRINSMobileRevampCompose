package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.brinsmobilerevampcompose.ui.theme.ButtonDarkBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonDarkBlueLinear2
import com.example.brinsmobilerevampcompose.ui.theme.ButtonLightBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonLightBlueLinear2
import com.example.brinsmobilerevampcompose.ui.theme.ButtonOrangeLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonOrangeLinear2
import com.example.brinsmobilerevampcompose.ui.theme.GrayTextFiturUnggulanDesc
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily

data class PertanyaanPentingData(
    val titlePertanyaanData: String,
    val descPertanyaanData: String,
    val colorPertanyaanCardData1: Color,
    val colorPertanyaanCardData2: Color,
    val onClickSelengkapnyaCardData: @Composable (() -> Unit)? = {}
)

val pertanyaanPentingDatas = listOf(
    PertanyaanPentingData(
        titlePertanyaanData = "PERTANYAAN UMUM",
        descPertanyaanData = "Cari jawaban dari semua pertanyaanmu disini",
        colorPertanyaanCardData1 = ButtonDarkBlueLinear1,
        colorPertanyaanCardData2 = ButtonDarkBlueLinear2,
    ),
    PertanyaanPentingData(
        titlePertanyaanData = "KLAIM",
        descPertanyaanData = "Pertanyaan Seputar Klaim, dan flast",
        colorPertanyaanCardData1 = ButtonLightBlueLinear1,
        colorPertanyaanCardData2 = ButtonLightBlueLinear2,
    ),
    PertanyaanPentingData(
        titlePertanyaanData = "PRODUK",
        descPertanyaanData = "Ada tata caranya loh untuk beli produk? cek disini yuk !",
        colorPertanyaanCardData1 = ButtonOrangeLinear1,
        colorPertanyaanCardData2 = ButtonOrangeLinear2,
    )
)

@Preview
@Composable
fun PertanyaanPentingSection() {

//    val text = buildAnnotatedString {
//        append("This is not clickable ")
//        withLink("tag", "annotation") {
//            append("This is clickable")
//        }
//    }

    Column(
        modifier = Modifier
            .height(240.dp)
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
                Text(
                    text = "Pertanyaan Penting",
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier
                            .weight(0.7f),
                        text = "Saatnya nikmati berbagai promo spesial untuk proteksimu melalui BRINSmobile",
                        fontSize = 10.sp,
                        lineHeight = 1.em,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.W400,
                        color = GrayTextFiturUnggulanDesc
                    )
                    Text(
                        modifier = Modifier.weight(0.3f),
                        text = "Lihat Semua >",
                        fontSize = 9.sp,
                        color = ButtonOrangeLinear1,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.End
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                pertanyaanPentingDatas.forEach { data ->
                    PertanyaanPentingCard(
                        modifier = Modifier.weight(1f),
                        titlePertanyaan = data.titlePertanyaanData,
                        descPertanyaan = data.descPertanyaanData,
                        colorPertanyaanCard1 = data.colorPertanyaanCardData1,
                        colorPertanyaanCard2 = data.colorPertanyaanCardData2
                    )
                }
            }
        }
    }
}

@Composable
fun PertanyaanPentingCard(
    titlePertanyaan: String = "Pertanyaan Umum",
    descPertanyaan: String = "Cari jawaban dari semua pertanyaanmu disini",
    colorPertanyaanCard1: Color = ButtonOrangeLinear1,
    colorPertanyaanCard2: Color = ButtonOrangeLinear2,
    onClickSelengkapnyaCard: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .height(150.dp)
            .padding(8.dp),
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.verticalGradient(
                        listOf(
                            colorPertanyaanCard1,
                            colorPertanyaanCard2
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(7.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .weight(0.3f),
                    color = Color.White,
                    minLines = 2,
                    lineHeight = 0.8.em,
                    text = descPertanyaan,
                    fontFamily = poppinsFontFamily, fontSize = 6.sp,
                    textAlign = TextAlign.Center
                )

                Column(
                    modifier = Modifier
                        .weight(0.4f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier,
                        color = Color.White,
                        text = titlePertanyaan,
                        fontFamily = poppinsFontFamily,
                        fontSize = 11.sp,
                        lineHeight = 1.em,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(0.3f),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "SELENGKAPNYA >",
                        fontFamily = poppinsFontFamily,
                        color = Color.White,
                        fontSize = 6.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}