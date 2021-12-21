package com.ditadetian.moviecatalogue.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.data.TvShowEntity
import com.ditadetian.moviecatalogue.databinding.ItemRowTvshowBinding

class TvShowsAdapter : RecyclerView.Adapter<TvShowsAdapter.TvShowViewHolder>() {
    private var tvShow = ArrayList<TvShowEntity>()

    fun setTvShow(tvshows: ArrayList<TvShowEntity>) {
        this.tvShow.clear()
        this.tvShow.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val mView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_tvshow, parent, false)
        return TvShowViewHolder(mView)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        holder.bind(tvShow[position])
    }

    override fun getItemCount() = tvShow.size

    inner class TvShowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRowTvshowBinding.bind(itemView)
        fun bind(tvShow: TvShowEntity) {
            binding.tvItemTvShowName.text = tvShow.tvShowName
            binding.tvItemTvShowOverview.text = tvShow.overview
            binding.tvItemTvShowRelease.text = tvShow.release
            binding.tvItemTvShowAge.text = tvShow.age
            Glide.with(itemView.context)
                .load(tvShow.poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24))
                .error(R.drawable.ic_baseline_close_24)
                .into(binding.rivItemTvShowPoster)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                intent.putExtra(DetailTvShowActivity.EXTRA_DATA, tvShow.tvShowName)
                itemView.context.startActivity(intent)
            }
        }
    }
}