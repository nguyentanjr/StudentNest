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
fun CourseDetailScreen(
    courseId: String,
    onNavigateToCourseReviews: (courseId: String) -> Unit,
    onNavigateToWriteReview: (courseId: String) -> Unit,
    onBack: () -> Unit,
) {
    // TODO: Implement course detail UI
    Scaffold(topBar = { AppTopBar("Course Detail", showBackButton = true, onBackClick = onBack) }) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(Dimens.SpaceXXL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Course Detail", style = MaterialTheme.typography.headlineMedium)
            Text("ID: $courseId", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
