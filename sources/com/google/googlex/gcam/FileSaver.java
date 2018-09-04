package com.google.googlex.gcam;

/* compiled from: PG */
public class FileSaver {
    public boolean swigCMemOwn;
    public long swigCPtr;

    protected FileSaver(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FileSaver(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(FileSaver fileSaver) {
        return fileSaver != null ? fileSaver.swigCPtr : 0;
    }
}
