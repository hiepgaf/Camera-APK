package p000;

import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ckh */
final class ckh implements Runnable {
    /* renamed from: a */
    public final fkp f2098a;
    /* renamed from: b */
    public final kpw f2099b;
    /* renamed from: c */
    public final kpk f2100c;
    /* renamed from: d */
    public final wd f2101d;
    /* renamed from: e */
    private final fre f2102e;
    /* renamed from: f */
    private final Executor f2103f;
    /* renamed from: g */
    private final iqm f2104g;
    /* renamed from: h */
    private final Collection f2105h;

    public ckh(fkp fkp, fre fre, Executor executor, Collection collection, kpw kpw, kpk kpk, iqm iqm, wd wdVar) {
        jri.m13152b((Object) fkp);
        jri.m13152b((Object) fre);
        jri.m13152b((Object) collection);
        jri.m13152b((Object) kpw);
        jri.m13152b((Object) kpk);
        this.f2098a = fkp;
        this.f2102e = fre;
        this.f2103f = executor;
        this.f2105h = collection;
        this.f2099b = kpw;
        this.f2100c = kpk;
        this.f2104g = iqm;
        this.f2101d = wdVar;
    }

    public final void run() {
        try {
            frj a = fri.m10697a(this.f2098a).m2364a(this.f2105h);
            a.f4666a = this.f2104g;
            kow.m13622a(this.f2102e.mo1412a(a.m2363a()), new cki(this), this.f2103f);
        } catch (Throwable e) {
            this.f2099b.m17780a(e);
        } finally {
            this.f2098a.close();
        }
    }
}
