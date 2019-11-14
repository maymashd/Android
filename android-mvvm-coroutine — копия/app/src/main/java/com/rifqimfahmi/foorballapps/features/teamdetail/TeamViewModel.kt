package com.rifqimfahmi.foorballapps.features.teamdetail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.rifqimfahmi.foorballapps.data.source.SportRepository
import com.rifqimfahmi.foorballapps.util.AbsentLiveData
import com.rifqimfahmi.foorballapps.vo.Player
import com.rifqimfahmi.foorballapps.vo.Resource
import com.rifqimfahmi.foorballapps.vo.Team

/*
 * Created by Rifqi Mulya Fahmi on 08/12/18.
 */
 
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