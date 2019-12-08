package com.rifqimfahmi.foorballapps.features.matches;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\"2\u0006\u0010%\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R#\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010\u00a8\u0006("}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/MatchesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "context", "Landroid/app/Application;", "sportRepository", "Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;", "(Landroid/app/Application;Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "favoriteMatches", "Landroidx/lifecycle/LiveData;", "Lcom/rifqimfahmi/foorballapps/models/Resource;", "", "Lcom/rifqimfahmi/foorballapps/models/Match;", "getFavoriteMatches", "()Landroidx/lifecycle/LiveData;", "favoriteTeams", "Lcom/rifqimfahmi/foorballapps/models/Team;", "getFavoriteTeams", "matchFilterId", "Landroidx/lifecycle/MutableLiveData;", "", "getMatchFilterId", "()Landroidx/lifecycle/MutableLiveData;", "nextMatches", "getNextMatches", "prevMatch", "getPrevMatch", "teamFilterId", "getTeamFilterId", "teams", "getTeams", "refreshMatches", "", "refreshTeams", "setMatchesFilterBy", "position", "", "setTeamFilterBy", "app_debug"})
public final class MatchesViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> matchFilterId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> teamFilterId = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Match>>> nextMatches = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Match>>> prevMatch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Team>>> teams = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Match>>> favoriteMatches = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Team>>> favoriteTeams = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMatchFilterId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTeamFilterId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Match>>> getNextMatches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Match>>> getPrevMatch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Team>>> getTeams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Match>>> getFavoriteMatches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Team>>> getFavoriteTeams() {
        return null;
    }
    
    public final void setMatchesFilterBy(int position) {
    }
    
    public final void setTeamFilterBy(int position) {
    }
    
    public final void refreshMatches() {
    }
    
    public final void refreshTeams() {
    }
    
    public MatchesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.data.source.SportRepository sportRepository) {
        super(null);
    }
}