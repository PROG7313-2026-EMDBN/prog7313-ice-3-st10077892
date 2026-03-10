package com.example.microtripsapp.utils

import android.content.Context
import android.content.Intent
import androidx.core.net.toUri

fun openMap(context: Context, location: String) {

    val uri = "geo:0,0?q=$location".toUri()

    val intent = Intent(Intent.ACTION_VIEW, uri)

    context.startActivity(intent)
}