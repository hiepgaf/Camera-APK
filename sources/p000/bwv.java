package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bwv */
public final class bwv extends fiw {
    /* renamed from: a */
    public final cdk f11368a;
    /* renamed from: b */
    public final int f11369b;
    /* renamed from: c */
    public final Set f11370c;
    /* renamed from: d */
    private final Executor f11371d;

    public bwv(cdk cdk, Integer num, Executor executor, Set set) {
        this.f11368a = cdk;
        this.f11369b = num.intValue();
        this.f11371d = executor;
        this.f11370c = set;
    }

    public final void a_(iwp iwp) {
        super.a_(iwp);
        this.f11371d.execute(new bww(this, iwp));
    }
}
