package com.example.systrackerrel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MapScreen(onBackClick: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Headboard("Map", onBackClick = onBackClick)
        Box(
            Modifier
                .fillMaxSize(),
            Alignment.Center
        ) {}
    }
}