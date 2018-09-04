package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: gjv */
class gjv extends gqj {
    /* renamed from: a */
    public final /* synthetic */ gju f21478a;
    /* renamed from: b */
    private Animator f21479b;

    gjv(gju gju) {
        this.f21478a = gju;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        gkd gkd = this.f21478a.f21473h;
        hic a = hic.m3163a(333, new ks());
        a.m3165a(gkd.f5292l, "color", gkd.f5285e, gkd.f5286f);
        a.m3165a(gkd.f5294n, "backgroundColor", gkd.f5281a, gkd.f5282b);
        a.m3165a(gkd.f5291k, "color", gkd.f5283c, gkd.f5284d);
        a.m3165a(gkd.f5293m, "color", gkd.f5287g, gkd.f5288h);
        a.m3165a(gkd.f5295o, "navigationBarColor", gkd.f5290j, gkd.f5289i);
        this.f21479b = a.f6219b.clone();
        this.f21479b.addListener(new gjw(this));
        this.f21479b.start();
    }

    /* renamed from: b */
    public final void mo1563b() {
        if (this.f21479b.isRunning()) {
            this.f21479b.removeAllListeners();
            this.f21479b.cancel();
        }
    }

    public void z_() {
    }

    /* renamed from: R */
    public void mo3061R() {
    }
}
