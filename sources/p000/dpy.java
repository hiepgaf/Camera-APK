package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dpy */
final class dpy extends ggr {
    /* renamed from: a */
    private final kpw f14230a;
    /* renamed from: b */
    private final fre f14231b;
    /* renamed from: i */
    private final kaw f14232i;

    public dpy(gfw gfw, Executor executor, gfv gfv, get get, fre fre, kpw kpw, kaw kaw) {
        super(gfw, executor, gfv, go.aU, get);
        this.f14231b = fre;
        this.f14230a = kpw;
        this.f14232i = kaw;
    }

    public final void run() {
        kpk a = kny.m18045a(this.f14231b.mo1412a(this.g), this.f14232i, kpq.f8410a);
        a.mo1985a(new dpz(this), this.d);
        this.f14230a.mo3616b(a);
    }
}
