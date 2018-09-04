package com.google.googlex.gcam;

/* compiled from: PG */
public class PackedReadViewRaw12 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PackedReadViewRaw12() {
        this(GcamModuleJNI.new_PackedReadViewRaw12__SWIG_0(), true);
    }

    protected PackedReadViewRaw12(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public PackedReadViewRaw12(InterleavedReadViewU8 interleavedReadViewU8) {
        this(GcamModuleJNI.new_PackedReadViewRaw12__SWIG_1(InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8), true);
    }

    public PackedReadViewRaw12(PackedReadViewRaw12 packedReadViewRaw12) {
        this(GcamModuleJNI.new_PackedReadViewRaw12__SWIG_2(getCPtr(packedReadViewRaw12), packedReadViewRaw12), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.PackedReadViewRaw12_Empty(this.swigCPtr, this);
    }

    public boolean FastCrop(int i, int i2, int i3, int i4) {
        return GcamModuleJNI.PackedReadViewRaw12_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void Unpack(InterleavedWriteViewU16 interleavedWriteViewU16) {
        GcamModuleJNI.PackedReadViewRaw12_Unpack(this.swigCPtr, this, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }

    public void UnpackRow(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadViewRaw12_UnpackRow__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public void UnpackRow(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadViewRaw12_UnpackRow__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public int at(int i, int i2) {
        return GcamModuleJNI.PackedReadViewRaw12_at__SWIG_0(this.swigCPtr, this, i, i2);
    }

    public int at(int i, int i2, int i3) {
        return GcamModuleJNI.PackedReadViewRaw12_at__SWIG_1(this.swigCPtr, this, i, i2, i3);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PackedReadViewRaw12(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PackedReadViewRaw12 packedReadViewRaw12) {
        return packedReadViewRaw12 != null ? packedReadViewRaw12.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.PackedReadViewRaw12_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.PackedReadViewRaw12_num_channels(this.swigCPtr, this);
    }

    public InterleavedReadViewU8 packed_read_view() {
        return new InterleavedReadViewU8(GcamModuleJNI.PackedReadViewRaw12_packed_read_view(this.swigCPtr, this), false);
    }

    public long sample_array_size() {
        return GcamModuleJNI.PackedReadViewRaw12_sample_array_size(this.swigCPtr, this);
    }

    public ConstSampleIteratorPackedRaw12 sample_iterator() {
        return new ConstSampleIteratorPackedRaw12(GcamModuleJNI.PackedReadViewRaw12_sample_iterator(this.swigCPtr, this), true);
    }

    public int width() {
        return GcamModuleJNI.PackedReadViewRaw12_width(this.swigCPtr, this);
    }
}
