package com.example.compose1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.compose1.databinding.ActivityMainBinding
import com.example.compose1.ui.theme.Compose1Theme

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDialog.setOnClickListener {
            setContent {
                Compose1Theme() {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = MaterialTheme.colors.background),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        val openDialog by remember {
                            mutableStateOf(true) // Initially dialog is closed
                        }
                        if (openDialog) {
                            DialogBox3FA {
                                object : DialogCallback {
                                    override fun onSetupNowClick() {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "Click: Setup Now",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        setContentView(binding.root)
                                    }

                                    override fun doLaterClick() {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "Click: do Later",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        setContentView(binding.root)
                                    }
                                    override fun onCloseClick() {
                                        setContentView(binding.root)
                                    }
                                }
                            }


                        }
                    }
                }


            }
        }
    }



   /* @Composable
    fun DialogBox2FA( onDismiss: () -> Unit) {
        val contextForToast = LocalContext.current.applicationContext

        Dialog(
            onDismissRequest = {
                onDismiss()
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
                            onDismiss()
                            Toast.makeText(
                                contextForToast,
                                "Click: Setup Now",
                                Toast.LENGTH_SHORT
                            ).show()

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
                            onDismiss()
                            Toast.makeText(
                                contextForToast,
                                "Click: I'll Do It Later",
                                Toast.LENGTH_SHORT
                            ).show()
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
    }*/


}