package com.google.googlex.gcam;

/* compiled from: PG */
public class CaptureParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public CaptureParams() {
        this(GcamModuleJNI.new_CaptureParams(), true);
    }

    protected CaptureParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.CaptureParams_Check(this.swigCPtr, this);
    }

    public void SetDefaults() {
        GcamModuleJNI.CaptureParams_SetDefaults(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_CaptureParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getAllow_digital_gain_at_sensor() {
        return GcamModuleJNI.CaptureParams_allow_digital_gain_at_sensor_get(this.swigCPtr, this);
    }

    protected static long getCPtr(CaptureParams captureParams) {
        return captureParams != null ? captureParams.swigCPtr : 0;
    }

    public float getMax_hdr_ratio() {
        return GcamModuleJNI.CaptureParams_max_hdr_ratio_get(this.swigCPtr, this);
    }

    public float getMax_overall_gain() {
        return GcamModuleJNI.CaptureParams_max_overall_gain_get(this.swigCPtr, this);
    }

    public float getMax_post_capture_gain_non_zsl() {
        return GcamModuleJNI.CaptureParams_max_post_capture_gain_non_zsl_get(this.swigCPtr, this);
    }

    public float getMax_post_capture_gain_zsl() {
        return GcamModuleJNI.CaptureParams_max_post_capture_gain_zsl_get(this.swigCPtr, this);
    }

    public float getNoise_variance_to_payload_frame_count() {
        return GcamModuleJNI.CaptureParams_noise_variance_to_payload_frame_count_get(this.swigCPtr, this);
    }

    public void setAllow_digital_gain_at_sensor(float f) {
        GcamModuleJNI.CaptureParams_allow_digital_gain_at_sensor_set(this.swigCPtr, this, f);
    }

    public void setMax_hdr_ratio(float f) {
        GcamModuleJNI.CaptureParams_max_hdr_ratio_set(this.swigCPtr, this, f);
    }

    public void setMax_overall_gain(float f) {
        GcamModuleJNI.CaptureParams_max_overall_gain_set(this.swigCPtr, this, f);
    }

    public void setMax_post_capture_gain_non_zsl(float f) {
        GcamModuleJNI.CaptureParams_max_post_capture_gain_non_zsl_set(this.swigCPtr, this, f);
    }

    public void setMax_post_capture_gain_zsl(float f) {
        GcamModuleJNI.CaptureParams_max_post_capture_gain_zsl_set(this.swigCPtr, this, f);
    }

    public void setNoise_variance_to_payload_frame_count(float f) {
        GcamModuleJNI.CaptureParams_noise_variance_to_payload_frame_count_set(this.swigCPtr, this, f);
    }
}
