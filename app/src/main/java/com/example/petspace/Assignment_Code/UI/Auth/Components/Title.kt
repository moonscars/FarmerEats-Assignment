package com.example.petspace.Assignment_Code.UI.Auth.Components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PrimaryTitle(
    title: String
) {
    Text(
        text = title,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,
        modifier = Modifier
            .padding(0.dp,0.dp)
        )

}