package com.vrpirates.rookieonquest.data;

/**
 * Centralized logging utility to prevent log pollution in production.
 * These methods only log when BuildConfig.DEBUG is true, reducing overhead in release builds.
 *
 * Provides consistent logging across the application with conditional execution.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"Lcom/vrpirates/rookieonquest/data/LogUtils;", "", "()V", "d", "", "tag", "", "message", "e", "throwable", "", "i", "app_debug"})
public final class LogUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.LogUtils INSTANCE = null;
    
    private LogUtils() {
        super();
    }
    
    /**
     * Log a debug message.
     * @param tag The tag for the log message.
     * @param message The message to log.
     */
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Log an info message.
     * @param tag The tag for the log message.
     * @param message The message to log.
     */
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Log an error message.
     * @param tag The tag for the log message.
     * @param message The message to log.
     * @param throwable Optional throwable for stack trace logging.
     */
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
    }
}