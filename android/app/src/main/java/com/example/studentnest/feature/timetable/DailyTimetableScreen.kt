package com.example.studentnest.feature.timetable

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
fun DailyTimetableScreen(
    onNavigateToCourseDetail: (courseId: String) -> Unit,
    onBack: () -> Unit,
) {
    // TODO: Implement daily timetable UI
    Scaffold(topBar = { AppTopBar("Daily Schedule", showBackButton = true, onBackClick = onBack) }) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(Dimens.SpaceXXL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Daily Timetable", style = MaterialTheme.typography.headlineMedium)
        }
    }
}
