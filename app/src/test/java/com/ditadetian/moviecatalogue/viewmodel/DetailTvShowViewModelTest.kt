package com.ditadetian.moviecatalogue.viewmodel

import com.ditadetian.moviecatalogue.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailTvShowViewModelTest {
    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val tvShowName = dummyTvShow.tvShowName

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
        tvShowName?.let { viewModel.setSelectedTvShow(it) }
    }

    @Test
    fun getDetailTvShow() {
        viewModel.setSelectedTvShow(tvShowName.toString())
        val tvShowEntity = viewModel.getDetailTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.poster, tvShowEntity.poster)
        assertEquals(dummyTvShow.tvShowName, tvShowEntity.tvShowName)
        assertEquals(dummyTvShow.year, tvShowEntity.year)
        assertEquals(dummyTvShow.release, tvShowEntity.release)
        assertEquals(dummyTvShow.genre, tvShowEntity.genre)
        assertEquals(dummyTvShow.duration, tvShowEntity.duration)
        assertEquals(dummyTvShow.score, tvShowEntity.score)
        assertEquals(dummyTvShow.tagLine, tvShowEntity.tagLine)
        assertEquals(dummyTvShow.overview, tvShowEntity.overview)
        assertEquals(dummyTvShow.person, tvShowEntity.person)
    }
}