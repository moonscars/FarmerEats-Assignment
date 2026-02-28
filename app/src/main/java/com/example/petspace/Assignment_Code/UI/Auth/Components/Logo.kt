package com.example.petspace.Assignment_Code.UI.Auth.Components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Logo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 0.dp)
    ) {
        Text(
            "FarmerEats",
            fontWeight = FontWeight.SemiBold
            ,
        )
    }
}