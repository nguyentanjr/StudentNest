package com.example.studentnest.feature.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Primary
import com.example.studentnest.ui.theme.TextOnPrimary
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigateToLogin: () -> Unit) {
    // TODO: Implement splash UI
    LaunchedEffect(Unit) { delay(2000); onNavigateToLogin() }
    Column(
        modifier = Modifier.fillMaxSize().background(Primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("StudentNest", style = MaterialTheme.typography.headlineLarge, color = TextOnPrimary)
        Text("Your university companion", style = MaterialTheme.typography.bodyMedium, color = TextOnPrimary.copy(alpha = 0.7f))
    }
}
