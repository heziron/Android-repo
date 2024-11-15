package com.example.mvvm.ui.tech

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_App
import com.example.mvvm.navigation.ROUTE_SHOP
import com.example.mvvm.navigation.ROUTE_tech

@Composable
fun tech(navController: NavController){

    Column (


        modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ){


        Spacer(modifier = Modifier.height(50.dp))

        AsyncImage(
        model = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png",
        contentDescription = "null",

        modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(percent = 10))
            .background(Color.Cyan)

        )


        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Hello world ")
        Text("this is a new technology ")
        Text("get in touch with us")








        Button(onClick = { navController.navigate(ROUTE_App) }) {

            Text(text = "open app")



        }


    }



}
