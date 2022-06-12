package com.kanneki.composelogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun LoginPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF3D7CFB),
                        Color(0xFF91B4FC),
                        Color(0xFF3D7CFB)
                    ),
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.fillMaxHeight(.1f))
        Image(
            painter = painterResource(id = R.drawable.super_mario),
            contentDescription = "mario",
            modifier = Modifier
                .fillMaxHeight(.3f)
        )

        Spacer(modifier = Modifier.height(20.dp))

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
                value = "",
                label = { Text(text = "Account") },
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
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Login")
            }

            Spacer(modifier = Modifier.height(20.dp))
        }

        Text(
            text = "Forget Password",
            modifier = Modifier
                .fillMaxWidth(.8f)
                .padding(top = 10.dp),
            textAlign = TextAlign.End,
            color = Color.White
        )
    }

}