package com.google.googlex.gcam;

/* compiled from: PG */
public class LocationData {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public LocationData() {
        this(GcamModuleJNI.new_LocationData(), true);
    }

    protected LocationData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.LocationData_Check(this.swigCPtr, this);
    }

    public void Clear() {
        GcamModuleJNI.LocationData_Clear(this.swigCPtr, this);
    }

    public boolean Equals(LocationData locationData) {
        return GcamModuleJNI.LocationData_Equals(this.swigCPtr, this, getCPtr(locationData), locationData);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_LocationData(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public double getAltitude() {
        return GcamModuleJNI.LocationData_altitude_get(this.swigCPtr, this);
    }

    protected static long getCPtr(LocationData locationData) {
        return locationData != null ? locationData.swigCPtr : 0;
    }

    public double getDegree_of_precision() {
        return GcamModuleJNI.LocationData_degree_of_precision_get(this.swigCPtr, this);
    }

    public double getLatitude() {
        return GcamModuleJNI.LocationData_latitude_get(this.swigCPtr, this);
    }

    public double getLongitude() {
        return GcamModuleJNI.LocationData_longitude_get(this.swigCPtr, this);
    }

    public String getProcessing_method() {
        return GcamModuleJNI.LocationData_processing_method_get(this.swigCPtr, this);
    }

    public long getTimestamp_unix() {
        return GcamModuleJNI.LocationData_timestamp_unix_get(this.swigCPtr, this);
    }

    public void setAltitude(double d) {
        GcamModuleJNI.LocationData_altitude_set(this.swigCPtr, this, d);
    }

    public void setDegree_of_precision(double d) {
        GcamModuleJNI.LocationData_degree_of_precision_set(this.swigCPtr, this, d);
    }

    public void setLatitude(double d) {
        GcamModuleJNI.LocationData_latitude_set(this.swigCPtr, this, d);
    }

    public void setLongitude(double d) {
        GcamModuleJNI.LocationData_longitude_set(this.swigCPtr, this, d);
    }

    public void setProcessing_method(String str) {
        GcamModuleJNI.LocationData_processing_method_set(this.swigCPtr, this, str);
    }

    public void setTimestamp_unix(long j) {
        GcamModuleJNI.LocationData_timestamp_unix_set(this.swigCPtr, this, j);
    }
}
