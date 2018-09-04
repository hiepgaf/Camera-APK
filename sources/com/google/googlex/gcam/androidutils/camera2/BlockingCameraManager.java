package com.google.googlex.gcam.androidutils.camera2;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import java.util.Objects;

/* compiled from: PG */
public class BlockingCameraManager {
    public static final int OPEN_TIME_OUT_MS = 2000;
    public static final String TAG = "BlockingCameraManager";
    public static final boolean VERBOSE = Log.isLoggable(TAG, 2);
    public final CameraManager mManager;

    /* compiled from: PG */
    public class BlockingOpenException extends Exception {
        public static final int ERROR_DISCONNECTED = 0;
        public static final long serialVersionUID = 12397123891238912L;
        public final int mError;

        public BlockingOpenException(int i, String str) {
            super(str);
            this.mError = i;
        }

        public int getCode() {
            return this.mError;
        }

        public boolean wasDisconnected() {
            return this.mError == 0;
        }

        public boolean wasError() {
            return this.mError != 0;
        }
    }

    /* compiled from: PG */
    class OpenListener extends StateCallback {
        public static final int ERROR_UNINITIALIZED = -1;
        public final String mCameraId;
        public CameraDevice mDevice = null;
        public final ConditionVariable mDeviceReady = new ConditionVariable();
        public boolean mDisconnected = false;
        public int mError = -1;
        public final Object mLock = new Object();
        public boolean mNoReply = true;
        public final StateCallback mProxy;
        public boolean mSuccess = false;
        public boolean mTimedOut = false;

        OpenListener(BlockingCameraManager blockingCameraManager, CameraManager cameraManager, String str, StateCallback stateCallback, Handler handler) {
            this.mCameraId = str;
            this.mProxy = stateCallback;
            cameraManager.openCamera(str, this, handler);
        }

        private void assertInitialState() {
            BlockingCameraManager.assertEquals(null, this.mDevice);
            Boolean valueOf = Boolean.valueOf(false);
            BlockingCameraManager.assertEquals(valueOf, Boolean.valueOf(this.mDisconnected));
            BlockingCameraManager.assertEquals(Integer.valueOf(-1), Integer.valueOf(this.mError));
            BlockingCameraManager.assertEquals(valueOf, Boolean.valueOf(this.mSuccess));
        }

        CameraDevice blockUntilOpen() {
            CameraDevice cameraDevice;
            if (!this.mDeviceReady.block(ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS)) {
                synchronized (this.mLock) {
                    if (this.mNoReply) {
                        this.mTimedOut = true;
                        throw new TimeoutRuntimeException(String.format("Timed out after %d ms while trying to open camera device %s", new Object[]{Integer.valueOf(BlockingCameraManager.OPEN_TIME_OUT_MS), this.mCameraId}));
                    }
                }
            }
            synchronized (this.mLock) {
                if (!this.mSuccess) {
                    cameraDevice = this.mDevice;
                    if (cameraDevice != null) {
                        cameraDevice.close();
                    }
                }
                if (this.mSuccess) {
                    cameraDevice = this.mDevice;
                } else if (this.mDisconnected) {
                    throw new BlockingOpenException(0, "Failed to open camera device: it is disconnected");
                } else {
                    int i = this.mError;
                    if (i != -1) {
                        StringBuilder stringBuilder = new StringBuilder(52);
                        stringBuilder.append("Failed to open camera device: error code ");
                        stringBuilder.append(i);
                        throw new BlockingOpenException(i, stringBuilder.toString());
                    }
                    throw new AssertionError("Failed to open camera device (impl bug)");
                }
            }
            return cameraDevice;
        }

