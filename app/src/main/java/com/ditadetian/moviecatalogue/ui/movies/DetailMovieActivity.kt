package com.ditadetian.moviecatalogue.ui.movies

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.databinding.ActivityDetailMovieBinding
import com.ditadetian.moviecatalogue.ui.home.HomeActivity
import com.ditadetian.moviecatalogue.viewmodel.DetailMovieViewModel

class DetailMovieActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        val extras = intent.extras
        val movieName = extras?.getString(EXTRA_DATA)
        if (extras != null) {
            if (movieName != null) {
                viewModel.setSelectedMovie(movieName)
                populateMovie(viewModel.getDetailMovie())
            }
        }
    }

    private fun populateMovie(movie: MovieEntity){
        binding.tvItemMovieNameReceived.text = movie.movieName
        binding.tvItemYearReceived.text = movie.year.toString()
        binding.tvItemGenreReceived.text = movie.genre
        binding.tvItemTagLineReceived.text = movie.tagLine
        binding.tvItemAgeReceived.text = movie.age
        binding.tvItemScoreReceived.text = movie.score.toString()
        binding.tvItemReleaseReceived.text = movie.release
        binding.tvItemDurationReceived.text = movie.duration
        binding.tvItemOverviewReceived.text = movie.overview
        binding.tvItemPersonReceived.text = movie.person
        Glide.with(this)
            .load(movie.poster)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24))
            .error(R.drawable.ic_baseline_close_24)
            .into(binding.rivItemPosterReceived)
    }

    override fun onClick(v: View?) {
        val backIntent = Intent(this@DetailMovieActivity, HomeActivity::class.java)
        startActivity(backIntent)
    }
}