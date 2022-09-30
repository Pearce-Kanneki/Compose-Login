package com.kanneki.composelogin.screen.intro

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.kanneki.composelogin.Until

class IntroViewModel: ViewModel() {

    var navValue by mutableStateOf("")

    fun onEvent(event: IntroEvent) {
        when(event) {
            is IntroEvent.NavLogin -> navValue = Until.NAV_LOGIN
            is IntroEvent.NavSignup -> navValue = Until.NAV_SIGNUP
            is IntroEvent.NavClear -> navValue = ""
        }
    }
}