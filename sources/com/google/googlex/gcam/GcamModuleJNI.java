package com.google.googlex.gcam;

import com.google.android.apps.common.proguard.UsedFromDirector;
import com.google.googlex.gcam.QcColorCalibration.IlluminantData;
import com.google.googlex.gcam.RawSharpenParams.Point;

@UsedFromDirector
/* compiled from: PG */
public class GcamModuleJNI {
    static {
        swig_module_init();
    }

    public static final native long AdjustRawBufferMins(int i, long j, int i2, int i3);

    public static final native void AdjustRawVignetting(long j, RawVignetteParams rawVignetteParams, long j2, SpatialGainMap spatialGainMap);

    public static final native float AeDebugInfo_exec_time_dual_ae_sec_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_exec_time_dual_ae_sec_set(long j, AeDebugInfo aeDebugInfo, float f);

    public static final native long AeDebugInfo_metering_frame_capture_gains_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_metering_frame_capture_gains_set(long j, AeDebugInfo aeDebugInfo, long j2, FloatVector floatVector);

    public static final native long AeDebugInfo_metering_frame_noise_models_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_metering_frame_noise_models_set(long j, AeDebugInfo aeDebugInfo, long j2);

    public static final native long AeDebugInfo_original_result_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_original_result_set(long j, AeDebugInfo aeDebugInfo, long j2, AeModeResult aeModeResult);

    public static final native float AeMetadata_exposure_compensation_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_exposure_compensation_set(long j, AeMetadata aeMetadata, float f);

    public static final native boolean AeMetadata_lock_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_lock_set(long j, AeMetadata aeMetadata, boolean z);

    public static final native long AeMetadata_metering_rectangles_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_metering_rectangles_set(long j, AeMetadata aeMetadata, long j2, WeightedPixelRectVector weightedPixelRectVector);

    public static final native int AeMetadata_mode_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_mode_set(long j, AeMetadata aeMetadata, int i);

    public static final native int AeMetadata_precapture_trigger_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_precapture_trigger_set(long j, AeMetadata aeMetadata, int i);

    public static final native int AeMetadata_state_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_state_set(long j, AeMetadata aeMetadata, int i);

    public static final native float AeModeResult_confidence_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_confidence_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_log_scene_brightness_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_log_scene_brightness_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_target_avg_ldr_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_target_avg_ldr_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_tet_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_tet_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeResults_FinalHdrRatio(long j, AeResults aeResults);

    public static final native float AeResults_GetDesiredFinalTet(long j, AeResults aeResults);

    public static final native float AeResults_IdealHdrRatio(long j, AeResults aeResults);

    public static final native float AeResults_LogSceneBrightness(long j, AeResults aeResults);

    public static final native int AeResults_MeteringFrameCount(long j, AeResults aeResults);

    public static final native boolean AeResults_MotionValid(long j, AeResults aeResults);

    public static final native long AeResults_debug_get(long j, AeResults aeResults);

    public static final native void AeResults_debug_set(long j, AeResults aeResults, long j2, AeDebugInfo aeDebugInfo);

    public static final native float[] AeResults_final_tet_get(long j, AeResults aeResults);

    public static final native void AeResults_final_tet_set(long j, AeResults aeResults, float[] fArr);

    public static final native int AeResults_flash_get(long j, AeResults aeResults);

    public static final native void AeResults_flash_set(long j, AeResults aeResults, int i);

    public static final native long AeResults_metering_frame_timestamps_ns_get(long j, AeResults aeResults);

    public static final native void AeResults_metering_frame_timestamps_ns_set(long j, AeResults aeResults, long j2, Int64Vector int64Vector);

    public static final native float AeResults_motion_score_get(long j, AeResults aeResults);

    public static final native void AeResults_motion_score_set(long j, AeResults aeResults, float f);

    public static final native float AeResults_predicted_image_brightness_get(long j, AeResults aeResults);

    public static final native void AeResults_predicted_image_brightness_set(long j, AeResults aeResults, float f);

    public static final native float AeResults_pure_fraction_of_pixels_from_long_exposure_get(long j, AeResults aeResults);

    public static final native void AeResults_pure_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native int AeResults_scene_flicker_get(long j, AeResults aeResults);

    public static final native void AeResults_scene_flicker_set(long j, AeResults aeResults, int i);

    public static final native long AeResults_tet_to_awb_get(long j, AeResults aeResults);

    public static final native void AeResults_tet_to_awb_set(long j, AeResults aeResults, long j2, TetToAwb tetToAwb);

    public static final native boolean AeResults_valid_get(long j, AeResults aeResults);

    public static final native void AeResults_valid_set(long j, AeResults aeResults, boolean z);

    public static final native float AeResults_weighted_fraction_of_pixels_from_long_exposure_get(long j, AeResults aeResults);

    public static final native void AeResults_weighted_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native boolean AeShotParams_Equals(long j, AeShotParams aeShotParams, long j2, AeShotParams aeShotParams2);

    public static final native long AeShotParams_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native float AeShotParams_exposure_compensation_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_exposure_compensation_set(long j, AeShotParams aeShotParams, float f);

    public static final native int AeShotParams_hdr_mode_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_hdr_mode_set(long j, AeShotParams aeShotParams, int i);

    public static final native int AeShotParams_target_height_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_target_height_set(long j, AeShotParams aeShotParams, int i);

    public static final native int AeShotParams_target_width_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_target_width_set(long j, AeShotParams aeShotParams, int i);

