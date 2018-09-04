package com.google.googlex.gcam;

/* compiled from: PG */
public class StringVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StringVector() {
        this(GcamModuleJNI.new_StringVector__SWIG_0(), true);
    }

    public StringVector(long j) {
        this(GcamModuleJNI.new_StringVector__SWIG_1(j), true);
    }

    protected StringVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(String str) {
        GcamModuleJNI.StringVector_add(this.swigCPtr, this, str);
    }

    public long capacity() {
        return GcamModuleJNI.StringVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.StringVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StringVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public String get(int i) {
        return GcamModuleJNI.StringVector_get(this.swigCPtr, this, i);
    }

    protected static long getCPtr(StringVector stringVector) {
        return stringVector != null ? stringVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.StringVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.StringVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, String str) {
        GcamModuleJNI.StringVector_set(this.swigCPtr, this, i, str);
    }

    public long size() {
        return GcamModuleJNI.StringVector_size(this.swigCPtr, this);
    }
}
