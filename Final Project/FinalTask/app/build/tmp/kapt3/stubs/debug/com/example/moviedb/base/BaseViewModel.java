package com.example.moviedb.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H$J\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/moviedb/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "getUiScope", "()Lkotlinx/coroutines/CoroutineScope;", "handleError", "", "e", "", "onCleared", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getUiScope() {
        return null;
    }
    
    protected abstract void handleError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e);
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}