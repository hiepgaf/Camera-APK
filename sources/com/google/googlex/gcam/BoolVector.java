package com.google.googlex.gcam;

/* compiled from: PG */
public class BoolVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public BoolVector() {
        this(GcamModuleJNI.new_BoolVector__SWIG_0(), true);
    }

    public BoolVector(long j) {
        this(GcamModuleJNI.new_BoolVector__SWIG_1(j), true);
    }

    protected BoolVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(boolean z) {
        GcamModuleJNI.BoolVector_add(this.swigCPtr, this, z);
    }

    public long capacity() {
        return GcamModuleJNI.BoolVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.BoolVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_BoolVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean get(int i) {
        return GcamModuleJNI.BoolVector_get(this.swigCPtr, this, i);
    }

    protected static long getCPtr(BoolVector boolVector) {
        return boolVector != null ? boolVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.BoolVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.BoolVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, boolean z) {
        GcamModuleJNI.BoolVector_set(this.swigCPtr, this, i, z);
    }

    public long size() {
        return GcamModuleJNI.BoolVector_size(this.swigCPtr, this);
    }
}
