package com.ditadetian.moviecatalogue.ui.tvshows

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.data.TvShowEntity
import com.ditadetian.moviecatalogue.databinding.ActivityDetailMovieBinding
import com.ditadetian.moviecatalogue.databinding.ActivityDetailTvshowBinding
import com.ditadetian.moviecatalogue.viewmodel.DetailTvShowViewModel

class DetailTvShowActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityDetailTvshowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvshowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory())[DetailTvShowViewModel::class.java]

        val extras = intent.extras
        val tvShowName = extras?.getString(EXTRA_DATA)
        if (extras != null) {
            if (tvShowName != null) {
                viewModel.setSelectedTvShow(tvShowName)
                populateTvShow(viewModel.getDetailTvShow())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun populateTvShow(tvshow: TvShowEntity){
        binding.tvItemTvShowNameReceived.text = tvshow.tvShowName
        binding.tvItemYearReceived.text = tvshow.year.toString()
        binding.tvItemGenreReceived.text = tvshow.genre
        binding.tvItemTagLineReceived.text = tvshow.tagLine
        binding.tvItemAgeReceived.text = tvshow.age
        binding.tvItemScoreReceived.text = tvshow.score.toString()
        binding.tvItemReleaseReceived.text = tvshow.release
        binding.tvItemDurationReceived.text = tvshow.duration
        binding.tvItemOverviewReceived.text = tvshow.overview
        binding.tvItemPersonReceived.text = tvshow.person
        Glide.with(this)
            .load(tvshow.poster)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24))
            .error(R.drawable.ic_baseline_close_24)
            .into(binding.rivItemPosterReceived)
    }
}