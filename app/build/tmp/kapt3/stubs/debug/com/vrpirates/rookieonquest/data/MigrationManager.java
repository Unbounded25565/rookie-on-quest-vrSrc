package com.vrpirates.rookieonquest.data;

/**
 * Manages migration from v2.4.0 in-memory queue to v2.5.0 Room-backed queue
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/vrpirates/rookieonquest/data/MigrationManager;", "", "()V", "LEGACY_QUEUE_KEY", "", "MIGRATION_COMPLETE_KEY", "TAG", "convertLegacyStatus", "Lcom/vrpirates/rookieonquest/data/InstallStatus;", "legacyStatus", "convertLegacyTask", "Lcom/vrpirates/rookieonquest/data/QueuedInstallEntity;", "legacyTask", "Lcom/vrpirates/rookieonquest/data/MigrationManager$LegacyInstallTaskState;", "fallbackPosition", "", "markMigrationComplete", "", "sharedPrefs", "Landroid/content/SharedPreferences;", "migrateLegacyQueue", "context", "Landroid/content/Context;", "database", "Lcom/vrpirates/rookieonquest/data/AppDatabase;", "(Landroid/content/Context;Lcom/vrpirates/rookieonquest/data/AppDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needsMigration", "", "resetMigration", "sanitizeJsonForLog", "json", "LegacyInstallTaskState", "app_debug"})
public final class MigrationManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MigrationManager";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LEGACY_QUEUE_KEY = "queue_snapshot_v2_4_0";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MIGRATION_COMPLETE_KEY = "migration_v2_4_0_complete";
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.MigrationManager INSTANCE = null;
    
    private MigrationManager() {
        super();
    }
    
    /**
     * Checks if migration from v2.4.0 is needed
     */
    public final boolean needsMigration(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Performs the migration from legacy v2.4.0 queue to Room database
     *
     * @param context Application context
     * @param database AppDatabase instance
     * @return Number of successfully migrated items, or -1 on failure
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object migrateLegacyQueue(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.data.AppDatabase database, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    /**
     * Converts a legacy v2.4.0 InstallTaskState to v2.5.0 QueuedInstallEntity
     *
     * @throws IllegalArgumentException if required fields are missing or invalid
     */
    private final com.vrpirates.rookieonquest.data.QueuedInstallEntity convertLegacyTask(com.vrpirates.rookieonquest.data.MigrationManager.LegacyInstallTaskState legacyTask, int fallbackPosition) {
        return null;
    }
    
    /**
     * Converts legacy v2.4.0 InstallTaskStatus enum to v2.5.0 InstallStatus enum
     *
     * v2.4.0 Status: QUEUED, DOWNLOADING, EXTRACTING, INSTALLING, PAUSED, COMPLETED, FAILED
     * v2.5.0 Status: QUEUED, DOWNLOADING, EXTRACTING, COPYING_OBB, INSTALLING, PAUSED, COMPLETED, FAILED
     *
     * DESIGN DECISION: Legacy INSTALLING → INSTALLING (not EXTRACTING)
     * ================================================================
     * v2.4.0's INSTALLING phase combined both OBB copy + APK install into one state.
     * v2.5.0 splits this into COPYING_OBB → INSTALLING for better UI feedback.
     *
     * We map INSTALLING → INSTALLING (not EXTRACTING) because:
     * 1. Preserves progress: If task was genuinely installing, restarting at extraction loses work
     * 2. Minimal impact: Worst case is user sees "Installing..." instead of "Copying OBB..." briefly
     * 3. Queue processor handles state correctly regardless of migrated status
     *
     * Alternative considered: Map to EXTRACTING (safer, forces re-extraction)
     * - Rejected: Would cause re-download/re-extraction of potentially large games
     *
     * Post-migration, the queue processor will:
     * - If files exist: Continue from INSTALLING phase normally
     * - If files missing: Fail and retry from beginning (correct behavior)
     */
    private final com.vrpirates.rookieonquest.data.InstallStatus convertLegacyStatus(java.lang.String legacyStatus) {
        return null;
    }
    
    /**
     * Marks the migration as complete in SharedPreferences and removes legacy data
     */
    private final void markMigrationComplete(android.content.SharedPreferences sharedPrefs) {
    }
    
    /**
     * Resets migration state - ONLY for debugging/testing
     */
    public final void resetMigration(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Sanitizes JSON for logging by keeping structure but truncating long string values
     * to avoid leaking potentially sensitive game names or other PII.
     *
     * Uses a more robust approach than simple regex to handle:
     * - Formatted JSON with whitespace and newlines
     * - Escaped quotes within strings
     * - Various JSON structures
     */
    private final java.lang.String sanitizeJsonForLog(java.lang.String json) {
        return null;
    }
    
    /**
     * Data class representing the legacy v2.4.0 InstallTaskState structure
     * Used for JSON deserialization from SharedPreferences
     *
     * IMPORTANT: All fields are nullable to handle corrupted/partial JSON gracefully.
     * Gson can set non-nullable fields to null on malformed JSON, causing crashes.
     * Validation happens in convertLegacyTask() where required fields are checked.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u00101\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u00b6\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0013H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\f\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b*\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a\u00a8\u0006@"}, d2 = {"Lcom/vrpirates/rookieonquest/data/MigrationManager$LegacyInstallTaskState;", "", "releaseName", "", "gameName", "packageName", "status", "progress", "", "message", "currentSize", "totalSize", "isDownloadOnly", "", "totalBytes", "", "downloadedBytes", "error", "queuePosition", "", "createdAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentSize", "()Ljava/lang/String;", "getDownloadedBytes", "getError", "getGameName", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getPackageName", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getQueuePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReleaseName", "getStatus", "getTotalBytes", "getTotalSize", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/vrpirates/rookieonquest/data/MigrationManager$LegacyInstallTaskState;", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class LegacyInstallTaskState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String releaseName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String gameName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String packageName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String status = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Float progress = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currentSize = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String totalSize = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isDownloadOnly = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long totalBytes = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long downloadedBytes = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer queuePosition = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long createdAt = null;
        
        public LegacyInstallTaskState(@org.jetbrains.annotations.Nullable()
        java.lang.String releaseName, @org.jetbrains.annotations.Nullable()
        java.lang.String gameName, @org.jetbrains.annotations.Nullable()
        java.lang.String packageName, @org.jetbrains.annotations.Nullable()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        java.lang.Float progress, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String currentSize, @org.jetbrains.annotations.Nullable()
        java.lang.String totalSize, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isDownloadOnly, @org.jetbrains.annotations.Nullable()
        java.lang.Long totalBytes, @org.jetbrains.annotations.Nullable()
        java.lang.Long downloadedBytes, @org.jetbrains.annotations.Nullable()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        java.lang.Integer queuePosition, @org.jetbrains.annotations.Nullable()
        java.lang.Long createdAt) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReleaseName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGameName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrentSize() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTotalSize() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isDownloadOnly() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getTotalBytes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDownloadedBytes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQueuePosition() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getCreatedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.data.MigrationManager.LegacyInstallTaskState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String releaseName, @org.jetbrains.annotations.Nullable()
        java.lang.String gameName, @org.jetbrains.annotations.Nullable()
        java.lang.String packageName, @org.jetbrains.annotations.Nullable()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        java.lang.Float progress, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String currentSize, @org.jetbrains.annotations.Nullable()
        java.lang.String totalSize, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isDownloadOnly, @org.jetbrains.annotations.Nullable()
        java.lang.Long totalBytes, @org.jetbrains.annotations.Nullable()
        java.lang.Long downloadedBytes, @org.jetbrains.annotations.Nullable()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        java.lang.Integer queuePosition, @org.jetbrains.annotations.Nullable()
        java.lang.Long createdAt) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}