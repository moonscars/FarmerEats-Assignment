package com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.petspace.Assignment_Code.UI.Auth.Components.CustomButton
import com.example.petspace.Assignment_Code.UI.Auth.Components.Logo
import com.example.petspace.Assignment_Code.UI.Auth.Components.OtherLoginWays
import com.example.petspace.Assignment_Code.UI.Auth.Components.PrimaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SecondaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SimpleTextField
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea

@Composable
fun FarmInfoScreen(){
    SafeArea {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color.White)
                .padding(10.dp, 0.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Logo()
                Spacer(Modifier.height(30.dp))
                SecondaryTitle("Signup 2 of 4 ", "")
                Spacer(Modifier.height(10.dp))
                PrimaryTitle("Farm Info")
                Spacer(Modifier.height(10.dp))

                SimpleTextField(
                    value = "",
                    onvaluechange = {},
                    icon = Icons.Outlined.Person,
                    placeholder = "Business Name",
                )
                Spacer(Modifier.height(10.dp))

                SimpleTextField(
                    value = "",
                    onvaluechange = {},
                    icon = Icons.Outlined.Face,
                    placeholder = "Informal Name",
                )
                Spacer(Modifier.height(10.dp))
                SimpleTextField(
                    value = "",
                    onvaluechange = {},
                    icon = Icons.Outlined.Home,
                    placeholder = "Street Address",
                )
                Spacer(Modifier.height(10.dp))
                SimpleTextField(
                    value = "",
                    onvaluechange = {},
                    icon = Icons.Outlined.LocationOn,
                    placeholder = "City",
                )
                Spacer(Modifier.height(10.dp))
                SimpleTextField(
                    value = "",
                    onvaluechange = {},
                    icon = Icons.Outlined.LocationOn,
                    placeholder = "State",
                )
                Spacer(Modifier.height(10.dp))
                SimpleTextField(
                    value = "",
                    onvaluechange = {},
                    icon = Icons.Outlined.LocationOn,
                    placeholder = "Enter Zipcode",
                )
                Spacer(Modifier.height(30.dp))
            }
            Column() {
                Row(

                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .width(100.dp)
                    ) {
                        IconButton(onClick = {}){
                            Icon(Icons.Outlined.ArrowBack,null)
                        }
                    }
                    CustomButton("Continue", onClick = {})
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}