package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilg */
final class ilg implements iqt {
    /* renamed from: a */
    private final iqt f18343a;
    /* renamed from: b */
    private final Executor f18344b;
    /* renamed from: c */
    private final ikb f18345c;
    /* renamed from: d */
    private ikb f18346d = this.f18345c.mo1880b();

    ilg(iqt iqt, Executor executor, ikb ikb) {
        this.f18343a = iqt;
        this.f18344b = executor;
        this.f18345c = ikb;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        ilp ilp = (ilp) obj;
        ikb ikb = this.f18346d;
        this.f18346d = this.f18345c.mo1880b();
        this.f18346d.mo1879a(ilp.mo2859a(this.f18343a, this.f18344b));
        ikb.close();
    }
}
