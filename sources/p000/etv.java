package p000;

import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: etv */
public final class etv implements kwk {
    /* renamed from: a */
    private final kwk f15536a;
    /* renamed from: b */
    private final kwk f15537b;
    /* renamed from: c */
    private final kwk f15538c;

    private etv(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15536a = kwk;
        this.f15537b = kwk2;
        this.f15538c = kwk3;
    }

    /* renamed from: a */
    public static etv m9934a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new etv(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new ets((MediaFormat) this.f15536a.mo345a(), (exb) this.f15537b.mo345a(), (Handler) this.f15538c.mo345a());
    }
}
