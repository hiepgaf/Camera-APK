package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bwx */
public final class bwx implements kwk {
    /* renamed from: a */
    private final kwk f11372a;
    /* renamed from: b */
    private final kwk f11373b;
    /* renamed from: c */
    private final kwk f11374c;
    /* renamed from: d */
    private final kwk f11375d;

    private bwx(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11372a = kwk;
        this.f11373b = kwk2;
        this.f11374c = kwk3;
        this.f11375d = kwk4;
    }

    /* renamed from: a */
    public static bwx m7824a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new bwx(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new bwv((cdk) this.f11372a.mo345a(), (Integer) this.f11373b.mo345a(), (Executor) this.f11374c.mo345a(), (Set) this.f11375d.mo345a());
    }
}
