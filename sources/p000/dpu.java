package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: dpu */
public final class dpu {
    /* renamed from: a */
    private final gfa f3195a;
    /* renamed from: b */
    private final fre f3196b;

    public dpu(gfa gfa, fre fre) {
        jri.m13152b((Object) gfa);
        jri.m13152b((Object) fre);
        this.f3195a = gfa;
        this.f3196b = fre;
    }

    /* renamed from: a */
    public final kpk m1667a(fkp fkp, Rect rect, int i, get get, kaw kaw) {
        jri.m13152b((Object) fkp);
        gfw gfw = new gfw(fkp, iqm.m4037a(i), fkp.m17318h(), rect);
        Object d = kpw.m18056d();
        try {
            this.f3195a.mo1475a(new dpy(gfw, khx.m4940a(), this.f3195a, get, this.f3196b, d, kaw), true, kau.f19138a);
        } catch (Throwable e) {
            d.m17780a(e);
        } finally {
            gfw.f5149b.close();
        }
        return d;
    }
}
