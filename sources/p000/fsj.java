package p000;

import android.graphics.Rect;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fsj */
public final class fsj {
    /* renamed from: a */
    private final gfh f4681a;
    /* renamed from: b */
    private final fyy f4682b;

    fsj(gfa gfa, fyy fyy) {
        this.f4681a = gfa;
        this.f4682b = fyy;
    }

    /* renamed from: a */
    public final fsk m2368a(iwz iwz, iqm iqm) {
        Rect a;
        kpw d = kpw.m18056d();
        kpw d2 = kpw.m18056d();
        kpk a2 = kow.m13618a(new IllegalStateException("Thumbnail generation should not require metadata"));
        iwz fuz = new fuz(iwz);
        if (this.f4682b.f4832c.mo2084b()) {
            a = ipz.m4019b(((ive) this.f4682b.f4832c.mo2081a()).f7495b).m4023a(new iqp(iwz.mo2720g(), iwz.mo2717d()));
        } else {
            a = new Rect(0, 0, iwz.mo2720g(), iwz.mo2717d());
        }
        gfw gfw = new gfw(fuz, iqm, a2, a);
        get ggj = new ggj();
        Executor a3 = khx.m4940a();
        Set a4 = keu.m13474a(gfi.CLOSE_ON_ALL_TASKS_RELEASE, gfi.CREATE_EARLY_FILMSTRIP_PREVIEW, gfi.CONVERT_TO_RGB_PREVIEW);
        fsf fsf = new fsf();
        fsf.f4679c = new fse(d, iqm, d2);
        try {
            this.f4681a.mo1473a(gfw, a3, a4, ggj, fsf.f4680d);
            return new fsk(kbg.m4745c(d), kbg.m4745c(d2));
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }
}
