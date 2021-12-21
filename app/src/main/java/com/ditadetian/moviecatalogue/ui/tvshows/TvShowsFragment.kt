package com.ditadetian.moviecatalogue.ui.tvshows

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ditadetian.moviecatalogue.databinding.FragmentTvShowsBinding
import com.ditadetian.moviecatalogue.viewmodel.TvShowViewModel

class TvShowsFragment : Fragment() {
    private lateinit var fragmentTvShowsBinding: FragmentTvShowsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentTvShowsBinding = FragmentTvShowsBinding.inflate(inflater, container, false)
        return fragmentTvShowsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val tvshow = viewModel.getTvShow()
            val tvShowAdapter = TvShowsAdapter()
            tvShowAdapter.setTvShow(tvshow)

            with(fragmentTvShowsBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                fragmentTvShowsBinding.rvTvShow.adapter = tvShowAdapter
            }
        }
    }
}