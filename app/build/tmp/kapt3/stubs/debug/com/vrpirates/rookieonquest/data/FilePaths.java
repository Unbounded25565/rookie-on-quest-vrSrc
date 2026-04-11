package com.vrpirates.rookieonquest.data;

/**
 * File path constants used across the application.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vrpirates/rookieonquest/data/FilePaths;", "", "()V", "DOWNLOADS_ROOT_DIR_NAME", "", "app_debug"})
public final class FilePaths {
    
    /**
     * Root directory name for downloads in external storage.
     * All game downloads, logs, and related files are stored under this directory.
     * Location: /sdcard/Download/RookieOnQuest/
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DOWNLOADS_ROOT_DIR_NAME = "RookieOnQuest";
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.FilePaths INSTANCE = null;
    
    private FilePaths() {
        super();
    }
}