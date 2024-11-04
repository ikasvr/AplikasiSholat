package com.example.aplikasisholat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplikasisholat.ui.theme.AplikasiSholatTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplikasiSholatTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting3(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
   LoginScreen()
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    AplikasiSholatTheme {
        Greeting3("Android")
    }
}
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Surface(modifier = Modifier.fillMaxSize(), color = Color.Blue) {
        // Konten lainnya bisa ditambahkan di sini
        Column(
            modifier = Modifier.padding(50.dp)
                .background(color = Color(0xFF0088A7))
                .height(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement
            = Arrangement.Center
        ) {

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation()

            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {}
                )
                Text("Remember Me")
                TextButton(onClick = { /* Handle forgot password */ }) {
                    Text("Forgot Password?")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Handle login */ },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 40.dp)) {
                Text("Login")
            }
        }


    }
}