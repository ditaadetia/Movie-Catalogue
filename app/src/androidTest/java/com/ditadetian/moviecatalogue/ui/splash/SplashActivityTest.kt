package com.ditadetian.moviecatalogue.ui.splash

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.ditadetian.moviecatalogue.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

@RunWith(AndroidJUnit4ClassRunner::class)
class SplashScreenActivityTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(SplashActivity::class.java)
    }

    @Test
    fun loadSplashScreen() {
        onView(withId(R.id.logo)).check(matches(isDisplayed()))
        onView(withId(R.id.tvSplash)).check(matches(isDisplayed()))
    }
}