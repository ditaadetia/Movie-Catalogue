package com.ditadetian.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.ditadetian.moviecatalogue.data.TvShowEntity
import com.ditadetian.moviecatalogue.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow(): ArrayList<TvShowEntity> = DataDummy.generateDummyTvShows()
}