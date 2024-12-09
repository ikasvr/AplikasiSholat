package com.example.aplikasisholat

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SuccessScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2196F3)) // Sesuaikan warna latar belakang
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.CloudDone,
                contentDescription = "Success",
                modifier = Modifier.size(96.dp),
                tint = Color.White
            )
            Text(
                text = "Success!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* Aksi saat tombol "Back" ditekan */ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF0088A7)
                )
            ) {
                Text(text = "Back")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Aksi saat tombol "Home" ditekan */ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF0088A7)
                )
            ) {
                Text(text = "Home")
            }
        }
    }
}