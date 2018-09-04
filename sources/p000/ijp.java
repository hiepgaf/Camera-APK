package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijp */
public final class ijp implements iqt {
    /* renamed from: a */
    public final iqt f18313a;
    /* renamed from: b */
    private final Executor f18314b;

    public ijp(iqt iqt, Executor executor) {
        this.f18313a = iqt;
        this.f18314b = executor;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        this.f18314b.execute(new ijq(this, obj));
    }
}
