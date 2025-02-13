package ui.components

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brinsmobilerevampcompose.ui.theme.ButtonDarkBlueLinear1
import com.example.brinsmobilerevampcompose.ui.theme.ButtonDarkBlueLinear2
import com.example.brinsmobilerevampcompose.ui.theme.TopBarDarkBlueBackground1
import com.example.brinsmobilerevampcompose.ui.theme.TopBarDarkBlueBackground2
import com.example.brinsmobilerevampcompose.ui.theme.poppinsFontFamily
import com.example.brinsmobilerevampcompose.R


val proteksiData = mapOf(
    "Proteksi Aktif" to 10,
    "Proteksi Tidak Aktif" to 3,
    "Proteksi akan kadaluarsa" to 5,
    )

@Preview
@Composable
fun BRINSMobileAppTopBar(
    usernameAccount: String = "Winni Indah Kurniasari",
    protectionActiveCount: Int = 10,
    protectionInactiveCount: Int = 3,
    protectionExpiredCount: Int = 5
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
        shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.verticalGradient(
                        listOf(
                            TopBarDarkBlueBackground1,
                            TopBarDarkBlueBackground2
                        )
                    )
                )
                .clip(RoundedCornerShape(8.dp))
        ) {
            TopAppBar(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxHeight(),
                backgroundColor = Color.Transparent,
                contentColor = Color.White,
                elevation = 0.dp,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier = Modifier
                                .width(85.dp)
                                .height(26.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(85.dp)
                                    .height(13.34.dp),
                                painter = painterResource(R.drawable.brins_text_top_bar),
                                contentDescription = "BRINS",
                            )
                            Image(
                                modifier = Modifier
                                    .size(50.dp),
                                painter = painterResource(R.drawable.mobile_text_top_bar),
                                contentDescription = "mobile",
                            )
                        }
                        Row(
                            modifier = Modifier
                                .width(120.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.search_icon_top_bar),
                                contentDescription = "Search Icon"
                            )
                            Image(
                                painter = painterResource(R.drawable.notification_icon),
                                contentDescription = "Notification"
                            )
                            Button(modifier = Modifier
                                .width(90.dp)
                                .height(25.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(
                                        0xFF0D4D87
                                    )
                                ),
                                contentPadding = PaddingValues(2.dp),
                                shape = RoundedCornerShape(16.dp),
                                onClick = {}
                            ) {
                                Row(
                                    modifier = Modifier,
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(11.dp),
                                        painter = painterResource(R.drawable.keranjang_icon_top_bar),
                                        contentDescription = "Keranjang"
                                    )
                                    Text(
                                        "Keranjang", fontFamily = poppinsFontFamily,
                                        fontWeight = FontWeight.W400,
                                        fontSize = 10.sp,
                                        letterSpacing = -0.3.sp
                                    )
                                }
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .weight(0.8f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(
                            "Hai, ",
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.Light,
                            color = Color.White
                        )
                        Text(
                            usernameAccount,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(0.7f),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            proteksiData.mapKeys {
                                Column(
                                    modifier = Modifier,
                                ) {
                                    Text(
                                        "${it.value}",
                                        fontFamily = poppinsFontFamily,
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        it.key,
                                        fontSize = 8.sp,
                                        fontFamily = poppinsFontFamily,
                                        fontWeight = FontWeight.Light
                                    )
                                }
                            }
                        }
                        Spacer(
                            modifier = Modifier
                                .weight(0.3f)
                        )
                    }
                }

            }
        }
    }

}