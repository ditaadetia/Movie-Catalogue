package com.ditadetian.moviecatalogue.ui.movies

import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.databinding.ItemRowMovieBinding

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {
    private var movie = ArrayList<MovieEntity>()

    fun setMovie(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.movie.clear()
        this.movie.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val mView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_movie, parent, false)
        return MovieViewHolder(mView)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movie[position])
    }

    override fun getItemCount() = movie.size

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRowMovieBinding.bind(itemView)
        fun bind(movie: MovieEntity) {
            binding.tvItemMovieName.text = movie.movieName
            binding.tvItemOverview.text = movie.overview
            binding.tvItemRelease.text = movie.release
            binding.tvItemAge.text = movie.age
            Glide.with(itemView.context)
                .load(movie.poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24))
                .error(R.drawable.ic_baseline_close_24)
                .into(binding.rivItemPoster)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                intent.putExtra(DetailMovieActivity.EXTRA_DATA, movie.movieName)
                itemView.context.startActivity(intent)
            }
        }
    }
}