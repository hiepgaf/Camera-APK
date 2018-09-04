package com.google.googlex.gcam;

/* compiled from: PG */
public class ConstSampleIteratorPackedRaw12 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    protected ConstSampleIteratorPackedRaw12(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ConstSampleIteratorPackedRaw12(ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw12__SWIG_1(getCPtr(constSampleIteratorPackedRaw12), constSampleIteratorPackedRaw12), true);
    }

    public ConstSampleIteratorPackedRaw12(PackedReadViewRaw12 packedReadViewRaw12) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw12__SWIG_0(PackedReadViewRaw12.getCPtr(packedReadViewRaw12), packedReadViewRaw12), true);
    }

    public boolean AtEnd() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_AtEnd(this.swigCPtr, this);
    }

    public void NextSample() {
        GcamModuleJNI.ConstSampleIteratorPackedRaw12_NextSample(this.swigCPtr, this);
    }

    public int __ref__() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12___ref__(this.swigCPtr, this);
    }

    /* renamed from: c */
    public int m1366c() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_c(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ConstSampleIteratorPackedRaw12(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12) {
        return constSampleIteratorPackedRaw12 != null ? constSampleIteratorPackedRaw12.swigCPtr : 0;
    }

    /* renamed from: x */
    public int m1367x() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_x(this.swigCPtr, this);
    }

    /* renamed from: y */
    public int m1368y() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_y(this.swigCPtr, this);
    }
}
