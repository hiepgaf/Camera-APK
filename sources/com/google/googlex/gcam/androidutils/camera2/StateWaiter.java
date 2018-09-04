package com.google.googlex.gcam.androidutils.camera2;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public final class StateWaiter {
    public static final String TAG = "StateWaiter";
    public static final boolean VERBOSE = Log.isLoggable(TAG, 2);
    public final StateChangeListener mListener;
    public final LinkedBlockingQueue mQueuedStates = new LinkedBlockingQueue();
    public final int mStateCount;
    public final String[] mStateNames;
    public final AtomicBoolean mWaiting = new AtomicBoolean(false);

    /* compiled from: PG */
    /* renamed from: com.google.googlex.gcam.androidutils.camera2.StateWaiter$1 */
    class C01521 implements StateChangeListener {
        C01521() {
        }

        public void onStateChanged(int i) {
            StateWaiter stateWaiter = StateWaiter.this;
            stateWaiter.queueStateTransition(stateWaiter.checkStateInRange(i));
        }
    }

    public StateWaiter(String[] strArr) {
        this.mStateCount = strArr.length;
        int i = this.mStateCount;
        this.mStateNames = new String[i];
        System.arraycopy(strArr, 0, this.mStateNames, 0, i);
        this.mListener = new C01521();
    }

    public final void appendStateNames(StringBuilder stringBuilder, Collection collection) {
        checkStateCollectionInRange(collection);
        Object obj = 1;
        for (Integer num : collection) {
            if (obj == null) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(getStateName(num.intValue()));
            obj = null;
        }
    }

    private final Collection checkStateCollectionInRange(Collection collection) {
        for (Integer intValue : collection) {
            checkStateInRange(intValue.intValue());
        }
        return collection;
    }

    private final int checkStateInRange(int i) {
        if (i >= 0 && i < this.mStateCount) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("State out of range ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final StateChangeListener getListener() {
        return this.mListener;
    }

    public final String getStateName(int i) {
        return this.mStateNames[checkStateInRange(i)];
    }

    private final void queueStateTransition(int i) {
        if (VERBOSE) {
            String valueOf = String.valueOf(getStateName(i));
            String str = "setCurrentState - state now ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.v(TAG, valueOf);
        }
        try {
            this.mQueuedStates.put(Integer.valueOf(i));
        } catch (Throwable e) {
            throw new UnsupportedOperationException("Unable to set current state", e);
        }
    }

    public final int waitForAnyOfStates(Collection collection, long j) {
        checkStateCollectionInRange(collection);
        if (this.mWaiting.getAndSet(true)) {
            throw new IllegalStateException("Only one waiter allowed at a time");
        }
        try {
            StringBuilder stringBuilder;
            Integer num;
            if (VERBOSE) {
                stringBuilder = new StringBuilder("Waiting for state(s) ");
                appendStateNames(stringBuilder, collection);
                Log.v(TAG, stringBuilder.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j;
            while (true) {
                num = (Integer) this.mQueuedStates.poll(j2, TimeUnit.MILLISECONDS);
                if (num != null) {
                    if (VERBOSE) {
                        String str = TAG;
                        String str2 = "  Saw transition to ";
                        String valueOf = String.valueOf(getStateName(num.intValue()));
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
            }
            this.mWaiting.set(false);
            if (collection.contains(num)) {
                return num.intValue();
            }
            stringBuilder = new StringBuilder("Timed out after ");
            stringBuilder.append(j);
            stringBuilder.append(" ms waiting for state(s) ");
            appendStateNames(stringBuilder, collection);
            throw new TimeoutRuntimeException(stringBuilder.toString());
        } catch (Throwable e) {
            throw new UnsupportedOperationException("Does not support interrupts on waits", e);
        } catch (Throwable th) {
            this.mWaiting.set(false);
        }
    }

    public final void waitForState(int i, long j) {
        waitForAnyOfStates(Arrays.asList(new Integer[]{Integer.valueOf(checkStateInRange(i))}), j);
    }
}
