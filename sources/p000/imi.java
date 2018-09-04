package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imi */
final class imi implements ilp {
    /* renamed from: a */
    private final /* synthetic */ Object f21742a;

    imi(Object obj) {
        this.f21742a = obj;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        executor.execute(new imj(iqt, this.f21742a));
        return imh.f7092a;
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return this.f21742a;
    }

    public final String toString() {
        kbd b = jqk.m13099b("Prop.of");
        b.m4743a().f8185b = this.f21742a;
        return b.toString();
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
    }
}
