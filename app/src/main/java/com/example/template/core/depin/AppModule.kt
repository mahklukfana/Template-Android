package com.example.template.core.depin

import com.example.template.core.data.source.local.LocalDataSource
import com.example.template.core.data.source.remote.RemoteDataSource
import com.example.template.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }
    single { RemoteDataSource(get()) }
    single { LocalDataSource() }

}