package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.ClientYuvAllocator;
import com.google.googlex.gcam.YuvAllocation;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.jri;
import p000.kbg;

/* compiled from: PG */
public class MapYuvClientAllocator extends ClientYuvAllocator {
    public final ConcurrentMap allocatedImages = new ConcurrentHashMap();

    public YuvAllocation Allocate(int i, int i2, int i3) {
        YuvReadView yuvImage = new YuvImage(i, i2, i3);
        long baseAddress = getBaseAddress(yuvImage);
        this.allocatedImages.put(Long.valueOf(baseAddress), yuvImage);
        YuvAllocation yuvAllocation = new YuvAllocation();
        yuvAllocation.setId(baseAddress);
        yuvAllocation.setView(yuvImage);
        return yuvAllocation;
    }

    public void Release(long j) {
        jri.m13153b(this.allocatedImages.containsKey(Long.valueOf(j)));
    }

    public kbg findImageFromView(YuvReadView yuvReadView) {
        return kbg.m4744b((YuvImage) this.allocatedImages.get(Long.valueOf(getBaseAddress(yuvReadView))));
    }

    private long getBaseAddress(YuvReadView yuvReadView) {
        return BufferUtils.getSwigPointerAddress(yuvReadView.luma_read_view().base_pointer());
    }
}
