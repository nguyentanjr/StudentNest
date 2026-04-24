package com.example.studentnest.feature.community

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Dimens

@Composable
fun CommunityScreen(
    onNavigateToPostDetail: (postId: String) -> Unit,
    onNavigateToCreatePost: () -> Unit,
) {
    // TODO: Implement community feed
    Column(
        modifier = Modifier.fillMaxSize().padding(Dimens.SpaceXXL),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Community", style = MaterialTheme.typography.headlineMedium)
    }
}
