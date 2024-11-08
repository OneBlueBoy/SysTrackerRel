package com.example.systrackerrel.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.systrackerrel.Headboard

@Composable
fun ProfilesScreen(onBackClick: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Headboard("Profiles", onBackClick = onBackClick)
        Box(
            Modifier
                .fillMaxSize(),
            Alignment.Center
        ) {}
    }
}