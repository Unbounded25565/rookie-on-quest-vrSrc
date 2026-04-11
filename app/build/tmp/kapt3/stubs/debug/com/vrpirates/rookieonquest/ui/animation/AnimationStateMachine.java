package com.vrpirates.rookieonquest.ui.animation;

/**
 * State machine for managing stickman animation states.
 *
 * This class provides thread-safe state transitions and ensures that
 * only valid state transitions are allowed. It follows the single
 * responsibility principle, keeping animation state separate from
 * the backend InstallStatus.
 *
 * Thread Safety:
 * - All state transitions are protected by a Mutex to ensure atomicity
 * - StateFlow emissions are thread-safe
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u000e\u0010\u001b\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0005J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0086@\u00a2\u0006\u0002\u0010$R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationStateMachine;", "", "()V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "currentState", "getCurrentState", "()Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "canTransitionTo", "", "targetState", "logDebug", "", "tag", "", "message", "logError", "logWarning", "rejectTransition", "attemptedState", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionTo", "newState", "(Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryTransitionTo", "updateProgress", "progress", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class AnimationStateMachine {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "AnimationStateMachine";
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.vrpirates.rookieonquest.ui.animation.AnimationState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.vrpirates.rookieonquest.ui.animation.AnimationState> state = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrpirates.rookieonquest.ui.animation.AnimationStateMachine.Companion Companion = null;
    
    public AnimationStateMachine() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.vrpirates.rookieonquest.ui.animation.AnimationState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrpirates.rookieonquest.ui.animation.AnimationState getCurrentState() {
        return null;
    }
    
    /**
     * Attempts to transition to a new state.
     *
     * @param newState The target state to transition to
     * @return true if transition was successful, false if invalid
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object transitionTo(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.animation.AnimationState newState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * Attempts to transition to a new state synchronously.
     * Uses a simple synchronized block for thread-safety.
     *
     * @param newState The target state to transition to
     * @return true if transition was successful, false if invalid
     */
    @kotlin.jvm.Synchronized()
    public final synchronized boolean tryTransitionTo(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.animation.AnimationState newState) {
        return false;
    }
    
    /**
     * Updates the progress of the current state.
     * Only states with progress (Downloading, Extracting, Installing) support this.
     *
     * @param progress New progress value (0.0 to 1.0)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProgress(float progress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * Resets the state machine to Idle.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object reset(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Handles invalid transition logging.
     */
    private final void rejectTransition(com.vrpirates.rookieonquest.ui.animation.AnimationState attemptedState) {
    }
    
    /**
     * Checks if a transition to the given state would be valid.
     *
     * @param targetState The target state to check
     * @return true if transition would be valid
     */
    public final boolean canTransitionTo(@org.jetbrains.annotations.NotNull()
    com.vrpirates.rookieonquest.ui.animation.AnimationState targetState) {
        return false;
    }
    
    /**
     * Wrapper for Log.d that can be safely called in unit tests without mocking Android Log.
     */
    private final void logDebug(java.lang.String tag, java.lang.String message) {
    }
    
    /**
     * Wrapper for Log.w that can be safely called in unit tests without mocking Android Log.
     */
    private final void logWarning(java.lang.String tag, java.lang.String message) {
    }
    
    /**
     * Wrapper for Log.e that can be safely called in unit tests without mocking Android Log.
     */
    private final void logError(java.lang.String tag, java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/vrpirates/rookieonquest/ui/animation/AnimationStateMachine$Companion;", "", "()V", "TAG", "", "isValidTransition", "", "from", "Lcom/vrpirates/rookieonquest/ui/animation/AnimationState;", "to", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Checks if a transition from current state to target state is valid.
         */
        public final boolean isValidTransition(@org.jetbrains.annotations.NotNull()
        com.vrpirates.rookieonquest.ui.animation.AnimationState from, @org.jetbrains.annotations.NotNull()
        com.vrpirates.rookieonquest.ui.animation.AnimationState to) {
            return false;
        }
    }
}