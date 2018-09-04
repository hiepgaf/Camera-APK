package com.google.googlex.gcam;

/* compiled from: PG */
public class YuvWriteView extends YuvReadView {
    public long swigCPtr;

    public YuvWriteView() {
        this(GcamModuleJNI.new_YuvWriteView__SWIG_0(), true);
    }

    public YuvWriteView(int i, int i2, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, int i4, int i5, int i6, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char2, int i7) {
        this(GcamModuleJNI.new_YuvWriteView__SWIG_2(i, i2, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), i4, i5, i6, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char2), i7), true);
    }

    protected YuvWriteView(long j, boolean z) {
        super(GcamModuleJNI.YuvWriteView_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public YuvWriteView(YuvWriteView yuvWriteView) {
        this(GcamModuleJNI.new_YuvWriteView__SWIG_1(getCPtr(yuvWriteView), yuvWriteView), true);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.YuvWriteView_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void SetYuvFormat(int i) {
        GcamModuleJNI.YuvWriteView_SetYuvFormat(this.swigCPtr, this, i);
    }

    public InterleavedWriteViewU8 chroma_write_view() {
        return new InterleavedWriteViewU8(GcamModuleJNI.YuvWriteView_chroma_write_view(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_YuvWriteView(j);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(YuvWriteView yuvWriteView) {
        return yuvWriteView != null ? yuvWriteView.swigCPtr : 0;
    }

    public InterleavedWriteViewU8 luma_write_view() {
        return new InterleavedWriteViewU8(GcamModuleJNI.YuvWriteView_luma_write_view(this.swigCPtr, this), false);
    }

    public SWIGTYPE_p_unsigned_char uv_at_YuvWriteView(int i, int i2, int i3) {
        return new SWIGTYPE_p_unsigned_char(GcamModuleJNI.YuvWriteView_uv_at_YuvWriteView(this.swigCPtr, this, i, i2, i3), false);
    }

    public SWIGTYPE_p_unsigned_char y_at_YuvWriteView(int i, int i2) {
        return new SWIGTYPE_p_unsigned_char(GcamModuleJNI.YuvWriteView_y_at_YuvWriteView(this.swigCPtr, this, i, i2), false);
    }
}
