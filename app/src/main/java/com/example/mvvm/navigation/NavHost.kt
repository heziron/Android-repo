package com.example.mvvm.navigation

import android.provider.ContactsContract.Intents.Insert
import android.telecom.Call
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.App.App
import com.example.mvvm.ui.Insert.InsertProductsScreen
//import com.example.mvvm.ui.Details.Details
import com.example.mvvm.ui.about.About
import com.example.mvvm.ui.aeroplane.Bookseats
import com.example.mvvm.ui.home.Home
import com.example.mvvm.ui.products.DetailsScreen
import com.example.mvvm.ui.products.ProductDetails
import com.example.mvvm.ui.products.ViewProductsScreen

//import com.example.mvvm.ui.products.VewProducts
import com.example.mvvm.ui.reserve.Reserve
import com.example.mvvm.ui.shop.Shop
import com.example.mvvm.ui.softwares.Softwares
import com.example.mvvm.ui.tech.tech
import com.example.mvvm.ui.tour.Tour
import com.example.mvvm.ui.travel.Travel


@Composable
fun AppNavHost(

    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME
){

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(ROUTE_ABOUT){

            About(navController = navController )

        }





      composable(ROUTE_HOME){

          Home(navController)

      }

        composable(ROUTE_ABOUT){

            About(navController)


        }


        composable(ROUTE_SHOP){

            Shop(navController)

        }

         composable(ROUTE_SOFTWARES) {
             Softwares(navController = navController )

         }

         composable(ROUTE_tech){

             tech(navController )

         }

          composable(ROUTE_App){

            App(navController)

          }

        composable(ROUTE_vewproducts){

            ViewProductsScreen(navController)
        }

//           composable(ROUTE_vewproducts){
//
//           }

          composable(ROUTE_Tour){

              Tour(navController)

          }

          composable(ROUTE_travel){

              Travel(navController )

          }

        composable(Route_Reserve){

            Reserve(navController)

        }

        composable(Route_bookseats){

            Bookseats(navController )

        }

      composable(ROUTE_insert){

          InsertProductsScreen(navController)
      }

          composable(Route_Details){

              DetailsScreen(navController.toString())
          }


        composable("details/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")
            productId?.let {
                DetailsScreen(productId)
            }
        }

































    }
















}




