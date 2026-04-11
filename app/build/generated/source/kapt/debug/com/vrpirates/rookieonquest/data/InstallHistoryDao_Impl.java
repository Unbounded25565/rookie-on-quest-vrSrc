package com.vrpirates.rookieonquest.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
public final class InstallHistoryDao_Impl implements InstallHistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InstallHistoryEntity> __insertionAdapterOfInstallHistoryEntity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<InstallHistoryEntity> __deletionAdapterOfInstallHistoryEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public InstallHistoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInstallHistoryEntity = new EntityInsertionAdapter<InstallHistoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `install_history` (`id`,`releaseName`,`gameName`,`packageName`,`installedAt`,`downloadDurationMs`,`fileSizeBytes`,`status`,`errorMessage`,`createdAt`,`isLocalInstall`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final InstallHistoryEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getReleaseName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getReleaseName());
        }
        if (entity.getGameName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getGameName());
        }
        if (entity.getPackageName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPackageName());
        }
        statement.bindLong(5, entity.getInstalledAt());
        statement.bindLong(6, entity.getDownloadDurationMs());
        statement.bindLong(7, entity.getFileSizeBytes());
        final String _tmp = __converters.fromInstallStatus(entity.getStatus());
        if (_tmp == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, _tmp);
        }
        if (entity.getErrorMessage() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getErrorMessage());
        }
        statement.bindLong(10, entity.getCreatedAt());
        final int _tmp_1 = entity.isLocalInstall() ? 1 : 0;
        statement.bindLong(11, _tmp_1);
      }
    };
    this.__deletionAdapterOfInstallHistoryEntity = new EntityDeletionOrUpdateAdapter<InstallHistoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `install_history` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final InstallHistoryEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM install_history WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM install_history";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final InstallHistoryEntity entity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInstallHistoryEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final InstallHistoryEntity entity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfInstallHistoryEntity.handle(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteById(final long id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
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
          __preparedStmtOfDeleteById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
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
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<InstallHistoryEntity>> getAllFlow() {
    final String _sql = "SELECT * FROM install_history ORDER BY installedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"install_history"}, new Callable<List<InstallHistoryEntity>>() {
      @Override
      @NonNull
      public List<InstallHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfInstalledAt = CursorUtil.getColumnIndexOrThrow(_cursor, "installedAt");
          final int _cursorIndexOfDownloadDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadDurationMs");
          final int _cursorIndexOfFileSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSizeBytes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<InstallHistoryEntity> _result = new ArrayList<InstallHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final InstallHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final long _tmpInstalledAt;
            _tmpInstalledAt = _cursor.getLong(_cursorIndexOfInstalledAt);
            final long _tmpDownloadDurationMs;
            _tmpDownloadDurationMs = _cursor.getLong(_cursorIndexOfDownloadDurationMs);
            final long _tmpFileSizeBytes;
            _tmpFileSizeBytes = _cursor.getLong(_cursorIndexOfFileSizeBytes);
            final InstallStatus _tmpStatus;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStatus);
            }
            _tmpStatus = __converters.toInstallStatus(_tmp);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final boolean _tmpIsLocalInstall;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_1 != 0;
            _item = new InstallHistoryEntity(_tmpId,_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpInstalledAt,_tmpDownloadDurationMs,_tmpFileSizeBytes,_tmpStatus,_tmpErrorMessage,_tmpCreatedAt,_tmpIsLocalInstall);
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
  public Flow<List<InstallHistoryEntity>> searchAndFilterFlow(final String query,
      final InstallStatus status) {
    final String _sql = "\n"
            + "        SELECT * FROM install_history \n"
            + "        WHERE (? IS NULL OR gameName LIKE '%' || ? || '%' ESCAPE '\\' OR packageName LIKE '%' || ? || '%' ESCAPE '\\')\n"
            + "        AND (? IS NULL OR status = ?)\n"
            + "        ORDER BY installedAt DESC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
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
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 5;
    final String _tmp_1 = __converters.fromInstallStatus(status);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_1);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"install_history"}, new Callable<List<InstallHistoryEntity>>() {
      @Override
      @NonNull
      public List<InstallHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfInstalledAt = CursorUtil.getColumnIndexOrThrow(_cursor, "installedAt");
          final int _cursorIndexOfDownloadDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadDurationMs");
          final int _cursorIndexOfFileSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSizeBytes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<InstallHistoryEntity> _result = new ArrayList<InstallHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final InstallHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final long _tmpInstalledAt;
            _tmpInstalledAt = _cursor.getLong(_cursorIndexOfInstalledAt);
            final long _tmpDownloadDurationMs;
            _tmpDownloadDurationMs = _cursor.getLong(_cursorIndexOfDownloadDurationMs);
            final long _tmpFileSizeBytes;
            _tmpFileSizeBytes = _cursor.getLong(_cursorIndexOfFileSizeBytes);
            final InstallStatus _tmpStatus;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStatus);
            }
            _tmpStatus = __converters.toInstallStatus(_tmp_2);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final boolean _tmpIsLocalInstall;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_3 != 0;
            _item = new InstallHistoryEntity(_tmpId,_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpInstalledAt,_tmpDownloadDurationMs,_tmpFileSizeBytes,_tmpStatus,_tmpErrorMessage,_tmpCreatedAt,_tmpIsLocalInstall);
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
  public Flow<List<InstallHistoryEntity>> searchAndFilterFlowWithLimitAndSort(final String query,
      final InstallStatus status, final Long minTimestamp, final int limit, final String sortMode) {
    final String _sql = "\n"
            + "        SELECT * FROM install_history \n"
            + "        WHERE (? IS NULL OR gameName LIKE '%' || ? || '%' ESCAPE '\\' OR packageName LIKE '%' || ? || '%' ESCAPE '\\')\n"
            + "        AND (? IS NULL OR status = ?)\n"
            + "        AND (? IS NULL OR installedAt >= ?)\n"
            + "        ORDER BY \n"
            + "            CASE WHEN ? = 'DATE_DESC' THEN installedAt END DESC,\n"
            + "            CASE WHEN ? = 'DATE_ASC' THEN installedAt END ASC,\n"
            + "            CASE WHEN ? = 'NAME_ASC' THEN gameName END ASC,\n"
            + "            CASE WHEN ? = 'NAME_DESC' THEN gameName END DESC,\n"
            + "            CASE WHEN ? = 'SIZE_DESC' THEN fileSizeBytes END DESC,\n"
            + "            CASE WHEN ? = 'DURATION_DESC' THEN downloadDurationMs END DESC\n"
            + "        LIMIT ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 14);
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
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 5;
    final String _tmp_1 = __converters.fromInstallStatus(status);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_1);
    }
    _argIndex = 6;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 7;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 8;
    if (sortMode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortMode);
    }
    _argIndex = 9;
    if (sortMode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortMode);
    }
    _argIndex = 10;
    if (sortMode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortMode);
    }
    _argIndex = 11;
    if (sortMode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortMode);
    }
    _argIndex = 12;
    if (sortMode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortMode);
    }
    _argIndex = 13;
    if (sortMode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortMode);
    }
    _argIndex = 14;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"install_history"}, new Callable<List<InstallHistoryEntity>>() {
      @Override
      @NonNull
      public List<InstallHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfInstalledAt = CursorUtil.getColumnIndexOrThrow(_cursor, "installedAt");
          final int _cursorIndexOfDownloadDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadDurationMs");
          final int _cursorIndexOfFileSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSizeBytes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<InstallHistoryEntity> _result = new ArrayList<InstallHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final InstallHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final long _tmpInstalledAt;
            _tmpInstalledAt = _cursor.getLong(_cursorIndexOfInstalledAt);
            final long _tmpDownloadDurationMs;
            _tmpDownloadDurationMs = _cursor.getLong(_cursorIndexOfDownloadDurationMs);
            final long _tmpFileSizeBytes;
            _tmpFileSizeBytes = _cursor.getLong(_cursorIndexOfFileSizeBytes);
            final InstallStatus _tmpStatus;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStatus);
            }
            _tmpStatus = __converters.toInstallStatus(_tmp_2);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final boolean _tmpIsLocalInstall;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_3 != 0;
            _item = new InstallHistoryEntity(_tmpId,_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpInstalledAt,_tmpDownloadDurationMs,_tmpFileSizeBytes,_tmpStatus,_tmpErrorMessage,_tmpCreatedAt,_tmpIsLocalInstall);
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
  public Flow<List<InstallHistoryEntity>> searchAndFilterFlowWithLimit(final String query,
      final InstallStatus status, final Long minTimestamp, final int limit) {
    final String _sql = "\n"
            + "        SELECT * FROM install_history \n"
            + "        WHERE (? IS NULL OR gameName LIKE '%' || ? || '%' ESCAPE '\\' OR packageName LIKE '%' || ? || '%' ESCAPE '\\')\n"
            + "        AND (? IS NULL OR status = ?)\n"
            + "        AND (? IS NULL OR installedAt >= ?)\n"
            + "        ORDER BY installedAt DESC\n"
            + "        LIMIT ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 8);
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
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 5;
    final String _tmp_1 = __converters.fromInstallStatus(status);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_1);
    }
    _argIndex = 6;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 7;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 8;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"install_history"}, new Callable<List<InstallHistoryEntity>>() {
      @Override
      @NonNull
      public List<InstallHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfInstalledAt = CursorUtil.getColumnIndexOrThrow(_cursor, "installedAt");
          final int _cursorIndexOfDownloadDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadDurationMs");
          final int _cursorIndexOfFileSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSizeBytes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<InstallHistoryEntity> _result = new ArrayList<InstallHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final InstallHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final long _tmpInstalledAt;
            _tmpInstalledAt = _cursor.getLong(_cursorIndexOfInstalledAt);
            final long _tmpDownloadDurationMs;
            _tmpDownloadDurationMs = _cursor.getLong(_cursorIndexOfDownloadDurationMs);
            final long _tmpFileSizeBytes;
            _tmpFileSizeBytes = _cursor.getLong(_cursorIndexOfFileSizeBytes);
            final InstallStatus _tmpStatus;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStatus);
            }
            _tmpStatus = __converters.toInstallStatus(_tmp_2);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final boolean _tmpIsLocalInstall;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_3 != 0;
            _item = new InstallHistoryEntity(_tmpId,_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpInstalledAt,_tmpDownloadDurationMs,_tmpFileSizeBytes,_tmpStatus,_tmpErrorMessage,_tmpCreatedAt,_tmpIsLocalInstall);
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
  public Object searchAndFilterPaginated(final String query, final InstallStatus status,
      final Long minTimestamp, final int limit, final int offset,
      final Continuation<? super List<InstallHistoryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM install_history \n"
            + "        WHERE (? IS NULL OR gameName LIKE '%' || ? || '%' ESCAPE '\\' OR packageName LIKE '%' || ? || '%' ESCAPE '\\')\n"
            + "        AND (? IS NULL OR status = ?)\n"
            + "        AND (? IS NULL OR installedAt >= ?)\n"
            + "        ORDER BY installedAt DESC\n"
            + "        LIMIT ? OFFSET ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 9);
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
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 5;
    final String _tmp_1 = __converters.fromInstallStatus(status);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_1);
    }
    _argIndex = 6;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 7;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 8;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 9;
    _statement.bindLong(_argIndex, offset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<InstallHistoryEntity>>() {
      @Override
      @NonNull
      public List<InstallHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfInstalledAt = CursorUtil.getColumnIndexOrThrow(_cursor, "installedAt");
          final int _cursorIndexOfDownloadDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadDurationMs");
          final int _cursorIndexOfFileSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSizeBytes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<InstallHistoryEntity> _result = new ArrayList<InstallHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final InstallHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final long _tmpInstalledAt;
            _tmpInstalledAt = _cursor.getLong(_cursorIndexOfInstalledAt);
            final long _tmpDownloadDurationMs;
            _tmpDownloadDurationMs = _cursor.getLong(_cursorIndexOfDownloadDurationMs);
            final long _tmpFileSizeBytes;
            _tmpFileSizeBytes = _cursor.getLong(_cursorIndexOfFileSizeBytes);
            final InstallStatus _tmpStatus;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStatus);
            }
            _tmpStatus = __converters.toInstallStatus(_tmp_2);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final boolean _tmpIsLocalInstall;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_3 != 0;
            _item = new InstallHistoryEntity(_tmpId,_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpInstalledAt,_tmpDownloadDurationMs,_tmpFileSizeBytes,_tmpStatus,_tmpErrorMessage,_tmpCreatedAt,_tmpIsLocalInstall);
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
  public Object getFilteredCount(final String query, final InstallStatus status,
      final Long minTimestamp, final Continuation<? super Integer> $completion) {
    final String _sql = "\n"
            + "        SELECT COUNT(*) FROM install_history \n"
            + "        WHERE (? IS NULL OR gameName LIKE '%' || ? || '%' ESCAPE '\\' OR packageName LIKE '%' || ? || '%' ESCAPE '\\')\n"
            + "        AND (? IS NULL OR status = ?)\n"
            + "        AND (? IS NULL OR installedAt >= ?)\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 7);
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
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 5;
    final String _tmp_1 = __converters.fromInstallStatus(status);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_1);
    }
    _argIndex = 6;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    _argIndex = 7;
    if (minTimestamp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, minTimestamp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp_2;
            if (_cursor.isNull(0)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(0);
            }
            _result = _tmp_2;
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
  public Object getAll(final Continuation<? super List<InstallHistoryEntity>> $completion) {
    final String _sql = "SELECT * FROM install_history ORDER BY installedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<InstallHistoryEntity>>() {
      @Override
      @NonNull
      public List<InstallHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfGameName = CursorUtil.getColumnIndexOrThrow(_cursor, "gameName");
          final int _cursorIndexOfPackageName = CursorUtil.getColumnIndexOrThrow(_cursor, "packageName");
          final int _cursorIndexOfInstalledAt = CursorUtil.getColumnIndexOrThrow(_cursor, "installedAt");
          final int _cursorIndexOfDownloadDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadDurationMs");
          final int _cursorIndexOfFileSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSizeBytes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<InstallHistoryEntity> _result = new ArrayList<InstallHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final InstallHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final long _tmpInstalledAt;
            _tmpInstalledAt = _cursor.getLong(_cursorIndexOfInstalledAt);
            final long _tmpDownloadDurationMs;
            _tmpDownloadDurationMs = _cursor.getLong(_cursorIndexOfDownloadDurationMs);
            final long _tmpFileSizeBytes;
            _tmpFileSizeBytes = _cursor.getLong(_cursorIndexOfFileSizeBytes);
            final InstallStatus _tmpStatus;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStatus);
            }
            _tmpStatus = __converters.toInstallStatus(_tmp);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final boolean _tmpIsLocalInstall;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_1 != 0;
            _item = new InstallHistoryEntity(_tmpId,_tmpReleaseName,_tmpGameName,_tmpPackageName,_tmpInstalledAt,_tmpDownloadDurationMs,_tmpFileSizeBytes,_tmpStatus,_tmpErrorMessage,_tmpCreatedAt,_tmpIsLocalInstall);
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
  public Object getCountByStatus(final InstallStatus status,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM install_history WHERE status = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(0);
            }
            _result = _tmp_1;
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
  public Object getAverageDuration(final InstallStatus status,
      final Continuation<? super Long> $completion) {
    final String _sql = "SELECT AVG(downloadDurationMs) FROM install_history WHERE status = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if (_cursor.moveToFirst()) {
            final Long _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(0);
            }
            _result = _tmp_1;
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
  public Object getTotalDownloadedSize(final InstallStatus status,
      final Continuation<? super Long> $completion) {
    final String _sql = "SELECT SUM(fileSizeBytes) FROM install_history WHERE status = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromInstallStatus(status);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if (_cursor.moveToFirst()) {
            final Long _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(0);
            }
            _result = _tmp_1;
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
  public Object getMostInstalledGames(final int limit,
      final Continuation<? super List<GameCount>> $completion) {
    final String _sql = "SELECT gameName, COUNT(*) as count FROM install_history GROUP BY gameName ORDER BY count DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GameCount>>() {
      @Override
      @NonNull
      public List<GameCount> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGameName = 0;
          final int _cursorIndexOfCount = 1;
          final List<GameCount> _result = new ArrayList<GameCount>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GameCount _item;
            final String _tmpGameName;
            if (_cursor.isNull(_cursorIndexOfGameName)) {
              _tmpGameName = null;
            } else {
              _tmpGameName = _cursor.getString(_cursorIndexOfGameName);
            }
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            _item = new GameCount(_tmpGameName,_tmpCount);
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
  public Object getErrorSummary(final int limit,
      final Continuation<? super List<ErrorCount>> $completion) {
    final String _sql = "SELECT errorMessage, COUNT(*) as count FROM install_history WHERE errorMessage IS NOT NULL AND errorMessage != '' GROUP BY errorMessage ORDER BY count DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ErrorCount>>() {
      @Override
      @NonNull
      public List<ErrorCount> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfErrorMessage = 0;
          final int _cursorIndexOfCount = 1;
          final List<ErrorCount> _result = new ArrayList<ErrorCount>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ErrorCount _item;
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            _item = new ErrorCount(_tmpErrorMessage,_tmpCount);
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
  public Object countByReleaseAndCreatedAt(final String releaseName, final long createdAt,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM install_history WHERE releaseName = ? AND createdAt = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (releaseName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, releaseName);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, createdAt);
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
