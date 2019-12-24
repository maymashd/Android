package com.example.moviedb.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/moviedb/data/repository/CinemaRepositoryImpl;", "Lcom/example/moviedb/domain/repository/CinemaRepository;", "cinemaDao", "Lcom/example/moviedb/data/room/CinemaDao;", "(Lcom/example/moviedb/data/room/CinemaDao;)V", "getAllCinemas", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/moviedb/data/room/Cinema;", "getCinema", "id", "", "app_debug"})
public final class CinemaRepositoryImpl implements com.example.moviedb.domain.repository.CinemaRepository {
    private final com.example.moviedb.data.room.CinemaDao cinemaDao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.moviedb.data.room.Cinema>> getAllCinemas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.moviedb.data.room.Cinema> getCinema(int id) {
        return null;
    }
    
    public CinemaRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.data.room.CinemaDao cinemaDao) {
        super();
    }
}