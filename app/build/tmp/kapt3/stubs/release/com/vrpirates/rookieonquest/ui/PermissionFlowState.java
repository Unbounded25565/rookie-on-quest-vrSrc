package com.vrpirates.rookieonquest.ui;

/**
 * Permission flow state for UI.
 *
 * Tracks the current state of permission requests and provides reactive updates
 * to the UI during the permission request flow.
 *
 * @param isActive Whether a permission flow is currently active
 * @param currentPermission The permission currently being requested (null if not in flow)
 * @param pendingGameInstall The releaseName of game waiting for permissions (null if none)
 * @param allGranted Whether all required permissions have been granted
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/PermissionFlowState;", "", "isActive", "", "currentPermission", "Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "pendingGameInstall", "", "allGranted", "(ZLcom/vrpirates/rookieonquest/ui/RequiredPermission;Ljava/lang/String;Z)V", "getAllGranted", "()Z", "getCurrentPermission", "()Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "getPendingGameInstall", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"})
@androidx.compose.runtime.Immutable()
public final class PermissionFlowState {
    private final boolean isActive = false;
    @org.jetbrains.annotations.Nullable()
    private final com.vrpirates.rookieonquest.ui.RequiredPermission currentPermission = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String pendingGameInstall = null;
    private final boolean allGranted = false;
    
    public PermissionFlowState(boolean isActive, @org.jetbrains.annotations.Nullable()
    com.vrpirates.rookieonquest.ui.RequiredPermission currentPermission, @org.jetbrains.annotations.Nullable()
    java.lang.String pendingGameInstall, boolean allGranted) {
        super();
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vrpirates.rookieonquest.ui.RequiredPermission getCurrentPermission() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPendingGameInstall() {
        return null;
    }
    
    public final boolean getAllGranted() {
        return false;
    }
    
    public PermissionFlowState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vrpirates.rookieonquest.ui.RequiredPermission component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrpirates.rookieonquest.ui.PermissionFlowState copy(boolean isActive, @org.jetbrains.annotations.Nullable()
    com.vrpirates.rookieonquest.ui.RequiredPermission currentPermission, @org.jetbrains.annotations.Nullable()
    java.lang.String pendingGameInstall, boolean allGranted) {
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