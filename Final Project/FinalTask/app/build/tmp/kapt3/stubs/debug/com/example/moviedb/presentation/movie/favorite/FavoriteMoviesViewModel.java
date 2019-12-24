package com.example.moviedb.presentation.movie.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J)\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel;", "Lcom/example/moviedb/base/BaseViewModel;", "movieRepository", "Lcom/example/moviedb/domain/repository/MovieRepository;", "(Lcom/example/moviedb/domain/repository/MovieRepository;)V", "_liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "handleError", "", "e", "", "loadFavMovies", "accountId", "", "sessionId", "", "page", "(Ljava/lang/Integer;Ljava/lang/String;I)V", "State", "app_debug"})
public final class FavoriteMoviesViewModel extends com.example.moviedb.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State> _liveData = null;
    private final com.example.moviedb.domain.repository.MovieRepository movieRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State> getLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void handleError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public final void loadFavMovies(@org.jetbrains.annotations.Nullable()
    java.lang.Integer accountId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionId, int page) {
    }
    
    public FavoriteMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.domain.repository.MovieRepository movieRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "", "()V", "Error", "HideLoading", "IntError", "Result", "ShowLoading", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$ShowLoading;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$HideLoading;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$Result;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$Error;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$IntError;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$ShowLoading;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "()V", "app_debug"})
        public static final class ShowLoading extends com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State {
            public static final com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State.ShowLoading INSTANCE = null;
            
            private ShowLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$HideLoading;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "()V", "app_debug"})
        public static final class HideLoading extends com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State {
            public static final com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State.HideLoading INSTANCE = null;
            
            private HideLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$Result;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "totalPages", "", "list", "", "Lcom/example/moviedb/data/models/MovieData;", "(ILjava/util/List;)V", "getList", "()Ljava/util/List;", "getTotalPages", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class Result extends com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State {
            private final int totalPages = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.example.moviedb.data.models.MovieData> list = null;
            
            public final int getTotalPages() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.example.moviedb.data.models.MovieData> getList() {
                return null;
            }
            
            public Result(int totalPages, @org.jetbrains.annotations.NotNull()
            java.util.List<com.example.moviedb.data.models.MovieData> list) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.example.moviedb.data.models.MovieData> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State.Result copy(int totalPages, @org.jetbrains.annotations.NotNull()
            java.util.List<com.example.moviedb.data.models.MovieData> list) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$Error;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String error = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getError() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.Nullable()
            java.lang.String error) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State.Error copy(@org.jetbrains.annotations.Nullable()
            java.lang.String error) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State$IntError;", "Lcom/example/moviedb/presentation/movie/favorite/FavoriteMoviesViewModel$State;", "error", "", "(I)V", "getError", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class IntError extends com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State {
            private final int error = 0;
            
            public final int getError() {
                return 0;
            }
            
            public IntError(int error) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedb.presentation.movie.favorite.FavoriteMoviesViewModel.State.IntError copy(int error) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}