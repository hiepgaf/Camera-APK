package com.google.googlex.gcam;

/* compiled from: PG */
public class NewDeleteRawAllocator extends ClientRawAllocator {
    public long swigCPtr;

    public NewDeleteRawAllocator() {
        this(GcamModuleJNI.new_NewDeleteRawAllocator(), true);
    }

    protected NewDeleteRawAllocator(long j, boolean z) {
        super(GcamModuleJNI.NewDeleteRawAllocator_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public RawAllocation Allocate(int i, int i2, int i3) {
        return new RawAllocation(GcamModuleJNI.NewDeleteRawAllocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    public void Release(long j) {
        GcamModuleJNI.NewDeleteRawAllocator_Release(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NewDeleteRawAllocator(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(NewDeleteRawAllocator newDeleteRawAllocator) {
        return newDeleteRawAllocator != null ? newDeleteRawAllocator.swigCPtr : 0;
    }
}
