package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcc */
public final class gcc implements ilp {
    /* renamed from: a */
    public final gbv f21440a;
    /* renamed from: b */
    private final ikd f21441b = new ikd();

    public gcc(gbv gbv) {
        this.f21440a = gbv;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        gbw gcd = new gcd(executor, iqt);
        this.f21440a.m2467a(gcd);
        this.f21441b.execute(new gcf(this, executor, iqt));
        return new gch(this, gcd);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        return this.f21440a.f5045e;
    }
}
