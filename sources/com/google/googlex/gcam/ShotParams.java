package com.google.googlex.gcam;

/* compiled from: PG */
public class ShotParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ShotParams() {
        this(GcamModuleJNI.new_ShotParams(), true);
    }

    protected ShotParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check(InitParams initParams, StaticMetadata staticMetadata) {
        return GcamModuleJNI.ShotParams_Check(this.swigCPtr, this, InitParams.getCPtr(initParams), initParams, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.ShotParams_DeserializeFromString__SWIG_0(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean DeserializeFromString(String str) {
        return GcamModuleJNI.ShotParams_DeserializeFromString__SWIG_1(this.swigCPtr, this, str);
    }

    public boolean Equals(ShotParams shotParams) {
        return GcamModuleJNI.ShotParams_Equals(this.swigCPtr, this, getCPtr(shotParams), shotParams);
    }

    public void Print(int i) {
        GcamModuleJNI.ShotParams_Print(this.swigCPtr, this, i);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string) {
        GcamModuleJNI.ShotParams_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string));
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ShotParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public AeShotParams getAe() {
        long ShotParams_ae_get = GcamModuleJNI.ShotParams_ae_get(this.swigCPtr, this);
        return ShotParams_ae_get != 0 ? new AeShotParams(ShotParams_ae_get, false) : null;
    }

    public boolean getAllow_base_frame_reuse() {
        return GcamModuleJNI.ShotParams_allow_base_frame_reuse_get(this.swigCPtr, this);
    }

    public boolean getAllow_temporal_binning() {
        return GcamModuleJNI.ShotParams_allow_temporal_binning_get(this.swigCPtr, this);
    }

    public int getBase_frame_override_index() {
        return GcamModuleJNI.ShotParams_base_frame_override_index_get(this.swigCPtr, this);
    }

    protected static long getCPtr(ShotParams shotParams) {
        return shotParams != null ? shotParams.swigCPtr : 0;
    }

    public boolean getCompress_merged_dng() {
        return GcamModuleJNI.ShotParams_compress_merged_dng_get(this.swigCPtr, this);
    }

    public boolean getCull_metering_frames_using_previous_viewfinder() {
        return GcamModuleJNI.ShotParams_cull_metering_frames_using_previous_viewfinder_get(this.swigCPtr, this);
    }

    public int getFinal_jpg_quality() {
        return GcamModuleJNI.ShotParams_final_jpg_quality_get(this.swigCPtr, this);
    }

    public int getFlash_mode() {
        return GcamModuleJNI.ShotParams_flash_mode_get(this.swigCPtr, this);
    }

    public AwbInfo getForce_wb() {
        long ShotParams_force_wb_get = GcamModuleJNI.ShotParams_force_wb_get(this.swigCPtr, this);
        return ShotParams_force_wb_get != 0 ? new AwbInfo(ShotParams_force_wb_get, false) : null;
    }

    public int getFull_metering_sweep_frame_count() {
        return GcamModuleJNI.ShotParams_full_metering_sweep_frame_count_get(this.swigCPtr, this);
    }

    public boolean getGenerate_jpg_thumbnail() {
        return GcamModuleJNI.ShotParams_generate_jpg_thumbnail_get(this.swigCPtr, this);
    }

    public int getIcc_output_profile_override() {
        return GcamModuleJNI.ShotParams_icc_output_profile_override_get(this.swigCPtr, this);
    }

    public int getImage_rotation() {
        return GcamModuleJNI.ShotParams_image_rotation_get(this.swigCPtr, this);
    }

    public boolean getManually_rotate_final_jpg() {
        return GcamModuleJNI.ShotParams_manually_rotate_final_jpg_get(this.swigCPtr, this);
    }

    public float getMetering_frame_brightness_boost() {
        return GcamModuleJNI.ShotParams_metering_frame_brightness_boost_get(this.swigCPtr, this);
    }

    public float getPrevious_viewfinder_tet() {
        return GcamModuleJNI.ShotParams_previous_viewfinder_tet_get(this.swigCPtr, this);
    }

    public AwbInfo getPrevious_viewfinder_wb() {
        long ShotParams_previous_viewfinder_wb_get = GcamModuleJNI.ShotParams_previous_viewfinder_wb_get(this.swigCPtr, this);
        return ShotParams_previous_viewfinder_wb_get != 0 ? new AwbInfo(ShotParams_previous_viewfinder_wb_get, false) : null;
    }

    public int getRaw_cropping_override() {
        return GcamModuleJNI.ShotParams_raw_cropping_override_get(this.swigCPtr, this);
    }

    public boolean getRecompute_wb_on_base_frame() {
        return GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_get(this.swigCPtr, this);
    }

    public int getResampling_method_override() {
        return GcamModuleJNI.ShotParams_resampling_method_override_get(this.swigCPtr, this);
    }

    public boolean getSave_merged_dng() {
        return GcamModuleJNI.ShotParams_save_merged_dng_get(this.swigCPtr, this);
    }

    public String getSoftware_suffix() {
        return GcamModuleJNI.ShotParams_software_suffix_get(this.swigCPtr, this);
    }

    public int getWb_mode() {
        return GcamModuleJNI.ShotParams_wb_mode_get(this.swigCPtr, this);
    }

    public boolean getZsl() {
        return GcamModuleJNI.ShotParams_zsl_get(this.swigCPtr, this);
    }

    public int getZsl_base_frame_index_hint() {
        return GcamModuleJNI.ShotParams_zsl_base_frame_index_hint_get(this.swigCPtr, this);
    }

    public void setAe(AeShotParams aeShotParams) {
        GcamModuleJNI.ShotParams_ae_set(this.swigCPtr, this, AeShotParams.getCPtr(aeShotParams), aeShotParams);
    }

    public void setAllow_base_frame_reuse(boolean z) {
        GcamModuleJNI.ShotParams_allow_base_frame_reuse_set(this.swigCPtr, this, z);
    }

    public void setAllow_temporal_binning(boolean z) {
        GcamModuleJNI.ShotParams_allow_temporal_binning_set(this.swigCPtr, this, z);
    }

    public void setBase_frame_override_index(int i) {
        GcamModuleJNI.ShotParams_base_frame_override_index_set(this.swigCPtr, this, i);
    }

    public void setCompress_merged_dng(boolean z) {
        GcamModuleJNI.ShotParams_compress_merged_dng_set(this.swigCPtr, this, z);
    }

    public void setCull_metering_frames_using_previous_viewfinder(boolean z) {
        GcamModuleJNI.ShotParams_cull_metering_frames_using_previous_viewfinder_set(this.swigCPtr, this, z);
    }

    public void setFinal_jpg_quality(int i) {
        GcamModuleJNI.ShotParams_final_jpg_quality_set(this.swigCPtr, this, i);
    }

    public void setFlash_mode(int i) {
        GcamModuleJNI.ShotParams_flash_mode_set(this.swigCPtr, this, i);
    }

    public void setForce_wb(AwbInfo awbInfo) {
        GcamModuleJNI.ShotParams_force_wb_set(this.swigCPtr, this, AwbInfo.getCPtr(awbInfo), awbInfo);
    }

    public void setFull_metering_sweep_frame_count(int i) {
        GcamModuleJNI.ShotParams_full_metering_sweep_frame_count_set(this.swigCPtr, this, i);
    }

    public void setGenerate_jpg_thumbnail(boolean z) {
        GcamModuleJNI.ShotParams_generate_jpg_thumbnail_set(this.swigCPtr, this, z);
    }

    public void setIcc_output_profile_override(int i) {
        GcamModuleJNI.ShotParams_icc_output_profile_override_set(this.swigCPtr, this, i);
    }

    public void setImage_rotation(int i) {
        GcamModuleJNI.ShotParams_image_rotation_set(this.swigCPtr, this, i);
    }

    public void setManually_rotate_final_jpg(boolean z) {
        GcamModuleJNI.ShotParams_manually_rotate_final_jpg_set(this.swigCPtr, this, z);
    }

    public void setMetering_frame_brightness_boost(float f) {
        GcamModuleJNI.ShotParams_metering_frame_brightness_boost_set(this.swigCPtr, this, f);
    }

    public void setPrevious_viewfinder_tet(float f) {
        GcamModuleJNI.ShotParams_previous_viewfinder_tet_set(this.swigCPtr, this, f);
    }

    public void setPrevious_viewfinder_wb(AwbInfo awbInfo) {
        GcamModuleJNI.ShotParams_previous_viewfinder_wb_set(this.swigCPtr, this, AwbInfo.getCPtr(awbInfo), awbInfo);
    }

    public void setRaw_cropping_override(int i) {
        GcamModuleJNI.ShotParams_raw_cropping_override_set(this.swigCPtr, this, i);
    }

    public void setRecompute_wb_on_base_frame(boolean z) {
        GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_set(this.swigCPtr, this, z);
    }

    public void setResampling_method_override(int i) {
        GcamModuleJNI.ShotParams_resampling_method_override_set(this.swigCPtr, this, i);
    }

    public void setSave_merged_dng(boolean z) {
        GcamModuleJNI.ShotParams_save_merged_dng_set(this.swigCPtr, this, z);
    }

    public void setSoftware_suffix(String str) {
        GcamModuleJNI.ShotParams_software_suffix_set(this.swigCPtr, this, str);
    }

    public void setWb_mode(int i) {
        GcamModuleJNI.ShotParams_wb_mode_set(this.swigCPtr, this, i);
    }

    public void setZsl(boolean z) {
        GcamModuleJNI.ShotParams_zsl_set(this.swigCPtr, this, z);
    }

    public void setZsl_base_frame_index_hint(int i) {
        GcamModuleJNI.ShotParams_zsl_base_frame_index_hint_set(this.swigCPtr, this, i);
    }
}
