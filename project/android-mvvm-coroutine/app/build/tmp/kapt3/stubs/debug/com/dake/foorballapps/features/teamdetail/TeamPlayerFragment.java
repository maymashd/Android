package com.dake.foorballapps.features.teamdetail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dake.foorballapps.R;
import com.dake.foorballapps.features.playerdetail.PlayerDetailActivity;
import com.dake.foorballapps.features.teamdetail.adapter.PlayerAdapter;
import com.dake.foorballapps.vo.Resource;
import kotlinx.android.synthetic.main.list_items.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/TeamPlayerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "teamId", "", "getTeamId", "()Ljava/lang/String;", "teamId$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/dake/foorballapps/features/teamdetail/TeamViewModel;", "initData", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupList", "Companion", "app_debug"})
public final class TeamPlayerFragment extends androidx.fragment.app.Fragment {
    private com.dake.foorballapps.features.teamdetail.TeamViewModel viewModel;
    private final kotlin.Lazy teamId$delegate = null;
    private static final java.lang.String ARG_KEY_TEAM_ID = "arg_key_team_id";
    public static final com.dake.foorballapps.features.teamdetail.TeamPlayerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.lang.String getTeamId() {
        return null;
    }
    
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
    
    private final void setupList() {
    }
    
    public TeamPlayerFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/TeamPlayerFragment$Companion;", "", "()V", "ARG_KEY_TEAM_ID", "", "newInstance", "Lcom/dake/foorballapps/features/teamdetail/TeamPlayerFragment;", "teamId", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.dake.foorballapps.features.teamdetail.TeamPlayerFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String teamId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}