package com.example.petspace.Assignment_Code.UI.Auth.Components

import android.R.attr.tint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle
import kotlin.math.round
import kotlin.math.sin

@Composable
fun SimpleTextField(
    value:String ,
    onvaluechange :(String)->Unit,
    icon: ImageVector ,
    placeholder: String

) {
    OutlinedTextField(
        value = value,
        onValueChange = onvaluechange,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp)),
        placeholder = { Text(text = "$placeholder", color = Color.Gray) },
        leadingIcon = {
            Icon(imageVector =icon, contentDescription = null)

        },
        singleLine = true,
        shape = RoundedCornerShape(14.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFF5F5F5),
            unfocusedContainerColor = Color(0xFFF5F5F5),
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent

            )


    )


}

@Composable
fun PasswordTextField(
    value:String ,
    onvaluechange :(String)->Unit,
    icon: ImageVector ,
    placeholder: String,
    onForget:()->Unit

) {
    OutlinedTextField(
        value = value,
        onValueChange = onvaluechange,
        visualTransformation = PasswordVisualTransformation(),
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp)),
        placeholder = { Text(text = "$placeholder", color = Color.Gray) },
        leadingIcon = {
            Icon(imageVector =icon, contentDescription = null)

        },
        trailingIcon = {
            Text(
            "Forget?    ",
                color = Color(0xffd5715b)
                ,modifier = Modifier
//                .padding(5.dp,0.dp)
                    .clip(RoundedCornerShape(100))
                    .clickable(onClick = onForget)
            )
        }

        ,

        singleLine = true,
        shape = RoundedCornerShape(14.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFF5F5F5),
            unfocusedContainerColor = Color(0xFFF5F5F5),
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent

            )


    )


}

