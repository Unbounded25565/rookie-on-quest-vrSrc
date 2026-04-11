package com.vrpirates.rookieonquest.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDao_Impl implements GameDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GameEntity> __insertionAdapterOfGameEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSize;

  private final SharedSQLiteStatement __preparedStmtOfUpdateMetadata;

  private final SharedSQLiteStatement __preparedStmtOfUpdateFavorite;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public GameDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGameEntity = new EntityInsertionAdapter<GameEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `games` (`releaseName`,`gameName`,`packageName`,`versionCode`,`sizeBytes`,`description`,`screenshotUrlsJson`,`lastUpdated`,`popularity`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GameEntity entity) {
        if (entity.getReleaseName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getReleaseName());
        }
        if (entity.getGameName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getGameName());
        }
        if (entity.getPackageName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPackageName());
        }
        if (entity.getVersionCode() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getVersionCode());
        }
        if (entity.getSizeBytes() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getSizeBytes());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDescription());
        }
        if (entity.getScreenshotUrlsJson() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getScreenshotUrlsJson());
        }
        statement.bindLong(8, entity.getLastUpdated());
        statement.bindLong(9, entity.getPopularity());
        final int _tmp = entity.isFavorite() ? 1 : 0;
        statement.bindLong(10, _tmp);
      }
    };
    this.__preparedStmtOfUpdateSize = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE games SET sizeBytes = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateMetadata = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE games SET description = ?, screenshotUrlsJson = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateFavorite = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE games SET isFavorite = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM games";
        return _query;
      }
    };
  }

  @Override
  public Object insertGames(final List<GameEntity> games,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGameEntity.insert(games);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSize(final String releaseName, final long size,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSize.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, size);
        _argIndex = 2;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateSize.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateMetadata(final String releaseName, final String description,
      final String screenshots, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateMetadata.acquire();
        int _argIndex = 1;
        if (description == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, description);
        }
        _argIndex = 2;
        if (screenshots == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, screenshots);
        }
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateMetadata.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateFavorite(final String releaseName, final boolean isFavorite,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateFavorite.acquire();
        int _argIndex = 1;
        final int _tmp = isFavorite ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateFavorite.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<GameEntity>> getAllGames() {
    final String _sql = "SELECT * FROM games ORDER BY gameName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<GameEntity>>() {
      @Override
      @NonNull
      public List<GameEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfScreenshotUrlsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "screenshotUrlsJson");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GameEntity> _result = new ArrayList<GameEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GameEntity _item;
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final String _tmpPackageName;
            if (_cursor.isNull(_cursorIndexOfPackageName)) {
              _tmpPackageName = null;
            } else {
              _tmpPackageName = _cursor.getString(_cursorIndexOfPackageName);
            }
            final String _tmpVersionCode;
            if (_cursor.isNull(_cursorIndexOfVersionCode)) {
              _tmpVersionCode = null;
            } else {
              _tmpVersionCode = _cursor.getString(_cursorIndexOfVersionCode);
            }
            final Long _tmpSizeBytes;
            if (_cursor.isNull(_cursorIndexOfSizeBytes)) {
              _tmpSizeBytes = null;
            } else {
              _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpScreenshotUrlsJson;
            if (_cursor.isNull(_cursorIndexOfScreenshotUrlsJson)) {
              _tmpScreenshotUrlsJson = null;
            } else {
              _tmpScreenshotUrlsJson = _cursor.getString(_cursorIndexOfScreenshotUrlsJson);
            }
            final long _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            final int _tmpPopularity;
            _tmpPopularity = _cursor.getInt(_cursorIndexOfPopularity);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new GameEntity(_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpVersionCode,_tmpSizeBytes,_tmpDescription,_tmpScreenshotUrlsJson,_tmpLastUpdated,_tmpPopularity,_tmpIsFavorite);
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
  public Object getAllGamesList(final Continuation<? super List<GameEntity>> $completion) {
    final String _sql = "SELECT * FROM games";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GameEntity>>() {
      @Override
      @NonNull
      public List<GameEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfScreenshotUrlsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "screenshotUrlsJson");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GameEntity> _result = new ArrayList<GameEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GameEntity _item;
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final String _tmpPackageName;
            if (_cursor.isNull(_cursorIndexOfPackageName)) {
              _tmpPackageName = null;
            } else {
              _tmpPackageName = _cursor.getString(_cursorIndexOfPackageName);
            }
            final String _tmpVersionCode;
            if (_cursor.isNull(_cursorIndexOfVersionCode)) {
              _tmpVersionCode = null;
            } else {
              _tmpVersionCode = _cursor.getString(_cursorIndexOfVersionCode);
            }
            final Long _tmpSizeBytes;
            if (_cursor.isNull(_cursorIndexOfSizeBytes)) {
              _tmpSizeBytes = null;
            } else {
              _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpScreenshotUrlsJson;
            if (_cursor.isNull(_cursorIndexOfScreenshotUrlsJson)) {
              _tmpScreenshotUrlsJson = null;
            } else {
              _tmpScreenshotUrlsJson = _cursor.getString(_cursorIndexOfScreenshotUrlsJson);
            }
            final long _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            final int _tmpPopularity;
            _tmpPopularity = _cursor.getInt(_cursorIndexOfPopularity);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new GameEntity(_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpVersionCode,_tmpSizeBytes,_tmpDescription,_tmpScreenshotUrlsJson,_tmpLastUpdated,_tmpPopularity,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<GameEntity>> searchGames(final String query) {
    final String _sql = "SELECT * FROM games WHERE gameName LIKE ? OR packageName LIKE ? ORDER BY gameName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<GameEntity>>() {
      @Override
      @NonNull
      public List<GameEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfScreenshotUrlsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "screenshotUrlsJson");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GameEntity> _result = new ArrayList<GameEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GameEntity _item;
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final String _tmpPackageName;
            if (_cursor.isNull(_cursorIndexOfPackageName)) {
              _tmpPackageName = null;
            } else {
              _tmpPackageName = _cursor.getString(_cursorIndexOfPackageName);
            }
            final String _tmpVersionCode;
            if (_cursor.isNull(_cursorIndexOfVersionCode)) {
              _tmpVersionCode = null;
            } else {
              _tmpVersionCode = _cursor.getString(_cursorIndexOfVersionCode);
            }
            final Long _tmpSizeBytes;
            if (_cursor.isNull(_cursorIndexOfSizeBytes)) {
              _tmpSizeBytes = null;
            } else {
              _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpScreenshotUrlsJson;
            if (_cursor.isNull(_cursorIndexOfScreenshotUrlsJson)) {
              _tmpScreenshotUrlsJson = null;
            } else {
              _tmpScreenshotUrlsJson = _cursor.getString(_cursorIndexOfScreenshotUrlsJson);
            }
            final long _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            final int _tmpPopularity;
            _tmpPopularity = _cursor.getInt(_cursorIndexOfPopularity);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new GameEntity(_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpVersionCode,_tmpSizeBytes,_tmpDescription,_tmpScreenshotUrlsJson,_tmpLastUpdated,_tmpPopularity,_tmpIsFavorite);
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
  public Object getByReleaseName(final String releaseName,
      final Continuation<? super GameEntity> $completion) {
    final String _sql = "SELECT * FROM games WHERE releaseName = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (releaseName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, releaseName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<GameEntity>() {
      @Override
      @Nullable
      public GameEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfScreenshotUrlsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "screenshotUrlsJson");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final GameEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final String _tmpPackageName;
            if (_cursor.isNull(_cursorIndexOfPackageName)) {
              _tmpPackageName = null;
            } else {
              _tmpPackageName = _cursor.getString(_cursorIndexOfPackageName);
            }
            final String _tmpVersionCode;
            if (_cursor.isNull(_cursorIndexOfVersionCode)) {
              _tmpVersionCode = null;
            } else {
              _tmpVersionCode = _cursor.getString(_cursorIndexOfVersionCode);
            }
            final Long _tmpSizeBytes;
            if (_cursor.isNull(_cursorIndexOfSizeBytes)) {
              _tmpSizeBytes = null;
            } else {
              _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpScreenshotUrlsJson;
            if (_cursor.isNull(_cursorIndexOfScreenshotUrlsJson)) {
              _tmpScreenshotUrlsJson = null;
            } else {
              _tmpScreenshotUrlsJson = _cursor.getString(_cursorIndexOfScreenshotUrlsJson);
            }
            final long _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            final int _tmpPopularity;
            _tmpPopularity = _cursor.getInt(_cursorIndexOfPopularity);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _result = new GameEntity(_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpVersionCode,_tmpSizeBytes,_tmpDescription,_tmpScreenshotUrlsJson,_tmpLastUpdated,_tmpPopularity,_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByPackageName(final String packageName,
      final Continuation<? super GameEntity> $completion) {
    final String _sql = "SELECT * FROM games WHERE packageName = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (packageName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, packageName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<GameEntity>() {
      @Override
      @Nullable
      public GameEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfScreenshotUrlsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "screenshotUrlsJson");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final GameEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final String _tmpPackageName;
            if (_cursor.isNull(_cursorIndexOfPackageName)) {
              _tmpPackageName = null;
            } else {
              _tmpPackageName = _cursor.getString(_cursorIndexOfPackageName);
            }
            final String _tmpVersionCode;
            if (_cursor.isNull(_cursorIndexOfVersionCode)) {
              _tmpVersionCode = null;
            } else {
              _tmpVersionCode = _cursor.getString(_cursorIndexOfVersionCode);
            }
            final Long _tmpSizeBytes;
            if (_cursor.isNull(_cursorIndexOfSizeBytes)) {
              _tmpSizeBytes = null;
            } else {
              _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpScreenshotUrlsJson;
            if (_cursor.isNull(_cursorIndexOfScreenshotUrlsJson)) {
              _tmpScreenshotUrlsJson = null;
            } else {
              _tmpScreenshotUrlsJson = _cursor.getString(_cursorIndexOfScreenshotUrlsJson);
            }
            final long _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            final int _tmpPopularity;
            _tmpPopularity = _cursor.getInt(_cursorIndexOfPopularity);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _result = new GameEntity(_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpVersionCode,_tmpSizeBytes,_tmpDescription,_tmpScreenshotUrlsJson,_tmpLastUpdated,_tmpPopularity,_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByReleaseNames(final List<String> releaseNames,
      final Continuation<? super List<GameEntity>> $completion) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM games WHERE releaseName IN (");
    final int _inputSize = releaseNames.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : releaseNames) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex++;
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GameEntity>>() {
      @Override
      @NonNull
      public List<GameEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfScreenshotUrlsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "screenshotUrlsJson");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GameEntity> _result = new ArrayList<GameEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GameEntity _item_1;
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final String _tmpPackageName;
            if (_cursor.isNull(_cursorIndexOfPackageName)) {
              _tmpPackageName = null;
            } else {
              _tmpPackageName = _cursor.getString(_cursorIndexOfPackageName);
            }
            final String _tmpVersionCode;
            if (_cursor.isNull(_cursorIndexOfVersionCode)) {
              _tmpVersionCode = null;
            } else {
              _tmpVersionCode = _cursor.getString(_cursorIndexOfVersionCode);
            }
            final Long _tmpSizeBytes;
            if (_cursor.isNull(_cursorIndexOfSizeBytes)) {
              _tmpSizeBytes = null;
            } else {
              _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpScreenshotUrlsJson;
            if (_cursor.isNull(_cursorIndexOfScreenshotUrlsJson)) {
              _tmpScreenshotUrlsJson = null;
            } else {
              _tmpScreenshotUrlsJson = _cursor.getString(_cursorIndexOfScreenshotUrlsJson);
            }
            final long _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
            final int _tmpPopularity;
            _tmpPopularity = _cursor.getInt(_cursorIndexOfPopularity);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item_1 = new GameEntity(_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpVersionCode,_tmpSizeBytes,_tmpDescription,_tmpScreenshotUrlsJson,_tmpLastUpdated,_tmpPopularity,_tmpIsFavorite);
            _result.add(_item_1);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM games";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
