package com.example.mvvm.ui.travel


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import com.example.mvvm.navigation.Route_Reserve
import com.example.mvvm.ui.tour.Scaffold

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun Travel(navController: NavController) {




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


                Button(onClick = { navController.navigate(Route_Reserve) }) {

                    Card {
                        Text(
                            text = "Tickets",

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

                            Text("*.TOUR&TRAVEL TIME",
                                textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 20.sp,
                                color = Color.Blue,)
                            Text("TABLE",
                                textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 20.sp,
                                color = Color.Blue,)
                Spacer(modifier = Modifier.height(10.dp))

                Text("Entrance fee 1000/=",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Red,)
                Spacer(modifier = Modifier.height(10.dp))
              Row {
                  Column { Text("Mon",
                      modifier = Modifier
                          .background(Color.LightGray),
                      fontSize = 15.sp,
                      color = Color.Blue,)}

                  Spacer(modifier = Modifier.width(15.dp))
                  Column {
                           Text("Nairobi",
                               modifier = Modifier
                                   .background(Color.Yellow),
                               fontSize = 10.sp,
                               color = Color.Black,)
                           Text("7.am-4.pm",
                               textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                               modifier = Modifier
                                   .background(Color.LightGray),
                               fontSize = 10.sp,
                               color = Color.Black,)
                  }
                  Spacer(modifier = Modifier.width(15.dp))
                  Column {

                           Text("Nakuru")
                           Text("8.am-5.pm",
                               textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                               )
                  }
                  Spacer(modifier = Modifier.width(15.dp))
                  Column {

                           Text("Baringo",
                               modifier = Modifier
                                   .background(Color.Green),
                               fontSize = 10.sp,
                               color = Color.Black,)
                           Text("9.am-3.pm",
                               textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),


                               modifier = Modifier
                                   .background(Color.LightGray),
                               fontSize = 10.sp,
                               color = Color.Black,)
                  }



              }
                Spacer(modifier = Modifier.height(15.dp))
                Row {
                    Column { Text("Tue",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 15.sp,
                        color = Color.Blue,)}

                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("Bomas of.k",
                            modifier = Modifier
                                .background(Color.Yellow),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("7.am-9.am",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {

                        Text("Hyrax Hill")
                        Text("8.am-10.am",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {

                        Text("Hot Springs",
                            modifier = Modifier
                                .background(Color.Green),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("9.am-11.am",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }



                }
                Spacer(modifier = Modifier.height(15.dp))
                Row {
                    Column { Text("Wed",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 15.sp,
                        color = Color.Blue,)}

                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("N.Museum",
                            modifier = Modifier
                                .background(Color.Yellow),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("9.am-12.am",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {

                        Text("Flamingoes.v")
                        Text("10.am-11.am",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {

                        Text("Snake Park",
                            modifier = Modifier
                                .background(Color.Green),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("11.am-1.pm",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }



                }
                Spacer(modifier = Modifier.height(15.dp))
                Row {
                    Column { Text("Th",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 15.sp,
                        color = Color.Blue,)}

                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("Nairobi.p",
                            modifier = Modifier
                                .background(Color.Yellow),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("12.am-3.pm",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {

                        Text("L.Nakuru")
                        Text("11.am-1.pm",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                            )
                    }
                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("L.Bogoria",
                            modifier = Modifier
                                .background(Color.Green),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("1.pm-3.pm",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }



                }
                Spacer(modifier = Modifier.height(15.dp))
                Row {
                    Column { Text("Fri",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 15.sp,
                        color = Color.Blue,)}

                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("A.Orphanage",
                            modifier = Modifier
                                .background(Color.Yellow),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("3.pm-4.pm",

                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("L.Nakuru")
                        Text("1.pm-5.pm",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                            )
                    }
                    Spacer(modifier = Modifier.width(15.dp))

                    Column {

                        Text("L.Bogoria",
                            modifier = Modifier
                                .background(Color.Green),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("3.pm-4.pm",
                            textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }



                }
                Spacer(modifier = Modifier.height(15.dp))

                Text("..HOTELS",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(15.dp))

                  Row {

                      Column {

                          Text("Nairobi",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Five Star ",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Hotel",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("*****5",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 20.sp,
                              color = Color.Red,)


                      }
                      Spacer(modifier = Modifier.width(10.dp))
                      Column {

                          Text("Nakuru",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Five Star ",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Hotel",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("*****5",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 20.sp,
                              color = Color.Red,)


                      }
                      Spacer(modifier = Modifier.width(10.dp))
                      Column {

                          Text("Baringo",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Five Star ",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Hotel",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("*****5",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 20.sp,
                              color = Color.Red,)


                      }
                      Spacer(modifier = Modifier.width(10.dp))
                      Column {

                          Text("Masai Mara",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Five Star ",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("Hotel",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 10.sp,
                              color = Color.Black,)
                          Text("*****5",
                              modifier = Modifier
                                  .background(Color.LightGray),
                              fontSize = 20.sp,
                              color = Color.Red,)


                      }
                  }
                Spacer(modifier = Modifier.height(15.dp))

                Text("Reservation",
                    textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Magenta,)

                Spacer(modifier = Modifier.height(10.dp))

                Text("Only a low monthly fee",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Black,)
                Spacer(modifier = Modifier.height(15.dp))

                Text("1. NO CONSUMER FEES",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,)

                Spacer(modifier = Modifier.height(7.dp))

                  Column {
                     Text("*..",
                         modifier = Modifier
                             .background(Color.LightGray),
                         fontSize = 20.sp,
                         color = Color.Green,)
                     Text("-Books does not apply additional fee ",
                         modifier = Modifier
                             .background(Color.LightGray),
                         fontSize = 10.sp,
                         color = Color.Black,)

                      Text("to customers.The price we set is ",
                          modifier = Modifier
                              .background(Color.LightGray),
                          fontSize = 10.sp,
                          color = Color.Black,)

                      Text("price our customers pays",
                          modifier = Modifier
                              .background(Color.LightGray),
                          fontSize = 10.sp,
                          color = Color.Black,)
                  }

                Spacer(modifier = Modifier.height(15.dp))

                Text("2. NO COMMISSIONS,NO FLAT FEES",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,)

                Spacer(modifier = Modifier.height(7.dp))

                Column {
                    Text("*..",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 20.sp,
                        color = Color.Green,)
                    Text("-Books does not charge commissions",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text("or flat fees on bookings",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                }

                Spacer(modifier = Modifier.height(15.dp))

                Text("3. NO LOCK-IN CONTRACT",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,)

                Spacer(modifier = Modifier.height(7.dp))

                Column {
                    Text("*..",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 20.sp,
                        color = Color.Green,)
                    Text("-Enjoy the freedom of no lock in ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text("contract with the convinience of a ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text("month-to-month subscription",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                }








                Spacer(modifier = Modifier.height(15.dp))


                Text("ADDITIONAL DETAILS",

                    textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Magenta,)


                Spacer(modifier = Modifier.height(15.dp))

                Text("*.WHAT TO CARRY ",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,)

                Spacer(modifier = Modifier.height(7.dp))

                Column {
                    Text("*..",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 20.sp,
                        color = Color.Green,)
                    Text(".  Warm woolenclothes ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text(".  Re-usable water bottles as we dont consume plastic bottles ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text(".  Protein bars/snacks(Optional)",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text("*.WHAT'S INCLUDED",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,)

                Spacer(modifier = Modifier.height(7.dp))

                Column {
                    Text("*..",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 20.sp,
                        color = Color.Green,)
                    Text(".  Domestic transfers(bus+flight)",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text(".  Accomodation (three-star hotel+home stay )",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text(".  Licensed English speaking guides )",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                    Text(".  First aid kit )",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text("*.WHAT'S NOT INCLUDED",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,)

                Spacer(modifier = Modifier.height(7.dp))

                Column {
                    Text(
                        "*..",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 20.sp,
                        color = Color.Green,
                    )
                    Text(
                        ".  International transfers. ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )

                    Text(
                        ".  Alcoholic beverages. ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )

                    Text(
                        ".  Personal expenses",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )

                    Text(
                        ".  Porter(if reguired)",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        "*. OVERVIEW",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Blue,
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Column {
                        Text(
                            "*..",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 20.sp,
                            color = Color.Green,
                        )
                        Text(
                            ".  Transportation - Tourist bus+flight. ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )

                        Text(
                            ".  Accomodation - hotel+home stay. ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )

                        Text(
                            ".  Fitness level - Anyone with sound health.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )

                        Text(
                            ".  Best season to travel - Winter",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )

                        Text(
                            ".  Tour type - Adventure.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )

                        Text(
                            ".  Language - English.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )
                    }
                }

                    Spacer(modifier = Modifier.height(15.dp))

                Text("-Our Lodges",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Magenta,)
//
//                Text("-Details",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 15.sp,
//                    color = Color.Blue,)


                Spacer(modifier = Modifier.height(15.dp))


                Text("*. La Maison Royale Lodge",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Cyan,)
                Spacer(modifier = Modifier.height(10.dp))


                Text("*. Safari Resort",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Cyan,)
                Spacer(modifier = Modifier.height(10.dp))


                Text("*. Spur Resort Bogoria",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Cyan,)
                Spacer(modifier = Modifier.height(10.dp))


                Text("*. Serena Lodge",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Cyan,)
                Spacer(modifier = Modifier.height(10.dp))


                Text("*. Muthu Lodge",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Cyan,)

                Spacer(modifier = Modifier.height(15.dp))

                Text("-Details",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(10.dp))
                Card(

                    colors = CardDefaults.cardColors(Color.Cyan),
                    elevation = CardDefaults.cardElevation(8.dp)

                ) {

                    Row {


                        AsyncImage(
                            model = "https://th.bing.com/th?id=OIP.UsGE3eaQVGmTb8XwedwFsAHaHa&w=250&h=250&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Spacer(modifier = Modifier.width(50.dp))

                        Column {
                            Text(
                                "Free breakfast",

                                )

                        }}
                }

                Spacer(modifier = Modifier.height(15.dp))

                Card (
                    colors = CardDefaults.cardColors(Color.Yellow),
                    elevation = CardDefaults.cardElevation(8.dp)

                ){

                    Row {


                        AsyncImage(
                            model = "https://th.bing.com/th?id=OIP.aWt0AeiEGkXx8f6z6-zddQHaFF&w=301&h=207&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Spacer(modifier = Modifier.width(50.dp))

                        Column {
                            Text(
                                "Free Wi-Fi",

                                )

                        }}
                }

                Spacer(modifier = Modifier.height(15.dp))

                Card(
                    colors = CardDefaults.cardColors(Color.Cyan),
                    elevation = CardDefaults.cardElevation(8.dp)

                ) {

                    Row {


                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.mLh3isk2acupA_droYNDxgHaGL?w=220&h=184&c=7&r=0&o=5&pid=1.7",
                            contentDescription = "null",


                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Spacer(modifier = Modifier.width(50.dp))

                        Column {
                            Text(
                                "Airport Shuttle",

                                )

                        }}
                }

                Spacer(modifier = Modifier.height(15.dp))


                Card (
                    colors = CardDefaults.cardColors(Color.Yellow),
                    elevation = CardDefaults.cardElevation(8.dp)

                ){

                    Row{


                        AsyncImage(
                            model = "https://th.bing.com/th?id=OIP.dgSttQvCZzxa7o-TL_HifgAAAA&w=240&h=259&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.White)

                        )
                        Spacer(modifier = Modifier.width(50.dp))

                        Column {
                            Text(
                                "Free Parking",

                                )

                        }}
                }

                Spacer(modifier = Modifier.height(15.dp))
























                Card (

                ){

                    Row(



                    ) {

                        Text("GRAPHICAL AREA OF MASAI MARA",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Blue,
                        )



//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Text("",
//
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Blue,
//
//                            )
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))





                Card (
                    colors = CardDefaults.cardColors(Color.Cyan),
                    elevation = CardDefaults.cardElevation(8.dp)

                ){
                    Column (

                        modifier = Modifier
                            .background(Color.LightGray)

                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally


                    ){


                        AsyncImage(
                            model = "https://th.bing.com/th/id/OIP.68jG55fOoarvDo6SHf668AHaGG?w=253&h=209&c=7&r=0&o=5&pid=1.7",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(150.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)
                                .width(100.dp)

                        )
                    }}

//                        Spacer(modifier = Modifier.width(50.dp))
//
//                        Text("The lion")
//
//
//                    }
//
//                }
//                Spacer(modifier = Modifier.height(20.dp))
//
//
//
//
//                 Card(
//                     colors = CardDefaults.cardColors(Color.Green),
//                     elevation = CardDefaults.cardElevation(8.dp)
//
//                 ) {
//                  Row {
//                     Column {
//
//                         AsyncImage(
//                             model = "https://th.bing.com/th/id/OIP.D5ONPGR4Iwi9PYdg01WRqAHaG8?w=188&h=180&c=7&r=0&o=5&pid=1.7",
//                             contentDescription = "null",
//
//
//                             modifier = Modifier
//                                 .size(100.dp)
//                                 .clip(RoundedCornerShape(percent = 10))
//                                 .background(Color.Gray)
//
//                         )
//
//                         Spacer(modifier = Modifier.height(10.dp))
//
//                         Text("Elephant")
//
//
//                     }
//
//                     Spacer(modifier = Modifier.width(15.dp))
//
//                     Column {
//
//                         AsyncImage(
//                             model = "https://th.bing.com/th/id/OIP.1zFwpp3G6-h8wt66un71dwHaLG?w=123&h=184&c=7&r=0&o=5&pid=1.7",
//                             contentDescription = "null",
//
//
//                             modifier = Modifier
//                                 .size(100.dp)
//                                 .clip(RoundedCornerShape(percent = 10))
//                                 .background(Color.Gray)
//
//                         )
//                         Spacer(modifier = Modifier.height(10.dp))
//
//                         Text("Giraffe")
//
//
//                     }
//
//                 }   }
//                Spacer(modifier = Modifier.height(40.dp))
//
//
//
//
//                 Card (
//
//                     colors = CardDefaults.cardColors(Color.Yellow),
//                     elevation = CardDefaults.cardElevation(8.dp)
//                 ){
//                  Row {
//                     Column {
//
//                         AsyncImage(
//                             model = "https://th.bing.com/th/id/OIP.fOnEGKxgcxxfZupVH4QE3AHaF_?w=202&h=180&c=7&r=0&o=5&pid=1.7",
//                             contentDescription = "null",
//
//                             modifier = Modifier
//                                 .size(100.dp)
//                                 .clip(RoundedCornerShape(percent = 10))
//                                 .background(Color.Gray)
//
//                         )
//
//                         Spacer(modifier = Modifier.height(10.dp))
//
//                         Text(" Black Rhino")
//
//
//                     }
//
//                     Spacer(modifier = Modifier.width(15.dp))
//
//                     Column {
//
//                         AsyncImage(
//                             model = "https://th.bing.com/th?id=OIF.ir75yVMvoPe1u%2fx8eaL1hQ&w=118&h=180&c=7&r=0&o=5&pid=1.7",
//                             contentDescription = "null",
//
//
//                             modifier = Modifier
//                                 .size(100.dp)
//                                 .clip(RoundedCornerShape(percent = 10))
//                                 .background(Color.Gray)
//
//                         )
//                         Spacer(modifier = Modifier.height(10.dp))
//
//                         Text("Tiger")
//
//
//                     }
//                 }
//                }
//
                Spacer(modifier = Modifier.height(40.dp))
//
//
//

                Card {

                    Column (

                        modifier = Modifier
                            .background(Color.LightGray)

                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally


                    ){


                     Column {
                         AsyncImage(
                             model = "https://th.bing.com/th/id/OIP.xBHl_QOUWyjLLksZuppboAHaGZ?w=238&h=206&c=7&r=0&o=5&pid=1.7",
                             contentDescription = "null",

                             modifier = Modifier
                                 .size(60.dp)
                                 .clip(RoundedCornerShape(percent = 10))
                                 .background(Color.White)

                         )

                         Spacer(modifier = Modifier.width(10.dp))

                         Text("Kenya",
                             modifier = Modifier
                                 .background(Color.LightGray),
                             fontSize = 10.sp,
                             color = Color.Black,)
                     }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text("Central region Nairobi",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)

                        Spacer(modifier = Modifier.height(20.dp))

                        Text("...Nairobi is known as the floating city,",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("is a captivating destination unlike ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("any other places, with its incredible ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("welcoming wild animals such as Lions, ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("Elephants,Giraffe,Rhinos and Tiger",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)



                    }


                }



//                Card {
//                   Column {
//
//
//                       AsyncImage(
//                           model = "https://th.bing.com/th?id=OIF.jTUon%2fjNUTFwzg0gnlQKXg&w=280&h=210&c=7&r=0&o=5&pid=1.7",
//                           contentDescription = "null",
//
//                           modifier = Modifier
//                               .size(300.dp)
//                               .clip(RoundedCornerShape(percent = 10))
//                               .background(Color.Gray)
//                               .width(100.dp)
//
//                       )
//
//
//                       Spacer(modifier = Modifier.width(50.dp))
//
//                       Text("Top destination",
//
//                           modifier = Modifier
//                               .background(Color.LightGray),
//                           fontSize = 10.sp,
//                           color = Color.Blue,
//                           )
//
//
//                   }
//
//                }
//                Spacer(modifier = Modifier.height(20.dp))
//
//
//
//                    Row {
//
//
//                      Column {
//
//                          AsyncImage(
//                              model = "https://th.bing.com/th/id/OIF.m5ZjAPDE8upJHdK6WqIHbA?w=174&h=180&c=7&r=0&o=5&pid=1.7",
//                              contentDescription = "null",
//
//                              modifier = Modifier
//                                  .size(170.dp)
//                                  .clip(RoundedCornerShape(percent = 10))
//                                  .background(Color.White)
//
//                          )
//
//                          Spacer(modifier = Modifier.height(10.dp))
//
//                          Text("Venice")
//                          Text("Veneto Region,Italy")
//
//                      }
//
//                        Spacer(modifier = Modifier.width(15.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIF.HseahXOL3VkrHmGX2iaPlw?w=130&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text("Mount Fuji")
//                        Text("Central Japan")
//
//
//                    }
//
//                }
//                Spacer(modifier = Modifier.height(40.dp))
//
//
//
//                Row {
//
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th?id=OIF.ZehcGgLCOb%2bM2jF9MhA6EQ&w=212&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text("The Great Wall")
//                        Text("Yuan District China")
//
//                    }
//
//                    Spacer(modifier = Modifier.width(15.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIF.9NINR9WUQr1t7TrkWcGhFQ?w=131&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text("Hagia Sophia")
//                        Text("Instanbul Turkey")
//
//
//                    }
//
//                }
//
//                Spacer(modifier = Modifier.height(40.dp))
//
//
//
//                Card (
//
//
//                    modifier = Modifier
//                        .background(Color.Gray)
//                        .fillMaxWidth()
//                        .fillMaxHeight(),
//
//
//
//                ){
//
//                    Row {
//
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIF.6mUTk1VlxtkaGLzPEaef4w?w=143&h=210&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(130.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//
//                        )
//                        Spacer(modifier = Modifier.width(100.dp))
//
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th?id=OIF.rhso6zUS6xw1nTkD0%2b4BSg&w=123&h=210&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//
//                        )
//
//
//                    }
//
//                }
//
//
//
//
//
//
//
//
//









            }

        }

    }

}