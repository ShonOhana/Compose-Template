package com.example.composetemplate.presentation.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun LoginScreenButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean,
    onClick: () -> Unit
) {
    ElevatedButton(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = Color.Green
        ),
        enabled = isEnabled,
        onClick = onClick,
    ) {
        Text(
            text = text,
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall
        )
    }
}