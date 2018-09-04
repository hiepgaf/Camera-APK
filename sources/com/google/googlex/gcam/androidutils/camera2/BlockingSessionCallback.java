package com.google.googlex.gcam.androidutils.camera2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.os.ConditionVariable;
import android.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
public class BlockingSessionCallback extends StateCallback {
    public static final int NUM_STATES = 5;
    public static final int SESSION_ACTIVE = 3;
    public static final int SESSION_CLOSED = 4;
    public static final int SESSION_CONFIGURED = 0;
    public static final int SESSION_CONFIGURE_FAILED = 1;
    public static final int SESSION_READY = 2;
    public static final String TAG = "BlockingSessionCallback";
    public static final boolean VERBOSE = Log.isLoggable(TAG, 2);
    public static final String[] sStateNames = new String[]{"SESSION_CONFIGURED", "SESSION_CONFIGURE_FAILED", "SESSION_READY", "SESSION_ACTIVE", "SESSION_CLOSED"};
    public final StateCallback mProxy;
    public final SessionFuture mSessionFuture;
    public final StateChangeListener mStateChangeListener;
    public final StateWaiter mStateWaiter;

    /* compiled from: PG */
    class SessionFuture implements Future {
        public ConditionVariable mCondVar;
        public volatile CameraCaptureSession mSession;

        private SessionFuture() {
            this.mCondVar = new ConditionVariable(false);
        }

        public boolean cancel(boolean z) {
            return false;
        }

        public CameraCaptureSession get() {
            this.mCondVar.block();
            return this.mSession;
        }

        public CameraCaptureSession get(long j, TimeUnit timeUnit) {
            if (!this.mCondVar.block(timeUnit.convert(j, TimeUnit.MILLISECONDS))) {
                String valueOf = String.valueOf(timeUnit);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
                stringBuilder.append("Failed to receive session after ");
                stringBuilder.append(j);
                stringBuilder.append(" ");
                stringBuilder.append(valueOf);
                throw new TimeoutException(stringBuilder.toString());
            } else if (this.mSession != null) {
                return this.mSession;
            } else {
                throw new AssertionError();
            }
        }

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return this.mSession != null;
        }

        public void setSession(CameraCaptureSession cameraCaptureSession) {
            this.mSession = cameraCaptureSession;
            this.mCondVar.open();
        }
    }

    public BlockingSessionCallback() {
        this.mSessionFuture = new SessionFuture();
        this.mStateWaiter = new StateWaiter(sStateNames);
        this.mStateChangeListener = this.mStateWaiter.getListener();
        this.mProxy = null;
    }

    public BlockingSessionCallback(StateCallback stateCallback) {
        this.mSessionFuture = new SessionFuture();
        this.mStateWaiter = new StateWaiter(sStateNames);
        this.mStateChangeListener = this.mStateWaiter.getListener();
        if (stateCallback == null) {
            throw new NullPointerException("listener must not be null");
        }
        this.mProxy = stateCallback;
    }

    public StateWaiter getStateWaiter() {
        return this.mStateWaiter;
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        this.mSessionFuture.setSession(cameraCaptureSession);
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onActive(cameraCaptureSession);
        }
        this.mStateChangeListener.onStateChanged(3);
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.mSessionFuture.setSession(cameraCaptureSession);
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraCaptureSession);
        }
        this.mStateChangeListener.onStateChanged(4);
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.mSessionFuture.setSession(cameraCaptureSession);
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onConfigureFailed(cameraCaptureSession);
        }
        this.mStateChangeListener.onStateChanged(1);
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.mSessionFuture.setSession(cameraCaptureSession);
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onConfigured(cameraCaptureSession);
        }
        this.mStateChangeListener.onStateChanged(0);
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        this.mSessionFuture.setSession(cameraCaptureSession);
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onReady(cameraCaptureSession);
        }
        this.mStateChangeListener.onStateChanged(2);
    }

    public CameraCaptureSession waitAndGetSession(long j) {
        try {
            return this.mSessionFuture.get(j, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            throw new TimeoutRuntimeException(String.format("Failed to get session after %s milliseconds", new Object[]{Long.valueOf(j)}), e);
        }
    }
}
