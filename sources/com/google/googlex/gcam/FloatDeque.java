package com.google.googlex.gcam;

/* compiled from: PG */
public class FloatDeque {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FloatDeque() {
        this(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }

    public FloatDeque(long j) {
        this(GcamModuleJNI.new_FloatDeque__SWIG_2(j), true);
    }

    public FloatDeque(long j, float f) {
        this(GcamModuleJNI.new_FloatDeque__SWIG_1(j, f), true);
    }

    protected FloatDeque(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public FloatDeque(FloatDeque floatDeque) {
        this(GcamModuleJNI.new_FloatDeque__SWIG_3(getCPtr(floatDeque), floatDeque), true);
    }

    public void assign(long j, float f) {
        GcamModuleJNI.FloatDeque_assign(this.swigCPtr, this, j, f);
    }

    public float back() {
        return GcamModuleJNI.FloatDeque_back(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.FloatDeque_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FloatDeque(j);
            }
            this.swigCPtr = 0;
        }
    }

    public void delitem(int i) {
        GcamModuleJNI.FloatDeque_delitem(this.swigCPtr, this, i);
    }

    public void delslice(int i, int i2) {
        GcamModuleJNI.FloatDeque_delslice(this.swigCPtr, this, i, i2);
    }

    public boolean empty() {
        return GcamModuleJNI.FloatDeque_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public float front() {
        return GcamModuleJNI.FloatDeque_front(this.swigCPtr, this);
    }

    protected static long getCPtr(FloatDeque floatDeque) {
        return floatDeque != null ? floatDeque.swigCPtr : 0;
    }

    public float getitem(int i) {
        return GcamModuleJNI.FloatDeque_getitem(this.swigCPtr, this, i);
    }

    public FloatDeque getslice(int i, int i2) {
        return new FloatDeque(GcamModuleJNI.FloatDeque_getslice(this.swigCPtr, this, i, i2), true);
    }

    public long max_size() {
        return GcamModuleJNI.FloatDeque_max_size(this.swigCPtr, this);
    }

    public void pop_back() {
        GcamModuleJNI.FloatDeque_pop_back(this.swigCPtr, this);
    }

    public void pop_front() {
        GcamModuleJNI.FloatDeque_pop_front(this.swigCPtr, this);
    }

    public void push_back(float f) {
        GcamModuleJNI.FloatDeque_push_back(this.swigCPtr, this, f);
    }

    public void push_front(float f) {
        GcamModuleJNI.FloatDeque_push_front(this.swigCPtr, this, f);
    }

    public void resize(long j) {
        GcamModuleJNI.FloatDeque_resize__SWIG_1(this.swigCPtr, this, j);
    }

    public void resize(long j, float f) {
        GcamModuleJNI.FloatDeque_resize__SWIG_0(this.swigCPtr, this, j, f);
    }

    public void setitem(int i, float f) {
        GcamModuleJNI.FloatDeque_setitem(this.swigCPtr, this, i, f);
    }

    public void setslice(int i, int i2, FloatDeque floatDeque) {
        GcamModuleJNI.FloatDeque_setslice(this.swigCPtr, this, i, i2, getCPtr(floatDeque), floatDeque);
    }

    public long size() {
        return GcamModuleJNI.FloatDeque_size(this.swigCPtr, this);
    }

    public void swap(FloatDeque floatDeque) {
        GcamModuleJNI.FloatDeque_swap(this.swigCPtr, this, getCPtr(floatDeque), floatDeque);
    }
}
