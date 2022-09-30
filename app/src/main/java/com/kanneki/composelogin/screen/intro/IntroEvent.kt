package com.kanneki.composelogin.screen.intro

sealed class IntroEvent {
    object NavLogin: IntroEvent()
    object NavSignup: IntroEvent()
    object NavClear: IntroEvent()
}
