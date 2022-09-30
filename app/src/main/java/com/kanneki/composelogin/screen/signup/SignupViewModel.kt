package com.kanneki.composelogin.screen.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.kanneki.composelogin.data.SignupData

class SignupViewModel: ViewModel() {

    var state by mutableStateOf(SignupData("","", ""))

    fun onEvent(event: SignupEvent) {
        when(event) {
            is SignupEvent.SetEmail -> {
                state = state.copy(email = event.value)
            }
            is SignupEvent.SetUserName -> {
                state = state.copy(userName = event.value)
            }
            is SignupEvent.SetPassword -> {
                state = state.copy(password = event.value)
            }
        }
    }
}