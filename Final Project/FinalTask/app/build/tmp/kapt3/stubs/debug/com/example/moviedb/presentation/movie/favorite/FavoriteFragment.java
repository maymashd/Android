package com.example.moviedb.presentation.movie.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020!H\u0002J&\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0014R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006/"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteFragment;", "Lcom/example/moviedb/base/BaseFragment;", "()V", "accountId", "", "Ljava/lang/Integer;", "currentPage", "isLastPage", "", "isLoading", "itemCount", "moviesAdapter", "Lcom/example/moviedb/presentation/movie/favorite/MovieFavoriteAdapter;", "getMoviesAdapter", "()Lcom/example/moviedb/presentation/movie/favorite/MovieFavoriteAdapter;", "moviesAdapter$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "onClickListener", "Lcom/example/moviedb/presentation/movie/favorite/MovieFavoriteAdapter$ItemClickListener;", "rvFavMovies", "Landroidx/recyclerview/widget/RecyclerView;", "sessionId", "", "srlFavMovies", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "viewModel", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel;", "getViewModel", "()Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel;", "viewModel$delegate", "bindViews", "", "view", "Landroid/view/View;", "initId", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setAdapter", "setData", "app_debug"})
public final class FavoriteFragment extends com.example.moviedb.base.BaseFragment {
    private androidx.navigation.NavController navController;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.RecyclerView rvFavMovies;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout srlFavMovies;
    private int currentPage;
    private boolean isLastPage;
    private boolean isLoading;
    private int itemCount;
    private java.lang.Integer accountId;
    private java.lang.String sessionId;
    private final com.example.moviedb.presentation.movie.favorite.MovieFavoriteAdapter.ItemClickListener onClickListener = null;
    private final kotlin.Lazy moviesAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel getViewModel() {
        return null;
    }
    
    private final com.example.moviedb.presentation.movie.favorite.MovieFavoriteAdapter getMoviesAdapter() {
        return null;
    }
    
    private final void setAdapter() {
    }
    
    private final void initId() {
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
    
    @java.lang.Override()
    protected void bindViews(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void setData() {
    }
    
    public FavoriteFragment() {
        super();
    }
}