package com.example.moviedb.presentation.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0013H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/moviedb/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/example/moviedb/domain/repository/UserRepository;", "(Lcom/example/moviedb/domain/repository/UserRepository;)V", "_liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/moviedb/presentation/login/LoginViewModel$State;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/CompletableJob;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "login", "", "username", "", "password", "onCleared", "State", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.moviedb.presentation.login.LoginViewModel.State> _liveData = null;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final com.example.moviedb.domain.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviedb.presentation.login.LoginViewModel.State> getLiveData() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/moviedb/presentation/login/LoginViewModel$State;", "", "()V", "ApiResult", "HideLoading", "ShowLoading", "Lcom/example/moviedb/presentation/login/LoginViewModel$State$ShowLoading;", "Lcom/example/moviedb/presentation/login/LoginViewModel$State$HideLoading;", "Lcom/example/moviedb/presentation/login/LoginViewModel$State$ApiResult;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedb/presentation/login/LoginViewModel$State$ShowLoading;", "Lcom/example/moviedb/presentation/login/LoginViewModel$State;", "()V", "app_debug"})
        public static final class ShowLoading extends com.example.moviedb.presentation.login.LoginViewModel.State {
            public static final com.example.moviedb.presentation.login.LoginViewModel.State.ShowLoading INSTANCE = null;
            
            private ShowLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedb/presentation/login/LoginViewModel$State$HideLoading;", "Lcom/example/moviedb/presentation/login/LoginViewModel$State;", "()V", "app_debug"})
        public static final class HideLoading extends com.example.moviedb.presentation.login.LoginViewModel.State {
            public static final com.example.moviedb.presentation.login.LoginViewModel.State.HideLoading INSTANCE = null;
            
            private HideLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/moviedb/presentation/login/LoginViewModel$State$ApiResult;", "Lcom/example/moviedb/presentation/login/LoginViewModel$State;", "success", "", "session_id", "", "account_id", "", "(ZLjava/lang/String;Ljava/lang/Integer;)V", "getAccount_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSession_id", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;)Lcom/example/moviedb/presentation/login/LoginViewModel$State$ApiResult;", "equals", "other", "", "hashCode", "toString", "app_debug"})
        public static final class ApiResult extends com.example.moviedb.presentation.login.LoginViewModel.State {
            private final boolean success = false;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String session_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer account_id = null;
            
            public final boolean getSuccess() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSession_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getAccount_id() {
                return null;
            }
            
            public ApiResult(boolean success, @org.jetbrains.annotations.NotNull()
            java.lang.String session_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer account_id) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedb.presentation.login.LoginViewModel.State.ApiResult copy(boolean success, @org.jetbrains.annotations.NotNull()
            java.lang.String session_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer account_id) {
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