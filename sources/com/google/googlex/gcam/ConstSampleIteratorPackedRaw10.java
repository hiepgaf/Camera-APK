package com.google.googlex.gcam;

/* compiled from: PG */
public class ConstSampleIteratorPackedRaw10 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    protected ConstSampleIteratorPackedRaw10(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ConstSampleIteratorPackedRaw10(ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw10__SWIG_1(getCPtr(constSampleIteratorPackedRaw10), constSampleIteratorPackedRaw10), true);
    }

    public ConstSampleIteratorPackedRaw10(PackedReadViewRaw10 packedReadViewRaw10) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw10__SWIG_0(PackedReadViewRaw10.getCPtr(packedReadViewRaw10), packedReadViewRaw10), true);
    }

    public boolean AtEnd() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_AtEnd(this.swigCPtr, this);
    }

    public void NextSample() {
        GcamModuleJNI.ConstSampleIteratorPackedRaw10_NextSample(this.swigCPtr, this);
    }

    public int __ref__() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10___ref__(this.swigCPtr, this);
    }

    /* renamed from: c */
    public int m1363c() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_c(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ConstSampleIteratorPackedRaw10(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10) {
        return constSampleIteratorPackedRaw10 != null ? constSampleIteratorPackedRaw10.swigCPtr : 0;
    }

    /* renamed from: x */
    public int m1364x() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_x(this.swigCPtr, this);
    }

    /* renamed from: y */
    public int m1365y() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_y(this.swigCPtr, this);
    }
}
