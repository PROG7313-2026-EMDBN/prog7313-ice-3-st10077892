package com.example.microtripsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.microtripsapp.data.Gem
import com.example.microtripsapp.ui.screens.DetailScreen
import com.example.microtripsapp.ui.screens.ExploreScreen
import com.example.microtripsapp.ui.screens.SavedScreen
import com.example.microtripsapp.ui.screens.SettingsScreen

@Composable
fun AppNavGraph(navController: NavHostController) {

    // Hardcoded data instead of JSON
    val gems = listOf(
        Gem(
            id = "1",
            name = "Umhlanga Lighthouse",
            province = "KwaZulu-Natal",
            description = "Famous red and white lighthouse with beautiful ocean views.",
            image = "umhlanga",
            location = "Umhlanga Lighthouse Durban",
            transport = 50,
            food = 120,
            entry = 0,
            misc = 40
        ),
        Gem(
            id = "2",
            name = "Table Mountain",
            province = "Western Cape",
            description = "One of the New Seven Wonders of Nature.",
            image = "tablemountain",
            location = "Table Mountain Cape Town",
            transport = 120,
            food = 200,
            entry = 350,
            misc = 80
        ),
        Gem(
            id = "3",
            name = "Blyde River Canyon",
            province = "Mpumalanga",
            description = "One of the largest green canyons in the world.",
            image = "blyde",
            location = "Blyde River Canyon Mpumalanga",
            transport = 200,
            food = 150,
            entry = 50,
            misc = 60
        )
    )

    NavHost(
        navController = navController,
        startDestination = "explore"
    ) {

        composable("explore") {
            ExploreScreen(navController, gems)
        }

        composable(
            route = "detail/{gemId}",
            arguments = listOf(
                navArgument("gemId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val gemId = backStackEntry.arguments?.getString("gemId")
            val gem = gems.find { it.id == gemId }

            if (gem != null) {
                DetailScreen(navController, gem)
            }

        }

        composable("saved") {
            SavedScreen(navController, gems)
        }

        composable("settings") {
            SettingsScreen()
        }

    }
}