package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: gjx */
class gjx extends gqj {
    /* renamed from: a */
    public final /* synthetic */ gju f21480a;
    /* renamed from: b */
    private Animator f21481b;

    gjx(gju gju) {
        this.f21480a = gju;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        gju gju = this.f21480a;
        gju.f21471f.setSelfieFlashState(true);
        gju.f21476k.mo348a(Boolean.valueOf(true));
        gju.f21472g.m3185b();
        gju.f21474i.mo1651a(1796);
        gkd gkd = this.f21480a.f21473h;
        hic a = hic.m3163a(1000, new ks());
        a.m3165a(gkd.f5292l, "color", gkd.f5286f, gkd.f5285e);
        a.m3165a(gkd.f5294n, "backgroundColor", gkd.f5282b, gkd.f5281a);
        a.m3165a(gkd.f5291k, "color", gkd.f5284d, gkd.f5283c);
        a.f6218a = 500;
        a.m3165a(gkd.f5293m, "color", gkd.f5288h, gkd.f5287g);
        a.m3165a(gkd.f5295o, "navigationBarColor", gkd.f5289i, gkd.f5290j);
        this.f21481b = a.f6219b.clone();
        this.f21481b.addListener(new gjy(this));
        this.f21481b.start();
    }

    /* renamed from: b */
    public final void mo1563b() {
        if (this.f21481b.isRunning()) {
            this.f21481b.removeAllListeners();
            this.f21481b.cancel();
        }
        gju gju = this.f21480a;
        gju.f21471f.setSelfieFlashState(false);
        gju.f21472g.m3184a();
        gju.f21473h.m2583a();
        gju.f21476k.mo348a(Boolean.valueOf(false));
        gju.f21474i.mo1651a(1797);
    }

    public void z_() {
    }

    public void s_() {
    }

    /* renamed from: Q */
    public void mo3063Q() {
    }
}
