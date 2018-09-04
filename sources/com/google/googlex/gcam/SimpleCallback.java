package com.google.googlex.gcam;

/* compiled from: PG */
public class SimpleCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public SimpleCallback() {
        this(GcamModuleJNI.new_SimpleCallback(), true);
        GcamModuleJNI.SimpleCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected SimpleCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Run() {
        GcamModuleJNI.SimpleCallback_Run(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_SimpleCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(SimpleCallback simpleCallback) {
        return simpleCallback != null ? simpleCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.SimpleCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.SimpleCallback_change_ownership(this, this.swigCPtr, true);
    }
}
