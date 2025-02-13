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


data class Service(
    val serviceName: String,
    val serviceIcon: Int,
    val serviceOnClick: @Composable (() -> Unit)? = {}
)

val listIcon = listOf(
    R.drawable.klaim_service_icon,
    R.drawable.lacak_kirim_service_icon,
    R.drawable.bengkel_rekanan_service_icon,
    R.drawable.ticket_service_icon,
    R.drawable.location_service_icon
)

val serviceList = mutableListOf(
    Service("Klaim", R.drawable.klaim_service_icon),
    Service("Lacak Klaim", R.drawable.lacak_kirim_service_icon),
    Service("Bengkel Rekanan", R.drawable.bengkel_rekanan_service_icon),
    Service("Pengaduan", R.drawable.ticket_service_icon),
    Service("Layanan Terdekat", R.drawable.location_service_icon)
)


@Preview
@Composable
fun LayananSection() {
    Column(
        modifier = Modifier
            .height(360.dp)
            .padding(4.dp)
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
                    text = "Layanan",
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
            LazyVerticalGrid(
                modifier = Modifier
                    .padding(
                        top = 8.dp
                    ),
                columns = GridCells.Fixed(count = 4),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                serviceList.forEach { data ->
                    item() {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            LayananCard(
                                modifier = Modifier,
                                layananIcon = data.serviceIcon
                            )
                            Text(
                                data.serviceName,
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
fun LayananCard(
    modifier: Modifier = Modifier,
    layananIcon: Int = R.drawable.klaim_service_icon,
    layananOnClick: () -> Unit = {}
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
                painter = painterResource(layananIcon), contentDescription = "Layanan Icon"
            )
        }
    }
}