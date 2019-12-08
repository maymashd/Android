package com.dake.foorballapps.features.teamdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/TeamViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "context", "Landroid/app/Application;", "sportRepository", "Lcom/dake/foorballapps/data/source/SportRepository;", "(Landroid/app/Application;Lcom/dake/foorballapps/data/source/SportRepository;)V", "isFavorite", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "players", "Lcom/dake/foorballapps/vo/Resource;", "", "Lcom/dake/foorballapps/vo/Player;", "getPlayers", "team", "Lcom/dake/foorballapps/vo/Team;", "getTeam", "teamId", "Landroidx/lifecycle/MutableLiveData;", "", "initData", "", "toggleFavorite", "matchId", "app_debug"})
public final class TeamViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> teamId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<java.util.List<com.dake.foorballapps.vo.Player>>> players = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team>> team = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite = null;
    private final com.dake.foorballapps.data.source.SportRepository sportRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<java.util.List<com.dake.foorballapps.vo.Player>>> getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team>> getTeam() {
        return null;
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    public final void initData(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId) {
    }
    
    public TeamViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context, @org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.data.source.SportRepository sportRepository) {
        super(null);
    }
}