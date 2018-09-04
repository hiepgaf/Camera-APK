package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: fiq */
public final class fiq {
    /* renamed from: a */
    public final ira f4578a;
    /* renamed from: b */
    public final ird f4579b;
    /* renamed from: c */
    private final ivr f4580c;

    public fiq(ira ira, ird ird, ivr ivr) {
        this.f4578a = ira;
        this.f4579b = ird;
        this.f4580c = ivr;
    }

    /* renamed from: a */
    public final fip m2311a(iwg iwg, Handler handler) {
        return new fhe(iwg, this.f4580c, handler, this.f4579b);
    }
}
