package p000;

import com.google.googlex.gcam.GoudaImageCallback;
import com.google.googlex.gcam.InterleavedReadViewU8;

/* compiled from: PG */
/* renamed from: gdd */
final class gdd extends GoudaImageCallback {
    /* renamed from: a */
    private final /* synthetic */ gdv f16808a;
    /* renamed from: b */
    private final /* synthetic */ gcy f16809b;

    gdd(gcy gcy, gdv gdv) {
        this.f16809b = gcy;
        this.f16808a = gdv;
    }

    public final void RgbReady(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3) {
        String str4 = gcv.f16763a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 69);
        stringBuilder.append("Gouda secondary image (rgb): id = ");
        stringBuilder.append(j);
        stringBuilder.append(" description = ");
        stringBuilder.append(str);
        bli.m863a(str4, stringBuilder.toString());
        if (this.f16808a != null) {
            kbg findImageFromView = this.f16809b.f16784f.findImageFromView(interleavedReadViewU8);
            gdv gdv = this.f16808a;
            InterleavedReadViewU8 interleavedReadViewU82 = (InterleavedReadViewU8) findImageFromView.mo2081a();
            gdy a = gdy.m2498c().m2503b(gcv.m10972a(str2)).m2502a(gcv.m10972a(str3)).m2501a();
            hjo a2 = gdv.f5100b.f22625a.m3209a();
            cau cau = gdv.f5100b;
            cau.m16914a(j, interleavedReadViewU82, a, cau.f22648x = cau.f22648x + 1, cat.SECONDARY, str, a2);
        }
    }
}
