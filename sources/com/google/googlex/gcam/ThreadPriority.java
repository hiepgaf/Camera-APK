package com.google.googlex.gcam;

/* compiled from: PG */
public class ThreadPriority {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ThreadPriority() {
        this(GcamModuleJNI.new_ThreadPriority(), true);
    }

    protected ThreadPriority(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(ThreadPriority threadPriority) {
        return GcamModuleJNI.ThreadPriority_Equals(this.swigCPtr, this, getCPtr(threadPriority), threadPriority);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ThreadPriority(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ThreadPriority threadPriority) {
        return threadPriority != null ? threadPriority.swigCPtr : 0;
    }

    public boolean getExplicitly_set() {
        return GcamModuleJNI.ThreadPriority_explicitly_set_get(this.swigCPtr, this);
    }

    public int getValue() {
        return GcamModuleJNI.ThreadPriority_value_get(this.swigCPtr, this);
    }

    public void setExplicitly_set(boolean z) {
        GcamModuleJNI.ThreadPriority_explicitly_set_set(this.swigCPtr, this, z);
    }

    public void setValue(int i) {
        GcamModuleJNI.ThreadPriority_value_set(this.swigCPtr, this, i);
    }
}
