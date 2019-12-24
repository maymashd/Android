package com.example.moviedb.presentation.movie.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J&\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010#\u001a\u00020\u0018H\u0014J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/example/moviedb/presentation/movie/details/MovieDetailFragment;", "Lcom/example/moviedb/base/BaseFragment;", "()V", "btnFavorite", "Landroid/widget/Button;", "ivBackdrop", "Landroid/widget/ImageView;", "movieId", "", "Ljava/lang/Integer;", "progressBar", "Landroid/widget/ProgressBar;", "tvGenre", "Landroid/widget/TextView;", "tvName", "tvOverview", "tvRating", "viewModel", "Lcom/example/moviedb/presentation/movie/details/MovieDetailViewModel;", "getViewModel", "()Lcom/example/moviedb/presentation/movie/details/MovieDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindViews", "", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setData", "setFavoriteFunc", "status", "", "which", "app_debug"})
public final class MovieDetailFragment extends com.example.moviedb.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.ProgressBar progressBar;
    private android.widget.ImageView ivBackdrop;
    private android.widget.TextView tvName;
    private android.widget.TextView tvRating;
    private android.widget.TextView tvGenre;
    private android.widget.TextView tvOverview;
    private android.widget.Button btnFavorite;
    private java.lang.Integer movieId;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.moviedb.presentation.movie.details.MovieDetailViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setFavoriteFunc(boolean status, int which) {
    }
    
    @java.lang.Override()
    protected void bindViews(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void setData() {
    }
    
    public MovieDetailFragment() {
        super();
    }
}