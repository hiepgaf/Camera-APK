package p000;

import com.google.googlex.gcam.GoudaImageCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;

/* compiled from: PG */
/* renamed from: gdc */
final class gdc extends GoudaImageCallback {
    /* renamed from: a */
    private final /* synthetic */ gdv f16803a;
    /* renamed from: b */
    private final /* synthetic */ boolean f16804b;
    /* renamed from: c */
    private final /* synthetic */ boolean f16805c;
    /* renamed from: d */
    private final /* synthetic */ boolean f16806d;
    /* renamed from: e */
    private final /* synthetic */ gcy f16807e;

    gdc(gcy gcy, gdv gdv, boolean z, boolean z2, boolean z3) {
        this.f16807e = gcy;
        this.f16803a = gdv;
        this.f16804b = z;
        this.f16805c = z2;
        this.f16806d = z3;
    }

    public final void RgbReady(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3) {
        String str4 = gcv.f16763a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
        stringBuilder.append("Gouda image (rgb): id = ");
        stringBuilder.append(j);
        stringBuilder.append(" description = ");
        stringBuilder.append(str);
        bli.m863a(str4, stringBuilder.toString());
        if (this.f16803a != null) {
            kbg findImageFromView = this.f16807e.f16784f.findImageFromView(interleavedReadViewU8);
            jri.m13153b(findImageFromView.mo2084b());
            if (((InterleavedImageU8) findImageFromView.mo2081a()).width() != 0 && ((InterleavedImageU8) findImageFromView.mo2081a()).height() != 0) {
                if (this.f16804b && this.f16807e.f16787i.f16767e.mo2084b()) {
                    gii gii = (gii) this.f16807e.f16787i.f16767e.mo2081a();
                    findImageFromView.mo2081a();
                    gii.m2563a();
                }
                if (this.f16805c && this.f16806d) {
                    YuvWriteView yuvImage = new YuvImage(((InterleavedImageU8) findImageFromView.mo2081a()).width(), ((InterleavedImageU8) findImageFromView.mo2081a()).height(), 1);
                    YuvUtils.rgbToYuv((InterleavedReadViewU8) findImageFromView.mo2081a(), yuvImage);
                    this.f16803a.m2497a(j, hjl.m3207a(yuvImage), gdy.m2498c().m2503b(gcv.m10972a(str2)).m2502a(gcv.m10972a(str3)).m2501a(), str);
                    return;
                }
                this.f16803a.m2497a(j, new hjl(kbg.m4745c((InterleavedReadViewU8) findImageFromView.mo2081a()), kau.f19138a), gdy.m2498c().m2503b(gcv.m10972a(str2)).m2502a(gcv.m10972a(str3)).m2501a(), str);
            }
        }
    }

    public final void YuvReady(long j, YuvReadView yuvReadView, int i, String str, String str2, String str3) {
        String str4 = gcv.f16763a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
        stringBuilder.append("Gouda image (yuv): id = ");
        stringBuilder.append(j);
        stringBuilder.append(" description = ");
        stringBuilder.append(str);
        bli.m863a(str4, stringBuilder.toString());
        if (this.f16803a != null) {
            kbg findImageFromView = this.f16807e.f16785g.findImageFromView(yuvReadView);
            jri.m13153b(findImageFromView.mo2084b());
            this.f16803a.m2497a(j, hjl.m3207a((YuvReadView) findImageFromView.mo2081a()), gdy.m2498c().m2503b(gcv.m10972a(str2)).m2502a(gcv.m10972a(str3)).m2501a(), str);
        }
    }
}
