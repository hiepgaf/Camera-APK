package com.google.googlex.gcam;

/* compiled from: PG */
public class ImageReleaseCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ImageReleaseCallback() {
        this(GcamModuleJNI.new_ImageReleaseCallback(), true);
        GcamModuleJNI.ImageReleaseCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected ImageReleaseCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Run(long j) {
        GcamModuleJNI.ImageReleaseCallback_Run(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ImageReleaseCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ImageReleaseCallback imageReleaseCallback) {
        return imageReleaseCallback != null ? imageReleaseCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.ImageReleaseCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ImageReleaseCallback_change_ownership(this, this.swigCPtr, true);
    }
}
