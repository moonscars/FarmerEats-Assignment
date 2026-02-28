package com.example.petspace.Assignment_Code.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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


@Composable
fun RootNavigation() {
    val navcontroller = rememberNavController();
    NavHost(
        navcontroller, startDestination = "onboard"
    ) {
        composable("onboard") { SplashScreen(gotologin = {
            navcontroller.popBackStack()
            navcontroller.navigate("login")
        }) }
        composable("login") { LoginScreen(navcontroller) }

        composable("forget") { ForgetPasswordScreen(navcontroller) }
        composable("otp") { VerifyOtpScreen(navcontroller) }
        composable("reset") { ResetPasswordScreen(navcontroller) }

        composable("signup") { SignupScreen(navcontroller) }
//
//        composable("info") { FarmInfoScreen() }
//        composable("verfiy") { VerificationScreen() }
//        composable("business") { BusinessHoursScreen() }
        composable("done") { DoneScreen(navcontroller) }



    }
}