package com.rifqimfahmi.foorballapps.features.playerdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nRM\u0010\u000b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r \u000f*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r\u0018\u00010\f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/playerdetail/PlayerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "ctx", "Landroid/app/Application;", "sportRepository", "Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;", "(Landroid/app/Application;Lcom/rifqimfahmi/foorballapps/data/source/SportRepository;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "player", "Landroidx/lifecycle/LiveData;", "Lcom/rifqimfahmi/foorballapps/vo/Resource;", "Lcom/rifqimfahmi/foorballapps/vo/Player;", "kotlin.jvm.PlatformType", "getPlayer", "()Landroidx/lifecycle/LiveData;", "playerId", "Landroidx/lifecycle/MutableLiveData;", "", "initData", "", "app_debug"})
public final class PlayerViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> playerId = null;
    private final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<com.rifqimfahmi.foorballapps.vo.Player>> player = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<com.rifqimfahmi.foorballapps.vo.Resource<com.rifqimfahmi.foorballapps.vo.Player>> getPlayer() {
        return null;
    }
    
    public final void initData(@org.jetbrains.annotations.NotNull()
    java.lang.String playerId) {
    }
    
    public PlayerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application ctx, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.data.source.SportRepository sportRepository) {
        super(null);
    }
}