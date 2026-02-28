package com.example.petspace.Assignment_Code.UI.Splash

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea
import kotlinx.coroutines.delay
import org.koin.androidx.compose.koinViewModel

@Composable
fun SplashScreen(
    vm: SplashViewModel = koinViewModel(),
    gotologin: () -> Unit
) {

    val image = vm.BackgroundImage.collectAsState().value
    val color = vm.Color.collectAsState().value
    val label = vm.Label.collectAsState().value
    val text = vm.Text.collectAsState().value
    val count = vm.count.collectAsState().value





    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(image),
                contentDescription = "splash image",

                modifier = Modifier
                    .fillMaxSize()


            )

        }
        Column(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(15, 15, 0, 0))

                .background(Color.White)
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,


            ) {


            BottomSheet(
                count,
                label,
                color,
                text,
                gotologin = gotologin

            )


        }

    }

}


@Composable
fun BottomSheet(
    count: Int,
    label: String,
    color: Color,
    text: String,
    gotologin:()->Unit
) {
    Spacer(Modifier.height(15.dp))
    Text(label, fontWeight = FontWeight.Bold, fontSize = 25.sp)
    Spacer(Modifier.height(20.dp))
    Text(text, textAlign = TextAlign.Center, color = Color.Black, fontSize = 14.sp)
    Spacer(Modifier.height(30.dp))


    Row() {

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100))
                .height(10.dp)
                .width(if (count == 0) 20.dp else 10.dp)
                .background(Color.Black)
        )
        Spacer(Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100))
                .height(10.dp)
                .width(if (count == 1) 20.dp else 10.dp)
                .background(Color.Black)
        )
        Spacer(Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100))
                .height(10.dp)
                .width(if (count == 2) 20.dp else 10.dp)
                .background(Color.Black)
        )


    }
    Spacer(Modifier.height(40.dp))

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(100))

            .clickable(onClick = {})
            .background(color)
            .height(50.dp)
            .padding(30.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Join the Movement!",
            color = Color.White
        )
    }

    Spacer(Modifier.width(5.dp))

    Text(
        "Login",
        textDecoration = TextDecoration.Underline,
        modifier = Modifier
            .clip(RoundedCornerShape(100))
            .clickable(onClick = gotologin)
            .padding(10.dp)
    )
}

