package com.rifqimfahmi.foorballapps.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.rifqimfahmi.foorballapps.ContextProviders
import com.rifqimfahmi.foorballapps.data.source.local.SportDao
import com.rifqimfahmi.foorballapps.data.source.local.SportDb
import com.rifqimfahmi.foorballapps.data.source.remote.ApiResponse
import com.rifqimfahmi.foorballapps.data.source.remote.NetworkBoundResource
import com.rifqimfahmi.foorballapps.data.source.remote.SportService
import com.rifqimfahmi.foorballapps.data.source.remote.json.PlayersResponse
import com.rifqimfahmi.foorballapps.data.source.remote.json.SchedulesResponse
import com.rifqimfahmi.foorballapps.data.source.remote.json.SearchSchedulesResponse
import com.rifqimfahmi.foorballapps.data.source.remote.json.TeamsResponse
import com.rifqimfahmi.foorballapps.features.matches.MatchesListFragment
import com.rifqimfahmi.foorballapps.testing.OpenForTesting
import com.rifqimfahmi.foorballapps.vo.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/*
 * Created by Rifqi Mulya Fahmi on 19/11/18.
 */

@OpenForTesting
class SportRepository(
    private val db: SportDb,
    private val sportDao: SportDao,
    private val sportService: SportService,
    private val coroutineContext: ContextProviders
) {

    fun nextMatches(leagueId: String): LiveData<Resource<List<Match>>> {
        return object : NetworkBoundResource<List<Match>, SchedulesResponse>(coroutineContext) {
            override fun saveCallResult(item: SchedulesResponse) {
                val matches = item.events
                matches?.let { matchesData ->
                    matchesData.forEach { match ->
                        match?.let {
                            match.matchType = MatchesListFragment.TYPE_NEXT_MATCH
                        }
                    }

                    db.runInTransaction {
                        sportDao.deleteNextMatches(leagueId)
                        sportDao.saveMatches(matchesData)
                    }
                }
            }

            override fun createCall(): LiveData<ApiResponse<SchedulesResponse>> = sportService.getNextMatch(leagueId)

            override fun shouldFetch(data: List<Match>?) = true

            override fun loadFromDb(): LiveData<List<Match>> = sportDao.getNextMatches(leagueId)

        }.asLiveData()
    }

    fun prevMatches(leagueId: String): LiveData<Resource<List<Match>>> {
        return object : NetworkBoundResource<List<Match>, SchedulesResponse>(coroutineContext) {

            override fun saveCallResult(item: SchedulesResponse) {
                val matches = item.events
                matches?.let { matchesData ->
                    matchesData.forEach { match ->
                        match?.let {
                            match.matchType = MatchesListFragment.TYPE_PREV_MATCH
                        }
                    }

                    db.runInTransaction {
                        sportDao.deletePrevMatches(leagueId)
                        sportDao.saveMatches(matchesData)
                    }
                }
            }

            override fun createCall(): LiveData<ApiResponse<SchedulesResponse>> = sportService.getLastMatch(leagueId)

            override fun shouldFetch(data: List<Match>?): Boolean = true

            override fun loadFromDb(): LiveData<List<Match>> = sportDao.getPrevMatches(leagueId)

        }.asLiveData()
    }

    fun teams(leagueId: String): LiveData<Resource<List<Team>>> {
        return object : NetworkBoundResource<List<Team>, TeamsResponse>(coroutineContext) {

            override fun saveCallResult(item: TeamsResponse) {
                item.teams?.let {
                    db.runInTransaction {
                        sportDao.saveTeams(it)
                    }
                }
            }

            override fun createCall(): LiveData<ApiResponse<TeamsResponse>> = sportService.getTeams(leagueId)

            override fun shouldFetch(data: List<Team>?): Boolean = true

            override fun loadFromDb(): LiveData<List<Team>> = sportDao.getTeams(leagueId)

        }.asLiveData()
    }

    fun getTeam(teamId: String): LiveData<Resource<Team>> {
        return object : NetworkBoundResource<Team, TeamsResponse>(coroutineContext) {
            override fun saveCallResult(item: TeamsResponse) {
                item.teams?.let {
                    db.runInTransaction {
                        sportDao.saveTeams(it)
                    }
                }
            }

            override fun createCall(): LiveData<ApiResponse<TeamsResponse>> = sportService.getTeam(teamId)

            override fun shouldFetch(data: Team?): Boolean = data == null

            override fun loadFromDb(): LiveData<Team> = sportDao.getTeam(teamId)

        }.asLiveData()
    }

    fun getEventDetail(matchId: String): LiveData<Resource<Match>> {
        return object : NetworkBoundResource<Match, SchedulesResponse>(coroutineContext) {
            override fun saveCallResult(item: SchedulesResponse) {
                item.events?.let { matches ->
                    matches.forEach { match ->
                        match?.let {
                            if (match.isNextMatch()) {
                                match.matchType = MatchesListFragment.TYPE_NEXT_MATCH
                            } else {
                                match.matchType = MatchesListFragment.TYPE_PREV_MATCH
                            }
                        }
                    }

                    sportDao.saveMatches(matches)
                }
            }

            override fun createCall(): LiveData<ApiResponse<SchedulesResponse>> = sportService.getMatchDetail(matchId)

            override fun shouldFetch(data: Match?): Boolean = data == null

            override fun loadFromDb(): LiveData<Match> = sportDao.getMatchDetail(matchId)

        }.asLiveData()
    }

    fun getPlayers(teamId: String): LiveData<Resource<List<Player>>> {
        return object : NetworkBoundResource<List<Player>, PlayersResponse>(coroutineContext) {

            override fun saveCallResult(item: PlayersResponse) {
                item.player?.let { players ->
                    sportDao.savePlayers(players)
                }
            }

            override fun createCall(): LiveData<ApiResponse<PlayersResponse>> = sportService.getPlayers(teamId)

            override fun shouldFetch(data: List<Player>?): Boolean = data?.isEmpty() ?: true

            override fun loadFromDb(): LiveData<List<Player>> = sportDao.getPlayers(teamId)

        }.asLiveData()
    }

    fun isFavoriteMatch(matchId: String): LiveData<Boolean> {
        val isFavorite = MediatorLiveData<Boolean>()
        val favCount = sportDao.isFavoriteMatch(matchId)

        isFavorite.addSource(favCount) { data ->
            data?.let {
                isFavorite.value = it.favCount > 0
            }
        }
        return isFavorite
    }

    fun toggleFavoriteMatch(matchId: String, isFavorite: Boolean) {
        GlobalScope.launch(Dispatchers.IO) {
            if (isFavorite) { // Remove from favorite
                sportDao.deleteFavoriteMatch(matchId)
            } else { // Add to favorite
                sportDao.addToFavoriteMatch(FavoriteMatch(matchId))
            }
        }
    }

    fun getFavoriteMatches(): LiveData<Resource<List<Match>>> {
        val data = MediatorLiveData<Resource<List<Match>>>()
        data.value = Resource.loading(null)
        data.addSource(sportDao.getFavoriteMatches()) {
            if (it != null) {
                data.value = Resource.success(it)
            }
        }
        return data
    }

    fun getFavoriteTeams(): LiveData<Resource<List<Team>>> {
        val data = MediatorLiveData<Resource<List<Team>>>()
        data.value = Resource.loading(null)
        data.addSource(sportDao.getFavoriteTeams()) {
            if (it != null) {
                data.value = Resource.success(it)
            }
        }
        return data
    }

    fun isFavoriteTeam(teamId: String): LiveData<Boolean> {
        val isFavorite = MediatorLiveData<Boolean>()
        val favCount = sportDao.isFavoriteTeam(teamId)

        isFavorite.addSource(favCount) { data ->
            data?.let {
                isFavorite.value = it.favCount > 0
            }
        }
        return isFavorite
    }

    fun toggleFavoriteTeam(teamId: String, isFavorite: Boolean) {
        GlobalScope.launch(Dispatchers.IO) {
            if (isFavorite) { // Remove from favorite
                sportDao.deleteFavoriteTeam(teamId)
            } else { // Add to favorite
                sportDao.addToFavoriteTeam(FavoriteTeam(teamId))
            }
        }
    }

    fun getPlayer(playerId: String): LiveData<Resource<Player>> {
        return object : NetworkBoundResource<Player, PlayersResponse>(coroutineContext) {
            override fun saveCallResult(item: PlayersResponse) {
                val player = item.player?.get(0)
                player?.let {
                    sportDao.savePlayers(item.player)
                }
            }

            override fun createCall(): LiveData<ApiResponse<PlayersResponse>> = sportService.getPlayer(playerId)

            override fun shouldFetch(data: Player?): Boolean = true

            override fun loadFromDb(): LiveData<Player> = sportDao.getPlayer(playerId)

        }.asLiveData()
    }

    fun searchMatch(query: String): LiveData<Resource<List<Match>>> {
        return object : NetworkBoundResource<List<Match>, SearchSchedulesResponse>(coroutineContext) {
            override fun saveCallResult(item: SearchSchedulesResponse) {
                item.event?.let { matches ->
                    matches.forEach { match ->
                        match?.matchType = match?.defineMatchType()
                    }

                    sportDao.saveMatches(matches)
                }
            }

            override fun createCall(): LiveData<ApiResponse<SearchSchedulesResponse>> = sportService.searchMatch(query)

            override fun shouldFetch(data: List<Match>?): Boolean = true

            override fun loadFromDb(): LiveData<List<Match>> = sportDao.searchMatch("%$query%")

        }.asLiveData()
    }

    fun searchTeam(query: String): LiveData<Resource<List<Team>>> {
        return object : NetworkBoundResource<List<Team>, TeamsResponse>(coroutineContext) {
            override fun saveCallResult(item: TeamsResponse) {
                item.teams?.let { teams ->
                    sportDao.saveTeams(teams)
                }
            }

            override fun createCall(): LiveData<ApiResponse<TeamsResponse>> = sportService.searchTeam(query)

            override fun shouldFetch(data: List<Team>?): Boolean = true

            override fun loadFromDb(): LiveData<List<Team>> = sportDao.searchTeam("%$query%")

        }.asLiveData()
    }

    companion object {
        private var INSTANCE: SportRepository? = null

        fun getInstance(
            sportDb: SportDb,
            sportService: SportService
        ): SportRepository = INSTANCE
            ?: synchronized(SportRepository::class.java) {
                SportRepository(sportDb, sportDb.sportDao(), sportService, ContextProviders.getInstance())
                    .also { INSTANCE = it }
            }
    }
}