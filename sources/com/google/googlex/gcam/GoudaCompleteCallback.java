package com.google.googlex.gcam;

/* compiled from: PG */
public class GoudaCompleteCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GoudaCompleteCallback() {
        this(GcamModuleJNI.new_GoudaCompleteCallback(), true);
        GcamModuleJNI.GoudaCompleteCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected GoudaCompleteCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Run(long j) {
        GcamModuleJNI.GoudaCompleteCallback_Run(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GoudaCompleteCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(GoudaCompleteCallback goudaCompleteCallback) {
        return goudaCompleteCallback != null ? goudaCompleteCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.GoudaCompleteCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.GoudaCompleteCallback_change_ownership(this, this.swigCPtr, true);
    }
}
