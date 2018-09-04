package com.google.googlex.gcam;

/* compiled from: PG */
public class DenoiseParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DenoiseParams() {
        this(GcamModuleJNI.new_DenoiseParams(), true);
    }

    protected DenoiseParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DenoiseParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(DenoiseParams denoiseParams) {
        return denoiseParams != null ? denoiseParams.swigCPtr : 0;
    }

    public float[] getChroma_strength() {
        return GcamModuleJNI.DenoiseParams_chroma_strength_get(this.swigCPtr, this);
    }

    public float[] getLuma_strength() {
        return GcamModuleJNI.DenoiseParams_luma_strength_get(this.swigCPtr, this);
    }

    public float[] getRevert_factor() {
        return GcamModuleJNI.DenoiseParams_revert_factor_get(this.swigCPtr, this);
    }

    public void setChroma_strength(float[] fArr) {
        GcamModuleJNI.DenoiseParams_chroma_strength_set(this.swigCPtr, this, fArr);
    }

    public void setLuma_strength(float[] fArr) {
        GcamModuleJNI.DenoiseParams_luma_strength_set(this.swigCPtr, this, fArr);
    }

    public void setRevert_factor(float[] fArr) {
        GcamModuleJNI.DenoiseParams_revert_factor_set(this.swigCPtr, this, fArr);
    }
}
