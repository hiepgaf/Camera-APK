package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bei */
final class bei implements koj {
    /* renamed from: a */
    private final /* synthetic */ bea f10696a;

    bei(bea bea) {
        this.f10696a = bea;
    }

    /* renamed from: a */
    private final kpk m7288a(biw biw) {
        synchronized (this.f10696a.f19908w) {
            bea bea = this.f10696a;
            Surface d = biw.mo465d();
            bea bea2 = this.f10696a;
            bea.f19905t = new bhs(d, bea2.f19903r, bea2.f19883B);
        }
        jri.m13143a(biw.mo467f() ^ 1);
        kbg kbg = kau.f19138a;
        if (this.f10696a.f19899n.mo2084b()) {
            kbg = kbg.m4745c(((bjw) this.f10696a.f19899n.mo2081a()).mo2686a());
        }
        bea bea3 = this.f10696a;
        return bea3.f19889d.mo448a(bea3.f19902q, biw.mo465d(), kbg, kau.f19138a);
    }
}
