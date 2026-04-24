package com.example.studentnest.feature.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.components.AppTopBar
import com.example.studentnest.ui.components.PrimaryButton
import com.example.studentnest.ui.components.SecondaryButton
import com.example.studentnest.ui.theme.Dimens

@Composable
fun VerificationScreen(
    email: String,
    onNavigateToHome: () -> Unit,
    onBack: () -> Unit,
) {
    // TODO: Implement verification UI
    Scaffold(topBar = { AppTopBar("Verify Email", showBackButton = true, onBackClick = onBack) }) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(Dimens.SpaceXXL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Verify your email", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(Dimens.SpaceSM))
            Text(email, style = MaterialTheme.typography.bodyMedium)
            Spacer(Modifier.height(Dimens.Space3XL))
            PrimaryButton("I've verified my email") { onNavigateToHome() }
            Spacer(Modifier.height(Dimens.SpaceLG))
            SecondaryButton("Resend verification email") { /* TODO */ }
        }
    }
}
