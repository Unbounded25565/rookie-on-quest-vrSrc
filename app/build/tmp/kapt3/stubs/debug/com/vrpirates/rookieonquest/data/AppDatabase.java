package com.vrpirates.rookieonquest.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/vrpirates/rookieonquest/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "gameDao", "Lcom/vrpirates/rookieonquest/data/GameDao;", "installHistoryDao", "Lcom/vrpirates/rookieonquest/data/InstallHistoryDao;", "queuedInstallDao", "Lcom/vrpirates/rookieonquest/data/QueuedInstallDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.vrpirates.rookieonquest.data.GameEntity.class, com.vrpirates.rookieonquest.data.QueuedInstallEntity.class, com.vrpirates.rookieonquest.data.InstallHistoryEntity.class}, version = 6, exportSchema = false)
@androidx.room.TypeConverters(value = {com.vrpirates.rookieonquest.data.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "AppDatabase";
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.vrpirates.rookieonquest.data.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_5_6 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    
    /**
     * Direct migration from v2 to v4 for multi-version jumps.
     * Creates the complete install_queue table schema in one step,
     * avoiding unnecessary ALTER TABLE operations.
     */
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_2_4 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_4_5 = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrpirates.rookieonquest.data.GameDao gameDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrpirates.rookieonquest.data.QueuedInstallDao queuedInstallDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrpirates.rookieonquest.data.InstallHistoryDao installHistoryDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/vrpirates/rookieonquest/data/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/vrpirates/rookieonquest/data/AppDatabase;", "MIGRATION_2_3", "Landroidx/room/migration/Migration;", "getMIGRATION_2_3$app_debug", "()Landroidx/room/migration/Migration;", "MIGRATION_2_4", "getMIGRATION_2_4$app_debug", "MIGRATION_3_4", "getMIGRATION_3_4$app_debug", "MIGRATION_4_5", "getMIGRATION_4_5$app_debug", "MIGRATION_5_6", "getMIGRATION_5_6$app_debug", "TAG", "", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_5_6$app_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_2_3$app_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_3_4$app_debug() {
            return null;
        }
        
        /**
         * Direct migration from v2 to v4 for multi-version jumps.
         * Creates the complete install_queue table schema in one step,
         * avoiding unnecessary ALTER TABLE operations.
         */
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_2_4$app_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_4_5$app_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.data.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}