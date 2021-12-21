package com.ditadetian.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.data.TvShowEntity
import com.ditadetian.moviecatalogue.utils.DataDummy

class DetailTvShowViewModel : ViewModel() {

    private lateinit var tvShowName: String

    fun setSelectedTvShow(tvShowName: String) {
        this.tvShowName = tvShowName
    }

    fun getDetailTvShow(): TvShowEntity {
        lateinit var mv: TvShowEntity
        for (tvShow in DataDummy.generateDummyTvShows()) {
            if (tvShow.tvShowName == tvShowName ) {
                mv = tvShow
            }
        }
        return mv
    }
}