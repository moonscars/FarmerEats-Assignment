package com.example.petspace

import android.app.Application
import com.example.petspace.Assignment_Code.DI.appmodules

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                // modules here
                appmodules

            )
        }
    }
}