package com.google.googlex.gcam;

/* compiled from: PG */
public class PixelRectVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PixelRectVector() {
        this(GcamModuleJNI.new_PixelRectVector__SWIG_0(), true);
    }

    public PixelRectVector(long j) {
        this(GcamModuleJNI.new_PixelRectVector__SWIG_1(j), true);
    }

    protected PixelRectVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(PixelRect pixelRect) {
        GcamModuleJNI.PixelRectVector_add(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public long capacity() {
        return GcamModuleJNI.PixelRectVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.PixelRectVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PixelRectVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public PixelRect get(int i) {
        return new PixelRect(GcamModuleJNI.PixelRectVector_get(this.swigCPtr, this, i), false);
    }

    protected static long getCPtr(PixelRectVector pixelRectVector) {
        return pixelRectVector != null ? pixelRectVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.PixelRectVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.PixelRectVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, PixelRect pixelRect) {
        GcamModuleJNI.PixelRectVector_set(this.swigCPtr, this, i, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public long size() {
        return GcamModuleJNI.PixelRectVector_size(this.swigCPtr, this);
    }
}
