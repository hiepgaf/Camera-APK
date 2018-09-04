package com.google.googlex.gcam.clientallocator;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedU8Allocation;
import com.google.googlex.gcam.LockedBitmap;
import p000.jri;
import p000.kau;
import p000.kbg;

/* compiled from: PG */
public class UniqueBitmapClientAllocator extends ClientInterleavedU8Allocator {
    public static final Config BITMAP_CONFIG = Config.ARGB_8888;
    public static final int NUM_CHANNELS = 4;
    public kbg allocatedBitmap;
    public final DisplayMetrics displayMetrics;
    public LockedBitmap lock;
    public final long uniqueAllocationId;

    public UniqueBitmapClientAllocator(DisplayMetrics displayMetrics) {
        this(displayMetrics, 0);
    }

    public UniqueBitmapClientAllocator(DisplayMetrics displayMetrics, long j) {
        boolean z;
        this.allocatedBitmap = kau.f19138a;
        if (j != GcamModule.getKInvalidAllocationId()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.displayMetrics = displayMetrics;
        this.uniqueAllocationId = j;
    }

    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        boolean z;
        if (i3 == 4) {
            z = true;
        } else {
            z = false;
        }
        jri.m13146a(z, "Server requested an InterleavedImageU8 of %s channels, but UniqueBitmapClientAllocator only supports %s.", i3, 4);
        jri.m13154b(this.allocatedBitmap.mo2084b() ^ 1, (Object) "Allocate() should be called at most once.");
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        Bitmap createBitmap = Bitmap.createBitmap(this.displayMetrics, i, i2, BITMAP_CONFIG);
        this.allocatedBitmap = kbg.m4745c(createBitmap);
        this.lock = LockedBitmap.acquire(createBitmap);
        interleavedU8Allocation.setId(this.uniqueAllocationId);
        interleavedU8Allocation.setView(this.lock.view());
        return interleavedU8Allocation;
    }

    public void Release(long j) {
        boolean z;
        boolean z2 = true;
        if (j == this.uniqueAllocationId) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jri.m13154b(this.allocatedBitmap.mo2084b(), (Object) "Release() was called before Allocate().");
        if (this.lock == null) {
            z2 = false;
        }
        jri.m13154b(z2, (Object) "Release() was called more than once.");
        this.lock.close();
        this.lock = null;
    }

    public kbg getBitmap() {
        return this.allocatedBitmap;
    }
}
