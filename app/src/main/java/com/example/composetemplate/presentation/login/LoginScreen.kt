package com.example.composetemplate.presentation.login

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetemplate.di.appModule
import com.example.composetemplate.helpers.isValidEmail
import com.example.composetemplate.helpers.isValidPassword
import com.example.composetemplate.presentation.common.LoginScreenButton
import com.example.composetemplate.presentation.common.LoginTextField
import com.example.composetemplate.ui.theme.ComposeTemplateTheme
import org.koin.androidx.compose.koinViewModel
import org.koin.core.Koin
import org.koin.core.KoinApplication
import org.koin.dsl.koinApplication


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = koinViewModel(),
    onRegisterPagePageClick: () -> Unit
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.45f)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            //todo: add google auth and logo
        }

        LoginTextField(
            modifier,
            text = viewModel.loginState.email,
            loginScreenEnum = LoginScreenEnum.EMAIL,
            isValid = viewModel.loginState.isEmailValid,
            onValueChange = {
                viewModel.onEvent(LoginEvent.UpdateEmail(it))
            }
        )

        LoginTextField(
            modifier,
            text = viewModel.loginState.password,
            loginScreenEnum = LoginScreenEnum.PASSWORD,
            isValid = viewModel.loginState.isPasswordValid,
            onValueChange = {
                viewModel.onEvent(LoginEvent.UpdatePassword(it))
            }
        )

        LoginScreenButton(
            modifier = modifier.padding(top = 32.dp),
            isEnabled = viewModel.loginState.isValidLoginPage,
            text = "Login"
        ) {
            //todo: onClick
        }

        Text(
            modifier = modifier.padding(top = 8.dp)
                .clickable { onRegisterPagePageClick() },
            text = "Don't have an account? Register! ",
            color = Color.White,
            style = MaterialTheme.typography.labelLarge
        )

    }
}



@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun LoginScreenPrev() {
    ComposeTemplateTheme {
        LoginScreen(viewModel = LoginViewModel()){}
    }
}
