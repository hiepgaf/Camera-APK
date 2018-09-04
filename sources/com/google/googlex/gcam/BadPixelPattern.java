package com.google.googlex.gcam;

/* compiled from: PG */
public class BadPixelPattern {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public BadPixelPattern() {
        this(GcamModuleJNI.new_BadPixelPattern(), true);
    }

    protected BadPixelPattern(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_BadPixelPattern(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(BadPixelPattern badPixelPattern) {
        return badPixelPattern != null ? badPixelPattern.swigCPtr : 0;
    }

    public int getHeight() {
        return GcamModuleJNI.BadPixelPattern_height_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__vectorT_gcam__BadPixel_t getOffsets() {
        long BadPixelPattern_offsets_get = GcamModuleJNI.BadPixelPattern_offsets_get(this.swigCPtr, this);
        return BadPixelPattern_offsets_get != 0 ? new SWIGTYPE_p_std__vectorT_gcam__BadPixel_t(BadPixelPattern_offsets_get, false) : null;
    }

    public int getWidth() {
        return GcamModuleJNI.BadPixelPattern_width_get(this.swigCPtr, this);
    }

    public void setHeight(int i) {
        GcamModuleJNI.BadPixelPattern_height_set(this.swigCPtr, this, i);
    }

    public void setOffsets(SWIGTYPE_p_std__vectorT_gcam__BadPixel_t sWIGTYPE_p_std__vectorT_gcam__BadPixel_t) {
        GcamModuleJNI.BadPixelPattern_offsets_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_gcam__BadPixel_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__BadPixel_t));
    }

    public void setWidth(int i) {
        GcamModuleJNI.BadPixelPattern_width_set(this.swigCPtr, this, i);
    }
}
