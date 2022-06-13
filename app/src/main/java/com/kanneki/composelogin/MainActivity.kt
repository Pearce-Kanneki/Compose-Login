package com.kanneki.composelogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kanneki.composelogin.ui.theme.ComposeLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLoginTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "intro") {
                    composable("intro") {
                        IntroPage(navController)
                    }
                    composable("login") {
                        LoginPage()
                    }
                    composable("signup") {
                        SignupPage()
                    }
                }

            }
        }
    }
}

