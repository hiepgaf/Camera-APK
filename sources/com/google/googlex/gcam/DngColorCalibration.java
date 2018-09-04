package com.google.googlex.gcam;

/* compiled from: PG */
public class DngColorCalibration {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    public final class Illuminant {
        public static final int kCloudyWeather = 10;
        public static final int kCoolWhiteFluorescent = 14;
        public static final int kD50 = 23;
        public static final int kD55 = 20;
        public static final int kD65 = 21;
        public static final int kD75 = 22;
        public static final int kDayWhiteFluorescent = 13;
        public static final int kDaylight = 1;
        public static final int kDaylightFluorescent = 12;
        public static final int kFineWeather = 5;
        public static final int kFlash = 4;
        public static final int kFluorescent = 2;
        public static final int kISOStudioTungsten = 24;
        public static final int kOther = 255;
        public static final int kShade = 11;
        public static final int kStandardLightA = 17;
        public static final int kStandardLightB = 18;
        public static final int kStandardLightC = 19;
        public static final int kTungsten = 3;
        public static final int kUnknown = 0;
        public static final int kWarmWhiteFluorescent = 16;
        public static final int kWhiteFluorescent = 15;
    }

    public DngColorCalibration() {
        this(GcamModuleJNI.new_DngColorCalibration(), true);
    }

    protected DngColorCalibration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Clear() {
        GcamModuleJNI.DngColorCalibration_Clear(this.swigCPtr, this);
    }

    public boolean Equals(DngColorCalibration dngColorCalibration) {
        return GcamModuleJNI.DngColorCalibration_Equals(this.swigCPtr, this, getCPtr(dngColorCalibration), dngColorCalibration);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DngColorCalibration(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(DngColorCalibration dngColorCalibration) {
        return dngColorCalibration != null ? dngColorCalibration.swigCPtr : 0;
    }

    public int getIlluminant() {
        return GcamModuleJNI.DngColorCalibration_illuminant_get(this.swigCPtr, this);
    }

    public float[] getModel_rgb_to_device_rgb() {
        return GcamModuleJNI.DngColorCalibration_model_rgb_to_device_rgb_get(this.swigCPtr, this);
    }

    public float[] getXyz_to_model_rgb() {
        return GcamModuleJNI.DngColorCalibration_xyz_to_model_rgb_get(this.swigCPtr, this);
    }

    public void setIlluminant(int i) {
        GcamModuleJNI.DngColorCalibration_illuminant_set(this.swigCPtr, this, i);
    }

    public void setModel_rgb_to_device_rgb(float[] fArr) {
        GcamModuleJNI.DngColorCalibration_model_rgb_to_device_rgb_set(this.swigCPtr, this, fArr);
    }

    public void setXyz_to_model_rgb(float[] fArr) {
        GcamModuleJNI.DngColorCalibration_xyz_to_model_rgb_set(this.swigCPtr, this, fArr);
    }
}
