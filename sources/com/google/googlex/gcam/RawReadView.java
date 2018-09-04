package com.google.googlex.gcam;

/* compiled from: PG */
public class RawReadView {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawReadView() {
        this(GcamModuleJNI.new_RawReadView__SWIG_0(), true);
    }

    public RawReadView(int i, int i2, long j, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        this(GcamModuleJNI.new_RawReadView__SWIG_2(i, i2, j, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char)), true);
    }

    protected RawReadView(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public RawReadView(RawReadView rawReadView) {
        this(GcamModuleJNI.new_RawReadView__SWIG_1(getCPtr(rawReadView), rawReadView), true);
    }

    public int BitsPerPixel() {
        return GcamModuleJNI.RawReadView_BitsPerPixel(this.swigCPtr, this);
    }

    public boolean Empty() {
        return GcamModuleJNI.RawReadView_Empty(this.swigCPtr, this);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.RawReadView_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public SWIGTYPE_p_unsigned_short GetRow(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        long RawReadView_GetRow__SWIG_0 = GcamModuleJNI.RawReadView_GetRow__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
        return RawReadView_GetRow__SWIG_0 != 0 ? new SWIGTYPE_p_unsigned_short(RawReadView_GetRow__SWIG_0, false) : null;
    }

    public SWIGTYPE_p_unsigned_short GetRow(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        long RawReadView_GetRow__SWIG_1 = GcamModuleJNI.RawReadView_GetRow__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
        return RawReadView_GetRow__SWIG_1 != 0 ? new SWIGTYPE_p_unsigned_short(RawReadView_GetRow__SWIG_1, false) : null;
    }

    public int at(int i, int i2) {
        return GcamModuleJNI.RawReadView_at(this.swigCPtr, this, i, i2);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawReadView(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(RawReadView rawReadView) {
        return rawReadView != null ? rawReadView.swigCPtr : 0;
    }

    public int height() {
        return GcamModuleJNI.RawReadView_height(this.swigCPtr, this);
    }

    public int layout() {
        return GcamModuleJNI.RawReadView_layout(this.swigCPtr, this);
    }

    public PackedReadViewRaw10 packed10_read_view() {
        return new PackedReadViewRaw10(GcamModuleJNI.RawReadView_packed10_read_view(this.swigCPtr, this), false);
    }

    public PackedReadViewRaw12 packed12_read_view() {
        return new PackedReadViewRaw12(GcamModuleJNI.RawReadView_packed12_read_view(this.swigCPtr, this), false);
    }

    public long sample_array_size() {
        return GcamModuleJNI.RawReadView_sample_array_size(this.swigCPtr, this);
    }

    public InterleavedReadViewU16 unpacked_read_view() {
        return new InterleavedReadViewU16(GcamModuleJNI.RawReadView_unpacked_read_view(this.swigCPtr, this), false);
    }

    public int width() {
        return GcamModuleJNI.RawReadView_width(this.swigCPtr, this);
    }
}
