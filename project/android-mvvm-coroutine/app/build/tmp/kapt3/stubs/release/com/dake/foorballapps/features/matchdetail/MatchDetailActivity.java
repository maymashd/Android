package com.dake.foorballapps.features.matchdetail;

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
import com.dake.foorballapps.vo.Match;
import com.dake.foorballapps.vo.Resource;
import com.dake.foorballapps.vo.Team;
import com.squareup.picasso.Picasso;
import kotlinx.android.synthetic.main.activity_match_detail.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\u0018\u0010\"\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\u0018\u0010#\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010 H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u0004H\u0002J\u0017\u0010(\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u0010*J\u0017\u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u0010*R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/dake/foorballapps/features/matchdetail/MatchDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "idAwayTeam", "", "getIdAwayTeam", "()Ljava/lang/String;", "idAwayTeam$delegate", "Lkotlin/Lazy;", "idEvent", "getIdEvent", "idEvent$delegate", "idHomeTeam", "getIdHomeTeam", "idHomeTeam$delegate", "menu", "Landroid/view/Menu;", "viewModel", "Lcom/dake/foorballapps/features/matchdetail/MatchViewModel;", "initData", "", "obtainViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupAwayTeam", "resource", "Lcom/dake/foorballapps/vo/Resource;", "Lcom/dake/foorballapps/vo/Team;", "setupHomeTeam", "setupMatchDetail", "Lcom/dake/foorballapps/vo/Match;", "setupToolbar", "showMessage", "message", "updateFavoriteIcon", "isFavorite", "(Ljava/lang/Boolean;)V", "updateIconIfFavorite", "favorite", "Companion", "app_release"})
public final class MatchDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dake.foorballapps.features.matchdetail.MatchViewModel viewModel;
    private android.view.Menu menu;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy idEvent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy idHomeTeam$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy idAwayTeam$delegate = null;
    private static final java.lang.String ARG_KEY_ID_EVENT = "arg_key_id_event";
    private static final java.lang.String ARG_KEY_ID_HOME_TEAM = "arg_key_id_home_team";
    private static final java.lang.String ARG_KEY_ID_AWAY_TEAM = "arg_key_id_away_team";
    public static final com.dake.foorballapps.features.matchdetail.MatchDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdAwayTeam() {
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
    
    private final void setupToolbar() {
    }
    
    private final void initData() {
    }
    
    private final void updateFavoriteIcon(java.lang.Boolean isFavorite) {
    }
    
    private final void showMessage(java.lang.String message) {
    }
    
    private final void setupMatchDetail(com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Match> resource) {
    }
    
    private final void setupAwayTeam(com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team> resource) {
    }
    
    private final void setupHomeTeam(com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Team> resource) {
    }
    
    private final com.dake.foorballapps.features.matchdetail.MatchViewModel obtainViewModel() {
        return null;
    }
    
    public MatchDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dake/foorballapps/features/matchdetail/MatchDetailActivity$Companion;", "", "()V", "ARG_KEY_ID_AWAY_TEAM", "", "ARG_KEY_ID_EVENT", "ARG_KEY_ID_HOME_TEAM", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "idEvent", "idHomeTeam", "idAwayTeam", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String idEvent, @org.jetbrains.annotations.Nullable()
        java.lang.String idHomeTeam, @org.jetbrains.annotations.Nullable()
        java.lang.String idAwayTeam) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}