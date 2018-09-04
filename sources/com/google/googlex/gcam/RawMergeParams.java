package com.google.googlex.gcam;

/* compiled from: PG */
public class RawMergeParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawMergeParams() {
        this(GcamModuleJNI.new_RawMergeParams(), true);
    }

    protected RawMergeParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawMergeParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t getAlign_tile_size() {
        long RawMergeParams_align_tile_size_get = GcamModuleJNI.RawMergeParams_align_tile_size_get(this.swigCPtr, this);
        return RawMergeParams_align_tile_size_get != 0 ? new SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t(RawMergeParams_align_tile_size_get, false) : null;
    }

    protected static long getCPtr(RawMergeParams rawMergeParams) {
        return rawMergeParams != null ? rawMergeParams.swigCPtr : 0;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t getMerge_tile_size() {
        long RawMergeParams_merge_tile_size_get = GcamModuleJNI.RawMergeParams_merge_tile_size_get(this.swigCPtr, this);
        return RawMergeParams_merge_tile_size_get != 0 ? new SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t(RawMergeParams_merge_tile_size_get, false) : null;
    }

    public FloatSmoothKeyValueMap getSpatial_strength() {
        long RawMergeParams_spatial_strength_get = GcamModuleJNI.RawMergeParams_spatial_strength_get(this.swigCPtr, this);
        return RawMergeParams_spatial_strength_get != 0 ? new FloatSmoothKeyValueMap(RawMergeParams_spatial_strength_get, false) : null;
    }

    public FloatSmoothKeyValueMap getTemporal_strength() {
        long RawMergeParams_temporal_strength_get = GcamModuleJNI.RawMergeParams_temporal_strength_get(this.swigCPtr, this);
        return RawMergeParams_temporal_strength_get != 0 ? new FloatSmoothKeyValueMap(RawMergeParams_temporal_strength_get, false) : null;
    }

    public void setAlign_tile_size(SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t) {
        GcamModuleJNI.RawMergeParams_align_tile_size_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t));
    }

    public void setMerge_tile_size(SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t) {
        GcamModuleJNI.RawMergeParams_merge_tile_size_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t));
    }

    public void setSpatial_strength(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawMergeParams_spatial_strength_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setTemporal_strength(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawMergeParams_temporal_strength_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }
}
