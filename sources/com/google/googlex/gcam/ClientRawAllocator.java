package com.google.googlex.gcam;

/* compiled from: PG */
public class ClientRawAllocator {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ClientRawAllocator() {
        this(GcamModuleJNI.new_ClientRawAllocator(), true);
        GcamModuleJNI.ClientRawAllocator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected ClientRawAllocator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public RawAllocation Allocate(int i, int i2, int i3) {
        return new RawAllocation(GcamModuleJNI.ClientRawAllocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    public void Release(long j) {
        GcamModuleJNI.ClientRawAllocator_Release(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ClientRawAllocator(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ClientRawAllocator clientRawAllocator) {
        return clientRawAllocator != null ? clientRawAllocator.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.ClientRawAllocator_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ClientRawAllocator_change_ownership(this, this.swigCPtr, true);
    }
}
