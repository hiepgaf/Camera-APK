package com.google.googlex.gcam;

/* compiled from: PG */
public class SpatialGainMap {
    public static final int kNumCh = 4;
    public boolean swigCMemOwn;
    public long swigCPtr;

    public SpatialGainMap() {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_0(), true);
    }

    public SpatialGainMap(int i, int i2, boolean z, boolean z2) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_2(i, i2, z, z2), true);
    }

    public SpatialGainMap(int i, int i2, boolean z, boolean z2, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_1(i, i2, z, z2, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    protected SpatialGainMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public SpatialGainMap(C0106x20324196 c0106x20324196, boolean z, boolean z2) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_4(C0106x20324196.getCPtr(c0106x20324196), z, z2), true);
    }

    public SpatialGainMap(C0106x20324196 c0106x20324196, boolean z, boolean z2, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_3(C0106x20324196.getCPtr(c0106x20324196), z, z2, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public SpatialGainMap(SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t sWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t, boolean z, boolean z2) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_5(SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t.getCPtr(sWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t), z, z2), true);
    }

    public SpatialGainMap(SpatialGainMap spatialGainMap) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_6(getCPtr(spatialGainMap), spatialGainMap), true);
    }

    public boolean Check(SWIGTYPE_p_std__string sWIGTYPE_p_std__string) {
        return GcamModuleJNI.SpatialGainMap_Check(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string));
    }

    public static SpatialGainMap CreateFromBuffer(SWIGTYPE_p_std__vectorT_unsigned_char_t sWIGTYPE_p_std__vectorT_unsigned_char_t) {
        return new SpatialGainMap(GcamModuleJNI.SpatialGainMap_CreateFromBuffer(SWIGTYPE_p_std__vectorT_unsigned_char_t.getCPtr(sWIGTYPE_p_std__vectorT_unsigned_char_t)), true);
    }

    public static SpatialGainMap CreateFromFile(String str) {
        return new SpatialGainMap(GcamModuleJNI.SpatialGainMap_CreateFromFile(str), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.SpatialGainMap_Empty(this.swigCPtr, this);
    }

    public void ForceScaleBy(SpatialGainMap spatialGainMap) {
        GcamModuleJNI.SpatialGainMap_ForceScaleBy(this.swigCPtr, this, getCPtr(spatialGainMap), spatialGainMap);
    }

    public float InterpolatedReadRgb(float f, float f2, int i) {
        return GcamModuleJNI.SpatialGainMap_InterpolatedReadRgb(this.swigCPtr, this, f, f2, i);
    }

    public float InterpolatedReadRggb(float f, float f2, int i) {
        return GcamModuleJNI.SpatialGainMap_InterpolatedReadRggb(this.swigCPtr, this, f, f2, i);
    }

    public void Print() {
        GcamModuleJNI.SpatialGainMap_Print(this.swigCPtr, this);
    }

    public float ReadRgb(int i, int i2, int i3) {
        return GcamModuleJNI.SpatialGainMap_ReadRgb(this.swigCPtr, this, i, i2, i3);
    }

    public float ReadRggb(int i, int i2, int i3) {
        return GcamModuleJNI.SpatialGainMap_ReadRggb(this.swigCPtr, this, i, i2, i3);
    }

    public SpatialGainMap ResizeAndCrop(int i, int i2, NormalizedRect normalizedRect) {
        return new SpatialGainMap(GcamModuleJNI.SpatialGainMap_ResizeAndCrop(this.swigCPtr, this, i, i2, NormalizedRect.getCPtr(normalizedRect), normalizedRect), true);
    }

    public void ScaleBy(SpatialGainMap spatialGainMap) {
        GcamModuleJNI.SpatialGainMap_ScaleBy(this.swigCPtr, this, getCPtr(spatialGainMap), spatialGainMap);
    }

    public SWIGTYPE_p_std__vectorT_unsigned_char_t SerializeToBuffer() {
        return new SWIGTYPE_p_std__vectorT_unsigned_char_t(GcamModuleJNI.SpatialGainMap_SerializeToBuffer(this.swigCPtr, this), true);
    }

    public void WriteRggb(int i, int i2, int i3, float f) {
        GcamModuleJNI.SpatialGainMap_WriteRggb(this.swigCPtr, this, i, i2, i3, f);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_SpatialGainMap(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t gain_map() {
        return new SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t(GcamModuleJNI.SpatialGainMap_gain_map(this.swigCPtr, this), false);
    }

    protected static long getCPtr(SpatialGainMap spatialGainMap) {
        return spatialGainMap != null ? spatialGainMap.swigCPtr : 0;
    }

    public boolean has_extra_vignetting_applied() {
        return GcamModuleJNI.SpatialGainMap_has_extra_vignetting_applied(this.swigCPtr, this);
    }

    public int height() {
        return GcamModuleJNI.SpatialGainMap_height(this.swigCPtr, this);
    }

    public boolean is_precise() {
        return GcamModuleJNI.SpatialGainMap_is_precise(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.SpatialGainMap_num_channels(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.SpatialGainMap_width(this.swigCPtr, this);
    }
}
