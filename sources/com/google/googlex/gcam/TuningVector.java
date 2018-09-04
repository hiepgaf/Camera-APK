package com.google.googlex.gcam;

/* compiled from: PG */
public class TuningVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public TuningVector() {
        this(GcamModuleJNI.new_TuningVector__SWIG_0(), true);
    }

    public TuningVector(long j) {
        this(GcamModuleJNI.new_TuningVector__SWIG_1(j), true);
    }

    protected TuningVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(Tuning tuning) {
        GcamModuleJNI.TuningVector_add(this.swigCPtr, this, Tuning.getCPtr(tuning), tuning);
    }

    public long capacity() {
        return GcamModuleJNI.TuningVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.TuningVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_TuningVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public Tuning get(int i) {
        return new Tuning(GcamModuleJNI.TuningVector_get(this.swigCPtr, this, i), false);
    }

    protected static long getCPtr(TuningVector tuningVector) {
        return tuningVector != null ? tuningVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.TuningVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.TuningVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, Tuning tuning) {
        GcamModuleJNI.TuningVector_set(this.swigCPtr, this, i, Tuning.getCPtr(tuning), tuning);
    }

    public long size() {
        return GcamModuleJNI.TuningVector_size(this.swigCPtr, this);
    }
}
