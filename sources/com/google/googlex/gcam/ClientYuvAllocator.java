package com.google.googlex.gcam;

/* compiled from: PG */
public class ClientYuvAllocator {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ClientYuvAllocator() {
        this(GcamModuleJNI.new_ClientYuvAllocator(), true);
        GcamModuleJNI.ClientYuvAllocator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected ClientYuvAllocator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public YuvAllocation Allocate(int i, int i2, int i3) {
        return new YuvAllocation(GcamModuleJNI.ClientYuvAllocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    public void Release(long j) {
        GcamModuleJNI.ClientYuvAllocator_Release(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ClientYuvAllocator(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ClientYuvAllocator clientYuvAllocator) {
        return clientYuvAllocator != null ? clientYuvAllocator.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.ClientYuvAllocator_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ClientYuvAllocator_change_ownership(this, this.swigCPtr, true);
    }
}
