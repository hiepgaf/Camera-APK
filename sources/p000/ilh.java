package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilh */
final class ilh implements ilp {
    /* renamed from: a */
    private final ilp f21736a;

    ilh(ilp ilp) {
        this.f21736a = ilp;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21736a.mo2859a(new ili(executor, iqt), new imk());
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return this.f21736a.mo2860b();
    }

    public final String toString() {
        kbd b = jqk.m13099b("filtered");
        b.m4743a().f8185b = this.f21736a;
        return b.toString();
    }
}
