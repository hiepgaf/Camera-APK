package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fqc */
public final class fqc implements fuw {
    /* renamed from: a */
    public final iqz f16366a;
    /* renamed from: b */
    public final ird f16367b;
    /* renamed from: c */
    public final gfa f16368c;
    /* renamed from: d */
    public final Executor f16369d = Executors.newCachedThreadPool(iel.m3722d("LuckyShotEx", 0));
    /* renamed from: e */
    public final Rect f16370e;
    /* renamed from: f */
    private final axm f16371f;
    /* renamed from: g */
    private final ggc f16372g;
    /* renamed from: h */
    private final fuw f16373h;

    fqc(ira ira, axm axm, gfa gfa, fyy fyy, ggc ggc, fuw fuw, ird ird) {
        this.f16366a = ira.mo511a("LSRprcssngIS");
        this.f16367b = ird;
        this.f16371f = axm;
        this.f16373h = fuw;
        this.f16368c = gfa;
        this.f16370e = fyy.f4834e;
        this.f16372g = ggc;
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        return new fqd(this, fwa, (fux) jri.m13152b(this.f16373h.mo404a(fwa)), this.f16371f, this.f16372g);
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return ilq.m3818a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return this.f16373h.mo407b();
    }

    /* renamed from: b */
    public final fux mo406b(fwa fwa) {
        return new fqd(this, fwa, (fux) jri.m13152b(this.f16373h.mo406b(fwa)), this.f16371f, this.f16372g);
    }
}
