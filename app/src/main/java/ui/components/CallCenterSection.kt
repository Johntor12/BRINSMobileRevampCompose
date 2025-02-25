package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.brinsmobilerevampcompose.ui.theme.ButtonOrangeLinear1
import com.example.brinsmobilerevampcompose.ui.theme.GrayTextFormCallCenter
import com.example.brinsmobilerevampcompose.ui.theme.GrayTextInFormCallCenter
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily


data class CallCenterData(
    val nama: String,
    val nomorKlaim: String,
    val kodeWilayah: String,
    val platKendaraan: String
)

@Composable
fun CallCenterSection(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
    ) {
        CallCenterCard(navController)
    }

}

@Composable
fun CallCenterCard(navController: NavController) {

    var textNama: String = "Masukkan Nama";
    var textNomorKlaim: String = "Masukkan Nomor Klaim";
    var textMasukkanPlatKendaraan: String = "Masukkan Nomor Plat Kendaraan";

    Card(
        modifier = Modifier
            .height(300.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp)
            ),
        shape = RoundedCornerShape(18.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                "Pencarian",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold
            )
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    "Nama",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    color = GrayTextInFormCallCenter
                )
                Row(
                    modifier = Modifier
                        .background(GrayTextFormCallCenter)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp)),

                    ) {
                    BasicTextField(
                        value = textNama,
                        onValueChange = { textNama = it },
                        textStyle = TextStyle(
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.W400,
                            color = GrayTextInFormCallCenter,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(Color.Transparent)
                    )
                }

            }
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    "Nomor Klaim",
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinsFontFamily,
                    color = GrayTextInFormCallCenter
                )
                Row(
                    modifier = Modifier
                        .background(GrayTextFormCallCenter)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp)),

                    ) {
                    BasicTextField(
                        value = textNomorKlaim,
                        onValueChange = { textNomorKlaim = it },
                        textStyle = TextStyle(
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.W400,
                            color = GrayTextInFormCallCenter,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(Color.Transparent)
                    )
                }

            }
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    "Wilayah/Plat Kendaraan",
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinsFontFamily,
                    color = GrayTextInFormCallCenter
                )
                Row(
                    modifier = Modifier
                        .background(GrayTextFormCallCenter)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp)),

                    ) {
                    BasicTextField(
                        value = textMasukkanPlatKendaraan,
                        onValueChange = { textMasukkanPlatKendaraan = it },
                        textStyle = TextStyle(
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.W400,
                            color = GrayTextInFormCallCenter,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(Color.Transparent)
                    )
                }

            }
            Button (
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(ButtonOrangeLinear1),
                shape = RoundedCornerShape(10.dp),
                onClick = { navController.navigate("")  }

            ) {
                Text(
                    "Lanjutkan",
                    color = Color.White,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.SemiBold
                )
            }

        }
    }
}