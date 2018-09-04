package com.google.googlex.gcam;

/* compiled from: PG */
public class EncodedBlobCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public EncodedBlobCallback() {
        this(GcamModuleJNI.new_EncodedBlobCallback(), true);
        GcamModuleJNI.EncodedBlobCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    protected EncodedBlobCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Run(int i, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i2, int i3) {
        GcamModuleJNI.EncodedBlobCallback_Run(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j, i2, i3);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_EncodedBlobCallback(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(EncodedBlobCallback encodedBlobCallback) {
        return encodedBlobCallback != null ? encodedBlobCallback.swigCPtr : 0;
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.EncodedBlobCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.EncodedBlobCallback_change_ownership(this, this.swigCPtr, true);
    }
}
