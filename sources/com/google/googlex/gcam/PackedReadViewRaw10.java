package com.google.googlex.gcam;

/* compiled from: PG */
public class PackedReadViewRaw10 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PackedReadViewRaw10() {
        this(GcamModuleJNI.new_PackedReadViewRaw10__SWIG_0(), true);
    }

    protected PackedReadViewRaw10(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public PackedReadViewRaw10(InterleavedReadViewU8 interleavedReadViewU8) {
        this(GcamModuleJNI.new_PackedReadViewRaw10__SWIG_1(InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8), true);
    }

    public PackedReadViewRaw10(PackedReadViewRaw10 packedReadViewRaw10) {
        this(GcamModuleJNI.new_PackedReadViewRaw10__SWIG_2(getCPtr(packedReadViewRaw10), packedReadViewRaw10), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.PackedReadViewRaw10_Empty(this.swigCPtr, this);
    }

    public boolean FastCrop(int i, int i2, int i3, int i4) {
        return GcamModuleJNI.PackedReadViewRaw10_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void Unpack(InterleavedWriteViewU16 interleavedWriteViewU16) {
        GcamModuleJNI.PackedReadViewRaw10_Unpack(this.swigCPtr, this, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }

    public void UnpackRow(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadViewRaw10_UnpackRow__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public void UnpackRow(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadViewRaw10_UnpackRow__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public int at(int i, int i2) {
        return GcamModuleJNI.PackedReadViewRaw10_at__SWIG_0(this.swigCPtr, this, i, i2);
    }

    public int at(int i, int i2, int i3) {
        return GcamModuleJNI.PackedReadViewRaw10_at__SWIG_1(this.swigCPtr, this, i, i2, i3);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PackedReadViewRaw10(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PackedReadViewRaw10 packedReadViewRaw10) {
        return packedReadViewRaw10 != null ? packedReadViewRaw10.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.PackedReadViewRaw10_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.PackedReadViewRaw10_num_channels(this.swigCPtr, this);
    }

    public InterleavedReadViewU8 packed_read_view() {
        return new InterleavedReadViewU8(GcamModuleJNI.PackedReadViewRaw10_packed_read_view(this.swigCPtr, this), false);
    }

    public long sample_array_size() {
        return GcamModuleJNI.PackedReadViewRaw10_sample_array_size(this.swigCPtr, this);
    }

    public ConstSampleIteratorPackedRaw10 sample_iterator() {
        return new ConstSampleIteratorPackedRaw10(GcamModuleJNI.PackedReadViewRaw10_sample_iterator(this.swigCPtr, this), true);
    }

    public int width() {
        return GcamModuleJNI.PackedReadViewRaw10_width(this.swigCPtr, this);
    }
}
