package com.google.googlex.gcam;

/* compiled from: PG */
public class AwbMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AwbMetadata() {
        this(GcamModuleJNI.new_AwbMetadata(), true);
    }

    protected AwbMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AwbMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(AwbMetadata awbMetadata) {
        return awbMetadata != null ? awbMetadata.swigCPtr : 0;
    }

    public boolean getLock() {
        return GcamModuleJNI.AwbMetadata_lock_get(this.swigCPtr, this);
    }

    public WeightedPixelRectVector getMetering_rectangles() {
        long AwbMetadata_metering_rectangles_get = GcamModuleJNI.AwbMetadata_metering_rectangles_get(this.swigCPtr, this);
        return AwbMetadata_metering_rectangles_get != 0 ? new WeightedPixelRectVector(AwbMetadata_metering_rectangles_get, false) : null;
    }

    public int getMode() {
        return GcamModuleJNI.AwbMetadata_mode_get(this.swigCPtr, this);
    }

    public int getState() {
        return GcamModuleJNI.AwbMetadata_state_get(this.swigCPtr, this);
    }

    public void setLock(boolean z) {
        GcamModuleJNI.AwbMetadata_lock_set(this.swigCPtr, this, z);
    }

    public void setMetering_rectangles(WeightedPixelRectVector weightedPixelRectVector) {
        GcamModuleJNI.AwbMetadata_metering_rectangles_set(this.swigCPtr, this, WeightedPixelRectVector.getCPtr(weightedPixelRectVector), weightedPixelRectVector);
    }

    public void setMode(int i) {
        GcamModuleJNI.AwbMetadata_mode_set(this.swigCPtr, this, i);
    }

    public void setState(int i) {
        GcamModuleJNI.AwbMetadata_state_set(this.swigCPtr, this, i);
    }
}
