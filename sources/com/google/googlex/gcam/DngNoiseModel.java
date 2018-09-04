package com.google.googlex.gcam;

/* compiled from: PG */
public class DngNoiseModel {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DngNoiseModel() {
        this(GcamModuleJNI.new_DngNoiseModel(), true);
    }

    protected DngNoiseModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.DngNoiseModel_Check(this.swigCPtr, this);
    }

    public boolean Equals(DngNoiseModel dngNoiseModel) {
        return GcamModuleJNI.DngNoiseModel_Equals(this.swigCPtr, this, getCPtr(dngNoiseModel), dngNoiseModel);
    }

    protected static long[] cArrayUnwrap(DngNoiseModel[] dngNoiseModelArr) {
        long[] jArr = new long[dngNoiseModelArr.length];
        for (int i = 0; i < dngNoiseModelArr.length; i++) {
            jArr[i] = getCPtr(dngNoiseModelArr[i]);
        }
        return jArr;
    }

    protected static DngNoiseModel[] cArrayWrap(long[] jArr, boolean z) {
        DngNoiseModel[] dngNoiseModelArr = new DngNoiseModel[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            dngNoiseModelArr[i] = new DngNoiseModel(jArr[i], z);
        }
        return dngNoiseModelArr;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DngNoiseModel(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(DngNoiseModel dngNoiseModel) {
        return dngNoiseModel != null ? dngNoiseModel.swigCPtr : 0;
    }

    public float getOffset() {
        return GcamModuleJNI.DngNoiseModel_offset_get(this.swigCPtr, this);
    }

    public float getScale() {
        return GcamModuleJNI.DngNoiseModel_scale_get(this.swigCPtr, this);
    }

    public void setOffset(float f) {
        GcamModuleJNI.DngNoiseModel_offset_set(this.swigCPtr, this, f);
    }

    public void setScale(float f) {
        GcamModuleJNI.DngNoiseModel_scale_set(this.swigCPtr, this, f);
    }
}
