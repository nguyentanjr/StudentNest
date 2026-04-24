package com.example.studentnest.ui.theme

import androidx.compose.ui.graphics.Color

// ============================================================
// Design System Colors - StudentNest
// ============================================================

// Primary palette
val Primary = Color(0xFF2563EB)
val PrimaryLight = Color(0xFF60A5FA)
val PrimaryDark = Color(0xFF1D4ED8)
val PrimaryContainer = Color(0xFFDBEAFE)
val OnPrimary = Color.White

// Background & Surface
val Background = Color(0xFFFAFAFA)
val Surface = Color(0xFFFFFFFF)
val CardBackground = Color(0xFFFFFFFF)
val Border = Color(0xFFE5E7EB)

// Text
val TextPrimary = Color(0xFF111827)
val TextSecondary = Color(0xFF6B7280)
val TextTertiary = Color(0xFF9CA3AF)
val TextOnPrimary = Color.White

// Semantic
val Error = Color(0xFFEF4444)
val ErrorContainer = Color(0xFFFEE2E2)
val Success = Color(0xFF22C55E)
val SuccessContainer = Color(0xFFDCFCE7)
val Warning = Color(0xFFF59E0B)
val WarningContainer = Color(0xFFFEF3C7)

// Course colors (8 colors for timetable differentiation)
val CourseBlue = Color(0xFF3B82F6)
val CoursePurple = Color(0xFF8B5CF6)
val CoursePink = Color(0xFFEC4899)
val CourseOrange = Color(0xFFF97316)
val CourseGreen = Color(0xFF22C55E)
val CourseCyan = Color(0xFF06B6D4)
val CourseIndigo = Color(0xFF6366F1)
val CourseTeal = Color(0xFF14B8A6)

val CourseColors = listOf(
    CourseBlue, CoursePurple, CoursePink, CourseOrange,
    CourseGreen, CourseCyan, CourseIndigo, CourseTeal
)

// Unread / Highlight
val UnreadBackground = Color(0xFFEFF6FF)
val UnreadDot = Primary