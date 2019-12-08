package com.dake.foorballapps.features.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dake.foorballapps.R
import com.dake.foorballapps.features.matches.adapter.FavoritesPagerAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*



class FavoritesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    companion object {
        fun newInstance() = FavoritesFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        vpFavorites.adapter = FavoritesPagerAdapter(childFragmentManager)
        tabFavorites.setupWithViewPager(vpFavorites)
    }


}