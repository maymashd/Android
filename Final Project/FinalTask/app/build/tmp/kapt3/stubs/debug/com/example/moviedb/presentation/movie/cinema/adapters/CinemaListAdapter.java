package com.example.moviedb.presentation.movie.cinema.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u001b\u0010\u0017\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u00a2\u0006\u0002\b\u0018R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter$CinemaViewHolder;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter$ItemClickListener;", "(Landroid/content/Context;Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter$ItemClickListener;)V", "cinemas", "", "Lcom/example/moviedb/data/room/Cinema;", "inflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCinemas", "setCinemas$app_debug", "CinemaViewHolder", "ItemClickListener", "app_debug"})
public final class CinemaListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.moviedb.presentation.movie.cinema.adapters.CinemaListAdapter.CinemaViewHolder> {
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<com.example.moviedb.data.room.Cinema> cinemas;
    private final android.content.Context context = null;
    private final com.example.moviedb.presentation.movie.cinema.adapters.CinemaListAdapter.ItemClickListener itemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviedb.presentation.movie.cinema.adapters.CinemaListAdapter.CinemaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.presentation.movie.cinema.adapters.CinemaListAdapter.CinemaViewHolder holder, int position) {
    }
    
    public final void setCinemas$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.data.room.Cinema> cinemas) {
    }
    
    public CinemaListAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.moviedb.presentation.movie.cinema.adapters.CinemaListAdapter.ItemClickListener itemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter$CinemaViewHolder;", "Lcom/example/moviedb/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter;Landroid/view/View;)V", "ivPoster", "Landroid/widget/ImageView;", "getIvPoster", "()Landroid/widget/ImageView;", "tvAddress", "Landroid/widget/TextView;", "getTvAddress", "()Landroid/widget/TextView;", "tvName", "getTvName", "clear", "", "setItemClick", "item", "Lcom/example/moviedb/data/room/Cinema;", "app_debug"})
    public final class CinemaViewHolder extends com.example.moviedb.base.BaseViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivPoster = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvPoster() {
            return null;
        }
        
        public final void setItemClick(@org.jetbrains.annotations.NotNull()
        com.example.moviedb.data.room.Cinema item) {
        }
        
        @java.lang.Override()
        protected void clear() {
        }
        
        public CinemaViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/adapters/CinemaListAdapter$ItemClickListener;", "", "onItemClick", "", "item", "Lcom/example/moviedb/data/room/Cinema;", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.moviedb.data.room.Cinema item);
    }
}