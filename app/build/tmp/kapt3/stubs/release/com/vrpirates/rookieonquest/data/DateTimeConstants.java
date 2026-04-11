package com.vrpirates.rookieonquest.data;

/**
 * Date and time related constants
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/vrpirates/rookieonquest/data/DateTimeConstants;", "", "()V", "DATE_FORMAT_PATTERN", "", "HISTORY_DATE_FORMATTER", "Ljava/time/format/DateTimeFormatter;", "getHISTORY_DATE_FORMATTER", "()Ljava/time/format/DateTimeFormatter;", "HISTORY_DATE_FORMATTER$delegate", "Lkotlin/Lazy;", "app_release"})
public final class DateTimeConstants {
    
    /**
     * Default date format pattern for history and logs: "MMM d, yyyy HH:mm"
     * Example: "Jan 1, 2026 14:30"
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATE_FORMAT_PATTERN = "MMM d, yyyy HH:mm";
    
    /**
     * Thread-safe formatter for installation history dates.
     * Uses the system default timezone (ZoneId.systemDefault()) and locale (Locale.getDefault()) 
     * to ensure timestamps are displayed in the user's local time.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy HISTORY_DATE_FORMATTER$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.DateTimeConstants INSTANCE = null;
    
    private DateTimeConstants() {
        super();
    }
    
    /**
     * Thread-safe formatter for installation history dates.
     * Uses the system default timezone (ZoneId.systemDefault()) and locale (Locale.getDefault()) 
     * to ensure timestamps are displayed in the user's local time.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.time.format.DateTimeFormatter getHISTORY_DATE_FORMATTER() {
        return null;
    }
}