package com.google.googlex.gcam.androidutils.camera2;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class BlockingStateCallback extends StateCallback {
    public static final int NUM_STATES = 4;
    public static final int STATE_CLOSED = 1;
    public static final int STATE_DISCONNECTED = 2;
    public static final int STATE_ERROR = 3;
    public static final int STATE_OPENED = 0;
    public static final String TAG = "BlockingStateCallback";
    public static final boolean VERBOSE = Log.isLoggable(TAG, 2);
    public static final String[] mStateNames = new String[]{"STATE_OPENED", "STATE_CLOSED", "STATE_DISCONNECTED", "STATE_ERROR"};
    public final Object mLock;
    public final StateCallback mProxy;
    public final LinkedBlockingQueue mRecentStates;
    public boolean mWaiting;

    public BlockingStateCallback() {
        this.mLock = new Object();
        this.mWaiting = false;
        this.mRecentStates = new LinkedBlockingQueue();
        this.mProxy = null;
    }

    public BlockingStateCallback(StateCallback stateCallback) {
        this.mLock = new Object();
        this.mWaiting = false;
        this.mRecentStates = new LinkedBlockingQueue();
        this.mProxy = stateCallback;
    }

    public static void appendStates(StringBuilder stringBuilder, Collection collection) {
        Object obj = 1;
        for (Integer num : collection) {
            if (obj == null) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(stateToString(num.intValue()));
            obj = null;
        }
    }

    public void onClosed(CameraDevice cameraDevice) {
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        setCurrentState(1);
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        setCurrentState(2);
    }

    public void onError(CameraDevice cameraDevice, int i) {
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        setCurrentState(3);
    }

    public void onOpened(CameraDevice cameraDevice) {
        StateCallback stateCallback = this.mProxy;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        setCurrentState(0);
    }

    private void setCurrentState(int i) {
        if (VERBOSE) {
            String valueOf = String.valueOf(stateToString(i));
            String str = "Camera device state now ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.v(TAG, valueOf);
        }
        try {
            this.mRecentStates.put(Integer.valueOf(i));
        } catch (Throwable e) {
            throw new RuntimeException("Unable to set device state", e);
        }
    }

    public static String stateToString(int i) {
        return mStateNames[i + 1];
    }

    public int waitForAnyOfStates(Collection collection, long j) {
        synchronized (this.mLock) {
            if (this.mWaiting) {
                throw new IllegalStateException("Only one waiter allowed at a time");
            }
            this.mWaiting = true;
        }
        if (VERBOSE) {
            StringBuilder stringBuilder = new StringBuilder("Waiting for state(s) ");
            appendStates(stringBuilder, collection);
            Log.v(TAG, stringBuilder.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j;
        while (true) {
            Integer num;
            try {
                num = (Integer) this.mRecentStates.poll(j2, TimeUnit.MILLISECONDS);
                if (num != null) {
                    if (VERBOSE) {
                        String str = TAG;
                        String str2 = "  Saw transition to ";
                        String valueOf = String.valueOf(stateToString(num.intValue()));
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        Log.v(str, valueOf);
                    }
                    if (collection.contains(num)) {
                        break;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    j2 -= elapsedRealtime2 - elapsedRealtime;
                    elapsedRealtime = elapsedRealtime2;
                } else {
                    break;
                }
            } catch (Throwable e) {
                throw new UnsupportedOperationException("Does not support interrupts on waits", e);
            }
        }
        synchronized (this.mLock) {
            this.mWaiting = false;
        }
        if (collection.contains(num)) {
            return num.intValue();
        }
        stringBuilder = new StringBuilder("Timed out after ");
        stringBuilder.append(j);
        stringBuilder.append(" ms waiting for state(s) ");
        appendStates(stringBuilder, collection);
        throw new TimeoutRuntimeException(stringBuilder.toString());
    }

    public int waitForState(int i, long j) {
        return waitForAnyOfStates(Arrays.asList(new Integer[]{Integer.valueOf(i)}), j);
    }
}
