package com.example.mvvm.ui.about

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_ABOUT
import com.example.mvvm.navigation.ROUTE_SHOP

@Composable
fun About(navController: NavController){

    Column (



        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ){
        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "About screen")



        Text(
            text = "shop",
            modifier= Modifier
                .clickable { navController.navigate(ROUTE_SHOP) }
        )












    }



}