package com.example.mvvm.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_Tour
import com.example.mvvm.navigation.ROUTE_insert
import com.example.mvvm.navigation.ROUTE_travel
import com.example.mvvm.navigation.ROUTE_vewproducts

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {

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
        content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)  // Padding for the whole screen
            ) {
                item {
                    // Header Section with Modern Card Styling
                    HeaderCard()

                    Spacer(modifier = Modifier.height(20.dp))

                    // Action Buttons Section
                    ActionButtons(navController)

                    Spacer(modifier = Modifier.height(20.dp))

                    // Informational Section
                    InfoSection()

                    Spacer(modifier = Modifier.height(20.dp))

                    // Kenya Info Section
                    KenyaInfoSection()

                    Spacer(modifier = Modifier.height(40.dp))
                }
            }
        }
    )
}

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

@Composable
fun ActionButtons(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = { navController.navigate(ROUTE_Tour) },
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(Color(0xFF6200EE))
        ) {
            Text(text = "Tour", color = Color.White)
        }

        Button(
            onClick = { navController.navigate(ROUTE_travel) },
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(Color(0xFF6200EE))
        ) {
            Text(text = "Press Travel", color = Color.White)
        }
    }
}

@Composable
fun InfoSection() {
    Column {
        Text(
            text = "*..WELCOME TO OUR TOUR",
            style = TextStyle(
                color = Color(0xFF6200EE),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text(
            text = "*..AND TRAVEL APP",
            style = TextStyle(
                color = Color(0xFF6200EE),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "1. What's tour?",
            style = TextStyle(
                color = Color(0xFF3700B3),
                fontSize = 15.sp
            ),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text(
            text = "...A tour is an organized trip where people explore different places...",
            style = TextStyle(color = Color.Black, fontSize = 12.sp),
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Composable
fun KenyaInfoSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
            .background(Color.White, shape = RoundedCornerShape(16.dp)),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = "https://th.bing.com/th/id/OIP.xBHl_QOUWyjLLksZuppboAHaGZ?w=238&h=206&c=7&r=0&o=5&pid=1.7",
                contentDescription = "Kenya Image",
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(50))
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Love for Kenya",
                style = TextStyle(
                    color = Color(0xFF6200EE),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Rift valley region",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "...Kenya is known as the floating city with a unique charm...",
                style = TextStyle(color = Color.Black, fontSize = 12.sp),
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Home(navController = NavController(context = LocalContext.current)) // Replace with valid NavController
}
