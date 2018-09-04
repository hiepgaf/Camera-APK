package p000;

import android.annotation.TargetApi;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: cke */
public final class cke implements ckj {
    /* renamed from: a */
    public final Set f20312a;
    /* renamed from: b */
    public final ExecutorService f20313b = cht.m1132c();
    /* renamed from: c */
    public volatile boolean f20314c = false;
    /* renamed from: d */
    private final fre f20315d;
    /* renamed from: e */
    private final kpk f20316e;
    /* renamed from: f */
    private final iqm f20317f;
    /* renamed from: g */
    private final bcz f20318g = new bcz();
    /* renamed from: h */
    private final Collection f20319h;

    public cke(fre fre, Collection collection, kpk kpk, iqm iqm) {
        jri.m13152b((Object) fre);
        jri.m13152b((Object) collection);
        jri.m13152b((Object) kpk);
        jri.m13152b((Object) iqm);
        this.f20315d = fre;
        this.f20319h = collection;
        this.f20316e = kpk;
        this.f20317f = iqm;
        this.f20312a = new HashSet(((Integer) fre.mo1413b().mo2860b()).intValue());
    }

    public final void close() {
        synchronized (this.f20312a) {
            this.f20314c = true;
            if (this.f20312a.isEmpty()) {
                this.f20313b.shutdown();
            }
        }
    }

    /* renamed from: a */
    public final kpk mo2776a(ckk ckk) {
        kpk d;
        jri.m13152b((Object) ckk);
        jri.m13152b(ckk.m1166a());
        fyr a = this.f20318g.m16884a();
        synchronized (this.f20312a) {
            if (this.f20312a.contains(ckk)) {
                d = kpw.m18056d();
                d.mo1985a(new ckf(this, ckk), this.f20313b);
                Object a2 = ckk.m1166a();
                fkp fkp = new fkp(new ckg(a2, a), a2.m17318h());
                fre fre = this.f20315d;
                Executor executor = this.f20313b;
                Collection collection = this.f20319h;
                kpk kpk = this.f20316e;
                iqm iqm = this.f20317f;
                wd wdVar = (wd) ckk.f2107b.get();
                if (wdVar == null) {
                    wdVar = we.m6118a();
                }
                this.f20313b.execute(new ckh(fkp, fre, executor, collection, d, kpk, iqm, wdVar));
            } else {
                throw new IllegalArgumentException("Invalid frame saving task.");
            }
        }
        return d;
    }

    /* renamed from: b */
    public final void mo2777b(ckk ckk) {
        iwz a = ckk.m1166a();
        if (a != null) {
            a.close();
        }
        synchronized (this.f20312a) {
            if (this.f20312a.remove(ckk)) {
            } else {
                throw new IllegalArgumentException("Invalid frame saving task.");
            }
        }
    }

    /* renamed from: a */
    public final kbg mo2775a() {
        kbg c;
        synchronized (this.f20312a) {
            if (((Integer) this.f20318g.f21734c).intValue() <= ((Integer) this.f20315d.mo1413b().mo2860b()).intValue()) {
                ckk ckk = new ckk();
                this.f20312a.add(ckk);
                c = kbg.m4745c(ckk);
            } else {
                c = kau.f19138a;
            }
        }
        return c;
    }
}
