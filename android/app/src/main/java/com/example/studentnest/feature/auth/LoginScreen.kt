package com.example.studentnest.feature.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.components.PrimaryButton
import com.example.studentnest.ui.components.TextLinkButton
import com.example.studentnest.ui.theme.Dimens

@Composable
fun LoginScreen(
    onNavigateToHome: () -> Unit,
    onNavigateToRegister: () -> Unit,
) {
    // TODO: Implement login form
    Column(
        modifier = Modifier.fillMaxSize().padding(Dimens.SpaceXXL),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Welcome back", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(Dimens.SpaceSM))
        Text("Sign in to continue", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(Dimens.Space3XL))
        PrimaryButton("Sign In") { onNavigateToHome() }
        Spacer(Modifier.height(Dimens.SpaceLG))
        TextLinkButton("Don't have an account? Sign up") { onNavigateToRegister() }
    }
}
