package com.google.googlex.gcam;

/* compiled from: PG */
public class AfMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AfMetadata() {
        this(GcamModuleJNI.new_AfMetadata(), true);
    }

    protected AfMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AfMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(AfMetadata afMetadata) {
        return afMetadata != null ? afMetadata.swigCPtr : 0;
    }

    public WeightedPixelRectVector getMetering_rectangles() {
        long AfMetadata_metering_rectangles_get = GcamModuleJNI.AfMetadata_metering_rectangles_get(this.swigCPtr, this);
        return AfMetadata_metering_rectangles_get != 0 ? new WeightedPixelRectVector(AfMetadata_metering_rectangles_get, false) : null;
    }

    public int getMode() {
        return GcamModuleJNI.AfMetadata_mode_get(this.swigCPtr, this);
    }

    public int getState() {
        return GcamModuleJNI.AfMetadata_state_get(this.swigCPtr, this);
    }

    public int getTrigger() {
        return GcamModuleJNI.AfMetadata_trigger_get(this.swigCPtr, this);
    }

    public void setMetering_rectangles(WeightedPixelRectVector weightedPixelRectVector) {
        GcamModuleJNI.AfMetadata_metering_rectangles_set(this.swigCPtr, this, WeightedPixelRectVector.getCPtr(weightedPixelRectVector), weightedPixelRectVector);
    }

    public void setMode(int i) {
        GcamModuleJNI.AfMetadata_mode_set(this.swigCPtr, this, i);
    }

    public void setState(int i) {
        GcamModuleJNI.AfMetadata_state_set(this.swigCPtr, this, i);
    }

    public void setTrigger(int i) {
        GcamModuleJNI.AfMetadata_trigger_set(this.swigCPtr, this, i);
    }
}
