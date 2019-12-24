package com.dake.foorballapps.features.searchmatch;

import androidx.lifecycle.Observer;
import com.dake.foorballapps.features.base.BaseSearchActivity;
import com.dake.foorballapps.features.matchdetail.MatchDetailActivity;
import com.dake.foorballapps.features.matches.adapter.MatchesAdapter;
import com.dake.foorballapps.vo.Match;
import com.dake.foorballapps.vo.Resource;
import kotlinx.android.synthetic.main.list_items.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u001e\u0010\r\u001a\u00020\b2\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0018\u00010\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/dake/foorballapps/features/searchmatch/SearchMatchActivity;", "Lcom/dake/foorballapps/features/base/BaseSearchActivity;", "Lcom/dake/foorballapps/vo/Match;", "()V", "viewModel", "Lcom/dake/foorballapps/features/searchmatch/SearchMatchViewModel;", "obtainViewModel", "setupAdapter", "", "setupData", "submitQuery", "query", "", "updateData", "data", "Lcom/dake/foorballapps/vo/Resource;", "", "app_debug"})
public final class SearchMatchActivity extends com.dake.foorballapps.features.base.BaseSearchActivity<com.dake.foorballapps.vo.Match> {
    private com.dake.foorballapps.features.searchmatch.SearchMatchViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    private final com.dake.foorballapps.features.searchmatch.SearchMatchViewModel obtainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void submitQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    protected void updateData(@org.jetbrains.annotations.Nullable()
    com.dake.foorballapps.vo.Resource<? extends java.util.List<com.dake.foorballapps.vo.Match>> data) {
    }
    
    @java.lang.Override()
    protected void setupData() {
    }
    
    @java.lang.Override()
    protected void setupAdapter() {
    }
    
    public SearchMatchActivity() {
        super();
    }
}