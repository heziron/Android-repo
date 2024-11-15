package com.example.mvvm.ui.aeroplane


import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_vewproducts
import com.example.mvvm.navigation.Route_Details
import com.example.mvvm.navigation.Route_bookseats


@Composable
fun Bookseats(navController: NavController) {


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


                Button(onClick = { navController.navigate(Route_Details) }) {
                    Card {
                        Text(
                            text = " details",
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

//                Spacer(modifier = Modifier.height(15.dp))

//                Text(".Book your tickets here.",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 15.sp,
//                    color = Color.Blue,)
//                Spacer(modifier = Modifier.height(15.dp))
//
//
//                Text(".Booked tickets.",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 15.sp,
//                    color = Color.Blue,)
//                Spacer(modifier = Modifier.height(15.dp))
//
//                Row {
//                    Column {
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Text("1 ")
//
//                    }
//
//
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Text(" 2")
//
//                    }
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//
//                        Text("3")
//
//                    }
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Text("4")
//
//                    }
//
//                }
//
//                Spacer(modifier = Modifier.height(20.dp))
//
//
//                Row {
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Text("5 ")
//
//                    }
//
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//
//                        Text("6")
//
//                    }
//
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Text("7 ")
//
//                    }
//
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://thumbs.dreamstime.com/b/air-tickets-design-template-first-class-flight-two-sides-plane-ticket-194221743.jpg",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.White)
//
//                        )
//                        Text(" 8")
//
//                    }
//
//                }
//
//                Spacer(modifier = Modifier.height(20.dp))
//
//                Text("Unbooked tickets",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 15.sp,
//                    color = Color.Blue,
//
//                    )
//
//                Spacer(modifier = Modifier.height(15.dp))
//
//                Row {
//                    Column {
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//                        Text("A ")
//
//                    }
//
//
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//                        Text(" B")
//
//                    }
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//
//                        Text("A ")
//
//                    }
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//                        Text("B")
//
//                    }
//
//                }
//
//                Spacer(modifier = Modifier.height(20.dp))
//
//
//                Row {
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//                        Text("A ")
//
//                    }
//
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//
//                        Text("B")
//
//                    }
//
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Spacer(modifier = Modifier.width(40.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//                        Text("A")
//
//                    }
//
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.Lpcy8rXSk8xPCrN7dc4yHQHaFr?rs=1&pid=ImgDetMain",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(50.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.LightGray)
//
//                        )
//                        Text("B")
//
//                    }
//
//                }
//
//
//                Spacer(modifier = Modifier.height(10.dp))
//             Card(
//                 colors = CardDefaults.cardColors(Color.Blue),
//                 elevation = CardDefaults.cardElevation(8.dp)
//             ) {
//                 Text(
//                     text = "Click here to book it now ",
//
//                     modifier = Modifier
//
//                         .clickable { navController.navigate(ROUTE_vewproducts) }
//                 )
//             }
//                Spacer(modifier = Modifier.height(15.dp))
//
//                Text("Another 1000 more unbooked tickets",
//                    modifier = Modifier
//                        .background(Color.LightGray),
//                    fontSize = 10.sp,
//                    color = Color.Red,)
//                Spacer(modifier = Modifier.height(20.dp))
//                Card (
//                    colors = CardDefaults.cardColors(Color.LightGray),
//                    elevation = CardDefaults.cardElevation(8.dp)

//                ){
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.CRmTvEhNODmNYKgsA0NxSwHaEK?w=286&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(300.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//                                .width(100.dp)
//
//                        )
//
//
//                        Spacer(modifier = Modifier.width(50.dp))
//
//                        Text("Terminal airbus 321A",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Blue,
//
//                            )
//
//
//                    }
//
//                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(".Itinerary",
                    textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 25.sp,
                    color = Color.Magenta,

                    )
                Spacer(modifier = Modifier.height(10.dp))
                Text("...Travel with us by Road/Air",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,

                    )
                Spacer(modifier = Modifier.height(20.dp))

                Column {
                  Row {
                      Text(
                          "Day",
                          modifier = Modifier
                              .background(Color.LightGray),
                          fontSize = 10.sp,
                          color = Color.Black,

                          )
                      Spacer(modifier = Modifier.width(3.dp))

                      Text(
                          "1",
                          modifier = Modifier
                              .background(Color.LightGray),
                          fontSize = 10.sp,
                          color = Color.Black,

                          )
                      Spacer(modifier = Modifier.width(3.dp))
                      Text(
                          "-",
                          modifier = Modifier
                              .background(Color.LightGray),
                          fontSize = 10.sp,
                          color = Color.Black,

                          )

                      Spacer(modifier = Modifier.width(3.dp))
                   Column {
                       Text(
                           "Depature from Kenyatta International ",
                           modifier = Modifier
                               .background(Color.LightGray),
                           fontSize = 10.sp,
                           color = Color.Black,

                           )
                       Text(
                           "Airport to Royal lodge for  ",
                           modifier = Modifier
                               .background(Color.LightGray),
                           fontSize = 10.sp,
                           color = Color.Black,

                           )
                       Text(
                           "night stay ",
                           modifier = Modifier
                               .background(Color.LightGray),
                           fontSize = 10.sp,
                           color = Color.Black,

                           )
                   }
                  }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        Text(
                            "Day",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            "2",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            "-",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Spacer(modifier = Modifier.width(3.dp))
                        Column {
                            Text(
                                "Drive to Lake.Nakuru(2hours),",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "then hike to hyrax hill  ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "(4-5hrs).then to Safari Lodge for night ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        Text(
                            "Day",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            "3",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            "-",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Spacer(modifier = Modifier.width(3.dp))
                        Column {
                            Text(
                                "Travel to Baringo(5-6hrs).Enjoy the  ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "L.Bogoria hot Springs and  L.Baringo ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "Snake parks then to Spur Resort ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        Text(
                            "Day",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            "4",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            "-",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Spacer(modifier = Modifier.width(3.dp))
                        Column {
                            Text(
                                "Depart Spur resort to Masai Mara(1-15 hrs,) ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "enjoy the big five and wild beasts migration ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "through Mara River to Serengeti Tanzania ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        Text(
                            "Day",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            "5",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            "-",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Spacer(modifier = Modifier.width(3.dp))
                        Column {
                            Text(
                                "Drive to Amboseli (2-6hrs) for a nearly tour completion ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "then back to Nairobi for the N. museums & Bomas of kenya  ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                            Text(
                                "and animal orphanage before comensing the tour",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,

                                )
                        }
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(".Tourist seat bookings",
                    textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Magenta,

                    )
                Spacer(modifier = Modifier.height(20.dp))

                Text("...Tourist class A",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Blue,

                    )

                Spacer(modifier = Modifier.height(5.dp))


                Text("Vip class ",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,

                    )
                Spacer(modifier = Modifier.height(20.dp))


                Row {
                     Column {
                         AsyncImage(
                             model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                             contentDescription = "null",

                             modifier = Modifier
                                 .size(50.dp)
                                 .clip(RoundedCornerShape(percent = 10))
                                 .background(Color.Cyan)

                         )
                             Text("Travel ")

                     }



                    Spacer(modifier = Modifier.width(5.dp))

                    Column {
                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text(" save")

                }
                    Spacer(modifier = Modifier.width(40.dp))
                  Card(
                      colors = CardDefaults.cardColors(Color.Black),
                      elevation = CardDefaults.cardElevation(8.dp)

                  ) {
                      Text(
                          "1",
                          modifier = Modifier
                              .background(Color.Black),
                          fontSize = 10.sp,
                          color = Color.Green,
                      )
                  }
                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )

                    Text("Travel ")

                }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text("save")

                }

                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("Travel ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )

                        Text("save")

                    }

                    Spacer(modifier = Modifier.width(40.dp))
                 Card(
                     colors = CardDefaults.cardColors(Color.Black),
                     elevation = CardDefaults.cardElevation(8.dp)

                 ) {
                     Text(
                         "2",
                         modifier = Modifier
                             .background(Color.Black),
                         fontSize = 10.sp,
                         color = Color.Green,
                     )
                 }
                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("Travel ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text(" save")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))

                Text("Tourist class B",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 15.sp,
                    color = Color.Blue,

                    )
                Spacer(modifier = Modifier.height(5.dp))
                Text("Economy class",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 10.sp,
                    color = Color.Blue,

                    )
                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("Travel ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("save")

                    }


                    Spacer(modifier = Modifier.width(40.dp))
                 Card (
                     colors = CardDefaults.cardColors(Color.Cyan),
                     elevation = CardDefaults.cardElevation(8.dp)

                 ){
                     Text(
                         "1",
                         modifier = Modifier
                             .background(Color.Cyan),
                         fontSize = 10.sp,
                         color = Color.Black,
                     )
                 }
                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )

                        Text("Travel ")

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("save")

                    }


                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("Travel ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text(" save")

                    }


                    Spacer(modifier = Modifier.width(40.dp))



                 Card(

                     colors = CardDefaults.cardColors(Color.Cyan),
                     elevation = CardDefaults.cardElevation(8.dp)

                 ) {
                     Text(
                         "2",
                         modifier = Modifier
                             .background(Color.Cyan),
                         fontSize = 10.sp,
                         color = Color.Black,
                     )
                 }
                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text("Travel ")

                    }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                        Text(" save")

                    }

                }

                Spacer(modifier = Modifier.height(20.dp))

                Row {

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )

                        Text("Travel ")

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text(" save")

                }


                    Spacer(modifier = Modifier.width(40.dp))

                    Card (
                        colors = CardDefaults.cardColors(Color.Cyan),
                        elevation = CardDefaults.cardElevation(8.dp)

                    ){

                        Text(
                            "3",
                            modifier = Modifier
                                .background(Color.Cyan),
                            fontSize = 10.sp,
                            color = Color.Black,
                        )
                    }
                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text("Travel")

                }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text(" save")

                }

                }

                Spacer(modifier = Modifier.height(20.dp))


                Row {

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text("Travel ")

                }


                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text(" save")

                }


                    Spacer(modifier = Modifier.width(40.dp))


                 Card(

                     colors = CardDefaults.cardColors(Color.Cyan),
                     elevation = CardDefaults.cardElevation(8.dp)

                 ) {
                     Text(
                         "4",
                         modifier = Modifier
                             .background(Color.Cyan),
                         fontSize = 10.sp,
                         color = Color.Black,
                     )
                 }
                    Spacer(modifier = Modifier.width(40.dp))

                    Column {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.RNBEeJDkDncAMIkVDkZKgQHaHa?pid=ImgDet&w=173&h=173&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text("Travel ")

                }

                    Spacer(modifier = Modifier.width(5.dp))

                    Column {

                    AsyncImage(
                        model = "https://www.macrobaby.com/cdn/shop/files/cybex-cloud-t-sensorsafe-infant-car-seat-mirage-grey_image_2_1600x.jpg?v=1729689320",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Cyan)

                    )
                    Text(" save")

                }

                }




                Card(
                    colors = CardDefaults.cardColors(Color.Black),
                    elevation = CardDefaults.cardElevation(8.dp)

                ) {
                    Row {
                     Card(
                         colors = CardDefaults.cardColors(Color.Yellow),
                         elevation = CardDefaults.cardElevation(8.dp)

                     ) {
                         Text("300")

                     }
                        Spacer(modifier = Modifier.width(20.dp))


                        Card(
                            colors = CardDefaults.cardColors(Color.Blue),
                            elevation = CardDefaults.cardElevation(8.dp)

                        ) {
                            Text("****")
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                        Card(
                            colors = CardDefaults.cardColors(Color.Cyan),
                            elevation = CardDefaults.cardElevation(8.dp)
                        ) {
                            Text(
                                text = " Check out tickets ",

                                modifier = Modifier

                                    .clickable { navController.navigate(ROUTE_vewproducts) }
                            )
                        }
//                      Card (
//                          colors = CardDefaults.cardColors(Color.Cyan),
//                          elevation = CardDefaults.cardElevation(8.dp)
//                      ){
//                          Text("Check out")
//                      }
                        Spacer(modifier = Modifier.width(30.dp))


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























































            }
        }
    }
}
