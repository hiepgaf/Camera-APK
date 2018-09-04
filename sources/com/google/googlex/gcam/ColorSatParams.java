package com.google.googlex.gcam;

/* compiled from: PG */
public class ColorSatParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ColorSatParams() {
        this(GcamModuleJNI.new_ColorSatParams(), true);
    }

    protected ColorSatParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean IsIdentity() {
        return GcamModuleJNI.ColorSatParams_IsIdentity(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ColorSatParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ColorSatParams colorSatParams) {
        return colorSatParams != null ? colorSatParams.swigCPtr : 0;
    }

    public float getHighlight_saturation() {
        return GcamModuleJNI.ColorSatParams_highlight_saturation_get(this.swigCPtr, this);
    }

    public float getShadow_saturation() {
        return GcamModuleJNI.ColorSatParams_shadow_saturation_get(this.swigCPtr, this);
    }

    public void setHighlight_saturation(float f) {
        GcamModuleJNI.ColorSatParams_highlight_saturation_set(this.swigCPtr, this, f);
    }

    public void setShadow_saturation(float f) {
        GcamModuleJNI.ColorSatParams_shadow_saturation_set(this.swigCPtr, this, f);
    }
}
