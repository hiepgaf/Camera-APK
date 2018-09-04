package com.google.android.apps.refocus.processing;

import p000.hec;

/* compiled from: PG */
public interface ProgressCallback {
    void cancel();

    void setProgress(float f);

    void setRange(float f, float f2);

    void setStatus(hec hec);

    boolean wasCancelled();
}
