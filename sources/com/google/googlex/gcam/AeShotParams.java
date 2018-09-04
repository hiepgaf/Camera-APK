package com.google.googlex.gcam;

/* compiled from: PG */
public class AeShotParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AeShotParams() {
        this(GcamModuleJNI.new_AeShotParams(), true);
    }

    protected AeShotParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(AeShotParams aeShotParams) {
        return GcamModuleJNI.AeShotParams_Equals(this.swigCPtr, this, getCPtr(aeShotParams), aeShotParams);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AeShotParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(AeShotParams aeShotParams) {
        return aeShotParams != null ? aeShotParams.swigCPtr : 0;
    }

    public NormalizedRect getCrop() {
        long AeShotParams_crop_get = GcamModuleJNI.AeShotParams_crop_get(this.swigCPtr, this);
        return AeShotParams_crop_get != 0 ? new NormalizedRect(AeShotParams_crop_get, false) : null;
    }

    public float getExposure_compensation() {
        return GcamModuleJNI.AeShotParams_exposure_compensation_get(this.swigCPtr, this);
    }

    public int getHdr_mode() {
        return GcamModuleJNI.AeShotParams_hdr_mode_get(this.swigCPtr, this);
    }

    public int getTarget_height() {
        return GcamModuleJNI.AeShotParams_target_height_get(this.swigCPtr, this);
    }

    public int getTarget_width() {
        return GcamModuleJNI.AeShotParams_target_width_get(this.swigCPtr, this);
    }

    public WeightedNormalizedRectVector getWeighted_metering_areas() {
        long AeShotParams_weighted_metering_areas_get = GcamModuleJNI.AeShotParams_weighted_metering_areas_get(this.swigCPtr, this);
        return AeShotParams_weighted_metering_areas_get != 0 ? new WeightedNormalizedRectVector(AeShotParams_weighted_metering_areas_get, false) : null;
    }

    public void setCrop(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_crop_set(this.swigCPtr, this, NormalizedRect.getCPtr(normalizedRect), normalizedRect);
    }

    public void setExposure_compensation(float f) {
        GcamModuleJNI.AeShotParams_exposure_compensation_set(this.swigCPtr, this, f);
    }

    public void setHdr_mode(int i) {
        GcamModuleJNI.AeShotParams_hdr_mode_set(this.swigCPtr, this, i);
    }

    public void setTarget_height(int i) {
        GcamModuleJNI.AeShotParams_target_height_set(this.swigCPtr, this, i);
    }

    public void setTarget_width(int i) {
        GcamModuleJNI.AeShotParams_target_width_set(this.swigCPtr, this, i);
    }

    public void setWeighted_metering_areas(WeightedNormalizedRectVector weightedNormalizedRectVector) {
        GcamModuleJNI.AeShotParams_weighted_metering_areas_set(this.swigCPtr, this, WeightedNormalizedRectVector.getCPtr(weightedNormalizedRectVector), weightedNormalizedRectVector);
    }
}
