package com.vrpirates.rookieonquest;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u00a0\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00060\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a$\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\u00b2\u0001\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0007\u001a\u001e\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001aH\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\u0010\u0010*\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0011H\u0007\u001a\u0012\u0010+\u001a\u00020\u00012\b\b\u0002\u0010,\u001a\u00020-H\u0007\u001a$\u0010.\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\u0092\u0001\u00102\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u00103\u001a\u0004\u0018\u00010\u00112\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\u001a\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020:H\u0007\u001ax\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u001e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00042\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010\t2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\u0090\u0001\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00112\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\b\b\u0002\u0010N\u001a\u00020\u001e2\u001c\u0010O\u001a\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\bQ\u00a2\u0006\u0002\bRH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\bS\u0010T\u001a#\u0010U\u001a\u00020\u00012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\b\b\u0002\u0010X\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010Y\u001a,\u0010Z\u001a\u00020\u00012\u0006\u0010[\u001a\u00020\\2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\u000e\u0010^\u001a\u00020_2\u0006\u00108\u001a\u00020\u0011\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006`"}, d2 = {"AlphabetIndexer", "", "alphabetInfo", "Lkotlin/Pair;", "", "", "", "", "onLetterClick", "Lkotlin/Function1;", "BottomQueueBar", "queue", "Lcom/vrpirates/rookieonquest/ui/InstallTaskState;", "onClick", "Lkotlin/Function0;", "CustomTopBar", "searchQuery", "", "onSearchQueryChange", "selectedFilter", "Lcom/vrpirates/rookieonquest/ui/FilterStatus;", "onFilterChange", "sortMode", "Lcom/vrpirates/rookieonquest/ui/SortMode;", "onSortChange", "filterCounts", "onSettingsClick", "onRefreshClick", "onNavigationClick", "isRefreshing", "", "isInstalling", "permissionsMissing", "ErrorScreen", "message", "onRetry", "InstallationOverlay", "activeTask", "onCancel", "onPause", "onResume", "onBackground", "LoadingScreen", "MainScreen", "viewModel", "Lcom/vrpirates/rookieonquest/ui/MainViewModel;", "PermissionOverlay", "missingPermissions", "Lcom/vrpirates/rookieonquest/ui/RequiredPermission;", "onGrantClick", "QueueManagerOverlay", "viewedReleaseName", "onTaskClick", "onPromote", "onClose", "ResponsiveTitle", "text", "modifier", "Landroidx/compose/ui/Modifier;", "SettingsDialog", "keepApks", "onToggleKeepApks", "onExportDiagnostics", "onSaveDiagnostics", "onClearCache", "onPermissionClick", "onDismiss", "SetupLayout", "title", "subtitle", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconColor", "Landroidx/compose/ui/graphics/Color;", "primaryButtonText", "onPrimaryClick", "secondaryButtonText", "onSecondaryClick", "isScrollable", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SetupLayout-hYmLsZ8", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "SyncingOverlay", "progress", "", "updateCount", "(Ljava/lang/Float;I)V", "UpdateOverlay", "updateInfo", "Lcom/vrpirates/rookieonquest/network/UpdateInfo;", "onConfirm", "parseMarkdown", "Landroidx/compose/ui/text/AnnotatedString;", "app_release"})
public final class MainActivityKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void MainScreen(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.MainViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PermissionOverlay(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> missingPermissions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onGrantClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void UpdateOverlay(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.network.UpdateInfo updateInfo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ResponsiveTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void CustomTopBar(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchQueryChange, @org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.FilterStatus selectedFilter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vrpirates.rookieonquest.ui.FilterStatus, kotlin.Unit> onFilterChange, @org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.SortMode sortMode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vrpirates.rookieonquest.ui.SortMode, kotlin.Unit> onSortChange, @org.jetbrains.annotations.NotNull()
    java.util.Map<com.vrpirates.rookieonquest.ui.FilterStatus, java.lang.Integer> filterCounts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSettingsClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefreshClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigationClick, boolean isRefreshing, boolean isInstalling, boolean permissionsMissing) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SyncingOverlay(@org.jetbrains.annotations.Nullable()
    java.lang.Float progress, int updateCount) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LoadingScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ErrorScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRetry) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void InstallationOverlay(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.InstallTaskState activeTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPause, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onResume, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackground) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BottomQueueBar(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrpirates.rookieonquest.ui.InstallTaskState> queue, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SettingsDialog(boolean keepApks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleKeepApks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onExportDiagnostics, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSaveDiagnostics, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearCache, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.vrpirates.rookieonquest.ui.RequiredPermission> missingPermissions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vrpirates.rookieonquest.ui.RequiredPermission, kotlin.Unit> onPermissionClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AlphabetIndexer(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends java.util.List<java.lang.Character>, ? extends java.util.Map<java.lang.Character, java.lang.Integer>> alphabetInfo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onLetterClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void QueueManagerOverlay(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrpirates.rookieonquest.ui.InstallTaskState> queue, @org.jetbrains.annotations.Nullable()
    java.lang.String viewedReleaseName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTaskClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCancel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPause, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onResume, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPromote, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.text.AnnotatedString parseMarkdown(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
}