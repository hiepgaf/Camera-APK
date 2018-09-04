package com.google.googlex.gcam;

/* compiled from: PG */
public class InterleavedWriteViewU16 extends InterleavedReadViewU16 {
    public long swigCPtr;

    public InterleavedWriteViewU16() {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_3(), true);
    }

    public InterleavedWriteViewU16(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short, long j) {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_4(i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short), j), true);
    }

    protected InterleavedWriteViewU16(long j, boolean z) {
        super(GcamModuleJNI.InterleavedWriteViewU16_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public InterleavedWriteViewU16(InterleavedWriteViewU16 interleavedWriteViewU16) {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_0(getCPtr(interleavedWriteViewU16), interleavedWriteViewU16), true);
    }

    public InterleavedWriteViewU16(InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_2(getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, i, i2, i3, i4), true);
    }

    public InterleavedWriteViewU16(InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5, int i6) {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_1(getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, i, i2, i3, i4, i5, i6), true);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedWriteViewU16_FastCrop_SWIG_0_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedWriteViewU16_FastCrop_SWIG_0_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    public void Fill(int i) {
        GcamModuleJNI.InterleavedWriteViewU16_Fill__SWIG_1(this.swigCPtr, this, i);
    }

    public void Fill(int i, int i2, int i3, int i4, int i5) {
        GcamModuleJNI.InterleavedWriteViewU16_Fill__SWIG_0(this.swigCPtr, this, i, i2, i3, i4, i5);
    }

    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedWriteViewU16_SamplesAreCompact(this.swigCPtr, this);
    }

    public SWIGTYPE_p_unsigned_short at_InterleavedWriteViewU16(int i, int i2, int i3) {
        return new SWIGTYPE_p_unsigned_short(GcamModuleJNI.InterleavedWriteViewU16_at_InterleavedWriteViewU16(this.swigCPtr, this, i, i2, i3), false);
    }

    public SWIGTYPE_p_unsigned_short base_pointer() {
        long InterleavedWriteViewU16_base_pointer = GcamModuleJNI.InterleavedWriteViewU16_base_pointer(this.swigCPtr, this);
        return InterleavedWriteViewU16_base_pointer != 0 ? new SWIGTYPE_p_unsigned_short(InterleavedWriteViewU16_base_pointer, false) : null;
    }

    public long c_stride() {
        return GcamModuleJNI.InterleavedWriteViewU16_c_stride(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedWriteViewU16(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(InterleavedWriteViewU16 interleavedWriteViewU16) {
        return interleavedWriteViewU16 != null ? interleavedWriteViewU16.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.InterleavedWriteViewU16_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.InterleavedWriteViewU16_num_channels(this.swigCPtr, this);
    }

    public int row_padding() {
        return GcamModuleJNI.InterleavedWriteViewU16_row_padding(this.swigCPtr, this);
    }

    public long sample_array_size() {
        return GcamModuleJNI.InterleavedWriteViewU16_sample_array_size(this.swigCPtr, this);
    }

    public C0112xe3033bc9 sample_iterator_InterleavedWriteViewU16() {
        return new C0112xe3033bc9(GcamModuleJNI.m1369x86fe7a76(this.swigCPtr, this), true);
    }

    public C0112xe3033bc9 sample_iterator_InterleavedWriteViewU16(int i) {
        return new C0112xe3033bc9(GcamModuleJNI.m1370x86fe7a77(this.swigCPtr, this, i), true);
    }

    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedWriteViewU16_sizeof_sample_type(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.InterleavedWriteViewU16_width(this.swigCPtr, this);
    }

    public long x_stride() {
        return GcamModuleJNI.InterleavedWriteViewU16_x_stride(this.swigCPtr, this);
    }

    public long y_stride() {
        return GcamModuleJNI.InterleavedWriteViewU16_y_stride(this.swigCPtr, this);
    }
}
