package com.rifqimfahmi.foorballapps.features.matches;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0002J\u001e\u0010\u0012\u001a\u00020\b2\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014H\u0002J\"\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u00182\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/MatchesListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "Lcom/rifqimfahmi/foorballapps/features/matches/MatchesViewModel;", "getType", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupList", "updateData", "data", "Lcom/rifqimfahmi/foorballapps/models/Resource;", "", "Lcom/rifqimfahmi/foorballapps/models/Match;", "updateRefreshIndicator", "T", "Companion", "app_debug"})
public final class MatchesListFragment extends androidx.fragment.app.Fragment {
    private com.rifqimfahmi.foorballapps.features.matches.MatchesViewModel viewModel;
    private static final java.lang.String KEY_MATCH = "key_match";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_NEXT_MATCH = "type_next_match";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_PREV_MATCH = "type_prev_match";
    public static final com.rifqimfahmi.foorballapps.features.matches.MatchesListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupList() {
    }
    
    private final void updateData(com.rifqimfahmi.foorballapps.models.Resource<? extends java.util.List<com.rifqimfahmi.foorballapps.models.Match>> data) {
    }
    
    private final <T extends java.lang.Object>void updateRefreshIndicator(com.rifqimfahmi.foorballapps.models.Resource<? extends java.util.List<? extends T>> data) {
    }
    
    private final java.lang.String getType() {
        return null;
    }
    
    public MatchesListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/rifqimfahmi/foorballapps/features/matches/MatchesListFragment$Companion;", "", "()V", "KEY_MATCH", "", "TYPE_NEXT_MATCH", "TYPE_PREV_MATCH", "newInstance", "Lcom/rifqimfahmi/foorballapps/features/matches/MatchesListFragment;", "type", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.rifqimfahmi.foorballapps.features.matches.MatchesListFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}