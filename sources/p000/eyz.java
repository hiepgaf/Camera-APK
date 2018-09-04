package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eyz */
public final class eyz implements kwk {
    /* renamed from: a */
    private final kwk f15787a;
    /* renamed from: b */
    private final kwk f15788b;
    /* renamed from: c */
    private final kwk f15789c;
    /* renamed from: d */
    private final kwk f15790d;
    /* renamed from: e */
    private final kwk f15791e;

    private eyz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f15787a = kwk;
        this.f15788b = kwk2;
        this.f15789c = kwk3;
        this.f15790d = kwk4;
        this.f15791e = kwk5;
    }

    /* renamed from: a */
    public static eyz m10103a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new eyz(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15787a;
        return new eyy((exd) kwk.mo345a(), this.f15788b, (bmb) this.f15789c.mo345a(), (Executor) this.f15790d.mo345a(), (Context) this.f15791e.mo345a());
    }
}
