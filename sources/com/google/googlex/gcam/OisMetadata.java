package com.google.googlex.gcam;

/* compiled from: PG */
public class OisMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public OisMetadata() {
        this(GcamModuleJNI.new_OisMetadata(), true);
    }

    protected OisMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.OisMetadata_Check(this.swigCPtr, this);
    }

    public boolean Equals(OisMetadata oisMetadata) {
        return GcamModuleJNI.OisMetadata_Equals(this.swigCPtr, this, getCPtr(oisMetadata), oisMetadata);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_OisMetadata(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(OisMetadata oisMetadata) {
        return oisMetadata != null ? oisMetadata.swigCPtr : 0;
    }

    public OisPositionVector getOis_positions() {
        long OisMetadata_ois_positions_get = GcamModuleJNI.OisMetadata_ois_positions_get(this.swigCPtr, this);
        return OisMetadata_ois_positions_get != 0 ? new OisPositionVector(OisMetadata_ois_positions_get, false) : null;
    }

    public long getTimestamp_ois_clock_ns() {
        return GcamModuleJNI.OisMetadata_timestamp_ois_clock_ns_get(this.swigCPtr, this);
    }

    public void setOis_positions(OisPositionVector oisPositionVector) {
        GcamModuleJNI.OisMetadata_ois_positions_set(this.swigCPtr, this, OisPositionVector.getCPtr(oisPositionVector), oisPositionVector);
    }

    public void setTimestamp_ois_clock_ns(long j) {
        GcamModuleJNI.OisMetadata_timestamp_ois_clock_ns_set(this.swigCPtr, this, j);
    }
}
