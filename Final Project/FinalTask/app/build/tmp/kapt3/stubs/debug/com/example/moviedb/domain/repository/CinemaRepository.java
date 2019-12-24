package com.example.moviedb.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/moviedb/domain/repository/CinemaRepository;", "", "getAllCinemas", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/moviedb/data/room/Cinema;", "getCinema", "id", "", "app_debug"})
public abstract interface CinemaRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.moviedb.data.room.Cinema>> getAllCinemas();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.moviedb.data.room.Cinema> getCinema(int id);
}