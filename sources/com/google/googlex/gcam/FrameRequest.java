package com.google.googlex.gcam;

/* compiled from: PG */
public class FrameRequest {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FrameRequest() {
        this(GcamModuleJNI.new_FrameRequest(), true);
    }

    protected FrameRequest(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Clear() {
        GcamModuleJNI.FrameRequest_Clear(this.swigCPtr, this);
    }

    public boolean Equals(FrameRequest frameRequest) {
        return GcamModuleJNI.FrameRequest_Equals(this.swigCPtr, this, getCPtr(frameRequest), frameRequest);
    }

    public float GetDesiredTet() {
        return GcamModuleJNI.FrameRequest_GetDesiredTet(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FrameRequest(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public AwbInfo getAwb() {
        long FrameRequest_awb_get = GcamModuleJNI.FrameRequest_awb_get(this.swigCPtr, this);
        return FrameRequest_awb_get != 0 ? new AwbInfo(FrameRequest_awb_get, false) : null;
    }

    protected static long getCPtr(FrameRequest frameRequest) {
        return frameRequest != null ? frameRequest.swigCPtr : 0;
    }

    public float getDesired_analog_gain() {
        return GcamModuleJNI.FrameRequest_desired_analog_gain_get(this.swigCPtr, this);
    }

    public float getDesired_digital_gain() {
        return GcamModuleJNI.FrameRequest_desired_digital_gain_get(this.swigCPtr, this);
    }

    public float getDesired_exposure_time_ms() {
        return GcamModuleJNI.FrameRequest_desired_exposure_time_ms_get(this.swigCPtr, this);
    }

    public boolean getTry_to_lock_black_level() {
        return GcamModuleJNI.FrameRequest_try_to_lock_black_level_get(this.swigCPtr, this);
    }

    public int getType() {
        return GcamModuleJNI.FrameRequest_type_get(this.swigCPtr, this);
    }

    public void setAwb(AwbInfo awbInfo) {
        GcamModuleJNI.FrameRequest_awb_set(this.swigCPtr, this, AwbInfo.getCPtr(awbInfo), awbInfo);
    }

    public void setDesired_analog_gain(float f) {
        GcamModuleJNI.FrameRequest_desired_analog_gain_set(this.swigCPtr, this, f);
    }

    public void setDesired_digital_gain(float f) {
        GcamModuleJNI.FrameRequest_desired_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setDesired_exposure_time_ms(float f) {
        GcamModuleJNI.FrameRequest_desired_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setTry_to_lock_black_level(boolean z) {
        GcamModuleJNI.FrameRequest_try_to_lock_black_level_set(this.swigCPtr, this, z);
    }

    public void setType(int i) {
        GcamModuleJNI.FrameRequest_type_set(this.swigCPtr, this, i);
    }
}
