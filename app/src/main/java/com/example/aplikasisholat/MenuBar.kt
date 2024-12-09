package com.example.aplikasisholat

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//@Composable
//fun NavigationDrawer() {
//    val scaffoldState = rememberScaffoldState()
//
//    Scaffold(
//        scaffoldState = scaffoldState,
//        drawerContent = {
//            DrawerContent()
//        }
//    ) {
//
//    }
//}

@Composable
fun DrawerContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Home",
            modifier = Modifier.clickable { /* Navigasi ke halaman Home */ }
        )
        Text(
            text = "Account",
            modifier = Modifier.clickable { /* Navigasi ke halaman Account */ }
        )
        Text(
            text = "Settings",
            modifier = Modifier.clickable { /* Navigasi ke halaman Settings */ }
        )
        Text(
            text = "Daily Checking",
            modifier = Modifier.clickable { /* Navigasi ke halaman Daily Checking */ }
        )
        Text(
            text = "Log Out",
            modifier = Modifier.clickable { /* Lakukan log out */ }
        )
    }
}