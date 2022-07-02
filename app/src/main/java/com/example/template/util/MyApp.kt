package com.example.template.util

import android.app.Application
import com.chibatching.kotpref.Kotpref
import com.example.template.core.depin.appModule
import com.example.template.core.depin.repositoryModule
import com.example.template.core.depin.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Kotpref.init(this)
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}