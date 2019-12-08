package com.dake.foorballapps.features.searchteam

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.dake.foorballapps.data.source.SportRepository
import com.dake.foorballapps.util.AbsentLiveData
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team


 
class SearchTeamViewModel(ctx: Application, sportRepository: SportRepository) : AndroidViewModel(ctx) {

    private val query = MutableLiveData<String>()
    val result: LiveData<Resource<List<Team>>> = Transformations.switchMap(query) { q ->
        if (q.isNullOrEmpty()) {
            AbsentLiveData.create()
        } else {
            sportRepository.searchTeam(q)
        }
    }

    fun submitQuery(query: String?) {
        if (!query.isNullOrEmpty() && (this.query.value != query)) {
            this.query.value = query
        }
    }


}