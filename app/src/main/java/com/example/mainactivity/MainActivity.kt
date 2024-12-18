package com.example.mainactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainactivity.ui.theme.MainActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Login", fontSize = 30.sp, fontWeight = FontWeight.Bold,
            style = androidx.compose.ui.text.TextStyle(
                shadow = Shadow(
                    color = Color.DarkGray,
                    offset = Offset(4f, 4f),
                    blurRadius = 8f
                )
            )
        )
        Text(
            text = "Ini adalah halaman Login",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                ),
            modifier = Modifier.padding(top = 10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.logoumy), contentDescription = null,
            Modifier.size(250.dp)
        )

        // Membuat Teks "Nama"
        Text(
            text = "Nama",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,

                ),
            modifier = Modifier.padding(top = 20.dp)
        )

        // Membuat Nama "Nadila Zaskia Aulia"
        Text(
            text = "Nadila Zaskia Aulia",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 23.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Monospace,
                color = Color(0xFF473100)

            ),
            modifier = Modifier.padding(top = 10.dp)
        )

        // Membuat NIM "20220140012"
        Text(
            text = "20220140012",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.Serif,
                color = Color.DarkGray,

                ),
            modifier = Modifier.padding(top = 10.dp)
        )

        // Gambar foto diri
        Image(
            painter = painterResource(id = R.drawable.fotodiri),
            contentDescription = "Foto Diri",
            modifier = Modifier
                .padding(top = 5.dp)
                .size(450.dp)
                .clip(RoundedCornerShape(525.dp))
                .border(
                    width = 5.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(125.dp)
                )
                .padding(10.dp)
        )


    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainActivityTheme {
        Greeting("Android")
    }
}