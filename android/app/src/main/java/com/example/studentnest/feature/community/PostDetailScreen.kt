package com.example.studentnest.feature.community

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.components.AppTopBar
import com.example.studentnest.ui.theme.Dimens

@Composable
fun PostDetailScreen(
    postId: String,
    onBack: () -> Unit,
) {
    // TODO: Implement post detail + comments
    Scaffold(topBar = { AppTopBar("Post Detail", showBackButton = true, onBackClick = onBack) }) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(Dimens.SpaceXXL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Post Detail", style = MaterialTheme.typography.headlineMedium)
            Text("Post: $postId", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
