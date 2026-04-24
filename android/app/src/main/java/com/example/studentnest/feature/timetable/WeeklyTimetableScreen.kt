package com.example.studentnest.feature.timetable

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Dimens

@Composable
fun WeeklyTimetableScreen(
    onNavigateToDailyTimetable: () -> Unit,
    onNavigateToAddCourse: () -> Unit,
    onNavigateToCourseDetail: (courseId: String) -> Unit,
) {
    // TODO: Implement weekly timetable UI
    Column(
        modifier = Modifier.fillMaxSize().padding(Dimens.SpaceXXL),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Weekly Timetable", style = MaterialTheme.typography.headlineMedium)
    }
}
