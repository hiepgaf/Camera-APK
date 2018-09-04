package com.google.googlex.gcam;

/* compiled from: PG */
public class ClientExifMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ClientExifMetadata() {
        this(GcamModuleJNI.new_ClientExifMetadata(), true);
    }

    protected ClientExifMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ClientExifMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ClientExifMetadata clientExifMetadata) {
        return clientExifMetadata != null ? clientExifMetadata.swigCPtr : 0;
    }

    public LocationData getLocation() {
        long ClientExifMetadata_location_get = GcamModuleJNI.ClientExifMetadata_location_get(this.swigCPtr, this);
        return ClientExifMetadata_location_get != 0 ? new LocationData(ClientExifMetadata_location_get, false) : null;
    }

    public InterleavedWriteViewU8 getRgb_thumbnail() {
        long ClientExifMetadata_rgb_thumbnail_get = GcamModuleJNI.ClientExifMetadata_rgb_thumbnail_get(this.swigCPtr, this);
        return ClientExifMetadata_rgb_thumbnail_get != 0 ? new InterleavedWriteViewU8(ClientExifMetadata_rgb_thumbnail_get, false) : null;
    }

    public YuvWriteView getYuv_thumbnail() {
        long ClientExifMetadata_yuv_thumbnail_get = GcamModuleJNI.ClientExifMetadata_yuv_thumbnail_get(this.swigCPtr, this);
        return ClientExifMetadata_yuv_thumbnail_get != 0 ? new YuvWriteView(ClientExifMetadata_yuv_thumbnail_get, false) : null;
    }

    public void setLocation(LocationData locationData) {
        GcamModuleJNI.ClientExifMetadata_location_set(this.swigCPtr, this, LocationData.getCPtr(locationData), locationData);
    }

    public void setRgb_thumbnail(InterleavedWriteViewU8 interleavedWriteViewU8) {
        GcamModuleJNI.ClientExifMetadata_rgb_thumbnail_set(this.swigCPtr, this, InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8), interleavedWriteViewU8);
    }

    public void setYuv_thumbnail(YuvWriteView yuvWriteView) {
        GcamModuleJNI.ClientExifMetadata_yuv_thumbnail_set(this.swigCPtr, this, YuvWriteView.getCPtr(yuvWriteView), yuvWriteView);
    }
}
