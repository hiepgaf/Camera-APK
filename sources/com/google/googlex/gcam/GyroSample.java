package com.google.googlex.gcam;

/* compiled from: PG */
public class GyroSample {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GyroSample() {
        this(GcamModuleJNI.new_GyroSample(), true);
    }

    protected GyroSample(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(GyroSample gyroSample) {
        return GcamModuleJNI.GyroSample_Equals(this.swigCPtr, this, getCPtr(gyroSample), gyroSample);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GyroSample(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(GyroSample gyroSample) {
        return gyroSample != null ? gyroSample.swigCPtr : 0;
    }

    public long getTimestamp_ns() {
        return GcamModuleJNI.GyroSample_timestamp_ns_get(this.swigCPtr, this);
    }

    public float getX() {
        return GcamModuleJNI.GyroSample_x_get(this.swigCPtr, this);
    }

    public float getY() {
        return GcamModuleJNI.GyroSample_y_get(this.swigCPtr, this);
    }

    public float getZ() {
        return GcamModuleJNI.GyroSample_z_get(this.swigCPtr, this);
    }

    public void setTimestamp_ns(long j) {
        GcamModuleJNI.GyroSample_timestamp_ns_set(this.swigCPtr, this, j);
    }

    public void setX(float f) {
        GcamModuleJNI.GyroSample_x_set(this.swigCPtr, this, f);
    }

    public void setY(float f) {
        GcamModuleJNI.GyroSample_y_set(this.swigCPtr, this, f);
    }

    public void setZ(float f) {
        GcamModuleJNI.GyroSample_z_set(this.swigCPtr, this, f);
    }
}
