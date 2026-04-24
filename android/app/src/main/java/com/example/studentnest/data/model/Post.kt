package com.example.studentnest.data.model

// ============================================================
// Post - Bài viết trong cộng đồng
// ============================================================

data class Post(
    val id: Long = 0,
    val userId: Long = 0,
    val title: String = "",
    val content: String = "",
    val category: String = "",    // "Academic", "Study", "Campus Life", "Housing", "Events", "Other"
    val pinned: Boolean = false,
    val likeCount: Int = 0,
    val status: String = "ACTIVE",  // "ACTIVE", "HIDDEN", "DELETED"
    val createdAt: String = "",
    val updatedAt: String = "",

    // Enriched by server response
    val commentCount: Long = 0,
    val authorName: String = "",
    val authorAvatarUrl: String? = null,
)
