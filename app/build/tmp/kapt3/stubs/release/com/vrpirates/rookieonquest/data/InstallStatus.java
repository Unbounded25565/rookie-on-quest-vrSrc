package com.vrpirates.rookieonquest.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/vrpirates/rookieonquest/data/InstallStatus;", "", "(Ljava/lang/String;I)V", "toString", "", "QUEUED", "DOWNLOADING", "EXTRACTING", "COPYING_OBB", "INSTALLING", "PENDING_INSTALL", "PAUSED", "COMPLETED", "FAILED", "LOCAL_VERIFYING", "SHELVED", "Companion", "app_release"})
public enum InstallStatus {
    /*public static final*/ QUEUED /* = new QUEUED() */,
    /*public static final*/ DOWNLOADING /* = new DOWNLOADING() */,
    /*public static final*/ EXTRACTING /* = new EXTRACTING() */,
    /*public static final*/ COPYING_OBB /* = new COPYING_OBB() */,
    /*public static final*/ INSTALLING /* = new INSTALLING() */,
    /*public static final*/ PENDING_INSTALL /* = new PENDING_INSTALL() */,
    /*public static final*/ PAUSED /* = new PAUSED() */,
    /*public static final*/ COMPLETED /* = new COMPLETED() */,
    /*public static final*/ FAILED /* = new FAILED() */,
    /*public static final*/ LOCAL_VERIFYING /* = new LOCAL_VERIFYING() */,
    /*public static final*/ SHELVED /* = new SHELVED() */;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "InstallStatus";
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.InstallStatus.Companion Companion = null;
    
    InstallStatus() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.vrpirates.rookieonquest.data.InstallStatus> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vrpirates/rookieonquest/data/InstallStatus$Companion;", "", "()V", "TAG", "", "fromString", "Lcom/vrpirates/rookieonquest/data/InstallStatus;", "value", "fromStringOrNull", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Converts a string to InstallStatus enum.
         * Returns QUEUED as fallback for unknown values, with error logging.
         *
         * @param value The string value to convert
         * @return The matching InstallStatus, or QUEUED if not found
         */
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.data.InstallStatus fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        /**
         * Safely converts a string to InstallStatus, returning null if not found.
         * Use this when you need to handle unknown values explicitly.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.vrpirates.rookieonquest.data.InstallStatus fromStringOrNull(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
    }
}