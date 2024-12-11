package com.example.aplikasisholat

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Image(
//            painter = painterResource(id = R.drawable.ic_profile_picture),
//            contentDescription = "Profile Picture",
//            modifier = Modifier.size(100.dp)
//        )
        Text(
            text = "Budi Santoso",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "example@gmail.com",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "Batam, 01 Januari 2007",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "17170029",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "X TKJ 1",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        // Tambahkan elemen lain seperti ikon, tombol, dll di sini
    }
}