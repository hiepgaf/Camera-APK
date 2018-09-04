package com.google.googlex.gcam.image;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import p000.jri;

/* compiled from: PG */
public final class ImageUtils {
    private ImageUtils() {
    }

    private static native boolean copyContentsImpl(long j, long j2);

    public static boolean copyContents(InterleavedReadViewU8 interleavedReadViewU8, InterleavedWriteViewU8 interleavedWriteViewU8) {
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
        return copyContentsImpl(nativePointer, nativePointer2);
    }
}
