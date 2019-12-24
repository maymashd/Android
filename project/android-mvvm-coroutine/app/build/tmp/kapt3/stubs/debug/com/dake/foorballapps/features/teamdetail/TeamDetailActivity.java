package com.dake.foorballapps.features.teamdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.google.android.material.snackbar.Snackbar;
import com.dake.foorballapps.R;
import com.dake.foorballapps.features.teamdetail.adapter.TeamDetailPagerAdapter;
import com.dake.foorballapps.vo.Resource;
import com.dake.foorballapps.vo.Team;
import com.squareup.picasso.Picasso;
import kotlinx.android.synthetic.main.activity_team_detail.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0017\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010!\u001a\u00020\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/TeamDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "menu", "Landroid/view/Menu;", "teamId", "", "getTeamId", "()Ljava/lang/String;", "teamId$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/dake/foorballapps/features/teamdetail/TeamViewModel;", "obtainViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupData", "setupPager", "setupToolbar", "showMessage", "message", "updateFavoriteIcon", "isFavorite", "(Ljava/lang/Boolean;)V", "updateIconIfFavorite", "favorite", "updateTeamDetail", "resource", "Lcom/dake/foorballapps/vo/Resource;", "Lcom/dake/foorballapps/vo/Team;", "Companion", "app_debug"})
public final class TeamDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dake.foorballapps.features.teamdetail.TeamViewModel viewModel;
    private android.view.Menu menu;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy teamId$delegate = null;
    private static final java.lang.String ARG_KEY_MATCH_ID = "arg_key_match_id";
    public static final com.dake.foorballapps.features.teamdetail.TeamDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTeamId() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    private final void updateIconIfFavorite(java.lang.Boolean favorite) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setupData() {
    }
    
    private final void updateFavoriteIcon(java.lang.Boolean isFavorite) {
    }
    
    private final void showMessage(java.lang.String message) {
    }
    
    private final void setupPager() {
    }
    
    private final void setupToolbar() {
    }
    
    private final void updateTeamDetail(com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team> resource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dake.foorballapps.features.teamdetail.TeamViewModel obtainViewModel() {
        return null;
    }
    
    public TeamDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/TeamDetailActivity$Companion;", "", "()V", "ARG_KEY_MATCH_ID", "", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "teamId", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String teamId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}