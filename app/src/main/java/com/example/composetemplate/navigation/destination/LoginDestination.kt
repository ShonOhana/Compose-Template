package com.example.composetemplate.navigation.destination

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Contract for information needed on every Login navigation destination
 */
interface LoginDestination {
    val route: String
}

/**
 * Rally app navigation destinations
 */
object Login : LoginDestination {
    override val route = "login"
}

object Register : LoginDestination {
    override val route = "register"
}