package com.example.studentnest.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Dimens
import com.example.studentnest.ui.theme.Primary
import com.example.studentnest.ui.theme.TextPrimary

// ============================================================
// Button Variants - StudentNest
// 1. PrimaryButton  - Filled blue, full width
// 2. SecondaryButton - Outlined, full width
// 3. TextLinkButton  - Text only, inline
// ============================================================

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.ButtonHeight),
        shape = RoundedCornerShape(Dimens.RadiusLG),
        colors = ButtonDefaults.buttonColors(
            containerColor = Primary,
        ),
    ) {
        Text(text, style = MaterialTheme.typography.labelLarge)
    }
}

@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.ButtonHeight),
        shape = RoundedCornerShape(Dimens.RadiusLG),
    ) {
        Text(text, style = MaterialTheme.typography.labelLarge, color = Primary)
    }
}

@Composable
fun TextLinkButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
    ) {
        Text(text, style = MaterialTheme.typography.labelLarge, color = Primary)
    }
}
