package com.example.petspace.Assignment_Code.UI.Auth.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    label:String,
    onClick:()->Unit,
    isloading: Boolean = false
){
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(100))
            .clickable(onClick = onClick)
            .background(Color(0xffd5715b))
            .height(55.dp)
            .fillMaxWidth()
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if(isloading){
            CircularProgressIndicator(
                color = Color.White,
                modifier = Modifier.size(25.dp)

            )
        }
        else {
            Text(
                label,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
    }
}