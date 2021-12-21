package com.ditadetian.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.utils.DataDummy

class DetailMovieViewModel : ViewModel() {

    private lateinit var movieName: String

    fun setSelectedMovie(movieName: String) {
        this.movieName = movieName
    }

    fun getDetailMovie(): MovieEntity {
        lateinit var mv: MovieEntity
        for (movie in DataDummy.generateDummyMovies()) {
            if (movie.movieName == movieName ) {
                mv = movie
            }
        }
        return mv
    }
}