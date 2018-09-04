package com.google.googlex.gcam.hdrplus;

import android.util.LongSparseArray;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.ImageReleaseCallback;
import p000.iwz;
import p000.jri;

/* compiled from: PG */
public class MapImageProxyReleaseCallback extends ImageReleaseCallback {
    public static final long INVALID_IMAGE_ID = GcamModule.getKInvalidImageId();
    public final LongSparseArray imageMap = new LongSparseArray();
    public final Object lock = new Object();
    public long nextUniqueId = 0;

    public void Run(long j) {
        boolean z = true;
        if (j == INVALID_IMAGE_ID) {
            z = false;
        }
        jri.m13147a(z, "imageId was INVALID_IMAGE_ID (%s).", INVALID_IMAGE_ID);
        synchronized (this.lock) {
            iwz iwz = (iwz) this.imageMap.get(j);
            String str = "MapImageProxyReleaseCallback does not contain the key %s.";
            if (iwz == null) {
                throw new IllegalStateException(jri.m13141a(str, Long.valueOf(j)));
            }
            iwz.close();
            this.imageMap.remove(j);
        }
    }

    private long getNextUniqueId() {
        long j;
        synchronized (this.lock) {
            j = this.nextUniqueId;
            this.nextUniqueId = 1 + j;
        }
        return j;
    }

    public long put(iwz iwz) {
        long nextUniqueId;
        synchronized (this.lock) {
            boolean z;
            if (this.imageMap.indexOfValue(iwz) < 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "image has already been put in MapImageProxyReleaseCallback.");
            nextUniqueId = getNextUniqueId();
            this.imageMap.append(nextUniqueId, iwz);
        }
        return nextUniqueId;
    }
}
