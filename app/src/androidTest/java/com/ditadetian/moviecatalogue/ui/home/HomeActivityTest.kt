package com.ditadetian.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.utils.DataDummy.generateDummyMovies
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.ditadetian.moviecatalogue.utils.DataDummy.generateDummyTvShows
import org.junit.Rule

class HomeActivityTest {

    private val dummyMovie = generateDummyMovies()
    private val dummyTvShow = generateDummyTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.sv_detail_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.sv_detail_movie)).perform(swipeUp())
        onView(withId(R.id.riv_item_poster_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_movie_name_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_movie_name_received))
            .check(matches(withText(dummyMovie[0].movieName)))
        onView(withId(R.id.tv_item_year_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_year_received))
            .check(matches(withText("${dummyMovie[0].year}")))
        onView(withId(R.id.tv_item_release_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_release_received)).check(matches(withText(dummyMovie[0].release)))
        onView(withId(R.id.tv_item_genre_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre_received)).check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.tv_item_duration_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_duration_received))
            .check(matches(withText(dummyMovie[0].duration)))
        onView(withId(R.id.tv_item_score_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_score_received))
            .check(matches(withText("${dummyMovie[0].score}")))
        onView(withId(R.id.tv_percent)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_tagLine_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_tagLine_received)).check(matches(withText(dummyMovie[0].tagLine)))
        onView(withId(R.id.tv_item_overview_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_overview_received))
            .check(matches(withText(dummyMovie[0].overview)))
        onView(withId(R.id.tv_item_person_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_person_received)).check(matches(withText(dummyMovie[0].person)))
    }

    @Test
    fun loadTvShows() {
        onView(withText("TV Shows")).perform(click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("TV Shows")).perform(click())
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.rv_tvShow))
            .perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.sv_detail_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.sv_detail_tvshow)).perform(swipeUp())
        onView(withId(R.id.riv_item_poster_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_tvShow_name_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_tvShow_name_received))
            .check(matches(withText(dummyTvShow[0].tvShowName)))
        onView(withId(R.id.tv_item_year_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_year_received))
            .check(matches(withText(dummyTvShow[0].year.toString())))
        onView(withId(R.id.tv_item_genre_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre_received)).check(matches(withText(dummyTvShow[0].genre)))
        onView(withId(R.id.tv_item_duration_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_duration_received))
            .check(matches(withText(dummyTvShow[0].duration)))
        onView(withId(R.id.tv_item_score_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_score_received))
            .check(matches(withText("${dummyMovie[0].score}")))
        onView(withId(R.id.tv_percent)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_tagLine_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_tagLine_received))
            .check(matches(withText(dummyTvShow[0].tagLine)))
        onView(withId(R.id.tv_item_overview_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_overview_received))
            .check(matches(withText(dummyTvShow[0].overview)))
        onView(withId(R.id.tv_item_person_received)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_person_received)).check(matches(withText(dummyTvShow[0].person)))
    }
}