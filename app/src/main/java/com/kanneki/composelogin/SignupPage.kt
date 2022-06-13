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
import com.kanneki.composelogin.ui.theme.accent
import com.kanneki.composelogin.ui.theme.primary

@Preview
@Composable
fun SignupPage() {
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

        SignupInput()
    }
}

@Composable
fun SignupInput() {
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
            value = "",
            label = { Text(text = "Email") },
            onValueChange = {},
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
            value = "",
            label = { Text(text = "User Name") },
            onValueChange = {},
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
            value = "",
            label = { Text(text = "Password") },
            onValueChange = {},
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