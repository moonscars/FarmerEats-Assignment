package com.example.petspace.Assignment_Code.UI.Auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.petspace.Assignment_Code.DataModels.ForgetPasswordRequest
import com.example.petspace.Assignment_Code.DataModels.LoginRequest
import com.example.petspace.Assignment_Code.DataModels.LoginResponse
import com.example.petspace.Assignment_Code.DataModels.OtpRequest
import com.example.petspace.Assignment_Code.DataModels.ResetPasswordRequest
import com.example.petspace.Assignment_Code.Ktor_Client.Routes
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginViewModel(private val DataRepo: Routes) : ViewModel() {

    private val _isloading = MutableStateFlow(false)
    val isloading = _isloading.asStateFlow()
    private val _errormsg = MutableStateFlow("")
    val errormsg = _errormsg.asStateFlow()

    private val _Email = MutableStateFlow("")
    val Email = _Email.asStateFlow()
    private val _Password = MutableStateFlow("")
    val Password = _Password.asStateFlow()

    fun Set_Email(value: String) {
        _Email.value = value
    }

    fun Set_Password(value: String) {
        _Password.value = value
    }


    fun onLogin() {


        viewModelScope.launch {
            try {
                if (_Email.value.isNotEmpty() && _Password.value.isNotEmpty()) {
                    _isloading.value = true
                    delay(2000)
                    val data = LoginRequest(
                        email = _Email.value,
                        password = _Password.value,
                        role = "farmer",
                        device_token = "0imfnc8mVLWwsAawjYr4Rx-Af50DDqtlx",
                        type = "email",
                        social_id = "0imfnc8mVLWwsAawjYr4Rx-Af50DDqtlx",
                    )
                    val response = DataRepo.Login(data)
                    Log.d("swag", "login requrest success")

                    _errormsg.value = "${response.message}"
                    delay(2000)
                    _errormsg.value = ""


                } else {

                    _errormsg.value = "Please fill email & password"
                    delay(2000)
                    _errormsg.value = ""


                }
            } catch (E: Exception) {
                Log.d("swag", "{$E}")

                _errormsg.value = "Try Again"
                delay(2000)
                _errormsg.value = ""
            }
            finally {
                _isloading.value = false
            }

        }
    }


    // forget password states and methods
    private val _PhoneNumber = MutableStateFlow("")
    val PhoneNumber = _PhoneNumber.asStateFlow()

    fun Set_PhoneNumber(value: String) {
        _PhoneNumber.value = value
    }

    private val _Token = MutableStateFlow("")



    fun SendCode(verifyotp: () -> Unit) {
        viewModelScope.launch {
            try {
                if (_PhoneNumber.value.isNotEmpty()) {
                    _isloading.value = true
                    delay(2000)
                    val data = ForgetPasswordRequest(_PhoneNumber.value)
                    val response = DataRepo.ForgetPassword(data)
                    _errormsg.value = response.message
                    delay(2000)
                    _errormsg.value = ""
                    Log.d("swag", "forgetpass requrest success")

                    if (response.success.toBoolean()) {
                        verifyotp()
                    }

                } else {
                    _errormsg.value = "Phone number required for otp"
                    delay(2000)
                    _errormsg.value = ""
                }
            } catch (E: Exception) {
                Log.d("swag", "{$E}")
                _errormsg.value = "Try Again"
                delay(2000)
                _errormsg.value = ""
            }
            finally {
                _isloading.value = false

            }

        }
    }

    //otp related state and methods

    private val _Otp = MutableStateFlow("")
    val Otp = _Otp.asStateFlow()

    fun Set_Otp(value: String) {
        _Otp.value = value
    }

    fun SubmitOtp(goforresetpassword: () -> Unit) {
        viewModelScope.launch {
            try {
                if (_Otp.value.isNotEmpty()) {
                    _isloading.value = true
                    delay(2000)
                    val data = OtpRequest(_Otp.value)
                    val response = DataRepo.SubmitOPT(data)
                    _errormsg.value = response.message
                    if(response.success.toBoolean()) {
                        _Token.value = response.token.toString()
                        goforresetpassword()
                    }

                } else {
                    _errormsg.value = "Enter Otp"
                    delay(2000)
                    _errormsg.value = ""
                }
            } catch (E: Exception) {
                _errormsg.value = "Try Again"
                delay(2000)
                _errormsg.value = ""
            }
            finally {
                _isloading.value = false

            }

        }

    }

    //reset password states and methods
    private val _New_Password = MutableStateFlow("")
    val New_Password = _New_Password.asStateFlow()
    private val _Confirm_New_Password = MutableStateFlow("")
    val Confirm_New_Password = _Confirm_New_Password.asStateFlow()

    fun Set_NewPassword(value: String) {
        _New_Password.value = value
    }

    fun Set_Confirm_New_Password(value: String) {
        _Confirm_New_Password.value = value
    }


    fun Submit_NewPassword() {

        viewModelScope.launch {
            try {
                if (_New_Password.value.isNotEmpty() && _Confirm_New_Password.value.isNotEmpty()) {
                    if (_New_Password.value != _Confirm_New_Password.value) {
                        _errormsg.value = "Passwords are not same"
                        delay(2000)
                        _errormsg.value = ""
                    } else {
                        _isloading.value = true
                        delay(2000)
                        val data = ResetPasswordRequest(_Token.value,_Password.value,_Confirm_New_Password.value)
                        val response = DataRepo.ResetPassword(data)
                        _errormsg.value = response.message
                        delay(2000)
                        _errormsg.value = ""
                    }
                } else {
                    _errormsg.value = "Enter New Password"
                    delay(2000)
                    _errormsg.value = ""
                }
            } catch (E: Exception) {
                _errormsg.value = "Try Again"
                delay(2000)
                _errormsg.value = ""
            }
            finally {
                _isloading.value = false

            }

        }


    }


}