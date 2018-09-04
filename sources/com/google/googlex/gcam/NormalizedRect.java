package com.google.googlex.gcam;

/* compiled from: PG */
public class NormalizedRect {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public NormalizedRect() {
        this(GcamModuleJNI.new_NormalizedRect(), true);
    }

    protected NormalizedRect(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public float AspectRatio() {
        return GcamModuleJNI.NormalizedRect_AspectRatio(this.swigCPtr, this);
    }

    public boolean Check() {
        return GcamModuleJNI.NormalizedRect_Check(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.NormalizedRect_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(NormalizedRect normalizedRect) {
        return GcamModuleJNI.NormalizedRect_Equals(this.swigCPtr, this, getCPtr(normalizedRect), normalizedRect);
    }

    public float InverseAspectRatio() {
        return GcamModuleJNI.NormalizedRect_InverseAspectRatio(this.swigCPtr, this);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.NormalizedRect_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string, int i) {
        GcamModuleJNI.NormalizedRect_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NormalizedRect(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(NormalizedRect normalizedRect) {
        return normalizedRect != null ? normalizedRect.swigCPtr : 0;
    }

    public float getX0() {
        return GcamModuleJNI.NormalizedRect_x0_get(this.swigCPtr, this);
    }

    public float getX1() {
        return GcamModuleJNI.NormalizedRect_x1_get(this.swigCPtr, this);
    }

    public float getY0() {
        return GcamModuleJNI.NormalizedRect_y0_get(this.swigCPtr, this);
    }

    public float getY1() {
        return GcamModuleJNI.NormalizedRect_y1_get(this.swigCPtr, this);
    }

    public float height() {
        return GcamModuleJNI.NormalizedRect_height(this.swigCPtr, this);
    }

    public void setX0(float f) {
        GcamModuleJNI.NormalizedRect_x0_set(this.swigCPtr, this, f);
    }

    public void setX1(float f) {
        GcamModuleJNI.NormalizedRect_x1_set(this.swigCPtr, this, f);
    }

    public void setY0(float f) {
        GcamModuleJNI.NormalizedRect_y0_set(this.swigCPtr, this, f);
    }

    public void setY1(float f) {
        GcamModuleJNI.NormalizedRect_y1_set(this.swigCPtr, this, f);
    }

    public float width() {
        return GcamModuleJNI.NormalizedRect_width(this.swigCPtr, this);
    }
}
