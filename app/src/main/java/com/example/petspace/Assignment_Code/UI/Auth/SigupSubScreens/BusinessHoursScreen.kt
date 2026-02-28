package com.example.petspace.Assignment_Code.UI.Auth.SigupSubScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
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
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea


@Composable
fun BusinessHoursScreen() {

    val day = "m"
    val time = "8"
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
                SecondaryTitle("Signup 4 of 4 ", "")
                Spacer(Modifier.height(10.dp))
                PrimaryTitle("Business Hours")
                Spacer(Modifier.height(10.dp))
                SecondaryTitle(
                    "Choose the hours your farm is open for pickups. This will allow customers to order deliveries",
                    ""
                )
                Spacer(Modifier.height(30.dp))


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "m")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "m") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("M", color = if (day == "m") Color.White else Color.Gray) }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "t")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "t") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("T", color = if (day == "t") Color.White else Color.Gray) }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "w")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "w") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("W", color = if (day == "w") Color.White else Color.Gray) }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "th")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "th") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("Th", color = if (day == "th") Color.White else Color.Gray) }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "f")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "f") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("F", color = if (day == "f") Color.White else Color.Gray) }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "s")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "s") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("S", color = if (day == "s") Color.White else Color.Gray) }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .size(40.dp)
                            .background(
                                if (day == "su")
                                    Color(0xffd5715b)
                                else
                                    Color.Transparent
                            )
                            .border(
                                2.dp,
                                if (day == "su") Color(0xffd5715b) else Color.Gray,
                                RoundedCornerShape(20)
                            ),
                        contentAlignment = Alignment.Center
                    ) { Text("Su", color = if (day == "su") Color.White else Color.Gray) }
                }


                FlowRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        Modifier
                            .padding(
                                10.dp
                            )
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .width(150.dp)
                            .height(40.dp)
                            .background(
                                if (time == "8")
                                    Color(0xfff8c569)
                                else
                                    Color.LightGray
                            ),

                        contentAlignment = Alignment.Center
                    ) { Text("8:00am - 10:00am", color = Color.Black) }
                    Box(
                        Modifier
                            .padding(
                                10.dp
                            )
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .width(150.dp)
                            .height(40.dp)
                            .background(
                                if (time == "10")
                                    Color(0xfff8c569)
                                else
                                   Color.LightGray
                            ),

                        contentAlignment = Alignment.Center
                    ) { Text("10:00am - 1:00pm", color = Color.Black) }
                    Box(
                        Modifier
                            .padding(
                                10.dp
                            )
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .width(150.dp)
                            .height(40.dp)
                            .background(
                                if (time == "1")
                                    Color(0xfff8c569)
                                else
                                    Color.LightGray
                            ),

                        contentAlignment = Alignment.Center
                    ) { Text("1:00pm - 4:00pm", color = Color.Black) }
                    Box(
                        Modifier
                            .padding(
                                10.dp
                            )
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .width(150.dp)
                            .height(40.dp)
                            .background(
                                if (time == "4")
                                    Color(0xfff8c569)
                                else
                                    Color.LightGray
                            ),

                        contentAlignment = Alignment.Center
                    ) { Text("4:00pm - 7:00pm", color = Color.Black) }
                    Box(
                        Modifier
                            .padding(
                                10.dp
                            )
                            .clip(RoundedCornerShape(20))
                            .clickable(onClick = {})
                            .width(150.dp)
                            .height(40.dp)
                            .background(
                                if (time == "7")
                                    Color(0xfff8c569)
                                else
                                    Color.LightGray
                            ),

                        contentAlignment = Alignment.Center
                    ) { Text("7:00pm - 10:00pm", color = Color.Black) }

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
                    CustomButton("Signup", onClick = {})
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}