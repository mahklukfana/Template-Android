package com.mhyne.template.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.mhyne.template.core.data.repository.AppRepository
import com.mhyne.template.core.data.source.remote.request.LoginRequest
import com.mhyne.template.core.data.source.remote.request.RegisterRequest

class AuthViewModel(val repo: AppRepository): ViewModel() {

    fun login(data: LoginRequest) = repo.login(data).asLiveData()
    fun register(data: RegisterRequest) = repo.register(data).asLiveData()
}