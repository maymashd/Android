package com.dake.foorballapps

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dake.foorballapps.data.source.SportRepository
import com.dake.foorballapps.data.source.local.SportDb
import com.dake.foorballapps.data.source.remote.SportServiceFactory
import com.dake.foorballapps.features.matchdetail.MatchViewModel
import com.dake.foorballapps.features.matches.MatchesViewModel
import com.dake.foorballapps.features.playerdetail.PlayerViewModel
import com.dake.foorballapps.features.searchmatch.SearchMatchViewModel
import com.dake.foorballapps.features.searchteam.SearchTeamViewModel
import com.dake.foorballapps.features.teamdetail.TeamViewModel



class ViewModelFactory private constructor(
    private val application: Application,
    private val sportRepository: SportRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass) {
            when {
                isAssignableFrom(MatchesViewModel::class.java) ->
                    MatchesViewModel(application, sportRepository)
                isAssignableFrom(MatchViewModel::class.java) ->
                    MatchViewModel(application, sportRepository)
                isAssignableFrom(TeamViewModel::class.java) ->
                    TeamViewModel(application, sportRepository)
                isAssignableFrom(PlayerViewModel::class.java) ->
                    PlayerViewModel(application, sportRepository)
                isAssignableFrom(SearchMatchViewModel::class.java) ->
                    SearchMatchViewModel(application, sportRepository)
                isAssignableFrom(SearchTeamViewModel::class.java) ->
                    SearchTeamViewModel(application, sportRepository)
                else ->
                    error("Invalid View Model class")
            }
        } as T

    companion object {
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        fun getInstance(application: Application): ViewModelFactory {
            return INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                ViewModelFactory(
                    application,
                    SportRepository.getInstance(
                        SportDb.getDatabase(application.applicationContext),
                        SportServiceFactory.getService()
                    )
                ).also { INSTANCE = it }
            }
        }
    }
}