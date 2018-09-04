package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imc */
final class imc implements ilp {
    /* renamed from: a */
    private final /* synthetic */ Object f21738a;

    imc(Object obj) {
        this.f21738a = obj;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        executor.execute(new imd(iqt, this.f21738a));
        return ilq.f7087a;
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return this.f21738a;
    }

    public final String toString() {
        kbd b = jqk.m13099b("Obs.of");
        b.m4743a().f8185b = this.f21738a;
        return b.toString();
    }
}
