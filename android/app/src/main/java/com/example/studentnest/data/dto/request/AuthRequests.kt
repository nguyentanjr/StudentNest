package com.example.studentnest.data.dto.request

// ============================================================
// Auth Request DTOs
// ============================================================

data class LoginRequest(
    val email: String,
    val password: String,
)

data class RegisterRequest(
    val name: String,
    val email: String,
    val password: String,
    val major: String? = null,
    val year: Int? = null,
)
