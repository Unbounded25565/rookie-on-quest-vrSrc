package com.vrpirates.rookieonquest.data;

/**
 * Room TypeConverters for the application database.
 * Handles conversion between complex types (like Enums) and database-compatible types (like Strings).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vrpirates/rookieonquest/data/Converters;", "", "()V", "fromInstallStatus", "", "value", "Lcom/vrpirates/rookieonquest/data/InstallStatus;", "toInstallStatus", "app_release"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromInstallStatus(@org.jetbrains.annotations.Nullable()
    com.vrpirates.rookieonquest.data.InstallStatus value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final com.vrpirates.rookieonquest.data.InstallStatus toInstallStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
}