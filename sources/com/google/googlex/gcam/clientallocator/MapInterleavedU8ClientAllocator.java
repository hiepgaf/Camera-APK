package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedU8Allocation;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.jri;
import p000.kbg;

/* compiled from: PG */
public class MapInterleavedU8ClientAllocator extends ClientInterleavedU8Allocator {
    public final ConcurrentMap allocatedImages = new ConcurrentHashMap();

    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        InterleavedReadViewU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        long baseAddress = getBaseAddress(interleavedImageU8);
        this.allocatedImages.put(Long.valueOf(baseAddress), interleavedImageU8);
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        interleavedU8Allocation.setId(baseAddress);
        interleavedU8Allocation.setView(interleavedImageU8);
        return interleavedU8Allocation;
    }

    public void Release(long j) {
        jri.m13153b(this.allocatedImages.containsKey(Long.valueOf(j)));
    }

    public kbg findImageFromView(InterleavedReadViewU8 interleavedReadViewU8) {
        return kbg.m4744b((InterleavedImageU8) this.allocatedImages.get(Long.valueOf(getBaseAddress(interleavedReadViewU8))));
    }

    private long getBaseAddress(InterleavedReadViewU8 interleavedReadViewU8) {
        return BufferUtils.getSwigPointerAddress(interleavedReadViewU8.base_pointer());
    }
}
