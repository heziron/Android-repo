package com.example.mvvm.ui.Insert

import android.content.Context
import android.net.Uri
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.mvvm.navigation.ROUTE_HOME
import com.example.mvvm.navigation.ROUTE_vewproducts
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference


@Composable
fun InsertProductsScreen(navController: NavController) {
    var airTicket by remember { mutableStateOf("") }
    var ticketPrice by remember { mutableStateOf("") }
    var productDescription by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var nationality by remember { mutableStateOf("") }
    var productImageUri by remember { mutableStateOf<Uri?>(null) }
    var uploading by remember { mutableStateOf(false) }

    val firestore = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance().reference
    val context = LocalContext.current

    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? -> productImageUri = uri }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .background(Color(0xFFF0F0F0), shape = RoundedCornerShape(16.dp))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Insert Tickets",
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Air Ticket Input
                OutlinedTextField(
                    value = airTicket,
                    onValueChange = { airTicket = it },
                    label = { Text("Air Ticket") },
                    modifier = Modifier.fillMaxWidth(),

                )
                Spacer(modifier = Modifier.height(8.dp))

                // Ticket Price Input

                OutlinedTextField(
                    value = ticketPrice,
                    onValueChange = { ticketPrice = it },
                    label = { Text("Ticket Price") },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),

                )
                Spacer(modifier = Modifier.height(8.dp))

                // Product Description Input
                OutlinedTextField(
                    value = productDescription,
                    onValueChange = { productDescription = it },
                    label = { Text("Product Description") },
                    modifier = Modifier.fillMaxWidth(),

                )
                Spacer(modifier = Modifier.height(8.dp))

                // Phone Input
                OutlinedTextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text("Phone") },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone),

                )
                Spacer(modifier = Modifier.height(8.dp))

                // Nationality Input
                OutlinedTextField(
                    value = nationality,
                    onValueChange = { nationality = it },
                    label = { Text("Nationality") },
                    modifier = Modifier.fillMaxWidth(),

                )
                Spacer(modifier = Modifier.height(8.dp))

                // Select Image Button
                Button(
                    onClick = { imagePickerLauncher.launch("image/*") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Select Ticket Image")
                }

                // Display Image Preview
                productImageUri?.let {
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = rememberImagePainter(it),
                        contentDescription = "Selected Ticket Image",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Save Product Button
                Button(
                    onClick = {
                        if (airTicket.isNotEmpty() && ticketPrice.isNotEmpty() && phone.isNotEmpty() &&
                            nationality.isNotEmpty() && productDescription.isNotEmpty() && productImageUri != null) {
                            uploading = true

                            uploadProduct(
                                airTicket, ticketPrice, productDescription, phone, nationality,
                                productImageUri!!, storage, firestore, context, navController
                            ) { success: Boolean ->
                                uploading = false
                                val message = if (success) {
                                    "Package added successfully!"
                                } else {
                                    "Failed to add package"
                                }
                                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                            }
                        }
                    },
                    enabled = !uploading,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (uploading) {
                        CircularProgressIndicator(color = Color.White)
                    } else {
                        Text("Save Package")
                    }
                }
            }
        }
    }
}

fun uploadProduct(
    airTicket: String,
    ticketPrice: String,
    productDescription: String,
    phone: String,
    nationality: String,
    productImageUri: Uri,
    storage: StorageReference,
    firestore: FirebaseFirestore,
    context: Context,
    navController: NavController,
    onComplete: (Boolean) -> Unit
) {
    val storageRef = storage.child("products/${productImageUri.lastPathSegment}")
    val uploadTask = storageRef.putFile(productImageUri)

    uploadTask.continueWithTask { task ->
        if (!task.isSuccessful) {
            task.exception?.let {
                throw it
            }
        }
        storageRef.downloadUrl
    }.addOnCompleteListener { task ->
        if (task.isSuccessful) {
            val downloadUri = task.result
            val product = hashMapOf(
                "airTicket" to airTicket,
                "ticketPrice" to ticketPrice,
                "productDescription" to productDescription,
                "phone" to phone,
                "nationality" to nationality,
                "image" to downloadUri.toString()
            )

            firestore.collection("tickets").add(product)
                .addOnSuccessListener {
                    onComplete(true)
                    navController.navigate("home") // Replace "home" with your actual route
                }
                .addOnFailureListener {
                    onComplete(false)
                }
        } else {
            onComplete(false)
        }
    }
}


