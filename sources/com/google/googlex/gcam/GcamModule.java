package com.google.googlex.gcam;

/* compiled from: PG */
public class GcamModule {
    public static SWIGTYPE_p_Halide__Runtime__BufferT_void_const_t AdjustRawBufferMins(int i, SWIGTYPE_p_Halide__Runtime__BufferT_void_const_t sWIGTYPE_p_Halide__Runtime__BufferT_void_const_t, int i2, int i3) {
        return new SWIGTYPE_p_Halide__Runtime__BufferT_void_const_t(GcamModuleJNI.AdjustRawBufferMins(i, SWIGTYPE_p_Halide__Runtime__BufferT_void_const_t.getCPtr(sWIGTYPE_p_Halide__Runtime__BufferT_void_const_t), i2, i3), true);
    }

    public static void AdjustRawVignetting(RawVignetteParams rawVignetteParams, SpatialGainMap spatialGainMap) {
        GcamModuleJNI.AdjustRawVignetting(RawVignetteParams.getCPtr(rawVignetteParams), rawVignetteParams, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap);
    }

    public static void ApplyAntibanding(int i, boolean z, float f, SWIGTYPE_p_float sWIGTYPE_p_float, SWIGTYPE_p_float sWIGTYPE_p_float2) {
        GcamModuleJNI.ApplyAntibanding(i, z, f, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float), SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float2));
    }

    public static void ApplyBlsAndSgm(SpatialGainMap spatialGainMap, float[] fArr, int i, InterleavedWriteViewU16 interleavedWriteViewU16) {
        GcamModuleJNI.ApplyBlsAndSgm(SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, fArr, i, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }

    public static boolean ApplyColorSaturation(InterleavedWriteViewU8 interleavedWriteViewU8, ColorSatParams colorSatParams, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context) {
        return GcamModuleJNI.ApplyColorSaturation(InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8), interleavedWriteViewU8, ColorSatParams.getCPtr(colorSatParams), colorSatParams, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context));
    }

    public static boolean BayerPatternColors(int i, short[] sArr) {
        return GcamModuleJNI.BayerPatternColors(i, sArr);
    }

    public static int BayerPatternFromColors(short[] sArr) {
        return GcamModuleJNI.BayerPatternFromColors(sArr);
    }

    public static boolean CheckBlackRegions(PixelRectVector pixelRectVector, StaticMetadata staticMetadata) {
        return GcamModuleJNI.CheckBlackRegions(PixelRectVector.getCPtr(pixelRectVector), pixelRectVector, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public static String ConvertBurstMetadataToString(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t) {
        return GcamModuleJNI.ConvertBurstMetadataToString(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t));
    }

    public static String ConvertShotParamsToString(ShotParams shotParams) {
        return GcamModuleJNI.ConvertShotParamsToString(ShotParams.getCPtr(shotParams), shotParams);
    }

    public static String ConvertStaticMetadataToString(StaticMetadata staticMetadata) {
        return GcamModuleJNI.ConvertStaticMetadataToString(StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public static FaceInfo CropFaceInfo(FaceInfo faceInfo, PixelRect pixelRect, int i, int i2) {
        return new FaceInfo(GcamModuleJNI.CropFaceInfo(FaceInfo.getCPtr(faceInfo), faceInfo, PixelRect.getCPtr(pixelRect), pixelRect, i, i2), true);
    }

    public static boolean CropInDngMetadata(int i) {
        return GcamModuleJNI.CropInDngMetadata(i);
    }

    public static InterleavedImageU8 DecodeJpgFromDisk(String str) {
        return new InterleavedImageU8(GcamModuleJNI.DecodeJpgFromDisk__SWIG_1(str), true);
    }

    public static InterleavedImageU8 DecodeJpgFromDisk(String str, ExifMetadata exifMetadata) {
        return new InterleavedImageU8(GcamModuleJNI.DecodeJpgFromDisk__SWIG_0(str, ExifMetadata.getCPtr(exifMetadata), exifMetadata), true);
    }

    public static InterleavedImageU8 DecodeJpgFromMemory(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j) {
        return new InterleavedImageU8(GcamModuleJNI.DecodeJpgFromMemory__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j), true);
    }

    public static InterleavedImageU8 DecodeJpgFromMemory(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, ExifMetadata exifMetadata) {
        return new InterleavedImageU8(GcamModuleJNI.DecodeJpgFromMemory__SWIG_0(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j, ExifMetadata.getCPtr(exifMetadata), exifMetadata), true);
    }

    public static boolean DeserializeBurstMetadata(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t) {
        return GcamModuleJNI.DeserializeBurstMetadata(SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t));
    }

    public static boolean EncodeGcamExif(int i, int i2, ExifMetadata exifMetadata, SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr) {
        return GcamModuleJNI.EncodeGcamExif(i, i2, ExifMetadata.getCPtr(exifMetadata), exifMetadata, SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr);
    }

    public static float EstimateSnr(FrameMetadata frameMetadata) {
        return GcamModuleJNI.EstimateSnr(FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public static NormalizedRect FaceInfoToNormalizedRect(FaceInfo faceInfo, int i, int i2, boolean z) {
        return new NormalizedRect(GcamModuleJNI.FaceInfoToNormalizedRect__SWIG_1(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z), true);
    }

    public static NormalizedRect FaceInfoToNormalizedRect(FaceInfo faceInfo, int i, int i2, boolean z, int i3) {
        return new NormalizedRect(GcamModuleJNI.FaceInfoToNormalizedRect__SWIG_0(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z, i3), true);
    }

    public static PixelRect FaceInfoToPixelRect(FaceInfo faceInfo, int i, int i2, boolean z) {
        return new PixelRect(GcamModuleJNI.FaceInfoToPixelRect__SWIG_1(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z), true);
    }

    public static PixelRect FaceInfoToPixelRect(FaceInfo faceInfo, int i, int i2, boolean z, int i3) {
        return new PixelRect(GcamModuleJNI.FaceInfoToPixelRect__SWIG_0(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z, i3), true);
    }

    public static TetFactorization FactorizeTet(TetModel tetModel, float f, float f2, FactorizeTetOptions factorizeTetOptions) {
        return new TetFactorization(GcamModuleJNI.FactorizeTet__SWIG_2(TetModel.getCPtr(tetModel), tetModel, f, f2, FactorizeTetOptions.getCPtr(factorizeTetOptions), factorizeTetOptions), true);
    }

    public static TetFactorization FactorizeTet(TetModel tetModel, float f, float f2, FactorizeTetOptions factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver) {
        return new TetFactorization(GcamModuleJNI.FactorizeTet__SWIG_1(TetModel.getCPtr(tetModel), tetModel, f, f2, FactorizeTetOptions.getCPtr(factorizeTetOptions), factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver)), true);
    }

    public static TetFactorization FactorizeTet(TetModel tetModel, float f, float f2, FactorizeTetOptions factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, int i) {
        return new TetFactorization(GcamModuleJNI.FactorizeTet__SWIG_0(TetModel.getCPtr(tetModel), tetModel, f, f2, FactorizeTetOptions.getCPtr(factorizeTetOptions), factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), i), true);
    }

    public static void FixOldWbGains(AwbInfo awbInfo) {
        GcamModuleJNI.FixOldWbGains(AwbInfo.getCPtr(awbInfo), awbInfo);
    }

    public static SpatialGainMap GenParameterizedSpatialGainMap(int i, int i2, float f, float f2, float f3) {
        return new SpatialGainMap(GcamModuleJNI.GenParameterizedSpatialGainMap(i, i2, f, f2, f3), true);
    }

    public static SpatialGainMap GenSpatialGainMap_Flat() {
        return new SpatialGainMap(GcamModuleJNI.GenSpatialGainMap_Flat(), true);
    }

    public static SpatialGainMap GenSpatialGainMap_N5_N6() {
        return new SpatialGainMap(GcamModuleJNI.GenSpatialGainMap_N5_N6(), true);
    }

    public static SpatialGainMap GenSpatialGainMap_Typical() {
        return new SpatialGainMap(GcamModuleJNI.GenSpatialGainMap_Typical(), true);
    }

    public static AwbInfo GetAwbForTet(float f, TetToAwb tetToAwb, boolean z) {
        return new AwbInfo(GcamModuleJNI.GetAwbForTet(f, TetToAwb.getCPtr(tetToAwb), tetToAwb, z), true);
    }

    public static int GetBitsPerPixel(int i) {
        return GcamModuleJNI.GetBitsPerPixel(i);
    }

    public static FileSaver GetCustomFileSaver() {
        long GetCustomFileSaver = GcamModuleJNI.GetCustomFileSaver();
        return GetCustomFileSaver != 0 ? new FileSaver(GetCustomFileSaver, false) : null;
    }

    public static boolean GetDirtyLensRawScore(InterleavedReadViewU8 interleavedReadViewU8, float[] fArr) {
        return GcamModuleJNI.GetDirtyLensRawScore__SWIG_0(InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, fArr);
    }

    public static boolean GetDirtyLensRawScore(YuvReadView yuvReadView, float[] fArr) {
        return GcamModuleJNI.GetDirtyLensRawScore__SWIG_1(YuvReadView.getCPtr(yuvReadView), yuvReadView, fArr);
    }

    public static boolean GetDirtyLensRawScoreFromJpegInMemory(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, float[] fArr) {
        return GcamModuleJNI.GetDirtyLensRawScoreFromJpegInMemory(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j, fArr);
    }

    public static FactorizeTetOptions GetFactorizeTetOptions(Tuning tuning, StaticMetadata staticMetadata) {
        return new FactorizeTetOptions(GcamModuleJNI.GetFactorizeTetOptions(Tuning.getCPtr(tuning), tuning, StaticMetadata.getCPtr(staticMetadata), staticMetadata), true);
    }

    public static void GetFinalDngImageSize(InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2) {
        GcamModuleJNI.GetFinalDngImageSize(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2));
    }

    public static long GetGcamImageMemCurrent() {
        return GcamModuleJNI.GetGcamImageMemCurrent();
    }

    public static long GetGcamImageMemPeak() {
        return GcamModuleJNI.GetGcamImageMemPeak();
    }

    public static boolean GetIccProfileData(int i, SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, SWIGTYPE_p_unsigned_long sWIGTYPE_p_unsigned_long) {
        return GcamModuleJNI.GetIccProfileData(i, SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), SWIGTYPE_p_unsigned_long.getCPtr(sWIGTYPE_p_unsigned_long));
    }

    public static int GetNumChannels(int i) {
        return GcamModuleJNI.GetNumChannels(i);
    }

    public static int GetRandomBayerPattern() {
        return GcamModuleJNI.GetRandomBayerPattern();
    }

    public static FaceInfo GetRandomFaceInfo() {
        return new FaceInfo(GcamModuleJNI.GetRandomFaceInfo(), true);
    }

    public static FrameMetadata GetRandomFrameMetadata() {
        return new FrameMetadata(GcamModuleJNI.GetRandomFrameMetadata(), true);
    }

    public static InitParams GetRandomInitParams() {
        return new InitParams(GcamModuleJNI.GetRandomInitParams(), true);
    }

    public static int GetRandomPixelFormat() {
        return GcamModuleJNI.GetRandomPixelFormat();
    }

    public static ShotParams GetRandomShotParams(InitParams initParams) {
        return new ShotParams(GcamModuleJNI.GetRandomShotParams(InitParams.getCPtr(initParams), initParams), true);
    }

    public static StaticMetadata GetRandomStaticMetadata() {
        return new StaticMetadata(GcamModuleJNI.GetRandomStaticMetadata(), true);
    }

    public static AwbInfo GetRandomWhiteBalance() {
        return new AwbInfo(GcamModuleJNI.GetRandomWhiteBalance(), true);
    }

    public static void GetRawBufferBounds(int i, SWIGTYPE_p_Halide__Runtime__BufferT_void_const_t sWIGTYPE_p_Halide__Runtime__BufferT_void_const_t, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2, SWIGTYPE_p_int sWIGTYPE_p_int3, SWIGTYPE_p_int sWIGTYPE_p_int4) {
        GcamModuleJNI.GetRawBufferBounds(i, SWIGTYPE_p_Halide__Runtime__BufferT_void_const_t.getCPtr(sWIGTYPE_p_Halide__Runtime__BufferT_void_const_t), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int3), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int4));
    }

    public static int GetRawCropping(ShotParams shotParams, ShotCallbacks shotCallbacks) {
        return GcamModuleJNI.GetRawCropping(ShotParams.getCPtr(shotParams), shotParams, ShotCallbacks.getCPtr(shotCallbacks), shotCallbacks);
    }

    public static void GetRotatedImageSize(int i, int i2, int i3, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2) {
        GcamModuleJNI.GetRotatedImageSize(i, i2, i3, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2));
    }

    public static boolean GetTuning(StaticMetadata staticMetadata, boolean z, Tuning tuning) {
        return GcamModuleJNI.GetTuning__SWIG_1(StaticMetadata.getCPtr(staticMetadata), staticMetadata, z, Tuning.getCPtr(tuning), tuning);
    }

    public static boolean GetTuning(String str, String str2, int i, boolean z, Tuning tuning) {
        return GcamModuleJNI.GetTuning__SWIG_0(str, str2, i, z, Tuning.getCPtr(tuning), tuning);
    }

    public static String GetVersion() {
        return GcamModuleJNI.GetVersion();
    }

    public static void InitCustomFileSaver(FileSaver fileSaver) {
        GcamModuleJNI.InitCustomFileSaver(FileSaver.getCPtr(fileSaver), fileSaver);
    }

    public static void InitCustomMemoryAllocator(SWIGTYPE_p_f_unsigned_long__p_void sWIGTYPE_p_f_unsigned_long__p_void, SWIGTYPE_p_f_p_void__void sWIGTYPE_p_f_p_void__void) {
        GcamModuleJNI.InitCustomMemoryAllocator(SWIGTYPE_p_f_unsigned_long__p_void.getCPtr(sWIGTYPE_p_f_unsigned_long__p_void), SWIGTYPE_p_f_p_void__void.getCPtr(sWIGTYPE_p_f_p_void__void));
    }

    public static AwbInfo InterpolateWb(AwbInfo awbInfo, AwbInfo awbInfo2, float f) {
        return new AwbInfo(GcamModuleJNI.InterpolateWb(AwbInfo.getCPtr(awbInfo), awbInfo, AwbInfo.getCPtr(awbInfo2), awbInfo2, f), true);
    }

    public static PixelRect Intersect(PixelRect pixelRect, PixelRect pixelRect2) {
        return new PixelRect(GcamModuleJNI.Intersect(PixelRect.getCPtr(pixelRect), pixelRect, PixelRect.getCPtr(pixelRect2), pixelRect2), true);
    }

    public static boolean IsEasel(int i) {
        return GcamModuleJNI.IsEasel(i);
    }

    public static boolean IsMergedRawFullSized(int i) {
        return GcamModuleJNI.IsMergedRawFullSized(i);
    }

    public static boolean IsPlanar(int i) {
        return GcamModuleJNI.IsPlanar(i);
    }

    public static boolean IsRgb(int i) {
        return GcamModuleJNI.IsRgb(i);
    }

    public static boolean IsYuv(int i) {
        return GcamModuleJNI.IsYuv(i);
    }

    public static RawVignetteParams Lerp(RawVignetteParams rawVignetteParams, RawVignetteParams rawVignetteParams2, float f) {
        return new RawVignetteParams(GcamModuleJNI.Lerp(RawVignetteParams.getCPtr(rawVignetteParams), rawVignetteParams, RawVignetteParams.getCPtr(rawVignetteParams2), rawVignetteParams2, f), true);
    }

    public static ChromaticAberrationParams MakeRandomChromaticAberrationParams() {
        return new ChromaticAberrationParams(GcamModuleJNI.MakeRandomChromaticAberrationParams(), true);
    }

    public static DenoiseParams MakeRandomDenoiseParams() {
        return new DenoiseParams(GcamModuleJNI.MakeRandomDenoiseParams(), true);
    }

    public static RawSharpenParams MakeRandomSharpenParams() {
        return new RawSharpenParams(GcamModuleJNI.MakeRandomSharpenParams(), true);
    }

    public static SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t MakeSharpenCurve(float f, float f2, float f3) {
        return new SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t(GcamModuleJNI.MakeSharpenCurve(f, f2, f3), true);
    }

    public static TetWaypoint MakeTetWaypoint(float f, float f2) {
        return new TetWaypoint(GcamModuleJNI.MakeTetWaypoint(f, f2), true);
    }

    public static FaceInfo PixelRectToFaceInfo(PixelRect pixelRect, float f, int i, int i2) {
        return new FaceInfo(GcamModuleJNI.PixelRectToFaceInfo__SWIG_1(PixelRect.getCPtr(pixelRect), pixelRect, f, i, i2), true);
    }

    public static FaceInfo PixelRectToFaceInfo(PixelRect pixelRect, float f, int i, int i2, int i3) {
        return new FaceInfo(GcamModuleJNI.PixelRectToFaceInfo__SWIG_0(PixelRect.getCPtr(pixelRect), pixelRect, f, i, i2, i3), true);
    }

    public static void PrintColorTemps(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t) {
        GcamModuleJNI.PrintColorTemps(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t));
    }

    public static InterleavedImageU8 RawFinishPreview(RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, StaticMetadata staticMetadata, NormalizedRect normalizedRect, int i, int i2, int i3, NormalizedRect normalizedRect2, WeightedNormalizedRectVector weightedNormalizedRectVector, float f) {
        return new InterleavedImageU8(GcamModuleJNI.RawFinishPreview__SWIG_1(RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, StaticMetadata.getCPtr(staticMetadata), staticMetadata, NormalizedRect.getCPtr(normalizedRect), normalizedRect, i, i2, i3, NormalizedRect.getCPtr(normalizedRect2), normalizedRect2, WeightedNormalizedRectVector.getCPtr(weightedNormalizedRectVector), weightedNormalizedRectVector, f), true);
    }

    public static InterleavedImageU8 RawFinishPreview(String str, RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, StaticMetadata staticMetadata, NormalizedRect normalizedRect, int i, int i2, int i3, Tuning tuning, float f, float f2, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__SaveInfo sWIGTYPE_p_gcam__SaveInfo) {
        return new InterleavedImageU8(GcamModuleJNI.RawFinishPreview__SWIG_0(str, RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, StaticMetadata.getCPtr(staticMetadata), staticMetadata, NormalizedRect.getCPtr(normalizedRect), normalizedRect, i, i2, i3, Tuning.getCPtr(tuning), tuning, f, f2, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__SaveInfo.getCPtr(sWIGTYPE_p_gcam__SaveInfo)), true);
    }

    public static boolean ReadDngMetadata(String str, ExifMetadata exifMetadata) {
        return GcamModuleJNI.ReadDngMetadata(str, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean ReadDngMetadataFromMemory(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, ExifMetadata exifMetadata) {
        return GcamModuleJNI.ReadDngMetadataFromMemory(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static int ReverseRotation(int i) {
        return GcamModuleJNI.ReverseRotation(i);
    }

    public static void RggbPositions(int i, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2, SWIGTYPE_p_int sWIGTYPE_p_int3, SWIGTYPE_p_int sWIGTYPE_p_int4, SWIGTYPE_p_int sWIGTYPE_p_int5, SWIGTYPE_p_int sWIGTYPE_p_int6, SWIGTYPE_p_int sWIGTYPE_p_int7, SWIGTYPE_p_int sWIGTYPE_p_int8) {
        GcamModuleJNI.RggbPositions(i, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int3), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int4), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int5), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int6), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int7), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int8));
    }

    public static void RotateCoordinates(int i, int i2, int i3, int i4, int i5, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2) {
        GcamModuleJNI.RotateCoordinates(i, i2, i3, i4, i5, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2));
    }

    public static void RotateNormalizedCoordinates(float f, float f2, int i, SWIGTYPE_p_float sWIGTYPE_p_float, SWIGTYPE_p_float sWIGTYPE_p_float2) {
        GcamModuleJNI.RotateNormalizedCoordinates(f, f2, i, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float), SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float2));
    }

    public static void SerializeBurstMetadata(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t, SWIGTYPE_p_std__string sWIGTYPE_p_std__string, int i) {
        GcamModuleJNI.SerializeBurstMetadata(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t), SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), i);
    }

    public static boolean ShouldCropBeforeMerge(int i) {
        return GcamModuleJNI.ShouldCropBeforeMerge(i);
    }

    public static void SuppressRowArtifacts(FloatVector floatVector, int i, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, RawWriteView rawWriteView) {
        GcamModuleJNI.SuppressRowArtifacts__SWIG_1(FloatVector.getCPtr(floatVector), floatVector, i, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public static void SuppressRowArtifacts(FloatVector floatVector, SWIGTYPE_p_std__vectorT_gcam__RowPattern_t sWIGTYPE_p_std__vectorT_gcam__RowPattern_t, int i, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, RawWriteView rawWriteView) {
        GcamModuleJNI.SuppressRowArtifacts__SWIG_0(FloatVector.getCPtr(floatVector), floatVector, SWIGTYPE_p_std__vectorT_gcam__RowPattern_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__RowPattern_t), i, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public static void SuppressRowArtifacts(SWIGTYPE_p_std__vectorT_gcam__RowPattern_t sWIGTYPE_p_std__vectorT_gcam__RowPattern_t, int i, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, RawWriteView rawWriteView) {
        GcamModuleJNI.SuppressRowArtifacts__SWIG_2(SWIGTYPE_p_std__vectorT_gcam__RowPattern_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__RowPattern_t), i, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public static int TextToAeState(String str) {
        return GcamModuleJNI.TextToAeState(str);
    }

    public static int TextToAeType(String str) {
        return GcamModuleJNI.TextToAeType(str);
    }

    public static int TextToAfState(String str) {
        return GcamModuleJNI.TextToAfState(str);
    }

    public static int TextToBayerPattern(String str) {
        return GcamModuleJNI.TextToBayerPattern(str);
    }

    public static int TextToExecuteOn(String str) {
        return GcamModuleJNI.TextToExecuteOn(str);
    }

    public static int TextToFlashMetadata(String str) {
        return GcamModuleJNI.TextToFlashMetadata(str);
    }

    public static int TextToFlashMode(String str) {
        return GcamModuleJNI.TextToFlashMode(str);
    }

    public static int TextToGcamPixelFormat(String str) {
        return GcamModuleJNI.TextToGcamPixelFormat(str);
    }

    public static int TextToGeometricCorrection(String str) {
        return GcamModuleJNI.TextToGeometricCorrection(str);
    }

    public static int TextToHdrMode(String str) {
        return GcamModuleJNI.TextToHdrMode(str);
    }

    public static int TextToIccProfile(String str) {
        return GcamModuleJNI.TextToIccProfile(str);
    }

    public static int TextToImageRotation(String str) {
        return GcamModuleJNI.TextToImageRotation(str);
    }

    public static int TextToLensState(String str) {
        return GcamModuleJNI.TextToLensState(str);
    }

    public static int TextToRawCropping(String str) {
        return GcamModuleJNI.TextToRawCropping(str);
    }

    public static int TextToResamplingMethod(String str) {
        return GcamModuleJNI.TextToResamplingMethod(str);
    }

    public static int TextToSceneFlicker(String str) {
        return GcamModuleJNI.TextToSceneFlicker(str);
    }

    public static int TextToWhiteBalanceMode(String str) {
        return GcamModuleJNI.TextToWhiteBalanceMode(str);
    }

    public static int TextToYuvFormat(String str) {
        return GcamModuleJNI.TextToYuvFormat(str);
    }

    public static String ToText(int i) {
        return GcamModuleJNI.ToText__SWIG_0(i);
    }

    public static int ToYuvFormat(int i) {
        return GcamModuleJNI.ToYuvFormat(i);
    }

    public static SWIGTYPE_p_void TrackedMemoryAllocate(long j) {
        long TrackedMemoryAllocate = GcamModuleJNI.TrackedMemoryAllocate(j);
        return TrackedMemoryAllocate != 0 ? new SWIGTYPE_p_void(TrackedMemoryAllocate, false) : null;
    }

    public static void TrackedMemoryDeallocate(SWIGTYPE_p_void sWIGTYPE_p_void) {
        GcamModuleJNI.TrackedMemoryDeallocate(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void));
    }

    public static void WriteAeToShotLogData(AeResults aeResults, ShotLogData shotLogData) {
        GcamModuleJNI.WriteAeToShotLogData(AeResults.getCPtr(aeResults), aeResults, ShotLogData.getCPtr(shotLogData), shotLogData);
    }

    public static boolean WriteDng(String str, InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteDng__SWIG_2(str, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteDng(String str, InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata, boolean z) {
        return GcamModuleJNI.WriteDng__SWIG_1(str, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z);
    }

    public static boolean WriteDng(String str, InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata, boolean z, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context) {
        return GcamModuleJNI.WriteDng__SWIG_0(str, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context));
    }

    public static boolean WriteDng(String str, RawReadView rawReadView, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteDng__SWIG_5(str, RawReadView.getCPtr(rawReadView), rawReadView, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteDng(String str, RawReadView rawReadView, ExifMetadata exifMetadata, boolean z) {
        return GcamModuleJNI.WriteDng__SWIG_4(str, RawReadView.getCPtr(rawReadView), rawReadView, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z);
    }

    public static boolean WriteDng(String str, RawReadView rawReadView, ExifMetadata exifMetadata, boolean z, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context) {
        return GcamModuleJNI.WriteDng__SWIG_3(str, RawReadView.getCPtr(rawReadView), rawReadView, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context));
    }

    public static boolean WriteDngToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteDngToMemory__SWIG_2(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteDngToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata, boolean z) {
        return GcamModuleJNI.WriteDngToMemory__SWIG_1(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z);
    }

    public static boolean WriteDngToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, InterleavedReadViewU16 interleavedReadViewU16, ExifMetadata exifMetadata, boolean z, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context) {
        return GcamModuleJNI.WriteDngToMemory__SWIG_0(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context));
    }

    public static boolean WriteDngToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, RawReadView rawReadView, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteDngToMemory__SWIG_5(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, RawReadView.getCPtr(rawReadView), rawReadView, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteDngToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, RawReadView rawReadView, ExifMetadata exifMetadata, boolean z) {
        return GcamModuleJNI.WriteDngToMemory__SWIG_4(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, RawReadView.getCPtr(rawReadView), rawReadView, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z);
    }

    public static boolean WriteDngToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, RawReadView rawReadView, ExifMetadata exifMetadata, boolean z, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context) {
        return GcamModuleJNI.WriteDngToMemory__SWIG_3(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, RawReadView.getCPtr(rawReadView), rawReadView, ExifMetadata.getCPtr(exifMetadata), exifMetadata, z, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context));
    }

    public static boolean WriteEmptyFile(String str) {
        return GcamModuleJNI.WriteEmptyFile(str);
    }

    public static boolean WriteJpg(String str, InterleavedReadViewU8 interleavedReadViewU8) {
        return GcamModuleJNI.WriteJpg__SWIG_2(str, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8);
    }

    public static boolean WriteJpg(String str, InterleavedReadViewU8 interleavedReadViewU8, int i) {
        return GcamModuleJNI.WriteJpg__SWIG_1(str, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i);
    }

    public static boolean WriteJpg(String str, InterleavedReadViewU8 interleavedReadViewU8, int i, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteJpg__SWIG_0(str, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteJpg(String str, YuvReadView yuvReadView, int i, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteJpg__SWIG_3(str, YuvReadView.getCPtr(yuvReadView), yuvReadView, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteJpgToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, InterleavedReadViewU8 interleavedReadViewU8) {
        return GcamModuleJNI.WriteJpgToMemory__SWIG_2(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8);
    }

    public static boolean WriteJpgToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, InterleavedReadViewU8 interleavedReadViewU8, int i) {
        return GcamModuleJNI.WriteJpgToMemory__SWIG_1(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i);
    }

    public static boolean WriteJpgToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, InterleavedReadViewU8 interleavedReadViewU8, int i, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteJpgToMemory__SWIG_0(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteJpgToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, YuvReadView yuvReadView) {
        return GcamModuleJNI.WriteJpgToMemory__SWIG_5(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, YuvReadView.getCPtr(yuvReadView), yuvReadView);
    }

    public static boolean WriteJpgToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, YuvReadView yuvReadView, int i) {
        return GcamModuleJNI.WriteJpgToMemory__SWIG_4(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, YuvReadView.getCPtr(yuvReadView), yuvReadView, i);
    }

    public static boolean WriteJpgToMemory(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr, YuvReadView yuvReadView, int i, ExifMetadata exifMetadata) {
        return GcamModuleJNI.WriteJpgToMemory__SWIG_3(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), jArr, YuvReadView.getCPtr(yuvReadView), yuvReadView, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public static boolean WriteMemoryToFile(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, String str) {
        return GcamModuleJNI.WriteMemoryToFile(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j, str);
    }

    public static boolean WriteStringToFile(String str, String str2) {
        return GcamModuleJNI.WriteStringToFile(str, str2);
    }

    public static boolean YuvFormatsHaveUvSwapped(int i, int i2) {
        return GcamModuleJNI.YuvFormatsHaveUvSwapped(i, i2);
    }

    public static SWIGTYPE_p_unsigned_char copy_uint8_p(short s) {
        long copy_uint8_p = GcamModuleJNI.copy_uint8_p(s);
        return copy_uint8_p != 0 ? new SWIGTYPE_p_unsigned_char(copy_uint8_p, false) : null;
    }

    public static SWIGTYPE_p_p_unsigned_char copy_uint8_p_p(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        long copy_uint8_p_p = GcamModuleJNI.copy_uint8_p_p(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char));
        return copy_uint8_p_p != 0 ? new SWIGTYPE_p_p_unsigned_char(copy_uint8_p_p, false) : null;
    }

    public static void delete_uint8_array(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        GcamModuleJNI.delete_uint8_array(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char));
    }

    public static void delete_uint8_p(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        GcamModuleJNI.delete_uint8_p(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char));
    }

    public static void delete_uint8_p_p(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char) {
        GcamModuleJNI.delete_uint8_p_p(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char));
    }

    public static void free_uint8_p(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        GcamModuleJNI.free_uint8_p(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char));
    }

    public static long getGCAM_SAVE_INPUT_METADATA() {
        return GcamModuleJNI.GCAM_SAVE_INPUT_METADATA_get();
    }

    public static long getGCAM_SAVE_INPUT_METERING() {
        return GcamModuleJNI.GCAM_SAVE_INPUT_METERING_get();
    }

    public static long getGCAM_SAVE_INPUT_PAYLOAD() {
        return GcamModuleJNI.GCAM_SAVE_INPUT_PAYLOAD_get();
    }

    public static long getGCAM_SAVE_NONE() {
        return GcamModuleJNI.GCAM_SAVE_NONE_get();
    }

    public static long getGCAM_SAVE_OTHER_TEXT() {
        return GcamModuleJNI.GCAM_SAVE_OTHER_TEXT_get();
    }

    public static long getGCAM_SAVE_TEXT() {
        return GcamModuleJNI.GCAM_SAVE_TEXT_get();
    }

    public static int getKBguDownsampleFactor() {
        return GcamModuleJNI.kBguDownsampleFactor_get();
    }

    public static int getKChromaLutSizeUV() {
        return GcamModuleJNI.kChromaLutSizeUV_get();
    }

    public static int getKChromaLutSizeY() {
        return GcamModuleJNI.kChromaLutSizeY_get();
    }

    public static int getKColorTempUnknown() {
        return GcamModuleJNI.kColorTempUnknown_get();
    }

    public static int getKDebugFullMeteringSweepFrameCount() {
        return GcamModuleJNI.kDebugFullMeteringSweepFrameCount_get();
    }

    public static int getKDefaultFullMeteringSweepFrameCount() {
        return GcamModuleJNI.kDefaultFullMeteringSweepFrameCount_get();
    }

    public static int getKDefaultIpuCaRadius() {
        return GcamModuleJNI.kDefaultIpuCaRadius_get();
    }

    public static int getKDefaultJpgQuality() {
        return GcamModuleJNI.kDefaultJpgQuality_get();
    }

    public static int getKDefaultJpgQualityThumbnail() {
        return GcamModuleJNI.kDefaultJpgQualityThumbnail_get();
    }

    public static int getKDefaultMaxPayloadFrames() {
        return GcamModuleJNI.kDefaultMaxPayloadFrames_get();
    }

    public static int getKDefaultMinPayloadFrames() {
        return GcamModuleJNI.kDefaultMinPayloadFrames_get();
    }

    public static int getKDefaultPostviewLongestEdge() {
        return GcamModuleJNI.kDefaultPostviewLongestEdge_get();
    }

    public static int getKDenoiseFreqCount() {
        return GcamModuleJNI.kDenoiseFreqCount_get();
    }

    public static String getKInitParamsFilename() {
        return GcamModuleJNI.kInitParamsFilename_get();
    }

    public static long getKInvalidAllocationId() {
        return GcamModuleJNI.kInvalidAllocationId_get();
    }

    public static long getKInvalidImageId() {
        return GcamModuleJNI.kInvalidImageId_get();
    }

    public static float getKInvalidMotionScore() {
        return GcamModuleJNI.kInvalidMotionScore_get();
    }

    public static int getKInvalidShotId() {
        return GcamModuleJNI.kInvalidShotId_get();
    }

    public static int getKIpuRawFinishAlignmentX() {
        return GcamModuleJNI.kIpuRawFinishAlignmentX_get();
    }

    public static int getKIpuRawFinishAlignmentY() {
        return GcamModuleJNI.kIpuRawFinishAlignmentY_get();
    }

    public static int getKLegacySensorIdPrimary() {
        return GcamModuleJNI.kLegacySensorIdPrimary_get();
    }

    public static int getKLegacySensorIdSecondary() {
        return GcamModuleJNI.kLegacySensorIdSecondary_get();
    }

    public static int getKLinearYuvPrecision() {
        return GcamModuleJNI.kLinearYuvPrecision_get();
    }

    public static int getKLinearYuvWhiteLevel() {
        return GcamModuleJNI.kLinearYuvWhiteLevel_get();
    }

    public static int getKLog2ChromaLutSizeUV() {
        return GcamModuleJNI.kLog2ChromaLutSizeUV_get();
    }

    public static int getKLog2ChromaLutSizeY() {
        return GcamModuleJNI.kLog2ChromaLutSizeY_get();
    }

    public static int getKMaxFullMeteringSweepFrames() {
        return GcamModuleJNI.kMaxFullMeteringSweepFrames_get();
    }

    public static int getKMaxJpgQuality() {
        return GcamModuleJNI.kMaxJpgQuality_get();
    }

    public static float getKMaxMotionScore() {
        return GcamModuleJNI.kMaxMotionScore_get();
    }

    public static float getKMaxOverallGainSlopFactor() {
        return GcamModuleJNI.kMaxOverallGainSlopFactor_get();
    }

    public static int getKMaxTetWaypoints() {
        return GcamModuleJNI.kMaxTetWaypoints_get();
    }

    public static int getKMaxValidColorTemp() {
        return GcamModuleJNI.kMaxValidColorTemp_get();
    }

    public static String getKMeteringBurstFrameMetadataFilename() {
        return GcamModuleJNI.kMeteringBurstFrameMetadataFilename_get();
    }

    public static String getKMeteringBurstSpecFilename() {
        return GcamModuleJNI.kMeteringBurstSpecFilename_get();
    }

    public static float getKMinDigitalZoomRatio() {
        return GcamModuleJNI.kMinDigitalZoomRatio_get();
    }

    public static int getKMinFullMeteringSweepFrames() {
        return GcamModuleJNI.kMinFullMeteringSweepFrames_get();
    }

    public static int getKMinJpgQuality() {
        return GcamModuleJNI.kMinJpgQuality_get();
    }

    public static float getKMinMotionScore() {
        return GcamModuleJNI.kMinMotionScore_get();
    }

    public static int getKMinPayloadFrames() {
        return GcamModuleJNI.kMinPayloadFrames_get();
    }

    public static int getKMinValidColorTemp() {
        return GcamModuleJNI.kMinValidColorTemp_get();
    }

    public static String getKPayloadBurstFrameMetadataFilename() {
        return GcamModuleJNI.kPayloadBurstFrameMetadataFilename_get();
    }

    public static String getKPayloadBurstSpecFilename() {
        return GcamModuleJNI.kPayloadBurstSpecFilename_get();
    }

    public static int getKPdCurrentVersion() {
        return GcamModuleJNI.kPdCurrentVersion_get();
    }

    public static int getKRawFinishAlignmentX() {
        return GcamModuleJNI.kRawFinishAlignmentX_get();
    }

    public static int getKRawFinishAlignmentY() {
        return GcamModuleJNI.kRawFinishAlignmentY_get();
    }

    public static int getKRawFinishMaxInputWhiteLevel() {
        return GcamModuleJNI.kRawFinishMaxInputWhiteLevel_get();
    }

    public static int getKRawFinishMinInputWhiteLevel() {
        return GcamModuleJNI.kRawFinishMinInputWhiteLevel_get();
    }

    public static int getKRawFinishPrecision() {
        return GcamModuleJNI.kRawFinishPrecision_get();
    }

    public static boolean getKRawFinishUseBgu() {
        return GcamModuleJNI.kRawFinishUseBgu_get();
    }

    public static int getKRawFinishWhiteLevel() {
        return GcamModuleJNI.kRawFinishWhiteLevel_get();
    }

    public static int getKRawPixelMaxValue() {
        return GcamModuleJNI.kRawPixelMaxValue_get();
    }

    public static int getKRawSharpenCurveSize() {
        return GcamModuleJNI.kRawSharpenCurveSize_get();
    }

    public static int getKRawSharpenFreqCount() {
        return GcamModuleJNI.kRawSharpenFreqCount_get();
    }

    public static int getKSensorTempUnknown() {
        return GcamModuleJNI.kSensorTempUnknown_get();
    }

    public static String getKShotParamsFilename() {
        return GcamModuleJNI.kShotParamsFilename_get();
    }

    public static String getKStaticMetadataFilename() {
        return GcamModuleJNI.kStaticMetadataFilename_get();
    }

    public static int getKThrowOutOneInNBlurryImages() {
        return GcamModuleJNI.kThrowOutOneInNBlurryImages_get();
    }

    public static int getKTonemappedYuvPrecision() {
        return GcamModuleJNI.kTonemappedYuvPrecision_get();
    }

    public static int getKTonemappedYuvWhiteLevel() {
        return GcamModuleJNI.kTonemappedYuvWhiteLevel_get();
    }

    public static String getKUnusedLoggingMetadataFilename() {
        return GcamModuleJNI.kUnusedLoggingMetadataFilename_get();
    }

    public static SWIGTYPE_p_unsigned_char new_uint8_array(int i) {
        long new_uint8_array = GcamModuleJNI.new_uint8_array(i);
        return new_uint8_array != 0 ? new SWIGTYPE_p_unsigned_char(new_uint8_array, false) : null;
    }

    public static SWIGTYPE_p_unsigned_char new_uint8_p() {
        long new_uint8_p = GcamModuleJNI.new_uint8_p();
        return new_uint8_p != 0 ? new SWIGTYPE_p_unsigned_char(new_uint8_p, false) : null;
    }

    public static SWIGTYPE_p_p_unsigned_char new_uint8_p_p() {
        long new_uint8_p_p = GcamModuleJNI.new_uint8_p_p();
        return new_uint8_p_p != 0 ? new SWIGTYPE_p_p_unsigned_char(new_uint8_p_p, false) : null;
    }

    public static void setKMeteringBurstFrameMetadataFilename(String str) {
        GcamModuleJNI.kMeteringBurstFrameMetadataFilename_set(str);
    }

    public static void setKMeteringBurstSpecFilename(String str) {
        GcamModuleJNI.kMeteringBurstSpecFilename_set(str);
    }

    public static void setKPayloadBurstFrameMetadataFilename(String str) {
        GcamModuleJNI.kPayloadBurstFrameMetadataFilename_set(str);
    }

    public static void setKPayloadBurstSpecFilename(String str) {
        GcamModuleJNI.kPayloadBurstSpecFilename_set(str);
    }

    public static void setKUnusedLoggingMetadataFilename(String str) {
        GcamModuleJNI.kUnusedLoggingMetadataFilename_set(str);
    }

    public static short uint8_array_getitem(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, int i) {
        return GcamModuleJNI.uint8_array_getitem(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), i);
    }

    public static void uint8_array_setitem(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, int i, short s) {
        GcamModuleJNI.uint8_array_setitem(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), i, s);
    }

    public static void uint8_p_assign(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, short s) {
        GcamModuleJNI.uint8_p_assign(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), s);
    }

    public static void uint8_p_p_assign(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        GcamModuleJNI.uint8_p_p_assign(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char));
    }

    public static SWIGTYPE_p_unsigned_char uint8_p_p_value(SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char) {
        long uint8_p_p_value = GcamModuleJNI.uint8_p_p_value(SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char));
        return uint8_p_p_value != 0 ? new SWIGTYPE_p_unsigned_char(uint8_p_p_value, false) : null;
    }

    public static short uint8_p_value(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        return GcamModuleJNI.uint8_p_value(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char));
    }
}
