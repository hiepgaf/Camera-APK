package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ciz */
public final class ciz implements kwk {
    /* renamed from: a */
    private final kwk f12051a;
    /* renamed from: b */
    private final kwk f12052b;

    private ciz(kwk kwk, kwk kwk2) {
        this.f12051a = kwk;
        this.f12052b = kwk2;
    }

    /* renamed from: a */
    public static ciz m8236a(kwk kwk, kwk kwk2) {
        return new ciz(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12051a;
        gsl gsl = (gsl) this.f12052b.mo345a();
        return (gin) ktm.m13963a(new gin(gsl, gnv.m11222a((Context) kwk.mo345a(), gsl)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
