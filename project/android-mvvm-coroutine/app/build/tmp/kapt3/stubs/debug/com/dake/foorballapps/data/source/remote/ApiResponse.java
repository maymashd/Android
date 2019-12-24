package com.dake.foorballapps.data.source.remote;

import retrofit2.Response;
import java.util.regex.Pattern;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/dake/foorballapps/data/source/remote/ApiResponse;", "T", "", "()V", "Companion", "Lcom/dake/foorballapps/data/source/remote/ApiEmptyResponse;", "Lcom/dake/foorballapps/data/source/remote/ApiSuccessResponse;", "Lcom/dake/foorballapps/data/source/remote/ApiErrorResponse;", "app_debug"})
public abstract class ApiResponse<T extends java.lang.Object> {
    public static final com.dake.foorballapps.data.source.remote.ApiResponse.Companion Companion = null;
    
    private ApiResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\b\"\u0004\b\u0001\u0010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\u00a8\u0006\u000b"}, d2 = {"Lcom/dake/foorballapps/data/source/remote/ApiResponse$Companion;", "", "()V", "create", "Lcom/dake/foorballapps/data/source/remote/ApiErrorResponse;", "T", "error", "", "Lcom/dake/foorballapps/data/source/remote/ApiResponse;", "response", "Lretrofit2/Response;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.dake.foorballapps.data.source.remote.ApiErrorResponse<T> create(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.dake.foorballapps.data.source.remote.ApiResponse<T> create(@org.jetbrains.annotations.NotNull()
        retrofit2.Response<T> response) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}