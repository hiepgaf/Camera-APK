package com.google.googlex.gcam;

/* compiled from: PG */
public class PlanarRawImageCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    protected PlanarRawImageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void ImageReady(int i, ExifMetadata exifMetadata, C0108x9250fb04 c0108x9250fb04) {
        GcamModuleJNI.PlanarRawImageCallback_ImageReady(this.swigCPtr, this, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata, C0108x9250fb04.getCPtr(c0108x9250fb04));
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PlanarRawImageCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PlanarRawImageCallback planarRawImageCallback) {
        return planarRawImageCallback != null ? planarRawImageCallback.swigCPtr : 0;
    }
}
