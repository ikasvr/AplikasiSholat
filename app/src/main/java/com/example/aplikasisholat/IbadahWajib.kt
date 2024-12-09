package com.example.aplikasisholat

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IbadahWajibScreen() {
    val sholatList = listOf(
        SholatData("Subuh", R.drawable.subuh_image),
        SholatData("Dzuhur", R.drawable.dzuhur_image),
        SholatData("Ashar", R.drawable.ashar_image),
        SholatData("Magrib", R.drawable.magrib_image),
        SholatData("Isya", R.drawable.isya_image)
    )

    Column {
        Text(text = "Ibadah Wajib", style = MaterialTheme.typography.bodyLarge)
        Text(text = "01-01-2025", style = MaterialTheme.typography.bodyLarge)

        sholatList.forEach { sholat ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = sholat.imageResId),
                    contentDescription = sholat.name,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = sholat.name)
                Spacer(modifier = Modifier.weight(1f))
//                Checkbox(
//                    checked = true, // Ganti dengan logika untuk mengecek status sholat
//                    onCheckedChange = { /* ... */ }
//                )
            }
        }

        Button(onClick = { /* ... */ }) {
            Text(text = "Next")
        }
    }
}

//@Composable
//fun Checkbox(checked: Boolean, onCheckedChange: () -> Unit) {
//    TODO("Not yet implemented")
//}

data class SholatData(
    val name: String,
    val imageResId: Int
)