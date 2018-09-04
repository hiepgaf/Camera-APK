package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: ffo */
public final class ffo implements kwk {
    /* renamed from: a */
    private final kwk f15959a;
    /* renamed from: b */
    private final kwk f15960b;

    private ffo(kwk kwk, kwk kwk2) {
        this.f15959a = kwk;
        this.f15960b = kwk2;
    }

    /* renamed from: a */
    public static ffo m10299a(kwk kwk, kwk kwk2) {
        return new ffo(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15959a;
        ikb ikb = (ikb) kwk.mo345a();
        ikb ikb2 = (ikb) this.f15960b.mo345a();
        ScheduledExecutorService e = iel.m3723e("SchCameraEx", 1);
        e.getClass();
        ikb.mo1879a(new ffk(e));
        e.getClass();
        ikb2.mo1879a(new ffl(e));
        return (ScheduledExecutorService) ktm.m13963a(e, "Cannot return null from a non-@Nullable @Provides method");
    }
}
