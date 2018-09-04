package com.google.googlex.gcam;

/* compiled from: PG */
public class ExifMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ExifMetadata() {
        this(GcamModuleJNI.new_ExifMetadata__SWIG_0(), true);
    }

    protected ExifMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ExifMetadata(ExifMetadata exifMetadata) {
        this(GcamModuleJNI.new_ExifMetadata__SWIG_1(getCPtr(exifMetadata), exifMetadata), true);
    }

    public double ApertureValue() {
        return GcamModuleJNI.ExifMetadata_ApertureValue(this.swigCPtr, this);
    }

    public double BrightnessValue() {
        return GcamModuleJNI.ExifMetadata_BrightnessValue(this.swigCPtr, this);
    }

    public int Flash() {
        return GcamModuleJNI.ExifMetadata_Flash(this.swigCPtr, this);
    }

    public int Iso() {
        return GcamModuleJNI.ExifMetadata_Iso(this.swigCPtr, this);
    }

    public void NoiseModelRgb(DngNoiseModel dngNoiseModel) {
        GcamModuleJNI.ExifMetadata_NoiseModelRgb(this.swigCPtr, this, DngNoiseModel.getCPtr(dngNoiseModel), dngNoiseModel);
    }

    public int Orientation() {
        return GcamModuleJNI.ExifMetadata_Orientation(this.swigCPtr, this);
    }

    public double SensitivityValue() {
        return GcamModuleJNI.ExifMetadata_SensitivityValue(this.swigCPtr, this);
    }

    public void SetFlash(int i) {
        GcamModuleJNI.ExifMetadata_SetFlash(this.swigCPtr, this, i);
    }

    public void SetIso(int i) {
        GcamModuleJNI.ExifMetadata_SetIso(this.swigCPtr, this, i);
    }

    public void SetNoiseModelRgb(DngNoiseModel[] dngNoiseModelArr) {
        GcamModuleJNI.ExifMetadata_SetNoiseModelRgb(this.swigCPtr, this, DngNoiseModel.cArrayUnwrap(dngNoiseModelArr));
    }

    public void SetOrientation(int i) {
        GcamModuleJNI.ExifMetadata_SetOrientation(this.swigCPtr, this, i);
    }

    public void SetTimestampCurrent() {
        GcamModuleJNI.ExifMetadata_SetTimestampCurrent(this.swigCPtr, this);
    }

    public double ShutterSpeedValue() {
        return GcamModuleJNI.ExifMetadata_ShutterSpeedValue(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ExifMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ExifMetadata exifMetadata) {
        return exifMetadata != null ? exifMetadata.swigCPtr : 0;
    }

    public ClientExifMetadata getClient_exif() {
        long ExifMetadata_client_exif_get = GcamModuleJNI.ExifMetadata_client_exif_get(this.swigCPtr, this);
        return ExifMetadata_client_exif_get != 0 ? new ClientExifMetadata(ExifMetadata_client_exif_get, false) : null;
    }

    public PixelRect getDng_crop() {
        long ExifMetadata_dng_crop_get = GcamModuleJNI.ExifMetadata_dng_crop_get(this.swigCPtr, this);
        return ExifMetadata_dng_crop_get != 0 ? new PixelRect(ExifMetadata_dng_crop_get, false) : null;
    }

    public float getExposure_compensation() {
        return GcamModuleJNI.ExifMetadata_exposure_compensation_get(this.swigCPtr, this);
    }

    public NormalizedRect getFinal_crop() {
        long ExifMetadata_final_crop_get = GcamModuleJNI.ExifMetadata_final_crop_get(this.swigCPtr, this);
        return ExifMetadata_final_crop_get != 0 ? new NormalizedRect(ExifMetadata_final_crop_get, false) : null;
    }

    public int getFlash_mode() {
        return GcamModuleJNI.ExifMetadata_flash_mode_get(this.swigCPtr, this);
    }

    public FrameMetadata getFrame_metadata() {
        long ExifMetadata_frame_metadata_get = GcamModuleJNI.ExifMetadata_frame_metadata_get(this.swigCPtr, this);
        return ExifMetadata_frame_metadata_get != 0 ? new FrameMetadata(ExifMetadata_frame_metadata_get, false) : null;
    }

    public SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t getGain_map_rggb() {
        long ExifMetadata_gain_map_rggb_get = GcamModuleJNI.ExifMetadata_gain_map_rggb_get(this.swigCPtr, this);
        return ExifMetadata_gain_map_rggb_get != 0 ? new SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t(ExifMetadata_gain_map_rggb_get, false) : null;
    }

    public int getIcc_profile() {
        return GcamModuleJNI.ExifMetadata_icc_profile_get(this.swigCPtr, this);
    }

    public int getImage_rotation() {
        return GcamModuleJNI.ExifMetadata_image_rotation_get(this.swigCPtr, this);
    }

    public String getMakernote() {
        return GcamModuleJNI.ExifMetadata_makernote_get(this.swigCPtr, this);
    }

    public float getRange_compression() {
        return GcamModuleJNI.ExifMetadata_range_compression_get(this.swigCPtr, this);
    }

    public String getSoftware_suffix() {
        return GcamModuleJNI.ExifMetadata_software_suffix_get(this.swigCPtr, this);
    }

    public StaticMetadata getStatic_metadata() {
        long ExifMetadata_static_metadata_get = GcamModuleJNI.ExifMetadata_static_metadata_get(this.swigCPtr, this);
        return ExifMetadata_static_metadata_get != 0 ? new StaticMetadata(ExifMetadata_static_metadata_get, false) : null;
    }

    public long getTimestamp_unix_us() {
        return GcamModuleJNI.ExifMetadata_timestamp_unix_us_get(this.swigCPtr, this);
    }

    public int getWb_mode() {
        return GcamModuleJNI.ExifMetadata_wb_mode_get(this.swigCPtr, this);
    }

    public String getXmp_metadata_extended() {
        return GcamModuleJNI.ExifMetadata_xmp_metadata_extended_get(this.swigCPtr, this);
    }

    public String getXmp_metadata_main() {
        return GcamModuleJNI.ExifMetadata_xmp_metadata_main_get(this.swigCPtr, this);
    }

    public void setClient_exif(ClientExifMetadata clientExifMetadata) {
        GcamModuleJNI.ExifMetadata_client_exif_set(this.swigCPtr, this, ClientExifMetadata.getCPtr(clientExifMetadata), clientExifMetadata);
    }

    public void setDng_crop(PixelRect pixelRect) {
        GcamModuleJNI.ExifMetadata_dng_crop_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public void setExposure_compensation(float f) {
        GcamModuleJNI.ExifMetadata_exposure_compensation_set(this.swigCPtr, this, f);
    }

    public void setFinal_crop(NormalizedRect normalizedRect) {
        GcamModuleJNI.ExifMetadata_final_crop_set(this.swigCPtr, this, NormalizedRect.getCPtr(normalizedRect), normalizedRect);
    }

    public void setFlash_mode(int i) {
        GcamModuleJNI.ExifMetadata_flash_mode_set(this.swigCPtr, this, i);
    }

    public void setFrame_metadata(FrameMetadata frameMetadata) {
        GcamModuleJNI.ExifMetadata_frame_metadata_set(this.swigCPtr, this, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public void setGain_map_rggb(SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t sWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t) {
        GcamModuleJNI.ExifMetadata_gain_map_rggb_set(this.swigCPtr, this, SWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t.getCPtr(sWIGTYPE_p_gcam__TImageT_float_gcam__kPixelContiguous_t));
    }

    public void setIcc_profile(int i) {
        GcamModuleJNI.ExifMetadata_icc_profile_set(this.swigCPtr, this, i);
    }

    public void setImage_rotation(int i) {
        GcamModuleJNI.ExifMetadata_image_rotation_set(this.swigCPtr, this, i);
    }

    public void setMakernote(String str) {
        GcamModuleJNI.ExifMetadata_makernote_set(this.swigCPtr, this, str);
    }

    public void setRange_compression(float f) {
        GcamModuleJNI.ExifMetadata_range_compression_set(this.swigCPtr, this, f);
    }

    public void setSoftware_suffix(String str) {
        GcamModuleJNI.ExifMetadata_software_suffix_set(this.swigCPtr, this, str);
    }

    public void setStatic_metadata(StaticMetadata staticMetadata) {
        GcamModuleJNI.ExifMetadata_static_metadata_set(this.swigCPtr, this, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public void setTimestamp_unix_us(long j) {
        GcamModuleJNI.ExifMetadata_timestamp_unix_us_set(this.swigCPtr, this, j);
    }

    public void setWb_mode(int i) {
        GcamModuleJNI.ExifMetadata_wb_mode_set(this.swigCPtr, this, i);
    }

    public void setXmp_metadata_extended(String str) {
        GcamModuleJNI.ExifMetadata_xmp_metadata_extended_set(this.swigCPtr, this, str);
    }

    public void setXmp_metadata_main(String str) {
        GcamModuleJNI.ExifMetadata_xmp_metadata_main_set(this.swigCPtr, this, str);
    }
}
