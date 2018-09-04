package com.google.googlex.gcam;

/* compiled from: PG */
public class InterleavedU16Allocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedU16Allocation() {
        this(GcamModuleJNI.new_InterleavedU16Allocation(), true);
    }

    protected InterleavedU16Allocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedU16Allocation(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(InterleavedU16Allocation interleavedU16Allocation) {
        return interleavedU16Allocation != null ? interleavedU16Allocation.swigCPtr : 0;
    }

    public long getId() {
        return GcamModuleJNI.InterleavedU16Allocation_id_get(this.swigCPtr, this);
    }

    public InterleavedWriteViewU16 getView() {
        long InterleavedU16Allocation_view_get = GcamModuleJNI.InterleavedU16Allocation_view_get(this.swigCPtr, this);
        return InterleavedU16Allocation_view_get != 0 ? new InterleavedWriteViewU16(InterleavedU16Allocation_view_get, false) : null;
    }

    public void setId(long j) {
        GcamModuleJNI.InterleavedU16Allocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(InterleavedWriteViewU16 interleavedWriteViewU16) {
        GcamModuleJNI.InterleavedU16Allocation_view_set(this.swigCPtr, this, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }
}
