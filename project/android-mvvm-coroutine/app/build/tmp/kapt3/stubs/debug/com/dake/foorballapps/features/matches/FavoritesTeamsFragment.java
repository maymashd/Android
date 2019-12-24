package com.dake.foorballapps.features.matches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dake.foorballapps.R;
import com.dake.foorballapps.features.matches.adapter.TeamAdapter;
import com.dake.foorballapps.features.teamdetail.TeamDetailActivity;
import com.dake.foorballapps.vo.Resource;
import com.dake.foorballapps.vo.Team;
import kotlinx.android.synthetic.main.list_items.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010\u0011\u001a\u00020\u00062\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/dake/foorballapps/features/matches/FavoritesTeamsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "Lcom/dake/foorballapps/features/matches/MatchesViewModel;", "initData", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupList", "updateData", "res", "Lcom/dake/foorballapps/vo/Resource;", "", "Lcom/dake/foorballapps/vo/Team;", "Companion", "app_debug"})
public final class FavoritesTeamsFragment extends androidx.fragment.app.Fragment {
    private com.dake.foorballapps.features.matches.MatchesViewModel viewModel;
    public static final com.dake.foorballapps.features.matches.FavoritesTeamsFragment.Companion Companion = null;
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
    
    private final void initData() {
    }
    
    private final void updateData(com.dake.foorballapps.vo.Resource<? extends java.util.List<com.dake.foorballapps.vo.Team>> res) {
    }
    
    private final void setupList() {
    }
    
    public FavoritesTeamsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dake/foorballapps/features/matches/FavoritesTeamsFragment$Companion;", "", "()V", "newInstance", "Lcom/dake/foorballapps/features/matches/FavoritesTeamsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.dake.foorballapps.features.matches.FavoritesTeamsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}