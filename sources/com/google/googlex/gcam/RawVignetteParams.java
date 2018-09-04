package com.google.googlex.gcam;

/* compiled from: PG */
public class RawVignetteParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawVignetteParams() {
        this(GcamModuleJNI.new_RawVignetteParams(), true);
    }

    protected RawVignetteParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean IsIdentity() {
        return GcamModuleJNI.RawVignetteParams_IsIdentity(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawVignetteParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(RawVignetteParams rawVignetteParams) {
        return rawVignetteParams != null ? rawVignetteParams.swigCPtr : 0;
    }

    public float getFalloff_exponent() {
        return GcamModuleJNI.RawVignetteParams_falloff_exponent_get(this.swigCPtr, this);
    }

    public float getScale_at_corner() {
        return GcamModuleJNI.RawVignetteParams_scale_at_corner_get(this.swigCPtr, this);
    }

    public void setFalloff_exponent(float f) {
        GcamModuleJNI.RawVignetteParams_falloff_exponent_set(this.swigCPtr, this, f);
    }

    public void setScale_at_corner(float f) {
        GcamModuleJNI.RawVignetteParams_scale_at_corner_set(this.swigCPtr, this, f);
    }
}
