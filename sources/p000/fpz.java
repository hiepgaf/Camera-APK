package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fpz */
final class fpz implements frg {
    /* renamed from: a */
    private final gkr f16356a;
    /* renamed from: b */
    private final iqm f16357b;
    /* renamed from: c */
    private final gfa f16358c;
    /* renamed from: d */
    private final gfn f16359d;
    /* renamed from: e */
    private final /* synthetic */ fpy f16360e;

    public fpz(fpy fpy, gkr gkr, iqm iqm, gfa gfa, gfn gfn) {
        this.f16360e = fpy;
        this.f16356a = gkr;
        this.f16357b = iqm;
        this.f16358c = gfa;
        this.f16359d = gfn;
    }

    /* renamed from: a */
    public final void mo1414a(kbg kbg, kbg kbg2, kpk kpk) {
        if (kbg2.mo2084b()) {
            ((iwz) kbg2.mo2081a()).close();
        }
        if (kbg.mo2084b()) {
            Set hashSet = new HashSet();
            hashSet.add(gfi.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
            hashSet.add(gfi.CLOSE_ON_ALL_TASKS_RELEASE);
            try {
                this.f16358c.mo1473a(new gfw((iwz) kbg.mo2081a(), this.f16357b, kpk, this.f16360e.f16353c), this.f16360e.f16352b, hashSet, this.f16356a, kbg.m4745c(this.f16359d));
                return;
            } catch (Throwable e) {
                bli.m867b(fpy.f16351a, "ImageBackend failed to receive an image! Aborting session.", e);
                this.f16356a.mo1481a(hci.m11747a(), true, e.getMessage());
                return;
            }
        }
        bli.m866b(fpy.f16351a, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
        this.f16356a.mo1481a(hci.m11747a(), true, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
    }
}
