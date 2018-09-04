package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: fru */
public final class fru implements kwk {
    /* renamed from: a */
    private final kwk f16471a;
    /* renamed from: b */
    private final kwk f16472b;
    /* renamed from: c */
    private final kwk f16473c;
    /* renamed from: d */
    private final kwk f16474d;
    /* renamed from: e */
    private final kwk f16475e;
    /* renamed from: f */
    private final kwk f16476f;
    /* renamed from: g */
    private final kwk f16477g;
    /* renamed from: h */
    private final kwk f16478h;
    /* renamed from: i */
    private final kwk f16479i;
    /* renamed from: j */
    private final kwk f16480j;

    private fru(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        this.f16471a = kwk;
        this.f16472b = kwk2;
        this.f16473c = kwk3;
        this.f16474d = kwk4;
        this.f16475e = kwk5;
        this.f16476f = kwk6;
        this.f16477g = kwk7;
        this.f16478h = kwk8;
        this.f16479i = kwk9;
        this.f16480j = kwk10;
    }

    /* renamed from: a */
    public static fru m10715a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        return new fru(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8, kwk9, kwk10);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16471a;
        kwk kwk2 = this.f16472b;
        kwk kwk3 = this.f16473c;
        kwk kwk4 = this.f16474d;
        kwk kwk5 = this.f16475e;
        kwk kwk6 = this.f16476f;
        kwk kwk7 = this.f16477g;
        kwk kwk8 = this.f16478h;
        kwk kwk9 = this.f16479i;
        kwk kwk10 = this.f16480j;
        ikb ikb = (ikb) kwk.mo345a();
        kwk2.mo345a();
        fij fij = (fij) kwk3.mo345a();
        fne fne = (fne) kwk4.mo345a();
        Executor executor = (Executor) kwk6.mo345a();
        Executor executor2 = (Executor) kwk7.mo345a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) kwk8.mo345a();
        iqz iqz = (iqz) kwk9.mo345a();
        ird ird = (ird) kwk10.mo345a();
        fjk a = ((fjm) kwk5.mo345a()).mo1397a(new fjm[0]);
        fjl a2 = a.mo1398a();
        int min = Math.min(fne.mo1410b(), a.mo1401c());
        int min2 = Math.min(min, 1);
        iqo frk = new frk(fij, fne, a2, min2, min, Math.max(10, min2 * 3), executor2, executor, scheduledExecutorService, iqz, ird);
        ikb.mo1879a(frk);
        return (frk) ktm.m13963a(frk, "Cannot return null from a non-@Nullable @Provides method");
    }
}
