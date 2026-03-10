package com.example.microtripsapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.microtripsapp.data.Gem

@Composable
fun GemCard(gem: Gem, onClick: () -> Unit) {

    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clickable { onClick() }
    ) {

        Column {

            AsyncImage(
                model = "file:///android_asset/images/${gem.image}",
                contentDescription = gem.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )

            Column(
                modifier = Modifier.padding(12.dp)
            ) {

                Text(text = gem.name)
                Text(text = gem.province)

            }
        }
    }
}