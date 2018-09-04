package com.google.googlex.gcam;

/* compiled from: PG */
public class PixelRect {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PixelRect() {
        this(GcamModuleJNI.new_PixelRect(), true);
    }

    protected PixelRect(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public float AspectRatio() {
        return GcamModuleJNI.PixelRect_AspectRatio(this.swigCPtr, this);
    }

    public boolean Check() {
        return GcamModuleJNI.PixelRect_Check(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.PixelRect_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(PixelRect pixelRect) {
        return GcamModuleJNI.PixelRect_Equals(this.swigCPtr, this, getCPtr(pixelRect), pixelRect);
    }

    public void Inflate(int i, int i2) {
        GcamModuleJNI.PixelRect_Inflate(this.swigCPtr, this, i, i2);
    }

    public float InverseAspectRatio() {
        return GcamModuleJNI.PixelRect_InverseAspectRatio(this.swigCPtr, this);
    }

    public boolean IsEmpty() {
        return GcamModuleJNI.PixelRect_IsEmpty(this.swigCPtr, this);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.PixelRect_Print(this.swigCPtr, this, i, i2);
    }

    public void ScaleBy(float f) {
        GcamModuleJNI.PixelRect_ScaleBy(this.swigCPtr, this, f);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string, int i) {
        GcamModuleJNI.PixelRect_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PixelRect(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PixelRect pixelRect) {
        return pixelRect != null ? pixelRect.swigCPtr : 0;
    }

    public int getX0() {
        return GcamModuleJNI.PixelRect_x0_get(this.swigCPtr, this);
    }

    public int getX1() {
        return GcamModuleJNI.PixelRect_x1_get(this.swigCPtr, this);
    }

    public int getY0() {
        return GcamModuleJNI.PixelRect_y0_get(this.swigCPtr, this);
    }

    public int getY1() {
        return GcamModuleJNI.PixelRect_y1_get(this.swigCPtr, this);
    }

    public int height() {
        return GcamModuleJNI.PixelRect_height(this.swigCPtr, this);
    }

    public void setX0(int i) {
        GcamModuleJNI.PixelRect_x0_set(this.swigCPtr, this, i);
    }

    public void setX1(int i) {
        GcamModuleJNI.PixelRect_x1_set(this.swigCPtr, this, i);
    }

    public void setY0(int i) {
        GcamModuleJNI.PixelRect_y0_set(this.swigCPtr, this, i);
    }

    public void setY1(int i) {
        GcamModuleJNI.PixelRect_y1_set(this.swigCPtr, this, i);
    }

    public int width() {
        return GcamModuleJNI.PixelRect_width(this.swigCPtr, this);
    }
}
