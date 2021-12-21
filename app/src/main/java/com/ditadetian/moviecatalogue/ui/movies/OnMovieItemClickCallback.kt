package com.ditadetian.moviecatalogue.ui.movies

import com.ditadetian.moviecatalogue.data.MovieEntity

interface OnMovieItemClickCallback {
    fun onItemClicked(data: MovieEntity)
    fun onItemShared(data: MovieEntity)
}