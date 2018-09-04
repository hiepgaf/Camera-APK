package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fvz */
public final class fvz {
    /* renamed from: a */
    public final fbk f4745a;
    /* renamed from: b */
    public final ikd f4746b;
    /* renamed from: c */
    public final AtomicBoolean f4747c = new AtomicBoolean(false);
    /* renamed from: d */
    public final AtomicBoolean f4748d = new AtomicBoolean(true);
    /* renamed from: e */
    public final gkr f4749e;

    public fvz(fbk fbk, ikd ikd, gkr gkr) {
        this.f4745a = fbk;
        this.f4746b = ikd;
        this.f4749e = gkr;
    }

    /* renamed from: a */
    public final void m2405a() {
        this.f4746b.execute(new fvv(this));
    }

    /* renamed from: b */
    public final iqt m2406b() {
        jri.m13153b(this.f4747c.getAndSet(true) ^ 1);
        return new fvs(this);
    }
}
