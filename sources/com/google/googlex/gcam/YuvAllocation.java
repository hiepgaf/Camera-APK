package com.google.googlex.gcam;

/* compiled from: PG */
public class YuvAllocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public YuvAllocation() {
        this(GcamModuleJNI.new_YuvAllocation(), true);
    }

    protected YuvAllocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_YuvAllocation(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(YuvAllocation yuvAllocation) {
        return yuvAllocation != null ? yuvAllocation.swigCPtr : 0;
    }

    public long getId() {
        return GcamModuleJNI.YuvAllocation_id_get(this.swigCPtr, this);
    }

    public YuvWriteView getView() {
        long YuvAllocation_view_get = GcamModuleJNI.YuvAllocation_view_get(this.swigCPtr, this);
        return YuvAllocation_view_get != 0 ? new YuvWriteView(YuvAllocation_view_get, false) : null;
    }

    public void setId(long j) {
        GcamModuleJNI.YuvAllocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(YuvWriteView yuvWriteView) {
        GcamModuleJNI.YuvAllocation_view_set(this.swigCPtr, this, YuvWriteView.getCPtr(yuvWriteView), yuvWriteView);
    }
}
