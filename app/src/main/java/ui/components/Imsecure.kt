package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.brinsmobilerevampcompose.ui.theme.ButtonOrangeLinear1
import com.example.brinsmobilerevampcompose.ui.theme.GrayTextFiturUnggulanDesc
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily
import com.example.brinsmobilerevampcompose.R

@Preview
@Composable
fun ImsecureSection() {
    Column(
        modifier = Modifier
            .height(260.dp)
            .padding(4.dp)
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Column(modifier = Modifier) {
                Text(
                    text = "Ubah Insecure menjadi #IMSECURE",
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
                        text = "Perlindungan aman serba simpel serba fleksibel",
                        fontSize = 11.sp,
                        lineHeight = 1.em,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.W400,
                        color = GrayTextFiturUnggulanDesc
                    )
                }
                ImsecureCard(modifier = Modifier)
            }
            LazyRow(
                modifier = Modifier.padding(0.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                item { ImsecureCard(modifier = Modifier.fillMaxWidth()) }
                item { ImsecureCard(modifier = Modifier.fillMaxWidth()) }
            }
        }
    }
}

@Composable
fun ImsecureCard(
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = Modifier
            .width(370.dp)
            .fillMaxHeight()
            .padding(0.dp),
        shape = RoundedCornerShape(12.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Start)
                .background(Color.White),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize(), painter = painterResource(R.drawable.brins_imsecure_image),
                contentDescription = "IMSECURE Image"
            )
        }
    }
}