package com.google.googlex.gcam;

/* compiled from: PG */
public class FrameMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FrameMetadata() {
        this(GcamModuleJNI.new_FrameMetadata(), true);
    }

    protected FrameMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public float AppliedOverallGain() {
        return GcamModuleJNI.FrameMetadata_AppliedOverallGain(this.swigCPtr, this);
    }

    public boolean Check(String str, int i, boolean z, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver) {
        return GcamModuleJNI.FrameMetadata_Check(this.swigCPtr, this, str, i, z, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver));
    }

    public void Clear() {
        GcamModuleJNI.FrameMetadata_Clear(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, int i) {
        return GcamModuleJNI.FrameMetadata_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), i);
    }

    public float DesiredOverallGain() {
        return GcamModuleJNI.FrameMetadata_DesiredOverallGain(this.swigCPtr, this);
    }

    public boolean Equals(FrameMetadata frameMetadata) {
        return GcamModuleJNI.FrameMetadata_Equals(this.swigCPtr, this, getCPtr(frameMetadata), frameMetadata);
    }

    public float GetCurrentTet() {
        return GcamModuleJNI.FrameMetadata_GetCurrentTet(this.swigCPtr, this);
    }

    public float GetFinalDesiredTet() {
        return GcamModuleJNI.FrameMetadata_GetFinalDesiredTet(this.swigCPtr, this);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.FrameMetadata_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string, int i) {
        GcamModuleJNI.FrameMetadata_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FrameMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getActual_analog_gain() {
        return GcamModuleJNI.FrameMetadata_actual_analog_gain_get(this.swigCPtr, this);
    }

    public float getActual_exposure_time_ms() {
        return GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_get(this.swigCPtr, this);
    }

    public AeMetadata getAe() {
        long FrameMetadata_ae_get = GcamModuleJNI.FrameMetadata_ae_get(this.swigCPtr, this);
        return FrameMetadata_ae_get != 0 ? new AeMetadata(FrameMetadata_ae_get, false) : null;
    }

    public AfMetadata getAf() {
        long FrameMetadata_af_get = GcamModuleJNI.FrameMetadata_af_get(this.swigCPtr, this);
        return FrameMetadata_af_get != 0 ? new AfMetadata(FrameMetadata_af_get, false) : null;
    }

    public float getApplied_digital_gain() {
        return GcamModuleJNI.FrameMetadata_applied_digital_gain_get(this.swigCPtr, this);
    }

    public AwbMetadata getAwb() {
        long FrameMetadata_awb_get = GcamModuleJNI.FrameMetadata_awb_get(this.swigCPtr, this);
        return FrameMetadata_awb_get != 0 ? new AwbMetadata(FrameMetadata_awb_get, false) : null;
    }

    public float[] getBlack_levels_bayer() {
        return GcamModuleJNI.FrameMetadata_black_levels_bayer_get(this.swigCPtr, this);
    }

    protected static long getCPtr(FrameMetadata frameMetadata) {
        return frameMetadata != null ? frameMetadata.swigCPtr : 0;
    }

    public StringVector getCapture_errors() {
        long FrameMetadata_capture_errors_get = GcamModuleJNI.FrameMetadata_capture_errors_get(this.swigCPtr, this);
        return FrameMetadata_capture_errors_get != 0 ? new StringVector(FrameMetadata_capture_errors_get, false) : null;
    }

    public StringVector getCapture_warnings() {
        long FrameMetadata_capture_warnings_get = GcamModuleJNI.FrameMetadata_capture_warnings_get(this.swigCPtr, this);
        return FrameMetadata_capture_warnings_get != 0 ? new StringVector(FrameMetadata_capture_warnings_get, false) : null;
    }

    public int getControl_mode() {
        return GcamModuleJNI.FrameMetadata_control_mode_get(this.swigCPtr, this);
    }

    public float getDesired_overall_digital_gain() {
        return GcamModuleJNI.FrameMetadata_desired_overall_digital_gain_get(this.swigCPtr, this);
    }

    public DngNoiseModel[] getDng_noise_model_bayer() {
        return DngNoiseModel.cArrayWrap(GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_get(this.swigCPtr, this), false);
    }

    public float getExposure_time_boost() {
        return GcamModuleJNI.FrameMetadata_exposure_time_boost_get(this.swigCPtr, this);
    }

    public FaceInfoVector getFaces() {
        long FrameMetadata_faces_get = GcamModuleJNI.FrameMetadata_faces_get(this.swigCPtr, this);
        return FrameMetadata_faces_get != 0 ? new FaceInfoVector(FrameMetadata_faces_get, false) : null;
    }

    public int getFlash() {
        return GcamModuleJNI.FrameMetadata_flash_get(this.swigCPtr, this);
    }

    public float getFocal_length_mm() {
        return GcamModuleJNI.FrameMetadata_focal_length_mm_get(this.swigCPtr, this);
    }

    public float getFocus_distance_diopters() {
        return GcamModuleJNI.FrameMetadata_focus_distance_diopters_get(this.swigCPtr, this);
    }

    public GyroSampleVector getGyro_samples() {
        long FrameMetadata_gyro_samples_get = GcamModuleJNI.FrameMetadata_gyro_samples_get(this.swigCPtr, this);
        return FrameMetadata_gyro_samples_get != 0 ? new GyroSampleVector(FrameMetadata_gyro_samples_get, false) : null;
    }

    public int getLens_state() {
        return GcamModuleJNI.FrameMetadata_lens_state_get(this.swigCPtr, this);
    }

    public float getMean_signal_level() {
        return GcamModuleJNI.FrameMetadata_mean_signal_level_get(this.swigCPtr, this);
    }

    public float[] getNeutral_point() {
        return GcamModuleJNI.FrameMetadata_neutral_point_get(this.swigCPtr, this);
    }

    public OisMetadata getOis_metadata() {
        long FrameMetadata_ois_metadata_get = GcamModuleJNI.FrameMetadata_ois_metadata_get(this.swigCPtr, this);
        return FrameMetadata_ois_metadata_get != 0 ? new OisMetadata(FrameMetadata_ois_metadata_get, false) : null;
    }

    public float getPost_raw_digital_gain() {
        return GcamModuleJNI.FrameMetadata_post_raw_digital_gain_get(this.swigCPtr, this);
    }

    public int getScene_flicker() {
        return GcamModuleJNI.FrameMetadata_scene_flicker_get(this.swigCPtr, this);
    }

    public int getSensor_id() {
        return GcamModuleJNI.FrameMetadata_sensor_id_get(this.swigCPtr, this);
    }

    public int getSensor_temp() {
        return GcamModuleJNI.FrameMetadata_sensor_temp_get(this.swigCPtr, this);
    }

    public float getSharpness() {
        return GcamModuleJNI.FrameMetadata_sharpness_get(this.swigCPtr, this);
    }

    public int getTemporal_binning_factor() {
        return GcamModuleJNI.FrameMetadata_temporal_binning_factor_get(this.swigCPtr, this);
    }

    public long getTimestamp_ns() {
        return GcamModuleJNI.FrameMetadata_timestamp_ns_get(this.swigCPtr, this);
    }

    public boolean getWas_black_level_locked() {
        return GcamModuleJNI.FrameMetadata_was_black_level_locked_get(this.swigCPtr, this);
    }

    public AwbInfo getWb() {
        long FrameMetadata_wb_get = GcamModuleJNI.FrameMetadata_wb_get(this.swigCPtr, this);
        return FrameMetadata_wb_get != 0 ? new AwbInfo(FrameMetadata_wb_get, false) : null;
    }

    public void setActual_analog_gain(float f) {
        GcamModuleJNI.FrameMetadata_actual_analog_gain_set(this.swigCPtr, this, f);
    }

    public void setActual_exposure_time_ms(float f) {
        GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setAe(AeMetadata aeMetadata) {
        GcamModuleJNI.FrameMetadata_ae_set(this.swigCPtr, this, AeMetadata.getCPtr(aeMetadata), aeMetadata);
    }

    public void setAf(AfMetadata afMetadata) {
        GcamModuleJNI.FrameMetadata_af_set(this.swigCPtr, this, AfMetadata.getCPtr(afMetadata), afMetadata);
    }

    public void setApplied_digital_gain(float f) {
        GcamModuleJNI.FrameMetadata_applied_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setAwb(AwbMetadata awbMetadata) {
        GcamModuleJNI.FrameMetadata_awb_set(this.swigCPtr, this, AwbMetadata.getCPtr(awbMetadata), awbMetadata);
    }

    public void setBlack_levels_bayer(float[] fArr) {
        GcamModuleJNI.FrameMetadata_black_levels_bayer_set(this.swigCPtr, this, fArr);
    }

    public void setCapture_errors(StringVector stringVector) {
        GcamModuleJNI.FrameMetadata_capture_errors_set(this.swigCPtr, this, StringVector.getCPtr(stringVector), stringVector);
    }

    public void setCapture_warnings(StringVector stringVector) {
        GcamModuleJNI.FrameMetadata_capture_warnings_set(this.swigCPtr, this, StringVector.getCPtr(stringVector), stringVector);
    }

    public void setControl_mode(int i) {
        GcamModuleJNI.FrameMetadata_control_mode_set(this.swigCPtr, this, i);
    }

    public void setDesired_overall_digital_gain(float f) {
        GcamModuleJNI.FrameMetadata_desired_overall_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setDng_noise_model_bayer(DngNoiseModel[] dngNoiseModelArr) {
        GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(this.swigCPtr, this, DngNoiseModel.cArrayUnwrap(dngNoiseModelArr));
    }

    public void setExposure_time_boost(float f) {
        GcamModuleJNI.FrameMetadata_exposure_time_boost_set(this.swigCPtr, this, f);
    }

    public void setFaces(FaceInfoVector faceInfoVector) {
        GcamModuleJNI.FrameMetadata_faces_set(this.swigCPtr, this, FaceInfoVector.getCPtr(faceInfoVector), faceInfoVector);
    }

    public void setFlash(int i) {
        GcamModuleJNI.FrameMetadata_flash_set(this.swigCPtr, this, i);
    }

    public void setFocal_length_mm(float f) {
        GcamModuleJNI.FrameMetadata_focal_length_mm_set(this.swigCPtr, this, f);
    }

    public void setFocus_distance_diopters(float f) {
        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(this.swigCPtr, this, f);
    }

    public void setGyro_samples(GyroSampleVector gyroSampleVector) {
        GcamModuleJNI.FrameMetadata_gyro_samples_set(this.swigCPtr, this, GyroSampleVector.getCPtr(gyroSampleVector), gyroSampleVector);
    }

    public void setLens_state(int i) {
        GcamModuleJNI.FrameMetadata_lens_state_set(this.swigCPtr, this, i);
    }

    public void setMean_signal_level(float f) {
        GcamModuleJNI.FrameMetadata_mean_signal_level_set(this.swigCPtr, this, f);
    }

    public void setNeutral_point(float[] fArr) {
        GcamModuleJNI.FrameMetadata_neutral_point_set(this.swigCPtr, this, fArr);
    }

    public void setOis_metadata(OisMetadata oisMetadata) {
        GcamModuleJNI.FrameMetadata_ois_metadata_set(this.swigCPtr, this, OisMetadata.getCPtr(oisMetadata), oisMetadata);
    }

    public void setPost_raw_digital_gain(float f) {
        GcamModuleJNI.FrameMetadata_post_raw_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setScene_flicker(int i) {
        GcamModuleJNI.FrameMetadata_scene_flicker_set(this.swigCPtr, this, i);
    }

    public void setSensor_id(int i) {
        GcamModuleJNI.FrameMetadata_sensor_id_set(this.swigCPtr, this, i);
    }

    public void setSensor_temp(int i) {
        GcamModuleJNI.FrameMetadata_sensor_temp_set(this.swigCPtr, this, i);
    }

    public void setSharpness(float f) {
        GcamModuleJNI.FrameMetadata_sharpness_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_factor(int i) {
        GcamModuleJNI.FrameMetadata_temporal_binning_factor_set(this.swigCPtr, this, i);
    }

    public void setTimestamp_ns(long j) {
        GcamModuleJNI.FrameMetadata_timestamp_ns_set(this.swigCPtr, this, j);
    }

    public void setWas_black_level_locked(boolean z) {
        GcamModuleJNI.FrameMetadata_was_black_level_locked_set(this.swigCPtr, this, z);
    }

    public void setWb(AwbInfo awbInfo) {
        GcamModuleJNI.FrameMetadata_wb_set(this.swigCPtr, this, AwbInfo.getCPtr(awbInfo), awbInfo);
    }
}
