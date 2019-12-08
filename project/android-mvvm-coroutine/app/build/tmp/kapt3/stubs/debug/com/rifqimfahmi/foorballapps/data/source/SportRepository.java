package com.rifqimfahmi.foorballapps.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001)B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\r0\fH\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\r0\fH\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\r0\f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\r0\f2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\f2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\r0\f2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\"\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\r0\f2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\"\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\r0\f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\"\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\r0\f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\"\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\r0\f2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\u001cH\u0016J\u0018\u0010(\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;", "", "db", "Lcom/rifqimfahmi/foorballapps/data/source/local/SportDb;", "sportDao", "Lcom/rifqimfahmi/foorballapps/data/source/local/SportDao;", "sportService", "Lcom/rifqimfahmi/foorballapps/data/source/remote/SportService;", "coroutineContext", "Lcom/rifqimfahmi/foorballapps/ContextProviders;", "(Lcom/rifqimfahmi/foorballapps/data/source/local/SportDb;Lcom/rifqimfahmi/foorballapps/data/source/local/SportDao;Lcom/rifqimfahmi/foorballapps/data/source/remote/SportService;Lcom/rifqimfahmi/foorballapps/ContextProviders;)V", "getEventDetail", "Landroidx/lifecycle/LiveData;", "Lcom/rifqimfahmi/foorballapps/vo/Resource;", "Lcom/rifqimfahmi/foorballapps/vo/Match;", "matchId", "", "getFavoriteMatches", "", "getFavoriteTeams", "Lcom/rifqimfahmi/foorballapps/vo/Team;", "getPlayer", "Lcom/rifqimfahmi/foorballapps/vo/Player;", "playerId", "getPlayers", "teamId", "getTeam", "isFavoriteMatch", "", "isFavoriteTeam", "nextMatches", "leagueId", "prevMatches", "searchMatch", "query", "searchTeam", "teams", "toggleFavoriteMatch", "", "isFavorite", "toggleFavoriteTeam", "Companion", "app_debug"})
@com.rifqimfahmi.foorballapps.testing.OpenForTesting()
public class SportRepository {
    private final com.rifqimfahmi.foorballapps.data.source.local.SportDb db = null;
    private final com.rifqimfahmi.foorballapps.data.source.local.SportDao sportDao = null;
    private final com.rifqimfahmi.foorballapps.data.source.remote.SportService sportService = null;
    private final com.rifqimfahmi.foorballapps.ContextProviders coroutineContext = null;
    private static com.rifqimfahmi.foorballapps.data.source.SportRepository INSTANCE;
    public static final com.rifqimfahmi.foorballapps.data.source.SportRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Match>>> nextMatches(@org.jetbrains.annotations.NotNull()
    java.lang.String leagueId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Match>>> prevMatches(@org.jetbrains.annotations.NotNull()
    java.lang.String leagueId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Team>>> teams(@org.jetbrains.annotations.NotNull()
    java.lang.String leagueId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<com.rifqimfahmi.foorballapps.vo.Team>> getTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<com.rifqimfahmi.foorballapps.vo.Match>> getEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Player>>> getPlayers(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isFavoriteMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId) {
        return null;
    }
    
    public void toggleFavoriteMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId, boolean isFavorite) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Match>>> getFavoriteMatches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Team>>> getFavoriteTeams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isFavoriteTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId) {
        return null;
    }
    
    public void toggleFavoriteTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId, boolean isFavorite) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<com.rifqimfahmi.foorballapps.vo.Player>> getPlayer(@org.jetbrains.annotations.NotNull()
    java.lang.String playerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Match>>> searchMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<com.rifqimfahmi.foorballapps.vo.Team>>> searchTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public SportRepository(@org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.data.source.local.SportDb db, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.data.source.local.SportDao sportDao, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.data.source.remote.SportService sportService, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.ContextProviders coroutineContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/rifqimfahmi/foorballapps/data/source/SportRepository$Companion;", "", "()V", "INSTANCE", "Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;", "getInstance", "sportDb", "Lcom/rifqimfahmi/foorballapps/data/source/local/SportDb;", "sportService", "Lcom/rifqimfahmi/foorballapps/data/source/remote/SportService;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.rifqimfahmi.foorballapps.data.source.SportRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.rifqimfahmi.foorballapps.data.source.local.SportDb sportDb, @org.jetbrains.annotations.NotNull()
        com.rifqimfahmi.foorballapps.data.source.remote.SportService sportService) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}