package com.canerture.onboardingsamplecompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.canerture.onboardingsamplecompose.ui.home.HomeScreen
import com.canerture.onboardingsamplecompose.ui.navigation.Screen.homeRoute
import com.canerture.onboardingsamplecompose.ui.navigation.Screen.onboardingRoute
import com.canerture.onboardingsamplecompose.ui.onboarding.OnboardingScreen

object Screen {
    const val onboardingRoute = "OnboardingScreen"
    const val homeRoute = "HomeScreen"
}

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = onboardingRoute
    ) {

        composable(route = onboardingRoute) {
            OnboardingScreen(
                onFinishClicked = {
                    navController.navigate(homeRoute) {
                        popUpTo(onboardingRoute) {
                            inclusive = true
                        }
                    }
                },
                onSkipClicked = {
                    navController.navigate(homeRoute) {
                        popUpTo(onboardingRoute) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(route = homeRoute) {
            HomeScreen()
        }
    }
}
