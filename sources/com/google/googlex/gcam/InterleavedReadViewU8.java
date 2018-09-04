package com.google.googlex.gcam;

/* compiled from: PG */
public class InterleavedReadViewU8 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedReadViewU8() {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_3(), true);
    }

    public InterleavedReadViewU8(int i, int i2, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j) {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_4(i, i2, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j), true);
    }

    protected InterleavedReadViewU8(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public InterleavedReadViewU8(InterleavedReadViewU8 interleavedReadViewU8) {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_0(getCPtr(interleavedReadViewU8), interleavedReadViewU8), true);
    }

    public InterleavedReadViewU8(InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_2(getCPtr(interleavedReadViewU8), interleavedReadViewU8, i, i2, i3, i4), true);
    }

    public InterleavedReadViewU8(InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4, int i5, int i6) {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_1(getCPtr(interleavedReadViewU8), interleavedReadViewU8, i, i2, i3, i4, i5, i6), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.InterleavedReadViewU8_Empty(this.swigCPtr, this);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedReadViewU8_FastCrop__SWIG_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedReadViewU8_FastCrop__SWIG_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedReadViewU8_SamplesAreCompact(this.swigCPtr, this);
    }

    public short at(int i, int i2, int i3) {
        return GcamModuleJNI.InterleavedReadViewU8_at(this.swigCPtr, this, i, i2, i3);
    }

    public SWIGTYPE_p_unsigned_char base_pointer() {
        long InterleavedReadViewU8_base_pointer = GcamModuleJNI.InterleavedReadViewU8_base_pointer(this.swigCPtr, this);
        return InterleavedReadViewU8_base_pointer != 0 ? new SWIGTYPE_p_unsigned_char(InterleavedReadViewU8_base_pointer, false) : null;
    }

    public long c_stride() {
        return GcamModuleJNI.InterleavedReadViewU8_c_stride(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedReadViewU8(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(InterleavedReadViewU8 interleavedReadViewU8) {
        return interleavedReadViewU8 != null ? interleavedReadViewU8.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.InterleavedReadViewU8_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.InterleavedReadViewU8_num_channels(this.swigCPtr, this);
    }

    public int row_padding() {
        return GcamModuleJNI.InterleavedReadViewU8_row_padding(this.swigCPtr, this);
    }

    public long sample_array_size() {
        return GcamModuleJNI.InterleavedReadViewU8_sample_array_size(this.swigCPtr, this);
    }

    public C0109x2169a37f sample_iterator() {
        return new C0109x2169a37f(GcamModuleJNI.InterleavedReadViewU8_sample_iterator__SWIG_0(this.swigCPtr, this), true);
    }

    public C0109x2169a37f sample_iterator(int i) {
        return new C0109x2169a37f(GcamModuleJNI.InterleavedReadViewU8_sample_iterator__SWIG_1(this.swigCPtr, this, i), true);
    }

    public static int sample_layout() {
        return GcamModuleJNI.InterleavedReadViewU8_sample_layout();
    }

    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedReadViewU8_sizeof_sample_type(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.InterleavedReadViewU8_width(this.swigCPtr, this);
    }

    public long x_stride() {
        return GcamModuleJNI.InterleavedReadViewU8_x_stride(this.swigCPtr, this);
    }

    public long y_stride() {
        return GcamModuleJNI.InterleavedReadViewU8_y_stride(this.swigCPtr, this);
    }
}
