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
import androidx.compose.foundation.layout.wrapContentHeight
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
fun MainScreen(onImportClick: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Headboard("Tracker")
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
                        title = "Welcome Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Welcome back!")
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
                            Slot("Import", Modifier.clickable(onClick = onImportClick))
                            Spacer(modifier = Modifier.height(12.dp))
                            Slot("View Map", Modifier.clickable { })
                            Spacer(modifier = Modifier.height(12.dp))
                            Slot("Profiles", Modifier.clickable { })
                            Spacer(modifier = Modifier.height(12.dp))
                            Slot("Setting", Modifier.clickable { })

                        }
                    }
                }
            }
        }
    }
}


@Composable
fun Slot(fieldName: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .border(3.dp, Color.DarkGray)
            .fillMaxWidth(0.7f)
            .wrapContentHeight()
            .padding(4.dp),

        Alignment.Center

    ) {
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = fieldName,
            modifier = Modifier,
            style = TextStyle(fontSize = 25.sp)
        )
        Spacer(modifier = Modifier.height(12.dp))
    }
}

@Composable
fun Headboard(pageName: String, modifier: Modifier = Modifier) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Blue)
            .padding(4.dp),
        Alignment.BottomCenter
    ) {
        Text(
            text = pageName,
            color = Color.White,
            style = TextStyle(fontSize = 25.sp)
        )
    }
}
