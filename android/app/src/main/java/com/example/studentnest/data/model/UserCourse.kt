package com.example.studentnest.data.model

// ============================================================
// UserCourse - Bảng trung gian: User đăng ký môn học
// ============================================================

data class UserCourse(
    val id: Long = 0,
    val userId: Long = 0,
    val courseId: Long = 0,
    val createdAt: String = "",
)
