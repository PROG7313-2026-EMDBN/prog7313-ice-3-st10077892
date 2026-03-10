package com.example.microtripsapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.microtripsapp.data.Gem
import com.example.microtripsapp.utils.openMap

@Composable
fun DetailScreen(
    navController: NavController,
    gem: Gem
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = gem.name,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = gem.description)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Location: ${gem.location}")

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                openMap(navController.context, gem.location)
            }
        ) {
            Text("Open in Maps")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.popBackStack() }
        ) {
            Text("Back")
        }
    }
}