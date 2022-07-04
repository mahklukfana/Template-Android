package com.mhyne.template.core.depin

import com.mhyne.template.ui.auth.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
viewModel { AuthViewModel(get()) }
}