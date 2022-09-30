package com.kanneki.composelogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kanneki.composelogin.screen.intro.IntroEvent
import com.kanneki.composelogin.screen.intro.IntroViewModel
import com.kanneki.composelogin.screen.login.LoginViewModel
import com.kanneki.composelogin.screen.signup.SignupViewModel
import com.kanneki.composelogin.ui.theme.ComposeLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLoginTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Until.NAV_INTRO) {
                    composable(Until.NAV_INTRO) {
                        val introViewModel by viewModels<IntroViewModel>()
                        IntroScreen(introViewModel)

                        LaunchedEffect(introViewModel.navValue) {
                            if (introViewModel.navValue.isNotBlank()) {
                                navController.navigate(introViewModel.navValue)
                                introViewModel.onEvent(IntroEvent.NavClear)
                            }
                        }
                    }
                    composable(Until.NAV_LOGIN) {
                        val loginViewModel by viewModels<LoginViewModel>()
                        LoginScreen(loginViewModel)
                    }
                    composable(Until.NAV_SIGNUP) {
                        val signupViewModel by viewModels<SignupViewModel>()
                        SignupScreen(signupViewModel)
                    }
                }

            }
        }
    }
}

