package com.google.googlex.gcam;

/* compiled from: PG */
public class GoudaSwigWrapper {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GoudaSwigWrapper() {
        this(GcamModuleJNI.new_GoudaSwigWrapper(), true);
    }

    protected GoudaSwigWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Init() {
        return GcamModuleJNI.GoudaSwigWrapper_Init(this.swigCPtr, this);
    }

    public boolean Process(long j, GoudaCallbacks goudaCallbacks, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, InterleavedReadViewU16 interleavedReadViewU16) {
        return GcamModuleJNI.GoudaSwigWrapper_Process(this.swigCPtr, this, j, GoudaCallbacks.getCPtr(goudaCallbacks), goudaCallbacks, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, GoudaRequest.getCPtr(goudaRequest), goudaRequest, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16);
    }

    public void Release() {
        GcamModuleJNI.GoudaSwigWrapper_Release(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GoudaSwigWrapper(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(GoudaSwigWrapper goudaSwigWrapper) {
        return goudaSwigWrapper != null ? goudaSwigWrapper.swigCPtr : 0;
    }
}
