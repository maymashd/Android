package com.dake.foorballapps.features.matchdetail;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.dake.foorballapps.data.source.SportRepository;
import com.dake.foorballapps.util.AbsentLiveData;
import com.dake.foorballapps.vo.Match;
import com.dake.foorballapps.vo.Resource;
import com.dake.foorballapps.vo.Team;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/dake/foorballapps/features/matchdetail/MatchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "ctx", "Landroid/app/Application;", "sportRepository", "Lcom/dake/foorballapps/data/source/SportRepository;", "(Landroid/app/Application;Lcom/dake/foorballapps/data/source/SportRepository;)V", "awayTeam", "Landroidx/lifecycle/LiveData;", "Lcom/dake/foorballapps/vo/Resource;", "Lcom/dake/foorballapps/vo/Team;", "getAwayTeam", "()Landroidx/lifecycle/LiveData;", "context", "Landroid/content/Context;", "homeTeam", "getHomeTeam", "idAwayTeam", "Landroidx/lifecycle/MutableLiveData;", "", "idEvent", "idHomeTeam", "isFavorite", "", "matchDetail", "Lcom/dake/foorballapps/vo/Match;", "getMatchDetail", "initData", "", "toggleFavorite", "matchId", "app_debug"})
public final class MatchViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.content.Context context = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> idHomeTeam = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> idAwayTeam = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> idEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team>> awayTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team>> homeTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Match>> matchDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite = null;
    private final com.dake.foorballapps.data.source.SportRepository sportRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team>> getAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team>> getHomeTeam() {
        return null;
    }
    
    public final void initData(@org.jetbrains.annotations.NotNull()
    java.lang.String idEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String idHomeTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String idAwayTeam) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Match>> getMatchDetail() {
        return null;
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String matchId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    public MatchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application ctx, @org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.data.source.SportRepository sportRepository) {
        super(null);
    }
}