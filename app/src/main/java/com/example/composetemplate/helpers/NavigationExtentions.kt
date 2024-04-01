package com.example.composetemplate.helpers

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

fun NavController.navigateSingleTopTo(route: String) {
    navigate(route = route) {
        popUpTo(
            graph.findStartDestination().id
        )
        launchSingleTop = true
        restoreState = true
    }
}
