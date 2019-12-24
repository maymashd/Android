package com.dake.foorballapps;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.dake.foorballapps.data.source.SportRepository;
import com.dake.foorballapps.data.source.local.SportDb;
import com.dake.foorballapps.data.source.remote.SportServiceFactory;
import com.dake.foorballapps.features.matchdetail.MatchViewModel;
import com.dake.foorballapps.features.matches.MatchesViewModel;
import com.dake.foorballapps.features.playerdetail.PlayerViewModel;
import com.dake.foorballapps.features.searchmatch.SearchMatchViewModel;
import com.dake.foorballapps.features.searchteam.SearchTeamViewModel;
import com.dake.foorballapps.features.teamdetail.TeamViewModel;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dake/foorballapps/ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "application", "Landroid/app/Application;", "sportRepository", "Lcom/dake/foorballapps/data/source/SportRepository;", "(Landroid/app/Application;Lcom/dake/foorballapps/data/source/SportRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "app_debug"})
public final class ViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    private final android.app.Application application = null;
    private final com.dake.foorballapps.data.source.SportRepository sportRepository = null;
    private static volatile com.dake.foorballapps.ViewModelFactory INSTANCE;
    public static final com.dake.foorballapps.ViewModelFactory.Companion Companion = null;
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    private ViewModelFactory(android.app.Application application, com.dake.foorballapps.data.source.SportRepository sportRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dake/foorballapps/ViewModelFactory$Companion;", "", "()V", "INSTANCE", "Lcom/dake/foorballapps/ViewModelFactory;", "getInstance", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.dake.foorballapps.ViewModelFactory getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}