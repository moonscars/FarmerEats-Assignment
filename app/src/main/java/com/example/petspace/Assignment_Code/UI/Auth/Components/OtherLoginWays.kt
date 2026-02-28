package com.example.petspace.Assignment_Code.UI.Auth.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.petspace.R


@Composable
fun OtherLoginWays(showTitle: Boolean = true) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showTitle) {
            Text("or login with", fontSize = 12.sp, color = Color.Gray)
            Spacer(Modifier.height(20.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .clickable(onClick = {})
                    .border(1.dp, Color.Gray, RoundedCornerShape(100))
                    .background(Color.White)
                    .width(100.dp)
                    .height(50.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter =
                        painterResource(R.drawable.google_image),
                    null,
                    modifier = Modifier.size(30.dp)
                )

            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .clickable(onClick = {})
                    .border(1.dp, Color.Gray, RoundedCornerShape(100))
                    .background(Color.White)
                    .width(100.dp)
                    .height(50.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter =
                        painterResource(R.drawable.apple), null,
                    modifier = Modifier.size(30.dp)

                )

            }
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .clickable(onClick = {})
                    .border(1.dp, Color.Gray, RoundedCornerShape(100))
                    .background(Color.White)
                    .width(100.dp)
                    .height(50.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter =
                        painterResource(R.drawable.fbimage), null,
                    modifier = Modifier.size(30.dp)

                )

            }
        }
        if (!showTitle) {
            Spacer(Modifier.height(20.dp))
            Text("or signup with", fontSize = 12.sp, color = Color.Gray)

        }
    }
}