package com.google.android.apps.lightcycle.panorama;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.LightCycleProgressCallback;

/* compiled from: PG */
public class LightCycleNative {
    static {
        System.loadLibrary("lightcycle");
    }

    public static native String AddImage(float[] fArr);

    public static native void AlignNextImage();

    public static native float CalibrateFieldOfViewDeg(String str);

    public static native boolean CanUndo();

    public static native void CreateFrameTexture(int i);

    public static native int CreateNewStitchingSession();

    public static native int DeviceOrientationStatus();

    public static native float[] EndGyroCalibration(float[] fArr, int i, int i2);

    public static native void FinishCapture(boolean z, String str, String str2, int i);

    public static native float[] GetFrameGeometry(int i, int i2);

    public static native int GetNumCapturedTargets();

    public static native int GetNumTotalTargets();

    public static native int GetTargetInRange();

    public static native NewTarget[] GetTargets();

    public static native void Init(int i, int i2, float f, LightCycleProgressCallback lightCycleProgressCallback);

    public static native void InitFrameTexture(int i, int i2, int i3);

    public static native NewTarget[] InitTargets(float[] fArr);

    public static native boolean MovingTooFast();

    public static native boolean PhotoSkippedTooFast();

    public static native float[] ProcessFrame(byte[] bArr, int i, int i2, boolean z);

    public static native boolean RenderNextSession(int i);

    public static native void ResetForFisheyeCapture(String str, float f);

    public static native void ResetForHorizontalCapture(String str, float f);

    public static native void ResetForPhotoSphereCapture(String str, float f);

    public static native void ResetForVerticalCapture(String str, float f);

    public static native void ResetForWideCapture(String str, float f);

    public static native void ResetTargets();

    public static native void SetAppVersion(String str);

    public static native void SetFilteredRotation(float[] fArr);

    public static native void SetOutputResolutionLarge();

    public static native void SetOutputResolutionSmall();

    public static native void SetSensorMovementTooFast(boolean z);

    public static native void SetTargetHitAngleRadians(float f);

    public static native void StartGyroCalibration(float f);

    public static native boolean TakeNewPhoto();

    public static native boolean TargetHit();

    public static native boolean UndoAddImage();

    public static native void UpdateFrameTexture(int i);
}
