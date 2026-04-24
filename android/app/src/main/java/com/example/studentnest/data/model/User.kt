package com.example.studentnest.data.model

// ============================================================
// User - Thông tin người dùng / sinh viên
// ============================================================

data class User(
    val id: Long = 0,
    val name: String = "",
    val email: String = "",
    val major: String = "",
    val year: Int = 1,
    val avatarUrl: String? = null,
    val emailVerified: Boolean = false,
    val createdAt: String = "",
    val updatedAt: String = "",
)
