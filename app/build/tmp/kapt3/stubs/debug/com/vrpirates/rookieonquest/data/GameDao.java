package com.vrpirates.rookieonquest.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0018\u001a\u00020\fH\'J\u001e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ*\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u00a7@\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u00a7@\u00a2\u0006\u0002\u0010$\u00a8\u0006%"}, d2 = {"Lcom/vrpirates/rookieonquest/data/GameDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGames", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/vrpirates/rookieonquest/data/GameEntity;", "getAllGamesList", "getByPackageName", "packageName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByReleaseName", "releaseName", "getByReleaseNames", "releaseNames", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "", "insertGames", "games", "searchGames", "query", "updateFavorite", "isFavorite", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMetadata", "description", "screenshots", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSize", "size", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface GameDao {
    
    @androidx.room.Query(value = "SELECT * FROM games ORDER BY gameName ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.vrpirates.rookieonquest.data.GameEntity>> getAllGames();
    
    @androidx.room.Query(value = "SELECT * FROM games")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllGamesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.vrpirates.rookieonquest.data.GameEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE gameName LIKE :query OR packageName LIKE :query ORDER BY gameName ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.vrpirates.rookieonquest.data.GameEntity>> searchGames(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertGames(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrpirates.rookieonquest.data.GameEntity> games, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE games SET sizeBytes = :size WHERE releaseName = :releaseName")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSize(@org.jetbrains.annotations.NotNull()
    java.lang.String releaseName, long size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE games SET description = :description, screenshotUrlsJson = :screenshots WHERE releaseName = :releaseName")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String releaseName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String screenshots, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE games SET isFavorite = :isFavorite WHERE releaseName = :releaseName")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String releaseName, boolean isFavorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE releaseName = :releaseName LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByReleaseName(@org.jetbrains.annotations.NotNull()
    java.lang.String releaseName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vrpirates.rookieonquest.data.GameEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE packageName = :packageName LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByPackageName(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vrpirates.rookieonquest.data.GameEntity> $completion);
    
    /**
     * Batch query to fetch multiple games by release names in a single DB call.
     * Used to avoid N+1 queries when converting queue entities to UI state.
     */
    @androidx.room.Query(value = "SELECT * FROM games WHERE releaseName IN (:releaseNames)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByReleaseNames(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> releaseNames, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.vrpirates.rookieonquest.data.GameEntity>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM games")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM games")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}