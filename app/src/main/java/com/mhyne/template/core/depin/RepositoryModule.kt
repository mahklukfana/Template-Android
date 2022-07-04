package com.mhyne.template.core.depin

import com.mhyne.template.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}