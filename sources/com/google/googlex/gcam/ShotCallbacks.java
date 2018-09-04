package com.google.googlex.gcam;

/* compiled from: PG */
public class ShotCallbacks {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ShotCallbacks() {
        this(GcamModuleJNI.new_ShotCallbacks(), true);
    }

    protected ShotCallbacks(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ShotCallbacks(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public BaseFrameCallback getBase_frame_callback() {
        long ShotCallbacks_base_frame_callback_get = GcamModuleJNI.ShotCallbacks_base_frame_callback_get(this.swigCPtr, this);
        return ShotCallbacks_base_frame_callback_get != 0 ? new BaseFrameCallback(ShotCallbacks_base_frame_callback_get, false) : null;
    }

    protected static long getCPtr(ShotCallbacks shotCallbacks) {
        return shotCallbacks != null ? shotCallbacks.swigCPtr : 0;
    }

    public FinalImageCallback getFinal_image_callback() {
        long ShotCallbacks_final_image_callback_get = GcamModuleJNI.ShotCallbacks_final_image_callback_get(this.swigCPtr, this);
        return ShotCallbacks_final_image_callback_get != 0 ? new FinalImageCallback(ShotCallbacks_final_image_callback_get, false) : null;
    }

    public ClientInterleavedU8Allocator getFinal_image_rgb_allocator() {
        long ShotCallbacks_final_image_rgb_allocator_get = GcamModuleJNI.ShotCallbacks_final_image_rgb_allocator_get(this.swigCPtr, this);
        return ShotCallbacks_final_image_rgb_allocator_get != 0 ? new ClientInterleavedU8Allocator(ShotCallbacks_final_image_rgb_allocator_get, false) : null;
    }

    public ClientYuvAllocator getFinal_image_yuv_allocator() {
        long ShotCallbacks_final_image_yuv_allocator_get = GcamModuleJNI.ShotCallbacks_final_image_yuv_allocator_get(this.swigCPtr, this);
        return ShotCallbacks_final_image_yuv_allocator_get != 0 ? new ClientYuvAllocator(ShotCallbacks_final_image_yuv_allocator_get, false) : null;
    }

    public EncodedBlobCallback getJpeg_callback() {
        long ShotCallbacks_jpeg_callback_get = GcamModuleJNI.ShotCallbacks_jpeg_callback_get(this.swigCPtr, this);
        return ShotCallbacks_jpeg_callback_get != 0 ? new EncodedBlobCallback(ShotCallbacks_jpeg_callback_get, false) : null;
    }

    public EncodedBlobCallback getMerged_dng_callback() {
        long ShotCallbacks_merged_dng_callback_get = GcamModuleJNI.ShotCallbacks_merged_dng_callback_get(this.swigCPtr, this);
        return ShotCallbacks_merged_dng_callback_get != 0 ? new EncodedBlobCallback(ShotCallbacks_merged_dng_callback_get, false) : null;
    }

    public ClientInterleavedU16Allocator getMerged_pd_allocator() {
        long ShotCallbacks_merged_pd_allocator_get = GcamModuleJNI.ShotCallbacks_merged_pd_allocator_get(this.swigCPtr, this);
        return ShotCallbacks_merged_pd_allocator_get != 0 ? new ClientInterleavedU16Allocator(ShotCallbacks_merged_pd_allocator_get, false) : null;
    }

    public PdImageCallback getMerged_pd_callback() {
        long ShotCallbacks_merged_pd_callback_get = GcamModuleJNI.ShotCallbacks_merged_pd_callback_get(this.swigCPtr, this);
        return ShotCallbacks_merged_pd_callback_get != 0 ? new PdImageCallback(ShotCallbacks_merged_pd_callback_get, false) : null;
    }

    public RawImageCallback getMerged_raw_image_callback() {
        long ShotCallbacks_merged_raw_image_callback_get = GcamModuleJNI.ShotCallbacks_merged_raw_image_callback_get(this.swigCPtr, this);
        return ShotCallbacks_merged_raw_image_callback_get != 0 ? new RawImageCallback(ShotCallbacks_merged_raw_image_callback_get, false) : null;
    }

    public PlanarRawImageCallback getMutable_merged_raw_callback() {
        long ShotCallbacks_mutable_merged_raw_callback_get = GcamModuleJNI.ShotCallbacks_mutable_merged_raw_callback_get(this.swigCPtr, this);
        return ShotCallbacks_mutable_merged_raw_callback_get != 0 ? new PlanarRawImageCallback(ShotCallbacks_mutable_merged_raw_callback_get, false) : null;
    }

    public PostviewCallback getPostview_callback() {
        long ShotCallbacks_postview_callback_get = GcamModuleJNI.ShotCallbacks_postview_callback_get(this.swigCPtr, this);
        return ShotCallbacks_postview_callback_get != 0 ? new PostviewCallback(ShotCallbacks_postview_callback_get, false) : null;
    }

    public ClientInterleavedU8Allocator getPostview_rgb_allocator() {
        long ShotCallbacks_postview_rgb_allocator_get = GcamModuleJNI.ShotCallbacks_postview_rgb_allocator_get(this.swigCPtr, this);
        return ShotCallbacks_postview_rgb_allocator_get != 0 ? new ClientInterleavedU8Allocator(ShotCallbacks_postview_rgb_allocator_get, false) : null;
    }

    public ClientYuvAllocator getPostview_yuv_allocator() {
        long ShotCallbacks_postview_yuv_allocator_get = GcamModuleJNI.ShotCallbacks_postview_yuv_allocator_get(this.swigCPtr, this);
        return ShotCallbacks_postview_yuv_allocator_get != 0 ? new ClientYuvAllocator(ShotCallbacks_postview_yuv_allocator_get, false) : null;
    }

    public ProgressCallback getProgress_callback() {
        long ShotCallbacks_progress_callback_get = GcamModuleJNI.ShotCallbacks_progress_callback_get(this.swigCPtr, this);
        return ShotCallbacks_progress_callback_get != 0 ? new ProgressCallback(ShotCallbacks_progress_callback_get, false) : null;
    }

    public ShotStatusCallback getStatus_callback() {
        long ShotCallbacks_status_callback_get = GcamModuleJNI.ShotCallbacks_status_callback_get(this.swigCPtr, this);
        return ShotCallbacks_status_callback_get != 0 ? new ShotStatusCallback(ShotCallbacks_status_callback_get, false) : null;
    }

    public void setBase_frame_callback(BaseFrameCallback baseFrameCallback) {
        GcamModuleJNI.ShotCallbacks_base_frame_callback_set(this.swigCPtr, this, BaseFrameCallback.getCPtr(baseFrameCallback), baseFrameCallback);
    }

    public void setFinal_image_callback(FinalImageCallback finalImageCallback) {
        GcamModuleJNI.ShotCallbacks_final_image_callback_set(this.swigCPtr, this, FinalImageCallback.getCPtr(finalImageCallback), finalImageCallback);
    }

    public void setFinal_image_rgb_allocator(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        GcamModuleJNI.ShotCallbacks_final_image_rgb_allocator_set(this.swigCPtr, this, ClientInterleavedU8Allocator.getCPtr(clientInterleavedU8Allocator), clientInterleavedU8Allocator);
    }

    public void setFinal_image_yuv_allocator(ClientYuvAllocator clientYuvAllocator) {
        GcamModuleJNI.ShotCallbacks_final_image_yuv_allocator_set(this.swigCPtr, this, ClientYuvAllocator.getCPtr(clientYuvAllocator), clientYuvAllocator);
    }

    public void setJpeg_callback(EncodedBlobCallback encodedBlobCallback) {
        GcamModuleJNI.ShotCallbacks_jpeg_callback_set(this.swigCPtr, this, EncodedBlobCallback.getCPtr(encodedBlobCallback), encodedBlobCallback);
    }

    public void setMerged_dng_callback(EncodedBlobCallback encodedBlobCallback) {
        GcamModuleJNI.ShotCallbacks_merged_dng_callback_set(this.swigCPtr, this, EncodedBlobCallback.getCPtr(encodedBlobCallback), encodedBlobCallback);
    }

    public void setMerged_pd_allocator(ClientInterleavedU16Allocator clientInterleavedU16Allocator) {
        GcamModuleJNI.ShotCallbacks_merged_pd_allocator_set(this.swigCPtr, this, ClientInterleavedU16Allocator.getCPtr(clientInterleavedU16Allocator), clientInterleavedU16Allocator);
    }

    public void setMerged_pd_callback(PdImageCallback pdImageCallback) {
        GcamModuleJNI.ShotCallbacks_merged_pd_callback_set(this.swigCPtr, this, PdImageCallback.getCPtr(pdImageCallback), pdImageCallback);
    }

    public void setMerged_raw_image_callback(RawImageCallback rawImageCallback) {
        GcamModuleJNI.ShotCallbacks_merged_raw_image_callback_set(this.swigCPtr, this, RawImageCallback.getCPtr(rawImageCallback), rawImageCallback);
    }

    public void setMutable_merged_raw_callback(PlanarRawImageCallback planarRawImageCallback) {
        GcamModuleJNI.ShotCallbacks_mutable_merged_raw_callback_set(this.swigCPtr, this, PlanarRawImageCallback.getCPtr(planarRawImageCallback), planarRawImageCallback);
    }

    public void setPostview_callback(PostviewCallback postviewCallback) {
        GcamModuleJNI.ShotCallbacks_postview_callback_set(this.swigCPtr, this, PostviewCallback.getCPtr(postviewCallback), postviewCallback);
    }

    public void setPostview_rgb_allocator(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        GcamModuleJNI.ShotCallbacks_postview_rgb_allocator_set(this.swigCPtr, this, ClientInterleavedU8Allocator.getCPtr(clientInterleavedU8Allocator), clientInterleavedU8Allocator);
    }

    public void setPostview_yuv_allocator(ClientYuvAllocator clientYuvAllocator) {
        GcamModuleJNI.ShotCallbacks_postview_yuv_allocator_set(this.swigCPtr, this, ClientYuvAllocator.getCPtr(clientYuvAllocator), clientYuvAllocator);
    }

    public void setProgress_callback(ProgressCallback progressCallback) {
        GcamModuleJNI.ShotCallbacks_progress_callback_set(this.swigCPtr, this, ProgressCallback.getCPtr(progressCallback), progressCallback);
    }

    public void setStatus_callback(ShotStatusCallback shotStatusCallback) {
        GcamModuleJNI.ShotCallbacks_status_callback_set(this.swigCPtr, this, ShotStatusCallback.getCPtr(shotStatusCallback), shotStatusCallback);
    }
}
