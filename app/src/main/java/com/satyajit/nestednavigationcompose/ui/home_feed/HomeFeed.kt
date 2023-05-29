package com.satyajit.nestednavigationcompose.ui.home_feed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
fun HomeFeed(
    onClickOfDetailsScreen: () -> Unit

) {
    Row(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.Green.copy(0.2F)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "HomeFeed", fontSize = 36.sp)

            Button(
                onClick = { onClickOfDetailsScreen.invoke() },
                Modifier.width(200.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    Color.Blue
                )
            )
            {
                Text(text = "Details Screen ", color = Color.White, fontSize = 16.sp)
            }

        }

    }
}


@Preview
@Composable
fun PreviewAuthScreen() {
    Surface {
        HomeFeed({})
    }
}
