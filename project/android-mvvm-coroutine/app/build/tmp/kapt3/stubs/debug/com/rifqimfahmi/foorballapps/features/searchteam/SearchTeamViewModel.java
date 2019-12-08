package com.rifqimfahmi.foorballapps.features.searchteam;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/searchteam/SearchTeamViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "ctx", "Landroid/app/Application;", "sportRepository", "Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;", "(Landroid/app/Application;Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;)V", "query", "Landroidx/lifecycle/MutableLiveData;", "", "result", "Landroidx/lifecycle/LiveData;", "Lcom/rifqimfahmi/foorballapps/models/Resource;", "", "Lcom/rifqimfahmi/foorballapps/models/Team;", "getResult", "()Landroidx/lifecycle/LiveData;", "submitQuery", "", "app_debug"})
public final class SearchTeamViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> query = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Team>>> result = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.models.Resource<java.util.List<com.rifqimfahmi.foorballapps.models.Team>>> getResult() {
        return null;
    }
    
    public final void submitQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public SearchTeamViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application ctx, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.data.source.SportRepository sportRepository) {
        super(null);
    }
}