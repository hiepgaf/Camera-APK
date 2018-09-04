package com.google.googlex.gcam;

/* compiled from: PG */
public class GyroSampleVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GyroSampleVector() {
        this(GcamModuleJNI.new_GyroSampleVector__SWIG_0(), true);
    }

    public GyroSampleVector(long j) {
        this(GcamModuleJNI.new_GyroSampleVector__SWIG_1(j), true);
    }

    protected GyroSampleVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(GyroSample gyroSample) {
        GcamModuleJNI.GyroSampleVector_add(this.swigCPtr, this, GyroSample.getCPtr(gyroSample), gyroSample);
    }

    public long capacity() {
        return GcamModuleJNI.GyroSampleVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.GyroSampleVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GyroSampleVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public GyroSample get(int i) {
        return new GyroSample(GcamModuleJNI.GyroSampleVector_get(this.swigCPtr, this, i), false);
    }

    protected static long getCPtr(GyroSampleVector gyroSampleVector) {
        return gyroSampleVector != null ? gyroSampleVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.GyroSampleVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.GyroSampleVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, GyroSample gyroSample) {
        GcamModuleJNI.GyroSampleVector_set(this.swigCPtr, this, i, GyroSample.getCPtr(gyroSample), gyroSample);
    }

    public long size() {
        return GcamModuleJNI.GyroSampleVector_size(this.swigCPtr, this);
    }
}
