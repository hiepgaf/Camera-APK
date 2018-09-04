package com.google.googlex.gcam;

import android.annotation.TargetApi;
import android.view.Surface;
import p000.jri;

@TargetApi(19)
/* compiled from: PG */
public class LockedSurface implements AutoCloseable {
    public long nativePointer;

    private LockedSurface(Surface surface) {
        jri.m13152b((Object) surface);
        this.nativePointer = AndroidJniUtils.lockSurface(surface);
        if (this.nativePointer == 0) {
            throw new IllegalArgumentException("Failed to lock Surface.");
        }
    }

    public static LockedSurface acquire(Surface surface) {
        return new LockedSurface(surface);
    }

    public void close() {
        long j = this.nativePointer;
        if (j != 0) {
            AndroidJniUtils.unlockSurface(j);
            this.nativePointer = 0;
        }
    }

    public long nativePointer() {
        return this.nativePointer;
    }
}
