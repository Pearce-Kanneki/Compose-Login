package com.kanneki.composelogin.screen.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.kanneki.composelogin.data.LoginData

class LoginViewModel: ViewModel() {

    var state by mutableStateOf(LoginData("",""))

    fun onEvent(event: LoginEvent) {
        when(event) {
            is LoginEvent.SetAccount -> {
                state = state.copy(account = event.value)
            }
            is LoginEvent.SetPassword -> {
                state = state.copy(password = event.value)
            }
        }
    }
}