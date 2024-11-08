package com.example.systrackerrel

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImportScreen(onBackClick: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            Modifier
                .fillMaxSize()
                .background(color = Color.White)
        )
        Headboard("Import", onBackClick = onBackClick)
        Box(
            Modifier
                .fillMaxSize()
                .background(color = Color.White),
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
                        title = "Chose whose data to import",
                        modifier = Modifier.padding(innerPadding)

                    )
                    MessageLine("Your existing data will not be deleted, however changes will be applied")

                    Box(
                        Modifier
                            .fillMaxSize(0.9f),
                        Alignment.BottomCenter
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Slot("My Own", Modifier.clickable {})
                            Spacer(modifier = Modifier.height(12.dp))
                            Slot("My Partners", Modifier.clickable { })
                            Spacer(modifier = Modifier.height(12.dp))
                            Slot("A Friends", Modifier.clickable { })

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Heading(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        modifier = modifier,
        style = TextStyle(fontSize = 25.sp)
    )
}

@Composable
fun MessageLine(message: String, modifier: Modifier = Modifier) {
    Spacer(modifier = Modifier.height(4.dp))
    Text(message)
    Spacer(modifier = Modifier.height(8.dp))
}


