package com.vrpirates.rookieonquest.ui.animation;

/**
 * Represents the animation state for stickman animations in the UI.
 *
 * This sealed class defines all possible states that the stickman animation
 * can be in, along with progress information for each active state.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "", "()V", "Downloading", "Extracting", "Idle", "IdleReason", "Installing", "Paused", "PausedReason", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Downloading;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Extracting;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Idle;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Installing;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Paused;", "app_debug"})
public abstract class AnimationState {
    
    private AnimationState() {
        super();
    }
    
    /**
     * Downloading state with progress tracking
     * @param progress Progress from 0.0 to 1.0
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Downloading;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "progress", "", "(F)V", "getProgress", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Downloading extends com.vrpirates.rookieonquest.ui.animation.AnimationState {
        private final float progress = 0.0F;
        
        public Downloading(float progress) {
        }
        
        public final float getProgress() {
            return 0.0F;
        }
        
        public Downloading() {
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.Downloading copy(float progress) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Extracting state with progress tracking
     * @param progress Progress from 0.0 to 1.0
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Extracting;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "progress", "", "(F)V", "getProgress", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Extracting extends com.vrpirates.rookieonquest.ui.animation.AnimationState {
        private final float progress = 0.0F;
        
        public Extracting(float progress) {
        }
        
        public final float getProgress() {
            return 0.0F;
        }
        
        public Extracting() {
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.Extracting copy(float progress) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Idle state - no active download/install operation
     * @param reason The reason why the animation is idle
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Idle;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "reason", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$IdleReason;", "(Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$IdleReason;)V", "getReason", "()Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$IdleReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Idle extends com.vrpirates.rookieonquest.ui.animation.AnimationState {
        @org.jetbrains.annotations.NotNull()
        private final com.vrpirates.rookieonquest.ui.animation.AnimationState.IdleReason reason = null;
        
        public Idle(@org.jetbrains.annotations.NotNull()
        com.vrpirates.rookieonquest.ui.animation.AnimationState.IdleReason reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.IdleReason getReason() {
            return null;
        }
        
        public Idle() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.IdleReason component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.Idle copy(@org.jetbrains.annotations.NotNull()
        com.vrpirates.rookieonquest.ui.animation.AnimationState.IdleReason reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Reasons why the animation might be idle
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$IdleReason;", "", "(Ljava/lang/String;I)V", "NO_ACTIVE_TASK", "ALL_TASKS_COMPLETED", "app_debug"})
    public static enum IdleReason {
        /*public static final*/ NO_ACTIVE_TASK /* = new NO_ACTIVE_TASK() */,
        /*public static final*/ ALL_TASKS_COMPLETED /* = new ALL_TASKS_COMPLETED() */;
        
        IdleReason() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.vrpirates.rookieonquest.ui.animation.AnimationState.IdleReason> getEntries() {
            return null;
        }
    }
    
    /**
     * Installing state with progress tracking
     * @param progress Progress from 0.0 to 1.0
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Installing;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "progress", "", "(F)V", "getProgress", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Installing extends com.vrpirates.rookieonquest.ui.animation.AnimationState {
        private final float progress = 0.0F;
        
        public Installing(float progress) {
        }
        
        public final float getProgress() {
            return 0.0F;
        }
        
        public Installing() {
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.Installing copy(float progress) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Paused state with reason for pause
     * @param reason The reason why the operation is paused
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$Paused;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "reason", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$PausedReason;", "(Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$PausedReason;)V", "getReason", "()Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$PausedReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Paused extends com.vrpirates.rookieonquest.ui.animation.AnimationState {
        @org.jetbrains.annotations.NotNull()
        private final com.vrpirates.rookieonquest.ui.animation.AnimationState.PausedReason reason = null;
        
        public Paused(@org.jetbrains.annotations.NotNull()
        com.vrpirates.rookieonquest.ui.animation.AnimationState.PausedReason reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.PausedReason getReason() {
            return null;
        }
        
        public Paused() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.PausedReason component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrpirates.rookieonquest.ui.animation.AnimationState.Paused copy(@org.jetbrains.annotations.NotNull()
        com.vrpirates.rookieonquest.ui.animation.AnimationState.PausedReason reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Reasons why an operation might be paused
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationState$PausedReason;", "", "(Ljava/lang/String;I)V", "USER_REQUESTED", "NETWORK_INTERRUPTED", "LOW_STORAGE", "APP_BACKGROUNDED", "ERROR", "app_debug"})
    public static enum PausedReason {
        /*public static final*/ USER_REQUESTED /* = new USER_REQUESTED() */,
        /*public static final*/ NETWORK_INTERRUPTED /* = new NETWORK_INTERRUPTED() */,
        /*public static final*/ LOW_STORAGE /* = new LOW_STORAGE() */,
        /*public static final*/ APP_BACKGROUNDED /* = new APP_BACKGROUNDED() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        PausedReason() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.vrpirates.rookieonquest.ui.animation.AnimationState.PausedReason> getEntries() {
            return null;
        }
    }
}