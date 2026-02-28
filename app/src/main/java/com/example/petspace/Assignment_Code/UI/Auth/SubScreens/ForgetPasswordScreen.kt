package com.example.petspace.Assignment_Code.UI.Auth.SubScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.petspace.Assignment_Code.UI.Auth.Components.CustomButton
import com.example.petspace.Assignment_Code.UI.Auth.Components.ErrorShow
import com.example.petspace.Assignment_Code.UI.Auth.Components.Logo
import com.example.petspace.Assignment_Code.UI.Auth.Components.OtherLoginWays
import com.example.petspace.Assignment_Code.UI.Auth.Components.PasswordTextField
import com.example.petspace.Assignment_Code.UI.Auth.Components.PrimaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SecondaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SimpleTextField
import com.example.petspace.Assignment_Code.UI.Auth.LoginViewModel
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea
import org.koin.androidx.compose.koinViewModel

@Composable
fun ForgetPasswordScreen(
    navController: NavController,
    vm: LoginViewModel = koinViewModel()
) {

    val isloading = vm.isloading.collectAsState().value
    val phonenumber = vm.PhoneNumber.collectAsState().value
    val error = vm.errormsg.collectAsState().value


    if (error.isNotEmpty()) {
        ErrorShow(error)
    }
    SafeArea {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color.White)
                .padding(10.dp, 0.dp)
        ) {
            Logo()

            Spacer(Modifier.height(100.dp))

            PrimaryTitle("Forget Password?")

            Spacer(Modifier.height(10.dp))

            SecondaryTitle("Remember your Password?", "Login",{navController.navigate("login")})

            Spacer(Modifier.height(70.dp))

            SimpleTextField(
                value = phonenumber,
                onvaluechange = { vm.Set_PhoneNumber(it) },
                Icons.Outlined.Phone,
                placeholder = "Phone Number"
            )

            Spacer(Modifier.height(20.dp))

            CustomButton("Send Code", { vm.SendCode({ navController.navigate("otp") }) }, isloading)


        }
    }
}