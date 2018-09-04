package com.google.googlex.gcam;

/* compiled from: PG */
public class StaticMetadataVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StaticMetadataVector() {
        this(GcamModuleJNI.new_StaticMetadataVector__SWIG_0(), true);
    }

    public StaticMetadataVector(long j) {
        this(GcamModuleJNI.new_StaticMetadataVector__SWIG_1(j), true);
    }

    protected StaticMetadataVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadataVector_add(this.swigCPtr, this, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public long capacity() {
        return GcamModuleJNI.StaticMetadataVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.StaticMetadataVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StaticMetadataVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public StaticMetadata get(int i) {
        return new StaticMetadata(GcamModuleJNI.StaticMetadataVector_get(this.swigCPtr, this, i), false);
    }

    protected static long getCPtr(StaticMetadataVector staticMetadataVector) {
        return staticMetadataVector != null ? staticMetadataVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.StaticMetadataVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.StaticMetadataVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadataVector_set(this.swigCPtr, this, i, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public long size() {
        return GcamModuleJNI.StaticMetadataVector_size(this.swigCPtr, this);
    }
}
