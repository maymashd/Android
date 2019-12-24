package com.example.moviedb.data.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CinemaDao_Impl implements CinemaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Cinema> __insertionAdapterOfCinema;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CinemaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCinema = new EntityInsertionAdapter<Cinema>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `cinema_table` (`id`,`name`,`address`,`parking`,`entry`,`phoneNumber`,`buffet`,`poster`,`latitude`,`longitude`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cinema value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        if (value.getParking() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getParking());
        }
        if (value.getEntry() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEntry());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPhoneNumber());
        }
        if (value.getBuffet() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBuffet());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPoster());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindDouble(9, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getLongitude());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM cinema_table";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Cinema cinema, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCinema.insert(cinema);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<Cinema>> getCinemas() {
    final String _sql = "SELECT * FROM cinema_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cinema_table"}, false, new Callable<List<Cinema>>() {
      @Override
      public List<Cinema> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfParking = CursorUtil.getColumnIndexOrThrow(_cursor, "parking");
          final int _cursorIndexOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfBuffet = CursorUtil.getColumnIndexOrThrow(_cursor, "buffet");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final List<Cinema> _result = new ArrayList<Cinema>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Cinema _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpParking;
            _tmpParking = _cursor.getString(_cursorIndexOfParking);
            final String _tmpEntry;
            _tmpEntry = _cursor.getString(_cursorIndexOfEntry);
            final String _tmpPhoneNumber;
            _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            final String _tmpBuffet;
            _tmpBuffet = _cursor.getString(_cursorIndexOfBuffet);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final Double _tmpLatitude;
            if (_cursor.isNull(_cursorIndexOfLatitude)) {
              _tmpLatitude = null;
            } else {
              _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            }
            final Double _tmpLongitude;
            if (_cursor.isNull(_cursorIndexOfLongitude)) {
              _tmpLongitude = null;
            } else {
              _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            }
            _item = new Cinema(_tmpId,_tmpName,_tmpAddress,_tmpParking,_tmpEntry,_tmpPhoneNumber,_tmpBuffet,_tmpPoster,_tmpLatitude,_tmpLongitude);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Cinema> getCinema(final int id) {
    final String _sql = "SELECT * FROM cinema_table WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cinema_table"}, false, new Callable<Cinema>() {
      @Override
      public Cinema call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfParking = CursorUtil.getColumnIndexOrThrow(_cursor, "parking");
          final int _cursorIndexOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfBuffet = CursorUtil.getColumnIndexOrThrow(_cursor, "buffet");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final Cinema _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpParking;
            _tmpParking = _cursor.getString(_cursorIndexOfParking);
            final String _tmpEntry;
            _tmpEntry = _cursor.getString(_cursorIndexOfEntry);
            final String _tmpPhoneNumber;
            _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            final String _tmpBuffet;
            _tmpBuffet = _cursor.getString(_cursorIndexOfBuffet);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final Double _tmpLatitude;
            if (_cursor.isNull(_cursorIndexOfLatitude)) {
              _tmpLatitude = null;
            } else {
              _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            }
            final Double _tmpLongitude;
            if (_cursor.isNull(_cursorIndexOfLongitude)) {
              _tmpLongitude = null;
            } else {
              _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            }
            _result = new Cinema(_tmpId,_tmpName,_tmpAddress,_tmpParking,_tmpEntry,_tmpPhoneNumber,_tmpBuffet,_tmpPoster,_tmpLatitude,_tmpLongitude);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
