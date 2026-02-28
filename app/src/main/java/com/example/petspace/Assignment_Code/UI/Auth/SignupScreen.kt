package com.example.petspace.Assignment_Code.UI.Auth

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.petspace.Assignment_Code.UI.Auth.Components.CustomButton
import com.example.petspace.Assignment_Code.UI.Auth.Components.ErrorShow
import com.example.petspace.Assignment_Code.UI.Auth.Components.Logo
import com.example.petspace.Assignment_Code.UI.Auth.Components.OtherLoginWays
import com.example.petspace.Assignment_Code.UI.Auth.Components.PasswordTextField
import com.example.petspace.Assignment_Code.UI.Auth.Components.PrimaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SecondaryTitle
import com.example.petspace.Assignment_Code.UI.Auth.Components.SimpleTextField
import com.example.petspace.Assignment_Code.UI.Reusables.SafeArea.SafeArea
import org.koin.androidx.compose.koinViewModel

@Composable
fun SignupScreen(
    navController: NavController,
    vm: SignupViewModel = koinViewModel()
) {

    val main = vm.CurrentForm.collectAsState().value

    val isloading = vm.isloading.collectAsState().value

    val error = vm.errormsg.collectAsState().value
    val fullname = vm.FullName.collectAsState().value
    val email = vm.Email.collectAsState().value
    val phonenumber = vm.PhoneNumber.collectAsState().value
    val password = vm.Password.collectAsState().value
    val repassword = vm.RePassword.collectAsState().value

    val businessname = vm.BusinessName.collectAsState().value
    val informalname = vm.InformalName.collectAsState().value
    val streetaddress = vm.StreetAddress.collectAsState().value
    val city = vm.City.collectAsState().value
    val state = vm.State.collectAsState().value
    val zipcode = vm.ZipCode.collectAsState().value

    val day = vm.Day.collectAsState().value
    val time = vm.Time.collectAsState().value





    if (error.isNotEmpty()) {
        ErrorShow(error)
    }
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

                Spacer(Modifier.height(50.dp))

                when (main) {
                    1 -> Formone(
                        fullname = fullname,
                        setfullname = { vm.Set_FullName(it) },
                        email = email,
                        setemail = { vm.Set_Email(it) },
                        phonenumber = phonenumber,
                        setphonenumber = { vm.Set_PhoneNumber(it) },
                        password = password,
                        setpassword = { vm.Set_Password(it) },
                        repassword = repassword,
                        setrepassword = { vm.Set_RePassword(it) },
                    )

                    2 -> Formtwo(
                        businessname = businessname,
                        setbusinessname = { vm.Set_BusinessName(it) },
                        informalname = informalname,
                        setinformalname = { vm.Set_InformalName(it) },
                        streetaddress = streetaddress,
                        setstreetaddress = { vm.Set_StreetAddress(it) },
                        city = city,
                        setcity = { vm.Set_City(it) },
                        state = state,
                        setstate = { vm.Set_State(it) },
                        zipcode = zipcode,
                        setzipcode = { vm.Set_ZipCode(it) }
                    )

                    3 -> Formthree()
                    4 -> Formfour(
                        day = day,
                        setday = { vm.Set_Day(it) },
                        time = time,
                        settime = { vm.Set_Time(it) }
                    )


                }


                // form

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
                        if (main == 1) {
                            Text(
                                "Login",
                                textDecoration = TextDecoration.Underline,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(100))
                                    .clickable(onClick = { navController.navigate("login") })
                                    .padding(10.dp),
                            )
                        } else {
                            Column(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {
                                IconButton(onClick = { vm.Set_CurrentForm_min() }) {
                                    Icon(Icons.Outlined.ArrowBack, null)
                                }
                            }
                        }
                    }
                    if (main == 4) {
                        CustomButton("Signup", onClick = {vm.Signup({navController.navigate("done")})}, isloading)

                    } else {

                        CustomButton("Continue", onClick = { vm.Set_CurrentForm_plus() })
                    }
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}


@Composable
fun Formone(

    fullname: String,
    setfullname: (String) -> Unit,
    email: String,
    setemail: (String) -> Unit,
    phonenumber: String,
    setphonenumber: (String) -> Unit,
    password: String,
    setpassword: (String) -> Unit,
    repassword: String,
    setrepassword: (String) -> Unit,


    ) {
    Column() {
        SecondaryTitle("Signup 1 of 4 ", "")
        Spacer(Modifier.height(10.dp))
        PrimaryTitle("Welcome!")
        Spacer(Modifier.height(30.dp))
        OtherLoginWays(showTitle = false)
        Spacer(Modifier.height(20.dp))

        SimpleTextField(
            value = fullname,
            onvaluechange = { setfullname(it) },
            icon = Icons.Outlined.Person,
            placeholder = "Full Name",
        )
        Spacer(Modifier.height(10.dp))

        SimpleTextField(
            value = email,
            onvaluechange = { setemail(it) },
            icon = Icons.Outlined.Email,
            placeholder = "Email",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = phonenumber,
            onvaluechange = { setphonenumber(it) },
            icon = Icons.Outlined.Phone,
            placeholder = "Phone Number",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = password,
            onvaluechange = { setpassword(it) },
            icon = Icons.Outlined.Lock,
            placeholder = "Password",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = repassword,
            onvaluechange = { setrepassword(it) },
            icon = Icons.Outlined.Lock,
            placeholder = "Re-enter Password",
        )
        Spacer(Modifier.height(30.dp))
    }
}


