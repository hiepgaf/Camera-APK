package com.google.googlex.gcam;

/* compiled from: PG */
public class TetFactorization {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public TetFactorization() {
        this(GcamModuleJNI.new_TetFactorization(), true);
    }

    protected TetFactorization(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_TetFactorization(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getAnalog_gain() {
        return GcamModuleJNI.TetFactorization_analog_gain_get(this.swigCPtr, this);
    }

    protected static long getCPtr(TetFactorization tetFactorization) {
        return tetFactorization != null ? tetFactorization.swigCPtr : 0;
    }

    public float getDigital_gain() {
        return GcamModuleJNI.TetFactorization_digital_gain_get(this.swigCPtr, this);
    }

    public float getExposure_time_ms() {
        return GcamModuleJNI.TetFactorization_exposure_time_ms_get(this.swigCPtr, this);
    }

    public void setAnalog_gain(float f) {
        GcamModuleJNI.TetFactorization_analog_gain_set(this.swigCPtr, this, f);
    }

    public void setDigital_gain(float f) {
        GcamModuleJNI.TetFactorization_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setExposure_time_ms(float f) {
        GcamModuleJNI.TetFactorization_exposure_time_ms_set(this.swigCPtr, this, f);
    }
}
