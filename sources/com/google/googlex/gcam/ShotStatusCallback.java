package com.google.googlex.gcam;

/* compiled from: PG */
public class ShotStatusCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ShotStatusCallback() {
        this(GcamModuleJNI.new_ShotStatusCallback(), true);
        GcamModuleJNI.ShotStatusCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected ShotStatusCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void OnAbort(int i) {
        GcamModuleJNI.ShotStatusCallback_OnAbort(this.swigCPtr, this, i);
    }

    public void OnComplete(int i, ShotLogData shotLogData) {
        GcamModuleJNI.ShotStatusCallback_OnComplete(this.swigCPtr, this, i, ShotLogData.getCPtr(shotLogData), shotLogData);
    }

    public void OnError(int i, String str) {
        GcamModuleJNI.ShotStatusCallback_OnError(this.swigCPtr, this, i, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ShotStatusCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ShotStatusCallback shotStatusCallback) {
        return shotStatusCallback != null ? shotStatusCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.ShotStatusCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ShotStatusCallback_change_ownership(this, this.swigCPtr, true);
    }
}
