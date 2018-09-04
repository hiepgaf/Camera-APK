package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bew */
final class bew implements koj {
    /* renamed from: a */
    private final /* synthetic */ bem f10714a;

    bew(bem bem) {
        this.f10714a = bem;
    }

    /* renamed from: a */
    private final kpk m7301a(ios ios) {
        kbg c;
        synchronized (this.f10714a.f19931s) {
            bem bem = this.f10714a;
            Surface surface = (Surface) ios.m12335a().mo2081a();
            bem bem2 = this.f10714a;
            bem.f19928p = new bhs(surface, bem2.f19926n, bem2.f19936x);
        }
        kbg kbg = kau.f19138a;
        if (this.f10714a.f19922j.mo2084b()) {
            c = kbg.m4745c(((bjw) this.f10714a.f19922j.mo2081a()).mo2686a());
        } else {
            c = kbg;
        }
        bem bem3 = this.f10714a;
        return bem3.f19916d.mo448a(bem3.f19925m, (Surface) ios.m12335a().mo2081a(), c, kau.f19138a);
    }
}
