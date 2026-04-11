package com.vrpirates.rookieonquest.network;

/**
 * Model representing application update information returned by the secure gateway.
 *
 * @property version Semantic version string (e.g., "2.1.2")
 * @property changelog Markdown formatted list of changes in this version
 * @property downloadUrl Direct HTTPS URL to download the update APK
 * @property checksum SHA-256 hex-encoded checksum of the update APK for integrity verification.
 *                   Note: Validated in MainViewModel before use with null/empty check.
 * @property timestamp ISO-8601 UTC timestamp of the release
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/vrpirates/rookieonquest/network/UpdateInfo;", "", "version", "", "changelog", "downloadUrl", "checksum", "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChangelog", "()Ljava/lang/String;", "getChecksum", "getDownloadUrl", "getTimestamp", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class UpdateInfo {
    @com.google.gson.annotations.SerializedName(value = "version")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @com.google.gson.annotations.SerializedName(value = "changelog")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String changelog = null;
    @com.google.gson.annotations.SerializedName(value = "downloadUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String downloadUrl = null;
    @com.google.gson.annotations.SerializedName(value = "checksum")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String checksum = null;
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timestamp = null;
    
    public UpdateInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String changelog, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String checksum, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChangelog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDownloadUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChecksum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrpirates.rookieonquest.network.UpdateInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String changelog, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String checksum, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp) {
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