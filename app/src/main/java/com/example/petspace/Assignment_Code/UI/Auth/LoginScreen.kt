package com.example.petspace.Assignment_Code.UI.Auth

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.petspace.Assignment_Code.UI.Auth.Components.CustomButton
import com.example.petspace.Assignment_Code.UI.Auth.Components.ErrorShow
import com.example.petspace.Assignment_Code.UI.Auth.Components.Logo
import com.example.petspace.Assignment_Code.UI.Auth.Components.OtherLoginWays
import com.example.petspace.Assignment_Code.UI.Auth.Components.PasswordTextField
import com.example.petspace.Assignment_Code.UI.Auth.Components.PrimaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SecondaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SimpleTextField
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea
import org.koin.androidx.compose.koinViewModel

@Composable
fun LoginScreen(
    navController: NavController,
    vm: LoginViewModel = koinViewModel()
) {
    val isloading = vm.isloading.collectAsState().value
    val email = vm.Email.collectAsState().value
    val password = vm.Password.collectAsState().value
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

            PrimaryTitle("Welcome back!")

            Spacer(Modifier.height(10.dp))

            SecondaryTitle(
                "New Here?",
                "Create account",
                onClick = { navController.navigate("signup") })

            Spacer(Modifier.height(70.dp))

            SimpleTextField(
                value = email,
                onvaluechange = { vm.Set_Email(it) },
                Icons.Outlined.Email,
                placeholder = "Email"
            )

            Spacer(Modifier.height(20.dp))

            PasswordTextField(
                value = password,
                onvaluechange = { vm.Set_Password(it) },
                Icons.Outlined.Lock,
                placeholder = "Password",
                onForget = { navController.navigate("forget") }
            )
            Spacer(Modifier.height(30.dp))

            CustomButton("Login", {
                vm.onLogin()

            }, isloading)

            Spacer(Modifier.height(30.dp))

            OtherLoginWays()
        }
    }
}