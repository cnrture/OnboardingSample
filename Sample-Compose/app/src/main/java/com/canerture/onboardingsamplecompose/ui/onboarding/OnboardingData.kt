package com.canerture.onboardingsamplecompose.ui.onboarding

import androidx.annotation.RawRes
import androidx.annotation.StringRes
import com.canerture.onboardingsamplecompose.R

data class OnboardingData(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @RawRes val image: Int
)

fun getOnboardingData() = listOf(
    OnboardingData(
        R.string.onboarding_title_1,
        R.string.onboarding_description_1,
        R.raw.shopping
    ),
    OnboardingData(
        R.string.onboarding_title_2,
        R.string.onboarding_description_2,
        R.raw.shopping
    ),
    OnboardingData(
        R.string.onboarding_title_3,
        R.string.onboarding_description_3,
        R.raw.shopping
    )
)