package com.example.moviedb.presentation.movie.cinema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/CinemaViewModel;", "Lcom/example/moviedb/base/BaseViewModel;", "cinemaDao", "Lcom/example/moviedb/data/room/CinemaDao;", "(Lcom/example/moviedb/data/room/CinemaDao;)V", "liveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/moviedb/data/room/Cinema;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "repository", "Lcom/example/moviedb/domain/repository/CinemaRepository;", "handleError", "", "e", "", "app_debug"})
public final class CinemaViewModel extends com.example.moviedb.base.BaseViewModel {
    private final com.example.moviedb.domain.repository.CinemaRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.moviedb.data.room.Cinema>> liveData;
    private final com.example.moviedb.data.room.CinemaDao cinemaDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.moviedb.data.room.Cinema>> getLiveData() {
        return null;
    }
    
    public final void setLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.moviedb.data.room.Cinema>> p0) {
    }
    
    @java.lang.Override()
    protected void handleError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public CinemaViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.data.room.CinemaDao cinemaDao) {
        super();
    }
}