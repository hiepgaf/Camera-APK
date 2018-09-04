package com.google.googlex.gcam;

/* compiled from: PG */
public class FactorizeTetOptions {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FactorizeTetOptions() {
        this(GcamModuleJNI.new_FactorizeTetOptions(), true);
    }

    protected FactorizeTetOptions(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FactorizeTetOptions(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getApply_antibanding() {
        return GcamModuleJNI.FactorizeTetOptions_apply_antibanding_get(this.swigCPtr, this);
    }

    protected static long getCPtr(FactorizeTetOptions factorizeTetOptions) {
        return factorizeTetOptions != null ? factorizeTetOptions.swigCPtr : 0;
    }

    public boolean getExposure_time_from_long_ae() {
        return GcamModuleJNI.FactorizeTetOptions_exposure_time_from_long_ae_get(this.swigCPtr, this);
    }

    public float getMax_analog_gain() {
        return GcamModuleJNI.FactorizeTetOptions_max_analog_gain_get(this.swigCPtr, this);
    }

    public float getMax_exposure_time_ms() {
        return GcamModuleJNI.FactorizeTetOptions_max_exposure_time_ms_get(this.swigCPtr, this);
    }

    public float getMax_overall_gain() {
        return GcamModuleJNI.FactorizeTetOptions_max_overall_gain_get(this.swigCPtr, this);
    }

    public float getMin_exposure_time_ms() {
        return GcamModuleJNI.FactorizeTetOptions_min_exposure_time_ms_get(this.swigCPtr, this);
    }

    public boolean getVerbose() {
        return GcamModuleJNI.FactorizeTetOptions_verbose_get(this.swigCPtr, this);
    }

    public void setApply_antibanding(boolean z) {
        GcamModuleJNI.FactorizeTetOptions_apply_antibanding_set(this.swigCPtr, this, z);
    }

    public void setExposure_time_from_long_ae(boolean z) {
        GcamModuleJNI.FactorizeTetOptions_exposure_time_from_long_ae_set(this.swigCPtr, this, z);
    }

    public void setMax_analog_gain(float f) {
        GcamModuleJNI.FactorizeTetOptions_max_analog_gain_set(this.swigCPtr, this, f);
    }

    public void setMax_exposure_time_ms(float f) {
        GcamModuleJNI.FactorizeTetOptions_max_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setMax_overall_gain(float f) {
        GcamModuleJNI.FactorizeTetOptions_max_overall_gain_set(this.swigCPtr, this, f);
    }

    public void setMin_exposure_time_ms(float f) {
        GcamModuleJNI.FactorizeTetOptions_min_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setVerbose(boolean z) {
        GcamModuleJNI.FactorizeTetOptions_verbose_set(this.swigCPtr, this, z);
    }
}
