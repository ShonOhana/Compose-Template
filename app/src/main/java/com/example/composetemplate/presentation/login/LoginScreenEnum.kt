package com.example.composetemplate.presentation.login

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

enum class LoginScreenEnum {
    EMAIL, PASSWORD, FULL_NAME, CONFIRM_PASSWORD ;

    fun getPlaceHolder(): String{
        return when(this) {
            EMAIL -> "Email"
            PASSWORD -> "Password"
            FULL_NAME -> "Full Name"
            CONFIRM_PASSWORD -> "Confirm Password"
        }
    }

    fun getKeyboardOptions(): KeyboardOptions {
        return when(this) {
            EMAIL -> KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
            CONFIRM_PASSWORD,
            PASSWORD -> KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
            FULL_NAME -> KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
        }
    }

    fun getVisualTransformation(): VisualTransformation {
        return when(this) {
            FULL_NAME,
            EMAIL -> VisualTransformation.None
            CONFIRM_PASSWORD,
            PASSWORD ->  PasswordVisualTransformation()
        }
    }

}