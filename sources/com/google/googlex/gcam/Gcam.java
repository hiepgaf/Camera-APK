package com.google.googlex.gcam;

/* compiled from: PG */
public class Gcam {
    public boolean swigCMemOwn;
    public long swigCPtr;

    protected Gcam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean AbortShot(int i) {
        return GcamModuleJNI.Gcam_AbortShot(this.swigCPtr, this, i);
    }

    public boolean AddFrameMetadataForLogging(int i, FrameMetadata frameMetadata) {
        return GcamModuleJNI.Gcam_AddFrameMetadataForLogging(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public boolean AddMeteringFrame(int i, FrameMetadata frameMetadata, long j, RawWriteView rawWriteView, SpatialGainMap spatialGainMap) {
        return GcamModuleJNI.Gcam_AddMeteringFrame(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap);
    }

    public boolean AddPayloadFrame(int i, FrameMetadata frameMetadata, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, SpatialGainMap spatialGainMap) {
        return GcamModuleJNI.Gcam_AddPayloadFrame(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap);
    }

    public synchronized void AddViewfinderFrame(int i, FrameMetadata frameMetadata, AeShotParams aeShotParams, long j, RawWriteView rawWriteView, SpatialGainMap spatialGainMap) {
        GcamModuleJNI.Gcam_AddViewfinderFrame(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, AeShotParams.getCPtr(aeShotParams), aeShotParams, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap);
    }

    public boolean AppendMessageToSummary(int i, String str) {
        return GcamModuleJNI.Gcam_AppendMessageToSummary(this.swigCPtr, this, i, str);
    }

    public boolean BeginMeteringFrames(int i, BurstSpec burstSpec) {
        return GcamModuleJNI.Gcam_BeginMeteringFrames(this.swigCPtr, this, i, BurstSpec.getCPtr(burstSpec), burstSpec);
    }

    public void BeginPayloadFrames(int i, BurstSpec burstSpec) {
        GcamModuleJNI.Gcam_BeginPayloadFrames(this.swigCPtr, this, i, BurstSpec.getCPtr(burstSpec), burstSpec);
    }

    public BurstSpec BuildPayloadBurstSpec(int i, AeResults aeResults) {
        return new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec(this.swigCPtr, this, i, AeResults.getCPtr(aeResults), aeResults), true);
    }

    public AeResults ComputeAeResults(int i, FrameMetadata frameMetadata, RawWriteView rawWriteView, SpatialGainMap spatialGainMap) {
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, RawWriteView.getCPtr(rawWriteView), rawWriteView, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap), true);
    }

    public static synchronized Gcam Create(InitParams initParams, StaticMetadataVector staticMetadataVector) {
        Gcam gcam;
        synchronized (Gcam.class) {
            long Gcam_Create__SWIG_1 = GcamModuleJNI.Gcam_Create__SWIG_1(InitParams.getCPtr(initParams), initParams, StaticMetadataVector.getCPtr(staticMetadataVector), staticMetadataVector);
            gcam = Gcam_Create__SWIG_1 != 0 ? new Gcam(Gcam_Create__SWIG_1, true) : null;
        }
        return gcam;
    }

    public static synchronized Gcam Create(InitParams initParams, StaticMetadataVector staticMetadataVector, DebugParams debugParams) {
        Gcam gcam;
        synchronized (Gcam.class) {
            long Gcam_Create__SWIG_0 = GcamModuleJNI.Gcam_Create__SWIG_0(InitParams.getCPtr(initParams), initParams, StaticMetadataVector.getCPtr(staticMetadataVector), staticMetadataVector, DebugParams.getCPtr(debugParams), debugParams);
            gcam = Gcam_Create__SWIG_0 != 0 ? new Gcam(Gcam_Create__SWIG_0, true) : null;
        }
        return gcam;
    }

    public BurstSpec EndMeteringFrames(int i) {
        return new BurstSpec(GcamModuleJNI.Gcam_EndMeteringFrames(this.swigCPtr, this, i), true);
    }

    public boolean EndPayloadFrames(int i, ClientExifMetadata clientExifMetadata, StringVector stringVector, StringVector stringVector2) {
        return GcamModuleJNI.Gcam_EndPayloadFrames(this.swigCPtr, this, i, ClientExifMetadata.getCPtr(clientExifMetadata), clientExifMetadata, StringVector.getCPtr(stringVector), stringVector, StringVector.getCPtr(stringVector2), stringVector2);
    }

    public boolean EndShotCapture(int i) {
        return GcamModuleJNI.Gcam_EndShotCapture(this.swigCPtr, this, i);
    }

    public synchronized void FlushViewfinder(int i) {
        GcamModuleJNI.Gcam_FlushViewfinder(this.swigCPtr, this, i);
    }

    public synchronized InitParams GetInitParams() {
        return new InitParams(GcamModuleJNI.Gcam_GetInitParams(this.swigCPtr, this), false);
    }

    public synchronized AeResults GetLatestBackgroundAeResults(int i) {
        return new AeResults(GcamModuleJNI.Gcam_GetLatestBackgroundAeResults(this.swigCPtr, this, i), true);
    }

    public BurstSpec GetMeteringBurstSpec(int i) {
        return new BurstSpec(GcamModuleJNI.Gcam_GetMeteringBurstSpec(this.swigCPtr, this, i), true);
    }

    public synchronized void GetNewShotMemEstimate(SWIGTYPE_p_gcam__ShotMemInfo sWIGTYPE_p_gcam__ShotMemInfo) {
        GcamModuleJNI.Gcam_GetNewShotMemEstimate(this.swigCPtr, this, SWIGTYPE_p_gcam__ShotMemInfo.getCPtr(sWIGTYPE_p_gcam__ShotMemInfo));
    }

    public synchronized int GetNumCameras() {
        return GcamModuleJNI.Gcam_GetNumCameras(this.swigCPtr, this);
    }

    public synchronized StaticMetadata GetStaticMetadata(int i) {
        return new StaticMetadata(GcamModuleJNI.Gcam_GetStaticMetadata(this.swigCPtr, this, i), false);
    }

    public synchronized Tuning GetTuning(int i) {
        return new Tuning(GcamModuleJNI.Gcam_GetTuning(this.swigCPtr, this, i), false);
    }

    public synchronized boolean IsCapturing() {
        return GcamModuleJNI.Gcam_IsCapturing(this.swigCPtr, this);
    }

    public synchronized boolean IsIdle() {
        return GcamModuleJNI.Gcam_IsIdle(this.swigCPtr, this);
    }

    public boolean LimitShotCpuUsage(int i, float f) {
        return GcamModuleJNI.Gcam_LimitShotCpuUsage(this.swigCPtr, this, i, f);
    }

    public synchronized long PeakMemoryBytes() {
        return GcamModuleJNI.Gcam_PeakMemoryBytes(this.swigCPtr, this);
    }

    public synchronized long PeakMemoryWithNewShotBytes() {
        return GcamModuleJNI.Gcam_PeakMemoryWithNewShotBytes(this.swigCPtr, this);
    }

    public synchronized void PrintStatus() {
        GcamModuleJNI.Gcam_PrintStatus(this.swigCPtr, this);
    }

    public synchronized int StartShotCapture(int i, ShotParams shotParams, ShotCallbacks shotCallbacks, int i2, PostviewParams postviewParams, ImageSaverParams imageSaverParams) {
        return GcamModuleJNI.Gcam_StartShotCapture(this.swigCPtr, this, i, ShotParams.getCPtr(shotParams), shotParams, ShotCallbacks.getCPtr(shotCallbacks), shotCallbacks, i2, PostviewParams.getCPtr(postviewParams), postviewParams, ImageSaverParams.getCPtr(imageSaverParams), imageSaverParams);
    }

    public synchronized void UpdateCameras(StaticMetadataVector staticMetadataVector, TuningVector tuningVector) {
        GcamModuleJNI.Gcam_UpdateCameras(this.swigCPtr, this, StaticMetadataVector.getCPtr(staticMetadataVector), staticMetadataVector, TuningVector.getCPtr(tuningVector), tuningVector);
    }

    public synchronized void UpdateDebugParams(DebugParams debugParams) {
        GcamModuleJNI.Gcam_UpdateDebugParams(this.swigCPtr, this, DebugParams.getCPtr(debugParams), debugParams);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_Gcam(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(Gcam gcam) {
        return gcam != null ? gcam.swigCPtr : 0;
    }
}
