package com.dake.foorballapps.features.teamdetail.adapter;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dake.foorballapps.R;
import com.dake.foorballapps.features.base.BaseRVAdapter;
import com.dake.foorballapps.vo.Player;
import com.dake.foorballapps.vo.Resource;
import com.squareup.picasso.Picasso;
import kotlinx.android.synthetic.main.item_player.view.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/adapter/PlayerAdapter;", "Lcom/dake/foorballapps/features/base/BaseRVAdapter;", "Lcom/dake/foorballapps/vo/Player;", "ctx", "Landroid/content/Context;", "resource", "Lcom/dake/foorballapps/vo/Resource;", "", "clickListener", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lcom/dake/foorballapps/vo/Resource;Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "createDataViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "position", "", "PlayerItem", "app_release"})
public final class PlayerAdapter extends com.dake.foorballapps.features.base.BaseRVAdapter<com.dake.foorballapps.vo.Player> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.dake.foorballapps.vo.Player, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.RecyclerView.ViewHolder createDataViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.dake.foorballapps.vo.Player, kotlin.Unit> getClickListener() {
        return null;
    }
    
    public PlayerAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.dake.foorballapps.vo.Resource<? extends java.util.List<com.dake.foorballapps.vo.Player>> resource, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dake.foorballapps.vo.Player, kotlin.Unit> clickListener) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lcom/dake/foorballapps/features/teamdetail/adapter/PlayerAdapter$PlayerItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/dake/foorballapps/features/teamdetail/adapter/PlayerAdapter;Landroid/view/View;)V", "bind", "", "res", "Lcom/dake/foorballapps/vo/Player;", "clickListener", "Lkotlin/Function1;", "app_release"})
    public final class PlayerItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.dake.foorballapps.vo.Player res, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.dake.foorballapps.vo.Player, kotlin.Unit> clickListener) {
        }
        
        public PlayerItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}