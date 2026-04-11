package com.vrpirates.rookieonquest.data;

/**
 * Singleton network module providing shared OkHttpClient and Retrofit instances.
 * Ensures consistent configuration across the app and reduces memory footprint.
 *
 * Usage:
 * - MainRepository: Uses both okHttpClient and vrpService for catalog and download operations
 * - DownloadWorker: Uses okHttpClient for background downloads
 * - MainViewModel: Uses okHttpClient for app update downloads
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/vrpirates/rookieonquest/data/NetworkModule;", "", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "secureUpdateRetrofit", "getSecureUpdateRetrofit", "secureUpdateRetrofit$delegate", "updateService", "Lcom/vrpirates/rookieonquest/network/UpdateService;", "getUpdateService", "()Lcom/vrpirates/rookieonquest/network/UpdateService;", "updateService$delegate", "app_debug"})
public final class NetworkModule {
    
    /**
     * Shared OkHttpClient instance configured for VRPirates server communication.
     * Thread-safe and connection-pooled for efficiency.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy okHttpClient$delegate = null;
    
    /**
     * Shared Retrofit instance for VRPirates API.
     * Uses Gson converter for JSON parsing.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy retrofit$delegate = null;
    
    /**
     * Dedicated Retrofit instance for secure update gateway.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy secureUpdateRetrofit$delegate = null;
    
    /**
     * Service for secure application updates.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy updateService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.data.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    /**
     * Shared OkHttpClient instance configured for VRPirates server communication.
     * Thread-safe and connection-pooled for efficiency.
     */
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    /**
     * Shared Retrofit instance for VRPirates API.
     * Uses Gson converter for JSON parsing.
     */
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    /**
     * Dedicated Retrofit instance for secure update gateway.
     */
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getSecureUpdateRetrofit() {
        return null;
    }
    
    /**
     * Service for secure application updates.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vrpirates.rookieonquest.network.UpdateService getUpdateService() {
        return null;
    }
}