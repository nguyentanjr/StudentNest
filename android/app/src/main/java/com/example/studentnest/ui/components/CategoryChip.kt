package com.example.studentnest.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.studentnest.ui.theme.Background
import com.example.studentnest.ui.theme.Dimens
import com.example.studentnest.ui.theme.Primary
import com.example.studentnest.ui.theme.TextPrimary

// ============================================================
// Category Filter Chip - StudentNest
// Used in: Community (category filter), Course Reviews (semester filter)
// ============================================================

@Composable
fun CategoryChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    FilterChip(
        selected = selected,
        onClick = onClick,
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
            )
        },
        shape = RoundedCornerShape(Dimens.RadiusFull),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Primary,
            selectedLabelColor = androidx.compose.ui.graphics.Color.White,
            containerColor = Background,
            labelColor = TextPrimary,
        ),
        border = null,
        modifier = modifier.padding(end = Dimens.SpaceSM),
    )
}