@Composable
fun Formtwo(

    businessname: String,
    setbusinessname: (String) -> Unit,
    informalname: String,
    setinformalname: (String) -> Unit,
    streetaddress: String,
    setstreetaddress: (String) -> Unit,
    city: String,
    setcity: (String) -> Unit,
    state: String,
    setstate: (String) -> Unit,
    zipcode: String,
    setzipcode: (String) -> Unit,


    ) {
    Column() {
        SecondaryTitle("Signup 2 of 4 ", "")
        Spacer(Modifier.height(10.dp))
        PrimaryTitle("Farm Info")
        Spacer(Modifier.height(10.dp))

        SimpleTextField(
            value = businessname,
            onvaluechange = { setbusinessname(it) },
            icon = Icons.Outlined.Person,
            placeholder = "Business Name",
        )
        Spacer(Modifier.height(10.dp))

        SimpleTextField(
            value = informalname,
            onvaluechange = { setinformalname(it) },
            icon = Icons.Outlined.Face,
            placeholder = "Informal Name",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = streetaddress,
            onvaluechange = { setstreetaddress(it) },
            icon = Icons.Outlined.Home,
            placeholder = "Street Address",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = city,
            onvaluechange = { setcity(it) },
            icon = Icons.Outlined.LocationOn,
            placeholder = "City",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = state,
            onvaluechange = { setstate(it) },
            icon = Icons.Outlined.LocationOn,
            placeholder = "State",
        )
        Spacer(Modifier.height(10.dp))
        SimpleTextField(
            value = zipcode,
            onvaluechange = { setzipcode(it) },
            icon = Icons.Outlined.LocationOn,
            placeholder = "Enter Zipcode",
        )
        Spacer(Modifier.height(30.dp))
    }
}


@Composable
fun Formthree() {

    var imageUri by remember {
        mutableStateOf<Uri?>(null)
    };

    val pickImageLauncher = rememberLauncherForActivityResult(
        contract =
            ActivityResultContracts.GetContent()
    ) { uri -> imageUri = uri }



    Column() {

        Spacer(Modifier.height(30.dp))
        SecondaryTitle("Signup 3 of 4 ", "")
        Spacer(Modifier.height(10.dp))
        PrimaryTitle("Verification")
        Spacer(Modifier.height(10.dp))
        SecondaryTitle(
            "Attached proof of Department of Agriculture registrations i.e. Florida Fresh, USDA Approved , USDA Organic",
            ""
        )
        Spacer(Modifier.height(30.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                "Attach proof of registration",
                fontWeight = FontWeight.SemiBold
            )
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .size(60.dp)
                    .clickable(onClick = { pickImageLauncher.launch("image/*") })
                    .background(Color(0xffd5715b)),
                contentAlignment = Alignment.Center
            )
            {
                Icon(
                    Icons.Outlined.Add, null, tint = Color.White
                )
            }
        }

        if (imageUri != null) {
            Box(
                modifier = Modifier
                    .zIndex(1f)
                    .fillMaxWidth()
                    .padding(20.dp, 50.dp),
                contentAlignment = Alignment.Center,

                ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(25))
                        .background(Color(0xFFF5F5F5))
                        .fillMaxWidth()
                        .height(50.dp)
                        .border(2.dp, color = Color(0xFFF5F5F5), RoundedCornerShape(25)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("File_Proof.png")

                }

            }
        }


    }
}


@Composable
fun Formfour(
    day: String,
    setday: (String) -> Unit,
    time: List<String>,
    settime: (String) -> Unit,

    ) {


    Column() {
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
                    .clickable(onClick = {

                        if (day == "m") {
                            setday("")
                        } else {
                            setday("m")
                        }
                    })
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
                    .clickable(onClick = {


                        if (day == "t") {
                            setday("")
                        } else {
                            setday("t")
                        }

                    })
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
                    .clickable(onClick = {

                        if (day == "w") {
                            setday("")
                        } else {
                            setday("w")
                        }

                    })
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
                    .clickable(onClick = {

                        if (day == "th") {
                            setday("")
                        } else {
                            setday("th")
                        }

                    })
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
                    .clickable(onClick = {

                        if (day == "f") {
                            setday("")
                        } else {
                            setday("f")
                        }

                    })
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
                    .clickable(onClick = {

                        if (day == "s") {
                            setday("")
                        } else {
                            setday("s")
                        }

                    })
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
                    .clickable(onClick = {

                        if (day == "su") {
                            setday("")
                        } else {
                            setday("su")
                        }

                    })
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
                    .clickable(onClick = {

                        settime("8")


                    })
                    .width(150.dp)
                    .height(40.dp)
                    .background(
                        if ("8" in time)
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
                    .clickable(onClick = {


                        settime("10")

                    }
                    )
                    .width(150.dp)
                    .height(40.dp)
                    .background(
                        if ("10" in time)
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
                    .clickable(onClick = {

                        settime("1")


                    })
                    .width(150.dp)
                    .height(40.dp)
                    .background(
                        if ("1" in time)
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
                    .clickable(onClick = {

                        settime("4")


                    })
                    .width(150.dp)
                    .height(40.dp)
                    .background(
                        if ("4" in time)
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
                    .clickable(onClick = {

                        settime("7")


                    })
                    .width(150.dp)
                    .height(40.dp)
                    .background(
                        if ("7" in time)
                            Color(0xfff8c569)
                        else
                            Color.LightGray
                    ),

                contentAlignment = Alignment.Center
            ) { Text("7:00pm - 10:00pm", color = Color.Black) }

        }

    }
}

