package com.example.studentnest.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.studentnest.ui.theme.Border
import com.example.studentnest.ui.theme.Dimens
import com.example.studentnest.ui.theme.Primary
import com.example.studentnest.ui.theme.TextSecondary
import com.example.studentnest.ui.theme.TextTertiary

// ============================================================
// Reusable TextField - StudentNest
// With optional leading icon, label, helper text
// ============================================================

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    leadingIcon: ImageVector? = null,
    helperText: String? = null,
    isPassword: Boolean = false,
    isError: Boolean = false,
    errorMessage: String? = null,
    singleLine: Boolean = true,
    maxLines: Int = 1,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        placeholder = {
            Text(placeholder, color = TextTertiary)
        },
        leadingIcon = leadingIcon?.let {
            { Icon(it, contentDescription = label, tint = TextSecondary) }
        },
        supportingText = when {
            isError && errorMessage != null -> {
                { Text(errorMessage, color = MaterialTheme.colorScheme.error) }
            }
            helperText != null -> {
                { Text(helperText, color = TextSecondary) }
            }
            else -> null
        },
        isError = isError,
        singleLine = singleLine,
        maxLines = maxLines,
        shape = RoundedCornerShape(Dimens.RadiusLG),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Primary,
            unfocusedBorderColor = Border,
            cursorColor = Primary,
            focusedLabelColor = Primary,
        ),
        modifier = modifier.fillMaxWidth(),
    )
}
