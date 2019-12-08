package com.dake.foorballapps.features.matches

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.dake.foorballapps.data.source.SportRepository
import com.dake.foorballapps.testing.OpenForTesting
import com.dake.foorballapps.util.AbsentLiveData
import com.dake.foorballapps.util.getLeaguesId
import com.dake.foorballapps.vo.Match
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team



@OpenForTesting
class MatchesViewModel(context: Application, sportRepository: SportRepository) : AndroidViewModel(context) {

    // LiveData for league categories
    val matchFilterId = MutableLiveData<String>()
    val teamFilterId = MutableLiveData<String>()

    val context: Context = context.applicationContext // application Context to avoid leaks


    val prevMatch: LiveData<Resource<List<Match>>> = Transformations.switchMap(matchFilterId) { leagueId ->
        if (leagueId.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.prevMatches(leagueId)
        }
    }

    val nextMatches: LiveData<Resource<List<Match>>> = Transformations.switchMap(matchFilterId) { leagueId ->
        if (leagueId.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.nextMatches(leagueId)
        }
    }



    val favoriteTeams: LiveData<Resource<List<Team>>> = sportRepository.getFavoriteTeams()

    fun setMatchesFilterBy(position: Int) {
        matchFilterId.value = context.getLeaguesId(position)
    }



    val teams: LiveData<Resource<List<Team>>> = Transformations.switchMap(teamFilterId) { leagueId ->
        if (leagueId.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.teams(leagueId)
        }
    }

    val favoriteMatches: LiveData<Resource<List<Match>>> = sportRepository.getFavoriteMatches()



    fun setTeamFilterBy(position: Int) {
        teamFilterId.value = context.getLeaguesId(position)
    }

    fun refreshTeams() {
        teamFilterId.value?.let {
            teamFilterId.value = it
        }
    }

    fun refreshMatches() {
        matchFilterId.value?.let {
            matchFilterId.value = it
        }
    }


}