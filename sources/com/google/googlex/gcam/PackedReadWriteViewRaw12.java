package com.google.googlex.gcam;

/* compiled from: PG */
public class PackedReadWriteViewRaw12 extends PackedReadViewRaw12 {
    public long swigCPtr;

    public PackedReadWriteViewRaw12() {
        this(GcamModuleJNI.new_PackedReadWriteViewRaw12__SWIG_0(), true);
    }

    protected PackedReadWriteViewRaw12(long j, boolean z) {
        super(GcamModuleJNI.PackedReadWriteViewRaw12_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public PackedReadWriteViewRaw12(InterleavedWriteViewU8 interleavedWriteViewU8) {
        this(GcamModuleJNI.new_PackedReadWriteViewRaw12__SWIG_1(InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8), interleavedWriteViewU8), true);
    }

    public PackedReadWriteViewRaw12(PackedReadWriteViewRaw12 packedReadWriteViewRaw12) {
        this(GcamModuleJNI.new_PackedReadWriteViewRaw12__SWIG_2(getCPtr(packedReadWriteViewRaw12), packedReadWriteViewRaw12), true);
    }

    public boolean FastCrop(int i, int i2, int i3, int i4) {
        return GcamModuleJNI.PackedReadWriteViewRaw12_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PackedReadWriteViewRaw12(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PackedReadWriteViewRaw12 packedReadWriteViewRaw12) {
        return packedReadWriteViewRaw12 != null ? packedReadWriteViewRaw12.swigCPtr : 0;
    }

    public InterleavedWriteViewU8 packed_write_view() {
        return new InterleavedWriteViewU8(GcamModuleJNI.PackedReadWriteViewRaw12_packed_write_view(this.swigCPtr, this), false);
    }

    public void set_pixel(int i, int i2, int i3) {
        GcamModuleJNI.PackedReadWriteViewRaw12_set_pixel(this.swigCPtr, this, i, i2, i3);
    }

    public void set_row(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadWriteViewRaw12_set_row__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public void set_row(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadWriteViewRaw12_set_row__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }
}
