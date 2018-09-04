package com.google.googlex.gcam;

/* compiled from: PG */
public class PostviewCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PostviewCallback() {
        this(GcamModuleJNI.new_PostviewCallback(), true);
        GcamModuleJNI.PostviewCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected PostviewCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, int i2) {
        GcamModuleJNI.PostviewCallback_RgbReady(this.swigCPtr, this, i, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i2);
    }

    public void YuvReady(int i, YuvReadView yuvReadView, int i2) {
        GcamModuleJNI.PostviewCallback_YuvReady(this.swigCPtr, this, i, YuvReadView.getCPtr(yuvReadView), yuvReadView, i2);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PostviewCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PostviewCallback postviewCallback) {
        return postviewCallback != null ? postviewCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.PostviewCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.PostviewCallback_change_ownership(this, this.swigCPtr, true);
    }
}
