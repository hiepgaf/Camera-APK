package com.google.googlex.gcam;

/* compiled from: PG */
public class AwbInfo {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AwbInfo() {
        this(GcamModuleJNI.new_AwbInfo(), true);
    }

    protected AwbInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.AwbInfo_Check(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.AwbInfo_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(AwbInfo awbInfo) {
        return GcamModuleJNI.AwbInfo_Equals(this.swigCPtr, this, getCPtr(awbInfo), awbInfo);
    }

    public void GetWbGainsRGB(SWIGTYPE_p_float sWIGTYPE_p_float, SWIGTYPE_p_float sWIGTYPE_p_float2, SWIGTYPE_p_float sWIGTYPE_p_float3) {
        GcamModuleJNI.AwbInfo_GetWbGainsRGB(this.swigCPtr, this, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float), SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float2), SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float3));
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.AwbInfo_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string, int i) {
        GcamModuleJNI.AwbInfo_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), i);
    }

    public void SetIdentityRgbToRgb() {
        GcamModuleJNI.AwbInfo_SetIdentityRgbToRgb(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AwbInfo(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(AwbInfo awbInfo) {
        return awbInfo != null ? awbInfo.swigCPtr : 0;
    }

    public int getColor_temp() {
        return GcamModuleJNI.AwbInfo_color_temp_get(this.swigCPtr, this);
    }

    public float[] getGains() {
        return GcamModuleJNI.AwbInfo_gains_get(this.swigCPtr, this);
    }

    public float[] getRgb2rgb() {
        return GcamModuleJNI.AwbInfo_rgb2rgb_get(this.swigCPtr, this);
    }

    public void setColor_temp(int i) {
        GcamModuleJNI.AwbInfo_color_temp_set(this.swigCPtr, this, i);
    }

    public void setGains(float[] fArr) {
        GcamModuleJNI.AwbInfo_gains_set(this.swigCPtr, this, fArr);
    }

    public void setRgb2rgb(float[] fArr) {
        GcamModuleJNI.AwbInfo_rgb2rgb_set(this.swigCPtr, this, fArr);
    }
}
