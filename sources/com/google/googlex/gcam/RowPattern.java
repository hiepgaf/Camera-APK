package com.google.googlex.gcam;

/* compiled from: PG */
public class RowPattern {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RowPattern() {
        this(GcamModuleJNI.new_RowPattern(), true);
    }

    protected RowPattern(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RowPattern(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getAmplitude() {
        return GcamModuleJNI.RowPattern_amplitude_get(this.swigCPtr, this);
    }

    protected static long getCPtr(RowPattern rowPattern) {
        return rowPattern != null ? rowPattern.swigCPtr : 0;
    }

    public SWIGTYPE_p_std__arrayT_gcam__SecondOrderFilter_2_t getFilter() {
        return new SWIGTYPE_p_std__arrayT_gcam__SecondOrderFilter_2_t(GcamModuleJNI.RowPattern_filter_get(this.swigCPtr, this), true);
    }

    public float getGain_at_period() {
        return GcamModuleJNI.RowPattern_gain_at_period_get(this.swigCPtr, this);
    }

    public float getPeriod() {
        return GcamModuleJNI.RowPattern_period_get(this.swigCPtr, this);
    }

    public void setAmplitude(float f) {
        GcamModuleJNI.RowPattern_amplitude_set(this.swigCPtr, this, f);
    }

    public void setFilter(SWIGTYPE_p_std__arrayT_gcam__SecondOrderFilter_2_t sWIGTYPE_p_std__arrayT_gcam__SecondOrderFilter_2_t) {
        GcamModuleJNI.RowPattern_filter_set(this.swigCPtr, this, SWIGTYPE_p_std__arrayT_gcam__SecondOrderFilter_2_t.getCPtr(sWIGTYPE_p_std__arrayT_gcam__SecondOrderFilter_2_t));
    }

    public void setGain_at_period(float f) {
        GcamModuleJNI.RowPattern_gain_at_period_set(this.swigCPtr, this, f);
    }

    public void setPeriod(float f) {
        GcamModuleJNI.RowPattern_period_set(this.swigCPtr, this, f);
    }
}
