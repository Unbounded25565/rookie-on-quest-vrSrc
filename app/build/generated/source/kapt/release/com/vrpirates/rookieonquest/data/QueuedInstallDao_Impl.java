package com.vrpirates.rookieonquest.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
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
public final class QueuedInstallDao_Impl implements QueuedInstallDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<QueuedInstallEntity> __insertionAdapterOfQueuedInstallEntity;

  private final EntityDeletionOrUpdateAdapter<QueuedInstallEntity> __deletionAdapterOfQueuedInstallEntity;

  private final EntityDeletionOrUpdateAdapter<QueuedInstallEntity> __updateAdapterOfQueuedInstallEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

  private final SharedSQLiteStatement __preparedStmtOfSetDownloadStartTimeIfNull;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProgress;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProgressOnly;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProgressAndBytes;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDownloadedBytes;

  private final SharedSQLiteStatement __preparedStmtOfUpdateQueuePosition;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLocalInstallStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByReleaseName;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public QueuedInstallDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQueuedInstallEntity = new EntityInsertionAdapter<QueuedInstallEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `install_queue` (`releaseName`,`status`,`progress`,`downloadedBytes`,`totalBytes`,`queuePosition`,`createdAt`,`lastUpdatedAt`,`downloadStartedAt`,`isDownloadOnly`,`isLocalInstall`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QueuedInstallEntity entity) {
        if (entity.getReleaseName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getReleaseName());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getStatus());
        }
        statement.bindDouble(3, entity.getProgress());
        if (entity.getDownloadedBytes() == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, entity.getDownloadedBytes());
        }
        if (entity.getTotalBytes() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getTotalBytes());
        }
        statement.bindLong(6, entity.getQueuePosition());
        statement.bindLong(7, entity.getCreatedAt());
        statement.bindLong(8, entity.getLastUpdatedAt());
        if (entity.getDownloadStartedAt() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getDownloadStartedAt());
        }
        final int _tmp = entity.isDownloadOnly() ? 1 : 0;
        statement.bindLong(10, _tmp);
        final int _tmp_1 = entity.isLocalInstall() ? 1 : 0;
        statement.bindLong(11, _tmp_1);
      }
    };
    this.__deletionAdapterOfQueuedInstallEntity = new EntityDeletionOrUpdateAdapter<QueuedInstallEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `install_queue` WHERE `releaseName` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QueuedInstallEntity entity) {
        if (entity.getReleaseName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getReleaseName());
        }
      }
    };
    this.__updateAdapterOfQueuedInstallEntity = new EntityDeletionOrUpdateAdapter<QueuedInstallEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `install_queue` SET `releaseName` = ?,`status` = ?,`progress` = ?,`downloadedBytes` = ?,`totalBytes` = ?,`queuePosition` = ?,`createdAt` = ?,`lastUpdatedAt` = ?,`downloadStartedAt` = ?,`isDownloadOnly` = ?,`isLocalInstall` = ? WHERE `releaseName` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QueuedInstallEntity entity) {
        if (entity.getReleaseName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getReleaseName());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getStatus());
        }
        statement.bindDouble(3, entity.getProgress());
        if (entity.getDownloadedBytes() == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, entity.getDownloadedBytes());
        }
        if (entity.getTotalBytes() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getTotalBytes());
        }
        statement.bindLong(6, entity.getQueuePosition());
        statement.bindLong(7, entity.getCreatedAt());
        statement.bindLong(8, entity.getLastUpdatedAt());
        if (entity.getDownloadStartedAt() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getDownloadStartedAt());
        }
        final int _tmp = entity.isDownloadOnly() ? 1 : 0;
        statement.bindLong(10, _tmp);
        final int _tmp_1 = entity.isLocalInstall() ? 1 : 0;
        statement.bindLong(11, _tmp_1);
        if (entity.getReleaseName() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getReleaseName());
        }
      }
    };
    this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET status = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetDownloadStartTimeIfNull = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET downloadStartedAt = ?, lastUpdatedAt = ? WHERE releaseName = ? AND downloadStartedAt IS NULL";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProgress = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET progress = ?, downloadedBytes = ?, totalBytes = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProgressOnly = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET progress = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProgressAndBytes = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET progress = ?, downloadedBytes = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDownloadedBytes = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET downloadedBytes = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateQueuePosition = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET queuePosition = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLocalInstallStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE install_queue SET isLocalInstall = ?, lastUpdatedAt = ? WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteByReleaseName = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM install_queue WHERE releaseName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM install_queue";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final QueuedInstallEntity entity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfQueuedInstallEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<QueuedInstallEntity> entities,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfQueuedInstallEntity.insert(entities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final QueuedInstallEntity entity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfQueuedInstallEntity.handle(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final QueuedInstallEntity entity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfQueuedInstallEntity.handle(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAtNextPosition(final QueuedInstallEntity entity,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> QueuedInstallDao.DefaultImpls.insertAtNextPosition(QueuedInstallDao_Impl.this, entity, __cont), $completion);
  }

  @Override
  public Object reorderQueue(final List<QueuedInstallEntity> entities,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> QueuedInstallDao.DefaultImpls.reorderQueue(QueuedInstallDao_Impl.this, entities, __cont), $completion);
  }

  @Override
  public Object promoteToFront(final String releaseName,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> QueuedInstallDao.DefaultImpls.promoteToFront(QueuedInstallDao_Impl.this, releaseName, __cont), $completion);
  }

  @Override
  public Object promoteToFrontAndUpdateStatus(final String releaseName, final String newStatus,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> QueuedInstallDao.DefaultImpls.promoteToFrontAndUpdateStatus(QueuedInstallDao_Impl.this, releaseName, newStatus, __cont), $completion);
  }

  @Override
  public Object updateStatus(final String releaseName, final String status, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStatus.acquire();
        int _argIndex = 1;
        if (status == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, status);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateStatus.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object setDownloadStartTimeIfNull(final String releaseName, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetDownloadStartTimeIfNull.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfSetDownloadStartTimeIfNull.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProgress(final String releaseName, final float progress,
      final Long downloadedBytes, final Long totalBytes, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProgress.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, progress);
        _argIndex = 2;
        if (downloadedBytes == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, downloadedBytes);
        }
        _argIndex = 3;
        if (totalBytes == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, totalBytes);
        }
        _argIndex = 4;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 5;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateProgress.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProgressOnly(final String releaseName, final float progress,
      final long timestamp, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProgressOnly.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, progress);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateProgressOnly.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProgressAndBytes(final String releaseName, final float progress,
      final long downloadedBytes, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProgressAndBytes.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, progress);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, downloadedBytes);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 4;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateProgressAndBytes.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateDownloadedBytes(final String releaseName, final long downloadedBytes,
      final long timestamp, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDownloadedBytes.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, downloadedBytes);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateDownloadedBytes.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateQueuePosition(final String releaseName, final int newPosition,
      final long timestamp, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateQueuePosition.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, newPosition);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateQueuePosition.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateLocalInstallStatus(final String releaseName, final boolean isLocal,
      final long timestamp, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLocalInstallStatus.acquire();
        int _argIndex = 1;
        final int _tmp = isLocal ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateLocalInstallStatus.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteByReleaseName(final String releaseName,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByReleaseName.acquire();
        int _argIndex = 1;
        if (releaseName == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, releaseName);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteByReleaseName.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
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
  public Flow<List<QueuedInstallEntity>> getAllFlow() {
    final String _sql = "SELECT * FROM install_queue ORDER BY queuePosition ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"install_queue"}, new Callable<List<QueuedInstallEntity>>() {
      @Override
      @NonNull
      public List<QueuedInstallEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "progress");
          final int _cursorIndexOfDownloadedBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadedBytes");
          final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
          final int _cursorIndexOfQueuePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "queuePosition");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfLastUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdatedAt");
          final int _cursorIndexOfDownloadStartedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadStartedAt");
          final int _cursorIndexOfIsDownloadOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "isDownloadOnly");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<QueuedInstallEntity> _result = new ArrayList<QueuedInstallEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final QueuedInstallEntity _item;
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final float _tmpProgress;
            _tmpProgress = _cursor.getFloat(_cursorIndexOfProgress);
            final Long _tmpDownloadedBytes;
            if (_cursor.isNull(_cursorIndexOfDownloadedBytes)) {
              _tmpDownloadedBytes = null;
            } else {
              _tmpDownloadedBytes = _cursor.getLong(_cursorIndexOfDownloadedBytes);
            }
            final Long _tmpTotalBytes;
            if (_cursor.isNull(_cursorIndexOfTotalBytes)) {
              _tmpTotalBytes = null;
            } else {
              _tmpTotalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
            }
            final int _tmpQueuePosition;
            _tmpQueuePosition = _cursor.getInt(_cursorIndexOfQueuePosition);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpLastUpdatedAt;
            _tmpLastUpdatedAt = _cursor.getLong(_cursorIndexOfLastUpdatedAt);
            final Long _tmpDownloadStartedAt;
            if (_cursor.isNull(_cursorIndexOfDownloadStartedAt)) {
              _tmpDownloadStartedAt = null;
            } else {
              _tmpDownloadStartedAt = _cursor.getLong(_cursorIndexOfDownloadStartedAt);
            }
            final boolean _tmpIsDownloadOnly;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDownloadOnly);
            _tmpIsDownloadOnly = _tmp != 0;
            final boolean _tmpIsLocalInstall;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_1 != 0;
            _item = new QueuedInstallEntity(_tmpReleaseName,_tmpStatus,_tmpProgress,_tmpDownloadedBytes,_tmpTotalBytes,_tmpQueuePosition,_tmpCreatedAt,_tmpLastUpdatedAt,_tmpDownloadStartedAt,_tmpIsDownloadOnly,_tmpIsLocalInstall);
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
  public Object getAll(final Continuation<? super List<QueuedInstallEntity>> $completion) {
    final String _sql = "SELECT * FROM install_queue ORDER BY queuePosition ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<QueuedInstallEntity>>() {
      @Override
      @NonNull
      public List<QueuedInstallEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "progress");
          final int _cursorIndexOfDownloadedBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadedBytes");
          final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
          final int _cursorIndexOfQueuePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "queuePosition");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfLastUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdatedAt");
          final int _cursorIndexOfDownloadStartedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadStartedAt");
          final int _cursorIndexOfIsDownloadOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "isDownloadOnly");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final List<QueuedInstallEntity> _result = new ArrayList<QueuedInstallEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final QueuedInstallEntity _item;
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final float _tmpProgress;
            _tmpProgress = _cursor.getFloat(_cursorIndexOfProgress);
            final Long _tmpDownloadedBytes;
            if (_cursor.isNull(_cursorIndexOfDownloadedBytes)) {
              _tmpDownloadedBytes = null;
            } else {
              _tmpDownloadedBytes = _cursor.getLong(_cursorIndexOfDownloadedBytes);
            }
            final Long _tmpTotalBytes;
            if (_cursor.isNull(_cursorIndexOfTotalBytes)) {
              _tmpTotalBytes = null;
            } else {
              _tmpTotalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
            }
            final int _tmpQueuePosition;
            _tmpQueuePosition = _cursor.getInt(_cursorIndexOfQueuePosition);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpLastUpdatedAt;
            _tmpLastUpdatedAt = _cursor.getLong(_cursorIndexOfLastUpdatedAt);
            final Long _tmpDownloadStartedAt;
            if (_cursor.isNull(_cursorIndexOfDownloadStartedAt)) {
              _tmpDownloadStartedAt = null;
            } else {
              _tmpDownloadStartedAt = _cursor.getLong(_cursorIndexOfDownloadStartedAt);
            }
            final boolean _tmpIsDownloadOnly;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDownloadOnly);
            _tmpIsDownloadOnly = _tmp != 0;
            final boolean _tmpIsLocalInstall;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_1 != 0;
            _item = new QueuedInstallEntity(_tmpReleaseName,_tmpStatus,_tmpProgress,_tmpDownloadedBytes,_tmpTotalBytes,_tmpQueuePosition,_tmpCreatedAt,_tmpLastUpdatedAt,_tmpDownloadStartedAt,_tmpIsDownloadOnly,_tmpIsLocalInstall);
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
  public Object getByReleaseName(final String releaseName,
      final Continuation<? super QueuedInstallEntity> $completion) {
    final String _sql = "SELECT * FROM install_queue WHERE releaseName = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (releaseName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, releaseName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<QueuedInstallEntity>() {
      @Override
      @Nullable
      public QueuedInstallEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfReleaseName = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseName");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "progress");
          final int _cursorIndexOfDownloadedBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadedBytes");
          final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
          final int _cursorIndexOfQueuePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "queuePosition");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfLastUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdatedAt");
          final int _cursorIndexOfDownloadStartedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadStartedAt");
          final int _cursorIndexOfIsDownloadOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "isDownloadOnly");
          final int _cursorIndexOfIsLocalInstall = CursorUtil.getColumnIndexOrThrow(_cursor, "isLocalInstall");
          final QueuedInstallEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpReleaseName;
            if (_cursor.isNull(_cursorIndexOfReleaseName)) {
              _tmpReleaseName = null;
            } else {
              _tmpReleaseName = _cursor.getString(_cursorIndexOfReleaseName);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final float _tmpProgress;
            _tmpProgress = _cursor.getFloat(_cursorIndexOfProgress);
            final Long _tmpDownloadedBytes;
            if (_cursor.isNull(_cursorIndexOfDownloadedBytes)) {
              _tmpDownloadedBytes = null;
            } else {
              _tmpDownloadedBytes = _cursor.getLong(_cursorIndexOfDownloadedBytes);
            }
            final Long _tmpTotalBytes;
            if (_cursor.isNull(_cursorIndexOfTotalBytes)) {
              _tmpTotalBytes = null;
            } else {
              _tmpTotalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
            }
            final int _tmpQueuePosition;
            _tmpQueuePosition = _cursor.getInt(_cursorIndexOfQueuePosition);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpLastUpdatedAt;
            _tmpLastUpdatedAt = _cursor.getLong(_cursorIndexOfLastUpdatedAt);
            final Long _tmpDownloadStartedAt;
            if (_cursor.isNull(_cursorIndexOfDownloadStartedAt)) {
              _tmpDownloadStartedAt = null;
            } else {
              _tmpDownloadStartedAt = _cursor.getLong(_cursorIndexOfDownloadStartedAt);
            }
            final boolean _tmpIsDownloadOnly;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDownloadOnly);
            _tmpIsDownloadOnly = _tmp != 0;
            final boolean _tmpIsLocalInstall;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLocalInstall);
            _tmpIsLocalInstall = _tmp_1 != 0;
            _result = new QueuedInstallEntity(_tmpReleaseName,_tmpStatus,_tmpProgress,_tmpDownloadedBytes,_tmpTotalBytes,_tmpQueuePosition,_tmpCreatedAt,_tmpLastUpdatedAt,_tmpDownloadStartedAt,_tmpIsDownloadOnly,_tmpIsLocalInstall);
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
  public Object getNextPosition(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COALESCE(MAX(queuePosition), -1) + 1 FROM install_queue";
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
