package com.dake.foorballapps.data.source.remote;

import androidx.lifecycle.LiveData;
import com.dake.foorballapps.data.source.remote.json.PlayersResponse;
import com.dake.foorballapps.data.source.remote.json.SchedulesResponse;
import com.dake.foorballapps.data.source.remote.json.SearchSchedulesResponse;
import com.dake.foorballapps.data.source.remote.json.TeamsResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u0007H\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/dake/foorballapps/data/source/remote/SportService;", "", "getLastMatch", "Landroidx/lifecycle/LiveData;", "Lcom/dake/foorballapps/data/source/remote/ApiResponse;", "Lcom/dake/foorballapps/data/source/remote/json/SchedulesResponse;", "leagueId", "", "getMatchDetail", "matchId", "getNextMatch", "getPlayer", "Lcom/dake/foorballapps/data/source/remote/json/PlayersResponse;", "playerId", "getPlayers", "teamId", "getTeam", "Lcom/dake/foorballapps/data/source/remote/json/TeamsResponse;", "getTeams", "searchMatch", "Lcom/dake/foorballapps/data/source/remote/json/SearchSchedulesResponse;", "query", "searchTeam", "app_release"})
public abstract interface SportService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "eventspastleague.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.SchedulesResponse>> getLastMatch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String leagueId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "eventsnextleague.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.SchedulesResponse>> getNextMatch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String leagueId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookup_all_teams.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.TeamsResponse>> getTeams(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String leagueId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookup_all_players.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.PlayersResponse>> getPlayers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String teamId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookupteam.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.TeamsResponse>> getTeam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String teamId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookupevent.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.SchedulesResponse>> getMatchDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String matchId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookupplayer.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.PlayersResponse>> getPlayer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String playerId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "searchevents.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.SearchSchedulesResponse>> searchMatch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "e")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "searchteams.php")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<com.dake.foorballapps.data.source.remote.json.TeamsResponse>> searchTeam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "t")
    java.lang.String query);
}