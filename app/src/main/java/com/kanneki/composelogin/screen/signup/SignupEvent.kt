package com.kanneki.composelogin.screen.signup

sealed class SignupEvent {
    data class SetEmail(val value: String): SignupEvent()
    data class SetUserName(val value: String): SignupEvent()
    data class SetPassword(val value: String): SignupEvent()
}
