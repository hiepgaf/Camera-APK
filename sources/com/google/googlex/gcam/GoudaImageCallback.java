package com.google.googlex.gcam;

/* compiled from: PG */
public class GoudaImageCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GoudaImageCallback() {
        this(GcamModuleJNI.new_GoudaImageCallback(), true);
        GcamModuleJNI.GoudaImageCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected GoudaImageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void RgbReady(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3) {
        GcamModuleJNI.GoudaImageCallback_RgbReady(this.swigCPtr, this, j, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i, str, str2, str3);
    }

    public void YuvReady(long j, YuvReadView yuvReadView, int i, String str, String str2, String str3) {
        GcamModuleJNI.GoudaImageCallback_YuvReady(this.swigCPtr, this, j, YuvReadView.getCPtr(yuvReadView), yuvReadView, i, str, str2, str3);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GoudaImageCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(GoudaImageCallback goudaImageCallback) {
        return goudaImageCallback != null ? goudaImageCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.GoudaImageCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.GoudaImageCallback_change_ownership(this, this.swigCPtr, true);
    }
}
