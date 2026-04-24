package com.example.studentnest.feature.notification

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Dimens

@Composable
fun NotificationsScreen() {
    // TODO: Implement notifications list with filter tabs
    Column(
        modifier = Modifier.fillMaxSize().padding(Dimens.SpaceXXL),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Notifications", style = MaterialTheme.typography.headlineMedium)
    }
}
