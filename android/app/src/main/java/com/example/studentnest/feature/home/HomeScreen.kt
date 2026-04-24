package com.example.studentnest.feature.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Dimens

@Composable
fun HomeScreen(
    onNavigateToWeeklyTimetable: () -> Unit,
    onNavigateToCommunity: () -> Unit,
    onNavigateToCourseDetail: (courseId: String) -> Unit,
    onNavigateToPostDetail: (postId: String) -> Unit,
) {
    // TODO: Implement home UI (today's classes, trending posts, recent reviews)
    Column(
        modifier = Modifier.fillMaxSize().padding(Dimens.SpaceXXL),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Home Screen", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(Dimens.SpaceSM))
        Text("Good morning, Alex Chen", style = MaterialTheme.typography.bodyMedium)
    }
}
