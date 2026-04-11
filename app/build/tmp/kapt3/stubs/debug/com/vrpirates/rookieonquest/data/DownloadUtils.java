package com.vrpirates.rookieonquest.data;

/**
 * Shared download utilities used by DownloadWorker and MainRepository.
 *
 * This object centralizes common download operations to reduce code duplication.
 * Provides shared buffer size, directory parsing utilities, and HTTP response handling.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u00a3\u0001\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0&2[\u0010\'\u001aW\b\u0001\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110,\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0086@\u00a2\u0006\u0002\u00100J\u000e\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0017J\u000e\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0004J\u000e\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00068"}, d2 = {"Lcom/vrpirates/rookieonquest/data/DownloadUtils;", "", "()V", "DOWNLOAD_BUFFER_SIZE", "", "HREF_REGEX", "Lkotlin/text/Regex;", "getHREF_REGEX", "()Lkotlin/text/Regex;", "MAX_CONCURRENT_HEAD_REQUESTS", "STORAGE_MULTIPLIER_7Z_KEEP_APK", "", "STORAGE_MULTIPLIER_7Z_NO_KEEP", "STORAGE_MULTIPLIER_NON_ARCHIVE", "STORAGE_MULTIPLIER_OBB", "headRequestSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "getHeadRequestSemaphore", "()Lkotlinx/coroutines/sync/Semaphore;", "calculateRequiredObbStorage", "", "remoteSegments", "", "", "packageName", "calculateRequiredStorage", "totalBytes", "isSevenZArchive", "", "keepApkOrDownloadOnly", "downloadWithProgress", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "initialDownloaded", "throttleMs", "isCancelled", "Lkotlin/Function0;", "onProgress", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "downloadedBytes", "", "progress", "Lkotlin/coroutines/Continuation;", "", "(Ljava/io/InputStream;Ljava/io/OutputStream;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDownloadableFile", "filename", "isRangeNotSatisfiable", "responseCode", "isResumeResponse", "shouldSkipEntry", "entry", "app_debug"})
public final class DownloadUtils {
    
    /**
     * Standard buffer size for downloads (64KB).
     * Optimized for network throughput while maintaining reasonable memory usage.
     */
    public static final int DOWNLOAD_BUFFER_SIZE = 65536;
    
    /**
     * Maximum concurrent HEAD requests for file size verification.
     * Limits parallel connections to prevent socket exhaustion on mirror servers.
     * Value of 5 balances speed and server load.
     */
    public static final int MAX_CONCURRENT_HEAD_REQUESTS = 5;
    
    /**
     * Semaphore for limiting concurrent HEAD requests.
     * Shared across DownloadWorker and MainRepository for consistent rate limiting.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Semaphore headRequestSemaphore = null;
    
    /**
     * Regex pattern for extracting href links from HTML directory listings.
     * Used for parsing VRPirates mirror directory contents.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex HREF_REGEX = null;
    
    /**
     * Storage space multiplier for 7z archives when keeping APK/download-only.
     * Multi-part 7z archives need ~3.5x space:
     *  - Original archive parts (1x)
     *  - combined.7z during merge (1x for multi-part)
     *  - Extracted content (~1.2x, varies by compression)
     *  - APK copy to externalFilesDir (~0.1-0.3x)
     * Provides a safer buffer than 3.2x for large games.
     */
    public static final double STORAGE_MULTIPLIER_7Z_KEEP_APK = 3.5;
    
    /**
     * Storage space multiplier for 7z archives without keeping APK.
     * Multi-part 7z archives need ~2.5x space:
     *  - Original archive parts (1x)
     *  - combined.7z during merge (1x for multi-part)
     *  - Extracted content (~1.2x, varies by compression)
     * Provides a safer buffer than 2.2x for large games.
     */
    public static final double STORAGE_MULTIPLIER_7Z_NO_KEEP = 2.5;
    
    /**
     * Storage space multiplier for non-archived files (direct APK/OBB).
     * Small buffer (1.1x) for file system overhead and temp files.
     */
    public static final double STORAGE_MULTIPLIER_NON_ARCHIVE = 1.1;
    
    /**
     * Storage space multiplier for OBB files during installation (1.0x).
     * OBB files are moved or copied to /Android/obb, requiring their own space
     * on the external storage partition.
     */
    public static final double STORAGE_MULTIPLIER_OBB = 1.0;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.DownloadUtils INSTANCE = null;
    
    private DownloadUtils() {
        super();
    }
    
    /**
     * Semaphore for limiting concurrent HEAD requests.
     * Shared across DownloadWorker and MainRepository for consistent rate limiting.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.sync.Semaphore getHeadRequestSemaphore() {
        return null;
    }
    
    /**
     * Regex pattern for extracting href links from HTML directory listings.
     * Used for parsing VRPirates mirror directory contents.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.text.Regex getHREF_REGEX() {
        return null;
    }
    
    /**
     * Checks if a filename represents a downloadable game file.
     * @param filename The filename to check (case-insensitive)
     * @return true if the file is an APK, OBB, or 7z archive
     */
    public final boolean isDownloadableFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return false;
    }
    
    /**
     * Checks if an entry should be skipped when parsing directory listings.
     * @param entry The directory entry to check
     * @return true if the entry should be skipped
     */
    public final boolean shouldSkipEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String entry) {
        return false;
    }
    
    /**
     * Determines if an HTTP response indicates a resumable download.
     * @param responseCode The HTTP response code
     * @return true if 206 (Partial Content), false otherwise
     */
    public final boolean isResumeResponse(int responseCode) {
        return false;
    }
    
    /**
     * Determines if the response indicates range not satisfiable (already complete).
     * @param responseCode The HTTP response code
     * @return true if 416 (Range Not Satisfiable)
     */
    public final boolean isRangeNotSatisfiable(int responseCode) {
        return false;
    }
    
    /**
     * Calculates the estimated storage space required for OBB files.
     * @param remoteSegments Map of remote files and their sizes
     * @param packageName The package name to identify OBB folder
     * @return Estimated bytes required for OBB installation
     */
    public final long calculateRequiredObbStorage(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Long> remoteSegments, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
        return 0L;
    }
    
    /**
     * Calculates the estimated storage space required for a download.
     *
     * @param totalBytes Total bytes to download
     * @param isSevenZArchive Whether the download contains 7z archives
     * @param keepApkOrDownloadOnly Whether APK should be kept or download-only mode
     * @return Estimated bytes required including extraction overhead
     */
    public final long calculateRequiredStorage(long totalBytes, boolean isSevenZArchive, boolean keepApkOrDownloadOnly) {
        return 0L;
    }
    
    /**
     * Downloads a file segment with progress reporting and cancellation support.
     *
     * This shared implementation is used by both DownloadWorker and MainRepository
     * to ensure consistent download behavior and reduce code duplication.
     *
     * Note: For optimal performance, the inputStream is automatically wrapped in
     * BufferedInputStream if not already buffered. This reduces system call overhead.
     *
     * @param inputStream The input stream from the HTTP response body
     * @param outputStream The output stream to write to (file)
     * @param initialDownloaded Bytes already downloaded before this call (for resume)
     * @param totalBytes Total expected bytes for progress calculation
     * @param throttleMs Minimum milliseconds between progress callbacks
     * @param isCancelled Lambda to check if download should be cancelled
     * @param onProgress Callback for progress updates (downloadedBytes, totalBytes, progress 0.0-1.0)
     * @return Total bytes downloaded (including initial)
     * @throws kotlinx.coroutines.CancellationException if cancelled
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object downloadWithProgress(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream outputStream, long initialDownloaded, long totalBytes, long throttleMs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> isCancelled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Long, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onProgress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
}