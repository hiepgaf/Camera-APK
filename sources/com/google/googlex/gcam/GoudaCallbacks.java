package com.google.googlex.gcam;

/* compiled from: PG */
public class GoudaCallbacks {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GoudaCallbacks() {
        this(GcamModuleJNI.new_GoudaCallbacks(), true);
    }

    protected GoudaCallbacks(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GoudaCallbacks(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(GoudaCallbacks goudaCallbacks) {
        return goudaCallbacks != null ? goudaCallbacks.swigCPtr : 0;
    }

    public GoudaCompleteCallback getComplete_callback() {
        long GoudaCallbacks_complete_callback_get = GcamModuleJNI.GoudaCallbacks_complete_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_complete_callback_get != 0 ? new GoudaCompleteCallback(GoudaCallbacks_complete_callback_get, false) : null;
    }

    public GoudaImageCallback getDebug_image_callback() {
        long GoudaCallbacks_debug_image_callback_get = GcamModuleJNI.GoudaCallbacks_debug_image_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_debug_image_callback_get != 0 ? new GoudaImageCallback(GoudaCallbacks_debug_image_callback_get, false) : null;
    }

    public ClientInterleavedU8Allocator getDebug_rgb_allocator() {
        long GoudaCallbacks_debug_rgb_allocator_get = GcamModuleJNI.GoudaCallbacks_debug_rgb_allocator_get(this.swigCPtr, this);
        return GoudaCallbacks_debug_rgb_allocator_get != 0 ? new ClientInterleavedU8Allocator(GoudaCallbacks_debug_rgb_allocator_get, false) : null;
    }

    public GoudaOutputFeaturesCallback getFeatures_callback() {
        long GoudaCallbacks_features_callback_get = GcamModuleJNI.GoudaCallbacks_features_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_features_callback_get != 0 ? new GoudaOutputFeaturesCallback(GoudaCallbacks_features_callback_get, false) : null;
    }

    public GoudaImageCallback getImage_callback() {
        long GoudaCallbacks_image_callback_get = GcamModuleJNI.GoudaCallbacks_image_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_image_callback_get != 0 ? new GoudaImageCallback(GoudaCallbacks_image_callback_get, false) : null;
    }

    public GoudaProgressCallback getProgress_callback() {
        long GoudaCallbacks_progress_callback_get = GcamModuleJNI.GoudaCallbacks_progress_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_progress_callback_get != 0 ? new GoudaProgressCallback(GoudaCallbacks_progress_callback_get, false) : null;
    }

    public ClientInterleavedU8Allocator getRgb_allocator() {
        long GoudaCallbacks_rgb_allocator_get = GcamModuleJNI.GoudaCallbacks_rgb_allocator_get(this.swigCPtr, this);
        return GoudaCallbacks_rgb_allocator_get != 0 ? new ClientInterleavedU8Allocator(GoudaCallbacks_rgb_allocator_get, false) : null;
    }

    public GoudaImageCallback getSecondary_image_callback() {
        long GoudaCallbacks_secondary_image_callback_get = GcamModuleJNI.GoudaCallbacks_secondary_image_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_secondary_image_callback_get != 0 ? new GoudaImageCallback(GoudaCallbacks_secondary_image_callback_get, false) : null;
    }

    public GoudaImageCallback getUpsampled_input_image_callback() {
        long GoudaCallbacks_upsampled_input_image_callback_get = GcamModuleJNI.GoudaCallbacks_upsampled_input_image_callback_get(this.swigCPtr, this);
        return GoudaCallbacks_upsampled_input_image_callback_get != 0 ? new GoudaImageCallback(GoudaCallbacks_upsampled_input_image_callback_get, false) : null;
    }

    public ClientYuvAllocator getYuv_allocator() {
        long GoudaCallbacks_yuv_allocator_get = GcamModuleJNI.GoudaCallbacks_yuv_allocator_get(this.swigCPtr, this);
        return GoudaCallbacks_yuv_allocator_get != 0 ? new ClientYuvAllocator(GoudaCallbacks_yuv_allocator_get, false) : null;
    }

    public void setComplete_callback(GoudaCompleteCallback goudaCompleteCallback) {
        GcamModuleJNI.GoudaCallbacks_complete_callback_set(this.swigCPtr, this, GoudaCompleteCallback.getCPtr(goudaCompleteCallback), goudaCompleteCallback);
    }

    public void setDebug_image_callback(GoudaImageCallback goudaImageCallback) {
        GcamModuleJNI.GoudaCallbacks_debug_image_callback_set(this.swigCPtr, this, GoudaImageCallback.getCPtr(goudaImageCallback), goudaImageCallback);
    }

    public void setDebug_rgb_allocator(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        GcamModuleJNI.GoudaCallbacks_debug_rgb_allocator_set(this.swigCPtr, this, ClientInterleavedU8Allocator.getCPtr(clientInterleavedU8Allocator), clientInterleavedU8Allocator);
    }

    public void setFeatures_callback(GoudaOutputFeaturesCallback goudaOutputFeaturesCallback) {
        GcamModuleJNI.GoudaCallbacks_features_callback_set(this.swigCPtr, this, GoudaOutputFeaturesCallback.getCPtr(goudaOutputFeaturesCallback), goudaOutputFeaturesCallback);
    }

    public void setImage_callback(GoudaImageCallback goudaImageCallback) {
        GcamModuleJNI.GoudaCallbacks_image_callback_set(this.swigCPtr, this, GoudaImageCallback.getCPtr(goudaImageCallback), goudaImageCallback);
    }

    public void setProgress_callback(GoudaProgressCallback goudaProgressCallback) {
        GcamModuleJNI.GoudaCallbacks_progress_callback_set(this.swigCPtr, this, GoudaProgressCallback.getCPtr(goudaProgressCallback), goudaProgressCallback);
    }

    public void setRgb_allocator(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        GcamModuleJNI.GoudaCallbacks_rgb_allocator_set(this.swigCPtr, this, ClientInterleavedU8Allocator.getCPtr(clientInterleavedU8Allocator), clientInterleavedU8Allocator);
    }

    public void setSecondary_image_callback(GoudaImageCallback goudaImageCallback) {
        GcamModuleJNI.GoudaCallbacks_secondary_image_callback_set(this.swigCPtr, this, GoudaImageCallback.getCPtr(goudaImageCallback), goudaImageCallback);
    }

    public void setUpsampled_input_image_callback(GoudaImageCallback goudaImageCallback) {
        GcamModuleJNI.GoudaCallbacks_upsampled_input_image_callback_set(this.swigCPtr, this, GoudaImageCallback.getCPtr(goudaImageCallback), goudaImageCallback);
    }

    public void setYuv_allocator(ClientYuvAllocator clientYuvAllocator) {
        GcamModuleJNI.GoudaCallbacks_yuv_allocator_set(this.swigCPtr, this, ClientYuvAllocator.getCPtr(clientYuvAllocator), clientYuvAllocator);
    }
}
