package com.example.cartapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartapresentacion.ui.theme.CartaPresentacionTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFd2e8d4)
                ) {
                    Info()
                }
            }
        }
    }
}

@Composable
fun Info() {
    Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){
            AndroidImage()
            ContactInformation()
    }
}


@Composable
fun AndroidImage(){
    val image = painterResource(R.drawable.android_logo)
    Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally ){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(180.dp)
                .background(color = Color(0xFF073042))
        )
        Text(
            text = stringResource(R.string.name),
            fontSize = 40.sp,
            fontWeight = FontWeight.Thin
        )
        Text(
            text = stringResource(R.string.title),
            modifier = Modifier.padding(bottom = 170.dp),
            color = Color(0xFF2f8356)
        )
    }
}


@Composable
fun ContactInformation() {
    Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.padding(bottom = 40.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Phone, contentDescription = null, tint = Color(0xFF3a8f65))
            Text(
                text = stringResource(R.string.number),
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AccountCircle, contentDescription = null, tint = Color(0xFF3a8f65))
            Text(
                text = stringResource(R.string.contact),
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Email, contentDescription = null, tint = Color(0xFF3a8f65))
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun InfoPreview() {
    CartaPresentacionTheme {
        Column(verticalArrangement = Arrangement.Bottom){
            AndroidImage()
            ContactInformation()
        }
    }
}