package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientInterleavedU16Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedU16Allocation;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import p000.jri;
import p000.kau;
import p000.kbg;

/* compiled from: PG */
public class UniqueInterleavedU16ClientAllocator extends ClientInterleavedU16Allocator {
    public kbg allocatedImage;
    public final long uniqueAllocationId;

    public UniqueInterleavedU16ClientAllocator() {
        this(0);
    }

    public UniqueInterleavedU16ClientAllocator(long j) {
        boolean z;
        this.allocatedImage = kau.f19138a;
        if (j != GcamModule.getKInvalidAllocationId()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.uniqueAllocationId = j;
    }

    public InterleavedU16Allocation Allocate(int i, int i2, int i3) {
        jri.m13154b(this.allocatedImage.mo2084b() ^ 1, (Object) "Allocate() should be called at most once.");
        InterleavedU16Allocation interleavedU16Allocation = new InterleavedU16Allocation();
        InterleavedWriteViewU16 interleavedImageU16 = new InterleavedImageU16(i, i2, i3);
        this.allocatedImage = kbg.m4745c(interleavedImageU16);
        interleavedU16Allocation.setId(this.uniqueAllocationId);
        interleavedU16Allocation.setView(interleavedImageU16);
        return interleavedU16Allocation;
    }

    public void Release(long j) {
        boolean z;
        if (j == this.uniqueAllocationId) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jri.m13154b(this.allocatedImage.mo2084b(), (Object) "Release() was called before Allocate().");
    }

    public kbg getImage() {
        return this.allocatedImage;
    }
}
