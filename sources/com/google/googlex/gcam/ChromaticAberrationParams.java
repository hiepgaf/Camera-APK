package com.google.googlex.gcam;

/* compiled from: PG */
public class ChromaticAberrationParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ChromaticAberrationParams() {
        this(GcamModuleJNI.new_ChromaticAberrationParams(), true);
    }

    protected ChromaticAberrationParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ChromaticAberrationParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ChromaticAberrationParams chromaticAberrationParams) {
        return chromaticAberrationParams != null ? chromaticAberrationParams.swigCPtr : 0;
    }

    public float getChroma_threshold() {
        return GcamModuleJNI.ChromaticAberrationParams_chroma_threshold_get(this.swigCPtr, this);
    }

    public float getLuma_threshold() {
        return GcamModuleJNI.ChromaticAberrationParams_luma_threshold_get(this.swigCPtr, this);
    }

    public int getRadius() {
        return GcamModuleJNI.ChromaticAberrationParams_radius_get(this.swigCPtr, this);
    }

    public float getSuppression() {
        return GcamModuleJNI.ChromaticAberrationParams_suppression_get(this.swigCPtr, this);
    }

    public void setChroma_threshold(float f) {
        GcamModuleJNI.ChromaticAberrationParams_chroma_threshold_set(this.swigCPtr, this, f);
    }

    public void setLuma_threshold(float f) {
        GcamModuleJNI.ChromaticAberrationParams_luma_threshold_set(this.swigCPtr, this, f);
    }

    public void setRadius(int i) {
        GcamModuleJNI.ChromaticAberrationParams_radius_set(this.swigCPtr, this, i);
    }

    public void setSuppression(float f) {
        GcamModuleJNI.ChromaticAberrationParams_suppression_set(this.swigCPtr, this, f);
    }
}
