package com.google.googlex.gcam;

/* compiled from: PG */
public class BadPixel {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public BadPixel() {
        this(GcamModuleJNI.new_BadPixel(), true);
    }

    protected BadPixel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_BadPixel(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getC() {
        return GcamModuleJNI.BadPixel_c_get(this.swigCPtr, this);
    }

    protected static long getCPtr(BadPixel badPixel) {
        return badPixel != null ? badPixel.swigCPtr : 0;
    }

    public int getX() {
        return GcamModuleJNI.BadPixel_x_get(this.swigCPtr, this);
    }

    public int getY() {
        return GcamModuleJNI.BadPixel_y_get(this.swigCPtr, this);
    }

    public void setC(int i) {
        GcamModuleJNI.BadPixel_c_set(this.swigCPtr, this, i);
    }

    public void setX(int i) {
        GcamModuleJNI.BadPixel_x_set(this.swigCPtr, this, i);
    }

    public void setY(int i) {
        GcamModuleJNI.BadPixel_y_set(this.swigCPtr, this, i);
    }
}
