package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ayn */
public final class ayn implements kwk {
    /* renamed from: a */
    private final kwk f10540a;
    /* renamed from: b */
    private final kwk f10541b;
    /* renamed from: c */
    private final kwk f10542c;
    /* renamed from: d */
    private final kwk f10543d;

    private ayn(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f10540a = kwk;
        this.f10541b = kwk2;
        this.f10542c = kwk3;
        this.f10543d = kwk4;
    }

    /* renamed from: a */
    public static ayn m7181a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new ayn(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f10540a;
        kwk kwk2 = this.f10541b;
        kwk kwk3 = this.f10542c;
        kwk kwk4 = this.f10543d;
        Object obj = (ayt) kwk.mo345a();
        Object obj2 = (azf) kwk2.mo345a();
        kwk3.mo345a();
        if (((Boolean) ((ilp) kwk4.mo345a()).mo2860b()).booleanValue()) {
            obj = keu.m13472a(fds.m10239a(keu.m13473a(obj, obj2)));
        } else {
            obj = kgn.f22045a;
        }
        return (Set) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
