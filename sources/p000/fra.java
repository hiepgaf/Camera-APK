package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fra */
final class fra implements fuw {
    /* renamed from: a */
    public static final String f16419a = bli.m862a("YuvImgSaver");
    /* renamed from: b */
    public final gfa f16420b;
    /* renamed from: c */
    public final Rect f16421c;
    /* renamed from: d */
    public final Executor f16422d = Executors.newSingleThreadExecutor(iel.m3721c("BckndYuvEx", 0));
    /* renamed from: e */
    private final axm f16423e;
    /* renamed from: f */
    private final fsr f16424f;

    fra(axm axm, gfa gfa, fyy fyy, fsr fsr) {
        this.f16423e = axm;
        this.f16420b = gfa;
        this.f16424f = fsr;
        this.f16421c = fyy.f4834e;
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        iqm a = this.f16423e.m735a();
        gfn frd = new frd(fwa.f4753b, a, fwa.f4752a.f4447c);
        gkr gkr = fwa.f4753b;
        fsr fsr = this.f16424f;
        return new fqf(new frb(this, gkr, a, frd, new fsq(fsr.f4697a, fss.SW_JPEG)));
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return ilq.m3818a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return fuy.m2400a();
    }

    /* renamed from: b */
    public final fux mo406b(fwa fwa) {
        return mo404a(fwa);
    }
}
