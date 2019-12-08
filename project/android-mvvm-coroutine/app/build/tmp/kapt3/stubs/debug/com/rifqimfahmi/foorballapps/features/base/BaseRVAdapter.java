package com.rifqimfahmi.foorballapps.features.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004%&\'(B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H$J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001dH\u0016J\u001c\u0010\"\u001a\u00020#2\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006)"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ctx", "Landroid/content/Context;", "resource", "Lcom/rifqimfahmi/foorballapps/vo/Resource;", "", "(Landroid/content/Context;Lcom/rifqimfahmi/foorballapps/vo/Resource;)V", "getCtx", "()Landroid/content/Context;", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "getResource", "()Lcom/rifqimfahmi/foorballapps/vo/Resource;", "setResource", "(Lcom/rifqimfahmi/foorballapps/vo/Resource;)V", "createDataViewHolder", "parent", "Landroid/view/ViewGroup;", "createEmptyViewHolder", "createErrorViewHolder", "createLoadingViewHolder", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "viewType", "submitData", "", "data", "Companion", "EmptyItem", "ErrorItem", "LoadingItem", "app_debug"})
public abstract class BaseRVAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String errorMessage;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context ctx = null;
    @org.jetbrains.annotations.NotNull()
    private com.rifqimfahmi.foorballapps.vo.Resource<? extends java.util.List<? extends T>> resource;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_ERROR = 1;
    public static final int TYPE_LOADING = 2;
    public static final int TYPE_EMPTY = 3;
    public static final com.rifqimfahmi.foorballapps.features.base.BaseRVAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.recyclerview.widget.RecyclerView.ViewHolder createDataViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getErrorMessage() {
        return null;
    }
    
    public void setErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createLoadingViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createErrorViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createEmptyViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    public final void submitData(@org.jetbrains.annotations.Nullable()
    com.rifqimfahmi.foorballapps.vo.Resource<? extends java.util.List<? extends T>> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getCtx() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rifqimfahmi.foorballapps.vo.Resource<java.util.List<T>> getResource() {
        return null;
    }
    
    public final void setResource(@org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.vo.Resource<? extends java.util.List<? extends T>> p0) {
    }
    
    public BaseRVAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.rifqimfahmi.foorballapps.vo.Resource<? extends java.util.List<? extends T>> resource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter$LoadingItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter;Landroid/view/View;)V", "app_debug"})
    public final class LoadingItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter$ErrorItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ErrorItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ErrorItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter$EmptyItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter;Landroid/view/View;)V", "app_debug"})
    public final class EmptyItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EmptyItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/base/BaseRVAdapter$Companion;", "", "()V", "TYPE_DATA", "", "TYPE_EMPTY", "TYPE_ERROR", "TYPE_LOADING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}