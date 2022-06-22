package com.example.compose1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog


@Composable
fun DialogBox2FA(dialogClicks: () -> DialogCallback) {
    // if you want to get context here
    val contextForToast = LocalContext.current.applicationContext

    Dialog(
        onDismissRequest = {
            dialogClicks().onCloseClick()
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            elevation = 4.dp
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(color = Color(0xFF35898f)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 16.dp),
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "2-Step Verification",
                        alignment = Alignment.Center
                    )
                }

                Text(
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                    text = "2-Step Verification",
                    textAlign = TextAlign.Center,

                    )

                Text(
                    modifier = Modifier.padding(start = 12.dp, end = 12.dp),
                    text = "Setup 2-Step Verification to add additional layer of security to your account.",
                    textAlign = TextAlign.Center,

                    )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 36.dp, start = 36.dp, end = 36.dp, bottom = 8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF35898f)),
                    onClick = {
                        dialogClicks().onSetupNowClick()
                    }) {
                    Text(
                        text = "Setup Now",
                        color = Color.White,
                        style = TextStyle(

                            fontSize = 16.sp
                        )
                    )
                }
                TextButton(
                    onClick = {
                        dialogClicks().doLaterClick()
                    }) {
                    Text(
                        text = "I'll Do It Later",
                        color = Color(0xFF35898f),
                        style = TextStyle(
                            fontSize = 14.sp
                        )
                    )
                }
            }
        }
    }
}



@Composable
fun DialogBox3FA(dialogClicks: () -> DialogCallback) {

    // if you want to get context here
    val contextForToast = LocalContext.current.applicationContext

    Dialog(
        onDismissRequest = {
            dialogClicks().onCloseClick()
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            elevation = 4.dp
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(color = Color(0xFFFF5722)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 16.dp),
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "2-Step Verification",
                        alignment = Alignment.Center
                    )
                }

                Text(
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                    text = "2-Step Verification",
                    textAlign = TextAlign.Center,

                    )

                Text(
                    modifier = Modifier.padding(start = 12.dp, end = 12.dp),
                    text = "Setup 2-Step Verification to add additional layer of security to your account.",
                    textAlign = TextAlign.Center,

                    )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 36.dp, start = 36.dp, end = 36.dp, bottom = 8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722)),
                    onClick = {
                        dialogClicks().onSetupNowClick()
                    }) {
                    Text(
                        text = "Setup Now",
                        color = Color.White,
                        style = TextStyle(

                            fontSize = 16.sp
                        )
                    )
                }

            }
        }
    }
}