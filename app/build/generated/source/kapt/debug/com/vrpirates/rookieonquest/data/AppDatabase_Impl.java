package com.vrpirates.rookieonquest.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile GameDao _gameDao;

  private volatile QueuedInstallDao _queuedInstallDao;

  private volatile InstallHistoryDao _installHistoryDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(6) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `games` (`releaseName` TEXT NOT NULL, `gameName` TEXT NOT NULL, `packageName` TEXT NOT NULL, `versionCode` TEXT NOT NULL, `sizeBytes` INTEGER, `description` TEXT, `screenshotUrlsJson` TEXT, `lastUpdated` INTEGER NOT NULL, `popularity` INTEGER NOT NULL, `isFavorite` INTEGER NOT NULL, PRIMARY KEY(`releaseName`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `install_queue` (`releaseName` TEXT NOT NULL, `status` TEXT NOT NULL, `progress` REAL NOT NULL, `downloadedBytes` INTEGER, `totalBytes` INTEGER, `queuePosition` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `lastUpdatedAt` INTEGER NOT NULL, `downloadStartedAt` INTEGER, `isDownloadOnly` INTEGER NOT NULL, `isLocalInstall` INTEGER NOT NULL, PRIMARY KEY(`releaseName`))");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_install_queue_queuePosition` ON `install_queue` (`queuePosition`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_install_queue_status_queuePosition` ON `install_queue` (`status`, `queuePosition`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `install_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `releaseName` TEXT NOT NULL, `gameName` TEXT NOT NULL, `packageName` TEXT NOT NULL, `installedAt` INTEGER NOT NULL, `downloadDurationMs` INTEGER NOT NULL, `fileSizeBytes` INTEGER NOT NULL, `status` TEXT NOT NULL, `errorMessage` TEXT, `createdAt` INTEGER NOT NULL, `isLocalInstall` INTEGER NOT NULL, FOREIGN KEY(`releaseName`) REFERENCES `games`(`releaseName`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_install_history_releaseName` ON `install_history` (`releaseName`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_install_history_status` ON `install_history` (`status`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_install_history_installedAt` ON `install_history` (`installedAt`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_install_history_releaseName_createdAt` ON `install_history` (`releaseName`, `createdAt`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '34c2ee6ee2aad774886e145c6f722ddf')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `games`");
        db.execSQL("DROP TABLE IF EXISTS `install_queue`");
        db.execSQL("DROP TABLE IF EXISTS `install_history`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsGames = new HashMap<String, TableInfo.Column>(10);
        _columnsGames.put("releaseName", new TableInfo.Column("releaseName", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("gameName", new TableInfo.Column("gameName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("packageName", new TableInfo.Column("packageName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("versionCode", new TableInfo.Column("versionCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("sizeBytes", new TableInfo.Column("sizeBytes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("screenshotUrlsJson", new TableInfo.Column("screenshotUrlsJson", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("lastUpdated", new TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("popularity", new TableInfo.Column("popularity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGames = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGames = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGames = new TableInfo("games", _columnsGames, _foreignKeysGames, _indicesGames);
        final TableInfo _existingGames = TableInfo.read(db, "games");
        if (!_infoGames.equals(_existingGames)) {
          return new RoomOpenHelper.ValidationResult(false, "games(com.vrpirates.rookieonquest.data.GameEntity).\n"
                  + " Expected:\n" + _infoGames + "\n"
                  + " Found:\n" + _existingGames);
        }
        final HashMap<String, TableInfo.Column> _columnsInstallQueue = new HashMap<String, TableInfo.Column>(11);
        _columnsInstallQueue.put("releaseName", new TableInfo.Column("releaseName", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("progress", new TableInfo.Column("progress", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("downloadedBytes", new TableInfo.Column("downloadedBytes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("totalBytes", new TableInfo.Column("totalBytes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("queuePosition", new TableInfo.Column("queuePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("lastUpdatedAt", new TableInfo.Column("lastUpdatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("downloadStartedAt", new TableInfo.Column("downloadStartedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("isDownloadOnly", new TableInfo.Column("isDownloadOnly", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallQueue.put("isLocalInstall", new TableInfo.Column("isLocalInstall", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInstallQueue = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInstallQueue = new HashSet<TableInfo.Index>(2);
        _indicesInstallQueue.add(new TableInfo.Index("index_install_queue_queuePosition", false, Arrays.asList("queuePosition"), Arrays.asList("ASC")));
        _indicesInstallQueue.add(new TableInfo.Index("index_install_queue_status_queuePosition", false, Arrays.asList("status", "queuePosition"), Arrays.asList("ASC", "ASC")));
        final TableInfo _infoInstallQueue = new TableInfo("install_queue", _columnsInstallQueue, _foreignKeysInstallQueue, _indicesInstallQueue);
        final TableInfo _existingInstallQueue = TableInfo.read(db, "install_queue");
        if (!_infoInstallQueue.equals(_existingInstallQueue)) {
          return new RoomOpenHelper.ValidationResult(false, "install_queue(com.vrpirates.rookieonquest.data.QueuedInstallEntity).\n"
                  + " Expected:\n" + _infoInstallQueue + "\n"
                  + " Found:\n" + _existingInstallQueue);
        }
        final HashMap<String, TableInfo.Column> _columnsInstallHistory = new HashMap<String, TableInfo.Column>(11);
        _columnsInstallHistory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("releaseName", new TableInfo.Column("releaseName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("gameName", new TableInfo.Column("gameName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("packageName", new TableInfo.Column("packageName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("installedAt", new TableInfo.Column("installedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("downloadDurationMs", new TableInfo.Column("downloadDurationMs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("fileSizeBytes", new TableInfo.Column("fileSizeBytes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("errorMessage", new TableInfo.Column("errorMessage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInstallHistory.put("isLocalInstall", new TableInfo.Column("isLocalInstall", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInstallHistory = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysInstallHistory.add(new TableInfo.ForeignKey("games", "CASCADE", "NO ACTION", Arrays.asList("releaseName"), Arrays.asList("releaseName")));
        final HashSet<TableInfo.Index> _indicesInstallHistory = new HashSet<TableInfo.Index>(4);
        _indicesInstallHistory.add(new TableInfo.Index("index_install_history_releaseName", false, Arrays.asList("releaseName"), Arrays.asList("ASC")));
        _indicesInstallHistory.add(new TableInfo.Index("index_install_history_status", false, Arrays.asList("status"), Arrays.asList("ASC")));
        _indicesInstallHistory.add(new TableInfo.Index("index_install_history_installedAt", false, Arrays.asList("installedAt"), Arrays.asList("ASC")));
        _indicesInstallHistory.add(new TableInfo.Index("index_install_history_releaseName_createdAt", true, Arrays.asList("releaseName", "createdAt"), Arrays.asList("ASC", "ASC")));
        final TableInfo _infoInstallHistory = new TableInfo("install_history", _columnsInstallHistory, _foreignKeysInstallHistory, _indicesInstallHistory);
        final TableInfo _existingInstallHistory = TableInfo.read(db, "install_history");
        if (!_infoInstallHistory.equals(_existingInstallHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "install_history(com.vrpirates.rookieonquest.data.InstallHistoryEntity).\n"
                  + " Expected:\n" + _infoInstallHistory + "\n"
                  + " Found:\n" + _existingInstallHistory);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "34c2ee6ee2aad774886e145c6f722ddf", "a50c150b39754383762d3c7d41112a57");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "games","install_queue","install_history");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `games`");
      _db.execSQL("DELETE FROM `install_queue`");
      _db.execSQL("DELETE FROM `install_history`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(GameDao.class, GameDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(QueuedInstallDao.class, QueuedInstallDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(InstallHistoryDao.class, InstallHistoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public GameDao gameDao() {
    if (_gameDao != null) {
      return _gameDao;
    } else {
      synchronized(this) {
        if(_gameDao == null) {
          _gameDao = new GameDao_Impl(this);
        }
        return _gameDao;
      }
    }
  }

  @Override
  public QueuedInstallDao queuedInstallDao() {
    if (_queuedInstallDao != null) {
      return _queuedInstallDao;
    } else {
      synchronized(this) {
        if(_queuedInstallDao == null) {
          _queuedInstallDao = new QueuedInstallDao_Impl(this);
        }
        return _queuedInstallDao;
      }
    }
  }

  @Override
  public InstallHistoryDao installHistoryDao() {
    if (_installHistoryDao != null) {
      return _installHistoryDao;
    } else {
      synchronized(this) {
        if(_installHistoryDao == null) {
          _installHistoryDao = new InstallHistoryDao_Impl(this);
        }
        return _installHistoryDao;
      }
    }
  }
}
