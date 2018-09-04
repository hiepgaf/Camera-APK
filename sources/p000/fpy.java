package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fpy */
final class fpy implements fuw {
    /* renamed from: a */
    public static final String f16351a = bli.m862a("JpegImgBESaver");
    /* renamed from: b */
    public final Executor f16352b = Executors.newSingleThreadExecutor(iel.m3721c("BckndJpegEx", 0));
    /* renamed from: c */
    public final Rect f16353c;
    /* renamed from: d */
    private final axm f16354d;
    /* renamed from: e */
    private final gfa f16355e;

    fpy(axm axm, gfa gfa, fyy fyy) {
        this.f16354d = axm;
        this.f16355e = gfa;
        this.f16353c = fyy.f4834e;
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        return new fqf(new fpz(this, fwa.f4753b, this.f16354d.m735a(), this.f16355e, new fqa(fwa.f4753b, fwa.f4752a.f4447c)));
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return ilq.m3818a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return new fuy(go.ax);
    }

    /* renamed from: b */
    public final fux mo406b(fwa fwa) {
        return mo404a(fwa);
    }
}
