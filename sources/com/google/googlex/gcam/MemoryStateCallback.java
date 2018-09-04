package com.google.googlex.gcam;

/* compiled from: PG */
public class MemoryStateCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public MemoryStateCallback() {
        this(GcamModuleJNI.new_MemoryStateCallback(), true);
        GcamModuleJNI.MemoryStateCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected MemoryStateCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Run(long j, long j2) {
        GcamModuleJNI.MemoryStateCallback_Run(this.swigCPtr, this, j, j2);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_MemoryStateCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(MemoryStateCallback memoryStateCallback) {
        return memoryStateCallback != null ? memoryStateCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.MemoryStateCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.MemoryStateCallback_change_ownership(this, this.swigCPtr, true);
    }
}
