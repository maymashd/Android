package com.example.moviedb.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ3\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J3\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/moviedb/domain/repository/MovieRepository;", "", "getFavoriteMovies", "Lcom/example/moviedb/data/models/MovieResponseData;", "accountId", "", "sessionId", "", "page", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieById", "Lcom/example/moviedb/data/models/MovieData;", "movieId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "getState", "favoriteState", "", "(IILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rateMovie", "favorite", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularMovies(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedb.data.models.MovieResponseData> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieById(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedb.data.models.MovieData> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavoriteMovies(int accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedb.data.models.MovieResponseData> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object rateMovie(int movieId, int accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, boolean favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p4);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getState(int movieId, int accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, boolean favoriteState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p4);
}