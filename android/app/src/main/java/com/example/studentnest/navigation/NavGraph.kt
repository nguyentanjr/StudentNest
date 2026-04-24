package com.example.studentnest.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.studentnest.feature.auth.LoginScreen
import com.example.studentnest.feature.auth.RegisterScreen
import com.example.studentnest.feature.auth.SplashScreen
import com.example.studentnest.feature.auth.VerificationScreen
import com.example.studentnest.feature.community.CommunityScreen
import com.example.studentnest.feature.community.CreatePostScreen
import com.example.studentnest.feature.community.PostDetailScreen
import com.example.studentnest.feature.course.CourseDetailScreen
import com.example.studentnest.feature.course.CourseReviewsScreen
import com.example.studentnest.feature.course.WriteReviewScreen
import com.example.studentnest.feature.home.HomeScreen
import com.example.studentnest.feature.notification.NotificationsScreen
import com.example.studentnest.feature.profile.ProfileScreen
import com.example.studentnest.feature.profile.SettingsScreen
import com.example.studentnest.feature.timetable.AddCourseScreen
import com.example.studentnest.feature.timetable.DailyTimetableScreen
import com.example.studentnest.feature.timetable.WeeklyTimetableScreen

// ============================================================
// Navigation Graph - StudentNest
// All 17 screen routes wired up
// ============================================================

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route,
        modifier = modifier,
    ) {
        // ---- Auth Flow ----
        composable(Screen.Splash.route) {
            SplashScreen(
                onNavigateToLogin = {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Splash.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Screen.Login.route) {
            LoginScreen(
                onNavigateToHome = {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                },
                onNavigateToRegister = { navController.navigate(Screen.Register.route) },
            )
        }

        composable(Screen.Register.route) {
            RegisterScreen(
                onNavigateToVerification = { email ->
                    navController.navigate(Screen.Verification.createRoute(email))
                },
                onBack = { navController.popBackStack() },
            )
        }

        composable(
            route = Screen.Verification.route,
            arguments = listOf(navArgument("email") { type = NavType.StringType }),
        ) { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            VerificationScreen(
                email = email,
                onNavigateToHome = {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                },
                onBack = { navController.popBackStack() },
            )
        }

        // ---- Main Tabs ----
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToWeeklyTimetable = { navController.navigate(Screen.WeeklyTimetable.route) },
                onNavigateToCommunity = { navController.navigate(Screen.Community.route) },
                onNavigateToCourseDetail = { id -> navController.navigate(Screen.CourseDetail.createRoute(id)) },
                onNavigateToPostDetail = { id -> navController.navigate(Screen.PostDetail.createRoute(id)) },
            )
        }

        composable(Screen.WeeklyTimetable.route) {
            WeeklyTimetableScreen(
                onNavigateToDailyTimetable = { navController.navigate(Screen.DailyTimetable.route) },
                onNavigateToAddCourse = { navController.navigate(Screen.AddCourse.route) },
                onNavigateToCourseDetail = { id -> navController.navigate(Screen.CourseDetail.createRoute(id)) },
            )
        }

        composable(Screen.Community.route) {
            CommunityScreen(
                onNavigateToPostDetail = { id -> navController.navigate(Screen.PostDetail.createRoute(id)) },
                onNavigateToCreatePost = { navController.navigate(Screen.CreatePost.route) },
            )
        }

        composable(Screen.Notifications.route) {
            NotificationsScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen(
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) },
            )
        }

        // ---- Timetable Flow ----
        composable(Screen.DailyTimetable.route) {
            DailyTimetableScreen(
                onNavigateToCourseDetail = { id -> navController.navigate(Screen.CourseDetail.createRoute(id)) },
                onBack = { navController.popBackStack() },
            )
        }

        composable(Screen.AddCourse.route) {
            AddCourseScreen(
                onBack = { navController.popBackStack() },
            )
        }

        // ---- Course Flow ----
        composable(
            route = Screen.CourseDetail.route,
            arguments = listOf(navArgument("courseId") { type = NavType.StringType }),
        ) { backStackEntry ->
            val courseId = backStackEntry.arguments?.getString("courseId") ?: ""
            CourseDetailScreen(
                courseId = courseId,
                onNavigateToCourseReviews = { id -> navController.navigate(Screen.CourseReviews.createRoute(id)) },
                onNavigateToWriteReview = { id -> navController.navigate(Screen.WriteReview.createRoute(id)) },
                onBack = { navController.popBackStack() },
            )
        }

        composable(
            route = Screen.CourseReviews.route,
            arguments = listOf(navArgument("courseId") { type = NavType.StringType }),
        ) { backStackEntry ->
            val courseId = backStackEntry.arguments?.getString("courseId") ?: ""
            CourseReviewsScreen(
                courseId = courseId,
                onNavigateToWriteReview = { id -> navController.navigate(Screen.WriteReview.createRoute(id)) },
                onBack = { navController.popBackStack() },
            )
        }

        composable(
            route = Screen.WriteReview.route,
            arguments = listOf(navArgument("courseId") { type = NavType.StringType }),
        ) { backStackEntry ->
            val courseId = backStackEntry.arguments?.getString("courseId") ?: ""
            WriteReviewScreen(
                courseId = courseId,
                onBack = { navController.popBackStack() },
            )
        }

        // ---- Community Flow ----
        composable(
            route = Screen.PostDetail.route,
            arguments = listOf(navArgument("postId") { type = NavType.StringType }),
        ) { backStackEntry ->
            val postId = backStackEntry.arguments?.getString("postId") ?: ""
            PostDetailScreen(
                postId = postId,
                onBack = { navController.popBackStack() },
            )
        }

        composable(Screen.CreatePost.route) {
            CreatePostScreen(
                onBack = { navController.popBackStack() },
            )
        }

        // ---- Settings ----
        composable(Screen.Settings.route) {
            SettingsScreen(
                onNavigateToLogin = {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(0) { inclusive = true }
                    }
                },
                onBack = { navController.popBackStack() },
            )
        }
    }
}
