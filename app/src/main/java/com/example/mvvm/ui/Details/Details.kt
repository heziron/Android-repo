
package com.example.mvvm.ui.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.google.firebase.firestore.FirebaseFirestore
import com.android.billingclient.api.ProductDetails as ProductDetails1

@Composable
fun DetailsScreen(productId: String) {
    var product by remember { mutableStateOf<Product?>(null) }
    var isLoading by remember { mutableStateOf(true) }

    val firestore = FirebaseFirestore.getInstance()

    // Fetch product details from Firestore using product ID
    LaunchedEffect(productId) {
        firestore.collection("products").document(productId)
            .get()
            .addOnSuccessListener { documentSnapshot ->
                product = documentSnapshot.toObject(Product::class.java)
                isLoading = false
            }
            .addOnFailureListener {
                isLoading = false
            }
    }

    // Layout
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
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
            ) {
                Text(
                    text = "Package Details",
                    style = MaterialTheme.typography.h5.copy(
                        textDecoration = TextDecoration.Underline
                    ),
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(10.dp))

                // Show a progress indicator while loading
                if (isLoading) {
                    LinearProgressIndicator(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(15.dp),
                        color = Color.Green // progress color
                    )
                } else if (product == null) {
                    Text(text = "Package not found", fontSize = 20.sp, color = Color.Gray)
                } else {
                    // Display product details
                    ProductDetails(product!!)
                }
            }
        }
    }
}

@Composable
fun ProductDetails(product: Product) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        // Product Image
        product.image?.let {
            Image(
                painter = rememberImagePainter(it),
                contentDescription = "package Image",
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
            )
        }

        // Air Ticket Name
        Text(
            text = "Air Ticket: ${product.airTicket}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        // Ticket Price
        Text(
            text = "Ticket Price: ${product.ticketPrice}",
            fontSize = 18.sp,
            color = Color.Gray
        )

        // Product Description
        Text(
            text = "Description: ${product.productDescription}",
            fontSize = 16.sp,
            color = Color.DarkGray
        )

        // Phone
        Text(
            text = "Phone: ${product.phone}",
            fontSize = 16.sp,
            color = Color.Black
        )

        // Nationality
        Text(
            text = "Nationality: ${product.nationality}",
            fontSize = 16.sp,
            color = Color.Black
        )

        // Spacer at the bottom
        Spacer(modifier = Modifier.height(20.dp))

        // You can add more components as needed, like a 'Contact' button or other interactions
    }
}

