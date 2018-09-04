package com.google.googlex.gcam;

/* compiled from: PG */
public class SensorNoiseModel {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public SensorNoiseModel() {
        this(GcamModuleJNI.new_SensorNoiseModel(), true);
    }

    protected SensorNoiseModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.SensorNoiseModel_Check(this.swigCPtr, this);
    }

    public DngNoiseModel DngNoiseModelForGain(float f, float f2) {
        return new DngNoiseModel(GcamModuleJNI.SensorNoiseModel_DngNoiseModelForGain(this.swigCPtr, this, f, f2), true);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_SensorNoiseModel(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(SensorNoiseModel sensorNoiseModel) {
        return sensorNoiseModel != null ? sensorNoiseModel.swigCPtr : 0;
    }

    public float getOffset_a() {
        return GcamModuleJNI.SensorNoiseModel_offset_a_get(this.swigCPtr, this);
    }

    public float getOffset_b() {
        return GcamModuleJNI.SensorNoiseModel_offset_b_get(this.swigCPtr, this);
    }

    public float getScale_a() {
        return GcamModuleJNI.SensorNoiseModel_scale_a_get(this.swigCPtr, this);
    }

    public float getScale_b() {
        return GcamModuleJNI.SensorNoiseModel_scale_b_get(this.swigCPtr, this);
    }

    public void setOffset_a(float f) {
        GcamModuleJNI.SensorNoiseModel_offset_a_set(this.swigCPtr, this, f);
    }

    public void setOffset_b(float f) {
        GcamModuleJNI.SensorNoiseModel_offset_b_set(this.swigCPtr, this, f);
    }

    public void setScale_a(float f) {
        GcamModuleJNI.SensorNoiseModel_scale_a_set(this.swigCPtr, this, f);
    }

    public void setScale_b(float f) {
        GcamModuleJNI.SensorNoiseModel_scale_b_set(this.swigCPtr, this, f);
    }
}
