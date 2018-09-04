package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: gud */
public final class gud implements kwk {
    /* renamed from: a */
    private final kwk f17348a;
    /* renamed from: b */
    private final kwk f17349b;
    /* renamed from: c */
    private final kwk f17350c;

    public gud(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17348a = kwk;
        this.f17349b = kwk2;
        this.f17350c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f17348a;
        kwk kwk2 = this.f17349b;
        kwk kwk3 = this.f17350c;
        kwk.mo345a();
        gtx gtx = new gtx((guf) kwk3.mo345a(), (ScheduledExecutorService) kwk2.mo345a());
        gtx.m2828b();
        return (gtx) ktm.m13963a(gtx, "Cannot return null from a non-@Nullable @Provides method");
    }
}
