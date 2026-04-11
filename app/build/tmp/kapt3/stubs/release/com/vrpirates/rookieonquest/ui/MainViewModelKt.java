package com.vrpirates.rookieonquest.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000L\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\t\u001a6\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u000b\u00a8\u0006\u0018"}, d2 = {"getAlphabetGroupChar", "", "gameName", "", "getAlphabetSortPriority", "", "groupChar", "isProcessing", "", "Lcom/vrpirates/rookieonquest/ui/InstallTaskStatus;", "toDataStatus", "Lcom/vrpirates/rookieonquest/data/InstallStatus;", "toInstallTaskState", "Lcom/vrpirates/rookieonquest/ui/InstallTaskState;", "Lcom/vrpirates/rookieonquest/data/QueuedInstallEntity;", "context", "Landroid/content/Context;", "gameDataCache", "", "Lcom/vrpirates/rookieonquest/data/GameData;", "missingPermissions", "", "Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "toTaskStatus", "app_release"})
public final class MainViewModelKt {
    
    public static final boolean isProcessing(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.InstallTaskStatus $this$isProcessing) {
        return false;
    }
    
    /**
     * Maps a game name's first character to its alphabet group character.
     * Used for both sorting order and alphabet navigation to ensure consistency.
     *
     * Rules:
     * - '_' prefix → '_' group (comes first in sort)
     * - Digits (0-9) → '#' group (comes second in sort)
     * - Letters → uppercase letter group
     * - Empty/null → '_' group
     *
     * @param gameName The full game name to extract the group character from
     * @return The mapped character for alphabet grouping
     */
    public static final char getAlphabetGroupChar(@org.jetbrains.annotations.NotNull()
    java.lang.String gameName) {
        return '\u0000';
    }
    
    /**
     * Returns the sort priority for alphabet groups.
     * Lower values sort first.
     *
     * @param groupChar The alphabet group character from getAlphabetGroupChar()
     * @return Sort priority (0 = '_', 1 = '#', 2 = letters)
     */
    public static final int getAlphabetSortPriority(char groupChar) {
        return 0;
    }
    
    /**
     * Maps Room InstallStatus (from data layer) to UI InstallTaskStatus.
     *
     * ARCHITECTURAL NOTE: These mappers intentionally couple the data and UI layers.
     * This is acceptable because:
     * 1. Both enums represent the same domain concept (installation state)
     * 2. The mapping is simple and unlikely to change independently
     * 3. Introducing an intermediate layer would add complexity without benefit
     *
     * If the data layer statuses need to diverge significantly from UI statuses,
     * consider moving these mappers to a dedicated StatusMapper object in
     * the data package to improve testability and separation of concerns.
     *
     * Special cases:
     * - COPYING_OBB (data) → INSTALLING (UI): OBB copying is a sub-phase of installation
     *  and should not be visible as a distinct state to users
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.ui.InstallTaskStatus toTaskStatus(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.data.InstallStatus $this$toTaskStatus) {
        return null;
    }
    
    /**
     * Maps UI InstallTaskStatus to Room InstallStatus (for saving to database).
     *
     * NOTE: This is the reverse mapping of toTaskStatus(). Since the UI has fewer
     * states than the data layer (no COPYING_OBB), this mapping is lossy in reverse.
     * INSTALLING in UI maps to INSTALLING in data, never to COPYING_OBB.
     *
     * This asymmetry is intentional - COPYING_OBB is set directly by MainRepository,
     * not through this mapper, ensuring correct state representation during OBB operations.
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.InstallStatus toDataStatus(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.InstallTaskStatus $this$toDataStatus) {
        return null;
    }
    
    /**
     * Converts QueuedInstallEntity from Room to UI InstallTaskState
     * Uses pre-fetched game metadata from cache to avoid N+1 queries
     * Added missingPermissions parameter for visual feedback.
     *
     * @param context Android context for localized status messages
     * @param gameDataCache Pre-loaded map of releaseName -> GameData (from batch query)
     * @param missingPermissions List of currently missing permissions for visual feedback
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.ui.InstallTaskState toInstallTaskState(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.data.QueuedInstallEntity $this$toInstallTaskState, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.vrpirates.rookieonquest.data.GameData> gameDataCache, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> missingPermissions) {
        return null;
    }
}