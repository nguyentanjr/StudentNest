package com.example.studentnest.data.model

// ============================================================
// Review - Đánh giá môn học từ sinh viên
// ============================================================

data class Review(
    val id: Long = 0,
    val userId: Long = 0,
    val courseId: Long = 0,
    val rating: Int = 0,          // 1-5 stars
    val difficulty: Int = 3,      // 1-5 (Easy → Very Hard)
    val workload: Int = 3,        // 1-5 (Light → Heavy)
    val semester: String = "",    // "Spring 2026"
    val comment: String = "",
    val helpfulCount: Int = 0,
    val createdAt: String = "",
    val updatedAt: String = "",

    // Flattened from User (populated by server response)
    val authorName: String = "",
    val authorAvatarUrl: String? = null,
)
