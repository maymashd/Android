package com.example.moviedb.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/moviedb/utils/AppConstants;", "", "()V", "ACCOUNT_ID", "", "API_KEY", "BACKDROP_BASE_URL", "BASE_URL", "CINEMA_ID", "MOVIE_ID", "POSTER_BASE_URL", "POSTER_CINEMA_BASE_URL", "SESSION_ID", "app_debug"})
public final class AppConstants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POSTER_BASE_URL = "http://image.tmdb.org/t/p/w300";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BACKDROP_BASE_URL = "http://image.tmdb.org/t/p/w780";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "c5c7461bb0625d328136dcde3316c670";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_ID = "movie_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT_ID = "account_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSION_ID = "session_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CINEMA_ID = "cinema_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POSTER_CINEMA_BASE_URL = "https://ticketon.kz/";
    public static final com.example.moviedb.utils.AppConstants INSTANCE = null;
    
    private AppConstants() {
        super();
    }
}