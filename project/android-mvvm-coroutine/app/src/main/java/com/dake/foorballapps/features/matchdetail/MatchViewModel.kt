package com.dake.foorballapps.features.matchdetail

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.dake.foorballapps.data.source.SportRepository
import com.dake.foorballapps.util.AbsentLiveData
import com.dake.foorballapps.vo.Match
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team



class MatchViewModel(ctx: Application, private val sportRepository: SportRepository) : AndroidViewModel(ctx) {

    private val context: Context = ctx.applicationContext

    private val idHomeTeam = MutableLiveData<String>()
    private val idAwayTeam = MutableLiveData<String>()
    private val idEvent = MutableLiveData<String>()


    val awayTeam : LiveData<Resource<Team>> = Transformations.switchMap(idAwayTeam) { id ->
        if (id.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.getTeam(id)
        }
    }

    val homeTeam : LiveData<Resource<Team>> = Transformations.switchMap(idHomeTeam) { id ->
        if (id.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.getTeam(id)
        }
    }



    fun initData(idEvent: String, idHomeTeam: String, idAwayTeam: String) {
        this.idEvent.value = idEvent
        this.idHomeTeam.value = idHomeTeam
        this.idAwayTeam.value = idAwayTeam
    }

    val matchDetail : LiveData<Resource<Match>> = Transformations.switchMap(idEvent) { id ->
        if (id.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.getEventDetail(id)
        }
    }

    fun toggleFavorite(matchId: String) {
        isFavorite.value?.let {
            sportRepository.toggleFavoriteMatch(matchId, it)
        }
    }

    val isFavorite : LiveData<Boolean> = Transformations.switchMap(idEvent) { id ->
        sportRepository.isFavoriteMatch(id)
    }




}