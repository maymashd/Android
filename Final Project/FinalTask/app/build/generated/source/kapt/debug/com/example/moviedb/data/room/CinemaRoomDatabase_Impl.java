package com.example.moviedb.data.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CinemaRoomDatabase_Impl extends CinemaRoomDatabase {
  private volatile CinemaDao _cinemaDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cinema_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `address` TEXT, `parking` TEXT, `entry` TEXT, `phoneNumber` TEXT, `buffet` TEXT, `poster` TEXT, `latitude` REAL, `longitude` REAL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ea4d51a57e1fe076560f04322b1c66a1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `cinema_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCinemaTable = new HashMap<String, TableInfo.Column>(10);
        _columnsCinemaTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("parking", new TableInfo.Column("parking", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("entry", new TableInfo.Column("entry", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("phoneNumber", new TableInfo.Column("phoneNumber", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("buffet", new TableInfo.Column("buffet", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("poster", new TableInfo.Column("poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("latitude", new TableInfo.Column("latitude", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCinemaTable.put("longitude", new TableInfo.Column("longitude", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCinemaTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCinemaTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCinemaTable = new TableInfo("cinema_table", _columnsCinemaTable, _foreignKeysCinemaTable, _indicesCinemaTable);
        final TableInfo _existingCinemaTable = TableInfo.read(_db, "cinema_table");
        if (! _infoCinemaTable.equals(_existingCinemaTable)) {
          return new RoomOpenHelper.ValidationResult(false, "cinema_table(com.example.moviedb.data.room.Cinema).\n"
                  + " Expected:\n" + _infoCinemaTable + "\n"
                  + " Found:\n" + _existingCinemaTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ea4d51a57e1fe076560f04322b1c66a1", "05f27f52c0c1410c2a36c3be75a97642");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "cinema_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cinema_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CinemaDao cinemaDao() {
    if (_cinemaDao != null) {
      return _cinemaDao;
    } else {
      synchronized(this) {
        if(_cinemaDao == null) {
          _cinemaDao = new CinemaDao_Impl(this);
        }
        return _cinemaDao;
      }
    }
  }
}
