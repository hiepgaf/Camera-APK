package com.google.googlex.gcam;

/* compiled from: PG */
public class RawWriteView extends RawReadView {
    public long swigCPtr;

    public RawWriteView() {
        this(GcamModuleJNI.new_RawWriteView__SWIG_0(), true);
    }

    public RawWriteView(int i, int i2, long j, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_2(i, i2, j, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char)), true);
    }

    protected RawWriteView(long j, boolean z) {
        super(GcamModuleJNI.RawWriteView_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public RawWriteView(RawWriteView rawWriteView) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_1(getCPtr(rawWriteView), rawWriteView), true);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.RawWriteView_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void SetRow(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.RawWriteView_SetRow__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public void SetRow(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.RawWriteView_SetRow__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawWriteView(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(RawWriteView rawWriteView) {
        return rawWriteView != null ? rawWriteView.swigCPtr : 0;
    }

    public PackedReadWriteViewRaw10 packed10_write_view() {
        return new PackedReadWriteViewRaw10(GcamModuleJNI.RawWriteView_packed10_write_view(this.swigCPtr, this), false);
    }

    public PackedReadWriteViewRaw12 packed12_write_view() {
        return new PackedReadWriteViewRaw12(GcamModuleJNI.RawWriteView_packed12_write_view(this.swigCPtr, this), false);
    }

    public InterleavedWriteViewU16 unpacked_write_view() {
        return new InterleavedWriteViewU16(GcamModuleJNI.RawWriteView_unpacked_write_view(this.swigCPtr, this), false);
    }
}
