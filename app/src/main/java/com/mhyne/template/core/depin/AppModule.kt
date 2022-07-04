package com.mhyne.template.core.depin

import com.mhyne.template.core.data.source.local.LocalDataSource
import com.mhyne.template.core.data.source.remote.RemoteDataSource
import com.mhyne.template.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }
    single { RemoteDataSource(get()) }
    single { LocalDataSource() }

}