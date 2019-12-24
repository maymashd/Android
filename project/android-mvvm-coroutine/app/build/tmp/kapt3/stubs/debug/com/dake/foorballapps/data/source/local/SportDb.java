package com.dake.foorballapps.data.source.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.dake.foorballapps.vo.*;

@androidx.room.Database(entities = {com.dake.foorballapps.vo.Match.class, com.dake.foorballapps.vo.Team.class, com.dake.foorballapps.vo.Player.class, com.dake.foorballapps.vo.FavoriteMatch.class, com.dake.foorballapps.vo.FavoriteTeam.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dake/foorballapps/data/source/local/SportDb;", "Landroidx/room/RoomDatabase;", "()V", "sportDao", "Lcom/dake/foorballapps/data/source/local/SportDao;", "Companion", "app_debug"})
public abstract class SportDb extends androidx.room.RoomDatabase {
    private static volatile com.dake.foorballapps.data.source.local.SportDb INSTANCE;
    public static final com.dake.foorballapps.data.source.local.SportDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dake.foorballapps.data.source.local.SportDao sportDao();
    
    public SportDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dake/foorballapps/data/source/local/SportDb$Companion;", "", "()V", "INSTANCE", "Lcom/dake/foorballapps/data/source/local/SportDb;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.dake.foorballapps.data.source.local.SportDb getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}