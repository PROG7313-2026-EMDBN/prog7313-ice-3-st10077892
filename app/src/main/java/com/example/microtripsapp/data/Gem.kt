package com.example.microtripsapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Gem(
    val id: String,
    val name: String,
    val province: String,
    val description: String,
    val image: String,
    val location: String,
    val transport: Int,
    val food: Int,
    val entry: Int,
    val misc: Int
)