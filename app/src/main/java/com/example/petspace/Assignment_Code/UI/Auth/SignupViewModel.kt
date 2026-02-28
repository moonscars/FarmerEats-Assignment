package com.example.petspace.Assignment_Code.UI.Auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.petspace.Assignment_Code.DataModels.BusinessHoures
import com.example.petspace.Assignment_Code.DataModels.RegisterRequest
import com.example.petspace.Assignment_Code.Ktor_Client.Routes
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SignupViewModel(private val DataRepo: Routes) : ViewModel() {
    private val _CurrentForm = MutableStateFlow(1)
    val CurrentForm = _CurrentForm.asStateFlow()

    fun Set_CurrentForm_plus() {
        if (CurrentForm.value <= 3) {
            _CurrentForm.value = _CurrentForm.value + 1
        }

    }

    fun Set_CurrentForm_min() {
        if (CurrentForm.value >= 1) {
            _CurrentForm.value = _CurrentForm.value - 1
        }

    }

    private val _isloading = MutableStateFlow(false)
    val isloading = _isloading.asStateFlow()

    private val _errormsg = MutableStateFlow("")
    val errormsg = _errormsg.asStateFlow()

    private val _FullName = MutableStateFlow("")
    val FullName = _FullName.asStateFlow()
    fun Set_FullName(value: String) {
        _FullName.value = value
    }

    private val _Email = MutableStateFlow("")
    val Email = _Email.asStateFlow()
    fun Set_Email(value: String) {
        _Email.value = value
    }

    private val _PhoneNumber = MutableStateFlow("")
    val PhoneNumber = _PhoneNumber.asStateFlow()
    fun Set_PhoneNumber(value: String) {
        _PhoneNumber.value = value
    }

    private val _Password = MutableStateFlow("")
    val Password = _Password.asStateFlow()
    fun Set_Password(value: String) {
        _Password.value = value
    }

    private val _RePassword = MutableStateFlow("")
    val RePassword = _RePassword.asStateFlow()
    fun Set_RePassword(value: String) {
        _RePassword.value = value
    }

    // form 2
    private val _BusinessName = MutableStateFlow("")
    val BusinessName = _BusinessName.asStateFlow()
    fun Set_BusinessName(value: String) {
        _BusinessName.value = value
    }


    private val _InformalName = MutableStateFlow("")
    val InformalName = _InformalName.asStateFlow()
    fun Set_InformalName(value: String) {
        _InformalName.value = value
    }


    private val _StreetAddress = MutableStateFlow("")
    val StreetAddress = _StreetAddress.asStateFlow()
    fun Set_StreetAddress(value: String) {
        _StreetAddress.value = value
    }


    private val _City = MutableStateFlow("")
    val City = _City.asStateFlow()
    fun Set_City(value: String) {
        _City.value = value
    }

    private val _State = MutableStateFlow("")
    val State = _State.asStateFlow()
    fun Set_State(value: String) {
        _State.value = value
    }

    private val _ZipCode = MutableStateFlow("")
    val ZipCode = _ZipCode.asStateFlow()
    fun Set_ZipCode(value: String) {
        _ZipCode.value = value
    }


    //day time
//    private val _Uri= MutableStateFlow<Uri?>( null  )
//    val  uri= _Uri.asStateFlow()
//    fun Set_Uri(value:Uri){_Uri.value = value}

    private val _Day = MutableStateFlow("")
    val Day = _Day.asStateFlow()
    fun Set_Day(value: String) {
        _Day.value = value
    }

    private val _Time = MutableStateFlow<List<String>>(emptyList())
    val Time = _Time.asStateFlow()
    fun Set_Time(value: String) {
        if (value in _Time.value) {
            _Time.value = _Time.value - value
        } else {
            _Time.value = _Time.value + value

        }
    }


    fun Signup(onSuccess:()->Unit) {
        viewModelScope.launch {
            try {
//                if (_PhoneNumber.value.isNotEmpty()) {
                _isloading.value = true
                delay(2000)
                _isloading.value = false
                Log.d("swag", "reacher here")

                val data = RegisterRequest(
                    full_name = _FullName.value,
                    email = _Email.value,
                    phone = _PhoneNumber.value,
                    password = _Password.value,
                    role = "farmer",
                    business_name = _BusinessName.value,
                    informal_name = _InformalName.value,
                    address = _StreetAddress.value,
                    city = _City.value,
                    state = _State.value,
                    zip_code = _ZipCode.value.toInt(),
                    registration_proof = "my_proof.pdf",
//                    business_hours = BusinessHoures(_Day.value, _Time.value),
                    business_hours = BusinessHoures(_Day.value ,_Time . value) ,
                    device_token = "0imfnc8mVLWwsAawjYr4Rx-Af50DDqtlx",
                    type = "email",
                    social_id = "0imfnc8mVLWwsAawjYr4Rx-Af50DDqtlx"
                )
                Log.d("swag", "${data.toString()}")
                val response = DataRepo.Register(data)




                _errormsg.value = response.message
                delay(2000)
                _errormsg.value = ""
                if(response.success.toBoolean()){
                    onSuccess()
                }



                Log.d("swag", "register reqeurst success")

//                } else {
//                    _errormsg.value = "Phone number required for otp"
//                    delay(2000)
//                    _errormsg.value = ""
//                }
            } catch (E: Exception) {
                Log.d("swag", "{$E}")
                _errormsg.value = "Try Again"
                delay(2000)
                _errormsg.value = ""
            }

        }
    }


}