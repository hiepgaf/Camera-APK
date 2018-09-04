package com.google.googlex.gcam;

/* compiled from: PG */
public class DngColorCalibrationVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DngColorCalibrationVector() {
        this(GcamModuleJNI.new_DngColorCalibrationVector__SWIG_0(), true);
    }

    public DngColorCalibrationVector(long j) {
        this(GcamModuleJNI.new_DngColorCalibrationVector__SWIG_1(j), true);
    }

    protected DngColorCalibrationVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(DngColorCalibration dngColorCalibration) {
        GcamModuleJNI.DngColorCalibrationVector_add(this.swigCPtr, this, DngColorCalibration.getCPtr(dngColorCalibration), dngColorCalibration);
    }

    public long capacity() {
        return GcamModuleJNI.DngColorCalibrationVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.DngColorCalibrationVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DngColorCalibrationVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public DngColorCalibration get(int i) {
        return new DngColorCalibration(GcamModuleJNI.DngColorCalibrationVector_get(this.swigCPtr, this, i), false);
    }

    protected static long getCPtr(DngColorCalibrationVector dngColorCalibrationVector) {
        return dngColorCalibrationVector != null ? dngColorCalibrationVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.DngColorCalibrationVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.DngColorCalibrationVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, DngColorCalibration dngColorCalibration) {
        GcamModuleJNI.DngColorCalibrationVector_set(this.swigCPtr, this, i, DngColorCalibration.getCPtr(dngColorCalibration), dngColorCalibration);
    }

    public long size() {
        return GcamModuleJNI.DngColorCalibrationVector_size(this.swigCPtr, this);
    }
}
