package com.example.moviedb.presentation.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f\u001a\u0006\u0010\u0013\u001a\u00020\u000f\u001a\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001b\u001a\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011\u001a&\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0015\u001a\u0006\u0010,\u001a\u00020%\u001a\u000e\u0010-\u001a\u00020.2\u0006\u0010 \u001a\u00020\u001b\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0011\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0011\u0010\n\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0011\u0010\f\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007\u00a8\u0006/"}, d2 = {"appModule", "", "Lorg/koin/core/module/Module;", "getAppModule", "()Ljava/util/List;", "networkModule", "getNetworkModule", "()Lorg/koin/core/module/Module;", "repositoryModule", "getRepositoryModule", "roomModule", "getRoomModule", "viewModelModule", "getViewModelModule", "provideApiKey", "", "provideAuthInterceptor", "Lokhttp3/Interceptor;", "apiKey", "provideBaseUrl", "provideCallAdapterFactory", "Lretrofit2/CallAdapter$Factory;", "provideConverterFactory", "Lretrofit2/Converter$Factory;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMovieApi", "Lcom/example/moviedb/data/network/MovieApi;", "retrofit", "Lretrofit2/Retrofit;", "provideMovieRepository", "Lcom/example/moviedb/domain/repository/MovieRepository;", "movieApi", "provideOkHttp", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "stethoInterceptor", "Lcom/facebook/stetho/okhttp3/StethoInterceptor;", "authInterceptor", "provideRetrofit", "baseUrl", "okHttpClient", "gsonConverterFactory", "callAdapterFactory", "provideStethoInterceptor", "provideUserRepository", "Lcom/example/moviedb/domain/repository/UserRepository;", "app_debug"})
public final class ModulesKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module networkModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module repositoryModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module roomModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module viewModelModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.koin.core.module.Module> appModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRepositoryModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRoomModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getViewModelModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<org.koin.core.module.Module> getAppModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedb.domain.repository.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.data.network.MovieApi movieApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedb.domain.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.data.network.MovieApi movieApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String provideApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.facebook.stetho.okhttp3.StethoInterceptor provideStethoInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Interceptor provideAuthInterceptor(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient provideOkHttp(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull()
    com.facebook.stetho.okhttp3.StethoInterceptor stethoInterceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor authInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.CallAdapter.Factory provideCallAdapterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Converter.Factory provideConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory gsonConverterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.CallAdapter.Factory callAdapterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedb.data.network.MovieApi provideMovieApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}