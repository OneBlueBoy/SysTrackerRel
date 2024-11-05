package com.example.systrackerrel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.systrackerrel.ui.theme.SysTrackerRelTheme

enum class Navigation {
    MainScreen, ImportScreen
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var currentScreen by remember { mutableStateOf(Navigation.MainScreen) }
            SysTrackerRelTheme {
                when (currentScreen) {
                    Navigation.MainScreen -> MainScreen(onImportClick = {
                        currentScreen = Navigation.ImportScreen
                    })

                    Navigation.ImportScreen -> ImportScreen(onBackClick = {
                        currentScreen = Navigation.MainScreen
                    })
                }
            }
        }
    }

}
