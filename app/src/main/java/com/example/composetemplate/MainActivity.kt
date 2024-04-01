package com.example.composetemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.composetemplate.navigation.navhost.LoginNavHost
import com.example.composetemplate.presentation.login.LoginScreen
import com.example.composetemplate.presentation.register.RegisterScreen
import com.example.composetemplate.ui.theme.ComposeTemplateTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTemplateTheme {

                // set the system bar color to what I want
                val systemController = rememberSystemUiController()
                SideEffect {
                    systemController.setSystemBarsColor(
                        color = Color.Black,
                    )
                }

                val navHostController = rememberNavController()
                LoginNavHost(navHostController = navHostController)

//                LoginScreen()
//                RegisterScreen()
            }
        }
    }
}

