package com.example.studentnest.data.model

// ============================================================
// Notification - Thông báo cho sinh viên
// ============================================================

enum class NotificationType {
    ACADEMIC,  // Class reminders, schedule changes
    SOCIAL     // Post replies, likes, new followers
}

data class Notification(
    val id: Long = 0,
    val userId: Long = 0,
    val type: NotificationType = NotificationType.ACADEMIC,
    val title: String = "",
    val message: String = "",
    val isRead: Boolean = false,
    val targetType: String? = null,  // "course", "post", etc.
    val targetId: Long? = null,
    val createdAt: String = "",
)
