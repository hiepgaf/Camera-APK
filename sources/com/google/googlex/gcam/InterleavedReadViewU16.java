package com.google.googlex.gcam;

/* compiled from: PG */
public class InterleavedReadViewU16 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedReadViewU16() {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_3(), true);
    }

    public InterleavedReadViewU16(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short, long j) {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_4(i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short), j), true);
    }

    protected InterleavedReadViewU16(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public InterleavedReadViewU16(InterleavedReadViewU16 interleavedReadViewU16) {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_0(getCPtr(interleavedReadViewU16), interleavedReadViewU16), true);
    }

    public InterleavedReadViewU16(InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_2(getCPtr(interleavedReadViewU16), interleavedReadViewU16, i, i2, i3, i4), true);
    }

    public InterleavedReadViewU16(InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4, int i5, int i6) {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_1(getCPtr(interleavedReadViewU16), interleavedReadViewU16, i, i2, i3, i4, i5, i6), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.InterleavedReadViewU16_Empty(this.swigCPtr, this);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedReadViewU16_FastCrop__SWIG_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedReadViewU16_FastCrop__SWIG_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedReadViewU16_SamplesAreCompact(this.swigCPtr, this);
    }

    public int at(int i, int i2, int i3) {
        return GcamModuleJNI.InterleavedReadViewU16_at(this.swigCPtr, this, i, i2, i3);
    }

    public SWIGTYPE_p_unsigned_short base_pointer() {
        long InterleavedReadViewU16_base_pointer = GcamModuleJNI.InterleavedReadViewU16_base_pointer(this.swigCPtr, this);
        return InterleavedReadViewU16_base_pointer != 0 ? new SWIGTYPE_p_unsigned_short(InterleavedReadViewU16_base_pointer, false) : null;
    }

    public long c_stride() {
        return GcamModuleJNI.InterleavedReadViewU16_c_stride(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedReadViewU16(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(InterleavedReadViewU16 interleavedReadViewU16) {
        return interleavedReadViewU16 != null ? interleavedReadViewU16.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.InterleavedReadViewU16_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.InterleavedReadViewU16_num_channels(this.swigCPtr, this);
    }

    public int row_padding() {
        return GcamModuleJNI.InterleavedReadViewU16_row_padding(this.swigCPtr, this);
    }

    public long sample_array_size() {
        return GcamModuleJNI.InterleavedReadViewU16_sample_array_size(this.swigCPtr, this);
    }

    public C0111x2c938a65 sample_iterator() {
        return new C0111x2c938a65(GcamModuleJNI.InterleavedReadViewU16_sample_iterator__SWIG_0(this.swigCPtr, this), true);
    }

    public C0111x2c938a65 sample_iterator(int i) {
        return new C0111x2c938a65(GcamModuleJNI.InterleavedReadViewU16_sample_iterator__SWIG_1(this.swigCPtr, this, i), true);
    }

    public static int sample_layout() {
        return GcamModuleJNI.InterleavedReadViewU16_sample_layout();
    }

    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedReadViewU16_sizeof_sample_type(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.InterleavedReadViewU16_width(this.swigCPtr, this);
    }

    public long x_stride() {
        return GcamModuleJNI.InterleavedReadViewU16_x_stride(this.swigCPtr, this);
    }

    public long y_stride() {
        return GcamModuleJNI.InterleavedReadViewU16_y_stride(this.swigCPtr, this);
    }
}
