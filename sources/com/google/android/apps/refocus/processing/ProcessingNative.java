package com.google.android.apps.refocus.processing;

import android.graphics.Bitmap;
import com.google.android.apps.refocus.capture.TrackerStats;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.image.RGBZ;

/* compiled from: PG */
public class ProcessingNative {
    static {
        System.loadLibrary("refocus");
    }

    public static native void AddFrame(ColorImage colorImage, float f);

    public static native RGBZ ComputeRGBZ(Bitmap bitmap, boolean z);

    public static native boolean DepthOfField(DepthOfFieldOptions depthOfFieldOptions, ProgressCallback progressCallback, Bitmap bitmap);

    public static native String Experimentation();

    public static native void GetFrameAverageMotion(float[] fArr);

    public static native int GetNumActiveTracks();

    public static native int GetTrackedPoints(float[] fArr);

    public static native void GetTrackerStats(TrackerStats trackerStats);

    public static native float ImageGradientMeasure(ColorImage colorImage);

    public static native void Init(int i, int i2, int i3, int i4, boolean z, ProgressCallback progressCallback);

    public static native float RefineRotationAndGetParallax(float[] fArr);

    public static native void StartTracker(int i, int i2);

    public static native void StopTracker();

    public static native void TrackFrame(ColorImage colorImage);
}
