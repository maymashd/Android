package com.dake.foorballapps.data.source.remote;

import com.dake.foorballapps.util.LiveDataCallAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/dake/foorballapps/data/source/remote/SportServiceFactory;", "", "()V", "Companion", "app_release"})
public final class SportServiceFactory {
    private static volatile com.dake.foorballapps.data.source.remote.SportService INSTANCE;
    private static final java.lang.String BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/";
    public static final com.dake.foorballapps.data.source.remote.SportServiceFactory.Companion Companion = null;
    
    public SportServiceFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dake/foorballapps/data/source/remote/SportServiceFactory$Companion;", "", "()V", "BASE_URL", "", "INSTANCE", "Lcom/dake/foorballapps/data/source/remote/SportService;", "getService", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "app_release"})
    public static final class Companion {
        
        private final okhttp3.OkHttpClient provideOkHttpClient() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dake.foorballapps.data.source.remote.SportService getService() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}