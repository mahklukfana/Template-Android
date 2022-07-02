package com.example.template.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.template.core.data.repository.AppRepository
import com.example.template.core.data.source.remote.request.LoginRequest
import com.example.template.core.data.source.remote.request.RegisterRequest

class AuthViewModel(val repo: AppRepository): ViewModel() {

    fun login(data: LoginRequest) = repo.login(data).asLiveData()
    fun register(data: RegisterRequest) = repo.register(data).asLiveData()
}