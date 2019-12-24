package com.example.moviedb.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/moviedb/utils/AppPreferences;", "", "()V", "APP_SETTINGS", "", "getAccountId", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Integer;", "getSessionId", "getSharedPreferences", "Landroid/content/SharedPreferences;", "setAccountId", "", "newValue", "(Landroid/content/Context;Ljava/lang/Integer;)V", "setSessionId", "app_debug"})
public final class AppPreferences {
    private static final java.lang.String APP_SETTINGS = "APP_SETTINGS";
    public static final com.example.moviedb.utils.AppPreferences INSTANCE = null;
    
    private final android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Integer newValue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSessionId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setSessionId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String newValue) {
    }
    
    private AppPreferences() {
        super();
    }
}