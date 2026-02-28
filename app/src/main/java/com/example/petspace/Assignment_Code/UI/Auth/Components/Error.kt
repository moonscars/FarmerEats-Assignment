package com.example.petspace.Assignment_Code.UI.Auth.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun ErrorShow(msg:String){
    Box(
        modifier = Modifier
            .zIndex(1f)
            .fillMaxWidth()
            .padding(20.dp,50.dp),
        contentAlignment = Alignment.Center,

        ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(25))
                .background(Color(0xFFF5F5F5))
                .fillMaxWidth()
                .height(60.dp)
                .padding(5.dp)
                .border(2.dp, color = Color(0xFFF5F5F5), RoundedCornerShape(25))
            ,
            contentAlignment =Alignment.Center
        ) {
            Text(msg)

        }

    }
}