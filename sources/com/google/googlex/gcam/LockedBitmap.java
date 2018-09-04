package com.google.googlex.gcam;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p000.jri;

@TargetApi(19)
/* compiled from: PG */
public class LockedBitmap implements AutoCloseable {
    public final Bitmap bitmap;
    public long nativePointer;
    public final InterleavedWriteViewU8 view;

    private LockedBitmap(Bitmap bitmap) {
        boolean z;
        this.bitmap = (Bitmap) jri.m13152b((Object) bitmap);
        jri.m13148a(bitmap.getConfig().equals(Config.ARGB_8888), "Bitmap Config must be ARGB_8888", bitmap.getConfig());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int rowBytes = bitmap.getRowBytes() - (width << 2);
        int i = rowBytes / 4;
        if (rowBytes % 4 == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13146a(z, "Bitmap's row padding in bytes (%s) must evenly divide the number of channels (%s)", rowBytes, 4);
        this.nativePointer = AndroidJniUtils.lockBitmap(bitmap);
        long j = this.nativePointer;
        if (j == 0) {
            throw new IllegalArgumentException("Failed to lock bitmap.");
        }
        this.view = new InterleavedWriteViewU8(width, height, 4, new SWIGTYPE_p_unsigned_char(j, false), (long) i);
    }

    public static LockedBitmap acquire(Bitmap bitmap) {
        return new LockedBitmap(bitmap);
    }

    public void close() {
        if (this.nativePointer != 0) {
            AndroidJniUtils.unlockBitmap(this.bitmap);
            this.nativePointer = 0;
        }
    }

    protected void finalize() {
        close();
    }

    public InterleavedWriteViewU8 view() {
        return this.view;
    }
}
