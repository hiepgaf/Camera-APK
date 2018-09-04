package p000;

import android.media.MediaFormat;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eum */
public final class eum implements kwk {
    /* renamed from: a */
    private final kwk f15571a;
    /* renamed from: b */
    private final kwk f15572b;
    /* renamed from: c */
    private final kwk f15573c;
    /* renamed from: d */
    private final kwk f15574d;

    private eum(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15571a = kwk;
        this.f15572b = kwk2;
        this.f15573c = kwk3;
        this.f15574d = kwk4;
    }

    /* renamed from: a */
    public static eum m9957a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new eum(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new euj((MediaFormat) this.f15571a.mo345a(), (evo) this.f15572b.mo345a(), (kpk) this.f15573c.mo345a(), (Executor) this.f15574d.mo345a());
    }
}
