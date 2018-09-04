package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilf */
public final class ilf implements ilp {
    /* renamed from: a */
    private final ilp f21735a;

    ilf(ilp ilp) {
        this.f21735a = ilp;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        iqo ikb = new ikb();
        ikb.mo1879a(this.f21735a.mo2859a(new ilg(iqt, executor, ikb), new imk()));
        return ikb;
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return ((ilp) this.f21735a.mo2860b()).mo2860b();
    }

    public final String toString() {
        kbd b = jqk.m13099b("DerefObs");
        b.m4743a().f8185b = this.f21735a;
        return b.toString();
    }
}
