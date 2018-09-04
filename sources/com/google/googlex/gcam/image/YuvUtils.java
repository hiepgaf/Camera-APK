package com.google.googlex.gcam.image;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import p000.jri;

/* compiled from: PG */
public final class YuvUtils {
    private YuvUtils() {
    }

    private static native boolean rgbToYuvImpl(long j, long j2);

    private static native boolean yuvToRgbImpl(long j, long j2);

    public static boolean rgbToYuv(InterleavedReadViewU8 interleavedReadViewU8, YuvWriteView yuvWriteView) {
        boolean z;
        boolean z2 = true;
        long nativePointer = BufferUtils.getNativePointer(interleavedReadViewU8);
        long nativePointer2 = BufferUtils.getNativePointer(yuvWriteView);
        if (nativePointer != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "src view is null");
        if (nativePointer2 == 0) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "dst view is null");
        return rgbToYuvImpl(nativePointer, nativePointer2);
    }

    public static boolean yuvToRgb(YuvReadView yuvReadView, InterleavedWriteViewU8 interleavedWriteViewU8) {
        boolean z;
        boolean z2 = true;
        long nativePointer = BufferUtils.getNativePointer(yuvReadView);
        long nativePointer2 = BufferUtils.getNativePointer(interleavedWriteViewU8);
        if (nativePointer != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "src view is null");
        if (nativePointer2 == 0) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "dst view is null");
        return yuvToRgbImpl(nativePointer, nativePointer2);
    }
}
