package com.example.aplikasisholat

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                .align(Alignment.Center)
                .padding(16.dp)
        ) {
            Text(
                text = "Reward",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Budi, Alhamdulillah pencapaianmu bulan ini",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Repeat(times = 5) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star"
                    )
                }
            }
        }
    }
}