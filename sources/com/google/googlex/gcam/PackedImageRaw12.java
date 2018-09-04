package com.google.googlex.gcam;

/* compiled from: PG */
public class PackedImageRaw12 extends PackedReadWriteViewRaw12 {
    public long swigCPtr;

    public PackedImageRaw12() {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_0(), true);
    }

    public PackedImageRaw12(int i, int i2) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_9(i, i2), true);
    }

    public PackedImageRaw12(int i, int i2, int i3) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_8(i, i2, i3), true);
    }

    public PackedImageRaw12(int i, int i2, int i3, long j) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_7(i, i2, i3, j), true);
    }

    public PackedImageRaw12(int i, int i2, int i3, long j, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_6(i, i2, i3, j, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    protected PackedImageRaw12(long j, boolean z) {
        super(GcamModuleJNI.PackedImageRaw12_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public PackedImageRaw12(InterleavedImageU8 interleavedImageU8) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_1(InterleavedImageU8.getCPtr(interleavedImageU8), interleavedImageU8), true);
    }

    public PackedImageRaw12(InterleavedReadViewU16 interleavedReadViewU16) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_3(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16), true);
    }

    public PackedImageRaw12(InterleavedReadViewU16 interleavedReadViewU16, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_2(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public PackedImageRaw12(C0107x12336837 c0107x12336837) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_5(C0107x12336837.getCPtr(c0107x12336837)), true);
    }

    public PackedImageRaw12(C0107x12336837 c0107x12336837, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_4(C0107x12336837.getCPtr(c0107x12336837), SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public boolean FastCrop(int i, int i2, int i3, int i4) {
        return GcamModuleJNI.PackedImageRaw12_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PackedImageRaw12(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(PackedImageRaw12 packedImageRaw12) {
        return packedImageRaw12 != null ? packedImageRaw12.swigCPtr : 0;
    }

    public InterleavedImageU8 packed_image() {
        return new InterleavedImageU8(GcamModuleJNI.PackedImageRaw12_packed_image(this.swigCPtr, this), false);
    }
}
