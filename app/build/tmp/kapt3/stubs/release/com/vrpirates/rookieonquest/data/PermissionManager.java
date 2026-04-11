package com.vrpirates.rookieonquest.data;

/**
 * Permission Manager for handling installation-related permissions.
 *
 * **Responsibilities:**
 * - Check permission states (INSTALL_UNKNOWN_APPS, MANAGE_EXTERNAL_STORAGE, IGNORE_BATTERY_OPTIMIZATIONS)
 * - Cache permission states for 30 seconds to avoid excessive PackageManager calls
 * - Persist permission state to SharedPreferences
 * - Validate saved permission states against actual system permissions
 *
 * **Story:** 1.8 - Permission Flow for Installation
 *
 * **Thread-safety:** All public methods are thread-safe and can be called from any thread.
 *
 * **Testing:** The [PermissionChecker] interface allows injection of mock permission checks
 * for unit testing without Android context.
 *
 * @see com.vrpirates.rookieonquest.ui.RequiredPermission
 * @see PermissionChecker
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u000201B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u0004J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010&\u001a\u00020%J\u0014\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eJ\u001e\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0015H\u0007J\u000e\u0010.\u001a\u00020/2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/vrpirates/rookieonquest/data/PermissionManager;", "", "()V", "PERMISSION_CACHE_DURATION_MS", "", "PREFS_IGNORE_BATTERY_OPTIMIZATIONS_GRANTED", "", "PREFS_INSTALL_UNKNOWN_APPS_GRANTED", "PREFS_MANAGE_EXTERNAL_STORAGE_GRANTED", "PREFS_PERMISSIONS_GRANTED", "PREFS_PERMISSION_CHECK_TIMESTAMP", "TAG", "cacheTimestamp", "cachedPermissionStates", "", "Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher$annotations", "permissionChecker", "Lcom/vrpirates/rookieonquest/data/PermissionManager$PermissionChecker;", "prefs", "Landroid/content/SharedPreferences;", "stateLock", "getLastCheckTimestamp", "getMissingCriticalPermissions", "", "context", "Landroid/content/Context;", "getMissingPermissions", "hasAllRequiredPermissions", "hasCriticalPermissions", "hasIgnoreBatteryOptimizationsPermission", "hasInstallUnknownAppsPermission", "hasManageExternalStoragePermission", "init", "", "invalidateCache", "loadSavedPermissionStates", "savePermissionState", "permission", "granted", "(Lcom/vrpirates/rookieonquest/ui/RequiredPermission;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPermissionChecker", "checker", "validateSavedStates", "Lcom/vrpirates/rookieonquest/data/PermissionManager$ValidationResult;", "PermissionChecker", "ValidationResult", "app_release"})
public final class PermissionManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "PermissionManager";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_PERMISSIONS_GRANTED = "permissions_granted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_INSTALL_UNKNOWN_APPS_GRANTED = "install_unknown_apps_granted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_MANAGE_EXTERNAL_STORAGE_GRANTED = "manage_external_storage_granted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_IGNORE_BATTERY_OPTIMIZATIONS_GRANTED = "ignore_battery_optimizations_granted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_PERMISSION_CHECK_TIMESTAMP = "permission_check_timestamp";
    public static final long PERMISSION_CACHE_DURATION_MS = 30000L;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object stateLock = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.util.Map<com.vrpirates.rookieonquest.ui.RequiredPermission, java.lang.Boolean> cachedPermissionStates;
    @kotlin.jvm.Volatile()
    private static volatile long cacheTimestamp = 0L;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile android.content.SharedPreferences prefs;
    
    /**
     * Default permission checker implementation using Android system APIs.
     */
    @org.jetbrains.annotations.NotNull()
    private static com.vrpirates.rookieonquest.data.PermissionManager.PermissionChecker permissionChecker;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.PermissionManager INSTANCE = null;
    
    private PermissionManager() {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getIoDispatcher$annotations() {
    }
    
    /**
     * Inject a custom [PermissionChecker] for testing purposes.
     *
     * This method replaces the default system permission checker with a mock implementation,
     * allowing unit tests to control permission states without requiring Android runtime.
     *
     * **Note:** This method is annotated with `@VisibleForTesting` and should only be used
     * in test code. Production code should use the default system permission checker.
     *
     * @param checker Custom permission checker implementation
     */
    @androidx.annotation.VisibleForTesting()
    public final void setPermissionChecker(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.data.PermissionManager.PermissionChecker checker) {
    }
    
    /**
     * Initialize PermissionManager with application context.
     * Must be called before any other method.
     *
     * Thread-safe initialization.
     *
     * @param context Application context
     */
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Check if all CRITICAL installation permissions are granted.
     * Critical permissions are those required for installation to succeed:
     * - INSTALL_UNKNOWN_APPS (required for APK installation)
     * - MANAGE_EXTERNAL_STORAGE (required for OBB file movement)
     *
     * IGNORE_BATTERY_OPTIMIZATIONS is NOT included as it's optional/nice-to-have.
     *
     * Uses cached results if available and not stale (within 30 seconds).
     *
     * @param context Application context
     * @return true if all critical permissions are granted, false otherwise
     */
    public final boolean hasCriticalPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Check if all required installation permissions are granted.
     * This includes optional permissions like IGNORE_BATTERY_OPTIMIZATIONS.
     *
     * Uses cached results if available and not stale (within 30 seconds).
     *
     * @param context Application context
     * @return true if all permissions are granted, false otherwise
     */
    public final boolean hasAllRequiredPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Get list of missing (not granted) permissions.
     * Results are cached for 30 seconds to avoid excessive PackageManager calls.
     *
     * Thread-safe implementation to prevent race conditions when multiple
     * threads access cached state simultaneously.
     *
     * @param context Application context
     * @return List of RequiredPermission that are not granted
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> getMissingPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Get list of missing CRITICAL (not granted) permissions.
     * Critical permissions are those required for installation to succeed:
     * - INSTALL_UNKNOWN_APPS (required for APK installation)
     * - MANAGE_EXTERNAL_STORAGE (required for OBB file movement)
     *
     * IGNORE_BATTERY_OPTIMIZATIONS is NOT checked as it's optional.
     *
     * Results are cached for 30 seconds to avoid excessive PackageManager calls.
     *
     * @param context Application context
     * @return List of RequiredPermission that are not granted (only critical ones)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> getMissingCriticalPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Check if INSTALL_UNKNOWN_APPS permission is granted.
     * Does not use cache - always checks current system state.
     *
     * Refactored to use PermissionChecker interface for consistency.
     *
     * @param context Android context
     * @return true if permission is granted, false otherwise
     */
    public final boolean hasInstallUnknownAppsPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Check if MANAGE_EXTERNAL_STORAGE permission is granted.
     * Does not use cache - always checks current system state.
     *
     * Refactored to use PermissionChecker interface for consistency.
     *
     * @param context Android context
     * @return true if permission is granted, false otherwise
     */
    public final boolean hasManageExternalStoragePermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Check if IGNORE_BATTERY_OPTIMIZATIONS permission is granted.
     * Does not use cache - always checks current system state.
     *
     * Refactored to use PermissionChecker interface for consistency.
     *
     * @param context Android context
     * @return true if permission is granted, false otherwise
     */
    public final boolean hasIgnoreBatteryOptimizationsPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Save permission state to SharedPreferences.
     * Should be called after each permission grant/deny.
     *
     * Thread-safe implementation.
     * Use commit() instead of apply() for critical permission state writes.
     * Run commit() on background thread to avoid blocking caller while
     * still ensuring immediate persistence to prevent race conditions.
     * Use single-threaded dispatcher to prevent race conditions when
     * multiple threads call savePermissionState simultaneously. All writes execute sequentially
     * on the same thread, ensuring no concurrent writes to SharedPreferences.
     * Changed to suspend function and use withContext instead of runBlocking
     * to prevent UI thread blocking. This is a CRITICAL fix - runBlocking blocks the calling
     * thread, causing UI stutters and potential ANRs when called from viewModelScope.
     * Clarified that commit() is used for immediate persistence (synchronous disk write).
     * While commit() blocks the current thread, withContext(ioDispatcher) ensures this blocking
     * occurs on a background thread and not the UI thread.
     *
     * @param permission The permission that was granted/denied
     * @param granted true if granted, false if denied
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object savePermissionState(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.RequiredPermission permission, boolean granted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Load saved permission states from SharedPreferences.
     * Returns null if no saved state exists.
     *
     * Thread-safe implementation.
     *
     * @return Map of permission to granted state, or null if not saved
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<com.vrpirates.rookieonquest.ui.RequiredPermission, java.lang.Boolean> loadSavedPermissionStates() {
        return null;
    }
    
    /**
     * Validate saved permission states against actual system permissions.
     * Detects if user revoked permissions in system settings.
     *
     * Refactored to use PermissionChecker interface for consistency
     * and to enable proper unit testing.
     *
     * Enhanced to distinguish between manual grants and revocations.
     * Returns detailed ValidationResult with separate lists for revoked and granted permissions.
     *
     * @param context Application context
     * @return ValidationResult with detailed information about permission state changes
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vrpirates.rookieonquest.data.PermissionManager.ValidationResult validateSavedStates(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Invalidate the permission cache.
     * Forces a fresh permission check on next call to getMissingPermissions().
     * Should be called when permissions might have changed (e.g., returning from settings).
     *
     * Thread-safe implementation.
     * Documented synchronization with MainViewModel.
     *
     * **Cache Synchronization Strategy:**
     * This method clears the internal cache in PermissionManager. MainViewModel has its own
     * synchronization mechanism (permissionCheckMutex) to prevent concurrent permission checks.
     * The two work together:
     * 1. onAppResume() calls invalidateCache() to clear PermissionManager's cached state
     * 2. MainViewModel.permissionCheckMutex prevents race conditions during checkPermissions()
     * 3. This ensures fresh permission state without excessive system calls
     *
     * @see MainViewModel.onAppResume for cache invalidation trigger
     * @see MainViewModel.permissionCheckMutex for concurrent access prevention
     */
    public final void invalidateCache() {
    }
    
    /**
     * Get the timestamp of the last permission check.
     *
     * Thread-safe implementation.
     *
     * @return Timestamp in milliseconds, or 0 if never checked
     */
    public final long getLastCheckTimestamp() {
        return 0L;
    }
    
    /**
     * Permission checker interface for testability.
     *
     * This interface allows dependency injection of permission checking logic,
     * enabling unit tests to mock system permission states without requiring
     * Android context or runtime environment.
     *
     * **Usage in tests:**
     * ```kotlin
     * val mockChecker = object : PermissionChecker {
     *    override fun checkInstallPermission(context: Context) = true
     *    override fun checkStoragePermission(context: Context) = false
     *    override fun checkBatteryPermission(context: Context) = true
     * }
     * PermissionManager.setPermissionChecker(mockChecker)
     * ```
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/vrpirates/rookieonquest/data/PermissionManager$PermissionChecker;", "", "checkBatteryPermission", "", "context", "Landroid/content/Context;", "checkInstallPermission", "checkStoragePermission", "app_release"})
    public static abstract interface PermissionChecker {
        
        /**
         * Check if INSTALL_UNKNOWN_APPS permission is granted.
         * @param context Android context
         * @return true if permission is granted
         */
        public abstract boolean checkInstallPermission(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        /**
         * Check if MANAGE_EXTERNAL_STORAGE permission is granted.
         * @param context Android context
         * @return true if permission is granted
         */
        public abstract boolean checkStoragePermission(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        /**
         * Check if IGNORE_BATTERY_OPTIMIZATIONS permission is granted.
         * @param context Android context
         * @return true if permission is granted
         */
        public abstract boolean checkBatteryPermission(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
    }
    
    /**
     * Result of permission state validation.
     * Provides detailed information about permission state changes.
     *
     * @property isValid true if all saved states match actual states
     * @property revokedPermissions List of permissions that were revoked (granted -> denied)
     * @property grantedPermissions List of permissions that were granted (denied -> granted)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/vrpirates/rookieonquest/data/PermissionManager$ValidationResult;", "", "isValid", "", "revokedPermissions", "", "Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "grantedPermissions", "(ZLjava/util/List;Ljava/util/List;)V", "getGrantedPermissions", "()Ljava/util/List;", "()Z", "getRevokedPermissions", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"})
    public static final class ValidationResult {
        private final boolean isValid = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> revokedPermissions = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> grantedPermissions = null;
        
        public ValidationResult(boolean isValid, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> revokedPermissions, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> grantedPermissions) {
            super();
        }
        
        public final boolean isValid() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> getRevokedPermissions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> getGrantedPermissions() {
            return null;
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.vrpirates.rookieonquest.ui.RequiredPermission> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.data.PermissionManager.ValidationResult copy(boolean isValid, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> revokedPermissions, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> grantedPermissions) {
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