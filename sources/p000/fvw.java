package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fvw */
public final class fvw implements iqt {
    /* renamed from: a */
    public final fbl f16568a;
    /* renamed from: b */
    public final int f16569b;
    /* renamed from: c */
    public final AtomicInteger f16570c = new AtomicInteger(0);
    /* renamed from: d */
    public final /* synthetic */ fvz f16571d;
    /* renamed from: e */
    private final ikd f16572e;

    public fvw(fvz fvz, fbl fbl, ikd ikd, int i) {
        this.f16571d = fvz;
        this.f16568a = fbl;
        this.f16572e = ikd;
        this.f16569b = i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        this.f16570c.incrementAndGet();
        this.f16572e.execute(new fvx(this));
    }
}
