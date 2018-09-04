package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: glj */
public final class glj {
    /* renamed from: a */
    private final kwk f5369a;
    /* renamed from: b */
    private final kwk f5370b;
    /* renamed from: c */
    private final kwk f5371c;
    /* renamed from: d */
    private final kwk f5372d;
    /* renamed from: e */
    private final kwk f5373e;
    /* renamed from: f */
    private final kwk f5374f;
    /* renamed from: g */
    private final kwk f5375g;
    /* renamed from: h */
    private final kwk f5376h;
    /* renamed from: i */
    private final kwk f5377i;

    public glj(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9) {
        this.f5369a = (kwk) glj.m2589a(kwk, 1);
        this.f5370b = (kwk) glj.m2589a(kwk2, 2);
        this.f5371c = (kwk) glj.m2589a(kwk3, 3);
        this.f5372d = (kwk) glj.m2589a(kwk4, 4);
        this.f5373e = (kwk) glj.m2589a(kwk5, 5);
        this.f5374f = (kwk) glj.m2589a(kwk6, 6);
        this.f5375g = (kwk) glj.m2589a(kwk7, 7);
        this.f5376h = (kwk) glj.m2589a(kwk8, 8);
        this.f5377i = (kwk) glj.m2589a(kwk9, 9);
    }

    /* renamed from: a */
    private static Object m2589a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final glf m2590a(String str, long j, kbg kbg) {
        return new glf((gnh) glj.m2589a((gnh) this.f5369a.mo345a(), 1), (gmp) glj.m2589a((gmp) this.f5370b.mo345a(), 2), (Executor) glj.m2589a((Executor) this.f5371c.mo345a(), 3), (gsp) glj.m2589a((gsp) this.f5372d.mo345a(), 4), (gsl) glj.m2589a((gsl) this.f5373e.mo345a(), 5), (hju) glj.m2589a((hju) this.f5374f.mo345a(), 6), (grg) glj.m2589a((grg) this.f5375g.mo345a(), 7), (gny) glj.m2589a((gny) this.f5376h.mo345a(), 8), (gnu) glj.m2589a((gnu) this.f5377i.mo345a(), 9), (String) glj.m2589a(str, 10), j, (kbg) glj.m2589a(kbg, 12));
    }
}
