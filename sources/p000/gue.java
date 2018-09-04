package p000;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: gue */
public final class gue implements kwk {
    /* renamed from: a */
    private final kwk f17351a;
    /* renamed from: b */
    private final kwk f17352b;
    /* renamed from: c */
    private final kwk f17353c;
    /* renamed from: d */
    private final kwk f17354d;

    private gue(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17351a = kwk;
        this.f17352b = kwk2;
        this.f17353c = kwk3;
        this.f17354d = kwk4;
    }

    /* renamed from: a */
    public static gue m11545a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new gue(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f17351a;
        kwk kwk2 = this.f17352b;
        kwk kwk3 = this.f17353c;
        kwk kwk4 = this.f17354d;
        ExecutorService executorService = (ExecutorService) kwk.mo345a();
        gsx gsx = (gsx) kwk2.mo345a();
        kwk3.mo345a();
        return (guf) ktm.m13963a(new gug(gsx, executorService, (gub) kwk4.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
