package com.example.studentnest.data.dto.request

// ============================================================
// Course Request DTO
// ============================================================

data class CourseRequest(
    val code: String,
    val name: String,
    val instructor: String? = null,
    val room: String? = null,
    val building: String? = null,
    val days: List<String>? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val semester: String? = null,
    val type: String? = null,
    val colorIndex: Int? = null,
)

// ============================================================
// Review Request DTO
// ============================================================

data class ReviewRequest(
    val rating: Int,
    val difficulty: Int? = null,
    val workload: Int? = null,
    val semester: String? = null,
    val comment: String,
)

// ============================================================
// Post Request DTO
// ============================================================

data class PostRequest(
    val title: String,
    val content: String,
    val category: String? = null,
)

// ============================================================
// Comment Request DTO
// ============================================================

data class CommentRequest(
    val content: String,
    val parentId: Long? = null,
)
