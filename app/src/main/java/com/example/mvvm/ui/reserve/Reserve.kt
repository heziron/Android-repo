package com.example.mvvm.ui.reserve


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_insert
import com.example.mvvm.navigation.ROUTE_vewproducts
import com.example.mvvm.navigation.Route_bookseats
import com.example.mvvm.ui.tour.Scaffold


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun Reserve(navController: NavController) {





    // Bottom Navigation selected index state
    val selectedIndex = remember { mutableStateOf(0) }

    // Scaffold with Bottom Navigation and topbar
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Wox Tour") },
                backgroundColor = Color(0xFF6200EE),
                contentColor = Color.White
            )
        },
        bottomBar = {
            BottomNavigation(
                elevation = 10.dp,
                modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars)) {
                BottomNavigationItem(
                    icon = {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
                    },
                    label = { Text(text = "Home") },
                    selected = selectedIndex.value == 0,
                    onClick = {
                        selectedIndex.value = 0
                    }
                )

                BottomNavigationItem(
                    icon = {
                        Icon(imageVector = Icons.Default.List, contentDescription = "Favorite")
                    },
                    label = { Text(text = "Travel") },
                    selected = selectedIndex.value == 1,
                    onClick = {
                        navController.navigate(ROUTE_vewproducts)
                        selectedIndex.value = 1
                    }
                )

                BottomNavigationItem(
                    icon = {
                        Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Profile")
                    },
                    label = { Text(text = "Add") },
                    selected = selectedIndex.value == 2,
                    onClick = {
                        navController.navigate(ROUTE_insert)
                        selectedIndex.value = 2
                    }
                )
            }
        },
    )












    @Composable
    fun HeaderCard() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White, shape = RoundedCornerShape(16.dp)),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "WOX TOUR",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .background(Color.Black)
                        .padding(8.dp)
                )
            }
        }
    }



    LazyColumn() {

        item {
            Spacer(modifier = Modifier.height(15.dp))

            Column(
                   horizontalAlignment = Alignment.Start,

                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.LightGray, shape = RoundedCornerShape(16.dp))
                    .padding(6.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(),


                verticalArrangement = Arrangement.Top


            )

            {


//                Card (
//
//                    colors = CardDefaults.cardColors(Color.LightGray),
//                    elevation = CardDefaults.cardElevation(8.dp)
//
//                ){
//
//
//                    AsyncImage(
//                        model = "https://th.bing.com/th?id=OIF.wGfKv8ic2Qse%2fbg%2b6pSDXg&w=292&h=209&c=7&r=0&o=5&pid=1.7",
//                        contentDescription = "null",
//
//                        modifier = Modifier
//                            .size(300.dp)
//                            .clip(RoundedCornerShape(percent = 10))
//                            .background(Color.Gray)
//
//                    )
//                }

                Button(onClick = { navController.navigate(Route_bookseats) }) {

                    Card {
                        Text(
                            text = "Seats",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.Green),
                            fontSize = 10.sp,
                            color = Color.Blue,

                            )
                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Column(modifier = Modifier.fillMaxWidth()) {
                    LinearProgressIndicator(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(15.dp),

                        color = Color.Green //progress color
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                Card (
                    colors = CardDefaults.cardColors(Color.Black),
                    elevation = CardDefaults.cardElevation(8.dp)

                ){

                    Row {


                        AsyncImage(
                            model = "https://img.freepik.com/premium-photo/lion-head-logo-king-jungle_1034561-258.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.Cyan)

                        )

                        Spacer(modifier = Modifier.width(170.dp))

                        AsyncImage(
                            model = "https://img.freepik.com/premium-photo/lion-head-logo-king-jungle_1034561-258.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.Cyan)

                        )

                    }


                }
                Spacer(modifier = Modifier.height(15.dp))


                Text("TRAVEL WITH US",
                    textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,

                    )

                Spacer(modifier = Modifier.height(15.dp))

                Text(".Book your tickets here.",
                    textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Magenta,)
                Spacer(modifier = Modifier.height(15.dp))


                Text(".Booked tickets.",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Column {
                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Text("1 ")

                    }



                    Spacer(modifier = Modifier.width(5.dp))

                    Column {
                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Text(" 2")

                    }
                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )

                        Text("3")

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Text("4")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Text("5 ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )

                        Text("6")

                    }

                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Text("7 ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Text(" 8")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))

                Text("Unbooked tickets",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Blue,

                    )

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Column {
                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A ")

                    }



                    Spacer(modifier = Modifier.width(5.dp))

                    Column {
                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text(" B")

                    }
                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )

                        Text("A ")

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("B")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )

                        Text("B")

                    }

                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("B")

                    }

                }


                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Text(
                        text = " book it now ",

                        modifier = Modifier

                            .clickable { navController.navigate(ROUTE_vewproducts) }
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))

                Text("Another 1000 more unbooked tickets",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Red,)
                Spacer(modifier = Modifier.height(20.dp))

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Column {
                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A ")

                    }



                    Spacer(modifier = Modifier.width(5.dp))

                    Column {
                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text(" B")

                    }
                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )

                        Text("A ")

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("B")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )

                        Text("B")

                    }

                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("B")

                    }

                }


                Spacer(modifier = Modifier.height(10.dp))

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Column {
                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A ")

                    }



                    Spacer(modifier = Modifier.width(5.dp))

                    Column {
                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text(" B")

                    }
                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )

                        Text("A ")

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("B")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )

                        Text("B")

                    }

                    Spacer(modifier = Modifier.width(40.dp))

                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("A")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )
                        Text("B")

                    }

                }


                Spacer(modifier = Modifier.height(10.dp))





















