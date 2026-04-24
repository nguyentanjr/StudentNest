package com.example.studentnest.feature.course

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
fun WriteReviewScreen(
    courseId: String,
    onBack: () -> Unit,
) {
    // TODO: Implement write review form
    Scaffold(topBar = { AppTopBar("Write Review", showBackButton = true, onBackClick = onBack) }) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(Dimens.SpaceXXL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Write Review", style = MaterialTheme.typography.headlineMedium)
            Text("Course: $courseId", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
