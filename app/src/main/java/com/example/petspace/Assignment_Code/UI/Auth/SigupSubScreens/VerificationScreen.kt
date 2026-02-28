package com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.petspace.Assignment_Code.UI.Auth.Components.CustomButton
import com.example.petspace.Assignment_Code.UI.Auth.Components.Logo
import com.example.petspace.Assignment_Code.UI.Auth.Components.PrimaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SecondaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SimpleTextField
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea

@Composable
fun VerificationScreen() {
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
                SecondaryTitle("Signup 3 of 4 ", "")
                Spacer(Modifier.height(10.dp))
                PrimaryTitle("Verification")
                Spacer(Modifier.height(10.dp))
                SecondaryTitle(
                    "Attached proof of Department of Agriculture registrations i.e. Florida Fresh, USDA Approved , USDA Organic",
                    ""
                )
                Spacer(Modifier.height(30.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        "Attach proof of registration",
                        fontWeight = FontWeight.SemiBold
                    )
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(100))
                            .size(60.dp)
                            .clickable(onClick = {})
                            .background(Color(0xffd5715b)),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Icon(
                            Icons.Outlined.Add, null, tint = Color.White
                        )
                    }
                }


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
                        IconButton(onClick = {}) {
                            Icon(Icons.Outlined.ArrowBack, null)
                        }
                    }
                    CustomButton("Continue", onClick = {})
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}