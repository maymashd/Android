package com.example.moviedb.presentation.movie.cinema.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010!\u001a\u00020\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/map/CinemaMapFragment;", "Lcom/example/moviedb/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/example/moviedb/presentation/movie/cinema/CinemaViewModel;", "getViewModel", "()Lcom/example/moviedb/presentation/movie/cinema/CinemaViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindViews", "", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onMarkerClick", "", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onViewCreated", "setData", "Companion", "app_debug"})
public final class CinemaMapFragment extends com.example.moviedb.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.google.android.gms.maps.GoogleMap map;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.navigation.NavController navController;
    public static final com.example.moviedb.presentation.movie.cinema.map.CinemaMapFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.moviedb.presentation.movie.cinema.CinemaViewModel getViewModel() {
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
    
    @java.lang.Override()
    protected void bindViews(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void setData() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    public CinemaMapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/map/CinemaMapFragment$Companion;", "", "()V", "newInstance", "Lcom/example/moviedb/presentation/movie/cinema/map/CinemaMapFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviedb.presentation.movie.cinema.map.CinemaMapFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}