package com.example.composetemplate.presentation.login

import com.example.composetemplate.helpers.isValidEmail
import com.example.composetemplate.helpers.isValidFullName
import com.example.composetemplate.helpers.isValidPassword

data class LoginState(
    val fullName: String = "",
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = ""
) {

    val isFullNameValid: Boolean
        get() = fullName.isValidFullName()

    val isEmailValid: Boolean
        get() = email.isValidEmail()

    val isPasswordValid: Boolean
        get() = password.isValidPassword()

    val isConfirmPasswordValid: Boolean
        get() = password == confirmPassword

    val isValidLoginPage: Boolean
        get() = email.isValidEmail() && password.isValidPassword()

    val isValidRegisterPage: Boolean
        get() = isFullNameValid && isEmailValid && isPasswordValid && isConfirmPasswordValid
}