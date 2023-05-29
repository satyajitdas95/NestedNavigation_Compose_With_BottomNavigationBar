package com.satyajit.nestednavigationcompose.ui.auth_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(
    onClickOfLogin: () -> Unit,
    onclickOfSignUp: () -> Unit,
    onclickOfForgotPassword: () -> Unit
) {
    Row(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Welcome", fontSize = 36.sp)

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { onClickOfLogin.invoke() },
                Modifier.width(200.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    Color.Blue
                )
            )
            {
                Text(text = "Login to Explore", color = Color.White, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { onclickOfSignUp.invoke() },
                Modifier.width(200.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    Color.Blue
                )
            )
            {
                Text(text = "Sign up", color = Color.White, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { onclickOfForgotPassword.invoke() },
                Modifier.width(200.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    Color.Blue
                )
            )
            {
                Text(text = "Forgot Password", color = Color.White, fontSize = 16.sp)
            }

        }

    }
}


@Preview
@Composable
fun PreviewAuthScreen() {
    Surface {
        LoginScreen({}, {}, {})
    }
}
