package com.ditadetian.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.utils.DataDummy.generateDummyMovies

class MovieViewModel : ViewModel() {

    fun getMovie(): ArrayList<MovieEntity> = generateDummyMovies()
}