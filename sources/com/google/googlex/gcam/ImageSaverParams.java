package com.google.googlex.gcam;

/* compiled from: PG */
public class ImageSaverParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ImageSaverParams() {
        this(GcamModuleJNI.new_ImageSaverParams(), true);
    }

    protected ImageSaverParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Print() {
        GcamModuleJNI.ImageSaverParams_Print(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ImageSaverParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ImageSaverParams imageSaverParams) {
        return imageSaverParams != null ? imageSaverParams.swigCPtr : 0;
    }

    public String getDest_folder() {
        return GcamModuleJNI.ImageSaverParams_dest_folder_get(this.swigCPtr, this);
    }

    public String getFilename_prefix() {
        return GcamModuleJNI.ImageSaverParams_filename_prefix_get(this.swigCPtr, this);
    }

    public String getFilename_suffix() {
        return GcamModuleJNI.ImageSaverParams_filename_suffix_get(this.swigCPtr, this);
    }

    public void setDest_folder(String str) {
        GcamModuleJNI.ImageSaverParams_dest_folder_set(this.swigCPtr, this, str);
    }

    public void setFilename_prefix(String str) {
        GcamModuleJNI.ImageSaverParams_filename_prefix_set(this.swigCPtr, this, str);
    }

    public void setFilename_suffix(String str) {
        GcamModuleJNI.ImageSaverParams_filename_suffix_set(this.swigCPtr, this, str);
    }
}
