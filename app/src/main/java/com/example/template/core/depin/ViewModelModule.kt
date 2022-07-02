package com.example.template.core.depin

import com.example.template.ui.auth.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
viewModel { AuthViewModel(get()) }
}