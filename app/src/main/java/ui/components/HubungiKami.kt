package ui.components

import android.app.Notification.Action
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brinsmobilerevampcompose.R
import com.example.brinsmobilerevampcompose.ui.theme.GrayTextFiturUnggulanDesc
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily


data class CallUs(
    val hubungiKamiName: String,
    val hubungiKamiIcon: Int,
    val hubungiKamiOnClick: @Composable (() -> Unit)? = {}
)

val hubungiKamiIcon = listOf(
    R.drawable.live_chat_melisha_hubungikami,
    R.drawable.call_center_hubungikami,
    R.drawable.kirim_email,
    R.drawable.whatsapp_icon_hubungikami,
    R.drawable.call_center_bebas_pulsa_hubungikami
)

val hubungiKamiList = mutableListOf(
    CallUs("Live Chat Melisha", R.drawable.live_chat_melisha_hubungikami),
    CallUs("Call Center", R.drawable.call_center_hubungikami),
    CallUs("Kirim Email", R.drawable.kirim_email),
    CallUs("Whatsapp", R.drawable.whatsapp_icon_hubungikami),
    CallUs("Call Center Bebas Pulsa", R.drawable.call_center_bebas_pulsa_hubungikami)
)


@Preview
@Composable
fun HubungiKamiSection() {
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
            horizontalAlignment = Alignment.Start
        ) {
            Column(modifier = Modifier) {
//                Spacer(modifier = Modifier
//                    .fillMaxWidth()
//                    .height(10.dp))
                Text(
                    text = "Hubungi Kami",
                    fontSize = 15.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

                Text(
                    text = "Kami siap 24 jam melayani dengan aman, nyaman dan cepat",
                    fontSize = 10.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.W400,
                    color = GrayTextFiturUnggulanDesc
                )
            }
            LazyVerticalGrid(
                modifier = Modifier
                    .padding(
                        top = 8.dp
                    ),
                columns = GridCells.Fixed(count = 4),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                hubungiKamiList.forEach { data ->
                    item() {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            HubungiKamiCard(
                                modifier = Modifier,
                                hubungiKamiIcon = data.hubungiKamiIcon
                            )
                            Text(
                                data.hubungiKamiName,
                                fontFamily = poppinsFontFamily,
                                fontSize = 10.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun HubungiKamiCard(
    modifier: Modifier = Modifier,
    hubungiKamiIcon: Int = R.drawable.klaim_service_icon,
    hubungiKamiOnClick: () -> Unit = {}
) {

    Card(
        modifier = Modifier
            .requiredSize(60.dp),
        colors = CardDefaults.cardColors(Color(0xFFE8F4FF)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier,
                painter = painterResource(hubungiKamiIcon), contentDescription = "Hubungi Kami Icon"
            )
        }
    }
}