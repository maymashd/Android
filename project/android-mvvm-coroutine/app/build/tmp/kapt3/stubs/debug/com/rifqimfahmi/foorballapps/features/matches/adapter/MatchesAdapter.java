package com.rifqimfahmi.foorballapps.features.matches.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/adapter/MatchesAdapter;", "Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter;", "Lcom/rifqimfahmi/foorballapps/vo/Match;", "ctx", "Landroid/content/Context;", "resource", "Lcom/rifqimfahmi/foorballapps/vo/Resource;", "", "clickListener", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lcom/rifqimfahmi/foorballapps/vo/Resource;Lkotlin/jvm/functions/Function1;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "createDataViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "position", "", "MatchItem", "app_debug"})
public final class MatchesAdapter extends com.rifqimfahmi.foorballapps.features.base.BaseRVAdapter<com.rifqimfahmi.foorballapps.vo.Match> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String errorMessage;
    private final kotlin.jvm.functions.Function1<com.rifqimfahmi.foorballapps.vo.Match, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getErrorMessage() {
        return null;
    }
    
    @java.lang.Override()
    public void setErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
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
    
    public MatchesAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.vo.Resource<? extends java.util.List<com.rifqimfahmi.foorballapps.vo.Match>> resource, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.rifqimfahmi.foorballapps.vo.Match, kotlin.Unit> clickListener) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/adapter/MatchesAdapter$MatchItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/rifqimfahmi/foorballapps/features/matches/adapter/MatchesAdapter;Landroid/view/View;)V", "bind", "", "nMatch", "Lcom/rifqimfahmi/foorballapps/vo/Match;", "clickListener", "Lkotlin/Function1;", "app_debug"})
    public final class MatchItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.rifqimfahmi.foorballapps.vo.Match nMatch, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.rifqimfahmi.foorballapps.vo.Match, kotlin.Unit> clickListener) {
        }
        
        public MatchItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}