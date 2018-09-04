package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imn */
public final class imn implements ilp {
    /* renamed from: a */
    public final iml f21745a = new iml(Integer.valueOf(0));
    /* renamed from: b */
    public final Object f21746b = new Object();
    /* renamed from: c */
    public int f21747c = 0;
    /* renamed from: d */
    private final ilp f21748d;
    /* renamed from: e */
    private final ilp f21749e = ilq.m3817a(ilq.m3822a(this.f21748d, this.f21745a), new imo());

    public imn(ilp ilp) {
        this.f21748d = ilp;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21749e.mo2859a(iqt, executor);
    }

    /* renamed from: a */
    public final iqo m16090a() {
        synchronized (this.f21746b) {
            this.f21747c++;
            this.f21745a.f21744b = Integer.valueOf(this.f21747c);
        }
        this.f21745a.f21743a.m16083a();
        return new imp(this);
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return this.f21749e.mo2860b();
    }
}
