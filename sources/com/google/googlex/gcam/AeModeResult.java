package com.google.googlex.gcam;

/* compiled from: PG */
public class AeModeResult {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AeModeResult() {
        this(GcamModuleJNI.new_AeModeResult(), true);
    }

    protected AeModeResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AeModeResult(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(AeModeResult aeModeResult) {
        return aeModeResult != null ? aeModeResult.swigCPtr : 0;
    }

    public float getConfidence() {
        return GcamModuleJNI.AeModeResult_confidence_get(this.swigCPtr, this);
    }

    public float getLog_scene_brightness() {
        return GcamModuleJNI.AeModeResult_log_scene_brightness_get(this.swigCPtr, this);
    }

    public float getTarget_avg_ldr() {
        return GcamModuleJNI.AeModeResult_target_avg_ldr_get(this.swigCPtr, this);
    }

    public float getTet() {
        return GcamModuleJNI.AeModeResult_tet_get(this.swigCPtr, this);
    }

    public void setConfidence(float f) {
        GcamModuleJNI.AeModeResult_confidence_set(this.swigCPtr, this, f);
    }

    public void setLog_scene_brightness(float f) {
        GcamModuleJNI.AeModeResult_log_scene_brightness_set(this.swigCPtr, this, f);
    }

    public void setTarget_avg_ldr(float f) {
        GcamModuleJNI.AeModeResult_target_avg_ldr_set(this.swigCPtr, this, f);
    }

    public void setTet(float f) {
        GcamModuleJNI.AeModeResult_tet_set(this.swigCPtr, this, f);
    }
}
