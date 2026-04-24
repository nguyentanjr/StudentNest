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
import com.example.studentnest.ui.theme.Dimens

@Composable
fun RegisterScreen(
    onNavigateToVerification: (email: String) -> Unit,
    onBack: () -> Unit,
) {
    // TODO: Implement register form
    Scaffold(topBar = { AppTopBar("Create Account", showBackButton = true, onBackClick = onBack) }) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(Dimens.SpaceXXL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Register Screen", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(Dimens.Space3XL))
            PrimaryButton("Create Account") { onNavigateToVerification("student@university.edu") }
        }
    }
}
