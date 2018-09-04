package com.google.googlex.gcam;

/* compiled from: PG */
public class InterleavedImageU16 extends InterleavedWriteViewU16 {
    public long swigCPtr;

    public InterleavedImageU16() {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_0(), true);
    }

    public InterleavedImageU16(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_3(i, i2, i3), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_2(i, i2, i3, i4), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4, long j) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_5(i, i2, i3, i4, j), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4, long j, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_4(i, i2, i3, i4, j, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_1(i, i2, i3, i4, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, long j, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_6(i, i2, i3, j, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short), SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    protected InterleavedImageU16(long j, boolean z) {
        super(GcamModuleJNI.InterleavedImageU16_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public InterleavedImageU16(InterleavedImageU16 interleavedImageU16) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_7(getCPtr(interleavedImageU16), interleavedImageU16), true);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedImageU16_FastCrop_SWIG_0_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedImageU16_FastCrop_SWIG_0_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedImageU16_SamplesAreCompact(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__TImageSampleAllocator allocator() {
        long InterleavedImageU16_allocator = GcamModuleJNI.InterleavedImageU16_allocator(this.swigCPtr, this);
        return InterleavedImageU16_allocator != 0 ? new SWIGTYPE_p_gcam__TImageSampleAllocator(InterleavedImageU16_allocator, false) : null;
    }

    public long c_stride() {
        return GcamModuleJNI.InterleavedImageU16_c_stride(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedImageU16(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(InterleavedImageU16 interleavedImageU16) {
        return interleavedImageU16 != null ? interleavedImageU16.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.InterleavedImageU16_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.InterleavedImageU16_num_channels(this.swigCPtr, this);
    }

    public int row_padding() {
        return GcamModuleJNI.InterleavedImageU16_row_padding(this.swigCPtr, this);
    }

    public long sample_array_size() {
        return GcamModuleJNI.InterleavedImageU16_sample_array_size(this.swigCPtr, this);
    }

    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedImageU16_sizeof_sample_type(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.InterleavedImageU16_width(this.swigCPtr, this);
    }

    public long x_stride() {
        return GcamModuleJNI.InterleavedImageU16_x_stride(this.swigCPtr, this);
    }

    public long y_stride() {
        return GcamModuleJNI.InterleavedImageU16_y_stride(this.swigCPtr, this);
    }
}
