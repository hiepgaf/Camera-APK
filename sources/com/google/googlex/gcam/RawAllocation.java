package com.google.googlex.gcam;

/* compiled from: PG */
public class RawAllocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawAllocation() {
        this(GcamModuleJNI.new_RawAllocation(), true);
    }

    protected RawAllocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawAllocation(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(RawAllocation rawAllocation) {
        return rawAllocation != null ? rawAllocation.swigCPtr : 0;
    }

    public long getId() {
        return GcamModuleJNI.RawAllocation_id_get(this.swigCPtr, this);
    }

    public RawWriteView getView() {
        long RawAllocation_view_get = GcamModuleJNI.RawAllocation_view_get(this.swigCPtr, this);
        return RawAllocation_view_get != 0 ? new RawWriteView(RawAllocation_view_get, false) : null;
    }

    public void setId(long j) {
        GcamModuleJNI.RawAllocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(RawWriteView rawWriteView) {
        GcamModuleJNI.RawAllocation_view_set(this.swigCPtr, this, RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }
}
