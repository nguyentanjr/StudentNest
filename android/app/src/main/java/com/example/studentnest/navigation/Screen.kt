package com.example.studentnest.navigation

// ============================================================
// Navigation Routes - StudentNest
// Sealed class defining all screen routes in the app
// ============================================================

sealed class Screen(val route: String) {

    // ---- Auth Flow ----
    data object Splash : Screen("splash")
    data object Login : Screen("login")
    data object Register : Screen("register")
    data object Verification : Screen("verification/{email}") {
        fun createRoute(email: String) = "verification/$email"
    }

    // ---- Main Tabs (with BottomNav) ----
    data object Home : Screen("home")
    data object WeeklyTimetable : Screen("weekly_timetable")
    data object Community : Screen("community")
    data object Notifications : Screen("notifications")
    data object Profile : Screen("profile")

    // ---- Timetable Flow ----
    data object DailyTimetable : Screen("daily_timetable")
    data object AddCourse : Screen("add_course")

    // ---- Course Flow ----
    data object CourseDetail : Screen("course_detail/{courseId}") {
        fun createRoute(courseId: String) = "course_detail/$courseId"
    }
    data object CourseReviews : Screen("course_reviews/{courseId}") {
        fun createRoute(courseId: String) = "course_reviews/$courseId"
    }
    data object WriteReview : Screen("write_review/{courseId}") {
        fun createRoute(courseId: String) = "write_review/$courseId"
    }

    // ---- Community Flow ----
    data object PostDetail : Screen("post_detail/{postId}") {
        fun createRoute(postId: String) = "post_detail/$postId"
    }
    data object CreatePost : Screen("create_post")

    // ---- Settings ----
    data object Settings : Screen("settings")
}

/** Routes that should show the bottom navigation bar */
val bottomNavRoutes = listOf(
    Screen.Home.route,
    Screen.WeeklyTimetable.route,
    Screen.Community.route,
    Screen.Notifications.route,
    Screen.Profile.route,
)
