package com.example.moviedb.presentation.movie.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0006\u0010\u001e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/moviedb/presentation/movie/list/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/moviedb/base/BaseViewHolder;", "itemClickListener", "Lcom/example/moviedb/presentation/movie/list/MovieAdapter$ItemClickListener;", "(Lcom/example/moviedb/presentation/movie/list/MovieAdapter$ItemClickListener;)V", "VIEW_TYPE_LOADING", "", "VIEW_TYPE_NORMAL", "isLoaderVisible", "", "movieList", "Ljava/util/ArrayList;", "Lcom/example/moviedb/data/models/MovieData;", "addItems", "", "list", "", "addLoading", "clearAll", "getItem", "position", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeLoading", "ItemClickListener", "MovieViewHolder", "ProgressViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.moviedb.base.BaseViewHolder> {
    private final int VIEW_TYPE_LOADING = 0;
    private final int VIEW_TYPE_NORMAL = 1;
    private boolean isLoaderVisible;
    private final java.util.ArrayList<com.example.moviedb.data.models.MovieData> movieList = null;
    private final com.example.moviedb.presentation.movie.list.MovieAdapter.ItemClickListener itemClickListener = null;
    
    public final void clearAll() {
    }
    
    public final void removeLoading() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.moviedb.data.models.MovieData getItem(int position) {
        return null;
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.data.models.MovieData> list) {
    }
    
    public final void addLoading() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviedb.base.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.base.BaseViewHolder holder, int position) {
    }
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.presentation.movie.list.MovieAdapter.ItemClickListener itemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0014J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviedb/presentation/movie/list/MovieAdapter$MovieViewHolder;", "Lcom/example/moviedb/base/BaseViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/moviedb/presentation/movie/list/MovieAdapter;Landroid/view/View;)V", "ivPoster", "Landroid/widget/ImageView;", "tvDate", "Landroid/widget/TextView;", "tvName", "bind", "", "movie", "Lcom/example/moviedb/data/models/MovieData;", "clear", "setItemClick", "item", "app_debug"})
    public final class MovieViewHolder extends com.example.moviedb.base.BaseViewHolder {
        private final android.widget.TextView tvName = null;
        private final android.widget.TextView tvDate = null;
        private final android.widget.ImageView ivPoster = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.moviedb.data.models.MovieData movie) {
        }
        
        public final void setItemClick(@org.jetbrains.annotations.NotNull()
        com.example.moviedb.data.models.MovieData item) {
        }
        
        @java.lang.Override()
        protected void clear() {
        }
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviedb/presentation/movie/list/MovieAdapter$ProgressViewHolder;", "Lcom/example/moviedb/base/BaseViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/moviedb/presentation/movie/list/MovieAdapter;Landroid/view/View;)V", "clear", "", "app_debug"})
    public final class ProgressViewHolder extends com.example.moviedb.base.BaseViewHolder {
        
        @java.lang.Override()
        protected void clear() {
        }
        
        public ProgressViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/moviedb/presentation/movie/list/MovieAdapter$ItemClickListener;", "", "onItemClick", "", "item", "Lcom/example/moviedb/data/models/MovieData;", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.moviedb.data.models.MovieData item);
    }
}