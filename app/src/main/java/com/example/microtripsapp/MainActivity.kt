package com.example.microtripsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.microtripsapp.navigation.AppNavGraph
import com.example.microtripsapp.ui.theme.MicroTripsAppTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MicroTripsAppTheme {

                val navController = rememberNavController()
                val drawerState = rememberDrawerState(DrawerValue.Closed)
                val scope = rememberCoroutineScope()

                ModalNavigationDrawer(

                    drawerState = drawerState,

                    drawerContent = {

                        ModalDrawerSheet {

                            Text(
                                text = "Micro Trips",
                                style = MaterialTheme.typography.headlineSmall,
                                modifier = Modifier.padding(16.dp)
                            )

                            NavigationDrawerItem(
                                label = { Text("Explore") },
                                selected = false,
                                onClick = {
                                    scope.launch { drawerState.close() }
                                    navController.navigate("explore")
                                }
                            )

                            NavigationDrawerItem(
                                label = { Text("Saved") },
                                selected = false,
                                onClick = {
                                    scope.launch { drawerState.close() }
                                    navController.navigate("saved")
                                }
                            )

                            NavigationDrawerItem(
                                label = { Text("Settings") },
                                selected = false,
                                onClick = {
                                    scope.launch { drawerState.close() }
                                    navController.navigate("settings")
                                }
                            )
                        }
                    }

                ) {

                    Scaffold(

                        topBar = {

                            TopAppBar(

                                title = { Text("Micro Trips") },

                                navigationIcon = {

                                    IconButton(
                                        onClick = {
                                            scope.launch { drawerState.open() }
                                        }
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Menu,
                                            contentDescription = "Menu"
                                        )
                                    }

                                }

                            )

                        }

                    ) { padding ->

                        Surface(
                            modifier = Modifier.padding(padding)
                        ) {

                            // PASS navController to navigation graph
                            AppNavGraph(navController)

                        }

                    }

                }

            }

        }
    }
}