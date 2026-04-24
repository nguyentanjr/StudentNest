package com.example.studentnest.data.model

// ============================================================
// Course - Môn học trong thời khóa biểu
// ============================================================

enum class CourseType {
    LECTURE,
    LAB,
    SEMINAR
}

data class Course(
    val id: Long = 0,
    val name: String = "",
    val code: String = "",
    val instructor: String = "",
    val room: String = "",
    val building: String = "",
    val days: List<String> = emptyList(),  // ["Mon", "Tue", "Wed", "Thu", "Fri"]
    val startTime: String = "",            // "09:00"
    val endTime: String = "",              // "10:30"
    val semester: String = "",             // "Spring 2026"
    val type: CourseType = CourseType.LECTURE,
    val colorIndex: Int = 0,               // Index into CourseColors list (0-7)
    val createdAt: String = "",
    val updatedAt: String = "",

    // Aggregated from server (not stored in DB)
    val averageRating: Double? = null,
    val reviewCount: Long = 0,
)
