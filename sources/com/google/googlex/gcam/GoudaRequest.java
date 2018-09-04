package com.google.googlex.gcam;

/* compiled from: PG */
public class GoudaRequest {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GoudaRequest() {
        this(GcamModuleJNI.new_GoudaRequest(), true);
    }

    protected GoudaRequest(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GoudaRequest(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(GoudaRequest goudaRequest) {
        return goudaRequest != null ? goudaRequest.swigCPtr : 0;
    }

    public int getDebug_images_verbosity() {
        return GcamModuleJNI.GoudaRequest_debug_images_verbosity_get(this.swigCPtr, this);
    }

    public boolean getEmbed_gdepth_metadata() {
        return GcamModuleJNI.GoudaRequest_embed_gdepth_metadata_get(this.swigCPtr, this);
    }

    public PixelRectVector getFaces() {
        long GoudaRequest_faces_get = GcamModuleJNI.GoudaRequest_faces_get(this.swigCPtr, this);
        return GoudaRequest_faces_get != 0 ? new PixelRectVector(GoudaRequest_faces_get, false) : null;
    }

    public FrameMetadata getFrame_metadata() {
        long GoudaRequest_frame_metadata_get = GcamModuleJNI.GoudaRequest_frame_metadata_get(this.swigCPtr, this);
        return GoudaRequest_frame_metadata_get != 0 ? new FrameMetadata(GoudaRequest_frame_metadata_get, false) : null;
    }

    public long getId() {
        return GcamModuleJNI.GoudaRequest_id_get(this.swigCPtr, this);
    }

    public int getImage_rotation() {
        return GcamModuleJNI.GoudaRequest_image_rotation_get(this.swigCPtr, this);
    }

    public int getOutput_format_primary() {
        return GcamModuleJNI.GoudaRequest_output_format_primary_get(this.swigCPtr, this);
    }

    public int getOutput_height() {
        return GcamModuleJNI.GoudaRequest_output_height_get(this.swigCPtr, this);
    }

    public int getOutput_width() {
        return GcamModuleJNI.GoudaRequest_output_width_get(this.swigCPtr, this);
    }

    public int getPd_version() {
        return GcamModuleJNI.GoudaRequest_pd_version_get(this.swigCPtr, this);
    }

    public String getPortrait_raw_path() {
        return GcamModuleJNI.GoudaRequest_portrait_raw_path_get(this.swigCPtr, this);
    }

    public float getPost_resample_sharpening() {
        return GcamModuleJNI.GoudaRequest_post_resample_sharpening_get(this.swigCPtr, this);
    }

    public String getShot_prefix() {
        return GcamModuleJNI.GoudaRequest_shot_prefix_get(this.swigCPtr, this);
    }

    public StaticMetadata getStatic_metadata() {
        long GoudaRequest_static_metadata_get = GcamModuleJNI.GoudaRequest_static_metadata_get(this.swigCPtr, this);
        return GoudaRequest_static_metadata_get != 0 ? new StaticMetadata(GoudaRequest_static_metadata_get, false) : null;
    }

    public void setDebug_images_verbosity(int i) {
        GcamModuleJNI.GoudaRequest_debug_images_verbosity_set(this.swigCPtr, this, i);
    }

    public void setEmbed_gdepth_metadata(boolean z) {
        GcamModuleJNI.GoudaRequest_embed_gdepth_metadata_set(this.swigCPtr, this, z);
    }

    public void setFaces(PixelRectVector pixelRectVector) {
        GcamModuleJNI.GoudaRequest_faces_set(this.swigCPtr, this, PixelRectVector.getCPtr(pixelRectVector), pixelRectVector);
    }

    public void setFrame_metadata(FrameMetadata frameMetadata) {
        GcamModuleJNI.GoudaRequest_frame_metadata_set(this.swigCPtr, this, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public void setId(long j) {
        GcamModuleJNI.GoudaRequest_id_set(this.swigCPtr, this, j);
    }

    public void setImage_rotation(int i) {
        GcamModuleJNI.GoudaRequest_image_rotation_set(this.swigCPtr, this, i);
    }

    public void setOutput_format_primary(int i) {
        GcamModuleJNI.GoudaRequest_output_format_primary_set(this.swigCPtr, this, i);
    }

    public void setOutput_height(int i) {
        GcamModuleJNI.GoudaRequest_output_height_set(this.swigCPtr, this, i);
    }

    public void setOutput_width(int i) {
        GcamModuleJNI.GoudaRequest_output_width_set(this.swigCPtr, this, i);
    }

    public void setPd_version(int i) {
        GcamModuleJNI.GoudaRequest_pd_version_set(this.swigCPtr, this, i);
    }

    public void setPortrait_raw_path(String str) {
        GcamModuleJNI.GoudaRequest_portrait_raw_path_set(this.swigCPtr, this, str);
    }

    public void setPost_resample_sharpening(float f) {
        GcamModuleJNI.GoudaRequest_post_resample_sharpening_set(this.swigCPtr, this, f);
    }

    public void setShot_prefix(String str) {
        GcamModuleJNI.GoudaRequest_shot_prefix_set(this.swigCPtr, this, str);
    }

    public void setStatic_metadata(StaticMetadata staticMetadata) {
        GcamModuleJNI.GoudaRequest_static_metadata_set(this.swigCPtr, this, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }
}
