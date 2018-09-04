package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: gfk */
class gfk implements gfj {
    /* renamed from: a */
    public final AtomicInteger f21442a = new AtomicInteger(0);
    /* renamed from: b */
    public final Object f21443b = new Object();
    /* renamed from: c */
    private final Set f21444c = new HashSet();
    /* renamed from: d */
    private final ggw f21445d;
    /* renamed from: e */
    private final gfh f21446e;
    /* renamed from: f */
    private final kpw f21447f = kpw.m18056d();
    /* renamed from: g */
    private final boolean f21448g;
    /* renamed from: h */
    private int f21449h = go.aM;

    public gfk(gfh gfh, ggw ggw, boolean z) {
        this.f21446e = gfh;
        this.f21445d = ggw;
        this.f21448g = true;
        this.f21449h = go.aM;
    }

    public synchronized void close() {
        boolean z = true;
        synchronized (this) {
            synchronized (this.f21443b) {
                if (!(this.f21449h == go.aN || this.f21449h == go.aO)) {
                    z = false;
                }
                jri.m13153b(z);
                if (this.f21449h == go.aO) {
                } else {
                    this.f21449h = go.aO;
                    if (this.f21442a.decrementAndGet() == 0) {
                        m15735b();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    final void m15735b() {
        boolean z;
        if (this.f21449h == go.aO) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (this.f21444c.size() > 0) {
            Set a = this.f21446e.mo1471a();
            Object hashSet = new HashSet();
            for (gfw gfw : this.f21444c) {
                iwz iwz = gfw.f5149b;
                if (iwz != null && a.contains(iwz)) {
                    this.f21446e.mo1476a(gfw.f5149b);
                    hashSet.add(gfw);
                }
            }
            this.f21447f.mo3557a(hashSet);
            return;
        }
        this.f21447f.mo3557a(new HashSet());
    }

    /* renamed from: a */
    public kpk mo3056a() {
        kpk kpk;
        boolean z = true;
        synchronized (this.f21443b) {
            if (this.f21449h != go.aM) {
                z = false;
            }
            jri.m13153b(z);
            this.f21442a.set(1);
            this.f21449h = go.aN;
            kpk = this.f21447f;
        }
        return kpk;
    }

    /* renamed from: a */
    public synchronized void mo3057a(gfw gfw, get get) {
        boolean z = true;
        synchronized (this) {
            synchronized (this.f21443b) {
                boolean z2;
                if (this.f21449h == go.aN) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jri.m13153b(z2);
                if (this.f21442a.get() <= 0) {
                    z = false;
                }
                jri.m13153b(z);
                this.f21442a.incrementAndGet();
                this.f21444c.add(gfw);
                gfl gfl = new gfl(this);
                try {
                    gfh gfh = this.f21446e;
                    ggw ggw = this.f21445d;
                    gfh.mo1475a(new gha(gfw, ggw.f5178b, ggw.f5177a, ggw.f5179c, get, ggw.f5180d, ggw.f5181e, ggw.f5182f, ggw.f5183g), this.f21448g, kbg.m4745c(gfl));
                } catch (Throwable e) {
                    kqg.f8420a.mo2210b(e);
                    throw new IllegalStateException("Interrupt should NOT happen, because call is non-blocking");
                }
            }
        }
    }
}