        public void onClosed(CameraDevice cameraDevice) {
            StateCallback stateCallback = this.mProxy;
            if (stateCallback != null) {
                stateCallback.onClosed(cameraDevice);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDisconnected(android.hardware.camera2.CameraDevice r4) {
            /*
            r3 = this;
            r0 = com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager.VERBOSE;
            if (r0 == 0) goto L_0x0020;
        L_0x0006:
            if (r4 != 0) goto L_0x004c;
        L_0x0008:
            r0 = "null";
        L_0x000a:
            r0 = java.lang.String.valueOf(r0);
            r1 = "onDisconnected: camera ";
            r2 = r0.length();
            if (r2 != 0) goto L_0x0047;
        L_0x0016:
            r0 = new java.lang.String;
            r0.<init>(r1);
        L_0x001b:
            r1 = "BlockingCameraManager";
            android.util.Log.v(r1, r0);
        L_0x0020:
            r1 = r3.mLock;
            monitor-enter(r1);
            r3.assertInitialState();	 Catch:{ all -> 0x0051 }
            r0 = 0;
            r3.mNoReply = r0;	 Catch:{ all -> 0x0051 }
            r0 = 1;
            r3.mDisconnected = r0;	 Catch:{ all -> 0x0051 }
            r3.mDevice = r4;	 Catch:{ all -> 0x0051 }
            r0 = r3.mDeviceReady;	 Catch:{ all -> 0x0051 }
            r0.open();	 Catch:{ all -> 0x0051 }
            r0 = r3.mTimedOut;	 Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x003e;
        L_0x0037:
            if (r4 == 0) goto L_0x003e;
        L_0x0039:
            r4.close();	 Catch:{ all -> 0x0051 }
            monitor-exit(r1);	 Catch:{ all -> 0x0051 }
        L_0x003d:
            return;
        L_0x003e:
            monitor-exit(r1);	 Catch:{ all -> 0x0051 }
            r0 = r3.mProxy;
            if (r0 == 0) goto L_0x003d;
        L_0x0043:
            r0.onDisconnected(r4);
            goto L_0x003d;
        L_0x0047:
            r0 = r1.concat(r0);
            goto L_0x001b;
        L_0x004c:
            r0 = r4.getId();
            goto L_0x000a;
        L_0x0051:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0051 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager.OpenListener.onDisconnected(android.hardware.camera2.CameraDevice):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onError(android.hardware.camera2.CameraDevice r4, int r5) {
            /*
            r3 = this;
            r0 = com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager.VERBOSE;
            if (r0 == 0) goto L_0x0020;
        L_0x0006:
            if (r4 != 0) goto L_0x0052;
        L_0x0008:
            r0 = "null";
        L_0x000a:
            r0 = java.lang.String.valueOf(r0);
            r1 = "onError: camera ";
            r2 = r0.length();
            if (r2 != 0) goto L_0x004d;
        L_0x0016:
            r0 = new java.lang.String;
            r0.<init>(r1);
        L_0x001b:
            r1 = "BlockingCameraManager";
            android.util.Log.v(r1, r0);
        L_0x0020:
            if (r5 > 0) goto L_0x002a;
        L_0x0022:
            r0 = new java.lang.AssertionError;
            r1 = "Expected error to be a positive number";
            r0.<init>(r1);
            throw r0;
        L_0x002a:
            r1 = r3.mLock;
            monitor-enter(r1);
            r0 = 0;
            r3.mNoReply = r0;	 Catch:{ all -> 0x0057 }
            r3.mError = r5;	 Catch:{ all -> 0x0057 }
            r3.mDevice = r4;	 Catch:{ all -> 0x0057 }
            r0 = r3.mDeviceReady;	 Catch:{ all -> 0x0057 }
            r0.open();	 Catch:{ all -> 0x0057 }
            r0 = r3.mTimedOut;	 Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0044;
        L_0x003d:
            if (r4 == 0) goto L_0x0044;
        L_0x003f:
            r4.close();	 Catch:{ all -> 0x0057 }
            monitor-exit(r1);	 Catch:{ all -> 0x0057 }
        L_0x0043:
            return;
        L_0x0044:
            monitor-exit(r1);	 Catch:{ all -> 0x0057 }
            r0 = r3.mProxy;
            if (r0 == 0) goto L_0x0043;
        L_0x0049:
            r0.onError(r4, r5);
            goto L_0x0043;
        L_0x004d:
            r0 = r1.concat(r0);
            goto L_0x001b;
        L_0x0052:
            r0 = r4.getId();
            goto L_0x000a;
        L_0x0057:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0057 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager.OpenListener.onError(android.hardware.camera2.CameraDevice, int):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onOpened(android.hardware.camera2.CameraDevice r4) {
            /*
            r3 = this;
            r0 = com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager.VERBOSE;
            if (r0 == 0) goto L_0x0020;
        L_0x0006:
            if (r4 != 0) goto L_0x004c;
        L_0x0008:
            r0 = "null";
        L_0x000a:
            r0 = java.lang.String.valueOf(r0);
            r1 = "onOpened: camera ";
            r2 = r0.length();
            if (r2 != 0) goto L_0x0047;
        L_0x0016:
            r0 = new java.lang.String;
            r0.<init>(r1);
        L_0x001b:
            r1 = "BlockingCameraManager";
            android.util.Log.v(r1, r0);
        L_0x0020:
            r1 = r3.mLock;
            monitor-enter(r1);
            r3.assertInitialState();	 Catch:{ all -> 0x0051 }
            r0 = 0;
            r3.mNoReply = r0;	 Catch:{ all -> 0x0051 }
            r0 = 1;
            r3.mSuccess = r0;	 Catch:{ all -> 0x0051 }
            r3.mDevice = r4;	 Catch:{ all -> 0x0051 }
            r0 = r3.mDeviceReady;	 Catch:{ all -> 0x0051 }
            r0.open();	 Catch:{ all -> 0x0051 }
            r0 = r3.mTimedOut;	 Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x003e;
        L_0x0037:
            if (r4 == 0) goto L_0x003e;
        L_0x0039:
            r4.close();	 Catch:{ all -> 0x0051 }
            monitor-exit(r1);	 Catch:{ all -> 0x0051 }
        L_0x003d:
            return;
        L_0x003e:
            monitor-exit(r1);	 Catch:{ all -> 0x0051 }
            r0 = r3.mProxy;
            if (r0 == 0) goto L_0x003d;
        L_0x0043:
            r0.onOpened(r4);
            goto L_0x003d;
        L_0x0047:
            r0 = r1.concat(r0);
            goto L_0x001b;
        L_0x004c:
            r0 = r4.getId();
            goto L_0x000a;
        L_0x0051:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0051 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager.OpenListener.onOpened(android.hardware.camera2.CameraDevice):void");
        }
    }

    public BlockingCameraManager(CameraManager cameraManager) {
        if (cameraManager == null) {
            throw new IllegalArgumentException("manager must not be null");
        }
        this.mManager = cameraManager;
    }

    private static void assertEquals(Object obj, Object obj2) {
        if (!Objects.equals(obj, obj2)) {
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(obj2);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
            stringBuilder.append("Expected ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", but got ");
            stringBuilder.append(valueOf2);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    public CameraDevice openCamera(String str, StateCallback stateCallback, Handler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("handler must not be null");
        } else if (handler.getLooper() != Looper.myLooper()) {
            return new OpenListener(this, this.mManager, str, stateCallback, handler).blockUntilOpen();
        } else {
            throw new IllegalArgumentException("handler's looper must not be the current looper");
        }
    }
}
