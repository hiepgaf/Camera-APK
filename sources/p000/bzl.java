package p000;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.FinalImageCallback;
import com.google.googlex.gcam.FloatSmoothKeyValueMap;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.imageio.JpgHelper;

/* compiled from: PG */
/* renamed from: bzl */
final class bzl extends FinalImageCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11541a;
    /* renamed from: b */
    private final /* synthetic */ bze f11542b;

    bzl(bze bze, bzx bzx) {
        this.f11542b = bze;
        this.f11541a = bzx;
    }

    public final void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, ExifMetadata exifMetadata, int i2) {
        boolean z;
        bli.m863a(bze.f1734a, String.format(null, "RGB image ready. shotId = %d, resolution = %d x %d", new Object[]{Integer.valueOf(i), Integer.valueOf(interleavedReadViewU8.width()), Integer.valueOf(interleavedReadViewU8.height())}));
        if (this.f11542b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (i2 == 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "RgbReady only supports GcamPixelFormat.kRgb.");
        jri.m13154b(this.f11541a.mo602h().mo2084b(), (Object) "Got RGB image and no callback present");
        jri.m13153b(this.f11542b.f1747n.getImage().mo2084b());
        InterleavedReadViewU8 interleavedReadViewU82 = (InterleavedWriteViewU8) this.f11542b.f1747n.getImage().mo2081a();
        this.f11542b.m1080a(new ExifMetadata(exifMetadata));
        cah cah = (cah) this.f11541a.mo602h().mo2081a();
        jri.m13154b(cah.f1796a.isDone(), (Object) "Base frame metadata not available in YUV callback");
        jri.m13153b(cah.f1797b.isDone());
        jri.m13153b(cah.f1798c.isDone());
        jri.m13153b(cah.f1799d.isDone());
        ExifMetadata exifMetadata2 = (ExifMetadata) kow.m13625c(cah.f1799d);
        long longValue = ((Long) kow.m13625c(cah.f1798c)).longValue();
        iwp iwp = (iwp) kow.m13625c(cah.f1796a);
        int intValue = ((Integer) kow.m13625c(cah.f1797b)).intValue();
        if (cah.f1800e.f1682c && cah.f1806k.f11687i.mo2084b() && !cah.f1806k.f11682d.mo2084b()) {
            cah.f1801f.f4753b.mo2886n();
            ((gii) cah.f1806k.f11687i.mo2081a()).m2564b();
            if (cah.f1800e.f1680a || cah.f1806k.f11680b.mo2084b()) {
                YuvReadView yuvImage = new YuvImage(interleavedReadViewU82.width(), interleavedReadViewU82.height(), 1);
                YuvUtils.rgbToYuv(interleavedReadViewU82, yuvImage);
                ccy.m8024a(cah.f1806k, cah.f1801f, cah.f1802g, cah.f1796a, new cak(yuvImage, longValue), exifMetadata2, cah.f1800e.f1680a, cah.f1803h);
            } else {
                kbg encodeToJpegAsByteArray = JpgHelper.encodeToJpegAsByteArray(interleavedReadViewU82, GcamModule.getKDefaultJpgQuality(), exifMetadata2);
                bzo bzo = cah.f1806k.f11679a;
                fwa fwa = cah.f1801f;
                bzo.m1082a(fwa, cah.f1802g, fwa.f4752a.f4451g, interleavedReadViewU82.width(), interleavedReadViewU82.height(), (byte[]) encodeToJpegAsByteArray.mo2081a());
            }
        }
        if (cah.f1806k.f11682d.mo2084b()) {
            FloatSmoothKeyValueMap post_zoom_sharpen_strength = cah.f1804i.f1760a.getRaw_finish_params().getPost_zoom_sharpen_strength();
            int width = interleavedReadViewU82.width();
            int height = interleavedReadViewU82.height();
            int i3 = cah.f1803h;
            fvj fvj = cah.f1804i.f1761b;
            ccy ccy = cah.f1806k;
            iqp iqp = ccy.f11685g.f4833d;
            bxc bxc = cah.f1800e;
            GoudaRequest a = bya.m1043a(post_zoom_sharpen_strength, width, height, exifMetadata2, i3, fvj, iqp, bxc.f1680a, bxc.f1682c, ccy.f11681c);
            bzr c = ((bzv) cah.f1806k.f11682d.mo2081a()).mo2721c(cah.f1801f);
            kbg kbg = cah.f1806k.f11681c;
            kpk kpk = cah.f1805j;
            int i4 = cah.f1803h;
            bxc bxc2 = cah.f1800e;
            c.mo3384a(interleavedReadViewU82, a, exifMetadata2, kbg, intValue, iwp, longValue, kpk, i4, bxc2.f1680a, bxc2.f1682c, cah.f1801f.f4752a.f4451g);
            c.close();
        }
    }

    public final void YuvReady(int i, YuvReadView yuvReadView, ExifMetadata exifMetadata, int i2) {
        boolean z;
        if (this.f11542b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        jri.m13153b(this.f11542b.f1748o.getImage().mo2084b());
        jri.m13154b(this.f11541a.mo604j().mo2084b(), (Object) "Received YUV frame but no listener present");
        YuvReadView yuvReadView2 = (YuvReadView) this.f11542b.f1748o.getImage().mo2081a();
        this.f11542b.m1080a(new ExifMetadata(exifMetadata));
        cai cai = (cai) this.f11541a.mo604j().mo2081a();
        jri.m13154b(cai.f1807a.isDone(), (Object) "YUV results received before EXIF metadata");
        jri.m13154b(cai.f1808b.isDone(), (Object) "Metadata not available; aborting");
        ExifMetadata exifMetadata2 = (ExifMetadata) kow.m13625c(cai.f1807a);
        ccy.m8024a(cai.f1814h, cai.f1810d, cai.f1811e, cai.f1808b, new cak(yuvReadView2, ((Long) kow.m13625c(cai.f1809c)).longValue()), exifMetadata2, cai.f1812f.f1680a, cai.f1813g);
    }
}
