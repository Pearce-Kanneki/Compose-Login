package com.kanneki.composelogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kanneki.composelogin.data.SignupData
import com.kanneki.composelogin.screen.signup.SignupEvent
import com.kanneki.composelogin.screen.signup.SignupViewModel
import com.kanneki.composelogin.ui.theme.accent
import com.kanneki.composelogin.ui.theme.primary

@Composable
fun SignupScreen(viewModel: SignupViewModel) {
    val state = viewModel.state

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        primary,
                        primary.copy(alpha = .5f),
                        primary.copy(alpha = .3f),
                        primary
                    ),
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.fillMaxHeight(.1f))
        Image(
            painter = painterResource(id = R.drawable.supermario),
            contentDescription = "mario",
            modifier = Modifier
                .fillMaxHeight(.3f)
        )

        Spacer(modifier = Modifier.height(20.dp))

        SignupInput(state) {
            viewModel.onEvent(it)
        }
    }
}

@Composable
fun SignupInput(state: SignupData, callback: (SignupEvent) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth(.8f)
            .background(
                color = Color.White.copy(alpha = .4f),
                shape = RoundedCornerShape(20.dp)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "email"
                )
            },
            value = state.email,
            label = { Text(text = "Email") },
            onValueChange = {
                callback(SignupEvent.SetEmail(it))
            },
            modifier = Modifier
                .fillMaxWidth(.85f)
                .padding(top = 20.dp),
            shape = RoundedCornerShape(40.dp),
            maxLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color(0xFF3D7CFB),
                backgroundColor = Color.White
            ),
        )

        OutlinedTextField(
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "account"
                )
            },
            value = state.userName,
            label = { Text(text = "User Name") },
            onValueChange = {
                callback(SignupEvent.SetUserName(it))
            },
            modifier = Modifier
                .fillMaxWidth(.85f)
                .padding(top = 20.dp),
            shape = RoundedCornerShape(40.dp),
            maxLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color(0xFF3D7CFB),
                backgroundColor = Color.White
            ),
        )

        OutlinedTextField(
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "account"
                )
            },
            value = state.password,
            label = { Text(text = "Password") },
            onValueChange = {
                callback(SignupEvent.SetPassword(it))
            },
            modifier = Modifier
                .fillMaxWidth(.85f)
                .padding(top = 20.dp),
            shape = RoundedCornerShape(40.dp),
            maxLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color(0xFF3D7CFB),
                backgroundColor = Color.White
            ),
            visualTransformation = PasswordVisualTransformation(),
        )

        Button(
            modifier = Modifier
                .fillMaxWidth(.85f)
                .padding(top = 20.dp),
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = accent),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Signup", color = Color.White)
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Preview
@Composable
fun SignupScreenPreview() {
    val viewModel = SignupViewModel()
    SignupScreen(viewModel = viewModel)
}