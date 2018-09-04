package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imq */
public abstract class imq implements ilp {
    /* renamed from: a */
    public final ilp f21750a;
    /* renamed from: b */
    private final ilp f21751b;

    public imq(ilp ilp) {
        this.f21750a = ilp;
        this.f21751b = ilq.m3831b(new imr(this, ilp));
    }

    /* renamed from: b */
    public abstract Object mo3397b(Object obj);

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21751b.mo2859a(iqt, executor);
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return this.f21751b.mo2860b();
    }
}
