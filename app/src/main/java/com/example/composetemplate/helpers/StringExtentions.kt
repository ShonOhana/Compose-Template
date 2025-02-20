package com.example.composetemplate.helpers

fun String.isValidEmail(): Boolean {
    val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
    return emailRegex.matches(this)
}

fun String.isValidPassword(): Boolean {
    return this.length > 3
}

fun String.isValidFullName(): Boolean {
    val fullNameRegex = Regex("[a-zA-Z]+( [a-zA-Z]+)+")
    return fullNameRegex.matches(this)
}