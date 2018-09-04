package com.google.googlex.gcam;

/* compiled from: PG */
public class DebugParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DebugParams() {
        this(GcamModuleJNI.new_DebugParams(), true);
    }

    protected DebugParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Print() {
        GcamModuleJNI.DebugParams_Print(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DebugParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(DebugParams debugParams) {
        return debugParams != null ? debugParams.swigCPtr : 0;
    }

    public long getSave_bitmask() {
        return GcamModuleJNI.DebugParams_save_bitmask_get(this.swigCPtr, this);
    }

    public void setSave_bitmask(long j) {
        GcamModuleJNI.DebugParams_save_bitmask_set(this.swigCPtr, this, j);
    }
}
