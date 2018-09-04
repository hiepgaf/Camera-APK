package com.google.googlex.gcam;

/* compiled from: PG */
public class InterleavedU8Allocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedU8Allocation() {
        this(GcamModuleJNI.new_InterleavedU8Allocation(), true);
    }

    protected InterleavedU8Allocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedU8Allocation(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(InterleavedU8Allocation interleavedU8Allocation) {
        return interleavedU8Allocation != null ? interleavedU8Allocation.swigCPtr : 0;
    }

    public long getId() {
        return GcamModuleJNI.InterleavedU8Allocation_id_get(this.swigCPtr, this);
    }

    public InterleavedWriteViewU8 getView() {
        long InterleavedU8Allocation_view_get = GcamModuleJNI.InterleavedU8Allocation_view_get(this.swigCPtr, this);
        return InterleavedU8Allocation_view_get != 0 ? new InterleavedWriteViewU8(InterleavedU8Allocation_view_get, false) : null;
    }

    public void setId(long j) {
        GcamModuleJNI.InterleavedU8Allocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(InterleavedWriteViewU8 interleavedWriteViewU8) {
        GcamModuleJNI.InterleavedU8Allocation_view_set(this.swigCPtr, this, InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8), interleavedWriteViewU8);
    }
}
