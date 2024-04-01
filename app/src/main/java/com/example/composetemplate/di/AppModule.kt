package com.example.composetemplate.di

import com.example.composetemplate.presentation.login.LoginViewModel
import com.example.composetemplate.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginViewModel() }
    viewModel { RegisterViewModel() }
}