package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: frb */
final class frb implements frg {
    /* renamed from: a */
    private final gkr f16425a;
    /* renamed from: b */
    private final iqm f16426b;
    /* renamed from: c */
    private final gfn f16427c;
    /* renamed from: d */
    private final fsq f16428d;
    /* renamed from: e */
    private final /* synthetic */ fra f16429e;

    public frb(fra fra, gkr gkr, iqm iqm, gfn gfn, fsq fsq) {
        this.f16429e = fra;
        this.f16425a = gkr;
        this.f16426b = iqm;
        this.f16427c = gfn;
        this.f16428d = fsq;
    }

    /* renamed from: a */
    public final void mo1414a(kbg kbg, kbg kbg2, kpk kpk) {
        try {
            if (kbg2.mo2084b()) {
                ((iwz) kbg2.mo2081a()).close();
            }
            Set hashSet = new HashSet();
            hashSet.add(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW);
            hashSet.add(gfi.CONVERT_TO_RGB_PREVIEW);
            hashSet.add(gfi.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
            hashSet.add(gfi.CLOSE_ON_ALL_TASKS_RELEASE);
            if (kbg.mo2084b()) {
                this.f16428d.f4694b.add(kpk);
                this.f16429e.f16420b.mo1473a(new gfw((iwz) kbg.mo2081a(), this.f16426b, kpk, this.f16429e.f16421c, this.f16425a.mo2884l(), null, null), this.f16429e.f16422d, hashSet, this.f16425a, kbg.m4745c(this.f16427c));
            } else {
                bli.m866b(fra.f16419a, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
                this.f16425a.mo1481a(hci.m11747a(), true, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
            }
            this.f16428d.close();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            this.f16428d.close();
        }
    }
}
