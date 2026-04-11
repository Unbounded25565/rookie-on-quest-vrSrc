package com.vrpirates.rookieonquest.ui;

/**
 * Required permissions for game installation and management.
 *
 * **Note:** [MANAGE_EXTERNAL_STORAGE] represents storage access permission across Android versions:
 * - Android 11+ (API 30+): Maps to `Manifest.permission.MANAGE_EXTERNAL_STORAGE` system permission
 * - Android 10 (API 29): Maps to `WRITE_EXTERNAL_STORAGE` and `READ_EXTERNAL_STORAGE` system permissions
 *
 * This abstraction allows the permission system to work consistently across Android versions
 * while handling the underlying implementation differences in [PermissionManager].
 *
 * @see PermissionManager.checkStoragePermission
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "", "(Ljava/lang/String;I)V", "INSTALL_UNKNOWN_APPS", "MANAGE_EXTERNAL_STORAGE", "IGNORE_BATTERY_OPTIMIZATIONS", "app_release"})
public enum RequiredPermission {
    /*public static final*/ INSTALL_UNKNOWN_APPS /* = new INSTALL_UNKNOWN_APPS() */,
    /*public static final*/ MANAGE_EXTERNAL_STORAGE /* = new MANAGE_EXTERNAL_STORAGE() */,
    /*public static final*/ IGNORE_BATTERY_OPTIMIZATIONS /* = new IGNORE_BATTERY_OPTIMIZATIONS() */;
    
    RequiredPermission() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.vrpirates.rookieonquest.ui.RequiredPermission> getEntries() {
        return null;
    }
}