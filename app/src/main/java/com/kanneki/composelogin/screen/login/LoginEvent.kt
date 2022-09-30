package com.kanneki.composelogin.screen.login

sealed class LoginEvent {
    data class SetAccount(val value: String): LoginEvent()
    data class SetPassword(val value: String): LoginEvent()
}
