package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bzo */
public final class bzo {
    /* renamed from: a */
    private final iqz f1758a;
    /* renamed from: b */
    private final hju f1759b;

    public bzo(hju hju, iqz iqz) {
        this.f1759b = hju;
        this.f1758a = iqz.mo512a("JpegCompressSaving");
    }

    /* renamed from: a */
    final void m1081a(fwa fwa, ikb ikb, kbn kbn, byte[] bArr, iqp iqp, int i, ExifInterface exifInterface) {
        if (fwa.f4753b.mo2883k() == glw.RAW) {
            fqv fqv = (fqv) jri.m13152b((fqv) kbn.mo605b());
            String str = fqu.f16401a;
            String valueOf = String.valueOf(fqv.f21403b);
            int length = bArr.length;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 59);
            stringBuilder.append("Called addJpegImage with burstId ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" and file size ");
            stringBuilder.append(length);
            bli.m869c(str, stringBuilder.toString());
            foz a = foz.m2358a(fqv.f21402a.mo2884l() + 1, bArr, iqp, i, exifInterface, fqv.f21406e.f16402b, false);
            gkr gkr = fqv.f21402a;
            String n = gkr.mo2886n();
            long l = fqv.f21402a.mo2884l();
            UUID uuid = fqv.f21403b;
            bve bve = bve.NONE;
            long j = a.f4652a;
            iqm a2 = iqm.m4037a(a.f4654c);
            iqp iqp2 = a.f4656e;
            gkr.mo2868a(new bnm(n, 1, l, j, uuid, a2, iqp2.f7329a, iqp2.f7330b, a.f4653b, a.f4655d, gdy.m2498c().m2501a(), bve, false, "JPEG"));
            fqv.f21406e.f16403c.m4331a(1.0f, a.f4652a);
            synchronized (fqv) {
                fqv.f21404c = true;
                fqv.m15719a(ikb);
            }
            return;
        }
        fwa.f4755d.mo3053a(new fwc(bArr, iqp, i, exifInterface, this.f1759b));
        fwa.f4755d.close();
        ikb.close();
    }

    /* renamed from: a */
    public final void m1082a(fwa fwa, kbn kbn, ikb ikb, int i, int i2, byte[] bArr) {
        int i3 = fwa.f4752a.f4448d;
        try {
            Object exifInterface = new ExifInterface();
            exifInterface.m8485a(bArr);
            isx a = isx.m4159a((ExifInterface) exifInterface);
            if (i3 >= 0) {
                ite a2 = exifInterface.m8479a(ExifInterface.f12377K, (Object) "M");
                ite a3 = exifInterface.m8479a(ExifInterface.f12378L, new iqn((long) i3, 1));
                exifInterface.m8480a(a2);
                exifInterface.m8480a(a3);
            }
            byte[] bArr2 = fwa.f4752a.f4450f;
            if (bArr2.length > 0) {
                exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12391c, new String(bArr2)));
            }
            fwa.f4753b.mo1482h().mo1511a((long) bArr.length);
            m1081a(fwa, ikb, kbn, bArr, iqp.m4043a(i, i2), isx.m4158a(a).f7326e, (ExifInterface) jri.m13152b(exifInterface));
        } catch (Throwable e) {
            this.f1758a.mo517c("Could not read exif from gcam jpeg", e);
            throw new IllegalStateException("Could not read exif from gcam jpeg", e);
        }
    }
}
