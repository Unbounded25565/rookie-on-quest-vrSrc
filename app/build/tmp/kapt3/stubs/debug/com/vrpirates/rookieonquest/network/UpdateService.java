package com.vrpirates.rookieonquest.network;

/**
 * Retrofit service for checking application updates via the secure gateway.
 *
 * Requests to this service must be authenticated using HMAC-SHA256 request signing.
 * The signature is computed using the ROOKIE_UPDATE_SECRET and the current UTC timestamp.
 *
 * ENDPOINT NOTE:
 * The correct endpoint path is `.netlify/functions/check-update` which routes to the Netlify serverless function.
 * The path `/api/check-update` is a frontend route that returns HTML, not JSON.
 * This was verified via curl testing during development - see Story 9.2 Round 5 review follow-ups.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vrpirates/rookieonquest/network/UpdateService;", "", "checkUpdate", "Lcom/vrpirates/rookieonquest/network/UpdateInfo;", "signature", "", "date", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UpdateService {
    
    /**
     * Checks for the latest available version of the application.
     *
     * @param signature HMAC-SHA256 signature of the [date] header value
     * @param date Current UTC timestamp in ISO-8601 format (e.g., "2026-02-15T12:00:00Z")
     * @return [UpdateInfo] containing metadata about the latest version
     * @throws retrofit2.HttpException for non-2xx responses (e.g., 403 Forbidden if signature is invalid or clock skew is too large)
     * @throws java.io.IOException for network failures or connection timeouts
     * @throws com.google.gson.JsonParseException if the server response is not valid JSON or doesn't match UpdateInfo structure
     */
    @retrofit2.http.GET(value = ".netlify/functions/check-update")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkUpdate(@retrofit2.http.Header(value = "X-Rookie-Signature")
    @org.jetbrains.annotations.NotNull()
    java.lang.String signature, @retrofit2.http.Header(value = "X-Rookie-Date")
    @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vrpirates.rookieonquest.network.UpdateInfo> $completion);
}