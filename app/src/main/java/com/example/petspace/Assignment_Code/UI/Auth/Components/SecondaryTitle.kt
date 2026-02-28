package com.example.petspace.Assignment_Code.UI.Auth.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SecondaryTitle(
    title: String,
    btntitle: String,
    onClick:()->Unit = {}
) {
    Row() {
        Text(title, color = Color.Gray)
        Spacer(Modifier.width(5.dp))

        Text(
            btntitle,
            color = Color(0xffd5715b)
            ,modifier = Modifier
//                .padding(5.dp,0.dp)
                .clip(RoundedCornerShape(100))
                .clickable(onClick = onClick)
        )

    }
}