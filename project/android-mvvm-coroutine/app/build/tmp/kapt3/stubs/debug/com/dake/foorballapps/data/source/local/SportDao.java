package com.dake.foorballapps.data.source.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\'J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\'J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0012H\'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\n\u001a\u00020\u000bH\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\'J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010\u001b\u001a\u00020\u000bH\'J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u00122\u0006\u0010\r\u001a\u00020\u000bH\'J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\'J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\r\u001a\u00020\u000bH\'J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00122\u0006\u0010 \u001a\u00020\u000bH\'J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010#\u001a\u00020\u000bH\'J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\r\u001a\u00020\u000bH\'J\u0018\u0010%\u001a\u00020\u00032\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\'J\u0018\u0010\'\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013H\'J\u0018\u0010)\u001a\u00020\u00032\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013H\'J\u001c\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010,\u001a\u00020\u000bH\'J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00122\u0006\u0010,\u001a\u00020\u000bH\'\u00a8\u0006."}, d2 = {"Lcom/dake/foorballapps/data/source/local/SportDao;", "", "addToFavoriteMatch", "", "favMatch", "Lcom/dake/foorballapps/vo/FavoriteMatch;", "addToFavoriteTeam", "favoriteTeam", "Lcom/dake/foorballapps/vo/FavoriteTeam;", "deleteFavoriteMatch", "matchId", "", "deleteFavoriteTeam", "teamId", "deleteNextMatches", "idLeague", "deletePrevMatches", "getFavoriteMatches", "Landroidx/lifecycle/LiveData;", "", "Lcom/dake/foorballapps/vo/Match;", "getFavoriteTeams", "Lcom/dake/foorballapps/vo/Team;", "getMatchDetail", "getNextMatches", "getPlayer", "Lcom/dake/foorballapps/vo/Player;", "playerId", "getPlayers", "getPrevMatches", "getTeam", "getTeams", "leagueId", "isFavoriteMatch", "Lcom/dake/foorballapps/data/source/local/subset/FavoriteCount;", "idEvent", "isFavoriteTeam", "saveMatches", "matches", "savePlayers", "players", "saveTeams", "it", "searchMatch", "query", "searchTeam", "app_debug"})
@com.dake.foorballapps.testing.OpenForTesting()
public abstract interface SportDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM matches WHERE idLeague = :idLeague AND matchType = \'type_next_match\' ORDER BY dateEvent DESC LIMIT 15")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Match>> getNextMatches(@org.jetbrains.annotations.Nullable()
    java.lang.String idLeague);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM matches WHERE idLeague = :idLeague AND matchType = \'type_prev_match\' ORDER BY dateEvent DESC LIMIT 15")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Match>> getPrevMatches(@org.jetbrains.annotations.Nullable()
    java.lang.String idLeague);
    
    @androidx.room.Query(value = "DELETE FROM matches WHERE matchType = \'type_next_match\' AND idLeague = :idLeague")
    public abstract void deleteNextMatches(@org.jetbrains.annotations.Nullable()
    java.lang.String idLeague);
    
    @androidx.room.Query(value = "DELETE FROM matches WHERE matchType = \'type_prev_match\' AND idLeague = :idLeague")
    public abstract void deletePrevMatches(@org.jetbrains.annotations.Nullable()
    java.lang.String idLeague);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM teams WHERE idLeague = :leagueId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Team>> getTeams(@org.jetbrains.annotations.NotNull()
    java.lang.String leagueId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM teams WHERE idTeam = :teamId")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Team> getTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM matches WHERE idEvent = :matchId")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Match> getMatchDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM players WHERE idTeam = :teamId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Player>> getPlayers(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) as favCount FROM favorite_matches WHERE idMatch = :idEvent")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.local.subset.FavoriteCount> isFavoriteMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String idEvent);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) as favCount FROM favorite_teams WHERE idTeam = :teamId")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.local.subset.FavoriteCount> isFavoriteTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId);
    
    @androidx.room.Query(value = "DELETE FROM favorite_matches WHERE idMatch = :matchId")
    public abstract void deleteFavoriteMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId);
    
    @androidx.room.Query(value = "DELETE FROM favorite_teams WHERE idTeam = :teamId")
    public abstract void deleteFavoriteTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM matches INNER JOIN favorite_matches ON favorite_matches.idMatch = idEvent ORDER BY dateEvent DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Match>> getFavoriteMatches();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM teams INNER JOIN favorite_teams ON favorite_teams.idTeam = teams.idTeam")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Team>> getFavoriteTeams();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM players WHERE idPlayer = :playerId")
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Player> getPlayer(@org.jetbrains.annotations.NotNull()
    java.lang.String playerId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveMatches(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dake.foorballapps.vo.Match> matches);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveTeams(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dake.foorballapps.vo.Team> it);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void savePlayers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dake.foorballapps.vo.Player> players);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addToFavoriteMatch(@org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.vo.FavoriteMatch favMatch);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addToFavoriteTeam(@org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.vo.FavoriteTeam favoriteTeam);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM matches WHERE strEvent LIKE :query ORDER BY dateEvent DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Match>> searchMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM teams WHERE strTeam LIKE :query")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dake.foorballapps.vo.Team>> searchTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
}