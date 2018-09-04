package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cmd */
public final class cmd implements kwk {
    /* renamed from: a */
    private final kwk f12181a;
    /* renamed from: b */
    private final kwk f12182b;
    /* renamed from: c */
    private final kwk f12183c;
    /* renamed from: d */
    private final kwk f12184d;
    /* renamed from: e */
    private final kwk f12185e;

    public cmd(cmc cmc, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f12181a = kwk;
        this.f12182b = kwk2;
        this.f12183c = kwk3;
        this.f12184d = kwk4;
        this.f12185e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12181a;
        kwk kwk2 = this.f12182b;
        kwk kwk3 = this.f12183c;
        kwk kwk4 = this.f12184d;
        kwk kwk5 = this.f12185e;
        csh csh = (csh) kwk.mo345a();
        boolean booleanValue = ((Boolean) kwk2.mo345a()).booleanValue();
        Context context = (Context) kwk3.mo345a();
        hfz hfz = (hfz) kwk4.mo345a();
        irs irs = (irs) kwk5.mo345a();
        acm b = acc.m100b(context);
        csj cls = new cls();
        ikd.m12259a();
        cls.f12171o = csh;
        cls.f12170n = booleanValue;
        cls.f12172p = b;
        cls.f12173q = irs;
        cls.f12168l = true;
        hfz.mo1006a(cls);
        return (cls) ktm.m13963a(cls, "Cannot return null from a non-@Nullable @Provides method");
    }
}
