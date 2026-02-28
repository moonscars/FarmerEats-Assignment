package com.example.petspace.Assignment_Code.DI

import androidx.lifecycle.ViewModel
import com.example.petspace.Assignment_Code.Ktor_Client.Routes
import com.example.petspace.Assignment_Code.UI.Auth.LoginViewModel
import com.example.petspace.Assignment_Code.UI.Auth.SignupViewModel
import com.example.petspace.Assignment_Code.UI.Splash.SplashViewModel
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appmodules = module {

    single {

        HttpClient(OkHttp) {
            install(ContentNegotiation) {
                json(
                    Json {
                        encodeDefaults = true
                        isLenient = true
                        ignoreUnknownKeys = true
                    }
                )
            }
        }


    }
    single { Routes(get()) }

    viewModel { SplashViewModel() }
    viewModel { LoginViewModel(get()) }
    viewModel { SignupViewModel(get()) }
}