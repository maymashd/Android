package com.dake.foorballapps.features.teamdetail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.dake.foorballapps.data.source.SportRepository
import com.dake.foorballapps.util.AbsentLiveData
import com.dake.foorballapps.vo.Player
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team


 
class TeamViewModel(context: Application, private val sportRepository: SportRepository) : AndroidViewModel(context) {

    private val teamId = MutableLiveData<String>()

    val team: LiveData<Resource<Team>> = Transformations.switchMap(teamId) { id ->
        if (id.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.getTeam(id)
        }
    }

    val players: LiveData<Resource<List<Player>>> = Transformations.switchMap(teamId) { id ->
        if (id.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.getPlayers(id)
        }
    }

    val isFavorite : LiveData<Boolean> = Transformations.switchMap(teamId) { id ->
        sportRepository.isFavoriteTeam(id)
    }

    fun initData(teamId: String) {
        this.teamId.value = teamId
    }


    fun toggleFavorite(matchId: String) {
        isFavorite.value?.let {
            sportRepository.toggleFavoriteTeam(matchId, it)
        }
    }
}