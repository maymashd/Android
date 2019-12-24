package com.example.moviedb.presentation.movie.cinema.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/moviedb/presentation/movie/cinema/details/CinemaDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "liveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviedb/data/room/Cinema;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "repository", "Lcom/example/moviedb/domain/repository/CinemaRepository;", "getCinema", "", "id", "", "app_debug"})
public final class CinemaDetailsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.moviedb.domain.repository.CinemaRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.example.moviedb.data.room.Cinema> liveData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviedb.data.room.Cinema> getLiveData() {
        return null;
    }
    
    public final void setLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.moviedb.data.room.Cinema> p0) {
    }
    
    public final void getCinema(int id) {
    }
    
    public CinemaDetailsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}