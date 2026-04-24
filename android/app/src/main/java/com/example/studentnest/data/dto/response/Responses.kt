package com.example.studentnest.data.dto.response

import com.example.studentnest.data.model.User

// ============================================================
// Generic API Response wrapper — khớp với server ApiResponse<T>
// ============================================================

data class ApiResponse<T>(
    val success: Boolean,
    val message: String? = null,
    val data: T? = null,
)

// ============================================================
// Auth Response — JWT token + user info
// ============================================================

data class AuthResponse(
    val token: String,
    val tokenType: String = "Bearer",
    val user: User,
)
