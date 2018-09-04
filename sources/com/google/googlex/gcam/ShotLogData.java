package com.google.googlex.gcam;

/* compiled from: PG */
public class ShotLogData {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ShotLogData() {
        this(GcamModuleJNI.new_ShotLogData(), true);
    }

    protected ShotLogData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.ShotLogData_Check(this.swigCPtr, this);
    }

    public void Clear() {
        GcamModuleJNI.ShotLogData_Clear(this.swigCPtr, this);
    }

    public void Print(int i) {
        GcamModuleJNI.ShotLogData_Print(this.swigCPtr, this, i);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string) {
        GcamModuleJNI.ShotLogData_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string));
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ShotLogData(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getAborted() {
        return GcamModuleJNI.ShotLogData_aborted_get(this.swigCPtr, this);
    }

    public float getActual_range_compression() {
        return GcamModuleJNI.ShotLogData_actual_range_compression_get(this.swigCPtr, this);
    }

    public float getAe_confidence_long_exposure() {
        return GcamModuleJNI.ShotLogData_ae_confidence_long_exposure_get(this.swigCPtr, this);
    }

    public float getAe_confidence_short_exposure() {
        return GcamModuleJNI.ShotLogData_ae_confidence_short_exposure_get(this.swigCPtr, this);
    }

    public float getAe_confidence_single_exposure() {
        return GcamModuleJNI.ShotLogData_ae_confidence_single_exposure_get(this.swigCPtr, this);
    }

    public int getBase_frame_index() {
        return GcamModuleJNI.ShotLogData_base_frame_index_get(this.swigCPtr, this);
    }

    protected static long getCPtr(ShotLogData shotLogData) {
        return shotLogData != null ? shotLogData.swigCPtr : 0;
    }

    public float getCapture_time() {
        return GcamModuleJNI.ShotLogData_capture_time_get(this.swigCPtr, this);
    }

    public float getCpu_usage_factor() {
        return GcamModuleJNI.ShotLogData_cpu_usage_factor_get(this.swigCPtr, this);
    }

    public int getExecuted_finish_on() {
        return GcamModuleJNI.ShotLogData_executed_finish_on_get(this.swigCPtr, this);
    }

    public float getFinal_image_callback_time() {
        return GcamModuleJNI.ShotLogData_final_image_callback_time_get(this.swigCPtr, this);
    }

    public FloatVector getFinal_payload_frame_sharpness() {
        long ShotLogData_final_payload_frame_sharpness_get = GcamModuleJNI.ShotLogData_final_payload_frame_sharpness_get(this.swigCPtr, this);
        return ShotLogData_final_payload_frame_sharpness_get != 0 ? new FloatVector(ShotLogData_final_payload_frame_sharpness_get, false) : null;
    }

    public float getFinish_process_time() {
        return GcamModuleJNI.ShotLogData_finish_process_time_get(this.swigCPtr, this);
    }

    public float getIdeal_range_compression() {
        return GcamModuleJNI.ShotLogData_ideal_range_compression_get(this.swigCPtr, this);
    }

    public float getJpeg_callback_time() {
        return GcamModuleJNI.ShotLogData_jpeg_callback_time_get(this.swigCPtr, this);
    }

    public float getJpeg_encode_time() {
        return GcamModuleJNI.ShotLogData_jpeg_encode_time_get(this.swigCPtr, this);
    }

    public float getLog_scene_brightness() {
        return GcamModuleJNI.ShotLogData_log_scene_brightness_get(this.swigCPtr, this);
    }

    public float getLong_exp_adjustment_factor() {
        return GcamModuleJNI.ShotLogData_long_exp_adjustment_factor_get(this.swigCPtr, this);
    }

    public float getMerge_process_time() {
        return GcamModuleJNI.ShotLogData_merge_process_time_get(this.swigCPtr, this);
    }

    public int getMerged_frame_count() {
        return GcamModuleJNI.ShotLogData_merged_frame_count_get(this.swigCPtr, this);
    }

    public float getMerged_raw_callback_time() {
        return GcamModuleJNI.ShotLogData_merged_raw_callback_time_get(this.swigCPtr, this);
    }

    public int getMetering_frame_count() {
        return GcamModuleJNI.ShotLogData_metering_frame_count_get(this.swigCPtr, this);
    }

    public int getOriginal_payload_frame_count() {
        return GcamModuleJNI.ShotLogData_original_payload_frame_count_get(this.swigCPtr, this);
    }

    public FloatVector getOriginal_payload_frame_sharpness() {
        long ShotLogData_original_payload_frame_sharpness_get = GcamModuleJNI.ShotLogData_original_payload_frame_sharpness_get(this.swigCPtr, this);
        return ShotLogData_original_payload_frame_sharpness_get != 0 ? new FloatVector(ShotLogData_original_payload_frame_sharpness_get, false) : null;
    }

    public float getPostview_callback_time() {
        return GcamModuleJNI.ShotLogData_postview_callback_time_get(this.swigCPtr, this);
    }

    public float getPure_fraction_of_pixels_from_long_exposure() {
        return GcamModuleJNI.ShotLogData_pure_fraction_of_pixels_from_long_exposure_get(this.swigCPtr, this);
    }

    public float getShort_exp_adjustment_factor() {
        return GcamModuleJNI.ShotLogData_short_exp_adjustment_factor_get(this.swigCPtr, this);
    }

    public float getTime_to_postview() {
        return GcamModuleJNI.ShotLogData_time_to_postview_get(this.swigCPtr, this);
    }

    public float getTime_to_shot() {
        return GcamModuleJNI.ShotLogData_time_to_shot_get(this.swigCPtr, this);
    }

    public BoolVector getWas_payload_frame_merged() {
        long ShotLogData_was_payload_frame_merged_get = GcamModuleJNI.ShotLogData_was_payload_frame_merged_get(this.swigCPtr, this);
        return ShotLogData_was_payload_frame_merged_get != 0 ? new BoolVector(ShotLogData_was_payload_frame_merged_get, false) : null;
    }

    public float getWeighted_fraction_of_pixels_from_long_exposure() {
        return GcamModuleJNI.ShotLogData_weighted_fraction_of_pixels_from_long_exposure_get(this.swigCPtr, this);
    }

    public boolean getZsl() {
        return GcamModuleJNI.ShotLogData_zsl_get(this.swigCPtr, this);
    }

    public void setAborted(boolean z) {
        GcamModuleJNI.ShotLogData_aborted_set(this.swigCPtr, this, z);
    }

    public void setActual_range_compression(float f) {
        GcamModuleJNI.ShotLogData_actual_range_compression_set(this.swigCPtr, this, f);
    }

    public void setAe_confidence_long_exposure(float f) {
        GcamModuleJNI.ShotLogData_ae_confidence_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setAe_confidence_short_exposure(float f) {
        GcamModuleJNI.ShotLogData_ae_confidence_short_exposure_set(this.swigCPtr, this, f);
    }

    public void setAe_confidence_single_exposure(float f) {
        GcamModuleJNI.ShotLogData_ae_confidence_single_exposure_set(this.swigCPtr, this, f);
    }

    public void setBase_frame_index(int i) {
        GcamModuleJNI.ShotLogData_base_frame_index_set(this.swigCPtr, this, i);
    }

    public void setCapture_time(float f) {
        GcamModuleJNI.ShotLogData_capture_time_set(this.swigCPtr, this, f);
    }

    public void setCpu_usage_factor(float f) {
        GcamModuleJNI.ShotLogData_cpu_usage_factor_set(this.swigCPtr, this, f);
    }

    public void setExecuted_finish_on(int i) {
        GcamModuleJNI.ShotLogData_executed_finish_on_set(this.swigCPtr, this, i);
    }

    public void setFinal_image_callback_time(float f) {
        GcamModuleJNI.ShotLogData_final_image_callback_time_set(this.swigCPtr, this, f);
    }

    public void setFinal_payload_frame_sharpness(FloatVector floatVector) {
        GcamModuleJNI.ShotLogData_final_payload_frame_sharpness_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setFinish_process_time(float f) {
        GcamModuleJNI.ShotLogData_finish_process_time_set(this.swigCPtr, this, f);
    }

    public void setIdeal_range_compression(float f) {
        GcamModuleJNI.ShotLogData_ideal_range_compression_set(this.swigCPtr, this, f);
    }

    public void setJpeg_callback_time(float f) {
        GcamModuleJNI.ShotLogData_jpeg_callback_time_set(this.swigCPtr, this, f);
    }

    public void setJpeg_encode_time(float f) {
        GcamModuleJNI.ShotLogData_jpeg_encode_time_set(this.swigCPtr, this, f);
    }

    public void setLog_scene_brightness(float f) {
        GcamModuleJNI.ShotLogData_log_scene_brightness_set(this.swigCPtr, this, f);
    }

    public void setLong_exp_adjustment_factor(float f) {
        GcamModuleJNI.ShotLogData_long_exp_adjustment_factor_set(this.swigCPtr, this, f);
    }

    public void setMerge_process_time(float f) {
        GcamModuleJNI.ShotLogData_merge_process_time_set(this.swigCPtr, this, f);
    }

    public void setMerged_frame_count(int i) {
        GcamModuleJNI.ShotLogData_merged_frame_count_set(this.swigCPtr, this, i);
    }

    public void setMerged_raw_callback_time(float f) {
        GcamModuleJNI.ShotLogData_merged_raw_callback_time_set(this.swigCPtr, this, f);
    }

    public void setMetering_frame_count(int i) {
        GcamModuleJNI.ShotLogData_metering_frame_count_set(this.swigCPtr, this, i);
    }

    public void setOriginal_payload_frame_count(int i) {
        GcamModuleJNI.ShotLogData_original_payload_frame_count_set(this.swigCPtr, this, i);
    }

    public void setOriginal_payload_frame_sharpness(FloatVector floatVector) {
        GcamModuleJNI.ShotLogData_original_payload_frame_sharpness_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setPostview_callback_time(float f) {
        GcamModuleJNI.ShotLogData_postview_callback_time_set(this.swigCPtr, this, f);
    }

    public void setPure_fraction_of_pixels_from_long_exposure(float f) {
        GcamModuleJNI.ShotLogData_pure_fraction_of_pixels_from_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setShort_exp_adjustment_factor(float f) {
        GcamModuleJNI.ShotLogData_short_exp_adjustment_factor_set(this.swigCPtr, this, f);
    }

    public void setTime_to_postview(float f) {
        GcamModuleJNI.ShotLogData_time_to_postview_set(this.swigCPtr, this, f);
    }

    public void setTime_to_shot(float f) {
        GcamModuleJNI.ShotLogData_time_to_shot_set(this.swigCPtr, this, f);
    }

    public void setWas_payload_frame_merged(BoolVector boolVector) {
        GcamModuleJNI.ShotLogData_was_payload_frame_merged_set(this.swigCPtr, this, BoolVector.getCPtr(boolVector), boolVector);
    }

    public void setWeighted_fraction_of_pixels_from_long_exposure(float f) {
        GcamModuleJNI.ShotLogData_weighted_fraction_of_pixels_from_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setZsl(boolean z) {
        GcamModuleJNI.ShotLogData_zsl_set(this.swigCPtr, this, z);
    }
}
