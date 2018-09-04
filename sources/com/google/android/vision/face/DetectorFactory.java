package com.google.android.vision.face;

import android.content.Context;
import com.google.android.vision.face.Detector.Settings;

/* compiled from: PG */
public class DetectorFactory {
    /* renamed from: a */
    public Context f2479a;
    /* renamed from: b */
    public Settings f2480b = new Settings();

    /* compiled from: PG */
    public class Callback {
    }

    public DetectorFactory(Context context) {
        this.f2479a = context;
    }

    /* renamed from: a */
    public final DetectorFactory m1361a() {
        this.f2480b.getDetectionSettings().setConfidenceThreshold(0.75f);
        return this;
    }
}
