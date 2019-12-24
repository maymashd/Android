package com.example.moviedb.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000fH\'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\'J2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/example/moviedb/data/network/MovieApi;", "", "createRequestToken", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/google/gson/JsonObject;", "createSession", "body", "getAccountId", "Lcom/example/moviedb/data/models/AccountData;", "sessionId", "", "getFavoriteMovies", "Lcom/example/moviedb/data/models/MovieResponseData;", "accountId", "", "page", "getMovie", "Lcom/example/moviedb/data/models/MovieData;", "movieId", "getPopularMovies", "login", "rateMovie", "app_debug"})
public abstract interface MovieApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/token/validate_with_login")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/session/new")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> createSession(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "authentication/token/new")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> createRequestToken();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "account")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.example.moviedb.data.models.AccountData>> getAccountId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "session_id")
    java.lang.String sessionId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.example.moviedb.data.models.MovieResponseData>> getPopularMovies(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "account/{account_id}/favorite/movies")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.example.moviedb.data.models.MovieResponseData>> getFavoriteMovies(@retrofit2.http.Path(value = "account_id")
    int accountId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "session_id")
    java.lang.String sessionId, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.example.moviedb.data.models.MovieData>> getMovie(@retrofit2.http.Path(value = "movie_id")
    int movieId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "account/{account_id}/favorite")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> rateMovie(@retrofit2.http.Path(value = "account_id")
    int accountId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "session_id")
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject body);
}