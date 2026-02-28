package com.example.petspace.Assignment_Code.Ktor_Client

import com.example.petspace.Assignment_Code.DataModels.ForgetPasswordRequest
import com.example.petspace.Assignment_Code.DataModels.ForgetPasswordResponse
import com.example.petspace.Assignment_Code.DataModels.LoginRequest
import com.example.petspace.Assignment_Code.DataModels.LoginResponse
import com.example.petspace.Assignment_Code.DataModels.OtpRequest
import com.example.petspace.Assignment_Code.DataModels.OtpResponse
import com.example.petspace.Assignment_Code.DataModels.RegisterRequest
import com.example.petspace.Assignment_Code.DataModels.RegisterResponse
import com.example.petspace.Assignment_Code.DataModels.ResetPasswordRequest
import com.example.petspace.Assignment_Code.DataModels.ResetPasswordResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.contentType
import org.koin.compose.koinInject


const val BaseUrl = "https://www.sowlab.com/assignment/"




class Routes(
   private val clientx: HttpClient
){

    suspend fun Register(data: RegisterRequest): RegisterResponse{
        return clientx.post("${BaseUrl}user/register") {
            contentType(io.ktor.http.ContentType.Application.Json)
            setBody(data)
        }.body()
    }

    suspend fun Login(data: LoginRequest): LoginResponse{
        return clientx.post("${BaseUrl}user/login") {
            contentType(io.ktor.http.ContentType.Application.Json)
            setBody(data)
        }.body()
    }


    suspend fun ForgetPassword(data: ForgetPasswordRequest): ForgetPasswordResponse{
        return clientx.post("${BaseUrl}user/forgot-password") {
            contentType(io.ktor.http.ContentType.Application.Json)
            setBody(data)
        }.body()
    }

    suspend fun SubmitOPT(data: OtpRequest): OtpResponse {
        return clientx.post("${BaseUrl}user/verify-otp") {
            contentType(io.ktor.http.ContentType.Application.Json)
            setBody(data)
        }.body()
    }
        suspend fun ResetPassword(data: ResetPasswordRequest): ResetPasswordResponse {
        return clientx.post("${BaseUrl}user/reset-password") {
            contentType(io.ktor.http.ContentType.Application.Json)
            setBody(data)
        }.body()
    }

}



//
//suspend fun SetPrimaryData(data: PrimaryRequest): PrimaryCardEntity {
//    return clientx.post("${BASEURL}UpsertPrimaryData") {
//        contentType(io.ktor.http.ContentType.Application.Json)
//        setBody(data)
//    }.body()
//}
