package com.example.petspace.Assignment_Code.DataModels

import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind


@Serializable
data class RegisterResponse(
    val success :String,
    val message:String,
    val token:String? = null,
)
@Serializable
data class OtpRequest(
    val otp :String,
)
@Serializable
data class OtpResponse(
    val success :String,
    val message:String,
    val token:String? = null,
)

@Serializable
data class ResetPasswordRequest(
    val token :String,
    val password:String,
    val cpassword:String,
)
@Serializable
data class ResetPasswordResponse(
    val success :String,
    val message:String,
    val is_verified:String,
)



@Serializable
data class BusinessHoures(
    val key:String,
    val value:List<String>,
)

@Serializable
data class RegisterRequest(

    val full_name: String,
    val email: String,
    val phone: String,
    val password: String,
    val role: String,
    val business_name: String,
    val informal_name: String,
    val address: String,
    val city: String,
    val state: String,
    val zip_code: Int,
    val registration_proof: String,
    val business_hours: BusinessHoures,
    val device_token: String,
    val type: String,
    val social_id: String




)




@Serializable
data class LoginRequest(
    val email :String,
    val password:String,
    val role:String,
    val device_token:String,
    val type:String,
    val social_id:String
)

@Serializable
data class LoginResponse(
    val success :String,
    val message:String,
    val token:String? = null,
)

@Serializable
data class ForgetPasswordRequest(
    val mobile :String,

)

@Serializable
data class ForgetPasswordResponse(
    val success :String,
    val message:String,
)

