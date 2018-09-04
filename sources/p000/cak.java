package p000;

import android.graphics.Rect;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvReadView;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: cak */
public final class cak implements iwz {
    /* renamed from: a */
    private final long f20172a;
    /* renamed from: b */
    private final List f20173b;
    /* renamed from: c */
    private final YuvReadView f20174c;

    public cak(YuvReadView yuvReadView, long j) {
        ByteBuffer byteBufferViewOfNativePointer;
        ByteBuffer byteBufferViewOfNativePointer2;
        boolean z = yuvReadView.yuv_format() != 1 ? yuvReadView.yuv_format() == 2 : true;
        jri.m13144a(z, (Object) "Format of yuvReadView can only be NV12 or NV21!");
        InterleavedReadViewU8 luma_read_view = yuvReadView.luma_read_view();
        InterleavedReadViewU8 chroma_read_view = yuvReadView.chroma_read_view();
        int sample_array_size = (int) chroma_read_view.sample_array_size();
        ByteBuffer byteBufferViewOfNativePointer3 = BufferUtils.byteBufferViewOfNativePointer(luma_read_view.base_pointer(), (int) luma_read_view.sample_array_size());
        if (yuvReadView.yuv_format() == 1) {
            byteBufferViewOfNativePointer = BufferUtils.byteBufferViewOfNativePointer(chroma_read_view.base_pointer(), sample_array_size);
            byteBufferViewOfNativePointer2 = BufferUtils.byteBufferViewOfNativePointer(BufferUtils.getSwigPointerAddress(chroma_read_view.base_pointer()) + chroma_read_view.c_stride(), sample_array_size);
        } else {
            byteBufferViewOfNativePointer2 = BufferUtils.byteBufferViewOfNativePointer(chroma_read_view.base_pointer(), sample_array_size);
            byteBufferViewOfNativePointer = BufferUtils.byteBufferViewOfNativePointer(BufferUtils.getSwigPointerAddress(chroma_read_view.base_pointer()) + chroma_read_view.c_stride(), sample_array_size);
        }
        this.f20172a = j;
        this.f20174c = yuvReadView;
        this.f20173b = Arrays.asList(new ixa[]{new cal(byteBufferViewOfNativePointer3, (int) luma_read_view.y_stride(), (int) luma_read_view.x_stride()), new cal(byteBufferViewOfNativePointer, (int) chroma_read_view.y_stride(), (int) chroma_read_view.x_stride()), new cal(byteBufferViewOfNativePointer2, (int) chroma_read_view.y_stride(), (int) chroma_read_view.x_stride())});
    }

    public final void close() {
    }

    /* renamed from: a */
    public final iud mo2713a() {
        return iud.m4210a();
    }

    /* renamed from: b */
    public final Rect mo2715b() {
        return new Rect(0, 0, this.f20174c.width(), this.f20174c.height());
    }

    /* renamed from: c */
    public final int mo2716c() {
        return 35;
    }

    /* renamed from: d */
    public final int mo2717d() {
        return this.f20174c.height();
    }

    /* renamed from: e */
    public final List mo2718e() {
        return this.f20173b;
    }

    /* renamed from: f */
    public final long mo2719f() {
        return this.f20172a;
    }

    /* renamed from: g */
    public final int mo2720g() {
        return this.f20174c.width();
    }

    /* renamed from: a */
    public final void mo2714a(Rect rect) {
    }
}
