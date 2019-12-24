package com.dake.foorballapps.data.source.remote;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.dake.foorballapps.ContextProviders;
import com.dake.foorballapps.vo.Resource;
import kotlinx.coroutines.GlobalScope;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000bH&J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH$J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u001b\u0010\u0013\u001a\u00028\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0004\u00a2\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0017\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/dake/foorballapps/data/source/remote/NetworkBoundResource;", "ResultType", "RequestType", "", "contextProviders", "Lcom/dake/foorballapps/ContextProviders;", "(Lcom/dake/foorballapps/ContextProviders;)V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/dake/foorballapps/vo/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lcom/dake/foorballapps/data/source/remote/ApiResponse;", "fetchFromNetwork", "", "dbSource", "loadFromDb", "onFetchFailed", "processResponse", "response", "Lcom/dake/foorballapps/data/source/remote/ApiSuccessResponse;", "(Lcom/dake/foorballapps/data/source/remote/ApiSuccessResponse;)Ljava/lang/Object;", "saveCallResult", "item", "(Ljava/lang/Object;)V", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_release"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.dake.foorballapps.vo.Resource<ResultType>> result = null;
    private final com.dake.foorballapps.ContextProviders contextProviders = null;
    
    private final void setValue(com.dake.foorballapps.vo.Resource<? extends ResultType> newValue) {
    }
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dake.foorballapps.vo.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    public abstract void saveCallResult(RequestType item);
    
    protected final RequestType processResponse(@org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.data.source.remote.ApiSuccessResponse<RequestType> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.dake.foorballapps.data.source.remote.ApiResponse<RequestType>> createCall();
    
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.LiveData<ResultType> loadFromDb();
    
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.ContextProviders contextProviders) {
        super();
    }
}