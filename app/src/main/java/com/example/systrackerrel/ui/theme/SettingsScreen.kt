package com.example.systrackerrel.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.systrackerrel.Headboard
import com.example.systrackerrel.Heading

@Composable
fun SettingsScreen(
    onBackClick: () -> Unit
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Headboard("Settings", onBackClick = onBackClick)
        Box(
            Modifier
                .fillMaxSize(),
            Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight(0.7f)
                    .border(5.dp, Color.Black)
                    .shadow(12.dp)
                    .background(Color.LightGray)
                    .padding(15.dp),
                Alignment.Center
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Heading(
                        title = "Edit your settings",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("")
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        Modifier
                            .fillMaxSize(0.9f),
                        Alignment.BottomCenter
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                        }
                    }
                }
            }
        }
    }
}