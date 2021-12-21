package com.ditadetian.moviecatalogue.viewmodel

import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.utils.DataDummy.generateDummyMovies
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest {
    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie: MovieEntity = generateDummyMovies()[0]
    private val movieName = dummyMovie.movieName

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        movieName?.let { viewModel.setSelectedMovie(it) }
    }

    @Test
    fun getDetailMovie() {
        viewModel.setSelectedMovie(movieName.toString())
        val movieEntity = viewModel.getDetailMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.poster, movieEntity.poster)
        assertEquals(dummyMovie.movieName, movieEntity.movieName)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.release, movieEntity.release)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.score, movieEntity.score)
        assertEquals(dummyMovie.tagLine, movieEntity.tagLine)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.person, movieEntity.person)
    }
}