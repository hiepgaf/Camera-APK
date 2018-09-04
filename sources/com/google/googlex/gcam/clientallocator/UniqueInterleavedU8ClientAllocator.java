package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedU8Allocation;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import p000.jri;
import p000.kau;
import p000.kbg;

/* compiled from: PG */
public class UniqueInterleavedU8ClientAllocator extends ClientInterleavedU8Allocator {
    public kbg allocatedImage;
    public final long uniqueAllocationId;

    public UniqueInterleavedU8ClientAllocator() {
        this(0);
    }

    public UniqueInterleavedU8ClientAllocator(long j) {
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

    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        jri.m13154b(this.allocatedImage.mo2084b() ^ 1, (Object) "Allocate() should be called at most once.");
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        InterleavedWriteViewU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        this.allocatedImage = kbg.m4745c(interleavedImageU8);
        interleavedU8Allocation.setId(this.uniqueAllocationId);
        interleavedU8Allocation.setView(interleavedImageU8);
        return interleavedU8Allocation;
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
