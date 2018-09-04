package com.google.googlex.gcam;

/* compiled from: PG */
public class NewDeleteInterleavedU8Allocator extends ClientInterleavedU8Allocator {
    public long swigCPtr;

    public NewDeleteInterleavedU8Allocator() {
        this(GcamModuleJNI.new_NewDeleteInterleavedU8Allocator(), true);
    }

    protected NewDeleteInterleavedU8Allocator(long j, boolean z) {
        super(GcamModuleJNI.NewDeleteInterleavedU8Allocator_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        return new InterleavedU8Allocation(GcamModuleJNI.NewDeleteInterleavedU8Allocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    public void Release(long j) {
        GcamModuleJNI.NewDeleteInterleavedU8Allocator_Release(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NewDeleteInterleavedU8Allocator(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(NewDeleteInterleavedU8Allocator newDeleteInterleavedU8Allocator) {
        return newDeleteInterleavedU8Allocator != null ? newDeleteInterleavedU8Allocator.swigCPtr : 0;
    }
}
