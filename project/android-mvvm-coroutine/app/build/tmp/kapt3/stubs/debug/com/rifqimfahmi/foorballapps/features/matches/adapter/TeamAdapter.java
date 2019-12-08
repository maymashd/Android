package com.rifqimfahmi.foorballapps.features.matches.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/adapter/TeamAdapter;", "Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter;", "Lcom/rifqimfahmi/foorballapps/models/Team;", "ctx", "Landroid/content/Context;", "resource", "Lcom/rifqimfahmi/foorballapps/models/Resource;", "", "clickListener", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lcom/rifqimfahmi/foorballapps/models/Resource;Lkotlin/jvm/functions/Function1;)V", "createDataViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "position", "", "TeamItem", "app_debug"})
public final class TeamAdapter extends com.rifqimfahmi.foorballapps.features.base.BaseRVAdapter<com.rifqimfahmi.foorballapps.models.Team> {
    private final kotlin.jvm.functions.Function1<com.rifqimfahmi.foorballapps.models.Team, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.RecyclerView.ViewHolder createDataViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public TeamAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.models.Resource<? extends java.util.List<com.rifqimfahmi.foorballapps.models.Team>> resource, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.rifqimfahmi.foorballapps.models.Team, kotlin.Unit> clickListener) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/adapter/TeamAdapter$TeamItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/rifqimfahmi/foorballapps/features/matches/adapter/TeamAdapter;Landroid/view/View;)V", "bind", "", "nTeam", "Lcom/rifqimfahmi/foorballapps/models/Team;", "clickListener", "Lkotlin/Function1;", "app_debug"})
    public final class TeamItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.rifqimfahmi.foorballapps.models.Team nTeam, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.rifqimfahmi.foorballapps.models.Team, kotlin.Unit> clickListener) {
        }
        
        public TeamItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}