package com.dake.foorballapps.features.playerdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import com.dake.foorballapps.R;
import com.dake.foorballapps.vo.Player;
import com.dake.foorballapps.vo.Resource;
import com.squareup.picasso.Picasso;
import kotlinx.android.synthetic.main.activity_player_detail.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/dake/foorballapps/features/playerdetail/PlayerDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "playerId", "", "getPlayerId", "()Ljava/lang/String;", "playerId$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/dake/foorballapps/features/playerdetail/PlayerViewModel;", "initData", "", "initToolbar", "obtainViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateData", "res", "Lcom/dake/foorballapps/vo/Resource;", "Lcom/dake/foorballapps/vo/Player;", "Companion", "app_debug"})
public final class PlayerDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dake.foorballapps.features.playerdetail.PlayerViewModel viewModel;
    private final kotlin.Lazy playerId$delegate = null;
    private static final java.lang.String ARG_KEY_PLAYER_ID = "arg_key_player_id";
    public static final com.dake.foorballapps.features.playerdetail.PlayerDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.lang.String getPlayerId() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initToolbar() {
    }
    
    private final void initData() {
    }
    
    private final void updateData(com.dake.foorballapps.vo.Resource<com.dake.foorballapps.vo.Player> res) {
    }
    
    private final com.dake.foorballapps.features.playerdetail.PlayerViewModel obtainViewModel() {
        return null;
    }
    
    public PlayerDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dake/foorballapps/features/playerdetail/PlayerDetailActivity$Companion;", "", "()V", "ARG_KEY_PLAYER_ID", "", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "playerId", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String playerId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}