package com.google.googlex.gcam;

/* compiled from: PG */
public class RawFinishParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawFinishParams() {
        this(GcamModuleJNI.new_RawFinishParams(), true);
    }

    protected RawFinishParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawFinishParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public ArcFlareParam getArc_flare() {
        long RawFinishParams_arc_flare_get = GcamModuleJNI.RawFinishParams_arc_flare_get(this.swigCPtr, this);
        return RawFinishParams_arc_flare_get != 0 ? new ArcFlareParam(RawFinishParams_arc_flare_get, false) : null;
    }

    protected static long getCPtr(RawFinishParams rawFinishParams) {
        return rawFinishParams != null ? rawFinishParams.swigCPtr : 0;
    }

    public ChromaticAberrationParams getChromatic_aberration() {
        long RawFinishParams_chromatic_aberration_get = GcamModuleJNI.RawFinishParams_chromatic_aberration_get(this.swigCPtr, this);
        return RawFinishParams_chromatic_aberration_get != 0 ? new ChromaticAberrationParams(RawFinishParams_chromatic_aberration_get, false) : null;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t getDenoise() {
        long RawFinishParams_denoise_get = GcamModuleJNI.RawFinishParams_denoise_get(this.swigCPtr, this);
        return RawFinishParams_denoise_get != 0 ? new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t(RawFinishParams_denoise_get, false) : null;
    }

    public int getGeometric_correction() {
        return GcamModuleJNI.RawFinishParams_geometric_correction_get(this.swigCPtr, this);
    }

    public float getGreen_imbalance_factor() {
        return GcamModuleJNI.RawFinishParams_green_imbalance_factor_get(this.swigCPtr, this);
    }

    public int getIcc_output_profile() {
        return GcamModuleJNI.RawFinishParams_icc_output_profile_get(this.swigCPtr, this);
    }

    public float getMax_black_level_offset() {
        return GcamModuleJNI.RawFinishParams_max_black_level_offset_get(this.swigCPtr, this);
    }

    public int getMax_synthetic_exposures() {
        return GcamModuleJNI.RawFinishParams_max_synthetic_exposures_get(this.swigCPtr, this);
    }

    public FloatSmoothKeyValueMap getPost_zoom_sharpen_strength() {
        long RawFinishParams_post_zoom_sharpen_strength_get = GcamModuleJNI.RawFinishParams_post_zoom_sharpen_strength_get(this.swigCPtr, this);
        return RawFinishParams_post_zoom_sharpen_strength_get != 0 ? new FloatSmoothKeyValueMap(RawFinishParams_post_zoom_sharpen_strength_get, false) : null;
    }

    public int getResampling_method() {
        return GcamModuleJNI.RawFinishParams_resampling_method_get(this.swigCPtr, this);
    }

    public C0113x73b9284e getRgb_map() {
        return new C0113x73b9284e(GcamModuleJNI.RawFinishParams_rgb_map_get(this.swigCPtr, this), true);
    }

    public ColorSatParams getSaturation() {
        long RawFinishParams_saturation_get = GcamModuleJNI.RawFinishParams_saturation_get(this.swigCPtr, this);
        return RawFinishParams_saturation_get != 0 ? new ColorSatParams(RawFinishParams_saturation_get, false) : null;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t getSharpen_params() {
        long RawFinishParams_sharpen_params_get = GcamModuleJNI.RawFinishParams_sharpen_params_get(this.swigCPtr, this);
        return RawFinishParams_sharpen_params_get != 0 ? new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t(RawFinishParams_sharpen_params_get, false) : null;
    }

    public FloatSmoothKeyValueMap getZoom_finest_scale_denoise_attenuation() {
        long RawFinishParams_zoom_finest_scale_denoise_attenuation_get = GcamModuleJNI.RawFinishParams_zoom_finest_scale_denoise_attenuation_get(this.swigCPtr, this);
        return RawFinishParams_zoom_finest_scale_denoise_attenuation_get != 0 ? new FloatSmoothKeyValueMap(RawFinishParams_zoom_finest_scale_denoise_attenuation_get, false) : null;
    }

    public FloatSmoothKeyValueMap getZoom_sharpen_attenuation() {
        long RawFinishParams_zoom_sharpen_attenuation_get = GcamModuleJNI.RawFinishParams_zoom_sharpen_attenuation_get(this.swigCPtr, this);
        return RawFinishParams_zoom_sharpen_attenuation_get != 0 ? new FloatSmoothKeyValueMap(RawFinishParams_zoom_sharpen_attenuation_get, false) : null;
    }

    public void setArc_flare(ArcFlareParam arcFlareParam) {
        GcamModuleJNI.RawFinishParams_arc_flare_set(this.swigCPtr, this, ArcFlareParam.getCPtr(arcFlareParam), arcFlareParam);
    }

    public void setChromatic_aberration(ChromaticAberrationParams chromaticAberrationParams) {
        GcamModuleJNI.RawFinishParams_chromatic_aberration_set(this.swigCPtr, this, ChromaticAberrationParams.getCPtr(chromaticAberrationParams), chromaticAberrationParams);
    }

    public void setDenoise(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t) {
        GcamModuleJNI.RawFinishParams_denoise_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t));
    }

    public void setGeometric_correction(int i) {
        GcamModuleJNI.RawFinishParams_geometric_correction_set(this.swigCPtr, this, i);
    }

    public void setGreen_imbalance_factor(float f) {
        GcamModuleJNI.RawFinishParams_green_imbalance_factor_set(this.swigCPtr, this, f);
    }

    public void setIcc_output_profile(int i) {
        GcamModuleJNI.RawFinishParams_icc_output_profile_set(this.swigCPtr, this, i);
    }

    public void setMax_black_level_offset(float f) {
        GcamModuleJNI.RawFinishParams_max_black_level_offset_set(this.swigCPtr, this, f);
    }

    public void setMax_synthetic_exposures(int i) {
        GcamModuleJNI.RawFinishParams_max_synthetic_exposures_set(this.swigCPtr, this, i);
    }

    public void setPost_zoom_sharpen_strength(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_post_zoom_sharpen_strength_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setResampling_method(int i) {
        GcamModuleJNI.RawFinishParams_resampling_method_set(this.swigCPtr, this, i);
    }

    public void setRgb_map(C0113x73b9284e c0113x73b9284e) {
        GcamModuleJNI.RawFinishParams_rgb_map_set(this.swigCPtr, this, C0113x73b9284e.getCPtr(c0113x73b9284e));
    }

    public void setSaturation(ColorSatParams colorSatParams) {
        GcamModuleJNI.RawFinishParams_saturation_set(this.swigCPtr, this, ColorSatParams.getCPtr(colorSatParams), colorSatParams);
    }

    public void setSharpen_params(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t) {
        GcamModuleJNI.RawFinishParams_sharpen_params_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t));
    }

    public void setZoom_finest_scale_denoise_attenuation(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_zoom_finest_scale_denoise_attenuation_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setZoom_sharpen_attenuation(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_zoom_sharpen_attenuation_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }
}
