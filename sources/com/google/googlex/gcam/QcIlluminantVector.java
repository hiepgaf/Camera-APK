package com.google.googlex.gcam;

import com.google.googlex.gcam.QcColorCalibration.IlluminantData;

/* compiled from: PG */
public class QcIlluminantVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public QcIlluminantVector() {
        this(GcamModuleJNI.new_QcIlluminantVector__SWIG_0(), true);
    }

    public QcIlluminantVector(long j) {
        this(GcamModuleJNI.new_QcIlluminantVector__SWIG_1(j), true);
    }

    protected QcIlluminantVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(IlluminantData illuminantData) {
        GcamModuleJNI.QcIlluminantVector_add(this.swigCPtr, this, IlluminantData.getCPtr(illuminantData), illuminantData);
    }

    public long capacity() {
        return GcamModuleJNI.QcIlluminantVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.QcIlluminantVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_QcIlluminantVector(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public IlluminantData get(int i) {
        return new IlluminantData(GcamModuleJNI.QcIlluminantVector_get(this.swigCPtr, this, i), false);
    }

    protected static long getCPtr(QcIlluminantVector qcIlluminantVector) {
        return qcIlluminantVector != null ? qcIlluminantVector.swigCPtr : 0;
    }

    public boolean isEmpty() {
        return GcamModuleJNI.QcIlluminantVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.QcIlluminantVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, IlluminantData illuminantData) {
        GcamModuleJNI.QcIlluminantVector_set(this.swigCPtr, this, i, IlluminantData.getCPtr(illuminantData), illuminantData);
    }

    public long size() {
        return GcamModuleJNI.QcIlluminantVector_size(this.swigCPtr, this);
    }
}
