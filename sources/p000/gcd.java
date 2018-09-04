package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcd */
final class gcd implements gbw {
    /* renamed from: a */
    public final /* synthetic */ iqt f16737a;
    /* renamed from: b */
    private final /* synthetic */ Executor f16738b;

    gcd(Executor executor, iqt iqt) {
        this.f16738b = executor;
        this.f16737a = iqt;
    }

    /* renamed from: a */
    public final void mo1160a(iqm iqm) {
        this.f16738b.execute(new gce(this, iqm));
    }
}
