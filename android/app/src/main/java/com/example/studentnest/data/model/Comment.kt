package com.example.studentnest.data.model

// ============================================================
// Comment - Bình luận trên bài viết
// ============================================================

data class Comment(
    val id: Long = 0,
    val postId: Long = 0,
    val userId: Long = 0,
    val parentId: Long? = null,    // null = top-level comment, non-null = reply
    val content: String = "",
    val likeCount: Int = 0,
    val status: String = "ACTIVE",  // "ACTIVE", "HIDDEN", "DELETED"
    val createdAt: String = "",
    val updatedAt: String = "",

    // Enriched by server response
    val authorName: String = "",
    val authorAvatarUrl: String? = null,
)
