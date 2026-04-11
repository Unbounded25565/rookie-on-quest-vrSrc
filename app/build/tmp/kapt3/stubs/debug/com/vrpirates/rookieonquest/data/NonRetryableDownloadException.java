package com.vrpirates.rookieonquest.data;

/**
 * Non-retryable download exceptions.
 * These indicate permanent failures that should not trigger retry attempts.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/vrpirates/rookieonquest/data/NonRetryableDownloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "Lcom/vrpirates/rookieonquest/data/GameNotFoundException;", "Lcom/vrpirates/rookieonquest/data/InsufficientStorageException;", "Lcom/vrpirates/rookieonquest/data/MirrorNotFoundException;", "Lcom/vrpirates/rookieonquest/data/NoDownloadableFilesException;", "app_debug"})
public abstract class NonRetryableDownloadException extends java.lang.Exception {
    
    private NonRetryableDownloadException(java.lang.String message) {
        super();
    }
}