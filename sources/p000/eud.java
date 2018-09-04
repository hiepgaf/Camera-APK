package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eud */
public final class eud implements kwk {
    /* renamed from: a */
    private final kwk f15550a;
    /* renamed from: b */
    private final kwk f15551b;
    /* renamed from: c */
    private final kwk f15552c;
    /* renamed from: d */
    private final kwk f15553d;

    private eud(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15550a = kwk;
        this.f15551b = kwk2;
        this.f15552c = kwk3;
        this.f15553d = kwk4;
    }

    /* renamed from: a */
    public static eud m9947a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new eud(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new eua((List) this.f15550a.mo345a(), (eue) this.f15551b.mo345a(), (eun) this.f15552c.mo345a(), (Executor) this.f15553d.mo345a());
    }
}
