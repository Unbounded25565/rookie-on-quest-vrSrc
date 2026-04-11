package com.vrpirates.rookieonquest.data;

/**
 * Thrown when a game is not found in the catalog
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/vrpirates/rookieonquest/data/GameNotFoundException;", "Lcom/vrpirates/rookieonquest/data/NonRetryableDownloadException;", "releaseName", "", "(Ljava/lang/String;)V", "app_debug"})
public final class GameNotFoundException extends com.vrpirates.rookieonquest.data.NonRetryableDownloadException {
    
    public GameNotFoundException(@org.jetbrains.annotations.NotNull()
    java.lang.String releaseName) {
    }
}