    public static final native long AeShotParams_weighted_metering_areas_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_weighted_metering_areas_set(long j, AeShotParams aeShotParams, long j2, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native long AfMetadata_metering_rectangles_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_metering_rectangles_set(long j, AfMetadata afMetadata, long j2, WeightedPixelRectVector weightedPixelRectVector);

    public static final native int AfMetadata_mode_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_mode_set(long j, AfMetadata afMetadata, int i);

    public static final native int AfMetadata_state_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_state_set(long j, AfMetadata afMetadata, int i);

    public static final native int AfMetadata_trigger_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_trigger_set(long j, AfMetadata afMetadata, int i);

    public static final native void ApplyAntibanding(int i, boolean z, float f, long j, long j2);

    public static final native void ApplyBlsAndSgm(long j, SpatialGainMap spatialGainMap, float[] fArr, int i, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native boolean ApplyColorSaturation(long j, InterleavedWriteViewU8 interleavedWriteViewU8, long j2, ColorSatParams colorSatParams, long j3);

    public static final native float ArcFlareParam_GetMeanRadius(long j, ArcFlareParam arcFlareParam, float f);

    public static final native boolean ArcFlareParam_can_exist_get(long j, ArcFlareParam arcFlareParam);

    public static final native void ArcFlareParam_can_exist_set(long j, ArcFlareParam arcFlareParam, boolean z);

    public static final native double[] ArcFlareParam_radius_param_get(long j, ArcFlareParam arcFlareParam);

    public static final native void ArcFlareParam_radius_param_set(long j, ArcFlareParam arcFlareParam, double[] dArr);

    public static final native boolean AwbInfo_Check(long j, AwbInfo awbInfo);

    public static final native boolean AwbInfo_DeserializeFromString(long j, AwbInfo awbInfo, long j2);

    public static final native boolean AwbInfo_Equals(long j, AwbInfo awbInfo, long j2, AwbInfo awbInfo2);

    public static final native void AwbInfo_GetWbGainsRGB(long j, AwbInfo awbInfo, long j2, long j3, long j4);

    public static final native void AwbInfo_Print(long j, AwbInfo awbInfo, int i, int i2);

    public static final native void AwbInfo_SerializeToString(long j, AwbInfo awbInfo, long j2, int i);

    public static final native void AwbInfo_SetIdentityRgbToRgb(long j, AwbInfo awbInfo);

    public static final native int AwbInfo_color_temp_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_color_temp_set(long j, AwbInfo awbInfo, int i);

    public static final native float[] AwbInfo_gains_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_gains_set(long j, AwbInfo awbInfo, float[] fArr);

    public static final native float[] AwbInfo_rgb2rgb_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_rgb2rgb_set(long j, AwbInfo awbInfo, float[] fArr);

    public static final native boolean AwbMetadata_lock_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_lock_set(long j, AwbMetadata awbMetadata, boolean z);

    public static final native long AwbMetadata_metering_rectangles_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_metering_rectangles_set(long j, AwbMetadata awbMetadata, long j2, WeightedPixelRectVector weightedPixelRectVector);

    public static final native int AwbMetadata_mode_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_mode_set(long j, AwbMetadata awbMetadata, int i);

    public static final native int AwbMetadata_state_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_state_set(long j, AwbMetadata awbMetadata, int i);

    public static final native void BackgroundAeResultsCallback_Run(long j, BackgroundAeResultsCallback backgroundAeResultsCallback, long j2, AeResults aeResults);

    public static final native void BackgroundAeResultsCallback_change_ownership(BackgroundAeResultsCallback backgroundAeResultsCallback, long j, boolean z);

    public static final native void BackgroundAeResultsCallback_director_connect(BackgroundAeResultsCallback backgroundAeResultsCallback, long j, boolean z, boolean z2);

    public static final native int BadPixelPattern_height_get(long j, BadPixelPattern badPixelPattern);

    public static final native void BadPixelPattern_height_set(long j, BadPixelPattern badPixelPattern, int i);

    public static final native long BadPixelPattern_offsets_get(long j, BadPixelPattern badPixelPattern);

    public static final native void BadPixelPattern_offsets_set(long j, BadPixelPattern badPixelPattern, long j2);

    public static final native int BadPixelPattern_width_get(long j, BadPixelPattern badPixelPattern);

    public static final native void BadPixelPattern_width_set(long j, BadPixelPattern badPixelPattern, int i);

    public static final native int BadPixel_c_get(long j, BadPixel badPixel);

    public static final native void BadPixel_c_set(long j, BadPixel badPixel, int i);

    public static final native int BadPixel_x_get(long j, BadPixel badPixel);

    public static final native void BadPixel_x_set(long j, BadPixel badPixel, int i);

    public static final native int BadPixel_y_get(long j, BadPixel badPixel);

    public static final native void BadPixel_y_set(long j, BadPixel badPixel, int i);

    public static final native void BaseFrameCallback_Run(long j, BaseFrameCallback baseFrameCallback, int i, int i2, long j2);

    public static final native void BaseFrameCallback_change_ownership(BaseFrameCallback baseFrameCallback, long j, boolean z);

    public static final native void BaseFrameCallback_director_connect(BaseFrameCallback baseFrameCallback, long j, boolean z, boolean z2);

    public static final native boolean BayerPatternColors(int i, short[] sArr);

    public static final native int BayerPatternFromColors(short[] sArr);

    public static final native void BoolVector_add(long j, BoolVector boolVector, boolean z);

    public static final native long BoolVector_capacity(long j, BoolVector boolVector);

    public static final native void BoolVector_clear(long j, BoolVector boolVector);

    public static final native boolean BoolVector_get(long j, BoolVector boolVector, int i);

    public static final native boolean BoolVector_isEmpty(long j, BoolVector boolVector);

    public static final native void BoolVector_reserve(long j, BoolVector boolVector, long j2);

    public static final native void BoolVector_set(long j, BoolVector boolVector, int i, boolean z);

    public static final native long BoolVector_size(long j, BoolVector boolVector);

    public static final native void BurstSpec_Clear(long j, BurstSpec burstSpec);

    public static final native boolean BurstSpec_DeserializeFromString(long j, BurstSpec burstSpec, long j2);

    public static final native void BurstSpec_Print(long j, BurstSpec burstSpec, int i);

    public static final native void BurstSpec_SerializeToString(long j, BurstSpec burstSpec, long j2);

    public static final native long BurstSpec_frame_requests_get(long j, BurstSpec burstSpec);

    public static final native void BurstSpec_frame_requests_set(long j, BurstSpec burstSpec, long j2, FrameRequestVector frameRequestVector);

    public static final native boolean CaptureParams_Check(long j, CaptureParams captureParams);

    public static final native void CaptureParams_SetDefaults(long j, CaptureParams captureParams);

    public static final native float CaptureParams_allow_digital_gain_at_sensor_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_allow_digital_gain_at_sensor_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_hdr_ratio_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_hdr_ratio_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_overall_gain_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_overall_gain_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_post_capture_gain_non_zsl_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_post_capture_gain_non_zsl_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_post_capture_gain_zsl_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_post_capture_gain_zsl_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_noise_variance_to_payload_frame_count_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_noise_variance_to_payload_frame_count_set(long j, CaptureParams captureParams, float f);

    public static final native boolean CheckBlackRegions(long j, PixelRectVector pixelRectVector, long j2, StaticMetadata staticMetadata);

    public static final native float ChromaticAberrationParams_chroma_threshold_get(long j, ChromaticAberrationParams chromaticAberrationParams);

    public static final native void ChromaticAberrationParams_chroma_threshold_set(long j, ChromaticAberrationParams chromaticAberrationParams, float f);

    public static final native float ChromaticAberrationParams_luma_threshold_get(long j, ChromaticAberrationParams chromaticAberrationParams);

    public static final native void ChromaticAberrationParams_luma_threshold_set(long j, ChromaticAberrationParams chromaticAberrationParams, float f);

    public static final native int ChromaticAberrationParams_radius_get(long j, ChromaticAberrationParams chromaticAberrationParams);

    public static final native void ChromaticAberrationParams_radius_set(long j, ChromaticAberrationParams chromaticAberrationParams, int i);

    public static final native float ChromaticAberrationParams_suppression_get(long j, ChromaticAberrationParams chromaticAberrationParams);

    public static final native void ChromaticAberrationParams_suppression_set(long j, ChromaticAberrationParams chromaticAberrationParams, float f);

    public static final native long ClientExifMetadata_location_get(long j, ClientExifMetadata clientExifMetadata);

    public static final native void ClientExifMetadata_location_set(long j, ClientExifMetadata clientExifMetadata, long j2, LocationData locationData);

    public static final native long ClientExifMetadata_rgb_thumbnail_get(long j, ClientExifMetadata clientExifMetadata);

    public static final native void ClientExifMetadata_rgb_thumbnail_set(long j, ClientExifMetadata clientExifMetadata, long j2, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long ClientExifMetadata_yuv_thumbnail_get(long j, ClientExifMetadata clientExifMetadata);

    public static final native void ClientExifMetadata_yuv_thumbnail_set(long j, ClientExifMetadata clientExifMetadata, long j2, YuvWriteView yuvWriteView);

    public static final native long ClientInterleavedU16Allocator_Allocate(long j, ClientInterleavedU16Allocator clientInterleavedU16Allocator, int i, int i2, int i3);

    public static final native void ClientInterleavedU16Allocator_Release(long j, ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j2);

    public static final native void ClientInterleavedU16Allocator_change_ownership(ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j, boolean z);

    public static final native void ClientInterleavedU16Allocator_director_connect(ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j, boolean z, boolean z2);

    public static final native long ClientInterleavedU8Allocator_Allocate(long j, ClientInterleavedU8Allocator clientInterleavedU8Allocator, int i, int i2, int i3);

    public static final native void ClientInterleavedU8Allocator_Release(long j, ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j2);

    public static final native void ClientInterleavedU8Allocator_change_ownership(ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j, boolean z);

    public static final native void ClientInterleavedU8Allocator_director_connect(ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j, boolean z, boolean z2);

    public static final native long ClientRawAllocator_Allocate(long j, ClientRawAllocator clientRawAllocator, int i, int i2, int i3);

    public static final native void ClientRawAllocator_Release(long j, ClientRawAllocator clientRawAllocator, long j2);

    public static final native void ClientRawAllocator_change_ownership(ClientRawAllocator clientRawAllocator, long j, boolean z);

    public static final native void ClientRawAllocator_director_connect(ClientRawAllocator clientRawAllocator, long j, boolean z, boolean z2);

    public static final native long ClientYuvAllocator_Allocate(long j, ClientYuvAllocator clientYuvAllocator, int i, int i2, int i3);

    public static final native void ClientYuvAllocator_Release(long j, ClientYuvAllocator clientYuvAllocator, long j2);

    public static final native void ClientYuvAllocator_change_ownership(ClientYuvAllocator clientYuvAllocator, long j, boolean z);

    public static final native void ClientYuvAllocator_director_connect(ClientYuvAllocator clientYuvAllocator, long j, boolean z, boolean z2);

    public static final native boolean ColorSatParams_IsIdentity(long j, ColorSatParams colorSatParams);

    public static final native float ColorSatParams_highlight_saturation_get(long j, ColorSatParams colorSatParams);

    public static final native void ColorSatParams_highlight_saturation_set(long j, ColorSatParams colorSatParams, float f);

    public static final native float ColorSatParams_shadow_saturation_get(long j, ColorSatParams colorSatParams);

    public static final native void ColorSatParams_shadow_saturation_set(long j, ColorSatParams colorSatParams, float f);

    public static final native boolean ConstSampleIteratorPackedRaw10_AtEnd(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native void ConstSampleIteratorPackedRaw10_NextSample(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10___ref__(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10_c(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10_x(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10_y(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native boolean ConstSampleIteratorPackedRaw12_AtEnd(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native void ConstSampleIteratorPackedRaw12_NextSample(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12___ref__(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12_c(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12_x(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12_y(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native String ConvertBurstMetadataToString(long j);

    public static final native String ConvertShotParamsToString(long j, ShotParams shotParams);

    public static final native String ConvertStaticMetadataToString(long j, StaticMetadata staticMetadata);

    public static final native long CropFaceInfo(long j, FaceInfo faceInfo, long j2, PixelRect pixelRect, int i, int i2);

    public static final native boolean CropInDngMetadata(int i);

    public static final native void DebugParams_Print(long j, DebugParams debugParams);

    public static final native long DebugParams_save_bitmask_get(long j, DebugParams debugParams);

    public static final native void DebugParams_save_bitmask_set(long j, DebugParams debugParams, long j2);

    public static final native long DecodeJpgFromDisk__SWIG_0(String str, long j, ExifMetadata exifMetadata);

    public static final native long DecodeJpgFromDisk__SWIG_1(String str);

    public static final native long DecodeJpgFromMemory__SWIG_0(long j, long j2, long j3, ExifMetadata exifMetadata);

    public static final native long DecodeJpgFromMemory__SWIG_1(long j, long j2);

    public static final native float[] DenoiseParams_chroma_strength_get(long j, DenoiseParams denoiseParams);

    public static final native void DenoiseParams_chroma_strength_set(long j, DenoiseParams denoiseParams, float[] fArr);

    public static final native float[] DenoiseParams_luma_strength_get(long j, DenoiseParams denoiseParams);

    public static final native void DenoiseParams_luma_strength_set(long j, DenoiseParams denoiseParams, float[] fArr);

    public static final native float[] DenoiseParams_revert_factor_get(long j, DenoiseParams denoiseParams);

    public static final native void DenoiseParams_revert_factor_set(long j, DenoiseParams denoiseParams, float[] fArr);

    public static final native boolean DeserializeBurstMetadata(long j, long j2);

    public static final native boolean DirtyLensHistory_AddRawScore(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_Reset(long j, DirtyLensHistory dirtyLensHistory);

    public static final native float DirtyLensHistory_frame_influence_decay_rate__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_frame_influence_decay_rate__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native float DirtyLensHistory_initial_score__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_initial_score__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native int DirtyLensHistory_max_photo_count__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_max_photo_count__set(long j, DirtyLensHistory dirtyLensHistory, int i);

    public static final native long DirtyLensHistory_raw_score_history__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_raw_score_history__set(long j, DirtyLensHistory dirtyLensHistory, long j2, FloatDeque floatDeque);

    public static final native float DirtyLensHistory_weighted_score_threshold__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_weighted_score_threshold__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DngColorCalibrationVector_add(long j, DngColorCalibrationVector dngColorCalibrationVector, long j2, DngColorCalibration dngColorCalibration);

    public static final native long DngColorCalibrationVector_capacity(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void DngColorCalibrationVector_clear(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native long DngColorCalibrationVector_get(long j, DngColorCalibrationVector dngColorCalibrationVector, int i);

    public static final native boolean DngColorCalibrationVector_isEmpty(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void DngColorCalibrationVector_reserve(long j, DngColorCalibrationVector dngColorCalibrationVector, long j2);

    public static final native void DngColorCalibrationVector_set(long j, DngColorCalibrationVector dngColorCalibrationVector, int i, long j2, DngColorCalibration dngColorCalibration);

    public static final native long DngColorCalibrationVector_size(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void DngColorCalibration_Clear(long j, DngColorCalibration dngColorCalibration);

    public static final native boolean DngColorCalibration_Equals(long j, DngColorCalibration dngColorCalibration, long j2, DngColorCalibration dngColorCalibration2);

    public static final native int DngColorCalibration_illuminant_get(long j, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_illuminant_set(long j, DngColorCalibration dngColorCalibration, int i);

    public static final native float[] DngColorCalibration_model_rgb_to_device_rgb_get(long j, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_model_rgb_to_device_rgb_set(long j, DngColorCalibration dngColorCalibration, float[] fArr);

    public static final native float[] DngColorCalibration_xyz_to_model_rgb_get(long j, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_xyz_to_model_rgb_set(long j, DngColorCalibration dngColorCalibration, float[] fArr);

    public static final native boolean DngNoiseModel_Check(long j, DngNoiseModel dngNoiseModel);

    public static final native boolean DngNoiseModel_Equals(long j, DngNoiseModel dngNoiseModel, long j2, DngNoiseModel dngNoiseModel2);

    public static final native float DngNoiseModel_offset_get(long j, DngNoiseModel dngNoiseModel);

    public static final native void DngNoiseModel_offset_set(long j, DngNoiseModel dngNoiseModel, float f);

    public static final native float DngNoiseModel_scale_get(long j, DngNoiseModel dngNoiseModel);

    public static final native void DngNoiseModel_scale_set(long j, DngNoiseModel dngNoiseModel, float f);

    public static final native boolean EncodeGcamExif(int i, int i2, long j, ExifMetadata exifMetadata, long j2, long[] jArr);

    public static final native void EncodedBlobCallback_Run(long j, EncodedBlobCallback encodedBlobCallback, int i, long j2, long j3, int i2, int i3);

    public static final native void EncodedBlobCallback_change_ownership(EncodedBlobCallback encodedBlobCallback, long j, boolean z);

    public static final native void EncodedBlobCallback_director_connect(EncodedBlobCallback encodedBlobCallback, long j, boolean z, boolean z2);

    public static final native float EstimateSnr(long j, FrameMetadata frameMetadata);

    public static final native double ExifMetadata_ApertureValue(long j, ExifMetadata exifMetadata);

    public static final native double ExifMetadata_BrightnessValue(long j, ExifMetadata exifMetadata);

    public static final native int ExifMetadata_Flash(long j, ExifMetadata exifMetadata);

    public static final native int ExifMetadata_Iso(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_NoiseModelRgb(long j, ExifMetadata exifMetadata, long j2, DngNoiseModel dngNoiseModel);

    public static final native int ExifMetadata_Orientation(long j, ExifMetadata exifMetadata);

    public static final native double ExifMetadata_SensitivityValue(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_SetFlash(long j, ExifMetadata exifMetadata, int i);

    public static final native void ExifMetadata_SetIso(long j, ExifMetadata exifMetadata, int i);

    public static final native void ExifMetadata_SetNoiseModelRgb(long j, ExifMetadata exifMetadata, long[] jArr);

    public static final native void ExifMetadata_SetOrientation(long j, ExifMetadata exifMetadata, int i);

    public static final native void ExifMetadata_SetTimestampCurrent(long j, ExifMetadata exifMetadata);

    public static final native double ExifMetadata_ShutterSpeedValue(long j, ExifMetadata exifMetadata);

    public static final native long ExifMetadata_client_exif_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_client_exif_set(long j, ExifMetadata exifMetadata, long j2, ClientExifMetadata clientExifMetadata);

    public static final native long ExifMetadata_dng_crop_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_dng_crop_set(long j, ExifMetadata exifMetadata, long j2, PixelRect pixelRect);

    public static final native float ExifMetadata_exposure_compensation_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_exposure_compensation_set(long j, ExifMetadata exifMetadata, float f);

    public static final native long ExifMetadata_final_crop_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_final_crop_set(long j, ExifMetadata exifMetadata, long j2, NormalizedRect normalizedRect);

    public static final native int ExifMetadata_flash_mode_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_flash_mode_set(long j, ExifMetadata exifMetadata, int i);

    public static final native long ExifMetadata_frame_metadata_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_frame_metadata_set(long j, ExifMetadata exifMetadata, long j2, FrameMetadata frameMetadata);

    public static final native long ExifMetadata_gain_map_rggb_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_gain_map_rggb_set(long j, ExifMetadata exifMetadata, long j2);

    public static final native int ExifMetadata_icc_profile_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_icc_profile_set(long j, ExifMetadata exifMetadata, int i);

    public static final native int ExifMetadata_image_rotation_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_image_rotation_set(long j, ExifMetadata exifMetadata, int i);

    public static final native String ExifMetadata_makernote_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_makernote_set(long j, ExifMetadata exifMetadata, String str);

    public static final native float ExifMetadata_range_compression_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_range_compression_set(long j, ExifMetadata exifMetadata, float f);

    public static final native String ExifMetadata_software_suffix_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_software_suffix_set(long j, ExifMetadata exifMetadata, String str);

    public static final native long ExifMetadata_static_metadata_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_static_metadata_set(long j, ExifMetadata exifMetadata, long j2, StaticMetadata staticMetadata);

    public static final native long ExifMetadata_timestamp_unix_us_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_timestamp_unix_us_set(long j, ExifMetadata exifMetadata, long j2);

    public static final native int ExifMetadata_wb_mode_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_wb_mode_set(long j, ExifMetadata exifMetadata, int i);

    public static final native String ExifMetadata_xmp_metadata_extended_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_xmp_metadata_extended_set(long j, ExifMetadata exifMetadata, String str);

    public static final native String ExifMetadata_xmp_metadata_main_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_xmp_metadata_main_set(long j, ExifMetadata exifMetadata, String str);

    public static final native long FaceInfoToNormalizedRect__SWIG_0(long j, FaceInfo faceInfo, int i, int i2, boolean z, int i3);

    public static final native long FaceInfoToNormalizedRect__SWIG_1(long j, FaceInfo faceInfo, int i, int i2, boolean z);

    public static final native long FaceInfoToPixelRect__SWIG_0(long j, FaceInfo faceInfo, int i, int i2, boolean z, int i3);

    public static final native long FaceInfoToPixelRect__SWIG_1(long j, FaceInfo faceInfo, int i, int i2, boolean z);

    public static final native void FaceInfoVector_add(long j, FaceInfoVector faceInfoVector, long j2, FaceInfo faceInfo);

    public static final native long FaceInfoVector_capacity(long j, FaceInfoVector faceInfoVector);

    public static final native void FaceInfoVector_clear(long j, FaceInfoVector faceInfoVector);

    public static final native long FaceInfoVector_get(long j, FaceInfoVector faceInfoVector, int i);

    public static final native boolean FaceInfoVector_isEmpty(long j, FaceInfoVector faceInfoVector);

    public static final native void FaceInfoVector_reserve(long j, FaceInfoVector faceInfoVector, long j2);

    public static final native void FaceInfoVector_set(long j, FaceInfoVector faceInfoVector, int i, long j2, FaceInfo faceInfo);

    public static final native long FaceInfoVector_size(long j, FaceInfoVector faceInfoVector);

    public static final native boolean FaceInfo_Equals(long j, FaceInfo faceInfo, long j2, FaceInfo faceInfo2);

    public static final native float FaceInfo_confidence_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_confidence_set(long j, FaceInfo faceInfo, float f);

    public static final native float FaceInfo_pos_x_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_pos_x_set(long j, FaceInfo faceInfo, float f);

    public static final native float FaceInfo_pos_y_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_pos_y_set(long j, FaceInfo faceInfo, float f);

    public static final native float FaceInfo_size_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_size_set(long j, FaceInfo faceInfo, float f);

    public static final native boolean FactorizeTetOptions_apply_antibanding_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_apply_antibanding_set(long j, FactorizeTetOptions factorizeTetOptions, boolean z);

    public static final native boolean FactorizeTetOptions_exposure_time_from_long_ae_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_exposure_time_from_long_ae_set(long j, FactorizeTetOptions factorizeTetOptions, boolean z);

    public static final native float FactorizeTetOptions_max_analog_gain_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_max_analog_gain_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native float FactorizeTetOptions_max_exposure_time_ms_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_max_exposure_time_ms_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native float FactorizeTetOptions_max_overall_gain_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_max_overall_gain_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native float FactorizeTetOptions_min_exposure_time_ms_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_min_exposure_time_ms_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native boolean FactorizeTetOptions_verbose_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_verbose_set(long j, FactorizeTetOptions factorizeTetOptions, boolean z);

    public static final native long FactorizeTet__SWIG_0(long j, TetModel tetModel, float f, float f2, long j2, FactorizeTetOptions factorizeTetOptions, long j3, int i);

    public static final native long FactorizeTet__SWIG_1(long j, TetModel tetModel, float f, float f2, long j2, FactorizeTetOptions factorizeTetOptions, long j3);

    public static final native long FactorizeTet__SWIG_2(long j, TetModel tetModel, float f, float f2, long j2, FactorizeTetOptions factorizeTetOptions);

    public static final native void FinalImageCallback_RgbReady(long j, FinalImageCallback finalImageCallback, int i, long j2, InterleavedReadViewU8 interleavedReadViewU8, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void FinalImageCallback_YuvReady(long j, FinalImageCallback finalImageCallback, int i, long j2, YuvReadView yuvReadView, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void FinalImageCallback_change_ownership(FinalImageCallback finalImageCallback, long j, boolean z);

    public static final native void FinalImageCallback_director_connect(FinalImageCallback finalImageCallback, long j, boolean z, boolean z2);

    public static final native void FixOldWbGains(long j, AwbInfo awbInfo);

    public static final native void FloatDeque_assign(long j, FloatDeque floatDeque, long j2, float f);

    public static final native float FloatDeque_back(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_clear(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_delitem(long j, FloatDeque floatDeque, int i);

    public static final native void FloatDeque_delslice(long j, FloatDeque floatDeque, int i, int i2);

    public static final native boolean FloatDeque_empty(long j, FloatDeque floatDeque);

    public static final native float FloatDeque_front(long j, FloatDeque floatDeque);

    public static final native float FloatDeque_getitem(long j, FloatDeque floatDeque, int i);

    public static final native long FloatDeque_getslice(long j, FloatDeque floatDeque, int i, int i2);

    public static final native long FloatDeque_max_size(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_pop_back(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_pop_front(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_push_back(long j, FloatDeque floatDeque, float f);

    public static final native void FloatDeque_push_front(long j, FloatDeque floatDeque, float f);

    public static final native void FloatDeque_resize__SWIG_0(long j, FloatDeque floatDeque, long j2, float f);

    public static final native void FloatDeque_resize__SWIG_1(long j, FloatDeque floatDeque, long j2);

    public static final native void FloatDeque_setitem(long j, FloatDeque floatDeque, int i, float f);

    public static final native void FloatDeque_setslice(long j, FloatDeque floatDeque, int i, int i2, long j2, FloatDeque floatDeque2);

    public static final native long FloatDeque_size(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_swap(long j, FloatDeque floatDeque, long j2, FloatDeque floatDeque2);

    public static final native float FloatSmoothKeyValueMap_Get(long j, FloatSmoothKeyValueMap floatSmoothKeyValueMap, float f);

    public static final native void FloatVector_add(long j, FloatVector floatVector, float f);

    public static final native long FloatVector_capacity(long j, FloatVector floatVector);

    public static final native void FloatVector_clear(long j, FloatVector floatVector);

    public static final native float FloatVector_get(long j, FloatVector floatVector, int i);

    public static final native boolean FloatVector_isEmpty(long j, FloatVector floatVector);

    public static final native void FloatVector_reserve(long j, FloatVector floatVector, long j2);

    public static final native void FloatVector_set(long j, FloatVector floatVector, int i, float f);

    public static final native long FloatVector_size(long j, FloatVector floatVector);

    public static final native float FrameMetadata_AppliedOverallGain(long j, FrameMetadata frameMetadata);

    public static final native boolean FrameMetadata_Check(long j, FrameMetadata frameMetadata, String str, int i, boolean z, long j2);

    public static final native void FrameMetadata_Clear(long j, FrameMetadata frameMetadata);

    public static final native boolean FrameMetadata_DeserializeFromString(long j, FrameMetadata frameMetadata, long j2, int i);

    public static final native float FrameMetadata_DesiredOverallGain(long j, FrameMetadata frameMetadata);

    public static final native boolean FrameMetadata_Equals(long j, FrameMetadata frameMetadata, long j2, FrameMetadata frameMetadata2);

    public static final native float FrameMetadata_GetCurrentTet(long j, FrameMetadata frameMetadata);

    public static final native float FrameMetadata_GetFinalDesiredTet(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_Print(long j, FrameMetadata frameMetadata, int i, int i2);

    public static final native void FrameMetadata_SerializeToString(long j, FrameMetadata frameMetadata, long j2, int i);

    public static final native float FrameMetadata_actual_analog_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_analog_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_actual_exposure_time_ms_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_exposure_time_ms_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_ae_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_ae_set(long j, FrameMetadata frameMetadata, long j2, AeMetadata aeMetadata);

    public static final native long FrameMetadata_af_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_af_set(long j, FrameMetadata frameMetadata, long j2, AfMetadata afMetadata);

    public static final native float FrameMetadata_applied_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_applied_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_awb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_awb_set(long j, FrameMetadata frameMetadata, long j2, AwbMetadata awbMetadata);

    public static final native float[] FrameMetadata_black_levels_bayer_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_black_levels_bayer_set(long j, FrameMetadata frameMetadata, float[] fArr);

    public static final native long FrameMetadata_capture_errors_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_capture_errors_set(long j, FrameMetadata frameMetadata, long j2, StringVector stringVector);

    public static final native long FrameMetadata_capture_warnings_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_capture_warnings_set(long j, FrameMetadata frameMetadata, long j2, StringVector stringVector);

    public static final native int FrameMetadata_control_mode_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_control_mode_set(long j, FrameMetadata frameMetadata, int i);

    public static final native float FrameMetadata_desired_overall_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_desired_overall_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long[] FrameMetadata_dng_noise_model_bayer_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_dng_noise_model_bayer_set(long j, FrameMetadata frameMetadata, long[] jArr);

    public static final native float FrameMetadata_exposure_time_boost_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_exposure_time_boost_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_faces_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_faces_set(long j, FrameMetadata frameMetadata, long j2, FaceInfoVector faceInfoVector);

    public static final native int FrameMetadata_flash_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_flash_set(long j, FrameMetadata frameMetadata, int i);

    public static final native float FrameMetadata_focal_length_mm_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_focal_length_mm_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_focus_distance_diopters_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_focus_distance_diopters_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_gyro_samples_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_gyro_samples_set(long j, FrameMetadata frameMetadata, long j2, GyroSampleVector gyroSampleVector);

    public static final native int FrameMetadata_lens_state_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_lens_state_set(long j, FrameMetadata frameMetadata, int i);

    public static final native float FrameMetadata_mean_signal_level_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_mean_signal_level_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float[] FrameMetadata_neutral_point_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_neutral_point_set(long j, FrameMetadata frameMetadata, float[] fArr);

    public static final native long FrameMetadata_ois_metadata_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_ois_metadata_set(long j, FrameMetadata frameMetadata, long j2, OisMetadata oisMetadata);

    public static final native float FrameMetadata_post_raw_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_post_raw_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native int FrameMetadata_scene_flicker_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_scene_flicker_set(long j, FrameMetadata frameMetadata, int i);

    public static final native int FrameMetadata_sensor_id_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sensor_id_set(long j, FrameMetadata frameMetadata, int i);

    public static final native int FrameMetadata_sensor_temp_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sensor_temp_set(long j, FrameMetadata frameMetadata, int i);

    public static final native float FrameMetadata_sharpness_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sharpness_set(long j, FrameMetadata frameMetadata, float f);

    public static final native int FrameMetadata_temporal_binning_factor_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_temporal_binning_factor_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_timestamp_ns_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_timestamp_ns_set(long j, FrameMetadata frameMetadata, long j2);

    public static final native boolean FrameMetadata_was_black_level_locked_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_was_black_level_locked_set(long j, FrameMetadata frameMetadata, boolean z);

    public static final native long FrameMetadata_wb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_wb_set(long j, FrameMetadata frameMetadata, long j2, AwbInfo awbInfo);

    public static final native void FrameRequestVector_add(long j, FrameRequestVector frameRequestVector, long j2, FrameRequest frameRequest);

    public static final native long FrameRequestVector_capacity(long j, FrameRequestVector frameRequestVector);

    public static final native void FrameRequestVector_clear(long j, FrameRequestVector frameRequestVector);

    public static final native long FrameRequestVector_get(long j, FrameRequestVector frameRequestVector, int i);

    public static final native boolean FrameRequestVector_isEmpty(long j, FrameRequestVector frameRequestVector);

    public static final native void FrameRequestVector_reserve(long j, FrameRequestVector frameRequestVector, long j2);

    public static final native void FrameRequestVector_set(long j, FrameRequestVector frameRequestVector, int i, long j2, FrameRequest frameRequest);

    public static final native long FrameRequestVector_size(long j, FrameRequestVector frameRequestVector);

    public static final native void FrameRequest_Clear(long j, FrameRequest frameRequest);

    public static final native boolean FrameRequest_Equals(long j, FrameRequest frameRequest, long j2, FrameRequest frameRequest2);

    public static final native float FrameRequest_GetDesiredTet(long j, FrameRequest frameRequest);

    public static final native long FrameRequest_awb_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_awb_set(long j, FrameRequest frameRequest, long j2, AwbInfo awbInfo);

    public static final native float FrameRequest_desired_analog_gain_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_analog_gain_set(long j, FrameRequest frameRequest, float f);

    public static final native float FrameRequest_desired_digital_gain_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_digital_gain_set(long j, FrameRequest frameRequest, float f);

    public static final native float FrameRequest_desired_exposure_time_ms_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_exposure_time_ms_set(long j, FrameRequest frameRequest, float f);

    public static final native boolean FrameRequest_try_to_lock_black_level_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_try_to_lock_black_level_set(long j, FrameRequest frameRequest, boolean z);

    public static final native int FrameRequest_type_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_type_set(long j, FrameRequest frameRequest, int i);

    public static final native long GCAM_SAVE_INPUT_METADATA_get();

    public static final native long GCAM_SAVE_INPUT_METERING_get();

    public static final native long GCAM_SAVE_INPUT_PAYLOAD_get();

    public static final native long GCAM_SAVE_NONE_get();

    public static final native long GCAM_SAVE_OTHER_TEXT_get();

    public static final native long GCAM_SAVE_TEXT_get();

    public static final native boolean Gcam_AbortShot(long j, Gcam gcam, int i);

    public static final native boolean Gcam_AddFrameMetadataForLogging(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata);

    public static final native boolean Gcam_AddMeteringFrame(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, long j4, RawWriteView rawWriteView, long j5, SpatialGainMap spatialGainMap);

    public static final native boolean Gcam_AddPayloadFrame(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, long j4, RawWriteView rawWriteView, long j5, long j6, InterleavedWriteViewU16 interleavedWriteViewU16, long j7, SpatialGainMap spatialGainMap);

    public static final native void Gcam_AddViewfinderFrame(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, AeShotParams aeShotParams, long j4, long j5, RawWriteView rawWriteView, long j6, SpatialGainMap spatialGainMap);

    public static final native boolean Gcam_AppendMessageToSummary(long j, Gcam gcam, int i, String str);

    public static final native boolean Gcam_BeginMeteringFrames(long j, Gcam gcam, int i, long j2, BurstSpec burstSpec);

    public static final native void Gcam_BeginPayloadFrames(long j, Gcam gcam, int i, long j2, BurstSpec burstSpec);

    public static final native long Gcam_BuildPayloadBurstSpec(long j, Gcam gcam, int i, long j2, AeResults aeResults);

    public static final native long Gcam_ComputeAeResults(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, RawWriteView rawWriteView, long j4, SpatialGainMap spatialGainMap);

    public static final native long Gcam_Create__SWIG_0(long j, InitParams initParams, long j2, StaticMetadataVector staticMetadataVector, long j3, DebugParams debugParams);

    public static final native long Gcam_Create__SWIG_1(long j, InitParams initParams, long j2, StaticMetadataVector staticMetadataVector);

    public static final native long Gcam_EndMeteringFrames(long j, Gcam gcam, int i);

    public static final native boolean Gcam_EndPayloadFrames(long j, Gcam gcam, int i, long j2, ClientExifMetadata clientExifMetadata, long j3, StringVector stringVector, long j4, StringVector stringVector2);

    public static final native boolean Gcam_EndShotCapture(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushViewfinder(long j, Gcam gcam, int i);

    public static final native long Gcam_GetInitParams(long j, Gcam gcam);

    public static final native long Gcam_GetLatestBackgroundAeResults(long j, Gcam gcam, int i);

    public static final native long Gcam_GetMeteringBurstSpec(long j, Gcam gcam, int i);

    public static final native void Gcam_GetNewShotMemEstimate(long j, Gcam gcam, long j2);

    public static final native int Gcam_GetNumCameras(long j, Gcam gcam);

    public static final native long Gcam_GetStaticMetadata(long j, Gcam gcam, int i);

    public static final native long Gcam_GetTuning(long j, Gcam gcam, int i);

    public static final native boolean Gcam_IsCapturing(long j, Gcam gcam);

    public static final native boolean Gcam_IsIdle(long j, Gcam gcam);

    public static final native boolean Gcam_LimitShotCpuUsage(long j, Gcam gcam, int i, float f);

    public static final native long Gcam_PeakMemoryBytes(long j, Gcam gcam);

    public static final native long Gcam_PeakMemoryWithNewShotBytes(long j, Gcam gcam);

    public static final native void Gcam_PrintStatus(long j, Gcam gcam);

    public static final native int Gcam_StartShotCapture(long j, Gcam gcam, int i, long j2, ShotParams shotParams, long j3, ShotCallbacks shotCallbacks, int i2, long j4, PostviewParams postviewParams, long j5, ImageSaverParams imageSaverParams);

    public static final native void Gcam_UpdateCameras(long j, Gcam gcam, long j2, StaticMetadataVector staticMetadataVector, long j3, TuningVector tuningVector);

    public static final native void Gcam_UpdateDebugParams(long j, Gcam gcam, long j2, DebugParams debugParams);

    public static final native long GenParameterizedSpatialGainMap(int i, int i2, float f, float f2, float f3);

    public static final native long GenSpatialGainMap_Flat();

    public static final native long GenSpatialGainMap_N5_N6();

    public static final native long GenSpatialGainMap_Typical();

    public static final native long GetAwbForTet(float f, long j, TetToAwb tetToAwb, boolean z);

    public static final native int GetBitsPerPixel(int i);

    public static final native long GetCustomFileSaver();

    public static final native boolean GetDirtyLensRawScoreFromJpegInMemory(long j, long j2, float[] fArr);

    public static final native boolean GetDirtyLensRawScore__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8, float[] fArr);

    public static final native boolean GetDirtyLensRawScore__SWIG_1(long j, YuvReadView yuvReadView, float[] fArr);

    public static final native long GetFactorizeTetOptions(long j, Tuning tuning, long j2, StaticMetadata staticMetadata);

    public static final native void GetFinalDngImageSize(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, ExifMetadata exifMetadata, long j3, long j4);

    public static final native long GetGcamImageMemCurrent();

    public static final native long GetGcamImageMemPeak();

    public static final native boolean GetIccProfileData(int i, long j, long j2);

    public static final native int GetNumChannels(int i);

    public static final native int GetRandomBayerPattern();

    public static final native long GetRandomFaceInfo();

    public static final native long GetRandomFrameMetadata();

    public static final native long GetRandomInitParams();

    public static final native int GetRandomPixelFormat();

    public static final native long GetRandomShotParams(long j, InitParams initParams);

    public static final native long GetRandomStaticMetadata();

    public static final native long GetRandomWhiteBalance();

    public static final native void GetRawBufferBounds(int i, long j, long j2, long j3, long j4, long j5);

    public static final native int GetRawCropping(long j, ShotParams shotParams, long j2, ShotCallbacks shotCallbacks);

    public static final native void GetRotatedImageSize(int i, int i2, int i3, long j, long j2);

    public static final native boolean GetTuning__SWIG_0(String str, String str2, int i, boolean z, long j, Tuning tuning);

    public static final native boolean GetTuning__SWIG_1(long j, StaticMetadata staticMetadata, boolean z, long j2, Tuning tuning);

    public static final native String GetVersion();

    public static final native long GoudaCallbacks_complete_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_complete_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaCompleteCallback goudaCompleteCallback);

    public static final native long GoudaCallbacks_debug_image_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_debug_image_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaImageCallback goudaImageCallback);

    public static final native long GoudaCallbacks_debug_rgb_allocator_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_debug_rgb_allocator_set(long j, GoudaCallbacks goudaCallbacks, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long GoudaCallbacks_features_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_features_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaOutputFeaturesCallback goudaOutputFeaturesCallback);

    public static final native long GoudaCallbacks_image_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_image_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaImageCallback goudaImageCallback);

    public static final native long GoudaCallbacks_progress_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_progress_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaProgressCallback goudaProgressCallback);

    public static final native long GoudaCallbacks_rgb_allocator_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_rgb_allocator_set(long j, GoudaCallbacks goudaCallbacks, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long GoudaCallbacks_secondary_image_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_secondary_image_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaImageCallback goudaImageCallback);

    public static final native long GoudaCallbacks_upsampled_input_image_callback_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_upsampled_input_image_callback_set(long j, GoudaCallbacks goudaCallbacks, long j2, GoudaImageCallback goudaImageCallback);

    public static final native long GoudaCallbacks_yuv_allocator_get(long j, GoudaCallbacks goudaCallbacks);

    public static final native void GoudaCallbacks_yuv_allocator_set(long j, GoudaCallbacks goudaCallbacks, long j2, ClientYuvAllocator clientYuvAllocator);

    public static final native void GoudaCompleteCallback_Run(long j, GoudaCompleteCallback goudaCompleteCallback, long j2);

    public static final native void GoudaCompleteCallback_change_ownership(GoudaCompleteCallback goudaCompleteCallback, long j, boolean z);

    public static final native void GoudaCompleteCallback_director_connect(GoudaCompleteCallback goudaCompleteCallback, long j, boolean z, boolean z2);

    public static final native void GoudaImageCallback_RgbReady(long j, GoudaImageCallback goudaImageCallback, long j2, long j3, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3);

    public static final native void GoudaImageCallback_YuvReady(long j, GoudaImageCallback goudaImageCallback, long j2, long j3, YuvReadView yuvReadView, int i, String str, String str2, String str3);

    public static final native void GoudaImageCallback_change_ownership(GoudaImageCallback goudaImageCallback, long j, boolean z);

    public static final native void GoudaImageCallback_director_connect(GoudaImageCallback goudaImageCallback, long j, boolean z, boolean z2);

    public static final native void GoudaOutputFeaturesCallback_AddFeature(long j, GoudaOutputFeaturesCallback goudaOutputFeaturesCallback, long j2, String str, double d);

    public static final native void GoudaProgressCallback_Run(long j, GoudaProgressCallback goudaProgressCallback, long j2, float f);

    public static final native void GoudaProgressCallback_change_ownership(GoudaProgressCallback goudaProgressCallback, long j, boolean z);

    public static final native void GoudaProgressCallback_director_connect(GoudaProgressCallback goudaProgressCallback, long j, boolean z, boolean z2);

    public static final native int GoudaRequest_debug_images_verbosity_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_debug_images_verbosity_set(long j, GoudaRequest goudaRequest, int i);

    public static final native boolean GoudaRequest_embed_gdepth_metadata_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_embed_gdepth_metadata_set(long j, GoudaRequest goudaRequest, boolean z);

    public static final native long GoudaRequest_faces_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_faces_set(long j, GoudaRequest goudaRequest, long j2, PixelRectVector pixelRectVector);

    public static final native long GoudaRequest_frame_metadata_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_frame_metadata_set(long j, GoudaRequest goudaRequest, long j2, FrameMetadata frameMetadata);

    public static final native long GoudaRequest_id_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_id_set(long j, GoudaRequest goudaRequest, long j2);

    public static final native int GoudaRequest_image_rotation_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_image_rotation_set(long j, GoudaRequest goudaRequest, int i);

    public static final native int GoudaRequest_output_format_primary_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_output_format_primary_set(long j, GoudaRequest goudaRequest, int i);

    public static final native int GoudaRequest_output_height_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_output_height_set(long j, GoudaRequest goudaRequest, int i);

    public static final native int GoudaRequest_output_width_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_output_width_set(long j, GoudaRequest goudaRequest, int i);

    public static final native int GoudaRequest_pd_version_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_pd_version_set(long j, GoudaRequest goudaRequest, int i);

    public static final native String GoudaRequest_portrait_raw_path_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_portrait_raw_path_set(long j, GoudaRequest goudaRequest, String str);

    public static final native float GoudaRequest_post_resample_sharpening_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_post_resample_sharpening_set(long j, GoudaRequest goudaRequest, float f);

    public static final native String GoudaRequest_shot_prefix_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_shot_prefix_set(long j, GoudaRequest goudaRequest, String str);

    public static final native long GoudaRequest_static_metadata_get(long j, GoudaRequest goudaRequest);

    public static final native void GoudaRequest_static_metadata_set(long j, GoudaRequest goudaRequest, long j2, StaticMetadata staticMetadata);

    public static final native boolean GoudaSwigWrapper_Init(long j, GoudaSwigWrapper goudaSwigWrapper);

    public static final native boolean GoudaSwigWrapper_Process(long j, GoudaSwigWrapper goudaSwigWrapper, long j2, long j3, GoudaCallbacks goudaCallbacks, long j4, InterleavedReadViewU8 interleavedReadViewU8, long j5, GoudaRequest goudaRequest, long j6, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native void GoudaSwigWrapper_Release(long j, GoudaSwigWrapper goudaSwigWrapper);

    public static final native void GyroSampleVector_add(long j, GyroSampleVector gyroSampleVector, long j2, GyroSample gyroSample);

    public static final native long GyroSampleVector_capacity(long j, GyroSampleVector gyroSampleVector);

    public static final native void GyroSampleVector_clear(long j, GyroSampleVector gyroSampleVector);

    public static final native long GyroSampleVector_get(long j, GyroSampleVector gyroSampleVector, int i);

    public static final native boolean GyroSampleVector_isEmpty(long j, GyroSampleVector gyroSampleVector);

    public static final native void GyroSampleVector_reserve(long j, GyroSampleVector gyroSampleVector, long j2);

    public static final native void GyroSampleVector_set(long j, GyroSampleVector gyroSampleVector, int i, long j2, GyroSample gyroSample);

    public static final native long GyroSampleVector_size(long j, GyroSampleVector gyroSampleVector);

    public static final native boolean GyroSample_Equals(long j, GyroSample gyroSample, long j2, GyroSample gyroSample2);

    public static final native long GyroSample_timestamp_ns_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_timestamp_ns_set(long j, GyroSample gyroSample, long j2);

    public static final native float GyroSample_x_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_x_set(long j, GyroSample gyroSample, float f);

    public static final native float GyroSample_y_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_y_set(long j, GyroSample gyroSample, float f);

    public static final native float GyroSample_z_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_z_set(long j, GyroSample gyroSample, float f);

    public static final native void ImageReleaseCallback_Run(long j, ImageReleaseCallback imageReleaseCallback, long j2);

    public static final native void ImageReleaseCallback_change_ownership(ImageReleaseCallback imageReleaseCallback, long j, boolean z);

    public static final native void ImageReleaseCallback_director_connect(ImageReleaseCallback imageReleaseCallback, long j, boolean z, boolean z2);

    public static final native void ImageSaverParams_Print(long j, ImageSaverParams imageSaverParams);

    public static final native String ImageSaverParams_dest_folder_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_dest_folder_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native String ImageSaverParams_filename_prefix_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_filename_prefix_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native String ImageSaverParams_filename_suffix_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_filename_suffix_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native void ImageSaver_Clear(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_GetPath(long j, ImageSaver imageSaver, String str);

    public static final native String ImageSaver_GetUniquePath(long j, ImageSaver imageSaver, String str);

    public static final native String ImageSaver_Save__SWIG_0(long j, ImageSaver imageSaver, long j2, InterleavedReadViewU8 interleavedReadViewU8, String str);

    public static final native String ImageSaver_Save__SWIG_1(long j, ImageSaver imageSaver, long j2, InterleavedReadViewU16 interleavedReadViewU16, String str);

    public static final native String ImageSaver_Save__SWIG_2(long j, ImageSaver imageSaver, long j2, String str);

    public static final native String ImageSaver_dest_folder(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_filename_prefix(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_filename_suffix(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_gcam_version(long j, ImageSaver imageSaver);

    public static final native void InitCustomFileSaver(long j, FileSaver fileSaver);

    public static final native void InitCustomMemoryAllocator(long j, long j2);

    public static final native boolean InitParams_Check(long j, InitParams initParams);

    public static final native void InitParams_Clear(long j, InitParams initParams);

    public static final native boolean InitParams_DeserializeFromString__SWIG_0(long j, InitParams initParams, long j2);

    public static final native boolean InitParams_DeserializeFromString__SWIG_1(long j, InitParams initParams, String str);

    public static final native boolean InitParams_Equals(long j, InitParams initParams, long j2, InitParams initParams2);

    public static final native void InitParams_Print(long j, InitParams initParams, int i);

    public static final native void InitParams_SerializeToString(long j, InitParams initParams, long j2);

    public static final native boolean InitParams_allow_unknown_devices_get(long j, InitParams initParams);

    public static final native void InitParams_allow_unknown_devices_set(long j, InitParams initParams, boolean z);

    public static final native long InitParams_background_ae_results_callback_get(long j, InitParams initParams);

    public static final native void InitParams_background_ae_results_callback_set(long j, InitParams initParams, long j2, BackgroundAeResultsCallback backgroundAeResultsCallback);

    public static final native long InitParams_capture_priority_get(long j, InitParams initParams);

    public static final native void InitParams_capture_priority_set(long j, InitParams initParams, long j2, ThreadPriority threadPriority);

    public static final native long InitParams_custom_file_saver_get(long j, InitParams initParams);

    public static final native void InitParams_custom_file_saver_set(long j, InitParams initParams, long j2, FileSaver fileSaver);

    public static final native long InitParams_custom_free_get(long j, InitParams initParams);

    public static final native void InitParams_custom_free_set(long j, InitParams initParams, long j2);

    public static final native long InitParams_custom_malloc_get(long j, InitParams initParams);

    public static final native void InitParams_custom_malloc_set(long j, InitParams initParams, long j2);

    public static final native boolean InitParams_disable_smart_metering_get(long j, InitParams initParams);

    public static final native void InitParams_disable_smart_metering_set(long j, InitParams initParams, boolean z);

    public static final native int InitParams_execute_finish_on_get(long j, InitParams initParams);

    public static final native void InitParams_execute_finish_on_set(long j, InitParams initParams, int i);

    public static final native long InitParams_finish_priority_get(long j, InitParams initParams);

    public static final native void InitParams_finish_priority_set(long j, InitParams initParams, long j2, ThreadPriority threadPriority);

    public static final native long InitParams_finish_queue_empty_callback_get(long j, InitParams initParams);

    public static final native void InitParams_finish_queue_empty_callback_set(long j, InitParams initParams, long j2, SimpleCallback simpleCallback);

    public static final native long InitParams_image_release_callback_get(long j, InitParams initParams);

    public static final native void InitParams_image_release_callback_set(long j, InitParams initParams, long j2, ImageReleaseCallback imageReleaseCallback);

    public static final native int InitParams_max_full_metering_sweep_frames_get(long j, InitParams initParams);

    public static final native void InitParams_max_full_metering_sweep_frames_set(long j, InitParams initParams, int i);

    public static final native int InitParams_max_payload_frames_get(long j, InitParams initParams);

    public static final native void InitParams_max_payload_frames_set(long j, InitParams initParams, int i);

    public static final native int InitParams_max_zsl_frames_get(long j, InitParams initParams);

    public static final native void InitParams_max_zsl_frames_set(long j, InitParams initParams, int i);

    public static final native long InitParams_memory_callback_get(long j, InitParams initParams);

    public static final native void InitParams_memory_callback_set(long j, InitParams initParams, long j2, MemoryStateCallback memoryStateCallback);

    public static final native long InitParams_merge_priority_get(long j, InitParams initParams);

    public static final native void InitParams_merge_priority_set(long j, InitParams initParams, long j2, ThreadPriority threadPriority);

    public static final native long InitParams_merge_queue_empty_callback_get(long j, InitParams initParams);

    public static final native void InitParams_merge_queue_empty_callback_set(long j, InitParams initParams, long j2, SimpleCallback simpleCallback);

    public static final native int InitParams_min_full_metering_sweep_frames_get(long j, InitParams initParams);

    public static final native void InitParams_min_full_metering_sweep_frames_set(long j, InitParams initParams, int i);

    public static final native int InitParams_min_payload_frames_get(long j, InitParams initParams);

    public static final native void InitParams_min_payload_frames_set(long j, InitParams initParams, int i);

    public static final native boolean InitParams_simultaneous_merge_and_finish_get(long j, InitParams initParams);

    public static final native void InitParams_simultaneous_merge_and_finish_set(long j, InitParams initParams, boolean z);

    public static final native int InitParams_thread_count_get(long j, InitParams initParams);

    public static final native void InitParams_thread_count_set(long j, InitParams initParams, int i);

    public static final native boolean InitParams_tuning_locked_get(long j, InitParams initParams);

    public static final native void InitParams_tuning_locked_set(long j, InitParams initParams, boolean z);

    public static final native boolean InitParams_verbose_get(long j, InitParams initParams);

    public static final native void InitParams_verbose_set(long j, InitParams initParams, boolean z);

    public static final native void Int64Vector_add(long j, Int64Vector int64Vector, long j2);

    public static final native long Int64Vector_capacity(long j, Int64Vector int64Vector);

    public static final native void Int64Vector_clear(long j, Int64Vector int64Vector);

    public static final native long Int64Vector_get(long j, Int64Vector int64Vector, int i);

    public static final native boolean Int64Vector_isEmpty(long j, Int64Vector int64Vector);

    public static final native void Int64Vector_reserve(long j, Int64Vector int64Vector, long j2);

    public static final native void Int64Vector_set(long j, Int64Vector int64Vector, int i, long j2);

    public static final native long Int64Vector_size(long j, Int64Vector int64Vector);

    public static final native void InterleavedImageU16_FastCrop_SWIG_0_0(long j, InterleavedImageU16 interleavedImageU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedImageU16_FastCrop_SWIG_0_1(long j, InterleavedImageU16 interleavedImageU16, int i, int i2, int i3, int i4);

    public static final native long InterleavedImageU16_SWIGUpcast(long j);

    public static final native boolean InterleavedImageU16_SamplesAreCompact(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_allocator(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_c_stride(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_height(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_num_channels(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_row_padding(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_sample_array_size(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_sizeof_sample_type(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_width(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_x_stride(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_y_stride(long j, InterleavedImageU16 interleavedImageU16);

    public static final native void InterleavedImageU8_FastCrop_SWIG_0_0(long j, InterleavedImageU8 interleavedImageU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedImageU8_FastCrop_SWIG_0_1(long j, InterleavedImageU8 interleavedImageU8, int i, int i2, int i3, int i4);

    public static final native long InterleavedImageU8_SWIGUpcast(long j);

    public static final native boolean InterleavedImageU8_SamplesAreCompact(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_allocator(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_c_stride(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_height(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_num_channels(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_row_padding(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_sample_array_size(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_sizeof_sample_type(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_width(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_x_stride(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_y_stride(long j, InterleavedImageU8 interleavedImageU8);

    public static final native boolean InterleavedReadViewU16_Empty(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native void InterleavedReadViewU16_FastCrop__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedReadViewU16_FastCrop__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4);

    public static final native boolean InterleavedReadViewU16_SamplesAreCompact(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_at(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3);

    public static final native long InterleavedReadViewU16_base_pointer(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_c_stride(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_height(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_num_channels(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_row_padding(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_sample_array_size(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_sample_iterator__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_sample_iterator__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, int i);

    public static final native int InterleavedReadViewU16_sample_layout();

    public static final native long InterleavedReadViewU16_sizeof_sample_type(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_width(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_x_stride(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_y_stride(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native boolean InterleavedReadViewU8_Empty(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native void InterleavedReadViewU8_FastCrop__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedReadViewU8_FastCrop__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4);

    public static final native boolean InterleavedReadViewU8_SamplesAreCompact(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native short InterleavedReadViewU8_at(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3);

    public static final native long InterleavedReadViewU8_base_pointer(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_c_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_height(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_num_channels(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_row_padding(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_sample_array_size(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_sample_iterator__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_sample_iterator__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8, int i);

    public static final native int InterleavedReadViewU8_sample_layout();

    public static final native long InterleavedReadViewU8_sizeof_sample_type(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_width(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_x_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_y_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedU16Allocation_id_get(long j, InterleavedU16Allocation interleavedU16Allocation);

    public static final native void InterleavedU16Allocation_id_set(long j, InterleavedU16Allocation interleavedU16Allocation, long j2);

    public static final native long InterleavedU16Allocation_view_get(long j, InterleavedU16Allocation interleavedU16Allocation);

    public static final native void InterleavedU16Allocation_view_set(long j, InterleavedU16Allocation interleavedU16Allocation, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedU8Allocation_id_get(long j, InterleavedU8Allocation interleavedU8Allocation);

    public static final native void InterleavedU8Allocation_id_set(long j, InterleavedU8Allocation interleavedU8Allocation, long j2);

    public static final native long InterleavedU8Allocation_view_get(long j, InterleavedU8Allocation interleavedU8Allocation);

    public static final native void InterleavedU8Allocation_view_set(long j, InterleavedU8Allocation interleavedU8Allocation, long j2, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native void InterleavedWriteViewU16_FastCrop_SWIG_0_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedWriteViewU16_FastCrop_SWIG_0_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewU16_Fill__SWIG_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5);

    public static final native void InterleavedWriteViewU16_Fill__SWIG_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i);

    public static final native long InterleavedWriteViewU16_SWIGUpcast(long j);

    public static final native boolean InterleavedWriteViewU16_SamplesAreCompact(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_at_InterleavedWriteViewU16(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3);

    public static final native long InterleavedWriteViewU16_base_pointer(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_c_stride(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_height(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_num_channels(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_row_padding(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_sample_array_size(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    /* renamed from: InterleavedWriteViewU16_sample_iterator_InterleavedWriteViewU16__SWIG_0 */
    public static final native long m1369x86fe7a76(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    /* renamed from: InterleavedWriteViewU16_sample_iterator_InterleavedWriteViewU16__SWIG_1 */
    public static final native long m1370x86fe7a77(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i);

    public static final native long InterleavedWriteViewU16_sizeof_sample_type(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_width(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_x_stride(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_y_stride(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native void InterleavedWriteViewU8_FastCrop_SWIG_0_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedWriteViewU8_FastCrop_SWIG_0_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewU8_Fill__SWIG_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8, short s, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewU8_Fill__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, short s);

    public static final native long InterleavedWriteViewU8_SWIGUpcast(long j);

    public static final native boolean InterleavedWriteViewU8_SamplesAreCompact(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_at_InterleavedWriteViewU8(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3);

    public static final native long InterleavedWriteViewU8_base_pointer(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_c_stride(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_height(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_num_channels(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_row_padding(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_sample_array_size(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    /* renamed from: InterleavedWriteViewU8_sample_iterator_InterleavedWriteViewU8__SWIG_0 */
    public static final native long m1371x8772de4e(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    /* renamed from: InterleavedWriteViewU8_sample_iterator_InterleavedWriteViewU8__SWIG_1 */
    public static final native long m1372x8772de4f(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i);

    public static final native long InterleavedWriteViewU8_sizeof_sample_type(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_width(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_x_stride(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_y_stride(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterpolateWb(long j, AwbInfo awbInfo, long j2, AwbInfo awbInfo2, float f);

    public static final native long Intersect(long j, PixelRect pixelRect, long j2, PixelRect pixelRect2);

    public static final native boolean IsEasel(int i);

    public static final native boolean IsMergedRawFullSized(int i);

    public static final native boolean IsPlanar(int i);

    public static final native boolean IsRgb(int i);

    public static final native boolean IsYuv(int i);

    public static final native long Lerp(long j, RawVignetteParams rawVignetteParams, long j2, RawVignetteParams rawVignetteParams2, float f);

    public static final native boolean LocationData_Check(long j, LocationData locationData);

    public static final native void LocationData_Clear(long j, LocationData locationData);

    public static final native boolean LocationData_Equals(long j, LocationData locationData, long j2, LocationData locationData2);

    public static final native double LocationData_altitude_get(long j, LocationData locationData);

    public static final native void LocationData_altitude_set(long j, LocationData locationData, double d);

    public static final native double LocationData_degree_of_precision_get(long j, LocationData locationData);

    public static final native void LocationData_degree_of_precision_set(long j, LocationData locationData, double d);

    public static final native double LocationData_latitude_get(long j, LocationData locationData);

    public static final native void LocationData_latitude_set(long j, LocationData locationData, double d);

    public static final native double LocationData_longitude_get(long j, LocationData locationData);

    public static final native void LocationData_longitude_set(long j, LocationData locationData, double d);

    public static final native String LocationData_processing_method_get(long j, LocationData locationData);

    public static final native void LocationData_processing_method_set(long j, LocationData locationData, String str);

    public static final native long LocationData_timestamp_unix_get(long j, LocationData locationData);

    public static final native void LocationData_timestamp_unix_set(long j, LocationData locationData, long j2);

    public static final native long MakeRandomChromaticAberrationParams();

    public static final native long MakeRandomDenoiseParams();

    public static final native long MakeRandomSharpenParams();

    public static final native long MakeSharpenCurve(float f, float f2, float f3);

    public static final native long MakeTetWaypoint(float f, float f2);

    public static final native void MemoryStateCallback_Run(long j, MemoryStateCallback memoryStateCallback, long j2, long j3);

    public static final native void MemoryStateCallback_change_ownership(MemoryStateCallback memoryStateCallback, long j, boolean z);

    public static final native void MemoryStateCallback_director_connect(MemoryStateCallback memoryStateCallback, long j, boolean z, boolean z2);

    public static final native long NewDeleteInterleavedU16Allocator_Allocate(long j, NewDeleteInterleavedU16Allocator newDeleteInterleavedU16Allocator, int i, int i2, int i3);

    public static final native void NewDeleteInterleavedU16Allocator_Release(long j, NewDeleteInterleavedU16Allocator newDeleteInterleavedU16Allocator, long j2);

    public static final native long NewDeleteInterleavedU16Allocator_SWIGUpcast(long j);

    public static final native long NewDeleteInterleavedU8Allocator_Allocate(long j, NewDeleteInterleavedU8Allocator newDeleteInterleavedU8Allocator, int i, int i2, int i3);

    public static final native void NewDeleteInterleavedU8Allocator_Release(long j, NewDeleteInterleavedU8Allocator newDeleteInterleavedU8Allocator, long j2);

    public static final native long NewDeleteInterleavedU8Allocator_SWIGUpcast(long j);

    public static final native long NewDeleteRawAllocator_Allocate(long j, NewDeleteRawAllocator newDeleteRawAllocator, int i, int i2, int i3);

    public static final native void NewDeleteRawAllocator_Release(long j, NewDeleteRawAllocator newDeleteRawAllocator, long j2);

    public static final native long NewDeleteRawAllocator_SWIGUpcast(long j);

    public static final native long NewDeleteYuvAllocator_Allocate(long j, NewDeleteYuvAllocator newDeleteYuvAllocator, int i, int i2, int i3);

    public static final native void NewDeleteYuvAllocator_Release(long j, NewDeleteYuvAllocator newDeleteYuvAllocator, long j2);

    public static final native long NewDeleteYuvAllocator_SWIGUpcast(long j);

    public static final native float NormalizedRect_AspectRatio(long j, NormalizedRect normalizedRect);

    public static final native boolean NormalizedRect_Check(long j, NormalizedRect normalizedRect);

    public static final native boolean NormalizedRect_DeserializeFromString(long j, NormalizedRect normalizedRect, long j2);

    public static final native boolean NormalizedRect_Equals(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native float NormalizedRect_InverseAspectRatio(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_Print(long j, NormalizedRect normalizedRect, int i, int i2);

    public static final native void NormalizedRect_SerializeToString(long j, NormalizedRect normalizedRect, long j2, int i);

    public static final native float NormalizedRect_height(long j, NormalizedRect normalizedRect);

    public static final native float NormalizedRect_width(long j, NormalizedRect normalizedRect);

    public static final native float NormalizedRect_x0_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_x0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native float NormalizedRect_x1_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_x1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native float NormalizedRect_y0_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_y0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native float NormalizedRect_y1_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_y1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native boolean OisMetadata_Check(long j, OisMetadata oisMetadata);

    public static final native boolean OisMetadata_Equals(long j, OisMetadata oisMetadata, long j2, OisMetadata oisMetadata2);

    public static final native long OisMetadata_ois_positions_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_ois_positions_set(long j, OisMetadata oisMetadata, long j2, OisPositionVector oisPositionVector);

    public static final native long OisMetadata_timestamp_ois_clock_ns_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_timestamp_ois_clock_ns_set(long j, OisMetadata oisMetadata, long j2);

    public static final native void OisPositionVector_add(long j, OisPositionVector oisPositionVector, long j2, OisPosition oisPosition);

    public static final native long OisPositionVector_capacity(long j, OisPositionVector oisPositionVector);

    public static final native void OisPositionVector_clear(long j, OisPositionVector oisPositionVector);

    public static final native long OisPositionVector_get(long j, OisPositionVector oisPositionVector, int i);

    public static final native boolean OisPositionVector_isEmpty(long j, OisPositionVector oisPositionVector);

    public static final native void OisPositionVector_reserve(long j, OisPositionVector oisPositionVector, long j2);

    public static final native void OisPositionVector_set(long j, OisPositionVector oisPositionVector, int i, long j2, OisPosition oisPosition);

    public static final native long OisPositionVector_size(long j, OisPositionVector oisPositionVector);

    public static final native boolean OisPosition_Check(long j, OisPosition oisPosition);

    public static final native boolean OisPosition_Equals(long j, OisPosition oisPosition, long j2, OisPosition oisPosition2);

    public static final native float OisPosition_shift_pixel_x_get(long j, OisPosition oisPosition);

    public static final native void OisPosition_shift_pixel_x_set(long j, OisPosition oisPosition, float f);

    public static final native float OisPosition_shift_pixel_y_get(long j, OisPosition oisPosition);

    public static final native void OisPosition_shift_pixel_y_set(long j, OisPosition oisPosition, float f);

    public static final native long OisPosition_timestamp_ns_get(long j, OisPosition oisPosition);

    public static final native void OisPosition_timestamp_ns_set(long j, OisPosition oisPosition, long j2);

    public static final native boolean PackedImageRaw10_FastCrop(long j, PackedImageRaw10 packedImageRaw10, int i, int i2, int i3, int i4);

    public static final native long PackedImageRaw10_SWIGUpcast(long j);

    public static final native long PackedImageRaw10_packed_image(long j, PackedImageRaw10 packedImageRaw10);

    public static final native boolean PackedImageRaw12_FastCrop(long j, PackedImageRaw12 packedImageRaw12, int i, int i2, int i3, int i4);

    public static final native long PackedImageRaw12_SWIGUpcast(long j);

    public static final native long PackedImageRaw12_packed_image(long j, PackedImageRaw12 packedImageRaw12);

    public static final native boolean PackedReadViewRaw10_Empty(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native boolean PackedReadViewRaw10_FastCrop(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2, int i3, int i4);

    public static final native void PackedReadViewRaw10_Unpack(long j, PackedReadViewRaw10 packedReadViewRaw10, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native void PackedReadViewRaw10_UnpackRow__SWIG_0(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2, int i3, long j2);

    public static final native void PackedReadViewRaw10_UnpackRow__SWIG_1(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, long j2);

    public static final native int PackedReadViewRaw10_at__SWIG_0(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2);

    public static final native int PackedReadViewRaw10_at__SWIG_1(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2, int i3);

    public static final native int PackedReadViewRaw10_height(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native int PackedReadViewRaw10_num_channels(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long PackedReadViewRaw10_packed_read_view(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long PackedReadViewRaw10_sample_array_size(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long PackedReadViewRaw10_sample_iterator(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native int PackedReadViewRaw10_width(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native boolean PackedReadViewRaw12_Empty(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native boolean PackedReadViewRaw12_FastCrop(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2, int i3, int i4);

    public static final native void PackedReadViewRaw12_Unpack(long j, PackedReadViewRaw12 packedReadViewRaw12, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native void PackedReadViewRaw12_UnpackRow__SWIG_0(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2, int i3, long j2);

    public static final native void PackedReadViewRaw12_UnpackRow__SWIG_1(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, long j2);

    public static final native int PackedReadViewRaw12_at__SWIG_0(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2);

    public static final native int PackedReadViewRaw12_at__SWIG_1(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2, int i3);

    public static final native int PackedReadViewRaw12_height(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native int PackedReadViewRaw12_num_channels(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long PackedReadViewRaw12_packed_read_view(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long PackedReadViewRaw12_sample_array_size(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long PackedReadViewRaw12_sample_iterator(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native int PackedReadViewRaw12_width(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native boolean PackedReadWriteViewRaw10_FastCrop(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, int i2, int i3, int i4);

    public static final native long PackedReadWriteViewRaw10_SWIGUpcast(long j);

    public static final native long PackedReadWriteViewRaw10_packed_write_view(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10);

    public static final native void PackedReadWriteViewRaw10_set_pixel(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, int i2, int i3);

    public static final native void PackedReadWriteViewRaw10_set_row__SWIG_0(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, int i2, int i3, long j2);

    public static final native void PackedReadWriteViewRaw10_set_row__SWIG_1(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, long j2);

    public static final native boolean PackedReadWriteViewRaw12_FastCrop(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, int i2, int i3, int i4);

    public static final native long PackedReadWriteViewRaw12_SWIGUpcast(long j);

    public static final native long PackedReadWriteViewRaw12_packed_write_view(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12);

    public static final native void PackedReadWriteViewRaw12_set_pixel(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, int i2, int i3);

    public static final native void PackedReadWriteViewRaw12_set_row__SWIG_0(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, int i2, int i3, long j2);

    public static final native void PackedReadWriteViewRaw12_set_row__SWIG_1(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, long j2);

    public static final native void PdImageCallback_ImageReady(long j, PdImageCallback pdImageCallback, int i, long j2, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native void PdImageCallback_MergePdFailed(long j, PdImageCallback pdImageCallback, int i);

    public static final native void PdImageCallback_change_ownership(PdImageCallback pdImageCallback, long j, boolean z);

    public static final native void PdImageCallback_director_connect(PdImageCallback pdImageCallback, long j, boolean z, boolean z2);

    public static final native long PixelRectToFaceInfo__SWIG_0(long j, PixelRect pixelRect, float f, int i, int i2, int i3);

    public static final native long PixelRectToFaceInfo__SWIG_1(long j, PixelRect pixelRect, float f, int i, int i2);

    public static final native void PixelRectVector_add(long j, PixelRectVector pixelRectVector, long j2, PixelRect pixelRect);

    public static final native long PixelRectVector_capacity(long j, PixelRectVector pixelRectVector);

    public static final native void PixelRectVector_clear(long j, PixelRectVector pixelRectVector);

    public static final native long PixelRectVector_get(long j, PixelRectVector pixelRectVector, int i);

    public static final native boolean PixelRectVector_isEmpty(long j, PixelRectVector pixelRectVector);

    public static final native void PixelRectVector_reserve(long j, PixelRectVector pixelRectVector, long j2);

    public static final native void PixelRectVector_set(long j, PixelRectVector pixelRectVector, int i, long j2, PixelRect pixelRect);

    public static final native long PixelRectVector_size(long j, PixelRectVector pixelRectVector);

    public static final native float PixelRect_AspectRatio(long j, PixelRect pixelRect);

    public static final native boolean PixelRect_Check(long j, PixelRect pixelRect);

    public static final native boolean PixelRect_DeserializeFromString(long j, PixelRect pixelRect, long j2);

    public static final native boolean PixelRect_Equals(long j, PixelRect pixelRect, long j2, PixelRect pixelRect2);

    public static final native void PixelRect_Inflate(long j, PixelRect pixelRect, int i, int i2);

    public static final native float PixelRect_InverseAspectRatio(long j, PixelRect pixelRect);

    public static final native boolean PixelRect_IsEmpty(long j, PixelRect pixelRect);

    public static final native void PixelRect_Print(long j, PixelRect pixelRect, int i, int i2);

    public static final native void PixelRect_ScaleBy(long j, PixelRect pixelRect, float f);

    public static final native void PixelRect_SerializeToString(long j, PixelRect pixelRect, long j2, int i);

    public static final native int PixelRect_height(long j, PixelRect pixelRect);

    public static final native int PixelRect_width(long j, PixelRect pixelRect);

    public static final native int PixelRect_x0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_x1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x1_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y1_set(long j, PixelRect pixelRect, int i);

    public static final native void PlanarRawImageCallback_ImageReady(long j, PlanarRawImageCallback planarRawImageCallback, int i, long j2, ExifMetadata exifMetadata, long j3);

    public static final native void PostviewCallback_RgbReady(long j, PostviewCallback postviewCallback, int i, long j2, InterleavedReadViewU8 interleavedReadViewU8, int i2);

    public static final native void PostviewCallback_YuvReady(long j, PostviewCallback postviewCallback, int i, long j2, YuvReadView yuvReadView, int i2);

    public static final native void PostviewCallback_change_ownership(PostviewCallback postviewCallback, long j, boolean z);

    public static final native void PostviewCallback_director_connect(PostviewCallback postviewCallback, long j, boolean z, boolean z2);

    public static final native int PostviewParams_pixel_format_get(long j, PostviewParams postviewParams);

    public static final native void PostviewParams_pixel_format_set(long j, PostviewParams postviewParams, int i);

    public static final native int PostviewParams_target_height_get(long j, PostviewParams postviewParams);

    public static final native void PostviewParams_target_height_set(long j, PostviewParams postviewParams, int i);

    public static final native int PostviewParams_target_width_get(long j, PostviewParams postviewParams);

    public static final native void PostviewParams_target_width_set(long j, PostviewParams postviewParams, int i);

    public static final native void PrintColorTemps(long j);

    public static final native void ProgressCallback_Run(long j, ProgressCallback progressCallback, int i, float f);

    public static final native void ProgressCallback_change_ownership(ProgressCallback progressCallback, long j, boolean z);

    public static final native void ProgressCallback_director_connect(ProgressCallback progressCallback, long j, boolean z, boolean z2);

    public static final native boolean QcColorCalibration_DeserializeFromString(long j, QcColorCalibration qcColorCalibration, long j2);

    public static final native boolean QcColorCalibration_Equals(long j, QcColorCalibration qcColorCalibration, long j2, QcColorCalibration qcColorCalibration2);

    public static final native float QcColorCalibration_IlluminantData_bg_ratio_get(long j, IlluminantData illuminantData);

    public static final native void QcColorCalibration_IlluminantData_bg_ratio_set(long j, IlluminantData illuminantData, float f);

    public static final native float QcColorCalibration_IlluminantData_rg_ratio_get(long j, IlluminantData illuminantData);

    public static final native void QcColorCalibration_IlluminantData_rg_ratio_set(long j, IlluminantData illuminantData, float f);

    public static final native void QcColorCalibration_SerializeToString(long j, QcColorCalibration qcColorCalibration, long j2, int i);

    public static final native float QcColorCalibration_grgb_ratio_get(long j, QcColorCalibration qcColorCalibration);

    public static final native void QcColorCalibration_grgb_ratio_set(long j, QcColorCalibration qcColorCalibration, float f);

    public static final native long QcColorCalibration_illuminant_data_get(long j, QcColorCalibration qcColorCalibration);

    public static final native void QcColorCalibration_illuminant_data_set(long j, QcColorCalibration qcColorCalibration, long j2, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_add(long j, QcIlluminantVector qcIlluminantVector, long j2, IlluminantData illuminantData);

    public static final native long QcIlluminantVector_capacity(long j, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_clear(long j, QcIlluminantVector qcIlluminantVector);

    public static final native long QcIlluminantVector_get(long j, QcIlluminantVector qcIlluminantVector, int i);

    public static final native boolean QcIlluminantVector_isEmpty(long j, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_reserve(long j, QcIlluminantVector qcIlluminantVector, long j2);

    public static final native void QcIlluminantVector_set(long j, QcIlluminantVector qcIlluminantVector, int i, long j2, IlluminantData illuminantData);

    public static final native long QcIlluminantVector_size(long j, QcIlluminantVector qcIlluminantVector);

    public static final native long RawAllocation_id_get(long j, RawAllocation rawAllocation);

    public static final native void RawAllocation_id_set(long j, RawAllocation rawAllocation, long j2);

    public static final native long RawAllocation_view_get(long j, RawAllocation rawAllocation);

    public static final native void RawAllocation_view_set(long j, RawAllocation rawAllocation, long j2, RawWriteView rawWriteView);

    public static final native long RawFinishParams_arc_flare_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_arc_flare_set(long j, RawFinishParams rawFinishParams, long j2, ArcFlareParam arcFlareParam);

    public static final native long RawFinishParams_chromatic_aberration_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_chromatic_aberration_set(long j, RawFinishParams rawFinishParams, long j2, ChromaticAberrationParams chromaticAberrationParams);

    public static final native long RawFinishParams_denoise_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_denoise_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native int RawFinishParams_geometric_correction_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_geometric_correction_set(long j, RawFinishParams rawFinishParams, int i);

    public static final native float RawFinishParams_green_imbalance_factor_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_green_imbalance_factor_set(long j, RawFinishParams rawFinishParams, float f);

    public static final native int RawFinishParams_icc_output_profile_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_icc_output_profile_set(long j, RawFinishParams rawFinishParams, int i);

    public static final native float RawFinishParams_max_black_level_offset_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_max_black_level_offset_set(long j, RawFinishParams rawFinishParams, float f);

    public static final native int RawFinishParams_max_synthetic_exposures_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_max_synthetic_exposures_set(long j, RawFinishParams rawFinishParams, int i);

    public static final native long RawFinishParams_post_zoom_sharpen_strength_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_post_zoom_sharpen_strength_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native int RawFinishParams_resampling_method_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_resampling_method_set(long j, RawFinishParams rawFinishParams, int i);

    public static final native long RawFinishParams_rgb_map_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_rgb_map_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_saturation_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_saturation_set(long j, RawFinishParams rawFinishParams, long j2, ColorSatParams colorSatParams);

    public static final native long RawFinishParams_sharpen_params_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_sharpen_params_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_zoom_finest_scale_denoise_attenuation_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_zoom_finest_scale_denoise_attenuation_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native long RawFinishParams_zoom_sharpen_attenuation_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_zoom_sharpen_attenuation_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native long RawFinishPreview__SWIG_0(String str, long j, RawReadView rawReadView, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, StaticMetadata staticMetadata, long j5, NormalizedRect normalizedRect, int i, int i2, int i3, long j6, Tuning tuning, float f, float f2, long j7, long j8);

    public static final native long RawFinishPreview__SWIG_1(long j, RawReadView rawReadView, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, StaticMetadata staticMetadata, long j5, NormalizedRect normalizedRect, int i, int i2, int i3, long j6, NormalizedRect normalizedRect2, long j7, WeightedNormalizedRectVector weightedNormalizedRectVector, float f);

    public static final native void RawImageCallback_ImageReady(long j, RawImageCallback rawImageCallback, int i, long j2, ExifMetadata exifMetadata, long j3, RawImage rawImage);

    public static final native void RawImageCallback_change_ownership(RawImageCallback rawImageCallback, long j, boolean z);

    public static final native void RawImageCallback_director_connect(RawImageCallback rawImageCallback, long j, boolean z, boolean z2);

    public static final native void RawImage_FastCrop(long j, RawImage rawImage, int i, int i2, int i3, int i4);

    public static final native long RawImage_SWIGUpcast(long j);

    public static final native long RawImage_packed10_image(long j, RawImage rawImage);

    public static final native long RawImage_packed12_image(long j, RawImage rawImage);

    public static final native long RawImage_unpacked_image(long j, RawImage rawImage);

    public static final native long RawMergeParams_align_tile_size_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_align_tile_size_set(long j, RawMergeParams rawMergeParams, long j2);

    public static final native long RawMergeParams_merge_tile_size_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_merge_tile_size_set(long j, RawMergeParams rawMergeParams, long j2);

    public static final native long RawMergeParams_spatial_strength_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_spatial_strength_set(long j, RawMergeParams rawMergeParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native long RawMergeParams_temporal_strength_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_temporal_strength_set(long j, RawMergeParams rawMergeParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native int RawReadView_BitsPerPixel(long j, RawReadView rawReadView);

    public static final native boolean RawReadView_Empty(long j, RawReadView rawReadView);

    public static final native void RawReadView_FastCrop(long j, RawReadView rawReadView, int i, int i2, int i3, int i4);

    public static final native long RawReadView_GetRow__SWIG_0(long j, RawReadView rawReadView, int i, int i2, int i3, long j2);

    public static final native long RawReadView_GetRow__SWIG_1(long j, RawReadView rawReadView, int i, long j2);

    public static final native int RawReadView_at(long j, RawReadView rawReadView, int i, int i2);

    public static final native int RawReadView_height(long j, RawReadView rawReadView);

    public static final native int RawReadView_layout(long j, RawReadView rawReadView);

    public static final native long RawReadView_packed10_read_view(long j, RawReadView rawReadView);

    public static final native long RawReadView_packed12_read_view(long j, RawReadView rawReadView);

    public static final native long RawReadView_sample_array_size(long j, RawReadView rawReadView);

    public static final native long RawReadView_unpacked_read_view(long j, RawReadView rawReadView);

    public static final native int RawReadView_width(long j, RawReadView rawReadView);

    public static final native float RawSharpenParams_Point_x_get(long j, Point point);

    public static final native void RawSharpenParams_Point_x_set(long j, Point point, float f);

    public static final native float RawSharpenParams_Point_y_get(long j, Point point);

    public static final native void RawSharpenParams_Point_y_set(long j, Point point, float f);

    public static final native long RawSharpenParams_curves_get(long j, RawSharpenParams rawSharpenParams);

    public static final native void RawSharpenParams_curves_set(long j, RawSharpenParams rawSharpenParams, long j2);

    public static final native boolean RawVignetteParams_IsIdentity(long j, RawVignetteParams rawVignetteParams);

    public static final native float RawVignetteParams_falloff_exponent_get(long j, RawVignetteParams rawVignetteParams);

    public static final native void RawVignetteParams_falloff_exponent_set(long j, RawVignetteParams rawVignetteParams, float f);

    public static final native float RawVignetteParams_scale_at_corner_get(long j, RawVignetteParams rawVignetteParams);

    public static final native void RawVignetteParams_scale_at_corner_set(long j, RawVignetteParams rawVignetteParams, float f);

    public static final native void RawWriteView_FastCrop(long j, RawWriteView rawWriteView, int i, int i2, int i3, int i4);

    public static final native long RawWriteView_SWIGUpcast(long j);

    public static final native void RawWriteView_SetRow__SWIG_0(long j, RawWriteView rawWriteView, int i, int i2, int i3, long j2);

    public static final native void RawWriteView_SetRow__SWIG_1(long j, RawWriteView rawWriteView, int i, long j2);

    public static final native long RawWriteView_packed10_write_view(long j, RawWriteView rawWriteView);

    public static final native long RawWriteView_packed12_write_view(long j, RawWriteView rawWriteView);

    public static final native long RawWriteView_unpacked_write_view(long j, RawWriteView rawWriteView);

    public static final native boolean ReadDngMetadata(String str, long j, ExifMetadata exifMetadata);

    public static final native boolean ReadDngMetadataFromMemory(long j, long j2, long j3, ExifMetadata exifMetadata);

    public static final native int ReverseRotation(int i);

    public static final native void RggbPositions(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    public static final native void RotateCoordinates(int i, int i2, int i3, int i4, int i5, long j, long j2);

    public static final native void RotateNormalizedCoordinates(float f, float f2, int i, long j, long j2);

    public static final native float RowPattern_amplitude_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_amplitude_set(long j, RowPattern rowPattern, float f);

    public static final native long RowPattern_filter_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_filter_set(long j, RowPattern rowPattern, long j2);

    public static final native float RowPattern_gain_at_period_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_gain_at_period_set(long j, RowPattern rowPattern, float f);

    public static final native float RowPattern_period_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_period_set(long j, RowPattern rowPattern, float f);

    public static final native float SecondOrderFilter_a1_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_a1_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_a2_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_a2_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_b0_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_b0_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_b1_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_b1_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_b2_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_b2_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native boolean SensorNoiseModel_Check(long j, SensorNoiseModel sensorNoiseModel);

    public static final native long SensorNoiseModel_DngNoiseModelForGain(long j, SensorNoiseModel sensorNoiseModel, float f, float f2);

    public static final native float SensorNoiseModel_offset_a_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_offset_a_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native float SensorNoiseModel_offset_b_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_offset_b_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native float SensorNoiseModel_scale_a_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_scale_a_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native float SensorNoiseModel_scale_b_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_scale_b_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native boolean SensorRowArtifacts_IsEmpty(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native long SensorRowArtifacts_NoiseVariancesForGain(long j, SensorRowArtifacts sensorRowArtifacts, float f, float f2, float f3, float f4);

    public static final native long SensorRowArtifacts_PatternsForGain(long j, SensorRowArtifacts sensorRowArtifacts, float f, float f2, float f3, float f4);

    public static final native long SensorRowArtifacts_noise_offset_get(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native void SensorRowArtifacts_noise_offset_set(long j, SensorRowArtifacts sensorRowArtifacts, long j2, FloatVector floatVector);

    public static final native long SensorRowArtifacts_patterns_post_analog_gain_get(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native void SensorRowArtifacts_patterns_post_analog_gain_set(long j, SensorRowArtifacts sensorRowArtifacts, long j2);

    public static final native long SensorRowArtifacts_patterns_pre_analog_gain_get(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native void SensorRowArtifacts_patterns_pre_analog_gain_set(long j, SensorRowArtifacts sensorRowArtifacts, long j2);

    public static final native void SerializeBurstMetadata(long j, long j2, int i);

    public static final native long ShotCallbacks_base_frame_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_base_frame_callback_set(long j, ShotCallbacks shotCallbacks, long j2, BaseFrameCallback baseFrameCallback);

    public static final native long ShotCallbacks_final_image_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_callback_set(long j, ShotCallbacks shotCallbacks, long j2, FinalImageCallback finalImageCallback);

    public static final native long ShotCallbacks_final_image_rgb_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_rgb_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long ShotCallbacks_final_image_yuv_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_yuv_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientYuvAllocator clientYuvAllocator);

    public static final native long ShotCallbacks_jpeg_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_jpeg_callback_set(long j, ShotCallbacks shotCallbacks, long j2, EncodedBlobCallback encodedBlobCallback);

    public static final native long ShotCallbacks_merged_dng_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_dng_callback_set(long j, ShotCallbacks shotCallbacks, long j2, EncodedBlobCallback encodedBlobCallback);

    public static final native long ShotCallbacks_merged_pd_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_pd_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU16Allocator clientInterleavedU16Allocator);

    public static final native long ShotCallbacks_merged_pd_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_pd_callback_set(long j, ShotCallbacks shotCallbacks, long j2, PdImageCallback pdImageCallback);

    public static final native long ShotCallbacks_merged_raw_image_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_raw_image_callback_set(long j, ShotCallbacks shotCallbacks, long j2, RawImageCallback rawImageCallback);

    public static final native long ShotCallbacks_mutable_merged_raw_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_mutable_merged_raw_callback_set(long j, ShotCallbacks shotCallbacks, long j2, PlanarRawImageCallback planarRawImageCallback);

    public static final native long ShotCallbacks_postview_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_postview_callback_set(long j, ShotCallbacks shotCallbacks, long j2, PostviewCallback postviewCallback);

    public static final native long ShotCallbacks_postview_rgb_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_postview_rgb_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long ShotCallbacks_postview_yuv_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_postview_yuv_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientYuvAllocator clientYuvAllocator);

    public static final native long ShotCallbacks_progress_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_progress_callback_set(long j, ShotCallbacks shotCallbacks, long j2, ProgressCallback progressCallback);

    public static final native long ShotCallbacks_status_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_status_callback_set(long j, ShotCallbacks shotCallbacks, long j2, ShotStatusCallback shotStatusCallback);

    public static final native boolean ShotLogData_Check(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_Clear(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_Print(long j, ShotLogData shotLogData, int i);

    public static final native void ShotLogData_SerializeToString(long j, ShotLogData shotLogData, long j2);

    public static final native boolean ShotLogData_aborted_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_aborted_set(long j, ShotLogData shotLogData, boolean z);

    public static final native float ShotLogData_actual_range_compression_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_actual_range_compression_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ae_confidence_long_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ae_confidence_long_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ae_confidence_short_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ae_confidence_short_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ae_confidence_single_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ae_confidence_single_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_base_frame_index_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_base_frame_index_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_capture_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_capture_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_cpu_usage_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_cpu_usage_factor_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_executed_finish_on_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_executed_finish_on_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_final_image_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_final_image_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native long ShotLogData_final_payload_frame_sharpness_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_final_payload_frame_sharpness_set(long j, ShotLogData shotLogData, long j2, FloatVector floatVector);

    public static final native float ShotLogData_finish_process_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_finish_process_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ideal_range_compression_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ideal_range_compression_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_jpeg_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_jpeg_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_jpeg_encode_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_jpeg_encode_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_log_scene_brightness_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_log_scene_brightness_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_long_exp_adjustment_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_long_exp_adjustment_factor_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_merge_process_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_merge_process_time_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_merged_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_merged_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_merged_raw_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_merged_raw_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_metering_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_metering_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native int ShotLogData_original_payload_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_original_payload_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native long ShotLogData_original_payload_frame_sharpness_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_original_payload_frame_sharpness_set(long j, ShotLogData shotLogData, long j2, FloatVector floatVector);

    public static final native float ShotLogData_postview_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_postview_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_pure_fraction_of_pixels_from_long_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_pure_fraction_of_pixels_from_long_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_short_exp_adjustment_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_short_exp_adjustment_factor_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_time_to_postview_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_time_to_postview_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_time_to_shot_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_time_to_shot_set(long j, ShotLogData shotLogData, float f);

    public static final native long ShotLogData_was_payload_frame_merged_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_was_payload_frame_merged_set(long j, ShotLogData shotLogData, long j2, BoolVector boolVector);

    public static final native float ShotLogData_weighted_fraction_of_pixels_from_long_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_weighted_fraction_of_pixels_from_long_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native boolean ShotLogData_zsl_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_zsl_set(long j, ShotLogData shotLogData, boolean z);

    public static final native boolean ShotParams_Check(long j, ShotParams shotParams, long j2, InitParams initParams, long j3, StaticMetadata staticMetadata);

    public static final native boolean ShotParams_DeserializeFromString__SWIG_0(long j, ShotParams shotParams, long j2);

    public static final native boolean ShotParams_DeserializeFromString__SWIG_1(long j, ShotParams shotParams, String str);

    public static final native boolean ShotParams_Equals(long j, ShotParams shotParams, long j2, ShotParams shotParams2);

    public static final native void ShotParams_Print(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_SerializeToString(long j, ShotParams shotParams, long j2);

    public static final native long ShotParams_ae_get(long j, ShotParams shotParams);

    public static final native void ShotParams_ae_set(long j, ShotParams shotParams, long j2, AeShotParams aeShotParams);

    public static final native boolean ShotParams_allow_base_frame_reuse_get(long j, ShotParams shotParams);

    public static final native void ShotParams_allow_base_frame_reuse_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_allow_temporal_binning_get(long j, ShotParams shotParams);

    public static final native void ShotParams_allow_temporal_binning_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_base_frame_override_index_get(long j, ShotParams shotParams);

    public static final native void ShotParams_base_frame_override_index_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_compress_merged_dng_get(long j, ShotParams shotParams);

    public static final native void ShotParams_compress_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_cull_metering_frames_using_previous_viewfinder_get(long j, ShotParams shotParams);

    public static final native void ShotParams_cull_metering_frames_using_previous_viewfinder_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_final_jpg_quality_get(long j, ShotParams shotParams);

    public static final native void ShotParams_final_jpg_quality_set(long j, ShotParams shotParams, int i);

    public static final native int ShotParams_flash_mode_get(long j, ShotParams shotParams);

    public static final native void ShotParams_flash_mode_set(long j, ShotParams shotParams, int i);

    public static final native long ShotParams_force_wb_get(long j, ShotParams shotParams);

    public static final native void ShotParams_force_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native int ShotParams_full_metering_sweep_frame_count_get(long j, ShotParams shotParams);

    public static final native void ShotParams_full_metering_sweep_frame_count_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_generate_jpg_thumbnail_get(long j, ShotParams shotParams);

    public static final native void ShotParams_generate_jpg_thumbnail_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_icc_output_profile_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_icc_output_profile_override_set(long j, ShotParams shotParams, int i);

    public static final native int ShotParams_image_rotation_get(long j, ShotParams shotParams);

    public static final native void ShotParams_image_rotation_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_manually_rotate_final_jpg_get(long j, ShotParams shotParams);

    public static final native void ShotParams_manually_rotate_final_jpg_set(long j, ShotParams shotParams, boolean z);

    public static final native float ShotParams_metering_frame_brightness_boost_get(long j, ShotParams shotParams);

    public static final native void ShotParams_metering_frame_brightness_boost_set(long j, ShotParams shotParams, float f);

    public static final native float ShotParams_previous_viewfinder_tet_get(long j, ShotParams shotParams);

    public static final native void ShotParams_previous_viewfinder_tet_set(long j, ShotParams shotParams, float f);

    public static final native long ShotParams_previous_viewfinder_wb_get(long j, ShotParams shotParams);

    public static final native void ShotParams_previous_viewfinder_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native int ShotParams_raw_cropping_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_raw_cropping_override_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_recompute_wb_on_base_frame_get(long j, ShotParams shotParams);

    public static final native void ShotParams_recompute_wb_on_base_frame_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_resampling_method_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_resampling_method_override_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_save_merged_dng_get(long j, ShotParams shotParams);

    public static final native void ShotParams_save_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native String ShotParams_software_suffix_get(long j, ShotParams shotParams);

    public static final native void ShotParams_software_suffix_set(long j, ShotParams shotParams, String str);

    public static final native int ShotParams_wb_mode_get(long j, ShotParams shotParams);

    public static final native void ShotParams_wb_mode_set(long j, ShotParams shotParams, int i);

    public static final native int ShotParams_zsl_base_frame_index_hint_get(long j, ShotParams shotParams);

    public static final native void ShotParams_zsl_base_frame_index_hint_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_zsl_get(long j, ShotParams shotParams);

    public static final native void ShotParams_zsl_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotStatusCallback_OnAbort(long j, ShotStatusCallback shotStatusCallback, int i);

    public static final native void ShotStatusCallback_OnComplete(long j, ShotStatusCallback shotStatusCallback, int i, long j2, ShotLogData shotLogData);

    public static final native void ShotStatusCallback_OnError(long j, ShotStatusCallback shotStatusCallback, int i, String str);

    public static final native void ShotStatusCallback_change_ownership(ShotStatusCallback shotStatusCallback, long j, boolean z);

    public static final native void ShotStatusCallback_director_connect(ShotStatusCallback shotStatusCallback, long j, boolean z, boolean z2);

    public static final native boolean ShouldCropBeforeMerge(int i);

    public static final native void SimpleCallback_Run(long j, SimpleCallback simpleCallback);

    public static final native void SimpleCallback_change_ownership(SimpleCallback simpleCallback, long j, boolean z);

    public static final native void SimpleCallback_director_connect(SimpleCallback simpleCallback, long j, boolean z, boolean z2);

    public static final native boolean SpatialGainMap_Check(long j, SpatialGainMap spatialGainMap, long j2);

    public static final native long SpatialGainMap_CreateFromBuffer(long j);

    public static final native long SpatialGainMap_CreateFromFile(String str);

    public static final native boolean SpatialGainMap_Empty(long j, SpatialGainMap spatialGainMap);

    public static final native void SpatialGainMap_ForceScaleBy(long j, SpatialGainMap spatialGainMap, long j2, SpatialGainMap spatialGainMap2);

    public static final native float SpatialGainMap_InterpolatedReadRgb(long j, SpatialGainMap spatialGainMap, float f, float f2, int i);

    public static final native float SpatialGainMap_InterpolatedReadRggb(long j, SpatialGainMap spatialGainMap, float f, float f2, int i);

    public static final native void SpatialGainMap_Print(long j, SpatialGainMap spatialGainMap);

    public static final native float SpatialGainMap_ReadRgb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3);

    public static final native float SpatialGainMap_ReadRggb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3);

    public static final native long SpatialGainMap_ResizeAndCrop(long j, SpatialGainMap spatialGainMap, int i, int i2, long j2, NormalizedRect normalizedRect);

    public static final native void SpatialGainMap_ScaleBy(long j, SpatialGainMap spatialGainMap, long j2, SpatialGainMap spatialGainMap2);

    public static final native long SpatialGainMap_SerializeToBuffer(long j, SpatialGainMap spatialGainMap);

    public static final native void SpatialGainMap_WriteRggb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3, float f);

    public static final native long SpatialGainMap_gain_map(long j, SpatialGainMap spatialGainMap);

    public static final native boolean SpatialGainMap_has_extra_vignetting_applied(long j, SpatialGainMap spatialGainMap);

    public static final native int SpatialGainMap_height(long j, SpatialGainMap spatialGainMap);

    public static final native boolean SpatialGainMap_is_precise(long j, SpatialGainMap spatialGainMap);

    public static final native int SpatialGainMap_num_channels(long j, SpatialGainMap spatialGainMap);

    public static final native int SpatialGainMap_width(long j, SpatialGainMap spatialGainMap);

    public static final native void StaticMetadataVector_add(long j, StaticMetadataVector staticMetadataVector, long j2, StaticMetadata staticMetadata);

    public static final native long StaticMetadataVector_capacity(long j, StaticMetadataVector staticMetadataVector);

    public static final native void StaticMetadataVector_clear(long j, StaticMetadataVector staticMetadataVector);

    public static final native long StaticMetadataVector_get(long j, StaticMetadataVector staticMetadataVector, int i);

    public static final native boolean StaticMetadataVector_isEmpty(long j, StaticMetadataVector staticMetadataVector);

    public static final native void StaticMetadataVector_reserve(long j, StaticMetadataVector staticMetadataVector, long j2);

    public static final native void StaticMetadataVector_set(long j, StaticMetadataVector staticMetadataVector, int i, long j2, StaticMetadata staticMetadata);

    public static final native long StaticMetadataVector_size(long j, StaticMetadataVector staticMetadataVector);

    public static final native boolean StaticMetadata_Check(long j, StaticMetadata staticMetadata, boolean z, long j2);

    public static final native void StaticMetadata_Clear(long j, StaticMetadata staticMetadata);

    public static final native boolean StaticMetadata_DeserializeFromString__SWIG_0(long j, StaticMetadata staticMetadata, long j2);

    public static final native boolean StaticMetadata_DeserializeFromString__SWIG_1(long j, StaticMetadata staticMetadata, String str);

    public static final native boolean StaticMetadata_Equals(long j, StaticMetadata staticMetadata, long j2, StaticMetadata staticMetadata2);

    public static final native float StaticMetadata_GetMaxAnalogGain(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_Print(long j, StaticMetadata staticMetadata, int i, int i2);

    public static final native void StaticMetadata_SerializeToString(long j, StaticMetadata staticMetadata, long j2, int i);

    public static final native long StaticMetadata_active_area_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_active_area_set(long j, StaticMetadata staticMetadata, long j2, PixelRect pixelRect);

    public static final native long StaticMetadata_available_f_numbers_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_available_f_numbers_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native long StaticMetadata_available_focal_lengths_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_available_focal_lengths_mm_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native int StaticMetadata_bayer_pattern_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_bayer_pattern_set(long j, StaticMetadata staticMetadata, int i);

    public static final native float[] StaticMetadata_black_levels_bayer_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_black_levels_bayer_set(long j, StaticMetadata staticMetadata, float[] fArr);

    public static final native String StaticMetadata_device_get(long j, StaticMetadata staticMetadata);

    public static final native String StaticMetadata_device_os_version_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_device_os_version_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_device_set(long j, StaticMetadata staticMetadata, String str);

    public static final native long StaticMetadata_dng_color_calibration_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_dng_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native int StaticMetadata_frame_raw_max_height_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_raw_max_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_frame_raw_max_width_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_raw_max_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native float StaticMetadata_frame_readout_time_ms_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_readout_time_ms_set(long j, StaticMetadata staticMetadata, float f);

    public static final native boolean StaticMetadata_has_flash_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_has_flash_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native int[] StaticMetadata_iso_range_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_iso_range_set(long j, StaticMetadata staticMetadata, int[] iArr);

    public static final native String StaticMetadata_make_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_make_set(long j, StaticMetadata staticMetadata, String str);

    public static final native int StaticMetadata_max_analog_iso_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_max_analog_iso_set(long j, StaticMetadata staticMetadata, int i);

    public static final native String StaticMetadata_model_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_model_set(long j, StaticMetadata staticMetadata, String str);

    public static final native long StaticMetadata_optically_black_regions_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_optically_black_regions_set(long j, StaticMetadata staticMetadata, long j2, PixelRectVector pixelRectVector);

    public static final native int StaticMetadata_pixel_array_height_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_pixel_array_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_pixel_array_width_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_pixel_array_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native long StaticMetadata_qc_color_calibration_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_qc_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, QcColorCalibration qcColorCalibration);

    public static final native int StaticMetadata_raw_bits_per_pixel_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_raw_bits_per_pixel_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_sensor_id_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_id_set(long j, StaticMetadata staticMetadata, int i);

    public static final native float StaticMetadata_sensor_physical_height_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_physical_height_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native float StaticMetadata_sensor_physical_width_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_physical_width_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native String StaticMetadata_software_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_software_set(long j, StaticMetadata staticMetadata, String str);

    public static final native int StaticMetadata_white_level_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_white_level_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StringVector_add(long j, StringVector stringVector, String str);

    public static final native long StringVector_capacity(long j, StringVector stringVector);

    public static final native void StringVector_clear(long j, StringVector stringVector);

    public static final native String StringVector_get(long j, StringVector stringVector, int i);

    public static final native boolean StringVector_isEmpty(long j, StringVector stringVector);

    public static final native void StringVector_reserve(long j, StringVector stringVector, long j2);

    public static final native void StringVector_set(long j, StringVector stringVector, int i, String str);

    public static final native long StringVector_size(long j, StringVector stringVector);

    public static final native void SuppressRowArtifacts__SWIG_0(long j, FloatVector floatVector, long j2, int i, long j3, long j4, long j5, RawWriteView rawWriteView);

    public static final native void SuppressRowArtifacts__SWIG_1(long j, FloatVector floatVector, int i, long j2, long j3, long j4, RawWriteView rawWriteView);

    public static final native void SuppressRowArtifacts__SWIG_2(long j, int i, long j2, long j3, long j4, RawWriteView rawWriteView);

    public static final native float TetAwbPair_first_get(long j, TetAwbPair tetAwbPair);

    public static final native void TetAwbPair_first_set(long j, TetAwbPair tetAwbPair, float f);

    public static final native long TetAwbPair_second_get(long j, TetAwbPair tetAwbPair);

    public static final native void TetAwbPair_second_set(long j, TetAwbPair tetAwbPair, long j2, AwbInfo awbInfo);

    public static final native float TetFactorization_analog_gain_get(long j, TetFactorization tetFactorization);

    public static final native void TetFactorization_analog_gain_set(long j, TetFactorization tetFactorization, float f);

    public static final native float TetFactorization_digital_gain_get(long j, TetFactorization tetFactorization);

    public static final native void TetFactorization_digital_gain_set(long j, TetFactorization tetFactorization, float f);

    public static final native float TetFactorization_exposure_time_ms_get(long j, TetFactorization tetFactorization);

    public static final native void TetFactorization_exposure_time_ms_set(long j, TetFactorization tetFactorization, float f);

    public static final native void TetModel_AddTetWaypoint(long j, TetModel tetModel, float f, float f2);

    public static final native boolean TetModel_Check(long j, TetModel tetModel);

    public static final native void TetModel_Clear(long j, TetModel tetModel);

    public static final native boolean TetModel_DeserializeFromString(long j, TetModel tetModel, long j2);

    public static final native boolean TetModel_Equals(long j, TetModel tetModel, long j2, TetModel tetModel2);

    public static final native void TetModel_Print(long j, TetModel tetModel, int i, int i2);

    public static final native void TetModel_SerializeToString(long j, TetModel tetModel, long j2, int i);

    public static final native int TetModel_count_get(long j, TetModel tetModel);

    public static final native void TetModel_count_set(long j, TetModel tetModel, int i);

    public static final native long TetModel_model_get(long j, TetModel tetModel);

    public static final native void TetModel_model_set(long j, TetModel tetModel, long j2, TetWaypoint tetWaypoint);

    public static final native void TetToAwb_add(long j, TetToAwb tetToAwb, long j2, TetAwbPair tetAwbPair);

    public static final native long TetToAwb_capacity(long j, TetToAwb tetToAwb);

    public static final native void TetToAwb_clear(long j, TetToAwb tetToAwb);

    public static final native long TetToAwb_get(long j, TetToAwb tetToAwb, int i);

    public static final native boolean TetToAwb_isEmpty(long j, TetToAwb tetToAwb);

    public static final native void TetToAwb_reserve(long j, TetToAwb tetToAwb, long j2);

    public static final native void TetToAwb_set(long j, TetToAwb tetToAwb, int i, long j2, TetAwbPair tetAwbPair);

    public static final native long TetToAwb_size(long j, TetToAwb tetToAwb);

    public static final native boolean TetWaypoint_DeserializeFromString(long j, TetWaypoint tetWaypoint, long j2);

    public static final native boolean TetWaypoint_Equals(long j, TetWaypoint tetWaypoint, long j2, TetWaypoint tetWaypoint2);

    public static final native void TetWaypoint_Print(long j, TetWaypoint tetWaypoint, int i, int i2);

    public static final native void TetWaypoint_SerializeToString(long j, TetWaypoint tetWaypoint, long j2, int i);

    public static final native float TetWaypoint_exposure_time_ms_get(long j, TetWaypoint tetWaypoint);

    public static final native void TetWaypoint_exposure_time_ms_set(long j, TetWaypoint tetWaypoint, float f);

    public static final native float TetWaypoint_overall_gain_get(long j, TetWaypoint tetWaypoint);

    public static final native void TetWaypoint_overall_gain_set(long j, TetWaypoint tetWaypoint, float f);

    public static final native int TextToAeState(String str);

    public static final native int TextToAeType(String str);

    public static final native int TextToAfState(String str);

    public static final native int TextToBayerPattern(String str);

    public static final native int TextToExecuteOn(String str);

    public static final native int TextToFlashMetadata(String str);

    public static final native int TextToFlashMode(String str);

    public static final native int TextToGcamPixelFormat(String str);

    public static final native int TextToGeometricCorrection(String str);

    public static final native int TextToHdrMode(String str);

    public static final native int TextToIccProfile(String str);

    public static final native int TextToImageRotation(String str);

    public static final native int TextToLensState(String str);

    public static final native int TextToRawCropping(String str);

    public static final native int TextToResamplingMethod(String str);

    public static final native int TextToSceneFlicker(String str);

    public static final native int TextToWhiteBalanceMode(String str);

    public static final native int TextToYuvFormat(String str);

    public static final native boolean ThreadPriority_Equals(long j, ThreadPriority threadPriority, long j2, ThreadPriority threadPriority2);

    public static final native boolean ThreadPriority_explicitly_set_get(long j, ThreadPriority threadPriority);

    public static final native void ThreadPriority_explicitly_set_set(long j, ThreadPriority threadPriority, boolean z);

    public static final native int ThreadPriority_value_get(long j, ThreadPriority threadPriority);

    public static final native void ThreadPriority_value_set(long j, ThreadPriority threadPriority, int i);

    public static final native String ToText__SWIG_0(int i);

    public static final native int ToYuvFormat(int i);

    public static final native long TrackedMemoryAllocate(long j);

    public static final native void TrackedMemoryDeallocate(long j);

    public static final native void TuningVector_add(long j, TuningVector tuningVector, long j2, Tuning tuning);

    public static final native long TuningVector_capacity(long j, TuningVector tuningVector);

    public static final native void TuningVector_clear(long j, TuningVector tuningVector);

    public static final native long TuningVector_get(long j, TuningVector tuningVector, int i);

    public static final native boolean TuningVector_isEmpty(long j, TuningVector tuningVector);

    public static final native void TuningVector_reserve(long j, TuningVector tuningVector, long j2);

    public static final native void TuningVector_set(long j, TuningVector tuningVector, int i, long j2, Tuning tuning);

    public static final native long TuningVector_size(long j, TuningVector tuningVector);

    public static final native boolean Tuning_Check(long j, Tuning tuning);

    public static final native long Tuning_GetCaptureParams(long j, Tuning tuning);

    public static final native long Tuning_GetColorSatAdj(long j, Tuning tuning);

    public static final native float Tuning_GetMaxOverallGain(long j, Tuning tuning);

    public static final native float Tuning_GetMaxTet(long j, Tuning tuning);

    public static final native float Tuning_GetMinExposureTimeMs(long j, Tuning tuning);

    public static final native float Tuning_GetMinTet(long j, Tuning tuning);

    public static final native boolean Tuning_apply_antibanding_get(long j, Tuning tuning);

    public static final native void Tuning_apply_antibanding_set(long j, Tuning tuning, boolean z);

    public static final native float Tuning_base_frame_candidate_exposure_time_cutoff_ms_get(long j, Tuning tuning);

    public static final native void Tuning_base_frame_candidate_exposure_time_cutoff_ms_set(long j, Tuning tuning, float f);

    public static final native int Tuning_base_frame_candidates_in_bright_scene_get(long j, Tuning tuning);

    public static final native void Tuning_base_frame_candidates_in_bright_scene_set(long j, Tuning tuning, int i);

    public static final native int Tuning_base_frame_candidates_in_dark_scene_get(long j, Tuning tuning);

    public static final native void Tuning_base_frame_candidates_in_dark_scene_set(long j, Tuning tuning, int i);

    public static final native long Tuning_black_pixel_area_override_get(long j, Tuning tuning);

    public static final native void Tuning_black_pixel_area_override_set(long j, Tuning tuning, long j2, PixelRect pixelRect);

    public static final native String Tuning_device_code_get(long j, Tuning tuning);

    public static final native void Tuning_device_code_set(long j, Tuning tuning, String str);

    public static final native int Tuning_fickle_payload_frames_get(long j, Tuning tuning);

    public static final native void Tuning_fickle_payload_frames_set(long j, Tuning tuning, int i);

    public static final native boolean Tuning_ignore_black_pixels_get(long j, Tuning tuning);

    public static final native void Tuning_ignore_black_pixels_set(long j, Tuning tuning, boolean z);

    public static final native float Tuning_max_exposure_time_ms_get(long j, Tuning tuning);

    public static final native void Tuning_max_exposure_time_ms_set(long j, Tuning tuning, float f);

    public static final native float Tuning_max_raw_sensor_gain_get(long j, Tuning tuning);

    public static final native void Tuning_max_raw_sensor_gain_set(long j, Tuning tuning, float f);

    public static final native long Tuning_raw_finish_params_get(long j, Tuning tuning);

    public static final native void Tuning_raw_finish_params_set(long j, Tuning tuning, long j2, RawFinishParams rawFinishParams);

    public static final native long Tuning_raw_global_vignetting_get(long j, Tuning tuning);

    public static final native void Tuning_raw_global_vignetting_set(long j, Tuning tuning, long j2, RawVignetteParams rawVignetteParams);

    public static final native long Tuning_raw_merge_params_get(long j, Tuning tuning);

    public static final native void Tuning_raw_merge_params_set(long j, Tuning tuning, long j2, RawMergeParams rawMergeParams);

    public static final native long Tuning_raw_payload_capture_params_get(long j, Tuning tuning);

    public static final native void Tuning_raw_payload_capture_params_set(long j, Tuning tuning, long j2, CaptureParams captureParams);

    public static final native long Tuning_raw_payload_tet_model_get(long j, Tuning tuning);

    public static final native void Tuning_raw_payload_tet_model_set(long j, Tuning tuning, long j2, TetModel tetModel);

    public static final native float Tuning_sensitivity_get(long j, Tuning tuning);

    public static final native void Tuning_sensitivity_set(long j, Tuning tuning, float f);

    public static final native long Tuning_sensor_noise_model_override_bayer_get(long j, Tuning tuning);

    public static final native void Tuning_sensor_noise_model_override_bayer_set(long j, Tuning tuning, long j2, SensorNoiseModel sensorNoiseModel);

    public static final native long Tuning_sensor_row_artifacts_get(long j, Tuning tuning);

    public static final native void Tuning_sensor_row_artifacts_set(long j, Tuning tuning, long j2, SensorRowArtifacts sensorRowArtifacts);

    public static final native long Tuning_sparse_pd_pixel_pattern_get(long j, Tuning tuning);

    public static final native void Tuning_sparse_pd_pixel_pattern_set(long j, Tuning tuning, long j2, BadPixelPattern badPixelPattern);

    public static final native boolean Tuning_suppress_hot_pixels_get(long j, Tuning tuning);

    public static final native void Tuning_suppress_hot_pixels_set(long j, Tuning tuning, boolean z);

    public static final native void WeightedNormalizedRectVector_add(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, long j2, WeightedNormalizedRect weightedNormalizedRect);

    public static final native long WeightedNormalizedRectVector_capacity(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native void WeightedNormalizedRectVector_clear(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native long WeightedNormalizedRectVector_get(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, int i);

    public static final native boolean WeightedNormalizedRectVector_isEmpty(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native void WeightedNormalizedRectVector_reserve(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, long j2);

    public static final native void WeightedNormalizedRectVector_set(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, int i, long j2, WeightedNormalizedRect weightedNormalizedRect);

    public static final native long WeightedNormalizedRectVector_size(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native boolean WeightedNormalizedRect_DeserializeFromString(long j, WeightedNormalizedRect weightedNormalizedRect, long j2);

    public static final native boolean WeightedNormalizedRect_Equals(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, WeightedNormalizedRect weightedNormalizedRect2);

    public static final native void WeightedNormalizedRect_Print(long j, WeightedNormalizedRect weightedNormalizedRect, int i, int i2);

    public static final native void WeightedNormalizedRect_SerializeToString(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, int i);

    public static final native long WeightedNormalizedRect_rect_get(long j, WeightedNormalizedRect weightedNormalizedRect);

    public static final native void WeightedNormalizedRect_rect_set(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, NormalizedRect normalizedRect);

    public static final native float WeightedNormalizedRect_weight_get(long j, WeightedNormalizedRect weightedNormalizedRect);

    public static final native void WeightedNormalizedRect_weight_set(long j, WeightedNormalizedRect weightedNormalizedRect, float f);

    public static final native void WeightedPixelRectVector_add(long j, WeightedPixelRectVector weightedPixelRectVector, long j2, WeightedPixelRect weightedPixelRect);

    public static final native long WeightedPixelRectVector_capacity(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native void WeightedPixelRectVector_clear(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native long WeightedPixelRectVector_get(long j, WeightedPixelRectVector weightedPixelRectVector, int i);

    public static final native boolean WeightedPixelRectVector_isEmpty(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native void WeightedPixelRectVector_reserve(long j, WeightedPixelRectVector weightedPixelRectVector, long j2);

    public static final native void WeightedPixelRectVector_set(long j, WeightedPixelRectVector weightedPixelRectVector, int i, long j2, WeightedPixelRect weightedPixelRect);

    public static final native long WeightedPixelRectVector_size(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native boolean WeightedPixelRect_DeserializeFromString(long j, WeightedPixelRect weightedPixelRect, long j2);

    public static final native boolean WeightedPixelRect_Equals(long j, WeightedPixelRect weightedPixelRect, long j2, WeightedPixelRect weightedPixelRect2);

    public static final native void WeightedPixelRect_Print(long j, WeightedPixelRect weightedPixelRect, int i, int i2);

    public static final native void WeightedPixelRect_SerializeToString(long j, WeightedPixelRect weightedPixelRect, long j2, int i);

    public static final native long WeightedPixelRect_rect_get(long j, WeightedPixelRect weightedPixelRect);

    public static final native void WeightedPixelRect_rect_set(long j, WeightedPixelRect weightedPixelRect, long j2, PixelRect pixelRect);

    public static final native float WeightedPixelRect_weight_get(long j, WeightedPixelRect weightedPixelRect);

    public static final native void WeightedPixelRect_weight_set(long j, WeightedPixelRect weightedPixelRect, float f);

    public static final native void WriteAeToShotLogData(long j, AeResults aeResults, long j2, ShotLogData shotLogData);

    public static final native boolean WriteDngToMemory__SWIG_0(long j, long[] jArr, long j2, InterleavedReadViewU16 interleavedReadViewU16, long j3, ExifMetadata exifMetadata, boolean z, long j4);

    public static final native boolean WriteDngToMemory__SWIG_1(long j, long[] jArr, long j2, InterleavedReadViewU16 interleavedReadViewU16, long j3, ExifMetadata exifMetadata, boolean z);

    public static final native boolean WriteDngToMemory__SWIG_2(long j, long[] jArr, long j2, InterleavedReadViewU16 interleavedReadViewU16, long j3, ExifMetadata exifMetadata);

    public static final native boolean WriteDngToMemory__SWIG_3(long j, long[] jArr, long j2, RawReadView rawReadView, long j3, ExifMetadata exifMetadata, boolean z, long j4);

    public static final native boolean WriteDngToMemory__SWIG_4(long j, long[] jArr, long j2, RawReadView rawReadView, long j3, ExifMetadata exifMetadata, boolean z);

    public static final native boolean WriteDngToMemory__SWIG_5(long j, long[] jArr, long j2, RawReadView rawReadView, long j3, ExifMetadata exifMetadata);

    public static final native boolean WriteDng__SWIG_0(String str, long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, ExifMetadata exifMetadata, boolean z, long j3);

    public static final native boolean WriteDng__SWIG_1(String str, long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, ExifMetadata exifMetadata, boolean z);

    public static final native boolean WriteDng__SWIG_2(String str, long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, ExifMetadata exifMetadata);

    public static final native boolean WriteDng__SWIG_3(String str, long j, RawReadView rawReadView, long j2, ExifMetadata exifMetadata, boolean z, long j3);

    public static final native boolean WriteDng__SWIG_4(String str, long j, RawReadView rawReadView, long j2, ExifMetadata exifMetadata, boolean z);

    public static final native boolean WriteDng__SWIG_5(String str, long j, RawReadView rawReadView, long j2, ExifMetadata exifMetadata);

    public static final native boolean WriteEmptyFile(String str);

    public static final native boolean WriteJpgToMemory__SWIG_0(long j, long[] jArr, long j2, InterleavedReadViewU8 interleavedReadViewU8, int i, long j3, ExifMetadata exifMetadata);

    public static final native boolean WriteJpgToMemory__SWIG_1(long j, long[] jArr, long j2, InterleavedReadViewU8 interleavedReadViewU8, int i);

    public static final native boolean WriteJpgToMemory__SWIG_2(long j, long[] jArr, long j2, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native boolean WriteJpgToMemory__SWIG_3(long j, long[] jArr, long j2, YuvReadView yuvReadView, int i, long j3, ExifMetadata exifMetadata);

    public static final native boolean WriteJpgToMemory__SWIG_4(long j, long[] jArr, long j2, YuvReadView yuvReadView, int i);

    public static final native boolean WriteJpgToMemory__SWIG_5(long j, long[] jArr, long j2, YuvReadView yuvReadView);

    public static final native boolean WriteJpg__SWIG_0(String str, long j, InterleavedReadViewU8 interleavedReadViewU8, int i, long j2, ExifMetadata exifMetadata);

    public static final native boolean WriteJpg__SWIG_1(String str, long j, InterleavedReadViewU8 interleavedReadViewU8, int i);

    public static final native boolean WriteJpg__SWIG_2(String str, long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native boolean WriteJpg__SWIG_3(String str, long j, YuvReadView yuvReadView, int i, long j2, ExifMetadata exifMetadata);

    public static final native boolean WriteMemoryToFile(long j, long j2, String str);

    public static final native boolean WriteStringToFile(String str, String str2);

    public static final native long YuvAllocation_id_get(long j, YuvAllocation yuvAllocation);

    public static final native void YuvAllocation_id_set(long j, YuvAllocation yuvAllocation, long j2);

    public static final native long YuvAllocation_view_get(long j, YuvAllocation yuvAllocation);

    public static final native void YuvAllocation_view_set(long j, YuvAllocation yuvAllocation, long j2, YuvWriteView yuvWriteView);

    public static final native boolean YuvFormatsHaveUvSwapped(int i, int i2);

    public static final native long YuvImage_SWIGUpcast(long j);

    public static final native long YuvImage_buffer(long j, YuvImage yuvImage);

    public static final native int YuvImage_chroma_rows(long j, YuvImage yuvImage);

    public static final native int YuvImage_luma_rows(long j, YuvImage yuvImage);

    public static final native boolean YuvReadView_Empty(long j, YuvReadView yuvReadView);

    public static final native void YuvReadView_FastCrop(long j, YuvReadView yuvReadView, int i, int i2, int i3, int i4);

    public static final native boolean YuvReadView_IsOneLeanChunk(long j, YuvReadView yuvReadView);

    public static final native long YuvReadView_chroma_read_view(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_height(long j, YuvReadView yuvReadView);

    public static final native long YuvReadView_luma_read_view(long j, YuvReadView yuvReadView);

    public static final native short YuvReadView_uv_at(long j, YuvReadView yuvReadView, int i, int i2, int i3);

    public static final native int YuvReadView_width(long j, YuvReadView yuvReadView);

    public static final native short YuvReadView_y_at(long j, YuvReadView yuvReadView, int i, int i2);

    public static final native int YuvReadView_yuv_format(long j, YuvReadView yuvReadView);

    public static final native void YuvWriteView_FastCrop(long j, YuvWriteView yuvWriteView, int i, int i2, int i3, int i4);

    public static final native long YuvWriteView_SWIGUpcast(long j);

    public static final native void YuvWriteView_SetYuvFormat(long j, YuvWriteView yuvWriteView, int i);

    public static final native long YuvWriteView_chroma_write_view(long j, YuvWriteView yuvWriteView);

    public static final native long YuvWriteView_luma_write_view(long j, YuvWriteView yuvWriteView);

    public static final native long YuvWriteView_uv_at_YuvWriteView(long j, YuvWriteView yuvWriteView, int i, int i2, int i3);

    public static final native long YuvWriteView_y_at_YuvWriteView(long j, YuvWriteView yuvWriteView, int i, int i2);

    public static final native long copy_uint8_p(short s);

    public static final native long copy_uint8_p_p(long j);

    public static final native void delete_AeDebugInfo(long j);

    public static final native void delete_AeMetadata(long j);

    public static final native void delete_AeModeResult(long j);

    public static final native void delete_AeResults(long j);

    public static final native void delete_AeShotParams(long j);

    public static final native void delete_AfMetadata(long j);

    public static final native void delete_ArcFlareParam(long j);

    public static final native void delete_AwbInfo(long j);

    public static final native void delete_AwbMetadata(long j);

    public static final native void delete_BackgroundAeResultsCallback(long j);

    public static final native void delete_BadPixel(long j);

    public static final native void delete_BadPixelPattern(long j);

    public static final native void delete_BaseFrameCallback(long j);

    public static final native void delete_BoolVector(long j);

    public static final native void delete_BurstSpec(long j);

    public static final native void delete_CaptureParams(long j);

    public static final native void delete_ChromaticAberrationParams(long j);

    public static final native void delete_ClientExifMetadata(long j);

    public static final native void delete_ClientInterleavedU16Allocator(long j);

    public static final native void delete_ClientInterleavedU8Allocator(long j);

    public static final native void delete_ClientRawAllocator(long j);

    public static final native void delete_ClientYuvAllocator(long j);

    public static final native void delete_ColorSatParams(long j);

    public static final native void delete_ConstSampleIteratorPackedRaw10(long j);

    public static final native void delete_ConstSampleIteratorPackedRaw12(long j);

    public static final native void delete_DebugParams(long j);

    public static final native void delete_DenoiseParams(long j);

    public static final native void delete_DirtyLensHistory(long j);

    public static final native void delete_DngColorCalibration(long j);

    public static final native void delete_DngColorCalibrationVector(long j);

    public static final native void delete_DngNoiseModel(long j);

    public static final native void delete_EncodedBlobCallback(long j);

    public static final native void delete_ExifMetadata(long j);

    public static final native void delete_FaceInfo(long j);

    public static final native void delete_FaceInfoVector(long j);

    public static final native void delete_FactorizeTetOptions(long j);

    public static final native void delete_FileSaver(long j);

    public static final native void delete_FinalImageCallback(long j);

    public static final native void delete_FloatDeque(long j);

    public static final native void delete_FloatSmoothKeyValueMap(long j);

    public static final native void delete_FloatVector(long j);

    public static final native void delete_FrameMetadata(long j);

    public static final native void delete_FrameRequest(long j);

    public static final native void delete_FrameRequestVector(long j);

    public static final native void delete_Gcam(long j);

    public static final native void delete_GoudaCallbacks(long j);

    public static final native void delete_GoudaCompleteCallback(long j);

    public static final native void delete_GoudaImageCallback(long j);

    public static final native void delete_GoudaOutputFeaturesCallback(long j);

    public static final native void delete_GoudaProgressCallback(long j);

    public static final native void delete_GoudaRequest(long j);

    public static final native void delete_GoudaSwigWrapper(long j);

    public static final native void delete_GyroSample(long j);

    public static final native void delete_GyroSampleVector(long j);

    public static final native void delete_ImageReleaseCallback(long j);

    public static final native void delete_ImageSaver(long j);

    public static final native void delete_ImageSaverParams(long j);

    public static final native void delete_InitParams(long j);

    public static final native void delete_Int64Vector(long j);

    public static final native void delete_InterleavedImageU16(long j);

    public static final native void delete_InterleavedImageU8(long j);

    public static final native void delete_InterleavedReadViewU16(long j);

    public static final native void delete_InterleavedReadViewU8(long j);

    public static final native void delete_InterleavedU16Allocation(long j);

    public static final native void delete_InterleavedU8Allocation(long j);

    public static final native void delete_InterleavedWriteViewU16(long j);

    public static final native void delete_InterleavedWriteViewU8(long j);

    public static final native void delete_LocationData(long j);

    public static final native void delete_MemoryStateCallback(long j);

    public static final native void delete_NewDeleteInterleavedU16Allocator(long j);

    public static final native void delete_NewDeleteInterleavedU8Allocator(long j);

    public static final native void delete_NewDeleteRawAllocator(long j);

    public static final native void delete_NewDeleteYuvAllocator(long j);

    public static final native void delete_NormalizedRect(long j);

    public static final native void delete_OisMetadata(long j);

    public static final native void delete_OisPosition(long j);

    public static final native void delete_OisPositionVector(long j);

    public static final native void delete_PackedImageRaw10(long j);

    public static final native void delete_PackedImageRaw12(long j);

    public static final native void delete_PackedReadViewRaw10(long j);

    public static final native void delete_PackedReadViewRaw12(long j);

    public static final native void delete_PackedReadWriteViewRaw10(long j);

    public static final native void delete_PackedReadWriteViewRaw12(long j);

    public static final native void delete_PdImageCallback(long j);

    public static final native void delete_PixelRect(long j);

    public static final native void delete_PixelRectVector(long j);

    public static final native void delete_PlanarRawImageCallback(long j);

    public static final native void delete_PostviewCallback(long j);

    public static final native void delete_PostviewParams(long j);

    public static final native void delete_ProgressCallback(long j);

    public static final native void delete_QcColorCalibration(long j);

    public static final native void delete_QcColorCalibration_IlluminantData(long j);

    public static final native void delete_QcIlluminantVector(long j);

    public static final native void delete_RawAllocation(long j);

    public static final native void delete_RawFinishParams(long j);

    public static final native void delete_RawImage(long j);

    public static final native void delete_RawImageCallback(long j);

    public static final native void delete_RawMergeParams(long j);

    public static final native void delete_RawReadView(long j);

    public static final native void delete_RawSharpenParams(long j);

    public static final native void delete_RawSharpenParams_Point(long j);

    public static final native void delete_RawVignetteParams(long j);

    public static final native void delete_RawWriteView(long j);

    public static final native void delete_RowPattern(long j);

    public static final native void delete_SecondOrderFilter(long j);

    public static final native void delete_SensorNoiseModel(long j);

    public static final native void delete_SensorRowArtifacts(long j);

    public static final native void delete_ShotCallbacks(long j);

    public static final native void delete_ShotLogData(long j);

    public static final native void delete_ShotParams(long j);

    public static final native void delete_ShotStatusCallback(long j);

    public static final native void delete_SimpleCallback(long j);

    public static final native void delete_SpatialGainMap(long j);

    public static final native void delete_StaticMetadata(long j);

    public static final native void delete_StaticMetadataVector(long j);

    public static final native void delete_StringVector(long j);

    public static final native void delete_TetAwbPair(long j);

    public static final native void delete_TetFactorization(long j);

    public static final native void delete_TetModel(long j);

    public static final native void delete_TetToAwb(long j);

    public static final native void delete_TetWaypoint(long j);

    public static final native void delete_ThreadPriority(long j);

    public static final native void delete_Tuning(long j);

    public static final native void delete_TuningVector(long j);

    public static final native void delete_WeightedNormalizedRect(long j);

    public static final native void delete_WeightedNormalizedRectVector(long j);

    public static final native void delete_WeightedPixelRect(long j);

    public static final native void delete_WeightedPixelRectVector(long j);

    public static final native void delete_YuvAllocation(long j);

    public static final native void delete_YuvImage(long j);

    public static final native void delete_YuvReadView(long j);

    public static final native void delete_YuvWriteView(long j);

    public static final native void delete_uint8_array(long j);

    public static final native void delete_uint8_p(long j);

    public static final native void delete_uint8_p_p(long j);

    public static final native void free_uint8_p(long j);

    public static final native int kBguDownsampleFactor_get();

    public static final native int kChromaLutSizeUV_get();

    public static final native int kChromaLutSizeY_get();

    public static final native int kColorTempUnknown_get();

    public static final native int kDebugFullMeteringSweepFrameCount_get();

    public static final native int kDefaultFullMeteringSweepFrameCount_get();

    public static final native int kDefaultIpuCaRadius_get();

    public static final native int kDefaultJpgQualityThumbnail_get();

    public static final native int kDefaultJpgQuality_get();

    public static final native int kDefaultMaxPayloadFrames_get();

    public static final native int kDefaultMinPayloadFrames_get();

    public static final native int kDefaultPostviewLongestEdge_get();

    public static final native int kDenoiseFreqCount_get();

    public static final native String kInitParamsFilename_get();

    public static final native long kInvalidAllocationId_get();

    public static final native long kInvalidImageId_get();

    public static final native float kInvalidMotionScore_get();

    public static final native int kInvalidShotId_get();

    public static final native int kIpuRawFinishAlignmentX_get();

    public static final native int kIpuRawFinishAlignmentY_get();

    public static final native int kLegacySensorIdPrimary_get();

    public static final native int kLegacySensorIdSecondary_get();

    public static final native int kLinearYuvPrecision_get();

    public static final native int kLinearYuvWhiteLevel_get();

    public static final native int kLog2ChromaLutSizeUV_get();

    public static final native int kLog2ChromaLutSizeY_get();

    public static final native int kMaxFullMeteringSweepFrames_get();

    public static final native int kMaxJpgQuality_get();

    public static final native float kMaxMotionScore_get();

    public static final native float kMaxOverallGainSlopFactor_get();

    public static final native int kMaxTetWaypoints_get();

    public static final native int kMaxValidColorTemp_get();

    public static final native String kMeteringBurstFrameMetadataFilename_get();

    public static final native void kMeteringBurstFrameMetadataFilename_set(String str);

    public static final native String kMeteringBurstSpecFilename_get();

    public static final native void kMeteringBurstSpecFilename_set(String str);

    public static final native float kMinDigitalZoomRatio_get();

    public static final native int kMinFullMeteringSweepFrames_get();

    public static final native int kMinJpgQuality_get();

    public static final native float kMinMotionScore_get();

    public static final native int kMinPayloadFrames_get();

    public static final native int kMinValidColorTemp_get();

    public static final native String kPayloadBurstFrameMetadataFilename_get();

    public static final native void kPayloadBurstFrameMetadataFilename_set(String str);

    public static final native String kPayloadBurstSpecFilename_get();

    public static final native void kPayloadBurstSpecFilename_set(String str);

    public static final native int kPdCurrentVersion_get();

    public static final native int kRawFinishAlignmentX_get();

    public static final native int kRawFinishAlignmentY_get();

    public static final native int kRawFinishMaxInputWhiteLevel_get();

    public static final native int kRawFinishMinInputWhiteLevel_get();

    public static final native int kRawFinishPrecision_get();

    public static final native boolean kRawFinishUseBgu_get();

    public static final native int kRawFinishWhiteLevel_get();

    public static final native int kRawPixelMaxValue_get();

    public static final native int kRawSharpenCurveSize_get();

    public static final native int kRawSharpenFreqCount_get();

    public static final native int kSensorTempUnknown_get();

    public static final native String kShotParamsFilename_get();

    public static final native String kStaticMetadataFilename_get();

    public static final native int kThrowOutOneInNBlurryImages_get();

    public static final native int kTonemappedYuvPrecision_get();

    public static final native int kTonemappedYuvWhiteLevel_get();

    public static final native String kUnusedLoggingMetadataFilename_get();

    public static final native void kUnusedLoggingMetadataFilename_set(String str);

    public static final native long new_AeDebugInfo();

    public static final native long new_AeMetadata();

    public static final native long new_AeModeResult();

    public static final native long new_AeResults__SWIG_0();

    public static final native long new_AeResults__SWIG_1(long j, AeResults aeResults);

    public static final native long new_AeShotParams();

    public static final native long new_AfMetadata();

    public static final native long new_ArcFlareParam();

    public static final native long new_AwbInfo();

    public static final native long new_AwbMetadata();

    public static final native long new_BackgroundAeResultsCallback();

    public static final native long new_BadPixel();

    public static final native long new_BadPixelPattern();

    public static final native long new_BaseFrameCallback();

    public static final native long new_BoolVector__SWIG_0();

    public static final native long new_BoolVector__SWIG_1(long j);

    public static final native long new_BurstSpec();

    public static final native long new_CaptureParams();

    public static final native long new_ChromaticAberrationParams();

    public static final native long new_ClientExifMetadata();

    public static final native long new_ClientInterleavedU16Allocator();

    public static final native long new_ClientInterleavedU8Allocator();

    public static final native long new_ClientRawAllocator();

    public static final native long new_ClientYuvAllocator();

    public static final native long new_ColorSatParams();

    public static final native long new_ConstSampleIteratorPackedRaw10__SWIG_0(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long new_ConstSampleIteratorPackedRaw10__SWIG_1(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native long new_ConstSampleIteratorPackedRaw12__SWIG_0(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long new_ConstSampleIteratorPackedRaw12__SWIG_1(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native long new_DebugParams();

    public static final native long new_DenoiseParams();

    public static final native long new_DirtyLensHistory__SWIG_0();

    public static final native long new_DirtyLensHistory__SWIG_1(long j, FloatDeque floatDeque);

    public static final native long new_DngColorCalibration();

    public static final native long new_DngColorCalibrationVector__SWIG_0();

    public static final native long new_DngColorCalibrationVector__SWIG_1(long j);

    public static final native long new_DngNoiseModel();

    public static final native long new_EncodedBlobCallback();

    public static final native long new_ExifMetadata__SWIG_0();

    public static final native long new_ExifMetadata__SWIG_1(long j, ExifMetadata exifMetadata);

    public static final native long new_FaceInfo();

    public static final native long new_FaceInfoVector__SWIG_0();

    public static final native long new_FaceInfoVector__SWIG_1(long j);

    public static final native long new_FactorizeTetOptions();

    public static final native long new_FinalImageCallback();

    public static final native long new_FloatDeque__SWIG_0();

    public static final native long new_FloatDeque__SWIG_1(long j, float f);

    public static final native long new_FloatDeque__SWIG_2(long j);

    public static final native long new_FloatDeque__SWIG_3(long j, FloatDeque floatDeque);

    public static final native long new_FloatSmoothKeyValueMap();

    public static final native long new_FloatVector__SWIG_0();

    public static final native long new_FloatVector__SWIG_1(long j);

    public static final native long new_FrameMetadata();

    public static final native long new_FrameRequest();

    public static final native long new_FrameRequestVector__SWIG_0();

    public static final native long new_FrameRequestVector__SWIG_1(long j);

    public static final native long new_GoudaCallbacks();

    public static final native long new_GoudaCompleteCallback();

    public static final native long new_GoudaImageCallback();

    public static final native long new_GoudaProgressCallback();

    public static final native long new_GoudaRequest();

    public static final native long new_GoudaSwigWrapper();

    public static final native long new_GyroSample();

    public static final native long new_GyroSampleVector__SWIG_0();

    public static final native long new_GyroSampleVector__SWIG_1(long j);

    public static final native long new_ImageReleaseCallback();

    public static final native long new_ImageSaverParams();

    public static final native long new_ImageSaver__SWIG_0(String str, String str2, String str3, String str4);

    public static final native long new_ImageSaver__SWIG_1(long j, ImageSaverParams imageSaverParams, String str);

    public static final native long new_InitParams();

    public static final native long new_Int64Vector__SWIG_0();

    public static final native long new_Int64Vector__SWIG_1(long j);

    public static final native long new_InterleavedImageU16__SWIG_0();

    public static final native long new_InterleavedImageU16__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU16__SWIG_2(int i, int i2, int i3, int i4);

    public static final native long new_InterleavedImageU16__SWIG_3(int i, int i2, int i3);

    public static final native long new_InterleavedImageU16__SWIG_4(int i, int i2, int i3, int i4, long j, long j2);

    public static final native long new_InterleavedImageU16__SWIG_5(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU16__SWIG_6(int i, int i2, int i3, long j, long j2, long j3);

    public static final native long new_InterleavedImageU16__SWIG_7(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long new_InterleavedImageU8__SWIG_0();

    public static final native long new_InterleavedImageU8__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU8__SWIG_2(int i, int i2, int i3, int i4);

    public static final native long new_InterleavedImageU8__SWIG_3(int i, int i2, int i3);

    public static final native long new_InterleavedImageU8__SWIG_4(int i, int i2, int i3, int i4, long j, long j2);

    public static final native long new_InterleavedImageU8__SWIG_5(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU8__SWIG_6(int i, int i2, int i3, long j, long j2, long j3);

    public static final native long new_InterleavedImageU8__SWIG_7(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long new_InterleavedReadViewU16__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_InterleavedReadViewU16__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedReadViewU16__SWIG_2(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedReadViewU16__SWIG_3();

    public static final native long new_InterleavedReadViewU16__SWIG_4(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedReadViewU8__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_InterleavedReadViewU8__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedReadViewU8__SWIG_2(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedReadViewU8__SWIG_3();

    public static final native long new_InterleavedReadViewU8__SWIG_4(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedU16Allocation();

    public static final native long new_InterleavedU8Allocation();

    public static final native long new_InterleavedWriteViewU16__SWIG_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long new_InterleavedWriteViewU16__SWIG_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedWriteViewU16__SWIG_2(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedWriteViewU16__SWIG_3();

    public static final native long new_InterleavedWriteViewU16__SWIG_4(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedWriteViewU8__SWIG_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long new_InterleavedWriteViewU8__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedWriteViewU8__SWIG_2(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedWriteViewU8__SWIG_3();

    public static final native long new_InterleavedWriteViewU8__SWIG_4(int i, int i2, int i3, long j, long j2);

    public static final native long new_LocationData();

    public static final native long new_MemoryStateCallback();

    public static final native long new_NewDeleteInterleavedU16Allocator();

    public static final native long new_NewDeleteInterleavedU8Allocator();

    public static final native long new_NewDeleteRawAllocator();

    public static final native long new_NewDeleteYuvAllocator();

    public static final native long new_NormalizedRect();

    public static final native long new_OisMetadata();

    public static final native long new_OisPosition();

    public static final native long new_OisPositionVector__SWIG_0();

    public static final native long new_OisPositionVector__SWIG_1(long j);

    public static final native long new_PackedImageRaw10__SWIG_0();

    public static final native long new_PackedImageRaw10__SWIG_1(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long new_PackedImageRaw10__SWIG_2(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2);

    public static final native long new_PackedImageRaw10__SWIG_3(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_PackedImageRaw10__SWIG_4(long j, long j2);

    public static final native long new_PackedImageRaw10__SWIG_5(long j);

    public static final native long new_PackedImageRaw10__SWIG_6(int i, int i2, int i3, long j, long j2);

    public static final native long new_PackedImageRaw10__SWIG_7(int i, int i2, int i3, long j);

    public static final native long new_PackedImageRaw10__SWIG_8(int i, int i2, int i3);

    public static final native long new_PackedImageRaw10__SWIG_9(int i, int i2);

    public static final native long new_PackedImageRaw12__SWIG_0();

    public static final native long new_PackedImageRaw12__SWIG_1(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long new_PackedImageRaw12__SWIG_2(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2);

    public static final native long new_PackedImageRaw12__SWIG_3(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_PackedImageRaw12__SWIG_4(long j, long j2);

    public static final native long new_PackedImageRaw12__SWIG_5(long j);

    public static final native long new_PackedImageRaw12__SWIG_6(int i, int i2, int i3, long j, long j2);

    public static final native long new_PackedImageRaw12__SWIG_7(int i, int i2, int i3, long j);

    public static final native long new_PackedImageRaw12__SWIG_8(int i, int i2, int i3);

    public static final native long new_PackedImageRaw12__SWIG_9(int i, int i2);

    public static final native long new_PackedReadViewRaw10__SWIG_0();

    public static final native long new_PackedReadViewRaw10__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_PackedReadViewRaw10__SWIG_2(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long new_PackedReadViewRaw12__SWIG_0();

    public static final native long new_PackedReadViewRaw12__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_PackedReadViewRaw12__SWIG_2(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long new_PackedReadWriteViewRaw10__SWIG_0();

    public static final native long new_PackedReadWriteViewRaw10__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long new_PackedReadWriteViewRaw10__SWIG_2(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10);

    public static final native long new_PackedReadWriteViewRaw12__SWIG_0();

    public static final native long new_PackedReadWriteViewRaw12__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long new_PackedReadWriteViewRaw12__SWIG_2(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12);

    public static final native long new_PdImageCallback();

    public static final native long new_PixelRect();

    public static final native long new_PixelRectVector__SWIG_0();

    public static final native long new_PixelRectVector__SWIG_1(long j);

    public static final native long new_PostviewCallback();

    public static final native long new_PostviewParams();

    public static final native long new_ProgressCallback();

    public static final native long new_QcColorCalibration();

    public static final native long new_QcColorCalibration_IlluminantData();

    public static final native long new_QcIlluminantVector__SWIG_0();

    public static final native long new_QcIlluminantVector__SWIG_1(long j);

    public static final native long new_RawAllocation();

    public static final native long new_RawFinishParams();

    public static final native long new_RawImageCallback();

    public static final native long new_RawImage__SWIG_0();

    public static final native long new_RawImage__SWIG_1(int i, int i2, int i3, long j);

    public static final native long new_RawImage__SWIG_2(int i, int i2, int i3);

    public static final native long new_RawImage__SWIG_3(int i, int i2, long j, int i3, long j2);

    public static final native long new_RawImage__SWIG_4(int i, int i2, long j, int i3);

    public static final native long new_RawImage__SWIG_5(long j, RawImage rawImage);

    public static final native long new_RawImage__SWIG_6(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long new_RawImage__SWIG_7(long j, PackedImageRaw10 packedImageRaw10);

    public static final native long new_RawImage__SWIG_8(long j, PackedImageRaw12 packedImageRaw12);

    public static final native long new_RawMergeParams();

    public static final native long new_RawReadView__SWIG_0();

    public static final native long new_RawReadView__SWIG_1(long j, RawReadView rawReadView);

    public static final native long new_RawReadView__SWIG_2(int i, int i2, long j, int i3, long j2);

    public static final native long new_RawSharpenParams();

    public static final native long new_RawSharpenParams_Point();

    public static final native long new_RawVignetteParams();

    public static final native long new_RawWriteView__SWIG_0();

    public static final native long new_RawWriteView__SWIG_1(long j, RawWriteView rawWriteView);

    public static final native long new_RawWriteView__SWIG_2(int i, int i2, long j, int i3, long j2);

    public static final native long new_RowPattern();

    public static final native long new_SecondOrderFilter();

    public static final native long new_SensorNoiseModel();

    public static final native long new_SensorRowArtifacts();

    public static final native long new_ShotCallbacks();

    public static final native long new_ShotLogData();

    public static final native long new_ShotParams();

    public static final native long new_ShotStatusCallback();

    public static final native long new_SimpleCallback();

    public static final native long new_SpatialGainMap__SWIG_0();

    public static final native long new_SpatialGainMap__SWIG_1(int i, int i2, boolean z, boolean z2, long j);

    public static final native long new_SpatialGainMap__SWIG_2(int i, int i2, boolean z, boolean z2);

    public static final native long new_SpatialGainMap__SWIG_3(long j, boolean z, boolean z2, long j2);

    public static final native long new_SpatialGainMap__SWIG_4(long j, boolean z, boolean z2);

    public static final native long new_SpatialGainMap__SWIG_5(long j, boolean z, boolean z2);

    public static final native long new_SpatialGainMap__SWIG_6(long j, SpatialGainMap spatialGainMap);

    public static final native long new_StaticMetadata();

    public static final native long new_StaticMetadataVector__SWIG_0();

    public static final native long new_StaticMetadataVector__SWIG_1(long j);

    public static final native long new_StringVector__SWIG_0();

    public static final native long new_StringVector__SWIG_1(long j);

    public static final native long new_TetAwbPair__SWIG_0();

    public static final native long new_TetAwbPair__SWIG_1(float f, long j, AwbInfo awbInfo);

    public static final native long new_TetAwbPair__SWIG_2(long j, TetAwbPair tetAwbPair);

    public static final native long new_TetFactorization();

    public static final native long new_TetModel();

    public static final native long new_TetToAwb__SWIG_0();

    public static final native long new_TetToAwb__SWIG_1(long j);

    public static final native long new_TetWaypoint();

    public static final native long new_ThreadPriority();

    public static final native long new_Tuning();

    public static final native long new_TuningVector__SWIG_0();

    public static final native long new_TuningVector__SWIG_1(long j);

    public static final native long new_WeightedNormalizedRect();

    public static final native long new_WeightedNormalizedRectVector__SWIG_0();

    public static final native long new_WeightedNormalizedRectVector__SWIG_1(long j);

    public static final native long new_WeightedPixelRect();

    public static final native long new_WeightedPixelRectVector__SWIG_0();

    public static final native long new_WeightedPixelRectVector__SWIG_1(long j);

    public static final native long new_YuvAllocation();

    public static final native long new_YuvImage__SWIG_0();

    public static final native long new_YuvImage__SWIG_1(int i, int i2, int i3, long j);

    public static final native long new_YuvImage__SWIG_2(int i, int i2, int i3);

    public static final native long new_YuvImage__SWIG_3(int i, int i2, int i3, int i4, int i5, int i6, long j);

    public static final native long new_YuvImage__SWIG_4(int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_YuvImage__SWIG_5(long j, YuvImage yuvImage);

    public static final native long new_YuvReadView__SWIG_0(long j, YuvReadView yuvReadView);

    public static final native long new_YuvReadView__SWIG_1(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    public static final native long new_YuvReadView__SWIG_2();

    public static final native long new_YuvWriteView__SWIG_0();

    public static final native long new_YuvWriteView__SWIG_1(long j, YuvWriteView yuvWriteView);

    public static final native long new_YuvWriteView__SWIG_2(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    public static final native long new_uint8_array(int i);

    public static final native long new_uint8_p();

    public static final native long new_uint8_p_p();

    private static final native void swig_module_init();

    public static final native short uint8_array_getitem(long j, int i);

    public static final native void uint8_array_setitem(long j, int i, short s);

    public static final native void uint8_p_assign(long j, short s);

    public static final native void uint8_p_p_assign(long j, long j2);

    public static final native long uint8_p_p_value(long j);

    public static final native short uint8_p_value(long j);

    public static void SwigDirector_BackgroundAeResultsCallback_Run(BackgroundAeResultsCallback backgroundAeResultsCallback, long j) {
        backgroundAeResultsCallback.Run(new AeResults(j, false));
    }

    public static void SwigDirector_BaseFrameCallback_Run(BaseFrameCallback baseFrameCallback, int i, int i2, long j) {
        baseFrameCallback.Run(i, i2, j);
    }

    public static long SwigDirector_ClientInterleavedU16Allocator_Allocate(ClientInterleavedU16Allocator clientInterleavedU16Allocator, int i, int i2, int i3) {
        return InterleavedU16Allocation.getCPtr(clientInterleavedU16Allocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientInterleavedU16Allocator_Release(ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j) {
        clientInterleavedU16Allocator.Release(j);
    }

    public static long SwigDirector_ClientInterleavedU8Allocator_Allocate(ClientInterleavedU8Allocator clientInterleavedU8Allocator, int i, int i2, int i3) {
        return InterleavedU8Allocation.getCPtr(clientInterleavedU8Allocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientInterleavedU8Allocator_Release(ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j) {
        clientInterleavedU8Allocator.Release(j);
    }

    public static long SwigDirector_ClientRawAllocator_Allocate(ClientRawAllocator clientRawAllocator, int i, int i2, int i3) {
        return RawAllocation.getCPtr(clientRawAllocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientRawAllocator_Release(ClientRawAllocator clientRawAllocator, long j) {
        clientRawAllocator.Release(j);
    }

    public static long SwigDirector_ClientYuvAllocator_Allocate(ClientYuvAllocator clientYuvAllocator, int i, int i2, int i3) {
        return YuvAllocation.getCPtr(clientYuvAllocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientYuvAllocator_Release(ClientYuvAllocator clientYuvAllocator, long j) {
        clientYuvAllocator.Release(j);
    }

    public static void SwigDirector_EncodedBlobCallback_Run(EncodedBlobCallback encodedBlobCallback, int i, long j, long j2, int i2, int i3) {
        SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char;
        if (j != 0) {
            sWIGTYPE_p_unsigned_char = new SWIGTYPE_p_unsigned_char(j, false);
        } else {
            sWIGTYPE_p_unsigned_char = null;
        }
        encodedBlobCallback.Run(i, sWIGTYPE_p_unsigned_char, j2, i2, i3);
    }

    public static void SwigDirector_FinalImageCallback_RgbReady(FinalImageCallback finalImageCallback, int i, long j, long j2, int i2) {
        finalImageCallback.RgbReady(i, new InterleavedReadViewU8(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_FinalImageCallback_YuvReady(FinalImageCallback finalImageCallback, int i, long j, long j2, int i2) {
        finalImageCallback.YuvReady(i, new YuvReadView(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_GoudaCompleteCallback_Run(GoudaCompleteCallback goudaCompleteCallback, long j) {
        goudaCompleteCallback.Run(j);
    }

    public static void SwigDirector_GoudaImageCallback_RgbReady(GoudaImageCallback goudaImageCallback, long j, long j2, int i, String str, String str2, String str3) {
        goudaImageCallback.RgbReady(j, new InterleavedReadViewU8(j2, false), i, str, str2, str3);
    }

    public static void SwigDirector_GoudaImageCallback_YuvReady(GoudaImageCallback goudaImageCallback, long j, long j2, int i, String str, String str2, String str3) {
        goudaImageCallback.YuvReady(j, new YuvReadView(j2, false), i, str, str2, str3);
    }

    public static void SwigDirector_GoudaProgressCallback_Run(GoudaProgressCallback goudaProgressCallback, long j, float f) {
        goudaProgressCallback.Run(j, f);
    }

    public static void SwigDirector_ImageReleaseCallback_Run(ImageReleaseCallback imageReleaseCallback, long j) {
        imageReleaseCallback.Run(j);
    }

    public static void SwigDirector_MemoryStateCallback_Run(MemoryStateCallback memoryStateCallback, long j, long j2) {
        memoryStateCallback.Run(j, j2);
    }

    public static void SwigDirector_PdImageCallback_ImageReady(PdImageCallback pdImageCallback, int i, long j) {
        pdImageCallback.ImageReady(i, new InterleavedReadViewU16(j, false));
    }

    public static void SwigDirector_PdImageCallback_MergePdFailed(PdImageCallback pdImageCallback, int i) {
        pdImageCallback.MergePdFailed(i);
    }

    public static void SwigDirector_PostviewCallback_RgbReady(PostviewCallback postviewCallback, int i, long j, int i2) {
        postviewCallback.RgbReady(i, new InterleavedReadViewU8(j, false), i2);
    }

    public static void SwigDirector_PostviewCallback_YuvReady(PostviewCallback postviewCallback, int i, long j, int i2) {
        postviewCallback.YuvReady(i, new YuvReadView(j, false), i2);
    }

    public static void SwigDirector_ProgressCallback_Run(ProgressCallback progressCallback, int i, float f) {
        progressCallback.Run(i, f);
    }

    public static void SwigDirector_RawImageCallback_ImageReady(RawImageCallback rawImageCallback, int i, long j, long j2) {
        RawImage rawImage;
        ExifMetadata exifMetadata = new ExifMetadata(j, false);
        if (j2 != 0) {
            rawImage = new RawImage(j2, false);
        } else {
            rawImage = null;
        }
        rawImageCallback.ImageReady(i, exifMetadata, rawImage);
    }

    public static void SwigDirector_ShotStatusCallback_OnAbort(ShotStatusCallback shotStatusCallback, int i) {
        shotStatusCallback.OnAbort(i);
    }

    public static void SwigDirector_ShotStatusCallback_OnComplete(ShotStatusCallback shotStatusCallback, int i, long j) {
        shotStatusCallback.OnComplete(i, new ShotLogData(j, false));
    }

    public static void SwigDirector_ShotStatusCallback_OnError(ShotStatusCallback shotStatusCallback, int i, String str) {
        shotStatusCallback.OnError(i, str);
    }

    public static void SwigDirector_SimpleCallback_Run(SimpleCallback simpleCallback) {
        simpleCallback.Run();
    }
}
