package com.kanneki.composelogin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kanneki.composelogin.ui.theme.accent
import com.kanneki.composelogin.ui.theme.primary


@Composable
fun IntroPage(navController: NavController) {
    Box {
        Surface(color = primary, modifier = Modifier.fillMaxSize()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp)
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(.8f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = accent),
                    onClick = { navController.navigate("login") }
                ) {
                    Text(text = "Login", color = Color.White)
                }

                OutlinedButton(
                    modifier = Modifier
                        .fillMaxWidth(.8f)
                        .padding(top = 20.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    colors = ButtonDefaults.buttonColors(backgroundColor = primary),
                    onClick = { navController.navigate("signup") }
                ) {
                    Text(text = "SignUp", color = Color.White)
                }
            }
        }

        Surface(
            color = Color.White,
            modifier = Modifier
                .fillMaxHeight(.75f)
                .fillMaxWidth(),
            shape = RoundedCornerShape(60.dp).copy(
                topStart = ZeroCornerSize,
                topEnd = ZeroCornerSize
            ),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.fillMaxHeight(.25f))
                Text(
                    text = "Welcome",
                    style = MaterialTheme.typography.h2
                )
                Text(
                    text = "Demo 登入與註冊頁面範本",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(top = 20.dp)
                )
                Image(
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth(),
                    painter = painterResource(id = R.drawable.dashboard),
                    contentDescription = "dashboard",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Preview
@Composable
fun PrevIntro() {
    val nav = rememberNavController()
    IntroPage(navController = nav)
}