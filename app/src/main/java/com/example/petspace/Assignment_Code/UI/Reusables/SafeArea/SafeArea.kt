package com.example.petspace.Assignment_Code.UI.Reusables.SafeArea

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SafeArea(content: @Composable () -> Unit) {

    Scaffold(
        contentWindowInsets = WindowInsets.safeContent
    ) { it ->
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(it)
        ) {

            content()
        }
    }

}