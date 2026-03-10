package com.example.microtripsapp.utils

import android.content.Context
import com.example.microtripsapp.data.Gem
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

object JsonLoader {

    fun loadGems(context: Context): List<Gem> {

        val json = context.assets
            .open("data/gems.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString(json)
    }
}