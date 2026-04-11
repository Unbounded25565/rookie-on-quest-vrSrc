package com.vrpirates.rookieonquest.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a4\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u00a8\u0006\u0014"}, d2 = {"PermissionRequestDialog", "", "permission", "Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "onGrant", "Lkotlin/Function0;", "onCancel", "onDismiss", "PermissionRevokedDialog", "permissions", "", "onOpenSettings", "getPermissionDescription", "", "getPermissionIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getPermissionIconDescription", "getPermissionName", "getPermissionTitle", "getPermissionWhyNeeded", "app_debug"})
public final class PermissionRequestDialogKt {
    
    /**
     * Permission Request Dialog
     *
     * Displays a dialog requesting a specific permission from the user.
     * Shows clear explanation of why the permission is needed and provides
     * options to grant or cancel the request.
     *
     * @param permission The permission being requested
     * @param onGrant Callback when user clicks "Grant Permission"
     * @param onCancel Callback when user clicks "Cancel"
     * @param onDismiss Callback when dialog is dismissed (e.g., back button)
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void PermissionRequestDialog(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.RequiredPermission permission, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onGrant, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    /**
     * Get the title for a permission request dialog.
     */
    @androidx.compose.runtime.Composable()
    private static final java.lang.String getPermissionTitle(com.vrpirates.rookieonquest.ui.RequiredPermission permission) {
        return null;
    }
    
    /**
     * Get the description for a permission request dialog.
     */
    @androidx.compose.runtime.Composable()
    private static final java.lang.String getPermissionDescription(com.vrpirates.rookieonquest.ui.RequiredPermission permission) {
        return null;
    }
    
    /**
     * Get the "why needed" explanation for a permission.
     */
    @androidx.compose.runtime.Composable()
    private static final java.lang.String getPermissionWhyNeeded(com.vrpirates.rookieonquest.ui.RequiredPermission permission) {
        return null;
    }
    
    /**
     * Permission Revocation Dialog
     *
     * Shown when the app detects that a previously granted permission
     * has been revoked by the user in system settings.
     *
     * Updated to handle list of revoked permissions.
     * Shows appropriate message based on whether single or multiple permissions were revoked.
     *
     * @param permissions List of permissions that were revoked
     * @param onOpenSettings Callback to open system settings
     * @param onDismiss Callback when dialog is dismissed
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void PermissionRevokedDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> permissions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOpenSettings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    /**
     * Get the display name for a permission.
     */
    @androidx.compose.runtime.Composable()
    private static final java.lang.String getPermissionName(com.vrpirates.rookieonquest.ui.RequiredPermission permission) {
        return null;
    }
    
    /**
     * Get the appropriate icon for a permission type.
     * Uses specific icons to visually distinguish each permission.
     */
    private static final androidx.compose.ui.graphics.vector.ImageVector getPermissionIcon(com.vrpirates.rookieonquest.ui.RequiredPermission permission) {
        return null;
    }
    
    /**
     * Get the content description for the permission icon.
     */
    @androidx.compose.runtime.Composable()
    private static final java.lang.String getPermissionIconDescription(com.vrpirates.rookieonquest.ui.RequiredPermission permission) {
        return null;
    }
}