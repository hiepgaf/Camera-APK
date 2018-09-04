package com.google.googlex.gcam;

/* compiled from: PG */
public class SensorRowArtifacts {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public SensorRowArtifacts() {
        this(GcamModuleJNI.new_SensorRowArtifacts(), true);
    }

    protected SensorRowArtifacts(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean IsEmpty() {
        return GcamModuleJNI.SensorRowArtifacts_IsEmpty(this.swigCPtr, this);
    }

    public FloatVector NoiseVariancesForGain(float f, float f2, float f3, float f4) {
        return new FloatVector(GcamModuleJNI.SensorRowArtifacts_NoiseVariancesForGain(this.swigCPtr, this, f, f2, f3, f4), true);
    }

    public SWIGTYPE_p_std__vectorT_gcam__RowPattern_t PatternsForGain(float f, float f2, float f3, float f4) {
        return new SWIGTYPE_p_std__vectorT_gcam__RowPattern_t(GcamModuleJNI.SensorRowArtifacts_PatternsForGain(this.swigCPtr, this, f, f2, f3, f4), true);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_SensorRowArtifacts(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(SensorRowArtifacts sensorRowArtifacts) {
        return sensorRowArtifacts != null ? sensorRowArtifacts.swigCPtr : 0;
    }

    public FloatVector getNoise_offset() {
        long SensorRowArtifacts_noise_offset_get = GcamModuleJNI.SensorRowArtifacts_noise_offset_get(this.swigCPtr, this);
        return SensorRowArtifacts_noise_offset_get != 0 ? new FloatVector(SensorRowArtifacts_noise_offset_get, false) : null;
    }

    public SWIGTYPE_p_std__vectorT_gcam__RowPattern_t getPatterns_post_analog_gain() {
        long SensorRowArtifacts_patterns_post_analog_gain_get = GcamModuleJNI.SensorRowArtifacts_patterns_post_analog_gain_get(this.swigCPtr, this);
        return SensorRowArtifacts_patterns_post_analog_gain_get != 0 ? new SWIGTYPE_p_std__vectorT_gcam__RowPattern_t(SensorRowArtifacts_patterns_post_analog_gain_get, false) : null;
    }

    public SWIGTYPE_p_std__vectorT_gcam__RowPattern_t getPatterns_pre_analog_gain() {
        long SensorRowArtifacts_patterns_pre_analog_gain_get = GcamModuleJNI.SensorRowArtifacts_patterns_pre_analog_gain_get(this.swigCPtr, this);
        return SensorRowArtifacts_patterns_pre_analog_gain_get != 0 ? new SWIGTYPE_p_std__vectorT_gcam__RowPattern_t(SensorRowArtifacts_patterns_pre_analog_gain_get, false) : null;
    }

    public void setNoise_offset(FloatVector floatVector) {
        GcamModuleJNI.SensorRowArtifacts_noise_offset_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setPatterns_post_analog_gain(SWIGTYPE_p_std__vectorT_gcam__RowPattern_t sWIGTYPE_p_std__vectorT_gcam__RowPattern_t) {
        GcamModuleJNI.SensorRowArtifacts_patterns_post_analog_gain_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_gcam__RowPattern_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__RowPattern_t));
    }

    public void setPatterns_pre_analog_gain(SWIGTYPE_p_std__vectorT_gcam__RowPattern_t sWIGTYPE_p_std__vectorT_gcam__RowPattern_t) {
        GcamModuleJNI.SensorRowArtifacts_patterns_pre_analog_gain_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_gcam__RowPattern_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__RowPattern_t));
    }
}
