package com.mhyne.template.core.data.repository

import com.mhyne.template.core.data.source.local.LocalDataSource
import com.mhyne.template.core.data.source.remote.RemoteDataSource
import com.mhyne.template.core.data.source.remote.network.Resource
import com.mhyne.template.core.data.source.remote.request.LoginRequest
import com.mhyne.template.core.data.source.remote.request.RegisterRequest
import com.mhyne.template.util.SharedPreference
import com.inyongtisto.myhelper.extension.getErrorBody
import com.inyongtisto.myhelper.extension.logs
import kotlinx.coroutines.flow.flow

class AppRepository(val local: LocalDataSource, val remote: RemoteDataSource) {

    fun login(data : LoginRequest) = flow{
        emit(Resource.loading(null))
        try {
            remote.login(data).let {
                if (it.isSuccessful) {
                    SharedPreference.isLogin = true
                    val body = it.body()
                    val user = body?.data
                    SharedPreference.setUser(user)
                    emit(Resource.success(user))
                    logs("success: " + body.toString())
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Terjadi Kesalahan", null))
                    logs("Error:" + "keterangan error")
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message?: "Terjadi Kesalahan",null))
            logs("Error:" + e.message)
        }
    }

    fun register(data : RegisterRequest) = flow{
        emit(Resource.loading(null))
        try {
            remote.register(data).let {
                if (it.isSuccessful) {
                    SharedPreference.isLogin = true
                    val body = it.body()
                    val user = body?.data
                    SharedPreference.setUser(user)
                    emit(Resource.success(user))
                    logs("success: " + body.toString())
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Terjadi Kesalahan", null))
                    logs("Error:" + "keterangan error")
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message?: "Terjadi Kesalahan",null))
            logs("Error:" + e.message)
        }
    }

}