//                Spacer(modifier = Modifier.height(15.dp))
//
//                Text("Parts of mara reserve",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 20.sp,
//                    color = Color.Blue,)
//                Spacer(modifier = Modifier.height(15.dp))
//
//                Spacer(modifier = Modifier.height(15.dp))
//
//                     Text("...Parts of mara reserve",
//                         modifier = Modifier
//                             .background(Color.LightGray),
//                         fontSize = 20.sp,
//                         color = Color.Blue,)
//                Spacer(modifier = Modifier.height(15.dp))
//
//                Row {
//                    Column {
//
//                        Card(colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp) )  {
//                            Column {
//                                Text("The")
//                                Text("bigg",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("five")
//                            }
//                        }
//
//                        Spacer(modifier = Modifier.height(15.dp))
//                        Card (colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp) ){
//                            Column {
//                                Text("The ")
//                                Text("colk",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("four")
//                            }
//                        }
//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Card (colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp) ){
//                            Column {
//                                Text(" The ")
//                                Text("boon",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("five")
//                            }
//                        }
//
//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Card (colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp)                                              ){
//                            Column {
//                                Text("The ")
//                                Text("beas",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("four")
//                            }
//                        }
//
//                    }
//                    Spacer(modifier = Modifier.width(40.dp))
//                    Column {
//
//                        Card ( ){
//                            Column {
//                                Text("Eastern ")
//                                Text("part of",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("Mara")
//                            }
//                        }
//
//                        Spacer(modifier = Modifier.height(15.dp))
//                        Card (){
//                            Column {
//                                Text("Northen")
//                                Text("part of",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("Mara")
//                            }
//                        }
//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Card( ) {
//                            Column {
//                                Text("Southen ")
//                                Text("part of",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("Mara")
//                            }
//                        }
//
//
//
//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Card ( ){
//                            Column {
//                                Text("Western ")
//                                Text("part of",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("Mara")
//                            }
//                        }
//
//                    }
//                    Spacer(modifier = Modifier.width(40.dp))
//                    Column {
//
//                        Card ( colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp)){
//                            Column {
//                                Text("15 ")
//                                Text("kilometre",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("to warden")
//                            }
//                        }
//
//                        Spacer(modifier = Modifier.height(15.dp))
//                        Card( colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp)) {
//                            Column {
//                                Text("10 ")
//                                Text("kilometre",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("to warden")
//                            }
//                        }
//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Card( colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp)) {
//                            Column {
//                                Text("5 ")
//                                Text("kilometre",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("to warden")
//                            }
//                        }
//                        Spacer(modifier = Modifier.height(15.dp))
//                        Card ( colors = CardDefaults.cardColors(Color.Gray),
//                            elevation = CardDefaults.cardElevation(8.dp))
//
//                        {
//
//                            Column {
//                                Text("3 ")
//                                Text("kilometre",
//                                    modifier = Modifier
//                                        .background(Color.LightGray),
//                                    fontSize = 10.sp,
//                                    color = Color.Blue,)
//                                Text("to warden")
//
//
//                            }
//                        }
//
//                    }
//
//
//                }
//                Spacer(modifier = Modifier.height(15.dp))
//                Text("..Serene Masai Mara Environs",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 20.sp,
//                    color = Color.Blue,)
//                Spacer(modifier = Modifier.height(15.dp))
//
//
//
//
//                  Column {
//
//                      Text(
//                          "...Welcome to Masai mara region in,",
//                          modifier = Modifier
//                              .background(Color.LightGray),
//                          fontSize = 10.sp,
//                          color = Color.Black,
//                      )
//                      Text(
//                          "Narok County.Mara reserve is a ",
//                          modifier = Modifier
//                              .background(Color.LightGray),
//                          fontSize = 10.sp,
//                          color = Color.Black,
//                      )
//                      Text(
//                          "captivating destination of many ",
//                          modifier = Modifier
//                              .background(Color.LightGray),
//                          fontSize = 10.sp,
//                          color = Color.Black,
//                      )
//                      Text(
//                          "tourists across the world",
//                          modifier = Modifier
//                              .background(Color.LightGray),
//                          fontSize = 10.sp,
//                          color = Color.Black,
//                      )
//                      Spacer(modifier = Modifier.height(20.dp))
//                    }
//
//                Spacer(modifier = Modifier.height(15.dp))
//
//                Text("@. Masai Mara Lodges",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 20.sp,
//                    color = Color.Blue,)
//                Spacer(modifier = Modifier.height(15.dp))
//
//                    Column {
//                        Text("...Masai mara Game reserve is eguiped,",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Black,)
//                        Text("with proper accomodation in its  ",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Black,)
//                        Text("sorroundings and incredible road",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Black,)
//                        Text("network connected within the park",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Black,)
//                        Text("some of the lodges are Muthu Keekorok",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Black,)
//                        Text("Lodge and Mara Serena Safari Lodge",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Black,)
//
//                    }
//
//                Spacer(modifier = Modifier.height(20.dp))
//






            }


        }

    }

}






