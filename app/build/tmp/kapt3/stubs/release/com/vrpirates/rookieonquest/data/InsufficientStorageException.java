package com.vrpirates.rookieonquest.data;

/**
 * Thrown when there's insufficient storage space for the download
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/vrpirates/rookieonquest/data/InsufficientStorageException;", "Lcom/vrpirates/rookieonquest/data/NonRetryableDownloadException;", "requiredMb", "", "availableMb", "(JJ)V", "app_release"})
public final class InsufficientStorageException extends com.vrpirates.rookieonquest.data.NonRetryableDownloadException {
    
    public InsufficientStorageException(long requiredMb, long availableMb) {
    }
}