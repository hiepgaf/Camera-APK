package com.google.googlex.gcam;

/* compiled from: PG */
public class FaceInfo {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FaceInfo() {
        this(GcamModuleJNI.new_FaceInfo(), true);
    }

    protected FaceInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(FaceInfo faceInfo) {
        return GcamModuleJNI.FaceInfo_Equals(this.swigCPtr, this, getCPtr(faceInfo), faceInfo);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FaceInfo(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(FaceInfo faceInfo) {
        return faceInfo != null ? faceInfo.swigCPtr : 0;
    }

    public float getConfidence() {
        return GcamModuleJNI.FaceInfo_confidence_get(this.swigCPtr, this);
    }

    public float getPos_x() {
        return GcamModuleJNI.FaceInfo_pos_x_get(this.swigCPtr, this);
    }

    public float getPos_y() {
        return GcamModuleJNI.FaceInfo_pos_y_get(this.swigCPtr, this);
    }

    public float getSize() {
        return GcamModuleJNI.FaceInfo_size_get(this.swigCPtr, this);
    }

    public void setConfidence(float f) {
        GcamModuleJNI.FaceInfo_confidence_set(this.swigCPtr, this, f);
    }

    public void setPos_x(float f) {
        GcamModuleJNI.FaceInfo_pos_x_set(this.swigCPtr, this, f);
    }

    public void setPos_y(float f) {
        GcamModuleJNI.FaceInfo_pos_y_set(this.swigCPtr, this, f);
    }

    public void setSize(float f) {
        GcamModuleJNI.FaceInfo_size_set(this.swigCPtr, this, f);
    }
}
