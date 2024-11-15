package com.example.mvvm.ui.tour


import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material.Scaffold
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.mvvm.R
import com.example.mvvm.navigation.ROUTE_insert
import com.example.mvvm.navigation.ROUTE_travel
import com.example.mvvm.navigation.ROUTE_vewproducts
import com.example.mvvm.ui.home.ActionButtons
import com.example.mvvm.ui.home.InfoSection
import com.example.mvvm.ui.home.KenyaInfoSection
import com.google.ai.client.generativeai.type.content
import com.google.firebase.vertexai.type.content


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable

fun Tour(navController: NavController) {










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

//
//                        modifier = Modifier
//                    .background(Color.LightGray)
//                    .fillMaxWidth()
//                    .fillMaxHeight(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Top


            )

            {
//
//                    AsyncImage(
//                        model = "https://happilyeverhiker.com/wp-content/uploads/2021/01/routeburn-track-best-hikes-new-zealand-3-720x480.jpg  ",
//                        contentDescription = "null",
//
//                        modifier = Modifier
//                            .size(300.dp)
//                            .clip(RoundedCornerShape(percent = 10))
//                            .background(Color.Gray)
//                            .height(300.dp)
//                            .width(20.dp)
//                    )
                //
                //


                 Button(onClick = { navController.navigate(ROUTE_travel) }) {

                     Card {
                         Text(
                             text = "Press travel",
                             textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),

                             modifier = Modifier
                                 .background(Color.Green),
                             fontSize = 10.sp,
                             color = Color.Blue,

                             )
                     }

                 }
                 Spacer(modifier = Modifier.width(5.dp))

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
//
//                 Card {
//                     Text(
//                         text = "WOX TOUR",
//                         modifier = Modifier
//                             .background(Color.Black),
//                         fontSize = 10.sp,
//                         color = Color.White,
//                     )
//                 }




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
                         Text("Welcome to our tours",

                             textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),




                             modifier = Modifier
                                 .background(Color.LightGray),
                             fontSize = 30.sp,
                             color = Color.Blue,)

                         Text(" for the Earths ",
                             textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                             modifier = Modifier
                                 .background(Color.LightGray),
                             fontSize = 20.sp,
                             color = Color.Blue,)
                         Text("exploration",
                             textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,)
                    Spacer(modifier = Modifier.height(15.dp))

                    Card(

//                    modifier = Modifier
//
//                        .clip(RoundedCornerShape(percent = 10))
//                        .background(Color.Cyan)

                        colors = CardDefaults.cardColors(Color.Green),
                        elevation = CardDefaults.cardElevation(8.dp)



                    ) {


                        Card {


                            Text(
                                " Explore the world with us",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Blue,


                                )
                        }

                    Spacer(modifier = Modifier.height(15.dp))


                    Row {


                        AsyncImage(
                            model = "https://img.freepik.com/premium-vector/bag-airplane-palm-logo-travel-leisure-vector-design_579306-26322.jpg?w=1480  ",
                            contentDescription = "null",


                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )


                        Spacer(modifier = Modifier.width(160.dp))


                        AsyncImage(
                            model = "https://img.freepik.com/premium-vector/bag-airplane-palm-logo-travel-leisure-vector-design_579306-26322.jpg?w=1480  ",
                            contentDescription = "null",

                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(percent = 10))
                                .background(Color.LightGray)

                        )


                    }



                    Spacer(modifier = Modifier.height(10.dp))

                             Card {
                                 Text(
                                     "Start new adventure",

                                     modifier = Modifier
                                         .background(Color.LightGray),
                                     fontSize = 10.sp,
                                     color = Color.Blue,

                                     )
                             }
                }





                Spacer(modifier = Modifier.height(15.dp))


                Card {

                    Text(
                        "..Hotel Navigation",

                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 20.sp,
                        color = Color.Blue,
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))


                Row {
                    Card{

                        Column{

                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.Blue)

                            )
                            Text("*****1",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Nairobi",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 12.sp,
                                color = Color.Yellow,)
                        }
                    }


                    Spacer(modifier = Modifier.width(5.dp))


                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.Green)

                            )

                            Text("*****2",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Nakuru",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 12.sp,
                                color = Color.Yellow,)
                        }
                    }


                    Spacer(modifier = Modifier.width(5.dp))



                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.Yellow)

                            )

                            Text("*****3",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Baringo",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 12.sp,
                                color = Color.Yellow,)
                        }
                    }



                    Spacer(modifier = Modifier.width(5.dp))




                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.Cyan)

                            )


                            Text("*****4",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Narok",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 12.sp,
                                color = Color.Yellow,)

                        }
                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Card {


                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.Black)

                            )


                            Text("*****5",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Amboseli",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 12.sp,
                                color = Color.Yellow,)

                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
             Row {
                 Text(
                     "..Accessibility",

                     modifier = Modifier
                         .background(Color.LightGray),
                     fontSize = 15.sp,
                     color = Color.Blue,
                 )

                 Spacer(modifier = Modifier.width(100.dp))

                 Text(
                     "..key visits",

                     modifier = Modifier
                         .background(Color.LightGray),
                     fontSize = 15.sp,
                     color = Color.Blue,
                 )

             }
                Spacer(modifier = Modifier.height(15.dp))

                Row {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.KJxZ5wxltjkZ4xqUONzJPQHaGH?pid=ImgDet&w=178&h=146&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Black)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                        Column {

                            Text("Welcome to Nairobi tours.",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,)
                            Text("International quests to use",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,)
                            Text("safari motors,tourist bus, flight ",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,)
                            Text("or private cars.",
                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Black,)
                        }

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text("S. Bomas of kenya",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("K.National Museums",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("N. Parks",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                }
                Spacer(modifier = Modifier.width(5.dp))
             Card {
                Row {


                    AsyncImage(
                        model = "https://th.bing.com/th?q=Phone+Button+Icon&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-WW&cc=KE&setlang=en&adlt=moderate&t=1&mw=247",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(20.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.White)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(
                            "Visit Maison Royale ",

                            modifier = Modifier
                                .background(Color.White),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Text(
                            " Tell/0111803334",
                            modifier = Modifier
                                .background(Color.Cyan),
                            fontSize = 10.sp,
                            color = Color.Red,
                        )
                    }  }}


                Spacer(modifier = Modifier.height(15.dp))
                Row {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.KJxZ5wxltjkZ4xqUONzJPQHaGH?pid=ImgDet&w=178&h=146&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Black)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {

                        Text("Welcome to Nakuru tours.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("International quests to use",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("safari motors,tourist bus,flight ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("or private cars.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text("N. Hirax hill",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("P.Flamingoes view",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("L.Nakuru",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                }
                Spacer(modifier = Modifier.width(5.dp))
              Card {
                Row {


                    AsyncImage(
                        model = "https://th.bing.com/th?q=Phone+Button+Icon&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-WW&cc=KE&setlang=en&adlt=moderate&t=1&mw=247",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(20.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.White)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(
                            "Visit Safari resort  ",
                            modifier = Modifier
                                .background(Color.White),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Text(
                            " Tell/0111803334",
                            modifier = Modifier
                                .background(Color.Cyan),
                            fontSize = 10.sp,
                            color = Color.Red,
                        )
                    }      }}
                Spacer(modifier = Modifier.height(15.dp))
                Row {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.KJxZ5wxltjkZ4xqUONzJPQHaGH?pid=ImgDet&w=178&h=146&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Black)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {

                        Text("Welcome to Baringo tours.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("International quests to use",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("safari motors,tourist bus,flight",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text(" or private cars.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text("L.Baringo view",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("L.Bogoria view",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("Snake parks",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("Hot Springs",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                }
                Spacer(modifier = Modifier.width(5.dp))
               Card {
                Row {


                    AsyncImage(
                        model = "https://th.bing.com/th?q=Phone+Button+Icon&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-WW&cc=KE&setlang=en&adlt=moderate&t=1&mw=247",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(20.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.White)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(
                            "Visit spur resort Bogoria ",
                            modifier = Modifier
                                .background(Color.White),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Text(
                            " Tell/0111803334",
                            modifier = Modifier
                                .background(Color.Cyan),
                            fontSize = 10.sp,
                            color = Color.Red,
                        )
                    }  }}
                Spacer(modifier = Modifier.height(15.dp))
                Row {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.KJxZ5wxltjkZ4xqUONzJPQHaGH?pid=ImgDet&w=178&h=146&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Black)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {

                        Text("Welcome to Narok game Reserve",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("International quests to use ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("safari motors,tourist bus,",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text(" flight or private cars.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text("A.Big five",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("T.Wildbeasts migration",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("S.All park animals",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                }
                Spacer(modifier = Modifier.width(5.dp))
               Card {
                Row {


                    AsyncImage(
                        model = "https://th.bing.com/th?q=Phone+Button+Icon&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-WW&cc=KE&setlang=en&adlt=moderate&t=1&mw=247",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(20.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.White)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(
                            "Visit Serena Lodge ",
                            modifier = Modifier
                                .background(Color.White),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Text(
                            " Tell/0111803334",
                            modifier = Modifier
                                .background(Color.Cyan),
                            fontSize = 10.sp,
                            color = Color.Red,
                        )
                    } }}
                Spacer(modifier = Modifier.height(15.dp))
                Row {

                    AsyncImage(
                        model = "https://th.bing.com/th/id/OIP.KJxZ5wxltjkZ4xqUONzJPQHaGH?pid=ImgDet&w=178&h=146&c=7",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.Black)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {

                        Text("Welcome to Amboseli tours.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("International quests to use",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("safari motors, tourist bus, flight ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("or private cars.",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text("S.Big five",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("A.Land scape",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                        Text("All park animals ",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 10.sp,
                            color = Color.Black,)
                    }
                }
                Spacer(modifier = Modifier.width(5.dp))
               Card {
                Row {


                    AsyncImage(
                        model = "https://th.bing.com/th?q=Phone+Button+Icon&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-WW&cc=KE&setlang=en&adlt=moderate&t=1&mw=247",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(20.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.White)

                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(
                            "Visit Muthu Lodge ",
                            modifier = Modifier
                                .background(Color.White),
                            fontSize = 10.sp,
                            color = Color.Black,

                            )

                        Text(
                            " Tell/0111803334",
                            modifier = Modifier
                                .background(Color.Cyan),
                            fontSize = 10.sp,
                            color = Color.Red,
                        )
                    } }}
                Spacer(modifier = Modifier.height(15.dp))



                Row {

                    AsyncImage(
                        model = "https://th.bing.com/th?q=Large+Blue+Button+Icon&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-WW&cc=KE&setlang=en&adlt=moderate&t=1&mw=247",
                        contentDescription = "null",

                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(percent = 10))
                            .background(Color.White)

                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text("Caution!!! Caution!!! Caution!!!",

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 12.sp,
                            color = Color.Red,)
                        Text("all tourists are not allowed to get",

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 12.sp,
                            color = Color.Red,)
                        Text("outside their cars while in parks",

                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 12.sp,
                            color = Color.Red,)
                    }
                }


                Spacer(modifier = Modifier.height(15.dp))


                Card {

                    Text(
                        "Top destinations",
                        textDecoration = TextDecoration.Underline.plus(TextDecoration.Underline),
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 25.sp,
                        color = Color.Blue,
                    )
                }

//                Spacer(modifier = Modifier.height(15.dp))


//
//                Card(
//
//
//                    colors = CardDefaults.cardColors(Color.LightGray),
//                    elevation = CardDefaults.cardElevation(8.dp)
//
//
//
//                ) {
//
//
//                    Row {
//
//                        Column {
//
//                            Text("Travel travel ",
//                                modifier = Modifier
//                                    .background(Color.LightGray),
//                                fontSize = 10.sp,
//                                color = Color.Black,)
//
//
//                            Spacer(modifier = Modifier.height(10.dp))
//
//                            AsyncImage(
//                                model = "https://static.vecteezy.com/system/resources/previews/025/371/322/original/plane-faster-icon-logo-of-express-and-delivery-illustration-vector.jpg ",
//                                contentDescription = "null",
//
//                                modifier = Modifier
//                                    .size(40.dp)
//                                    .clip(RoundedCornerShape(percent = 10))
//                                    .background(Color.White)
//
//                            )
//
//                            Text(" L.Nakuru",
//                                modifier = Modifier
//                                    .background(Color.LightGray),
//                                fontSize = 10.sp,
//                                color = Color.Black,)
//                            Text("the flamingos",
//                                modifier = Modifier
//                                    .background(Color.LightGray),
//                                fontSize = 10.sp,
//                                color = Color.Black,)
//                        }
//
//
//
//                        Spacer(modifier = Modifier.width(150.dp))
//
//
//
//                        Column {
//
//                            Text("see all places",
//                                modifier = Modifier
//                                    .background(Color.LightGray),
//                                fontSize = 10.sp,
//                                color = Color.Black,)
//
//                            Spacer(modifier = Modifier.height(10.dp))
//
//
//                            AsyncImage(
//                                model = "https://static.vecteezy.com/system/resources/previews/025/371/322/original/plane-faster-icon-logo-of-express-and-delivery-illustration-vector.jpg ",
//                                contentDescription = "null",
//
//                                modifier = Modifier
//                                    .size(40.dp)
//                                    .clip(RoundedCornerShape(percent = 10))
//                                    .background(Color.White)
//
//                            )
//
//                            Text("Masai mara",
//                                modifier = Modifier
//                                    .background(Color.LightGray),
//                                fontSize = 10.sp,
//                                color = Color.Black,)
//                            Text("Wildbeasts",
//                                modifier = Modifier
//                                    .background(Color.LightGray),
//                                fontSize = 10.sp,
//                                color = Color.Black,)
//
//                        }
//                    }
//                }
// Text(
//                        "Top destinations",
//
//                        modifier = Modifier
//                            .background(Color.LightGray),
//                        fontSize = 15.sp,
//                        color = Color.Blue,
//                    )



                Text(
                    ".Masai Mara",

                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Magenta,
                )
                Spacer(modifier = Modifier.height(15.dp))

                Text("Parts of mara reserve",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(15.dp))

                Spacer(modifier = Modifier.height(15.dp))

                Text("...Parts of mara reserve",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Column {

                        Card(colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp) )  {
                            Column {
                                Text("The")
                                Text("bigg",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("five")
                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card (colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp) ){
                            Column {
                                Text("The ")
                                Text("colk",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("four")
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))

                        Card (colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp) ){
                            Column {
                                Text(" The ")
                                Text("boon",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("five")
                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))

                        Card (colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp)                                              ){
                            Column {
                                Text("The ")
                                Text("beas",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("four")
                            }
                        }

                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Column {

                        Card ( ){
                            Column {
                                Text("Eastern ")
                                Text("part of",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("Mara")
                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card (){
                            Column {
                                Text("Northen")
                                Text("part of",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("Mara")
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))

                        Card( ) {
                            Column {
                                Text("Southen ")
                                Text("part of",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("Mara")
                            }
                        }



                        Spacer(modifier = Modifier.height(15.dp))

                        Card ( ){
                            Column {
                                Text("Western ")
                                Text("part of",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("Mara")
                            }
                        }

                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Column {

                        Card ( colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp)){
                            Column {
                                Text("15 ")
                                Text("kilometre",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("to warden")
                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card( colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp)) {
                            Column {
                                Text("10 ")
                                Text("kilometre",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("to warden")
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))

                        Card( colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp)) {
                            Column {
                                Text("5 ")
                                Text("kilometre",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("to warden")
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Card ( colors = CardDefaults.cardColors(Color.Gray),
                            elevation = CardDefaults.cardElevation(8.dp))

                        {

                            Column {
                                Text("3 ")
                                Text("kilometre",
                                    modifier = Modifier
                                        .background(Color.LightGray),
                                    fontSize = 10.sp,
                                    color = Color.Blue,)
                                Text("to warden")


                            }
                        }

                    }


                }
                Spacer(modifier = Modifier.height(15.dp))
                Text("..Serene Masai Mara Environs",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(15.dp))




                Column {

                    Text(
                        "...Welcome to Masai mara region in,",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )
                    Text(
                        "Narok County.Mara reserve is a ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )
                    Text(
                        "captivating destination of many ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )
                    Text(
                        "tourists across the world",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text("@. Masai Mara Lodges",
                    modifier = Modifier
                        .background(Color.LightGray),
                    fontSize = 20.sp,
                    color = Color.Blue,)
                Spacer(modifier = Modifier.height(15.dp))

                Column {
                    Text("...Masai mara Game reserve is eguiped,",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                    Text("with proper accomodation in its  ",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                    Text("sorroundings and incredible road",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                    Text("network connected within the park",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                    Text("some of the lodges are Muthu Keekorok",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)
                    Text("Lodge and Mara Serena Safari Lodge",
                        modifier = Modifier
                            .background(Color.LightGray),
                        fontSize = 10.sp,
                        color = Color.Black,)

                }

                Spacer(modifier = Modifier.height(20.dp))




                        Spacer(modifier = Modifier.height(15.dp))

                        Text("..Location to be",
                            modifier = Modifier
                                .background(Color.LightGray),
                            fontSize = 20.sp,
                            color = Color.Blue,
                        )








                Spacer(modifier = Modifier.height(10.dp))

                 Row {
                    Card{
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.White)

                            )
                            Text("Day 1",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Nairobi",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Yellow,)
                            Text("7.am-2pm",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Blue,)
                        }
                    }

                     Spacer(modifier = Modifier.width(5.dp))



                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.White)

                            )

                            Text("Day 2",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Nakuru",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Yellow,)
                            Text("7.am-4pm",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Blue,)
                        }
                    }


                     Spacer(modifier = Modifier.width(5.dp))



                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.White)

                            )

                            Text("Day 3",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Baringo",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Yellow,)
                            Text("1.pm-4pm",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Blue,)
                        }
                    }



                     Spacer(modifier = Modifier.width(5.dp))




                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.White)

                            )


                            Text(" Day 4",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Narok",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Yellow,)
                            Text("8.am-1pm",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Blue,)
                        }
                    }

                     Spacer(modifier = Modifier.width(5.dp))

                    Card {
                        Column {
                            AsyncImage(
                                model = "https://thumbs.dreamstime.com/b/gps-icon-vector-logo-design-map-pointer-pin-location-symbol-flat-style-navigation-icons-web-mobile-place-marker-travel-158027525.jpg",
                                contentDescription = "null",

                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(percent = 10))
                                    .background(Color.White)

                            )


                            Text("Day 5",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Green,)
                            Text("Amboseli",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Yellow,)
                            Text("11.am-1pm",

                                modifier = Modifier
                                    .background(Color.LightGray),
                                fontSize = 10.sp,
                                color = Color.Blue,)
                        }
                    }
                }

//
//                AsyncImage(
//                    model = "https://th.bing.com/th/id/OIP.OGehc1ygMRkKW6RcK7YJmwHaEN?w=528&h=300&rs=1&pid=ImgDetMain",
//                    contentDescription = "null",
//
//                    modifier = Modifier
//                        .size(300.dp)
//                        .clip(RoundedCornerShape(percent = 10))
//                        .background(Color.Gray)
//                        .height(300.dp)
//                        .width(20.dp)
//                )

                Spacer(modifier = Modifier.height(20.dp))

//
//                Card {
//
//                    Row {
//
//                        Text("The big five",
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                            fontSize = 10.sp,
//                            color = Color.Blue,
//                        )
//
//
//
//                        Spacer(modifier = Modifier.height(15.dp))
//
//                        Text("Roaming wild animals",
//
//                            modifier = Modifier
//                                .background(Color.LightGray),
//                                 fontSize = 10.sp,
//                            color = Color.Blue,
//
//                            )
//                    }
//                }
//
//                Spacer(modifier = Modifier.height(15.dp))
//
//
//
//
//
//                Card {
//                    Column {
//
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.4r74VVb9Fte24GOQKH7H4AHaE9?w=274&h=183&c=7&r=0&o=5&pid=1.7",
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
//                Row {
//
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.D5ONPGR4Iwi9PYdg01WRqAHaG8?w=188&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//
//                        )
//
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text("Elephant")
//
//
//                    }
//
//                    Spacer(modifier = Modifier.width(15.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th/id/OIP.1zFwpp3G6-h8wt66un71dwHaLG?w=123&h=184&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//
//                        )
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text("Giraffe")
//
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
//                            model = "https://th.bing.com/th/id/OIP.fOnEGKxgcxxfZupVH4QE3AHaF_?w=202&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//
//                        )
//
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text(" Black Rhino")
//
//
//                    }
//
//                    Spacer(modifier = Modifier.width(15.dp))
//
//                    Column {
//
//                        AsyncImage(
//                            model = "https://th.bing.com/th?id=OIF.ir75yVMvoPe1u%2fx8eaL1hQ&w=118&h=180&c=7&r=0&o=5&pid=1.7",
//                            contentDescription = "null",
//
//
//                            modifier = Modifier
//                                .size(170.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//                                .background(Color.Gray)
//
//                        )
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Text("Tiger")
//
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
//
//                    Card {
//
//                        Column (
//
//                            modifier = Modifier
//                                .background(Color.LightGray)
//
//                                .fillMaxWidth()
//                                .fillMaxHeight(),
//                            horizontalAlignment = Alignment.CenterHorizontally
//
//
//                        ){
//
//                            Text("Kenya")
//
//                            Spacer(modifier = Modifier.height(20.dp))
//
//                            Text("Central region Nairobi")
//
//                            Spacer(modifier = Modifier.height(20.dp))
//
//                            Text("Nairobi is known as the floating city,")
//                            Text("is a captivating destination unlike ")
//                            Text("any other places, with its incredible ")
//                            Text("welcoming wild animals such as Lions, ")
//                            Text("Elephants,Giraffe,Rhinos and Tiger")
//
//
//
//                        }
//
//
//                    }
//
//






















































}
        }


    }


}

fun content(): Any {
    TODO("Not yet implemented")
    return TODO("Provide the return value")
}

fun Scaffold(topBar: @Composable () -> Unit, bottomBar: @Composable () -> Unit) {

}
