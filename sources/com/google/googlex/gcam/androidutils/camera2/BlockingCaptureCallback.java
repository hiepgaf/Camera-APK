package com.google.googlex.gcam.androidutils.camera2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;

/* compiled from: PG */
public class BlockingCaptureCallback extends CaptureCallback {
    public static final int CAPTURE_COMPLETED = 2;
    public static final int CAPTURE_FAILED = 3;
    public static final int CAPTURE_PROGRESSED = 1;
    public static final int CAPTURE_SEQUENCE_ABORTED = 5;
    public static final int CAPTURE_SEQUENCE_COMPLETED = 4;
    public static final int CAPTURE_STARTED = 0;
    public static final String TAG = "BlockingCaptureCallback";
    public static final boolean VERBOSE = Log.isLoggable(TAG, 2);
    public static final String[] sStateNames = new String[]{"CAPTURE_STARTED", "CAPTURE_PROGRESSED", "CAPTURE_COMPLETED", "CAPTURE_FAILED", "CAPTURE_SEQUENCE_COMPLETED", "CAPTURE_SEQUENCE_ABORTED"};
    public final CaptureCallback mProxy;
    public final StateChangeListener mStateChangeListener;
    public final StateWaiter mStateWaiter;

    public BlockingCaptureCallback() {
        this.mStateWaiter = new StateWaiter(sStateNames);
        this.mStateChangeListener = this.mStateWaiter.getListener();
        this.mProxy = null;
    }

    public BlockingCaptureCallback(CaptureCallback captureCallback) {
        this.mStateWaiter = new StateWaiter(sStateNames);
        this.mStateChangeListener = this.mStateWaiter.getListener();
        if (captureCallback == null) {
            throw new NullPointerException("listener must not be null");
        }
        this.mProxy = captureCallback;
    }

    public StateWaiter getStateWaiter() {
        return this.mStateWaiter;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        CaptureCallback captureCallback = this.mProxy;
        if (captureCallback != null) {
            captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
        this.mStateChangeListener.onStateChanged(2);
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        CaptureCallback captureCallback = this.mProxy;
        if (captureCallback != null) {
            captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
        this.mStateChangeListener.onStateChanged(3);
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        CaptureCallback captureCallback = this.mProxy;
        if (captureCallback != null) {
            captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
        this.mStateChangeListener.onStateChanged(1);
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        CaptureCallback captureCallback = this.mProxy;
        if (captureCallback != null) {
            captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
        }
        this.mStateChangeListener.onStateChanged(5);
    }

    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        CaptureCallback captureCallback = this.mProxy;
        if (captureCallback != null) {
            captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }
        this.mStateChangeListener.onStateChanged(4);
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        CaptureCallback captureCallback = this.mProxy;
        if (captureCallback != null) {
            captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
        this.mStateChangeListener.onStateChanged(0);
    }
}
