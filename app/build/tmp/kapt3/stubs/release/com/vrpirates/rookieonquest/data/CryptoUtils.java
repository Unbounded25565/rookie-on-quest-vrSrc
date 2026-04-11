package com.vrpirates.rookieonquest.data;

/**
 * Cryptographic utility functions shared across the application.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/vrpirates/rookieonquest/data/CryptoUtils;", "", "()V", "hmacSha256", "", "input", "secret", "md5", "sha256", "file", "Ljava/io/File;", "onProgress", "Lkotlin/Function1;", "", "", "app_release"})
public final class CryptoUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.CryptoUtils INSTANCE = null;
    
    private CryptoUtils() {
        super();
    }
    
    /**
     * Computes MD5 hash of a string.
     * Used for generating directory names consistent with VRPirates server structure.
     *
     * @param input The string to hash
     * @return Lowercase hexadecimal MD5 hash string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String md5(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    /**
     * Computes SHA-256 hash of a file with optional progress reporting.
     * Used for verifying update APK integrity.
     *
     * @param file The file to hash
     * @param onProgress Optional callback for progress updates (0.0 to 1.0)
     * @return Lowercase hexadecimal SHA-256 hash string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sha256(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> onProgress) {
        return null;
    }
    
    /**
     * Computes HMAC-SHA256 hash of a string using a secret key.
     * Used for secure update gateway authentication.
     *
     * @param input The string to sign (typically a timestamp)
     * @param secret The secret key
     * @return Lowercase hexadecimal HMAC-SHA256 signature
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String hmacSha256(@org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    java.lang.String secret) {
        return null;
    }
}