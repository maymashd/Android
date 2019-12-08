package com.dake.foorballapps.features.playerdetail

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.dake.foorballapps.data.source.SportRepository
import com.dake.foorballapps.util.AbsentLiveData


 
class PlayerViewModel(ctx: Application, sportRepository: SportRepository) : AndroidViewModel(ctx) {

    val context: Context = ctx.applicationContext

    private val playerId = MutableLiveData<String>()

    val player = Transformations.switchMap(playerId) { id ->
        if (id.isNullOrBlank()) {
            AbsentLiveData.create()
        } else {
            sportRepository.getPlayer(id)
        }
    }

    fun initData(playerId : String) {
        this.playerId.value = playerId
    }
}