package com.mhyne.template.core.data.source.remote.network

import com.mhyne.template.core.data.source.remote.request.LoginRequest
import com.mhyne.template.core.data.source.remote.request.RegisterRequest
import com.mhyne.template.core.data.source.remote.response.LoginResponse
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    /**
     * Auth
     */
    @POST("login")
    suspend fun login(
//        cara 1
        @Body login : LoginRequest
    ):Response<LoginResponse>

    @POST("register")
    suspend fun register(
        @Body data: RegisterRequest
    ):Response<LoginResponse>
}