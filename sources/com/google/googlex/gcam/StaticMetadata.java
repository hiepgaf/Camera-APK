package com.google.googlex.gcam;

/* compiled from: PG */
public class StaticMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StaticMetadata() {
        this(GcamModuleJNI.new_StaticMetadata(), true);
    }

    protected StaticMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check(boolean z, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver) {
        return GcamModuleJNI.StaticMetadata_Check(this.swigCPtr, this, z, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver));
    }

    public void Clear() {
        GcamModuleJNI.StaticMetadata_Clear(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.StaticMetadata_DeserializeFromString__SWIG_0(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean DeserializeFromString(String str) {
        return GcamModuleJNI.StaticMetadata_DeserializeFromString__SWIG_1(this.swigCPtr, this, str);
    }

    public boolean Equals(StaticMetadata staticMetadata) {
        return GcamModuleJNI.StaticMetadata_Equals(this.swigCPtr, this, getCPtr(staticMetadata), staticMetadata);
    }

    public float GetMaxAnalogGain() {
        return GcamModuleJNI.StaticMetadata_GetMaxAnalogGain(this.swigCPtr, this);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.StaticMetadata_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string, int i) {
        GcamModuleJNI.StaticMetadata_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StaticMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public PixelRect getActive_area() {
        long StaticMetadata_active_area_get = GcamModuleJNI.StaticMetadata_active_area_get(this.swigCPtr, this);
        return StaticMetadata_active_area_get != 0 ? new PixelRect(StaticMetadata_active_area_get, false) : null;
    }

    public FloatVector getAvailable_f_numbers() {
        long StaticMetadata_available_f_numbers_get = GcamModuleJNI.StaticMetadata_available_f_numbers_get(this.swigCPtr, this);
        return StaticMetadata_available_f_numbers_get != 0 ? new FloatVector(StaticMetadata_available_f_numbers_get, false) : null;
    }

    public FloatVector getAvailable_focal_lengths_mm() {
        long StaticMetadata_available_focal_lengths_mm_get = GcamModuleJNI.StaticMetadata_available_focal_lengths_mm_get(this.swigCPtr, this);
        return StaticMetadata_available_focal_lengths_mm_get != 0 ? new FloatVector(StaticMetadata_available_focal_lengths_mm_get, false) : null;
    }

    public int getBayer_pattern() {
        return GcamModuleJNI.StaticMetadata_bayer_pattern_get(this.swigCPtr, this);
    }

    public float[] getBlack_levels_bayer() {
        return GcamModuleJNI.StaticMetadata_black_levels_bayer_get(this.swigCPtr, this);
    }

    protected static long getCPtr(StaticMetadata staticMetadata) {
        return staticMetadata != null ? staticMetadata.swigCPtr : 0;
    }

    public String getDevice() {
        return GcamModuleJNI.StaticMetadata_device_get(this.swigCPtr, this);
    }

    public String getDevice_os_version() {
        return GcamModuleJNI.StaticMetadata_device_os_version_get(this.swigCPtr, this);
    }

    public DngColorCalibrationVector getDng_color_calibration() {
        long StaticMetadata_dng_color_calibration_get = GcamModuleJNI.StaticMetadata_dng_color_calibration_get(this.swigCPtr, this);
        return StaticMetadata_dng_color_calibration_get != 0 ? new DngColorCalibrationVector(StaticMetadata_dng_color_calibration_get, false) : null;
    }

    public int getFrame_raw_max_height() {
        return GcamModuleJNI.StaticMetadata_frame_raw_max_height_get(this.swigCPtr, this);
    }

    public int getFrame_raw_max_width() {
        return GcamModuleJNI.StaticMetadata_frame_raw_max_width_get(this.swigCPtr, this);
    }

    public float getFrame_readout_time_ms() {
        return GcamModuleJNI.StaticMetadata_frame_readout_time_ms_get(this.swigCPtr, this);
    }

    public boolean getHas_flash() {
        return GcamModuleJNI.StaticMetadata_has_flash_get(this.swigCPtr, this);
    }

    public int[] getIso_range() {
        return GcamModuleJNI.StaticMetadata_iso_range_get(this.swigCPtr, this);
    }

    public String getMake() {
        return GcamModuleJNI.StaticMetadata_make_get(this.swigCPtr, this);
    }

    public int getMax_analog_iso() {
        return GcamModuleJNI.StaticMetadata_max_analog_iso_get(this.swigCPtr, this);
    }

    public String getModel() {
        return GcamModuleJNI.StaticMetadata_model_get(this.swigCPtr, this);
    }

    public PixelRectVector getOptically_black_regions() {
        long StaticMetadata_optically_black_regions_get = GcamModuleJNI.StaticMetadata_optically_black_regions_get(this.swigCPtr, this);
        return StaticMetadata_optically_black_regions_get != 0 ? new PixelRectVector(StaticMetadata_optically_black_regions_get, false) : null;
    }

    public int getPixel_array_height() {
        return GcamModuleJNI.StaticMetadata_pixel_array_height_get(this.swigCPtr, this);
    }

    public int getPixel_array_width() {
        return GcamModuleJNI.StaticMetadata_pixel_array_width_get(this.swigCPtr, this);
    }

    public QcColorCalibration getQc_color_calibration() {
        long StaticMetadata_qc_color_calibration_get = GcamModuleJNI.StaticMetadata_qc_color_calibration_get(this.swigCPtr, this);
        return StaticMetadata_qc_color_calibration_get != 0 ? new QcColorCalibration(StaticMetadata_qc_color_calibration_get, false) : null;
    }

    public int getRaw_bits_per_pixel() {
        return GcamModuleJNI.StaticMetadata_raw_bits_per_pixel_get(this.swigCPtr, this);
    }

    public int getSensor_id() {
        return GcamModuleJNI.StaticMetadata_sensor_id_get(this.swigCPtr, this);
    }

    public float getSensor_physical_height_mm() {
        return GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_get(this.swigCPtr, this);
    }

    public float getSensor_physical_width_mm() {
        return GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_get(this.swigCPtr, this);
    }

    public String getSoftware() {
        return GcamModuleJNI.StaticMetadata_software_get(this.swigCPtr, this);
    }

    public int getWhite_level() {
        return GcamModuleJNI.StaticMetadata_white_level_get(this.swigCPtr, this);
    }

    public void setActive_area(PixelRect pixelRect) {
        GcamModuleJNI.StaticMetadata_active_area_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public void setAvailable_f_numbers(FloatVector floatVector) {
        GcamModuleJNI.StaticMetadata_available_f_numbers_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setAvailable_focal_lengths_mm(FloatVector floatVector) {
        GcamModuleJNI.StaticMetadata_available_focal_lengths_mm_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setBayer_pattern(int i) {
        GcamModuleJNI.StaticMetadata_bayer_pattern_set(this.swigCPtr, this, i);
    }

    public void setBlack_levels_bayer(float[] fArr) {
        GcamModuleJNI.StaticMetadata_black_levels_bayer_set(this.swigCPtr, this, fArr);
    }

    public void setDevice(String str) {
        GcamModuleJNI.StaticMetadata_device_set(this.swigCPtr, this, str);
    }

    public void setDevice_os_version(String str) {
        GcamModuleJNI.StaticMetadata_device_os_version_set(this.swigCPtr, this, str);
    }

    public void setDng_color_calibration(DngColorCalibrationVector dngColorCalibrationVector) {
        GcamModuleJNI.StaticMetadata_dng_color_calibration_set(this.swigCPtr, this, DngColorCalibrationVector.getCPtr(dngColorCalibrationVector), dngColorCalibrationVector);
    }

    public void setFrame_raw_max_height(int i) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_height_set(this.swigCPtr, this, i);
    }

    public void setFrame_raw_max_width(int i) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_width_set(this.swigCPtr, this, i);
    }

    public void setFrame_readout_time_ms(float f) {
        GcamModuleJNI.StaticMetadata_frame_readout_time_ms_set(this.swigCPtr, this, f);
    }

    public void setHas_flash(boolean z) {
        GcamModuleJNI.StaticMetadata_has_flash_set(this.swigCPtr, this, z);
    }

    public void setIso_range(int[] iArr) {
        GcamModuleJNI.StaticMetadata_iso_range_set(this.swigCPtr, this, iArr);
    }

    public void setMake(String str) {
        GcamModuleJNI.StaticMetadata_make_set(this.swigCPtr, this, str);
    }

    public void setMax_analog_iso(int i) {
        GcamModuleJNI.StaticMetadata_max_analog_iso_set(this.swigCPtr, this, i);
    }

    public void setModel(String str) {
        GcamModuleJNI.StaticMetadata_model_set(this.swigCPtr, this, str);
    }

    public void setOptically_black_regions(PixelRectVector pixelRectVector) {
        GcamModuleJNI.StaticMetadata_optically_black_regions_set(this.swigCPtr, this, PixelRectVector.getCPtr(pixelRectVector), pixelRectVector);
    }

    public void setPixel_array_height(int i) {
        GcamModuleJNI.StaticMetadata_pixel_array_height_set(this.swigCPtr, this, i);
    }

    public void setPixel_array_width(int i) {
        GcamModuleJNI.StaticMetadata_pixel_array_width_set(this.swigCPtr, this, i);
    }

    public void setQc_color_calibration(QcColorCalibration qcColorCalibration) {
        GcamModuleJNI.StaticMetadata_qc_color_calibration_set(this.swigCPtr, this, QcColorCalibration.getCPtr(qcColorCalibration), qcColorCalibration);
    }

    public void setRaw_bits_per_pixel(int i) {
        GcamModuleJNI.StaticMetadata_raw_bits_per_pixel_set(this.swigCPtr, this, i);
    }

    public void setSensor_id(int i) {
        GcamModuleJNI.StaticMetadata_sensor_id_set(this.swigCPtr, this, i);
    }

    public void setSensor_physical_height_mm(float f) {
        GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_set(this.swigCPtr, this, f);
    }

    public void setSensor_physical_width_mm(float f) {
        GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_set(this.swigCPtr, this, f);
    }

    public void setSoftware(String str) {
        GcamModuleJNI.StaticMetadata_software_set(this.swigCPtr, this, str);
    }

    public void setWhite_level(int i) {
        GcamModuleJNI.StaticMetadata_white_level_set(this.swigCPtr, this, i);
    }
}
