package p000;

import java.util.concurrent.Executor;

/* renamed from: gus */
public final /* synthetic */ class gus implements Runnable {
    /* renamed from: a */
    private final kbg f5705a;
    /* renamed from: b */
    private final kwk f5706b;
    /* renamed from: c */
    private final kbg f5707c;
    /* renamed from: d */
    private final kwk f5708d;

    public gus(kbg kbg, kwk kwk, kbg kbg2, kwk kwk2) {
        this.f5705a = kbg;
        this.f5706b = kwk;
        this.f5707c = kbg2;
        this.f5708d = kwk2;
    }

    public final void run() {
        kbg kbg = this.f5705a;
        kwk kwk = this.f5706b;
        kbg kbg2 = this.f5707c;
        kwk kwk2 = this.f5708d;
        gva gva = (gva) kbg.mo2081a();
        kwk.mo345a();
        kbg2.mo2081a();
        gva.m11566b();
        exi exi = (exi) kwk.mo345a();
        gva gva2 = (gva) kbg.mo2081a();
        gva2.getClass();
        exi.mo1315a(new guu(gva2), (Executor) kwk2.mo345a());
    }
}
