package com.example.studentnest.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.studentnest.ui.theme.Primary
import com.example.studentnest.ui.theme.TextPrimary

// ============================================================
// Reusable Top App Bar
// Variants: with/without back button, with/without actions
// ============================================================

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    showBackButton: Boolean = false,
    onBackClick: () -> Unit = {},
    actions: @Composable () -> Unit = {},
    useWhiteBackground: Boolean = true,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                color = if (useWhiteBackground) TextPrimary else Color.White,
            )
        },
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = if (useWhiteBackground) TextPrimary else Color.White,
                    )
                }
            }
        },
        actions = { actions() },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = if (useWhiteBackground) Color.White else Primary,
        ),
    )
}
