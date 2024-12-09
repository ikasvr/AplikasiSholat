package com.example.aplikasisholat

import android.media.Image
import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun RewardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0088A7))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Reward",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Budi, pencapaianmu belum terakumulasi",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "1000",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 16.dp)
            )
        }

        // Tombol home (sesuaikan dengan library icon yang Anda gunakan)
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
        )

        // Gambar masjid (sesuaikan dengan resource gambar Anda)
        Image(
            painter = painterResource(id = R.drawable.ic_mosque),
            contentDescription = "Masjid",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        )
    }
}