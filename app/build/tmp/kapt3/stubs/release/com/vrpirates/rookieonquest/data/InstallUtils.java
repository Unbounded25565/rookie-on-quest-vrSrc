package com.vrpirates.rookieonquest.data;

/**
 * Extracted install.txt parsing utilities for testability.
 *
 * This object provides pure functions for parsing install.txt files and related operations.
 * Previously these were private methods in MainRepository, making them untestable.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u001e\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/vrpirates/rookieonquest/data/InstallUtils;", "", "()V", "obbFileComparator", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "getObbFileComparator", "()Ljava/util/Comparator;", "formatBytes", "bytes", "", "isAdbPushCommand", "", "line", "parseAdbPushArgs", "Lkotlin/Pair;", "argsString", "sortObbFiles", "", "obbFileNames", "app_release"})
public final class InstallUtils {
    
    /**
     * OBB file comparator for natural/numeric sorting.
     *
     * OBB format: main.{versionCode}.{packageName}.obb or patch.{versionCode}.{packageName}.obb
     * This comparator ensures:
     * 1. main files come before patch files (alphabetically)
     * 2. Version codes are sorted numerically (1, 2, 10, 20 not 1, 10, 2, 20)
     *
     * Extracted from MainRepository.parseInstallationArtifacts() for testability.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Comparator<java.lang.String> obbFileComparator = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.InstallUtils INSTANCE = null;
    
    private InstallUtils() {
        super();
    }
    
    /**
     * Parse adb push command arguments with quote-aware splitting.
     * Handles paths with spaces when quoted: adb push "path with spaces" "/sdcard/dest"
     * Also handles unquoted simple paths: adb push source /sdcard/dest
     *
     * Added support for escaped quotes.
     * Handles escape sequences: \" and \' within quoted strings.
     * Example: adb push "path with \"escaped\" quote" /sdcard/dest
     *
     * This function is extracted from MainRepository to enable unit testing.
     *
     * @param argsString The string after "adb push " (e.g., '"source" "/dest"' or 'source /dest')
     * @return Pair of (sourcePath, destPath), or (null, null) if parsing fails
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.String, java.lang.String> parseAdbPushArgs(@org.jetbrains.annotations.NotNull()
    java.lang.String argsString) {
        return null;
    }
    
    /**
     * Check if a line from install.txt is a valid adb push command.
     * Only matches lines that START with "adb push" (case-insensitive).
     *
     * @param line The line to check
     * @return true if this is an adb push command line
     */
    public final boolean isAdbPushCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String line) {
        return false;
    }
    
    /**
     * Format bytes to human-readable string (e.g., "1.5 GB").
     * Extracted to eliminate duplication between MainRepository and MainViewModel.
     *
     * @param bytes Number of bytes to format
     * @return Formatted string with appropriate unit (B, KB, MB, GB, TB)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatBytes(long bytes) {
        return null;
    }
    
    /**
     * OBB file comparator for natural/numeric sorting.
     *
     * OBB format: main.{versionCode}.{packageName}.obb or patch.{versionCode}.{packageName}.obb
     * This comparator ensures:
     * 1. main files come before patch files (alphabetically)
     * 2. Version codes are sorted numerically (1, 2, 10, 20 not 1, 10, 2, 20)
     *
     * Extracted from MainRepository.parseInstallationArtifacts() for testability.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<java.lang.String> getObbFileComparator() {
        return null;
    }
    
    /**
     * Sort a list of OBB file names using natural/numeric sorting.
     *
     * @param obbFileNames List of OBB file names to sort
     * @return Sorted list with main before patch, version codes in numeric order
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> sortObbFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> obbFileNames) {
        return null;
    }
}