package com.google.googlex.gcam;

/* compiled from: PG */
public class PostviewParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PostviewParams() {
        this(GcamModuleJNI.new_PostviewParams(), true);
    }

    protected PostviewParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PostviewParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PostviewParams postviewParams) {
        return postviewParams != null ? postviewParams.swigCPtr : 0;
    }

    public int getPixel_format() {
        return GcamModuleJNI.PostviewParams_pixel_format_get(this.swigCPtr, this);
    }

    public int getTarget_height() {
        return GcamModuleJNI.PostviewParams_target_height_get(this.swigCPtr, this);
    }

    public int getTarget_width() {
        return GcamModuleJNI.PostviewParams_target_width_get(this.swigCPtr, this);
    }

    public void setPixel_format(int i) {
        GcamModuleJNI.PostviewParams_pixel_format_set(this.swigCPtr, this, i);
    }

    public void setTarget_height(int i) {
        GcamModuleJNI.PostviewParams_target_height_set(this.swigCPtr, this, i);
    }

    public void setTarget_width(int i) {
        GcamModuleJNI.PostviewParams_target_width_set(this.swigCPtr, this, i);
    }
}
