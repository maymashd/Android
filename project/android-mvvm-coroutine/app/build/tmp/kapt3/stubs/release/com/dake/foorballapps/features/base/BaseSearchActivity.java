package com.dake.foorballapps.features.base;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dake.foorballapps.R;
import com.dake.foorballapps.vo.Resource;
import kotlinx.android.synthetic.main.activity_search.*;
import kotlinx.android.synthetic.main.list_items.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u000eH$J\b\u0010\u001d\u001a\u00020\u000eH$J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0012\u0010 \u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H$J\u001e\u0010!\u001a\u00020\u000e2\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0018\u00010#H$R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/dake/foorballapps/features/base/BaseSearchActivity;", "T", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "sQuery", "", "getSQuery", "()Ljava/lang/String;", "sQuery$delegate", "Lkotlin/Lazy;", "searchView", "Landroidx/appcompat/widget/SearchView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onQueryTextChange", "newText", "onQueryTextSubmit", "query", "setupAdapter", "setupData", "setupList", "setupToolbar", "submitQuery", "updateData", "data", "Lcom/dake/foorballapps/vo/Resource;", "", "app_release"})
public abstract class BaseSearchActivity<T extends java.lang.Object> extends androidx.appcompat.app.AppCompatActivity implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sQuery$delegate = null;
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSQuery() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupList() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
        return false;
    }
    
    protected abstract void setupAdapter();
    
    protected abstract void setupData();
    
    protected abstract void submitQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String query);
    
    protected abstract void updateData(@org.jetbrains.annotations.Nullable()
    com.dake.foorballapps.vo.Resource<? extends java.util.List<? extends T>> data);
    
    public BaseSearchActivity() {
        super();
    }
}