package com.dake.foorballapps.features.matches.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dake.foorballapps.features.matches.FavoriteMatchesFragment
import com.dake.foorballapps.features.matches.FavoritesTeamsFragment



class FavoritesPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "MATCHES"
            1 -> "TEAMS"
            else -> super.getPageTitle(position)
        }
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FavoriteMatchesFragment.newInstance()
            1 -> FavoritesTeamsFragment.newInstance()
            else -> error("Cannot create more than two fragment")
        }
    }



    override fun getCount(): Int = 2

}