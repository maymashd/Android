package com.example.moviedb.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J3\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J3\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/moviedb/data/repository/MovieRepositoryImpl;", "Lcom/example/moviedb/domain/repository/MovieRepository;", "movieApi", "Lcom/example/moviedb/data/network/MovieApi;", "(Lcom/example/moviedb/data/network/MovieApi;)V", "getFavoriteMovies", "Lcom/example/moviedb/data/models/MovieResponseData;", "accountId", "", "sessionId", "", "page", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieById", "Lcom/example/moviedb/data/models/MovieData;", "movieId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "getState", "favoriteState", "", "(IILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rateMovie", "favorite", "app_debug"})
public final class MovieRepositoryImpl implements com.example.moviedb.domain.repository.MovieRepository {
    private final com.example.moviedb.data.network.MovieApi movieApi = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularMovies(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedb.data.models.MovieResponseData> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavoriteMovies(int accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedb.data.models.MovieResponseData> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieById(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedb.data.models.MovieData> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object rateMovie(int movieId, int accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, boolean favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getState(int movieId, int accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, boolean favoriteState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p4) {
        return null;
    }
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.data.network.MovieApi movieApi) {
        super();
    }
}