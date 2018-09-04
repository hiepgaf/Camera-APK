package com.google.googlex.gcam.imageproc;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import p000.jri;

/* compiled from: PG */
public final class Resample {
    private Resample() {
    }

    private static native boolean downsampleImpl(long j, int i, long j2);

    private static native boolean resampleLanczosImpl(long j, float f, long j2);

    public static boolean downsample(YuvReadView yuvReadView, int i, YuvWriteView yuvWriteView) {
        boolean z;
        boolean z2 = true;
        long nativePointer = BufferUtils.getNativePointer(yuvReadView);
        long nativePointer2 = BufferUtils.getNativePointer(yuvWriteView);
        if (nativePointer != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "src is null");
        if (nativePointer2 == 0) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "dst is null");
        return downsampleImpl(nativePointer, i, nativePointer2);
    }

    public static boolean resampleLanczos(InterleavedReadViewU8 interleavedReadViewU8, float f, InterleavedWriteViewU8 interleavedWriteViewU8) {
        boolean z;
        boolean z2 = true;
        long nativePointer = BufferUtils.getNativePointer(interleavedReadViewU8);
        long nativePointer2 = BufferUtils.getNativePointer(interleavedWriteViewU8);
        if (nativePointer != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "src is null");
        if (nativePointer2 == 0) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "dst is null");
        return resampleLanczosImpl(nativePointer, f, nativePointer2);
    }
}
