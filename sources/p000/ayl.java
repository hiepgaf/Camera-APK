package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ayl */
public final class ayl implements kwk {
    /* renamed from: a */
    private final kwk f10535a;
    /* renamed from: b */
    private final kwk f10536b;
    /* renamed from: c */
    private final kwk f10537c;

    public ayl(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10535a = kwk;
        this.f10536b = kwk2;
        this.f10537c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f10535a;
        kwk kwk2 = this.f10536b;
        kwk kwk3 = this.f10537c;
        kwk2.mo345a();
        ivw ivw = (ivw) kwk3.mo345a();
        Set set = (Set) kwk.mo345a();
        if (set.size() > 0) {
            ayc ayc = new ayc(set, ivw.mo414b());
            for (ayo ayo : ayc.f10521a) {
                ayc.f10522b.mo1879a(ilq.m3824a(ayo.mo2647b().f1031b, new ayd(ayc), kpq.f8410a));
                ayc.f10522b.mo1879a(ilq.m3824a(ayo.mo2647b().f1030a, new aye(ayc), kpq.f8410a));
            }
            obj = ayc;
        } else {
            obj = new ayg();
        }
        return (ayb) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
