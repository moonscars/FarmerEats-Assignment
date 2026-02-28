package com.example.petspace

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.petspace.Assignment_Code.Navigation.RootNavigation
import com.example.petspace.Assignment_Code.UI.Auth.LoginScreen
import com.example.petspace.Assignment_Code.UI.Auth.SignupScreen
import com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens.BusinessHoursScreen
import com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens.DoneScreen
import com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens.FarmInfoScreen
import com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens.VerificationScreen
import com.example.petspace.Assignment_Code.UI.Auth.SubScreens.ForgetPasswordScreen
import com.example.petspace.Assignment_Code.UI.Auth.SubScreens.ResetPasswordScreen
import com.example.petspace.Assignment_Code.UI.Auth.SubScreens.VerifyOtpScreen
import com.example.petspace.Assignment_Code.UI.Splash.SplashScreen


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {


//                 SplashScreen()
//            LoginScreen()

//            ForgetPasswordScreen()

//            VerifyOtpScreen()

//            ResetPasswordScreen()

//            SignupScreen()
//            FarmInfoScreen()
//            VerificationScreen()
//            BusinessHoursScreen()

//            DoneScreen()
            RootNavigation()


        }


    }
}


