package com.vrpirates.rookieonquest.worker;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 d2\u00020\u0001:\u0001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u0014H\u0002J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020$H\u0002J\u000e\u00100\u001a\u000201H\u0096@\u00a2\u0006\u0002\u00102JX\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&2\u0006\u0010+\u001a\u00020\f2\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020-2\b\b\u0002\u0010;\u001a\u00020-H\u0082@\u00a2\u0006\u0002\u0010<J\b\u0010=\u001a\u00020$H\u0002J&\u0010>\u001a\u0002012\u0006\u0010+\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010AJ$\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0C2\u0006\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\fH\u0082@\u00a2\u0006\u0002\u0010FJ\u000e\u0010G\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u00102J2\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&0I2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0082@\u00a2\u0006\u0002\u0010LJ\u000e\u0010M\u001a\u00020*H\u0096@\u00a2\u0006\u0002\u00102J\"\u0010N\u001a\u0002012\u0006\u0010+\u001a\u00020\f2\n\u0010O\u001a\u00060Pj\u0002`QH\u0082@\u00a2\u0006\u0002\u0010RJ:\u0010S\u001a\u00020&2\u0006\u0010+\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u000e2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&0I2\u0006\u00108\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010VJ\u0018\u0010W\u001a\u00020$2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020XH\u0002J.\u0010Y\u001a\u00020$2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020X2\u0006\u0010Z\u001a\u00020&2\u0006\u00108\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010[J\u001e\u0010\\\u001a\u00020$2\u0006\u0010+\u001a\u00020\f2\u0006\u0010]\u001a\u00020^H\u0082@\u00a2\u0006\u0002\u0010_J\u0012\u0010`\u001a\u00020a*\u00020bH\u0082@\u00a2\u0006\u0002\u0010cR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006e"}, d2 = {"Lcom/vrpirates/rookieonquest/worker/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "cachedConfig", "Lcom/vrpirates/rookieonquest/network/PublicConfig;", "db", "Lcom/vrpirates/rookieonquest/data/AppDatabase;", "decodedPassword", "", "downloadsDir", "Ljava/io/File;", "gameDao", "Lcom/vrpirates/rookieonquest/data/GameDao;", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "notificationChannelCreated", "", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "notificationManager$delegate", "Lkotlin/Lazy;", "okHttpClient", "Lokhttp3/OkHttpClient;", "queuedInstallDao", "Lcom/vrpirates/rookieonquest/data/QueuedInstallDao;", "service", "Lcom/vrpirates/rookieonquest/network/VrpService;", "kotlin.jvm.PlatformType", "tempInstallRoot", "checkAvailableSpace", "", "requiredBytes", "", "hasUnknownSizes", "checkExternalStorage", "createForegroundInfo", "Landroidx/work/ForegroundInfo;", "releaseName", "progress", "", "indeterminate", "createNotificationChannel", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadSegment", "segUrl", "localFile", "existingSize", "totalBytesDownloaded", "totalBytes", "segmentIndex", "totalSegments", "retryCount", "(Ljava/lang/String;Ljava/io/File;JJJLjava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureNotificationChannelCreated", "executeDownload", "isDownloadOnly", "keepApk", "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllFilesFromDir", "", "baseUrl", "prefix", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchConfig", "fetchRemoteSegments", "", "dirUrl", "packageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "handleFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncRoomDbWithFileSystem", "gameTempDir", "remoteSegments", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNotificationProgress", "", "updateProgress", "downloadedBytes", "(Ljava/lang/String;FJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStatus", "status", "Lcom/vrpirates/rookieonquest/data/InstallStatus;", "(Ljava/lang/String;Lcom/vrpirates/rookieonquest/data/InstallStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", "Lokhttp3/Response;", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"})
public final class DownloadWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DownloadWorker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_RELEASE_NAME = "release_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_IS_DOWNLOAD_ONLY = "is_download_only";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_KEEP_APK = "keep_apk";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PROGRESS = "progress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DOWNLOADED_BYTES = "downloaded_bytes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TOTAL_BYTES = "total_bytes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_STATUS = "status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "download_progress";
    public static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    private final com.vrpirates.rookieonquest.data.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrpirates.rookieonquest.data.QueuedInstallDao queuedInstallDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrpirates.rookieonquest.data.GameDao gameDao = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient okHttpClient = null;
    private final com.vrpirates.rookieonquest.network.VrpService service = null;
    @org.jetbrains.annotations.NotNull()
    private final java.io.File tempInstallRoot = null;
    @org.jetbrains.annotations.NotNull()
    private final java.io.File downloadsDir = null;
    @org.jetbrains.annotations.Nullable()
    private com.vrpirates.rookieonquest.network.PublicConfig cachedConfig;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String decodedPassword;
    @org.jetbrains.annotations.Nullable()
    private androidx.core.app.NotificationCompat.Builder notificationBuilder;
    private boolean notificationChannelCreated = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy notificationManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.worker.DownloadWorker.Companion Companion = null;
    
    public DownloadWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> $completion) {
        return null;
    }
    
    private final java.lang.Object executeDownload(java.lang.String releaseName, boolean isDownloadOnly, boolean keepApk, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> $completion) {
        return null;
    }
    
    /**
     * Synchronizes Room DB downloadedBytes with actual file system state.
     * File system is the source of truth - if DB and files disagree, DB is corrected.
     *
     * This is critical for resume reliability (AC 4): partial files may have been
     * written but the DB update may not have persisted (e.g., process death).
     *
     * @return Total bytes downloaded across all segments (from file system)
     */
    private final java.lang.Object syncRoomDbWithFileSystem(java.lang.String releaseName, java.io.File gameTempDir, java.util.Map<java.lang.String, java.lang.Long> remoteSegments, long totalBytes, kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    private final java.lang.Object downloadSegment(java.lang.String segUrl, java.io.File localFile, long existingSize, long totalBytesDownloaded, long totalBytes, java.lang.String releaseName, int segmentIndex, int totalSegments, int retryCount, kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    /**
     * Fetches remote segment information from the mirror directory.
     *
     * SHARED CODE: Uses DownloadUtils for common operations:
     * - DownloadUtils.HREF_REGEX, shouldSkipEntry(), isDownloadableFile()
     * - DownloadUtils.headRequestSemaphore for rate limiting
     *
     * INTENTIONALLY SEPARATE from MainRepository.getGameRemoteInfo() because:
     * - DownloadWorker runs in WorkManager background context with retry semantics
     * - MainRepository runs in UI coroutine context with additional metadata fetching
     * - Error handling differs (Worker retries, Repository propagates to UI)
     *
     * If modifying this method, also review MainRepository.getGameRemoteInfo() for consistency.
     */
    private final java.lang.Object fetchRemoteSegments(java.lang.String dirUrl, java.lang.String packageName, java.lang.String releaseName, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.Long>> $completion) {
        return null;
    }
    
    private final java.lang.Object fetchAllFilesFromDir(java.lang.String baseUrl, java.lang.String prefix, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    private final java.lang.Object fetchConfig(kotlin.coroutines.Continuation<? super com.vrpirates.rookieonquest.network.PublicConfig> $completion) {
        return null;
    }
    
    private final void checkAvailableSpace(long requiredBytes, boolean hasUnknownSizes, boolean checkExternalStorage) {
    }
    
    private final java.lang.Object updateStatus(java.lang.String releaseName, com.vrpirates.rookieonquest.data.InstallStatus status, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object updateProgress(java.lang.String releaseName, float progress, long downloadedBytes, long totalBytes, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object handleFailure(java.lang.String releaseName, java.lang.Exception e, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getForegroundInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ForegroundInfo> $completion) {
        return null;
    }
    
    /**
     * Creates ForegroundInfo for the WorkManager notification.
     *
     * UX NOTE: Initial notification shows 0% determinate progress (not indeterminate)
     * to immediately convey that a download is starting. Indeterminate mode is only
     * used during brief setup phases. Once downloading begins, real progress is shown.
     *
     * @param releaseName Game name for notification text
     * @param progress Current progress percentage (0-100)
     * @param indeterminate If true, shows spinner instead of progress bar. Default false
     *       to show 0% progress immediately when download starts.
     */
    private final androidx.work.ForegroundInfo createForegroundInfo(java.lang.String releaseName, int progress, boolean indeterminate) {
        return null;
    }
    
    private final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    /**
     * Updates the foreground notification with actual progress percentage.
     * Called from the download progress callback for real-time updates.
     * Reuses NotificationCompat.Builder instance to reduce GC pressure.
     */
    private final void updateNotificationProgress(java.lang.String releaseName, float progress) {
    }
    
    /**
     * Ensures notification channel is created exactly once per Worker lifecycle.
     * Optimization: Prevents redundant NotificationManager calls on every progress update.
     */
    private final void ensureNotificationChannelCreated() {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final java.lang.Object await(okhttp3.Call $this$await, kotlin.coroutines.Continuation<? super okhttp3.Response> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vrpirates/rookieonquest/worker/DownloadWorker$Companion;", "", "()V", "KEY_DOWNLOADED_BYTES", "", "KEY_IS_DOWNLOAD_ONLY", "KEY_KEEP_APK", "KEY_PROGRESS", "KEY_RELEASE_NAME", "KEY_STATUS", "KEY_TOTAL_BYTES", "NOTIFICATION_CHANNEL_ID", "NOTIFICATION_ID", "", "TAG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}